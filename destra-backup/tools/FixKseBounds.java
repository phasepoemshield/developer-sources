import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.nio.file.*;
import java.util.*;

public final class FixKseBounds {
    public static void main(String[] args) throws Exception {
        Path classFile = Path.of(args[0]);
        byte[] data = Files.readAllBytes(classFile);
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        for (MethodNode method : cn.methods) {
            if ("(FFFF)V".equals(method.desc)) {
                System.out.println("Found bounds method: " + method.name + method.desc);
                int ksePutCount = 0;
                int idx2 = -1, idx3 = -1;

                for (int i = 0; i < method.instructions.size(); i++) {
                    AbstractInsnNode insn = method.instructions.get(i);
                    if (insn.getType() == AbstractInsnNode.FIELD_INSN) {
                        FieldInsnNode fin = (FieldInsnNode) insn;
                        if (fin.getOpcode() == Opcodes.PUTFIELD
                            && "ru/destra/gui/KeybindSettingElement".equals(fin.owner)
                            && "F".equals(fin.desc)) {
                            ksePutCount++;
                            System.out.println("  KSE putfield #" + ksePutCount + " @index=" + i + ": " + fin.name);
                            if (ksePutCount == 2) idx2 = i;
                            if (ksePutCount == 3) idx3 = i;
                        }
                    }
                }

                if (idx2 >= 0 && idx3 >= 0) {
                    FieldInsnNode f2 = (FieldInsnNode) method.instructions.get(idx2);
                    FieldInsnNode f3 = (FieldInsnNode) method.instructions.get(idx3);
                    String tmp = f2.name;
                    f2.name = f3.name;
                    f3.name = tmp;
                    System.out.println("  SWAPPED: #2=" + f2.name + " #3=" + f3.name);
                }
                break;
            }
        }

        ClassWriter cw = new ClassWriter(0);
        cn.accept(cw);
        byte[] result = cw.toByteArray();
        Files.write(classFile, result);
        System.out.println("Fixed: " + data.length + " -> " + result.length + " bytes");
    }
}
