import java.io.*;
import java.nio.file.*;
import java.util.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;

public final class PatchChamsMixinClinit {
    public static void main(String[] args) throws Exception {
        if (args.length < 1) { System.err.println("Usage: PatchChamsMixinClinit <classfile> [classfile2 ...]"); System.exit(1); }
        for (String classFile : args) {
            File f = new File(classFile);
            if (!f.exists()) {
                System.err.println("SKIP (not found, using source): " + classFile);
                continue;
            }
            patchClass(classFile);
        }
    }

    static void patchClass(String classFile) throws Exception {
        File f = new File(classFile);
        if (!f.exists()) {
            System.err.println("SKIP (not found): " + classFile);
            return;
        }
        byte[] data = Files.readAllBytes(Path.of(classFile));
        ClassNode cn = new ClassNode();
        new ClassReader(data).accept(cn, 0);
        String owner = cn.name;

        boolean isChams = owner.equals("sg/mx/LivingEntityRendererChamsMixin");
        boolean isEquip = owner.equals("sg/mx/EquipmentRendererMixin");

        // --- Inline static field accesses in ALL methods, then remove <clinit> ---
        // This avoids Mixin <clinit> merge issues (NPE from lost obfuscated String constants).
        // Values are inlined directly at each GETSTATIC site.

        for (MethodNode mn : cn.methods) {
            if (mn.instructions == null) continue;

            List<AbstractInsnNode> toRemove = new ArrayList<>();
            ListIterator<AbstractInsnNode> it = mn.instructions.iterator();

            while (it.hasNext()) {
                AbstractInsnNode insn = it.next();

                // Remove VMBridge.identifyClass calls (and their args)
                if (insn.getOpcode() == Opcodes.INVOKESTATIC) {
                    MethodInsnNode min = (MethodInsnNode) insn;
                    if (min.name.equals("identifyClass") && min.owner.equals("ru/dreamix/fabricloader/VMBridge")) {
                        AbstractInsnNode prev = insn.getPrevious();
                        if (prev != null && prev.getOpcode() == Opcodes.LDC) {
                            toRemove.add(prev);
                            prev = prev.getPrevious();
                        }
                        if (prev != null && (prev.getOpcode() == Opcodes.LDC || prev.getOpcode() == Opcodes.GETSTATIC || prev.getOpcode() == Opcodes.ALOAD)) {
                            toRemove.add(prev);
                        }
                        toRemove.add(insn);
                        System.err.println("  Removed VMBridge.identifyClass call in " + mn.name);
                        continue;
                    }
                }

                // Inline GETSTATIC of @Unique static fields with constant values
                if (insn.getOpcode() == Opcodes.GETSTATIC) {
                    FieldInsnNode fin = (FieldInsnNode) insn;
                    System.err.println("  DEBUG GETSTATIC owner=" + fin.owner + " name=" + fin.name + " desc=" + fin.desc + " in " + mn.name + " (classOwner=" + owner + ")");
                    if (!fin.owner.equals(owner)) continue;

                    if (isEquip && fin.name.equals("DESTRA_ARMOR_TRIMS_ATLAS_TEXTURE")
                            && fin.desc.equals("Lnet/minecraft/util/Identifier;")) {
                        InsnList inline = new InsnList();
                        inline.add(new LdcInsnNode("trims/models/armor/trim_atlas"));
                        inline.add(new MethodInsnNode(Opcodes.INVOKESTATIC,
                                "net/minecraft/util/Identifier", "ofVanilla",
                                "(Ljava/lang/String;)Lnet/minecraft/util/Identifier;", false));
                        mn.instructions.insertBefore(insn, inline);
                        toRemove.add(insn);
                        System.err.println("  Inlined DESTRA_ARMOR_TRIMS_ATLAS_TEXTURE in " + mn.name);
                    }

                    if (isChams && fin.name.equals("DESTRA$GLOW_CAPTURE_TEXTURE")
                            && fin.desc.equals("Lnet/minecraft/util/Identifier;")) {
                        InsnList inline = new InsnList();
                        inline.add(new LdcInsnNode("destra"));
                        inline.add(new LdcInsnNode("textures/glow_entity_capture.png"));
                        inline.add(new MethodInsnNode(Opcodes.INVOKESTATIC,
                                "net/minecraft/util/Identifier", "of",
                                "(Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/util/Identifier;", false));
                        mn.instructions.insertBefore(insn, inline);
                        toRemove.add(insn);
                        System.err.println("  Inlined DESTRA$GLOW_CAPTURE_TEXTURE in " + mn.name);
                    }

                    if (isChams && fin.desc.equals("I") && isUniqueField(cn, fin.name)) {
                        InsnList inline = new InsnList();
                        inline.add(new LdcInsnNode(15728880)); // 0xF000F0
                        mn.instructions.insertBefore(insn, inline);
                        toRemove.add(insn);
                        System.err.println("  Inlined int field " + fin.name + " in " + mn.name);
                    }
                }
            }
            for (AbstractInsnNode r : toRemove) mn.instructions.remove(r);
        }

        // --- Remove <clinit> entirely (values are now inlined at use sites) ---
        cn.methods.removeIf(mn -> {
            if (mn.name.equals("<clinit>")) {
                System.err.println("  Removed <clinit> from " + owner);                return true;
            }
            return false;
        });

        // --- Remove orphaned obfuscated static final fields (no @Unique, no @Shadow, no ConstantValue) ---
        cn.fields.removeIf(fn -> {
            if ((fn.access & Opcodes.ACC_STATIC) == 0 || (fn.access & Opcodes.ACC_FINAL) == 0) return false;
            if (fn.value != null) return false;
            if (fn.visibleAnnotations != null) return false;
            if (!fn.desc.equals("Ljava/lang/String;") && !fn.desc.equals("I") && !fn.desc.equals("F")) return false;
            System.err.println("  Removed orphaned field: " + fn.name + " desc=" + fn.desc);
            return true;
        });

        // --- Remove printStackTrace() from ALL methods in LivingEntityRendererChamsMixin ---
        if (isChams) {
            for (MethodNode mn : cn.methods) {
                List<AbstractInsnNode> toRemove = new ArrayList<>();
                ListIterator<AbstractInsnNode> it = mn.instructions.iterator();
                while (it.hasNext()) {
                    AbstractInsnNode insn = it.next();
                    if (insn.getOpcode() == Opcodes.INVOKEVIRTUAL) {
                        MethodInsnNode min = (MethodInsnNode) insn;
                        if (min.name.equals("printStackTrace") && min.owner.equals("java/lang/Exception")) {
                            toRemove.add(insn);
                            System.err.println("  Removed " + mn.name + ": Exception.printStackTrace() call");
                        }
                    }
                }
                for (AbstractInsnNode r : toRemove) mn.instructions.remove(r);
            }
        }

        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS) {
            @Override
            protected String getCommonSuperClass(String type1, String type2) {
                return "java/lang/Object";
            }
        };
        cn.accept(cw);
        byte[] out = cw.toByteArray();
        Files.write(Path.of(classFile), out);
        System.err.println("Written " + out.length + " bytes to " + classFile);
    }

    static boolean isUniqueField(ClassNode cn, String name) {
        for (FieldNode fn : cn.fields) {
            if (fn.name.equals(name) && fn.visibleAnnotations != null) {
                for (AnnotationNode an : fn.visibleAnnotations) {
                    if (an.desc.equals("Lorg/spongepowered/asm/mixin/Unique;")) return true;
                }
            }
        }
        return false;
    }
}
