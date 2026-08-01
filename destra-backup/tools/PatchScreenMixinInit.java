import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;

public final class PatchScreenMixinInit {
    static final String CHE = String.valueOf((char) 0x0427);
    static final String SCREEN = "net/minecraft/client/gui/screen/Screen";
    static final String MC = "net/minecraft/client/MinecraftClient";
    static final String WINDOW = "net/minecraft/client/util/Window";
    static final String CI = "org/spongepowered/asm/mixin/injection/callback/CallbackInfo";
    static final String SAM = "ru/destra/gui/ScreenAnimationManager";
    static final String MAIN_MENU = "ru/destra/gui/MainMenuScreen";
    static final String ACCOUNT_MENU = "ru/destra/gui/AccountMenuScreen";
    static final String CLICK_GUI = "ru/destra/gui/ClickGuiScreen";

    public static void main(String[] args) throws Exception {
        Path classFile = Path.of(".precompiled/sg/mx/ScreenMixin.class");
        byte[] data = Files.readAllBytes(classFile);
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        String oldDesc = "(L" + MC + ";IIL" + CI + ";)V";
        String newDesc = "(L" + CI + ";)V";

        MethodNode check = null;
        for (MethodNode m : cn.methods) {
            if ("check".equals(m.name) && oldDesc.equals(m.desc)) { check = m; break; }
        }
        if (check == null) {
            System.out.println("check(MinecraftClient,int,int,CallbackInfo) not found - already patched?");
            return;
        }

        InsnList il = new InsnList();
        il.add(new VarInsnNode(Opcodes.ALOAD, 0));
        il.add(new TypeInsnNode(Opcodes.CHECKCAST, SCREEN));
        il.add(new VarInsnNode(Opcodes.ASTORE, 1));
        il.add(new MethodInsnNode(Opcodes.INVOKESTATIC, MC, "getInstance", "()L" + MC + ";", false));
        il.add(new VarInsnNode(Opcodes.ASTORE, 2));
        il.add(new VarInsnNode(Opcodes.ALOAD, 2));
        il.add(new MethodInsnNode(Opcodes.INVOKEVIRTUAL, MC, "getWindow", "()L" + WINDOW + ";", false));
        il.add(new MethodInsnNode(Opcodes.INVOKEVIRTUAL, WINDOW, "getScaledWidth", "()I", false));
        il.add(new VarInsnNode(Opcodes.ISTORE, 3));
        il.add(new VarInsnNode(Opcodes.ALOAD, 2));
        il.add(new MethodInsnNode(Opcodes.INVOKEVIRTUAL, MC, "getWindow", "()L" + WINDOW + ";", false));
        il.add(new MethodInsnNode(Opcodes.INVOKEVIRTUAL, WINDOW, "getScaledHeight", "()I", false));
        il.add(new VarInsnNode(Opcodes.ISTORE, 4));
        il.add(new VarInsnNode(Opcodes.ALOAD, 1));
        il.add(new MethodInsnNode(Opcodes.INVOKESTATIC, SAM, CHE, "(L" + SCREEN + ";)V", false));

        il.add(new VarInsnNode(Opcodes.ALOAD, 1));
        il.add(new TypeInsnNode(Opcodes.INSTANCEOF, MAIN_MENU));
        LabelNode s1 = new LabelNode();
        il.add(new JumpInsnNode(Opcodes.IFEQ, s1));
        il.add(new VarInsnNode(Opcodes.ALOAD, 1));
        il.add(new TypeInsnNode(Opcodes.CHECKCAST, MAIN_MENU));
        il.add(new VarInsnNode(Opcodes.ALOAD, 2));
        il.add(new VarInsnNode(Opcodes.ILOAD, 3));
        il.add(new VarInsnNode(Opcodes.ILOAD, 4));
        il.add(new MethodInsnNode(Opcodes.INVOKEVIRTUAL, MAIN_MENU, "initialize", "(L" + MC + ";II)V", false));
        il.add(s1);

        il.add(new VarInsnNode(Opcodes.ALOAD, 1));
        il.add(new TypeInsnNode(Opcodes.INSTANCEOF, ACCOUNT_MENU));
        LabelNode s2 = new LabelNode();
        il.add(new JumpInsnNode(Opcodes.IFEQ, s2));
        il.add(new VarInsnNode(Opcodes.ALOAD, 1));
        il.add(new TypeInsnNode(Opcodes.CHECKCAST, ACCOUNT_MENU));
        il.add(new VarInsnNode(Opcodes.ALOAD, 2));
        il.add(new VarInsnNode(Opcodes.ILOAD, 3));
        il.add(new VarInsnNode(Opcodes.ILOAD, 4));
        il.add(new MethodInsnNode(Opcodes.INVOKEVIRTUAL, ACCOUNT_MENU, "initialize", "(L" + MC + ";II)V", false));
        il.add(s2);

        il.add(new VarInsnNode(Opcodes.ALOAD, 1));
        il.add(new TypeInsnNode(Opcodes.INSTANCEOF, CLICK_GUI));
        LabelNode s3 = new LabelNode();
        il.add(new JumpInsnNode(Opcodes.IFEQ, s3));
        il.add(new VarInsnNode(Opcodes.ALOAD, 1));
        il.add(new TypeInsnNode(Opcodes.CHECKCAST, CLICK_GUI));
        il.add(new VarInsnNode(Opcodes.ALOAD, 2));
        il.add(new VarInsnNode(Opcodes.ILOAD, 3));
        il.add(new VarInsnNode(Opcodes.ILOAD, 4));
        il.add(new MethodInsnNode(Opcodes.INVOKEVIRTUAL, CLICK_GUI, "initialize", "(L" + MC + ";II)V", false));
        il.add(s3);

        il.add(new InsnNode(Opcodes.RETURN));

        check.instructions = il;
        check.desc = newDesc;
        check.maxStack = 4;
        check.maxLocals = 5;

        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES) {
            @Override
            protected String getCommonSuperClass(String a, String b) { return "java/lang/Object"; }
        };
        cn.accept(cw);
        byte[] out = cw.toByteArray();
        Files.write(classFile, out);

        Path buildCopy = Path.of("build/classes/java/main/sg/mx/ScreenMixin.class");
        if (Files.exists(buildCopy)) Files.write(buildCopy, out);

        System.out.println("Patched ScreenMixin.check: " + oldDesc + " -> " + newDesc);
        System.out.println("Body uses MinecraftClient.getInstance().getWindow() scaled w/h; " + out.length + " bytes");
    }
}
