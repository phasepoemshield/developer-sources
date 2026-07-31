import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.nio.file.*;
import java.util.*;

/**
 * Restores BlockOverlay to a working state:
 * 1) BlockOverlayRenderer clinit had initialized=true + stale lastInitAttemptTime,
 *    which blocked / raced shader loading — reset like NebulaShaderRenderer.
 * 2) renderBoxList ModelView/Proj/alpha/baseColor uniforms matched poorly —
 *    align with NebulaShaderRenderer (RS MV * stack, RS projection, real color/alpha).
 * 3) drawLines + line width/alpha stayed visible in shader mode — filter by isNormalMode
 *    (and drawLines for width/alpha), matching drawFill / fillAlpha.
 */
public final class PatchBlockOverlayRestore {
    static final String MODULE = "ru/destra/module/BlockOverlayModule";
    static final String RENDERER = "ru/destra/render/BlockOverlayRenderer";

    public static void main(String[] args) throws Exception {
        patchRendererClinit();
        patchRendererUniforms();
        patchModuleFiltering();
    }

    static void patchRendererClinit() throws Exception {
        Path p = Path.of(".precompiled/" + RENDERER + ".class");
        ClassNode cn = new ClassNode();
        new ClassReader(Files.readAllBytes(p)).accept(cn, 0);

        MethodNode clinit = null;
        for (MethodNode m : cn.methods) {
            if ("<clinit>".equals(m.name)) { clinit = m; break; }
        }
        if (clinit == null) {
            System.out.println("BlockOverlayRenderer: no clinit");
            return;
        }

        int fixes = 0;
        AbstractInsnNode[] insns = clinit.instructions.toArray();
        for (int i = 0; i < insns.length - 1; i++) {
            AbstractInsnNode a = insns[i];
            AbstractInsnNode b = insns[i + 1];
            if (!(b instanceof FieldInsnNode fin) || fin.getOpcode() != Opcodes.PUTSTATIC) continue;
            if (!RENDERER.equals(fin.owner)) continue;

            if ("initialized".equals(fin.name) && "Z".equals(fin.desc)) {
                if (a.getOpcode() == Opcodes.ICONST_1) {
                    clinit.instructions.set(a, new InsnNode(Opcodes.ICONST_0));
                    fixes++;
                    System.out.println("  initialized = false");
                }
            }
            if ("lastInitAttemptTime".equals(fin.name) && "J".equals(fin.desc)) {
                if (a instanceof LdcInsnNode ldc && ldc.cst instanceof Long && ((Long) ldc.cst) != 0L) {
                    clinit.instructions.set(a, new LdcInsnNode(0L));
                    fixes++;
                    System.out.println("  lastInitAttemptTime = 0L");
                }
            }
        }

        write(cn, p);
        System.out.println("BlockOverlayRenderer clinit fixes=" + fixes);
    }

