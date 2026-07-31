import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;

public final class PatchAnimationTimers {
    static final String COOLDOWN_TIMER = "ru/destra/util/CooldownTimer";
    static final String COOLDOWN_TIMER_DESC = "Lru/destra/util/CooldownTimer;";

    public static void main(String[] args) throws Exception {
        patchClass(".precompiled/ru/destra/animation/AccelerateAnimation.class");
        patchClass(".precompiled/ru/destra/animation/DirectionalAnimation.class");
    }

    static void patchClass(String path) throws Exception {
        byte[] data = Files.readAllBytes(Path.of(path));
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, ClassReader.EXPAND_FRAMES);

        String timerFieldName = null;
        for (FieldNode f : cn.fields) {
            if (COOLDOWN_TIMER_DESC.equals(f.desc)) {
                timerFieldName = f.name;
                System.out.println(cn.name + ": found CooldownTimer field: " + timerFieldName);
                break;
            }
        }
        if (timerFieldName == null) {
            System.out.println(cn.name + ": no CooldownTimer field found, skipping");
            return;
        }

        boolean patched = false;
        for (MethodNode m : cn.methods) {
            if (m.name.equals("<init>") && (m.desc.equals("(ID)V") || m.desc.equals("(IDLru/destra/util/Direction;)V"))) {
                boolean alreadyPatched = false;
                for (AbstractInsnNode insn : m.instructions) {
                    if (insn instanceof TypeInsnNode && insn.getOpcode() == Opcodes.NEW) {
                        TypeInsnNode tn = (TypeInsnNode) insn;
                        if (COOLDOWN_TIMER.equals(tn.desc)) {
                            alreadyPatched = true;
                            break;
                        }
                    }
                }
                if (alreadyPatched) {
                    System.out.println("  Constructor " + m.name + m.desc + " already patched, skipping");
                    continue;
                }

                System.out.println("  Patching constructor " + m.name + m.desc);

                AbstractInsnNode ret = null;
                for (AbstractInsnNode insn : m.instructions) {
                    if (insn.getOpcode() == Opcodes.RETURN) {
                        ret = insn;
                        break;
                    }
                }
                if (ret == null) continue;

                InsnList inject = new InsnList();
                inject.add(new VarInsnNode(Opcodes.ALOAD, 0));
                inject.add(new TypeInsnNode(Opcodes.NEW, COOLDOWN_TIMER));
                inject.add(new InsnNode(Opcodes.DUP));
                inject.add(new MethodInsnNode(Opcodes.INVOKESPECIAL, COOLDOWN_TIMER, "<init>", "()V", false));
                inject.add(new FieldInsnNode(Opcodes.PUTFIELD, cn.name, timerFieldName, COOLDOWN_TIMER_DESC));

                m.instructions.insertBefore(ret, inject);
                patched = true;
            }
        }

        if (!patched) {
            System.out.println(cn.name + ": no constructors patched");
            return;
        }

        ClassWriter cw = new ClassWriter(0);
        cn.accept(cw);
        byte[] result = cw.toByteArray();
        FileOutputStream fos = new FileOutputStream(path);
        fos.write(result);
        fos.flush();
        fos.getFD().sync();
        fos.close();
        System.out.println("Written " + result.length + " bytes to " + path);
    }
}
