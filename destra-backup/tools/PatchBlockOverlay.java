import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public final class PatchBlockOverlay {
    static final String SUBSCRIBE_DESC = "Lcom/google/common/eventbus/Subscribe;";

    public static void main(String[] args) throws Exception {
        patchShaderUniforms();
        patchInventoryDisplayBackground();
        patchBlockOverlaySubscribe();
        patchTargetEspSubscribe();
        patchKillEffectSubscribe();
        patchWorldParticlesSubscribe();
        patchTargetEspTextures();
        patchItemPhysicsConstants();
    }

    static void patchShaderUniforms() throws Exception {
        String path = ".precompiled/ru/destra/render/BlockOverlayRenderer.class";
        byte[] data = Files.readAllBytes(Path.of(path));
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        Map<String, String> uniformNames = new LinkedHashMap<>();
        uniformNames.put("UNIFORM_MODEL_VIEW_PROJ", "ModelViewMat");
        uniformNames.put("UNIFORM_CAMERA_POS", "ProjMat");
        uniformNames.put("UNIFORM_ANIM_TIME", "time");
        uniformNames.put("UNIFORM_SCREEN_SIZE", "screenSize");
        uniformNames.put("UNIFORM_TINT_COLOR", "baseColor");
        uniformNames.put("UNIFORM_ALPHA", "alpha");

        MethodNode clinit = getOrCreateClinit(cn);

        int patched = 0;
        for (FieldNode f : cn.fields) {
            if (!"Ljava/lang/String;".equals(f.desc) || (f.access & Opcodes.ACC_STATIC) == 0) continue;
            String value = uniformNames.get(f.name);
            if (value == null) continue;

            if (!hasPutStatic(clinit, f.name, cn.name)) {
                AbstractInsnNode lastReturn = getLastReturn(clinit);
                if (lastReturn != null) {
                    InsnList inject = new InsnList();
                    inject.add(new LdcInsnNode(value));
                    inject.add(new FieldInsnNode(Opcodes.PUTSTATIC, cn.name, f.name, "Ljava/lang/String;"));
                    clinit.instructions.insertBefore(lastReturn, inject);
                    patched++;
                    System.out.println("  Set " + f.name + " = \"" + value + "\"");
                }
            }
        }

        if (patched > 0) {
            ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
            cn.accept(cw);
            Files.write(Path.of(path), cw.toByteArray());
            System.out.println("  BlockOverlayRenderer: " + patched + " uniform names set");
        } else {
            System.out.println("  BlockOverlayRenderer: no changes needed");
        }
    }

    static void patchInventoryDisplayBackground() throws Exception {
        String path = ".precompiled/ru/destra/module/InventoryDisplayModule.class";
        if (!Files.exists(Path.of(path))) { System.out.println("  InventoryDisplayModule: file not found"); return; }
        byte[] data = Files.readAllBytes(Path.of(path));
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        String hudModule = "ru/destra/module/HudModule";
        int patched = 0;

        for (MethodNode m : cn.methods) {
            if (!isStubReturn(m)) continue;
            String superDesc = findSuperMethod(cn, hudModule, m.desc);
            if (superDesc == null) continue;

            m.instructions.clear();
            addLoadInstructions(m, m.desc);
            m.instructions.add(new MethodInsnNode(Opcodes.INVOKESPECIAL, hudModule, "drawBackground", m.desc, false));
            m.instructions.add(new InsnNode(Opcodes.RETURN));
            patched++;
            System.out.println("  Patched " + m.name + m.desc + " -> super");
        }

        if (patched > 0) {
            ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
            cn.accept(cw);
            Files.write(Path.of(path), cw.toByteArray());
            System.out.println("  InventoryDisplayModule: " + patched + " background stubs fixed");
        } else {
            System.out.println("  InventoryDisplayModule: no background stubs found");
        }
    }

    static void patchBlockOverlaySubscribe() throws Exception {
        String path = ".precompiled/ru/destra/module/BlockOverlayModule.class";
        byte[] data = Files.readAllBytes(Path.of(path));
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        boolean patched = false;
        for (MethodNode m : cn.methods) {
            if (!m.name.equals("onWorldRender")) continue;
            if (m.desc.equals("(Lru/destra/event/WorldRenderEvent;)V")) {
                if (m.visibleAnnotations == null) m.visibleAnnotations = new ArrayList<>();
                boolean hasSubscribe = false;
                for (AnnotationNode ann : m.visibleAnnotations) {
                    if (ann.desc.equals(SUBSCRIBE_DESC)) { hasSubscribe = true; break; }
                }
                if (!hasSubscribe) {
                    m.visibleAnnotations.add(new AnnotationNode(SUBSCRIBE_DESC));
                    patched = true;
                    System.out.println("  Added @Subscribe to BlockOverlayModule.onWorldRender");
                }
            }
        }

        if (patched) {
            ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
            cn.accept(cw);
            Files.write(Path.of(path), cw.toByteArray());
            System.out.println("  BlockOverlayModule: @Subscribe annotation added");
        } else {
            System.out.println("  BlockOverlayModule: @Subscribe already present or method not found");
        }
    }

    static void patchTargetEspSubscribe() throws Exception {
        String path = ".precompiled/ru/destra/module/TargetEspModule.class";
        byte[] data = Files.readAllBytes(Path.of(path));
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        boolean patched = false;
        for (MethodNode m : cn.methods) {
            if (!m.name.equals("onRenderTick")) continue;
            if (!m.desc.equals("(Lru/destra/event/RenderEvent;)V")) continue;
            if (m.visibleAnnotations == null) m.visibleAnnotations = new ArrayList<>();
            boolean hasSubscribe = false;
            for (AnnotationNode ann : m.visibleAnnotations) {
                if (ann.desc.equals(SUBSCRIBE_DESC)) { hasSubscribe = true; break; }
            }
            if (!hasSubscribe) {
                m.visibleAnnotations.add(new AnnotationNode(SUBSCRIBE_DESC));
                patched = true;
                System.out.println("  Added @Subscribe to TargetEspModule.onRenderTick");
            }
        }

        if (patched) {
            ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
            cn.accept(cw);
            Files.write(Path.of(path), cw.toByteArray());
            System.out.println("  TargetEspModule: @Subscribe annotation added");
        } else {
            System.out.println("  TargetEspModule: @Subscribe already present or onRenderTick not found");
        }
    }

    static void patchKillEffectSubscribe() throws Exception {
        addSubscribeToMethod(".precompiled/ru/destra/module/KillEffectModule.class",
                "onWorldRender", "(Lru/destra/event/WorldRenderEvent;)V",
                "KillEffectModule");
    }

    static void patchWorldParticlesSubscribe() throws Exception {
        String path = ".precompiled/ru/destra/module/WorldParticlesModule.class";
        boolean r1 = addSubscribeToMethod(path, "onRenderTick", "(Lru/destra/event/RenderEvent;)V", "WorldParticlesModule");
        boolean r2 = addSubscribeToMethod(path, "onWorldRender", "(Lru/destra/event/WorldRenderEvent;)V", "WorldParticlesModule");
        if (r1 || r2) {
            System.out.println("  WorldParticlesModule: @Subscribe annotation(s) added");
        } else {
            System.out.println("  WorldParticlesModule: @Subscribe already present or methods not found");
        }
    }

    static boolean addSubscribeToMethod(String path, String methodName, String methodDesc, String label) throws Exception {
        if (!Files.exists(Path.of(path))) {
            System.out.println("  " + label + ": file not found");
            return false;
        }
        byte[] data = Files.readAllBytes(Path.of(path));
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        boolean patched = false;
        boolean found = false;
        for (MethodNode m : cn.methods) {
            if (!m.name.equals(methodName) || !m.desc.equals(methodDesc)) continue;
            found = true;
            if (m.visibleAnnotations == null) m.visibleAnnotations = new ArrayList<>();
            boolean hasSubscribe = false;
            for (AnnotationNode ann : m.visibleAnnotations) {
                if (ann.desc.equals(SUBSCRIBE_DESC)) { hasSubscribe = true; break; }
            }
            if (!hasSubscribe) {
                m.visibleAnnotations.add(new AnnotationNode(SUBSCRIBE_DESC));
                patched = true;
                System.out.println("  Added @Subscribe to " + label + "." + methodName);
            }
        }

        if (patched) {
            ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
            cn.accept(cw);
            Files.write(Path.of(path), cw.toByteArray());
        }
        if (!found) {
            System.out.println("  " + label + ": " + methodName + " not found");
        }
        return patched;
    }

    static void patchTargetEspTextures() throws Exception {
        String path = ".precompiled/ru/destra/module/TargetEspModule.class";
        byte[] data = Files.readAllBytes(Path.of(path));
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        Map<String, String> texturePaths = new LinkedHashMap<>();
        texturePaths.put("\u0448\u0419\u0037", "images/particles/glow.png");
        texturePaths.put("\u0448\u0419\u044f", "images/particles/trail.png");
        texturePaths.put("\u0448\u042a\u042e", "images/particles/glow.png");
        texturePaths.put("\u0448\u042a\u0415", "images/particles/particle1.png");
        texturePaths.put("\u0448\u0446\u0445", "images/particles/particle2.png");
        texturePaths.put("\u0448\u0446\u0037", "images/particles/marker1.png");
        texturePaths.put("\u0448\u0446\u044f", "images/particles/marker2.png");
        texturePaths.put("\u0448\u0446\u0036", "images/particles/marker3.png");

        MethodNode clinit = getOrCreateClinit(cn);
        int patched = 0;

        for (FieldNode f : cn.fields) {
            if (!"Ljava/lang/String;".equals(f.desc) || (f.access & Opcodes.ACC_STATIC) == 0) continue;
            String value = texturePaths.get(f.name);
            if (value == null) continue;

            if (!hasPutStatic(clinit, f.name, cn.name)) {
                AbstractInsnNode lastReturn = getLastReturn(clinit);
                if (lastReturn != null) {
                    InsnList inject = new InsnList();
                    inject.add(new LdcInsnNode(value));
                    inject.add(new FieldInsnNode(Opcodes.PUTSTATIC, cn.name, f.name, "Ljava/lang/String;"));
                    clinit.instructions.insertBefore(lastReturn, inject);
                    patched++;
                    System.out.println("  Set TargetEsp texture " + escape(f.name) + " = \"" + value + "\"");
                }
            }
        }

        boolean hasInitCall = false;
        for (AbstractInsnNode insn : clinit.instructions) {
            if (insn instanceof MethodInsnNode) {
                MethodInsnNode min = (MethodInsnNode) insn;
                if (min.name.equals("initStaticResources")) { hasInitCall = true; break; }
            }
        }
        if (!hasInitCall) {
            AbstractInsnNode lastReturn = getLastReturn(clinit);
            if (lastReturn != null) {
                InsnList inject = new InsnList();
                inject.add(new MethodInsnNode(Opcodes.INVOKESTATIC, cn.name, "initStaticResources", "()V", false));
                clinit.instructions.insertBefore(lastReturn, inject);
                patched++;
                System.out.println("  Added initStaticResources() call to <clinit>");
            }
        }

        if (patched > 0) {
            ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
            cn.accept(cw);
            Files.write(Path.of(path), cw.toByteArray());
            System.out.println("  TargetEspModule: " + patched + " texture paths set");
        } else {
            System.out.println("  TargetEspModule: no changes needed");
        }
    }

    static void patchItemPhysicsConstants() throws Exception {
        String path = ".precompiled/sg/mx/ItemEntityRendererMixin.class";
        File classFile = new File(path);
        if (!classFile.exists()) {
            System.out.println("  ItemEntityRendererMixin.class not found (using source version) - skipping");
            return;
        }
        byte[] data = Files.readAllBytes(Path.of(path));
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        MethodNode clinit = getOrCreateClinit(cn);
        int patched = 0;
        float[] values = {90.0F, 1.0F};
        int valIdx = 0;

        for (FieldNode f : cn.fields) {
            if (!"F".equals(f.desc) || (f.access & Opcodes.ACC_STATIC) == 0) continue;
            if ((f.access & Opcodes.ACC_FINAL) == 0) continue;

            if (!hasPutStatic(clinit, f.name, cn.name)) {
                float value = values[valIdx % values.length];
                valIdx++;
                AbstractInsnNode lastReturn = getLastReturn(clinit);
                if (lastReturn != null) {
                    InsnList inject = new InsnList();
                    inject.add(new LdcInsnNode(value));
                    inject.add(new FieldInsnNode(Opcodes.PUTSTATIC, cn.name, f.name, "F"));
                    clinit.instructions.insertBefore(lastReturn, inject);
                    patched++;
                    System.out.println("  Set ItemPhysics " + escape(f.name) + " = " + value + "f");
                }
            }
        }

        if (patched > 0) {
            ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
            cn.accept(cw);
            Files.write(Path.of(path), cw.toByteArray());
            System.out.println("  ItemEntityRendererMixin: " + patched + " constants set");
        } else {
            System.out.println("  ItemEntityRendererMixin: no changes needed");
        }
    }

    static MethodNode getOrCreateClinit(ClassNode cn) {
        for (MethodNode m : cn.methods) {
            if (m.name.equals("<clinit>")) return m;
        }
        MethodNode clinit = new MethodNode(Opcodes.ACC_STATIC, "<clinit>", "()V", null, null);
        clinit.instructions.add(new InsnNode(Opcodes.RETURN));
        cn.methods.add(clinit);
        System.out.println("  Created <clinit>");
        return clinit;
    }

    static AbstractInsnNode getLastReturn(MethodNode m) {
        AbstractInsnNode last = null;
        for (AbstractInsnNode insn : m.instructions) {
            if (insn.getOpcode() == Opcodes.RETURN) last = insn;
        }
        return last;
    }

    static boolean hasPutStatic(MethodNode m, String fieldName, String className) {
        for (AbstractInsnNode insn : m.instructions) {
            if (insn instanceof FieldInsnNode) {
                FieldInsnNode fin = (FieldInsnNode) insn;
                if (fin.getOpcode() == Opcodes.PUTSTATIC && fin.name.equals(fieldName)) return true;
            }
        }
        return false;
    }

    static boolean isStubReturn(MethodNode m) {
        if (m.instructions.size() == 0) return false;
        for (AbstractInsnNode insn : m.instructions) {
            int op = insn.getOpcode();
            if (op == Opcodes.RETURN || op == -1) continue;
            return false;
        }
        return true;
    }

    static String findSuperMethod(ClassNode cn, String superName, String desc) {
        if (!desc.contains("DrawContext") || !desc.contains("FFFFF")) return null;
        if (!desc.endsWith("I)V") && !desc.endsWith("IF)V")) return null;
        return desc;
    }

    static void addLoadInstructions(MethodNode m, String desc) {
        String params = desc.substring(1, desc.indexOf(')'));
        int var = 0;
        m.instructions.add(new VarInsnNode(Opcodes.ALOAD, 0));
        var = 1;
        int i = 0;
        while (i < params.length()) {
            char c = params.charAt(i);
            if (c == 'L') {
                m.instructions.add(new VarInsnNode(Opcodes.ALOAD, var));
                while (i < params.length() && params.charAt(i) != ';') i++;
                i++;
                var++;
            } else if (c == 'F') {
                m.instructions.add(new VarInsnNode(Opcodes.FLOAD, var));
                i++;
                var++;
            } else if (c == 'I') {
                m.instructions.add(new VarInsnNode(Opcodes.ILOAD, var));
                i++;
                var++;
            } else if (c == 'D') {
                m.instructions.add(new VarInsnNode(Opcodes.DLOAD, var));
                i++;
                var += 2;
            } else {
                i++;
            }
        }
    }

    static String escape(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c >= 32 && c < 127) sb.append(c);
            else sb.append("U+").append(String.format("%04X", (int) c));
        }
        return sb.toString();
    }
}