    /**
     * Replace ModelViewMat/ProjMat/baseColor/alpha setup in renderBoxList with Nebula-style setup.
     * After shader.bind(), the original sequence sets:
     *   ModelViewMat = event.matrixStack.peek().getPositionMatrix()
     *   ProjMat      = event.projectionMatrix
     *   time / screenSize (keep)
     *   baseColor    = (1,1,1,1)
     *   alpha        = 1
     * We rewrite ModelViewMat, ProjMat, baseColor, alpha.
     */
    static void patchRendererUniforms() throws Exception {
        Path p = Path.of(".precompiled/" + RENDERER + ".class");
        ClassNode cn = new ClassNode();
        new ClassReader(Files.readAllBytes(p)).accept(cn, 0);

        MethodNode render = null;
        for (MethodNode m : cn.methods) {
            if ("renderBoxList".equals(m.name)
                    && m.desc.startsWith("(Lru/destra/event/WorldRenderEvent;Ljava/util/List;")) {
                render = m;
                break;
            }
        }
        if (render == null) {
            System.out.println("renderBoxList not found");
            return;
        }

        // Find: invokevirtual ShaderProgram.bind:()V
        AbstractInsnNode bind = null;
        for (AbstractInsnNode n : render.instructions) {
            if (n instanceof MethodInsnNode min
                    && min.getOpcode() == Opcodes.INVOKEVIRTUAL
                    && "ru/destra/render/ShaderProgram".equals(min.owner)
                    && "bind".equals(min.name)
                    && "()V".equals(min.desc)) {
                bind = n;
                break;
            }
        }
        if (bind == null) {
            System.out.println("shader.bind() not found in renderBoxList");
            return;
        }

        // Already patched?
        for (AbstractInsnNode n = bind.getNext(); n != null; n = n.getNext()) {
            if (n instanceof MethodInsnNode min && "getModelViewMatrix".equals(min.name)) {
                System.out.println("renderBoxList uniforms already patched");
                return;
            }
            if (n instanceof MethodInsnNode min2 && "begin".equals(min2.name)
                    && min2.owner.contains("Tessellator")) {
                break;
            }
        }

        // Find the four uniform sets after bind: ModelView, Proj, time, screenSize, baseColor, alpha
        // We replace from first UNIFORM_MODEL_VIEW_PROJ getstatic through UNIFORM_ALPHA set (inclusive).
        AbstractInsnNode start = null;
        AbstractInsnNode end = null; // last insn of alpha set (the invokevirtual к (String,F))
        int uniformSets = 0;
        for (AbstractInsnNode n = bind.getNext(); n != null; n = n.getNext()) {
            if (n instanceof FieldInsnNode fin
                    && fin.getOpcode() == Opcodes.GETSTATIC
                    && RENDERER.equals(fin.owner)
                    && fin.name.startsWith("UNIFORM_")) {
                if (start == null && "UNIFORM_MODEL_VIEW_PROJ".equals(fin.name)) {
                    // start at aload of shader before this getstatic
                    AbstractInsnNode prev = n.getPrevious();
                    while (prev != null && prev.getOpcode() != Opcodes.ALOAD) prev = prev.getPrevious();
                    start = prev != null ? prev : n;
                }
                if ("UNIFORM_ALPHA".equals(fin.name)) {
                    // find the invokevirtual that completes this uniform write
                    AbstractInsnNode cur = n;
                    while (cur != null) {
                        if (cur instanceof MethodInsnNode min
                                && "ru/destra/render/ShaderProgram".equals(min.owner)
                                && "к".equals(min.name)) {
                            end = cur;
                            break;
                        }
                        cur = cur.getNext();
                    }
                    break;
                }
                uniformSets++;
            }
            if (n instanceof MethodInsnNode min && "begin".equals(min.name)) break;
        }

        if (start == null || end == null) {
            System.out.println("Could not locate uniform block to rewrite (start="
                    + start + " end=" + end + ")");
            return;
        }

        InsnList inject = new InsnList();
        // Local layout in renderBoxList after bind:
        // 0=event, 1=list, 2=style, 3=depth, 4=speed, 5=shader, 6=mc, 7=depthWas, 8=identityMat, 9=speedClamped
        // We also need a temp Matrix4f for MV — reuse local 8 (identity was unused meaningfully for MV;
        // addBoxFaces still uses local 8 as vertex matrix = identity, which is correct for camera-relative boxes).

        // --- ModelViewMat = new Matrix4f(RenderSystem.getModelViewMatrix()).mul(stack.pos) ---
        inject.add(new VarInsnNode(Opcodes.ALOAD, 5)); // shader
        inject.add(new FieldInsnNode(Opcodes.GETSTATIC, RENDERER, "UNIFORM_MODEL_VIEW_PROJ", "Ljava/lang/String;"));
        inject.add(new TypeInsnNode(Opcodes.NEW, "org/joml/Matrix4f"));
        inject.add(new InsnNode(Opcodes.DUP));
        inject.add(new MethodInsnNode(Opcodes.INVOKESTATIC,
                "com/mojang/blaze3d/systems/RenderSystem", "getModelViewMatrix",
                "()Lorg/joml/Matrix4f;", false));
        inject.add(new MethodInsnNode(Opcodes.INVOKESPECIAL,
                "org/joml/Matrix4f", "<init>", "(Lorg/joml/Matrix4fc;)V", false));
        inject.add(new VarInsnNode(Opcodes.ALOAD, 0)); // event
        inject.add(new FieldInsnNode(Opcodes.GETFIELD,
                "ru/destra/event/WorldRenderEvent", "matrixStack",
                "Lnet/minecraft/client/util/math/MatrixStack;"));
        inject.add(new MethodInsnNode(Opcodes.INVOKEVIRTUAL,
                "net/minecraft/client/util/math/MatrixStack", "peek",
                "()Lnet/minecraft/client/util/math/MatrixStack$Entry;", false));
        inject.add(new MethodInsnNode(Opcodes.INVOKEVIRTUAL,
                "net/minecraft/client/util/math/MatrixStack$Entry", "getPositionMatrix",
                "()Lorg/joml/Matrix4f;", false));
        inject.add(new MethodInsnNode(Opcodes.INVOKEVIRTUAL,
                "org/joml/Matrix4f", "mul", "(Lorg/joml/Matrix4fc;)Lorg/joml/Matrix4f;", false));
        inject.add(new MethodInsnNode(Opcodes.INVOKEVIRTUAL,
                "ru/destra/render/ShaderProgram", "к",
                "(Ljava/lang/String;Lorg/joml/Matrix4f;)V", false));

        // --- ProjMat = RenderSystem.getProjectionMatrix() ---
        inject.add(new VarInsnNode(Opcodes.ALOAD, 5));
        inject.add(new FieldInsnNode(Opcodes.GETSTATIC, RENDERER, "UNIFORM_CAMERA_POS", "Ljava/lang/String;"));
        inject.add(new MethodInsnNode(Opcodes.INVOKESTATIC,
                "com/mojang/blaze3d/systems/RenderSystem", "getProjectionMatrix",
                "()Lorg/joml/Matrix4f;", false));
        inject.add(new MethodInsnNode(Opcodes.INVOKEVIRTUAL,
                "ru/destra/render/ShaderProgram", "к",
                "(Ljava/lang/String;Lorg/joml/Matrix4f;)V", false));

        // Keep original time + screenSize sets: copy them from old block
        // Simpler: leave time/screenSize by only replacing ModelView through Proj and baseColor/alpha.
        // Because we replace the whole block, re-emit time + screenSize too (same as original).

        // time = (currentTimeMillis % TIME_MODULO) / TIME_SCALE * speedClamped
        inject.add(new VarInsnNode(Opcodes.ALOAD, 5));
        inject.add(new FieldInsnNode(Opcodes.GETSTATIC, RENDERER, "UNIFORM_ANIM_TIME", "Ljava/lang/String;"));
        inject.add(new MethodInsnNode(Opcodes.INVOKESTATIC, "java/lang/System", "currentTimeMillis", "()J", false));
        inject.add(new FieldInsnNode(Opcodes.GETSTATIC, RENDERER, "TIME_MODULO", "J"));
        inject.add(new InsnNode(Opcodes.LREM));
        inject.add(new InsnNode(Opcodes.L2F));
        inject.add(new FieldInsnNode(Opcodes.GETSTATIC, RENDERER, "TIME_SCALE", "F"));
        inject.add(new InsnNode(Opcodes.FDIV));
        inject.add(new VarInsnNode(Opcodes.FLOAD, 9));
        inject.add(new InsnNode(Opcodes.FMUL));
        inject.add(new MethodInsnNode(Opcodes.INVOKEVIRTUAL,
                "ru/destra/render/ShaderProgram", "к", "(Ljava/lang/String;F)V", false));

        // screenSize
        inject.add(new VarInsnNode(Opcodes.ALOAD, 5));
        inject.add(new FieldInsnNode(Opcodes.GETSTATIC, RENDERER, "UNIFORM_SCREEN_SIZE", "Ljava/lang/String;"));
        inject.add(new VarInsnNode(Opcodes.ALOAD, 6));
        inject.add(new MethodInsnNode(Opcodes.INVOKEVIRTUAL,
                "net/minecraft/client/MinecraftClient", "getWindow",
                "()Lnet/minecraft/client/util/Window;", false));
        inject.add(new MethodInsnNode(Opcodes.INVOKEVIRTUAL,
                "net/minecraft/client/util/Window", "getFramebufferWidth", "()I", false));
        inject.add(new InsnNode(Opcodes.I2F));
        inject.add(new VarInsnNode(Opcodes.ALOAD, 6));
        inject.add(new MethodInsnNode(Opcodes.INVOKEVIRTUAL,
                "net/minecraft/client/MinecraftClient", "getWindow",
                "()Lnet/minecraft/client/util/Window;", false));
        inject.add(new MethodInsnNode(Opcodes.INVOKEVIRTUAL,
                "net/minecraft/client/util/Window", "getFramebufferHeight", "()I", false));
        inject.add(new InsnNode(Opcodes.I2F));
        inject.add(new MethodInsnNode(Opcodes.INVOKEVIRTUAL,
                "ru/destra/render/ShaderProgram", "к", "(Ljava/lang/String;FF)V", false));

        // baseColor from first EspBoxRender in list (fallback white)
        // r/g/b extracted like the loop does; use first element
        inject.add(new VarInsnNode(Opcodes.ALOAD, 5));
        inject.add(new FieldInsnNode(Opcodes.GETSTATIC, RENDERER, "UNIFORM_TINT_COLOR", "Ljava/lang/String;"));
        inject.add(new VarInsnNode(Opcodes.ALOAD, 1));
        inject.add(new InsnNode(Opcodes.ICONST_0));
        inject.add(new MethodInsnNode(Opcodes.INVOKEINTERFACE, "java/util/List", "get", "(I)Ljava/lang/Object;", true));
        inject.add(new TypeInsnNode(Opcodes.CHECKCAST, "ru/destra/render/EspBoxRender"));
        inject.add(new VarInsnNode(Opcodes.ASTORE, 11)); // temp: first box (11 may be free before loop; loop uses 11 as iterator later — OK, we set before Tessellator.begin)

        // r
        inject.add(new VarInsnNode(Opcodes.ALOAD, 11));
        inject.add(new MethodInsnNode(Opcodes.INVOKEVIRTUAL, "ru/destra/render/EspBoxRender", "color", "()I", false));
        inject.add(new IntInsnNode(Opcodes.BIPUSH, 16));
        inject.add(new InsnNode(Opcodes.ISHR));
        inject.add(new IntInsnNode(Opcodes.SIPUSH, 255));
        inject.add(new InsnNode(Opcodes.IAND));
        inject.add(new InsnNode(Opcodes.I2F));
        inject.add(new FieldInsnNode(Opcodes.GETSTATIC, RENDERER, "COLOR_RED_MAX", "F"));
        inject.add(new InsnNode(Opcodes.FDIV));
        // g
        inject.add(new VarInsnNode(Opcodes.ALOAD, 11));
        inject.add(new MethodInsnNode(Opcodes.INVOKEVIRTUAL, "ru/destra/render/EspBoxRender", "color", "()I", false));
        inject.add(new IntInsnNode(Opcodes.BIPUSH, 8));
        inject.add(new InsnNode(Opcodes.ISHR));
        inject.add(new IntInsnNode(Opcodes.SIPUSH, 255));
        inject.add(new InsnNode(Opcodes.IAND));
        inject.add(new InsnNode(Opcodes.I2F));
        inject.add(new FieldInsnNode(Opcodes.GETSTATIC, RENDERER, "COLOR_GREEN_MAX", "F"));
        inject.add(new InsnNode(Opcodes.FDIV));
        // b
        inject.add(new VarInsnNode(Opcodes.ALOAD, 11));
        inject.add(new MethodInsnNode(Opcodes.INVOKEVIRTUAL, "ru/destra/render/EspBoxRender", "color", "()I", false));
        inject.add(new IntInsnNode(Opcodes.SIPUSH, 255));
        inject.add(new InsnNode(Opcodes.IAND));
        inject.add(new InsnNode(Opcodes.I2F));
        inject.add(new FieldInsnNode(Opcodes.GETSTATIC, RENDERER, "COLOR_BLUE_MAX", "F"));
        inject.add(new InsnNode(Opcodes.FDIV));
        inject.add(new InsnNode(Opcodes.FCONST_1));
        inject.add(new MethodInsnNode(Opcodes.INVOKEVIRTUAL,
                "ru/destra/render/ShaderProgram", "к", "(Ljava/lang/String;FFFF)V", false));

        // alpha from first box
        inject.add(new VarInsnNode(Opcodes.ALOAD, 5));
        inject.add(new FieldInsnNode(Opcodes.GETSTATIC, RENDERER, "UNIFORM_ALPHA", "Ljava/lang/String;"));
        inject.add(new VarInsnNode(Opcodes.ALOAD, 11));
        inject.add(new MethodInsnNode(Opcodes.INVOKEVIRTUAL, "ru/destra/render/EspBoxRender", "alpha", "()F", false));
        inject.add(new MethodInsnNode(Opcodes.INVOKEVIRTUAL,
                "ru/destra/render/ShaderProgram", "к", "(Ljava/lang/String;F)V", false));

        // Remove old uniform block
        AbstractInsnNode cur = start;
        while (cur != null) {
            AbstractInsnNode next = cur.getNext();
            render.instructions.remove(cur);
            if (cur == end) break;
            cur = next;
        }
        render.instructions.insert(bind, inject);

        // Bump maxLocals if needed (we used 11)
        if (render.maxLocals < 12) render.maxLocals = 12;

        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES) {
            @Override
            protected String getCommonSuperClass(String a, String b) {
                if (a.equals(b)) return a;
                return "java/lang/Object";
            }
        };
        cn.accept(cw);
        byte[] out = cw.toByteArray();
        Files.write(p, out);
        Path bc = Path.of("build/classes/java/main/" + RENDERER + ".class");
        if (Files.exists(bc)) Files.write(bc, out);
        System.out.println("BlockOverlayRenderer.renderBoxList: matrix/color/alpha uniforms restored");
    }

    static void patchModuleFiltering() throws Exception {
        Path p = Path.of(".precompiled/" + MODULE + ".class");
        ClassNode cn = new ClassNode();
        new ClassReader(Files.readAllBytes(p)).accept(cn, 0);

        MethodNode init = null;
        for (MethodNode m : cn.methods) {
            if ("<init>".equals(m.name)) { init = m; break; }
        }
        if (init == null) {
            System.out.println("BlockOverlayModule: no <init>");
            return;
        }

        // Ensure BootstrapMethods has isNormalMode supplier (#1 already exists in original)
        // Add visibleWhen(isNormalMode) after drawLinesSetting construction if missing.
        int changes = 0;
        changes += ensureDrawLinesVisibility(cn, init);
        changes += retargetLineSettingsVisibility(cn, init);
        changes += addLineSettingsVisibleMethod(cn);

        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES) {
            @Override
            protected String getCommonSuperClass(String a, String b) {
                if (a.equals(b)) return a;
                return "java/lang/Object";
            }
        };
        cn.accept(cw);
        byte[] out = cw.toByteArray();
        Files.write(p, out);
        Path bc = Path.of("build/classes/java/main/" + MODULE + ".class");
        if (Files.exists(bc)) Files.write(bc, out);
        System.out.println("BlockOverlayModule filtering changes=" + changes);
    }

    /**
     * After BooleanSetting.<init> that is stored to drawLinesSetting, ensure
     * visibleWhen(this::isNormalMode) is chained (reuse existing BootstrapMethods #1).
     */
    static int ensureDrawLinesVisibility(ClassNode cn, MethodNode init) {
        AbstractInsnNode[] insns = init.instructions.toArray();
        for (int i = 0; i < insns.length; i++) {
            if (!(insns[i] instanceof FieldInsnNode put)
                    || put.getOpcode() != Opcodes.PUTFIELD
                    || !"drawLinesSetting".equals(put.name)) continue;

            // If previous invoke is already visibleWhen, skip
            AbstractInsnNode prev = put.getPrevious();
            if (prev instanceof MethodInsnNode min
                    && "visibleWhen".equals(min.name)) {
                System.out.println("  drawLinesSetting: visibleWhen already present");
                return 0;
            }

            // Pattern: ... BooleanSetting.<init>; putfield drawLinesSetting
            // Insert before putfield: aload_0; invokedynamic #1; visibleWhen
            // Stack before putfield has the BooleanSetting. We need:
            //   dup isn't there — stack: setting
            //   aload_0; invokedynamic isNormalMode supplier; visibleWhen -> setting
            InsnList inject = new InsnList();
            inject.add(new VarInsnNode(Opcodes.ALOAD, 0));
            inject.add(new InvokeDynamicInsnNode(
                    "get",
                    "(L" + MODULE + ";)Ljava/util/function/Supplier;",
                    metafactory(),
                    Type.getType("()Ljava/lang/Object;"),
                    new Handle(Opcodes.H_INVOKEVIRTUAL, MODULE, "isNormalMode", "()Z", false),
                    Type.getType("()Ljava/lang/Boolean;")
            ));
            inject.add(new MethodInsnNode(Opcodes.INVOKEVIRTUAL,
                    "ru/destra/setting/BooleanSetting", "visibleWhen",
                    "(Ljava/util/function/Supplier;)Lru/destra/setting/BooleanSetting;", false));
            init.instructions.insertBefore(put, inject);
            System.out.println("  drawLinesSetting: added visibleWhen(isNormalMode)");
            return 1;
        }
        System.out.println("  drawLinesSetting putfield not found");
        return 0;
    }

    /**
     * lineWidthSetting / lineAlphaSetting currently use drawLines::isEnabled.
     * Retarget to lineSettingsVisible() so they also require normal mode.
     */
    static int retargetLineSettingsVisibility(ClassNode cn, MethodNode init) {
        int n = 0;
        for (AbstractInsnNode insn : init.instructions) {
            if (!(insn instanceof FieldInsnNode put)
                    || put.getOpcode() != Opcodes.PUTFIELD) continue;
            if (!"lineWidthSetting".equals(put.name) && !"lineAlphaSetting".equals(put.name)) continue;

            // Walk back to find the invokedynamic that builds the visibility supplier
            AbstractInsnNode cur = put;
            InvokeDynamicInsnNode indy = null;
            for (int k = 0; k < 16 && cur != null; k++) {
                if (cur instanceof InvokeDynamicInsnNode idn && "get".equals(idn.name)) {
                    indy = idn;
                    break;
                }
                cur = cur.getPrevious();
            }
            if (indy == null) continue;

            // Already retargeted?
            if (indy.bsmArgs != null && indy.bsmArgs.length >= 2
                    && indy.bsmArgs[1] instanceof Handle h
                    && "lineSettingsVisible".equals(h.getName())) {
                System.out.println("  " + put.name + ": already lineSettingsVisible");
                continue;
            }

            // Replace capture: was (BooleanSetting)->Supplier via isEnabled
            // New: (BlockOverlayModule)->Supplier via lineSettingsVisible
            // Also need aload of module instead of getfield drawLinesSetting chain.
            // Find the sequence before indy: getfield drawLinesSetting; dup; requireNonNull; pop; indy
            AbstractInsnNode before = indy.getPrevious();
            List<AbstractInsnNode> toRemove = new ArrayList<>();
            AbstractInsnNode scan = before;
            // pop
            if (scan != null && scan.getOpcode() == Opcodes.POP) {
                toRemove.add(scan);
                scan = scan.getPrevious();
            }
            // requireNonNull
            if (scan instanceof MethodInsnNode min
                    && "requireNonNull".equals(min.name)) {
                toRemove.add(scan);
                scan = scan.getPrevious();
            }
            // dup
            if (scan != null && scan.getOpcode() == Opcodes.DUP) {
                toRemove.add(scan);
                scan = scan.getPrevious();
            }
            // getfield drawLinesSetting
            if (scan instanceof FieldInsnNode fin
                    && fin.getOpcode() == Opcodes.GETFIELD
                    && "drawLinesSetting".equals(fin.name)) {
                toRemove.add(scan);
                scan = scan.getPrevious();
            }
            // aload_0 before getfield — keep it (we'll reuse for module capture)

            for (AbstractInsnNode r : toRemove) {
                init.instructions.remove(r);
            }

            indy.desc = "(L" + MODULE + ";)Ljava/util/function/Supplier;";
            indy.bsmArgs = new Object[] {
                    Type.getType("()Ljava/lang/Object;"),
                    new Handle(Opcodes.H_INVOKEVIRTUAL, MODULE,
                            "lineSettingsVisible", "()Ljava/lang/Boolean;", false),
                    Type.getType("()Ljava/lang/Boolean;")
            };
            System.out.println("  " + put.name + ": visibility -> lineSettingsVisible()");
            n++;
        }
        return n;
    }

    static int addLineSettingsVisibleMethod(ClassNode cn) {
        for (MethodNode m : cn.methods) {
            if ("lineSettingsVisible".equals(m.name)) {
                System.out.println("  lineSettingsVisible already present");
                return 0;
            }
        }
        MethodNode mn = new MethodNode(Opcodes.ACC_PUBLIC, "lineSettingsVisible",
                "()Ljava/lang/Boolean;", null, null);
        InsnList ins = mn.instructions;
        LabelNode falseLbl = new LabelNode();
        LabelNode endLbl = new LabelNode();
        ins.add(new VarInsnNode(Opcodes.ALOAD, 0));
        ins.add(new MethodInsnNode(Opcodes.INVOKEVIRTUAL, MODULE, "isNormalMode", "()Z", false));
        ins.add(new JumpInsnNode(Opcodes.IFEQ, falseLbl));
        ins.add(new VarInsnNode(Opcodes.ALOAD, 0));
        ins.add(new FieldInsnNode(Opcodes.GETFIELD, MODULE,
                "drawLinesSetting", "Lru/destra/setting/BooleanSetting;"));
        ins.add(new MethodInsnNode(Opcodes.INVOKEVIRTUAL,
                "ru/destra/setting/BooleanSetting", "isEnabled", "()Z", false));
        ins.add(new JumpInsnNode(Opcodes.IFEQ, falseLbl));
        ins.add(new InsnNode(Opcodes.ICONST_1));
        ins.add(new JumpInsnNode(Opcodes.GOTO, endLbl));
        ins.add(falseLbl);
        ins.add(new InsnNode(Opcodes.ICONST_0));
        ins.add(endLbl);
        ins.add(new MethodInsnNode(Opcodes.INVOKESTATIC,
                "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", false));
        ins.add(new TypeInsnNode(Opcodes.CHECKCAST, "java/lang/Boolean"));
        ins.add(new InsnNode(Opcodes.ARETURN));
        mn.maxStack = 2;
        mn.maxLocals = 1;
        cn.methods.add(mn);
        System.out.println("  added lineSettingsVisible()");
        return 1;
    }

    static Handle metafactory() {
        return new Handle(
                Opcodes.H_INVOKESTATIC,
                "java/lang/invoke/LambdaMetafactory",
                "metafactory",
                "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;"
                        + "Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)"
                        + "Ljava/lang/invoke/CallSite;",
                false
        );
    }

    static void write(ClassNode cn, Path p) throws Exception {
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES) {
            @Override
            protected String getCommonSuperClass(String a, String b) {
                if (a.equals(b)) return a;
                return "java/lang/Object";
            }
        };
        cn.accept(cw);
        byte[] out = cw.toByteArray();
        Files.write(p, out);
        Path bc = Path.of("build/classes/java/main/" + cn.name + ".class");
        if (Files.exists(bc)) Files.write(bc, out);
    }
}
