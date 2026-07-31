import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.nio.file.*;

public final class PatchTimedAnimation {
    public static void main(String[] args) throws Exception {
        Path classFile = Path.of(args[0]);
        byte[] data = Files.readAllBytes(classFile);
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        String timerDesc = "Lru/destra/util/CooldownTimer;";
        boolean hasTimerField = false;
        for (FieldNode field : cn.fields) {
            if (timerDesc.equals(field.desc) && !java.lang.reflect.Modifier.isStatic(field.access)) {
                hasTimerField = true;
                System.out.println("Found timer field: " + field.name);
                break;
            }
        }

        if (hasTimerField) {
            for (MethodNode method : cn.methods) {
                if ("<init>".equals(method.name)) {
                    System.out.println("Patching constructor: " + method.name + method.desc);
                    InsnList inject = new InsnList();
                    inject.add(new VarInsnNode(Opcodes.ALOAD, 0));
                    inject.add(new TypeInsnNode(Opcodes.NEW, "ru/destra/util/CooldownTimer"));
                    inject.add(new InsnNode(Opcodes.DUP));
                    inject.add(new MethodInsnNode(Opcodes.INVOKESPECIAL, "ru/destra/util/CooldownTimer", "<init>", "()V", false));
                    inject.add(new FieldInsnNode(Opcodes.PUTFIELD, cn.name, "timer", timerDesc));

                    AbstractInsnNode lastPut = null;
                    for (AbstractInsnNode insn : method.instructions) {
                        if (insn.getOpcode() == Opcodes.PUTFIELD) {
                            lastPut = insn;
                        }
                    }
                    if (lastPut != null) {
                        method.instructions.insert(lastPut, inject);
                    } else {
                        method.instructions.insert(inject);
                    }
                    System.out.println("Injected timer initialization in constructor");
                }
                }
            }
        }

        ClassWriter cw = new ClassWriter(0);
        cn.accept(cw);
        byte[] result = cw.toByteArray();
        Files.write(classFile, result, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE);
        System.out.println("Patched: " + data.length + " -> " + result.length + " bytes");
    }
}
