import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.nio.file.*;
import java.util.*;

public final class PatchAnimationStubs {
    public static void main(String[] args) throws Exception {
        patchDirectionalAnimation();
        patchAccelerateAnimation();
        patchDecelerateAnimation();
    }

    static final String TIMED_ANIM = "ru/destra/animation/TimedAnimation";

    static void patchDirectionalAnimation() throws Exception {
        String path = ".precompiled/ru/destra/animation/DirectionalAnimation.class";
        byte[] data = Files.readAllBytes(Path.of(path));
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        for (MethodNode m : cn.methods) {
            if (m.desc.equals("()D") && !m.name.equals("<init>") && !m.name.equals("<clinit>")) {
                m.instructions.clear();
                m.instructions.add(new VarInsnNode(Opcodes.ALOAD, 0));
                m.instructions.add(new MethodInsnNode(Opcodes.INVOKESPECIAL, TIMED_ANIM, "getValue", "()D", false));
                m.instructions.add(new InsnNode(Opcodes.DRETURN));
                System.out.println("  Redirected " + escape(m.name) + "()D -> super.getValue()");
            } else if (m.desc.equals("()Z") && !m.name.equals("<init>") && !m.name.equals("<clinit>")) {
                m.instructions.clear();
                m.instructions.add(new VarInsnNode(Opcodes.ALOAD, 0));
                m.instructions.add(new MethodInsnNode(Opcodes.INVOKESPECIAL, TIMED_ANIM, "isFinished", "()Z", false));
                m.instructions.add(new InsnNode(Opcodes.IRETURN));
                System.out.println("  Redirected " + escape(m.name) + "()Z -> super.isFinished()");
            } else if (m.desc.equals("(Lru/destra/util/Direction;)V")) {
                m.instructions.clear();
                m.instructions.add(new VarInsnNode(Opcodes.ALOAD, 0));
                m.instructions.add(new VarInsnNode(Opcodes.ALOAD, 1));
                m.instructions.add(new MethodInsnNode(Opcodes.INVOKESPECIAL, TIMED_ANIM, "setDirection", "(Lru/destra/util/Direction;)V", false));
                m.instructions.add(new InsnNode(Opcodes.RETURN));
                System.out.println("  Redirected " + escape(m.name) + "(Direction)V -> super.setDirection()");
            } else if (m.desc.equals("(Lru/destra/util/Direction;)Z")) {
                m.instructions.clear();
                m.instructions.add(new VarInsnNode(Opcodes.ALOAD, 0));
                m.instructions.add(new VarInsnNode(Opcodes.ALOAD, 1));
                m.instructions.add(new MethodInsnNode(Opcodes.INVOKESPECIAL, TIMED_ANIM, "isFinishedInDirection", "(Lru/destra/util/Direction;)Z", false));
                m.instructions.add(new InsnNode(Opcodes.IRETURN));
                System.out.println("  Redirected " + escape(m.name) + "(Direction)Z -> super.isFinishedInDirection()");
            }
        }

        for (MethodNode m : cn.methods) {
            if (m.name.equals("<init>")) {
                AbstractInsnNode lastSuper = null;
                for (AbstractInsnNode insn : m.instructions) {
                    if (insn instanceof MethodInsnNode && insn.getOpcode() == Opcodes.INVOKESPECIAL) {
                        MethodInsnNode min = (MethodInsnNode) insn;
                        if (min.owner.equals(TIMED_ANIM) && min.name.equals("<init>")) {
                            lastSuper = insn;
                        }
                    }
                }
                if (lastSuper != null) {
                    InsnList inject = new InsnList();
                    inject.add(new VarInsnNode(Opcodes.ALOAD, 0));
                    inject.add(new VarInsnNode(Opcodes.ILOAD, 1));
                    inject.add(new FieldInsnNode(Opcodes.PUTFIELD, cn.name, "duration", "I"));
                    m.instructions.insert(lastSuper, inject);
                    System.out.println("  Injected this.duration = arg1 in DirectionalAnimation.<init>");
                }
            }
        }

        writeClass(cn, path);
        System.out.println("  DirectionalAnimation: done");
    }

