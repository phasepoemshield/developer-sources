import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.nio.file.*;

public final class PatchAnimationTimer {
    public static void main(String[] args) throws Exception {
        for (String path : args) {
            patchFile(path);
        }
    }

    private static void patchFile(String path) throws Exception {
        Path classFile = Path.of(path);
        byte[] data = Files.readAllBytes(classFile);
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        String timerDesc = "Lru/destra/util/CooldownTimer;";
        String timerFieldName = null;
        for (FieldNode field : cn.fields) {
            if (timerDesc.equals(field.desc) && (field.access & Opcodes.ACC_STATIC) == 0) {
                timerFieldName = field.name;
                System.out.println(cn.name + ": found timer field: " + timerFieldName);
                break;
            }
        }

        if (timerFieldName == null) {
            System.out.println(cn.name + ": no timer field found, skipping");
            return;
        }

        for (MethodNode method : cn.methods) {
            if ("<init>".equals(method.name)) {
                boolean alreadyHasTimerInit = false;
                for (AbstractInsnNode insn : method.instructions) {
                    if (insn instanceof FieldInsnNode fin
                            && fin.getOpcode() == Opcodes.PUTFIELD
                            && fin.name.equals(timerFieldName)
                            && fin.desc.equals(timerDesc)) {
                        alreadyHasTimerInit = true;
                        break;
                    }
                }
                if (alreadyHasTimerInit) {
                    System.out.println(cn.name + ": constructor " + method.desc + " already has timer init, skipping");
                    continue;
                }
                System.out.println(cn.name + ": patching constructor " + method.desc);
                InsnList inject = new InsnList();
                inject.add(new VarInsnNode(Opcodes.ALOAD, 0));
                inject.add(new TypeInsnNode(Opcodes.NEW, "ru/destra/util/CooldownTimer"));
                inject.add(new InsnNode(Opcodes.DUP));
                inject.add(new MethodInsnNode(Opcodes.INVOKESPECIAL, "ru/destra/util/CooldownTimer", "<init>", "()V", false));
                inject.add(new FieldInsnNode(Opcodes.PUTFIELD, cn.name, timerFieldName, timerDesc));

                AbstractInsnNode lastCall = null;
                for (AbstractInsnNode insn : method.instructions) {
                    if (insn.getOpcode() == Opcodes.INVOKESPECIAL) {
                        lastCall = insn;
                    }
                }
                if (lastCall != null) {
                    method.instructions.insert(lastCall, inject);
                } else {
                    method.instructions.insert(inject);
                }
                System.out.println(cn.name + ": injected timer init after super() call");
            }
        }

        ClassWriter cw = new ClassWriter(0);
        cn.accept(cw);
        byte[] result = cw.toByteArray();
        Path tempFile = Path.of(path + ".tmp");
        Files.write(tempFile, result);
        Files.delete(classFile);
        Files.move(tempFile, classFile);
        System.out.println(cn.name + ": patched " + data.length + " -> " + result.length + " bytes");
    }
}
