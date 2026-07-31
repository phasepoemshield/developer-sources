import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.nio.file.*;

/**
 * Cape: init SkinTexturesMixin cape path constants; fix CapeConfig.isWaveMode to return cape.enabled.
 * KillEffect lightning: init LightningEntityRendererMixin RGB divisors to 255f.
 */
public final class PatchCapeAndLightning {
    public static void main(String[] args) throws Exception {
        patchSkinTextures();
        patchCapeConfig();
        patchLightning();
    }

    static void patchSkinTextures() throws Exception {
        Path p = Path.of(".precompiled/sg/mx/SkinTexturesMixin.class");
        ClassNode cn = new ClassNode();
        new ClassReader(Files.readAllBytes(p)).accept(cn, 0);

        // Drop FINAL so we can assign in clinit
        for (FieldNode f : cn.fields) {
            if (("ИO".equals(f.name) || "И5".equals(f.name)) && "Ljava/lang/String;".equals(f.desc)) {
                f.access &= ~Opcodes.ACC_FINAL;
            }
        }

        for (MethodNode mn : cn.methods) {
            if (!"<clinit>".equals(mn.name)) continue;
            // Check if already assigns ИO
            boolean has = false;
            for (AbstractInsnNode insn : mn.instructions) {
                if (insn instanceof FieldInsnNode fin && fin.getOpcode() == Opcodes.PUTSTATIC && "ИO".equals(fin.name)) {
                    has = true;
                    break;
                }
            }
            if (has) {
                System.out.println("SkinTexturesMixin: ИO already initialized");
                break;
            }
            AbstractInsnNode ret = null;
            for (AbstractInsnNode insn : mn.instructions) {
                if (insn.getOpcode() == Opcodes.RETURN) { ret = insn; break; }
            }
            InsnList inject = new InsnList();
            inject.add(new LdcInsnNode("images/cape.png"));
            inject.add(new FieldInsnNode(Opcodes.PUTSTATIC, cn.name, "ИO", "Ljava/lang/String;"));
            inject.add(new LdcInsnNode("images/capeblack.png"));
            inject.add(new FieldInsnNode(Opcodes.PUTSTATIC, cn.name, "И5", "Ljava/lang/String;"));
            if (ret != null) mn.instructions.insertBefore(ret, inject);
            else mn.instructions.add(inject);
            System.out.println("SkinTexturesMixin: initialized ИO/И5 cape paths");
        }

        write(cn, p, "build/classes/java/main/sg/mx/SkinTexturesMixin.class");
    }

    static void patchCapeConfig() throws Exception {
        Path p = Path.of(".precompiled/ru/destra/misc/CapeConfig.class");
        ClassNode cn = new ClassNode();
        new ClassReader(Files.readAllBytes(p)).accept(cn, 0);

        for (MethodNode mn : cn.methods) {
            if (!"isWaveMode".equals(mn.name) || !"()Z".equals(mn.desc)) continue;

            // Replace body:
            // CapeModule cape = DestraClient.getInstance()?.getModuleManager()?.cape;
            // return cape != null && cape.Д();
            InsnList il = new InsnList();
            LabelNode retFalse = new LabelNode();
            LabelNode retTrue = new LabelNode();

            il.add(new MethodInsnNode(Opcodes.INVOKESTATIC, "ru/destra/core/DestraClient", "getInstance",
                    "()Lru/destra/core/DestraClient;", false));
            il.add(new VarInsnNode(Opcodes.ASTORE, 0));
            il.add(new VarInsnNode(Opcodes.ALOAD, 0));
            il.add(new JumpInsnNode(Opcodes.IFNULL, retFalse));
            il.add(new VarInsnNode(Opcodes.ALOAD, 0));
            il.add(new MethodInsnNode(Opcodes.INVOKEVIRTUAL, "ru/destra/core/DestraClient", "getModuleManager",
                    "()Lru/destra/core/ModuleManager;", false));
            il.add(new VarInsnNode(Opcodes.ASTORE, 1));
            il.add(new VarInsnNode(Opcodes.ALOAD, 1));
            il.add(new JumpInsnNode(Opcodes.IFNULL, retFalse));
            il.add(new VarInsnNode(Opcodes.ALOAD, 1));
            il.add(new FieldInsnNode(Opcodes.GETFIELD, "ru/destra/core/ModuleManager", "cape",
                    "Lru/destra/module/CapeModule;"));
            il.add(new VarInsnNode(Opcodes.ASTORE, 2));
            il.add(new VarInsnNode(Opcodes.ALOAD, 2));
            il.add(new JumpInsnNode(Opcodes.IFNULL, retFalse));
            il.add(new VarInsnNode(Opcodes.ALOAD, 2));
            il.add(new MethodInsnNode(Opcodes.INVOKEVIRTUAL, "ru/destra/module/CapeModule", "Д", "()Z", false));
            il.add(new JumpInsnNode(Opcodes.IFEQ, retFalse));
            il.add(new InsnNode(Opcodes.ICONST_1));
            il.add(new InsnNode(Opcodes.IRETURN));
            il.add(retFalse);
            il.add(new InsnNode(Opcodes.ICONST_0));
            il.add(new InsnNode(Opcodes.IRETURN));

            mn.instructions.clear();
            mn.tryCatchBlocks.clear();
            mn.localVariables = null;
            mn.instructions.add(il);
            mn.maxLocals = 3;
            mn.maxStack = 2;
            System.out.println("CapeConfig.isWaveMode: return cape.enabled");
        }

        write(cn, p, "build/classes/java/main/ru/destra/misc/CapeConfig.class");
    }