    static void patchAccelerateAnimation() throws Exception {
        String path = ".precompiled/ru/destra/animation/AccelerateAnimation.class";
        byte[] data = Files.readAllBytes(Path.of(path));
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        String durationField = null;
        for (FieldNode f : cn.fields) {
            if ("I".equals(f.desc) && (f.access & Opcodes.ACC_STATIC) == 0) {
                durationField = f.name;
                System.out.println("  Found duration-like int field: " + escape(f.name));
                break;
            }
        }

        for (MethodNode m : cn.methods) {
            if (m.desc.equals("()D") && !m.name.equals("<init>") && !m.name.equals("<clinit>")) {
                m.instructions.clear();
                m.instructions.add(new VarInsnNode(Opcodes.ALOAD, 0));
                m.instructions.add(new MethodInsnNode(Opcodes.INVOKESPECIAL, TIMED_ANIM, "getValue", "()D", false));
                m.instructions.add(new InsnNode(Opcodes.DRETURN));
                System.out.println("  Redirected " + escape(m.name) + "()D -> super.getValue()");
            } else if (m.desc.equals("()Z") && !m.name.equals("<init>") && !m.name.equals("<clinit>")) {
                m.instructions.clear();
                m.instructions.add(new VarInsnNode(Opcodes.ALOAD, 0));
                m.instructions.add(new MethodInsnNode(Opcodes.INVOKESPECIAL, TIMED_ANIM, "isFinished", "()Z", false));
                m.instructions.add(new InsnNode(Opcodes.IRETURN));
                System.out.println("  Redirected " + escape(m.name) + "()Z -> super.isFinished()");
            } else if (m.desc.equals("(Lru/destra/util/Direction;)V")) {
                m.instructions.clear();
                m.instructions.add(new VarInsnNode(Opcodes.ALOAD, 0));
                m.instructions.add(new VarInsnNode(Opcodes.ALOAD, 1));
                m.instructions.add(new MethodInsnNode(Opcodes.INVOKESPECIAL, TIMED_ANIM, "setDirection", "(Lru/destra/util/Direction;)V", false));
                m.instructions.add(new InsnNode(Opcodes.RETURN));
                System.out.println("  Redirected " + escape(m.name) + "(Direction)V -> super.setDirection()");
            } else if (m.desc.equals("(Lru/destra/util/Direction;)Z")) {
                m.instructions.clear();
                m.instructions.add(new VarInsnNode(Opcodes.ALOAD, 0));
                m.instructions.add(new VarInsnNode(Opcodes.ALOAD, 1));
                m.instructions.add(new MethodInsnNode(Opcodes.INVOKESPECIAL, TIMED_ANIM, "isFinishedInDirection", "(Lru/destra/util/Direction;)Z", false));
                m.instructions.add(new InsnNode(Opcodes.IRETURN));
                System.out.println("  Redirected " + escape(m.name) + "(Direction)Z -> super.isFinishedInDirection()");
            }
        }

        for (MethodNode m : cn.methods) {
            if (m.name.equals("<init>") && durationField != null) {
                AbstractInsnNode lastSuper = null;
                for (AbstractInsnNode insn : m.instructions) {
                    if (insn instanceof MethodInsnNode && insn.getOpcode() == Opcodes.INVOKESPECIAL) {
                        MethodInsnNode min = (MethodInsnNode) insn;
                        if (min.owner.equals(TIMED_ANIM) && min.name.equals("<init>")) {
                            lastSuper = insn;
                        }
                    }
                }
                if (lastSuper != null) {
                    InsnList inject = new InsnList();
                    inject.add(new VarInsnNode(Opcodes.ALOAD, 0));
                    inject.add(new VarInsnNode(Opcodes.ALOAD, 0));
                    inject.add(new FieldInsnNode(Opcodes.GETFIELD, TIMED_ANIM, "durationMs", "I"));
                    inject.add(new FieldInsnNode(Opcodes.PUTFIELD, cn.name, durationField, "I"));
                    m.instructions.insert(lastSuper, inject);
                    System.out.println("  Injected this." + escape(durationField) + " = super.durationMs in <init>");
                }
            }
        }

        boolean hasApplyEasing = false;
        for (MethodNode m : cn.methods) {
            if (m.name.equals("applyEasing") && m.desc.equals("(D)D")) {
                hasApplyEasing = true;
                break;
            }
        }
        if (!hasApplyEasing) {
            MethodNode applyEasing = new MethodNode(Opcodes.ACC_PROTECTED, "applyEasing", "(D)D", null, null);
            applyEasing.instructions.add(new VarInsnNode(Opcodes.ALOAD, 0));
            applyEasing.instructions.add(new VarInsnNode(Opcodes.DLOAD, 1));
            applyEasing.instructions.add(new MethodInsnNode(Opcodes.INVOKESPECIAL, cn.name, "computeEasing", "(D)D", false));
            applyEasing.instructions.add(new InsnNode(Opcodes.DRETURN));
            cn.methods.add(applyEasing);
            System.out.println("  Added applyEasing(D)D -> computeEasing(D)D");
        }

        writeClass(cn, path);
        System.out.println("  AccelerateAnimation: done");
    }

