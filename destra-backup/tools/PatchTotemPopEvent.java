import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.nio.file.*;
import java.util.*;

public final class PatchTotemPopEvent {
    public static void main(String[] args) throws Exception {
        Path classFile = Path.of(".precompiled/sg/mx/ClientPlayNetworkHandlerMixin.class");
        byte[] data = Files.readAllBytes(classFile);
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        boolean patched = false;
        for (MethodNode m : cn.methods) {
            if (!m.name.equals("onAfterTotemSound")) continue;
            if (hasPlayerCheckPost(m)) {
                System.err.println("  onAfterTotemSound: PlayerCheckEvent already posted");
                continue;
            }

            AbstractInsnNode postOverlay = null;
            for (AbstractInsnNode insn : m.instructions) {
                if (insn instanceof MethodInsnNode) {
                    MethodInsnNode min = (MethodInsnNode) insn;
                    if (min.getOpcode() == Opcodes.INVOKEVIRTUAL
                            && min.name.equals("post")
                            && min.owner.equals("com/google/common/eventbus/EventBus")) {
                        postOverlay = insn;
                        break;
                    }
                }
            }
            if (postOverlay == null) {
                System.err.println("  onAfterTotemSound: OverlayRenderEvent.post not found");
                continue;
            }

            AbstractInsnNode insertPoint = postOverlay.getNext();

            InsnList inject = new InsnList();
            LabelNode elseLabel = new LabelNode();

            inject.add(new VarInsnNode(Opcodes.ALOAD, 4));
            inject.add(new TypeInsnNode(Opcodes.INSTANCEOF, "net/minecraft/entity/player/PlayerEntity"));
            inject.add(new JumpInsnNode(Opcodes.IFEQ, elseLabel));

            inject.add(new MethodInsnNode(Opcodes.INVOKESTATIC, "ru/destra/core/DestraClient", "getInstance", "()Lru/destra/core/DestraClient;", false));
            inject.add(new MethodInsnNode(Opcodes.INVOKEVIRTUAL, "ru/destra/core/DestraClient", "getEventBus", "()Lcom/google/common/eventbus/EventBus;", false));
            inject.add(new TypeInsnNode(Opcodes.NEW, "ru/destra/event/PlayerCheckEvent"));
            inject.add(new InsnNode(Opcodes.DUP));
            inject.add(new VarInsnNode(Opcodes.ALOAD, 4));
            inject.add(new TypeInsnNode(Opcodes.CHECKCAST, "net/minecraft/entity/player/PlayerEntity"));
            inject.add(new MethodInsnNode(Opcodes.INVOKESPECIAL, "ru/destra/event/PlayerCheckEvent", "<init>", "(Lnet/minecraft/entity/player/PlayerEntity;)V", false));
            inject.add(new MethodInsnNode(Opcodes.INVOKEVIRTUAL, "com/google/common/eventbus/EventBus", "post", "(Ljava/lang/Object;)V", false));

            inject.add(elseLabel);

            m.instructions.insert(insertPoint, inject);
            patched = true;
            System.err.println("  onAfterTotemSound: injected PlayerCheckEvent post");
        }

        if (patched) {
            ClassWriter cw = new ClassWriter(0);
            cn.accept(cw);
            Files.write(classFile, cw.toByteArray());
            System.err.println("PatchTotemPopEvent: patched ClientPlayNetworkHandlerMixin");
        } else {
            System.err.println("PatchTotemPopEvent: no changes");
        }
    }

    static boolean hasPlayerCheckPost(MethodNode m) {
        for (AbstractInsnNode insn : m.instructions) {
            if (insn instanceof MethodInsnNode) {
                MethodInsnNode min = (MethodInsnNode) insn;
                if (min.name.equals("post") && min.owner.equals("com/google/common/eventbus/EventBus")) {
                    for (AbstractInsnNode prev = insn.getPrevious(); prev != null; prev = prev.getPrevious()) {
                        if (prev instanceof TypeInsnNode) {
                            TypeInsnNode tin = (TypeInsnNode) prev;
                            if (tin.getOpcode() == Opcodes.NEW && tin.desc.equals("ru/destra/event/PlayerCheckEvent")) {
                                return true;
                            }
                        }
                        if (prev instanceof MethodInsnNode && ((MethodInsnNode)prev).name.equals("post")) break;
                    }
                }
            }
        }
        return false;
    }
}
