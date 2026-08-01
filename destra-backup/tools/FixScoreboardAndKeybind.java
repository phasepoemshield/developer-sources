import java.io.*;
import java.nio.file.*;
import java.util.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;

public final class FixScoreboardAndKeybind {
    public static void main(String[] args) throws Exception {
        patchScoreboardHudModule();
        patchKeybindElement();
    }

    private static void patchScoreboardHudModule() throws Exception {
        Path p = Path.of(".precompiled/ru/destra/module/ScoreboardHudModule.class");
        if (!Files.exists(p)) return;
        byte[] bytes = Files.readAllBytes(p);
        ClassReader cr = new ClassReader(bytes);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        for (MethodNode mn : cn.methods) {
            // 1. Fix onOverlayRender: replace OverlayRenderEvent.д:()V with Toggle.enable:()V
            if (mn.name.equals("onOverlayRender")) {
                for (AbstractInsnNode insn : mn.instructions) {
                    if (insn instanceof MethodInsnNode min) {
                        if (min.owner.contains("OverlayRenderEvent")) {
                            min.owner = "ru/destra/setting/Toggle";
                            min.name = "enable";
                            min.desc = "()V";
                            System.out.println("Patched ScoreboardHudModule.onOverlayRender -> Toggle.enable()");
                        }
                    }
                }
            }

            // 2. Fix Custom Font condition: invert ifne -> ifeq on useVanillaFontSetting.isEnabled()
            if (mn.name.equals("onRender2D") || mn.desc.contains("DrawContext")) {
                for (AbstractInsnNode insn : mn.instructions) {
                    if (insn instanceof JumpInsnNode jin) {
                        if (jin.getOpcode() == Opcodes.IFNE) {
                            AbstractInsnNode prev = jin.getPrevious();
                            if (prev instanceof MethodInsnNode min && min.name.equals("isEnabled")) {
                                jin.setOpcode(Opcodes.IFEQ);
                                System.out.println("Patched ScoreboardHudModule custom font boolean check (IFNE -> IFEQ)");
                            }
                        }
                    }
                }
            }

            // 3. Remove/bypass crashing getVertexConsumers().draw()
            for (AbstractInsnNode insn : mn.instructions.toArray()) {
                if (insn instanceof MethodInsnNode min) {
                    if (min.owner.contains("DrawContextAccessor") || min.name.equals("getVertexConsumers")) {
                        mn.instructions.set(min, new InsnNode(Opcodes.ACONST_NULL));
                        System.out.println("Bypassed getVertexConsumers call in ScoreboardHudModule." + mn.name);
                    }
                }
            }
        }

        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        cn.accept(cw);
        Files.write(p, cw.toByteArray());
        System.out.println("Updated ScoreboardHudModule.class");
    }

    private static void patchKeybindElement() throws Exception {
        Path p = Path.of(".precompiled/ru/destra/gui/KeybindElement.class");
        if (!Files.exists(p)) return;
        byte[] bytes = Files.readAllBytes(p);
        ClassReader cr = new ClassReader(bytes);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        for (MethodNode mn : cn.methods) {
            if (mn.name.equals("onMouseClick")) {
                InsnList il = new InsnList();
                LabelNode labelEnd = new LabelNode();
                LabelNode labelSetKey = new LabelNode();

                // if (this.listeningForKey) { if (button != 0) { setting.setValue(button); listeningForKey = false; return; } }
                il.add(new VarInsnNode(Opcodes.ALOAD, 0));
                il.add(new FieldInsnNode(Opcodes.GETFIELD, "ru/destra/gui/KeybindElement", "listeningForKey", "Z"));
                il.add(new JumpInsnNode(Opcodes.IFEQ, labelSetKey));

                il.add(new VarInsnNode(Opcodes.ILOAD, 5));
                il.add(new JumpInsnNode(Opcodes.IFEQ, labelEnd));

                il.add(new VarInsnNode(Opcodes.ALOAD, 0));
                il.add(new FieldInsnNode(Opcodes.GETFIELD, "ru/destra/gui/KeybindElement", "setting", "Lru/destra/setting/ValueSetting;"));
                il.add(new VarInsnNode(Opcodes.ILOAD, 5));
                il.add(new MethodInsnNode(Opcodes.INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false));
                il.add(new MethodInsnNode(Opcodes.INVOKEVIRTUAL, "ru/destra/setting/ValueSetting", "\u041b", "(Ljava/lang/Object;)V", false));

                il.add(new VarInsnNode(Opcodes.ALOAD, 0));
                il.add(new InsnNode(Opcodes.ICONST_0));
                il.add(new FieldInsnNode(Opcodes.PUTFIELD, "ru/destra/gui/KeybindElement", "listeningForKey", "Z"));
                il.add(new InsnNode(Opcodes.RETURN));

                il.add(labelSetKey);
                // if (button == 0 && isHovered((int)mouseX, (int)mouseY)) { this.listeningForKey = true; }
                il.add(new VarInsnNode(Opcodes.ILOAD, 5));
                il.add(new JumpInsnNode(Opcodes.IFNE, labelEnd));

                il.add(new VarInsnNode(Opcodes.ALOAD, 0));
                il.add(new VarInsnNode(Opcodes.DLOAD, 1));
                il.add(new InsnNode(Opcodes.D2I));
                il.add(new VarInsnNode(Opcodes.DLOAD, 3));
                il.add(new InsnNode(Opcodes.D2I));
                il.add(new MethodInsnNode(Opcodes.INVOKEVIRTUAL, "ru/destra/gui/KeybindElement", "isHovered", "(II)Z", false));
                il.add(new JumpInsnNode(Opcodes.IFEQ, labelEnd));

                il.add(new VarInsnNode(Opcodes.ALOAD, 0));
                il.add(new InsnNode(Opcodes.ICONST_1));
                il.add(new FieldInsnNode(Opcodes.PUTFIELD, "ru/destra/gui/KeybindElement", "listeningForKey", "Z"));

                il.add(labelEnd);
                il.add(new InsnNode(Opcodes.RETURN));

                mn.instructions = il;
                System.out.println("Rewrote KeybindElement.onMouseClick bytecode for reliable clicks!");
            }
        }

        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS | ClassWriter.COMPUTE_FRAMES);
        cn.accept(cw);
        Files.write(p, cw.toByteArray());
        System.out.println("Updated KeybindElement.class");
    }
}