    static void patchDecelerateAnimation() throws Exception {
        String path = ".precompiled/ru/destra/animation/DecelerateAnimation.class";
        byte[] data = Files.readAllBytes(Path.of(path));
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        String computeMethod = null;
        for (MethodNode m : cn.methods) {
            if (m.desc.equals("(D)D") && !m.name.equals("<init>") && !m.name.equals("<clinit>")) {
                computeMethod = m.name;
                System.out.println("  Found computeEasedValue-like method: " + escape(m.name));
                break;
            }
        }

        String durationField = null;
        for (FieldNode f : cn.fields) {
            if ("I".equals(f.desc) && (f.access & Opcodes.ACC_STATIC) == 0) {
                durationField = f.name;
                System.out.println("  Found duration-like int field: " + escape(f.name));
                break;
            }
        }

        for (MethodNode m : cn.methods) {
            if (m.name.equals("<init>") && durationField != null) {
                AbstractInsnNode lastSuper = null;
                for (AbstractInsnNode insn : m.instructions) {
                    if (insn instanceof MethodInsnNode && insn.getOpcode() == Opcodes.INVOKESPECIAL) {
                        MethodInsnNode min = (MethodInsnNode) insn;
                        if (min.owner.equals(TIMED_ANIM) && min.name.equals("<init>")) {
                            lastSuper = insn;
                        }
                    }
                }
                if (lastSuper != null) {
                    InsnList inject = new InsnList();
                    inject.add(new VarInsnNode(Opcodes.ALOAD, 0));
                    inject.add(new VarInsnNode(Opcodes.ALOAD, 0));
                    inject.add(new FieldInsnNode(Opcodes.GETFIELD, TIMED_ANIM, "durationMs", "I"));
                    inject.add(new FieldInsnNode(Opcodes.PUTFIELD, cn.name, durationField, "I"));
                    m.instructions.insert(lastSuper, inject);
                    System.out.println("  Injected this." + escape(durationField) + " = super.durationMs in <init>");
                }
            }
        }

        boolean hasApplyEasing = false;
        for (MethodNode m : cn.methods) {
            if (m.name.equals("applyEasing") && m.desc.equals("(D)D")) {
                hasApplyEasing = true;
                break;
            }
        }

        if (!hasApplyEasing && computeMethod != null) {
            MethodNode applyEasing = new MethodNode(Opcodes.ACC_PROTECTED, "applyEasing", "(D)D", null, null);
            applyEasing.instructions.add(new VarInsnNode(Opcodes.ALOAD, 0));
            applyEasing.instructions.add(new VarInsnNode(Opcodes.DLOAD, 1));
            applyEasing.instructions.add(new MethodInsnNode(Opcodes.INVOKESPECIAL, cn.name, computeMethod, "(D)D", false));
            applyEasing.instructions.add(new InsnNode(Opcodes.DRETURN));
            cn.methods.add(applyEasing);
            System.out.println("  Added applyEasing(D)D -> " + escape(computeMethod) + "(D)D");
        } else if (hasApplyEasing) {
            System.out.println("  DecelerateAnimation: applyEasing already exists");
        }

        boolean hasUsesBackwardsDecay = false;
        for (MethodNode m : cn.methods) {
            if (m.name.equals("usesBackwardsDecay") && m.desc.equals("()Z")) {
                hasUsesBackwardsDecay = true;
                break;
            }
        }

        if (!hasUsesBackwardsDecay) {
            String reversedMethod = null;
            for (MethodNode m : cn.methods) {
                if (m.desc.equals("()Z") && !m.name.equals("<init>") && !m.name.equals("<clinit>")) {
                    reversedMethod = m.name;
                    break;
                }
            }
            if (reversedMethod != null) {
                MethodNode usesBackwardsDecay = new MethodNode(Opcodes.ACC_PROTECTED, "usesBackwardsDecay", "()Z", null, null);
                usesBackwardsDecay.instructions.add(new VarInsnNode(Opcodes.ALOAD, 0));
                usesBackwardsDecay.instructions.add(new MethodInsnNode(Opcodes.INVOKESPECIAL, cn.name, reversedMethod, "()Z", false));
                usesBackwardsDecay.instructions.add(new InsnNode(Opcodes.IRETURN));
                cn.methods.add(usesBackwardsDecay);
                System.out.println("  Added usesBackwardsDecay()Z -> " + escape(reversedMethod) + "()Z");
            }
        }

        writeClass(cn, path);
        System.out.println("  DecelerateAnimation: done");
    }

    static void writeClass(ClassNode cn, String path) throws Exception {
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        cn.accept(cw);
        byte[] result = cw.toByteArray();
        Path tmp = Path.of(path + ".tmp");
        Files.write(tmp, result);
        Files.delete(Path.of(path));
        Files.move(tmp, Path.of(path));
        System.out.println("Written " + result.length + " bytes to " + path);
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
