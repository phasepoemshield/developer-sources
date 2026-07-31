import java.io.*;
import java.nio.file.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;

/**
 * Patches ClickGuiColorState constructor to initialize AnimatedColor fields.
 * Source: new AnimatedColor(250L, color) for each field.
 */
public final class PatchClickGuiColorState {
    public static void main(String[] args) throws Exception {
        if (args.length < 1) { System.err.println("Usage: PatchClickGuiColorState <classfile>"); System.exit(1); }
        byte[] data = Files.readAllBytes(Path.of(args[0]));
        ClassNode cn = new ClassNode();
        new ClassReader(data).accept(cn, 0);

        for (MethodNode mn : cn.methods) {
            if (!mn.name.equals("<init>")) continue;

            // Only patch if empty (just aload_0 + invokespecial + return)
            if (mn.instructions.size() > 5) {
                System.err.println("Constructor already has code, skipping");
                break;
            }

            System.err.println("Patching <init> in " + cn.name);
            mn.maxStack = 4;
            mn.maxLocals = 1;

            // Remove the old simple constructor body
            mn.instructions.clear();

            InsnList il = new InsnList();

            // aload_0
            il.add(new VarInsnNode(Opcodes.ALOAD, 0));
            // invokespecial Object.<init>
            il.add(new MethodInsnNode(Opcodes.INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false));

            // this.accentColor = new AnimatedColor(250L, 0xFF3A3AFF)
            // ColorUtil.packARGB(255, 58, 58, 255) = 0xFF3A3AFF = -13036801
            int accentColor = (255 << 24) | (58 << 16) | (58 << 8) | 255;
            emitNewAnimatedColor(il, 0, "accentColor", 250L, accentColor);

            // this.textColor = new AnimatedColor(250L, -1)
            emitNewAnimatedColor(il, 0, "textColor", 250L, -1);

            // this.backgroundColor = new AnimatedColor(250L, -1)
            emitNewAnimatedColor(il, 0, "backgroundColor", 250L, -1);

            // this.borderColor = new AnimatedColor(250L, -1)
            emitNewAnimatedColor(il, 0, "borderColor", 250L, -1);

            // this.scrollOffset = 0.0F
            il.add(new VarInsnNode(Opcodes.ALOAD, 0));
            il.add(new InsnNode(Opcodes.FCONST_0));
            il.add(new FieldInsnNode(Opcodes.PUTFIELD, "ru/destra/gui/ClickGuiColorState", "scrollOffset", "F"));

            // this.targetScrollOffset = 0.0F
            il.add(new VarInsnNode(Opcodes.ALOAD, 0));
            il.add(new InsnNode(Opcodes.FCONST_0));
            il.add(new FieldInsnNode(Opcodes.PUTFIELD, "ru/destra/gui/ClickGuiColorState", "targetScrollOffset", "F"));

            // return
            il.add(new InsnNode(Opcodes.RETURN));

            mn.instructions = il;
            break;
        }

        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS);
        cn.accept(cw);
        byte[] out = cw.toByteArray();
        Files.write(Path.of(args[0]), out);
        System.err.println("Written " + out.length + " bytes");
    }

    static void emitNewAnimatedColor(InsnList il, int localVar, String fieldName, long duration, int color) {
        // this
        il.add(new VarInsnNode(Opcodes.ALOAD, localVar));
        // new AnimatedColor
        il.add(new TypeInsnNode(Opcodes.NEW, "ru/destra/animation/AnimatedColor"));
        il.add(new InsnNode(Opcodes.DUP));
        // duration
        il.add(new LdcInsnNode(duration));
        // color
        il.add(new LdcInsnNode(color));
        // AnimatedColor.<init>(long, int)
        il.add(new MethodInsnNode(Opcodes.INVOKESPECIAL, "ru/destra/animation/AnimatedColor", "<init>", "(JI)V", false));
        // putfield
        il.add(new FieldInsnNode(Opcodes.PUTFIELD, "ru/destra/gui/ClickGuiColorState", fieldName, "Lru/destra/animation/AnimatedColor;"));
    }
}
