import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.nio.file.*;

public final class PatchOverlayTextureDefault {
    static final String CLASS = "sg/mx/OverlayTextureMixin";
    static final int DEFAULT_OVERLAY = -1291911168;

    public static void main(String[] args) throws Exception {
        Path classFile = Path.of(".precompiled/sg/mx/OverlayTextureMixin.class");
        byte[] data = Files.readAllBytes(classFile);
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        FieldNode defaultField = null;
        for (FieldNode f : cn.fields) {
            if ("I".equals(f.desc) && (f.access & Opcodes.ACC_STATIC) != 0
                    && (f.access & Opcodes.ACC_FINAL) != 0) {
                int value = f.value != null ? (Integer) f.value : 0;
                if (value == 0) {
                    defaultField = f;
                    break;
                }
            }
        }

        if (defaultField == null) {
            System.err.println("  No zero-valued static int field found");
            return;
        }

        MethodNode clinit = null;
        for (MethodNode m : cn.methods) {
            if ("<clinit>".equals(m.name)) {
                clinit = m;
                break;
            }
        }
        if (clinit == null) {
            clinit = new MethodNode(Opcodes.ACC_STATIC, "<clinit>", "()V", null, null);
            clinit.instructions.add(new InsnNode(Opcodes.RETURN));
            cn.methods.add(clinit);
        }

        boolean hasInit = false;
        for (AbstractInsnNode insn : clinit.instructions) {
            if (insn instanceof FieldInsnNode) {
                FieldInsnNode fin = (FieldInsnNode) insn;
                if (fin.getOpcode() == Opcodes.PUTSTATIC && fin.name.equals(defaultField.name)) {
                    hasInit = true;
                    break;
                }
            }
        }
        if (hasInit) {
            System.err.println("  Field " + defaultField.name + " already initialized");
            return;
        }

        AbstractInsnNode lastReturn = null;
        for (AbstractInsnNode insn : clinit.instructions) {
            if (insn.getOpcode() == Opcodes.RETURN) {
                lastReturn = insn;
            }
        }

        InsnList inject = new InsnList();
        inject.add(new LdcInsnNode(DEFAULT_OVERLAY));
        inject.add(new FieldInsnNode(Opcodes.PUTSTATIC, cn.name, defaultField.name, "I"));
        if (lastReturn != null) {
            clinit.instructions.insertBefore(lastReturn, inject);
        } else {
            clinit.instructions.add(inject);
            clinit.instructions.add(new InsnNode(Opcodes.RETURN));
        }

        ClassWriter cw = new ClassWriter(0);
        cn.accept(cw);
        Files.write(classFile, cw.toByteArray());
        System.err.println("  Set " + defaultField.name + " = " + DEFAULT_OVERLAY + " (vanilla hurt flash color)");
        System.err.println("PatchOverlayTextureDefault: patched OverlayTextureMixin");
    }
}
