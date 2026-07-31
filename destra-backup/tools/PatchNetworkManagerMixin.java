import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;

public final class PatchNetworkManagerMixin {
    static final String NMM = "sg/mx/NetworkManagerMixin";
    static final String PACKET = "net/minecraft/network/packet/Packet";
    static final String CALLBACKS = "net/minecraft/class_7648";
    static final String CI = "org/spongepowered/asm/mixin/injection/callback/CallbackInfo";

    public static void main(String[] args) throws Exception {
        Path classFile = Path.of(".precompiled/sg/mx/NetworkManagerMixin.class");
        byte[] data = Files.readAllBytes(classFile);
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        String oldDesc = "(L" + PACKET + ";L" + CI + ";)V";
        String newDesc = "(L" + PACKET + ";L" + CALLBACKS + ";ZL" + CI + ";)V";

        MethodNode send = null;
        for (MethodNode m : cn.methods) {
            if ("send".equals(m.name) && oldDesc.equals(m.desc)) { send = m; break; }
        }
        if (send == null) {
            System.out.println("send(Packet,CallbackInfo) not found - already patched?");
            return;
        }

        // Current body uses aload_0 (this), aload_1 (packet), aload_2 (ci). After adding 2 params
        // (callbacks=2, bool=3), ci shifts to var 4. Rewrite: aload_0, aload_1 (packet), aload_4 (ci).
        InsnList il = new InsnList();
        il.add(new VarInsnNode(Opcodes.ALOAD, 0));
        il.add(new MethodInsnNode(Opcodes.INVOKEVIRTUAL, "net/minecraft/class_2535", "isOpen", "()Z", false));
        LabelNode elseLabel = new LabelNode();
        il.add(new JumpInsnNode(Opcodes.IFEQ, elseLabel));
        // new PacketEvent(packet, Send)
        il.add(new TypeInsnNode(Opcodes.NEW, "ru/destra/event/PacketEvent"));
        il.add(new InsnNode(Opcodes.DUP));
        il.add(new VarInsnNode(Opcodes.ALOAD, 1));
        il.add(new FieldInsnNode(Opcodes.GETSTATIC, "ru/destra/event/PacketDirection", "Send", "Lru/destra/event/PacketDirection;"));
        il.add(new MethodInsnNode(Opcodes.INVOKESPECIAL, "ru/destra/event/PacketEvent", "<init>", "(L" + PACKET + ";Lru/destra/event/PacketDirection;)V", false));
        il.add(new VarInsnNode(Opcodes.ASTORE, 5));
        // DestraClient.getInstance().getEventBus().post(event)
        il.add(new MethodInsnNode(Opcodes.INVOKESTATIC, "ru/destra/core/DestraClient", "getInstance", "()Lru/destra/core/DestraClient;", false));
        il.add(new MethodInsnNode(Opcodes.INVOKEVIRTUAL, "ru/destra/core/DestraClient", "getEventBus", "()Lcom/google/common/eventbus/EventBus;", false));
        il.add(new VarInsnNode(Opcodes.ALOAD, 5));
        il.add(new MethodInsnNode(Opcodes.INVOKEVIRTUAL, "com/google/common/eventbus/EventBus", "post", "(Ljava/lang/Object;)V", false));
        // if ModuleHelper.isEnabled(event) cancel
        il.add(new VarInsnNode(Opcodes.ALOAD, 5));
        il.add(new MethodInsnNode(Opcodes.INVOKESTATIC, "ru/destra/misc/ModuleHelper", "isEnabled", "(Ljava/lang/Object;)Z", false));
        il.add(new JumpInsnNode(Opcodes.IFEQ, elseLabel));
        il.add(new VarInsnNode(Opcodes.ALOAD, 4));
        il.add(new MethodInsnNode(Opcodes.INVOKEVIRTUAL, CI, "cancel", "()V", false));
        il.add(elseLabel);
        il.add(new InsnNode(Opcodes.RETURN));

        send.instructions = il;
        send.desc = newDesc;
        send.maxStack = 4;
        send.maxLocals = 6;

        ClassWriter cw = new ClassWriter(0);
        cn.accept(cw);
        byte[] out = cw.toByteArray();
        Files.write(classFile, out);
        Path bc = Path.of("build/classes/java/main/sg/mx/NetworkManagerMixin.class");
        if (Files.exists(bc)) Files.write(bc, out);
        System.out.println("Patched NetworkManagerMixin.send: " + oldDesc + " -> " + newDesc + " (" + out.length + " bytes)");
    }
}