    static void patchLightning() throws Exception {
        Path p = Path.of(".precompiled/sg/mx/LightningEntityRendererMixin.class");
        ClassNode cn = new ClassNode();
        new ClassReader(Files.readAllBytes(p)).accept(cn, 0);

        for (FieldNode f : cn.fields) {
            if (("ПП".equals(f.name) || "П2".equals(f.name) || "ПХ".equals(f.name)) && "F".equals(f.desc)) {
                f.access &= ~Opcodes.ACC_FINAL;
            }
        }

        MethodNode clinit = null;
        for (MethodNode mn : cn.methods) {
            if ("<clinit>".equals(mn.name)) { clinit = mn; break; }
        }
        if (clinit == null) {
            clinit = new MethodNode(Opcodes.ACC_STATIC, "<clinit>", "()V", null, null);
            clinit.instructions.add(new InsnNode(Opcodes.RETURN));
            cn.methods.add(clinit);
        }

        boolean has = false;
        for (AbstractInsnNode insn : clinit.instructions) {
            if (insn instanceof FieldInsnNode fin && fin.getOpcode() == Opcodes.PUTSTATIC && "ПП".equals(fin.name)) {
                has = true;
                break;
            }
        }
        if (!has) {
            AbstractInsnNode ret = null;
            for (AbstractInsnNode insn : clinit.instructions) {
                if (insn.getOpcode() == Opcodes.RETURN) { ret = insn; break; }
            }
            InsnList inject = new InsnList();
            for (String name : new String[]{"ПП", "П2", "ПХ"}) {
                inject.add(new LdcInsnNode(255.0f));
                inject.add(new FieldInsnNode(Opcodes.PUTSTATIC, cn.name, name, "F"));
            }
            if (ret != null) clinit.instructions.insertBefore(ret, inject);
            else clinit.instructions.add(inject);
            System.out.println("LightningEntityRendererMixin: ПП/П2/ПХ = 255f");
        } else {
            System.out.println("LightningEntityRendererMixin: divisors already set");
        }

        write(cn, p, "build/classes/java/main/sg/mx/LightningEntityRendererMixin.class");
    }

    static void write(ClassNode cn, Path p, String buildPath) throws Exception {
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS | ClassWriter.COMPUTE_FRAMES);
        cn.accept(cw);
        byte[] out = cw.toByteArray();
        Files.write(p, out);
        Path bc = Path.of(buildPath);
        if (Files.exists(bc.getParent())) {
            Files.createDirectories(bc.getParent());
            Files.write(bc, out);
        }
        System.out.println("Wrote " + p + " (" + out.length + " bytes)");
    }
}
