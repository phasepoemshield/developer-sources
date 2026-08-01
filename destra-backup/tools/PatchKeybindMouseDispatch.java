import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.nio.file.*;
import java.nio.charset.*;
import java.util.*;

public final class PatchKeybindMouseDispatch {
    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, StandardCharsets.UTF_8));

        // 1. Add mouseReleased(DDI)V no-op to GuiTextInput
        Path gtiPath = Path.of(".precompiled/ru/destra/gui/GuiTextInput.class");
        if (Files.exists(gtiPath)) {
            byte[] data = Files.readAllBytes(gtiPath);
            ClassReader cr = new ClassReader(data);
            ClassNode cn = new ClassNode();
            cr.accept(cn, 0);

            boolean hasRelease = false;
            for (MethodNode m : cn.methods) {
                if (m.name.equals("mouseReleased") && m.desc.equals("(DDI)V")) { hasRelease = true; break; }
            }
            if (!hasRelease) {
                MethodNode release = new MethodNode(Opcodes.ACC_PUBLIC, "mouseReleased", "(DDI)V", null, null);
                release.instructions.add(new InsnNode(Opcodes.RETURN));
                cn.methods.add(release);
                System.out.println("  Added mouseReleased(DDI)V no-op to GuiTextInput");

                ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
                cn.accept(cw);
                Files.write(gtiPath, cw.toByteArray());
            } else {
                System.out.println("  GuiTextInput already has mouseReleased");
            }
        }

        // 2. Patch KeybindSettingElement: fix mouse dispatch
        Path ksePath = Path.of(".precompiled/ru/destra/gui/KeybindSettingElement.class");
        if (!Files.exists(ksePath)) { System.out.println("KeybindSettingElement not found"); return; }

        byte[] kseData = Files.readAllBytes(ksePath);
        ClassReader kseCr = new ClassReader(kseData);
        ClassNode kseCn = new ClassNode();
        kseCr.accept(kseCn, ClassReader.EXPAND_FRAMES);

        int fixed = 0;
        for (MethodNode m : kseCn.methods) {
            if (!m.desc.equals("(DDI)V")) continue;
            // Find INVOKEVIRTUAL calls to GuiTextInput.mouseClicked or GuiTextInput.mouseScrolled
            for (AbstractInsnNode insn : m.instructions) {
                if (insn instanceof MethodInsnNode) {
                    MethodInsnNode min = (MethodInsnNode) insn;
                    if (min.getOpcode() == Opcodes.INVOKEVIRTUAL
                            && min.owner.equals("ru/destra/gui/GuiTextInput")) {
                        // х() is the release handler - should call mouseReleased, not mouseClicked
                        // б() is the click handler - should call mouseClicked, not mouseScrolled
                        if (min.name.equals("mouseClicked") && m.name.equals("\u0445")) {
                            min.name = "mouseReleased";
                            System.out.println("  Fixed " + m.name + ": mouseClicked -> mouseReleased");
                            fixed++;
                        } else if (min.name.equals("mouseScrolled") && m.name.equals("\u0431")) {
                            min.name = "mouseClicked";
                            System.out.println("  Fixed " + m.name + ": mouseScrolled -> mouseClicked");
                            fixed++;
                        }
                    }
                }
            }
        }

        if (fixed > 0) {
            ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS | ClassWriter.COMPUTE_FRAMES) {
                @Override
                protected String getCommonSuperClass(String t1, String t2) {
                    if (t1.startsWith("net/minecraft/") || t2.startsWith("net/minecraft/")) return "java/lang/Object";
                    try { return super.getCommonSuperClass(t1, t2); }
                    catch (Throwable e) { return "java/lang/Object"; }
                }
            };
            kseCn.accept(cw);
            Files.write(ksePath, cw.toByteArray());
            System.out.println("  Patched KeybindSettingElement: " + fixed + " dispatch fix(es)");
        } else {
            System.out.println("  No dispatch fixes needed (already patched or method names not found)");
        }

        // 3. Patch KeybindElement: add mouseClicked/keyPressed/charTyped bridge methods that
        // delegate to onMouseClick/onKeyPressed/onCharTyped. KeybindElement extends GuiTextInput
        // and overrides the "on*" handlers, but KeybindSettingElement dispatches mouse/key events
        // via GuiTextInput.mouseClicked/keyPressed (inherited no-ops). Without a bridge mixin
        // (like CommandInputElement/SliderElement/ColorPickerPanel have), the on* handlers are
        // never invoked, so per-setting keybind binding ignores mouse buttons (incl. RMB) and keys.
        patchKeybindElementBridges();
    }

    private static void patchKeybindElementBridges() throws Exception {
        Path kePath = Path.of(".precompiled/ru/destra/gui/KeybindElement.class");
        if (!Files.exists(kePath)) { System.out.println("  KeybindElement not found, skipping bridge patch"); return; }

        byte[] keData = Files.readAllBytes(kePath);
        ClassReader keCr = new ClassReader(keData);
        ClassNode keCn = new ClassNode();
        keCr.accept(keCn, 0);

        boolean added = false;

        // public void mouseClicked(double mouseX, double mouseY, int button) { this.onMouseClick(mouseX, mouseY, button); }
        if (!hasMethod(keCn, "mouseClicked", "(DDI)V")) {
            MethodNode mc = new MethodNode(Opcodes.ACC_PUBLIC, "mouseClicked", "(DDI)V", null, null);
            mc.instructions.add(new VarInsnNode(Opcodes.ALOAD, 0));
            mc.instructions.add(new VarInsnNode(Opcodes.DLOAD, 1));
            mc.instructions.add(new VarInsnNode(Opcodes.DLOAD, 3));
            mc.instructions.add(new VarInsnNode(Opcodes.ILOAD, 5));
            mc.instructions.add(new MethodInsnNode(Opcodes.INVOKEVIRTUAL, "ru/destra/gui/KeybindElement", "onMouseClick", "(DDI)V", false));
            mc.instructions.add(new InsnNode(Opcodes.RETURN));
            keCn.methods.add(mc);
            added = true;
            System.out.println("  Added KeybindElement.mouseClicked(DDI)V -> onMouseClick");
        }

        // public void keyPressed(int keyCode, int scanCode, int modifiers) { this.onKeyPressed(keyCode, scanCode, modifiers); }
        if (!hasMethod(keCn, "keyPressed", "(III)V")) {
            MethodNode kp = new MethodNode(Opcodes.ACC_PUBLIC, "keyPressed", "(III)V", null, null);
            kp.instructions.add(new VarInsnNode(Opcodes.ALOAD, 0));
            kp.instructions.add(new VarInsnNode(Opcodes.ILOAD, 1));
            kp.instructions.add(new VarInsnNode(Opcodes.ILOAD, 2));
            kp.instructions.add(new VarInsnNode(Opcodes.ILOAD, 3));
            kp.instructions.add(new MethodInsnNode(Opcodes.INVOKEVIRTUAL, "ru/destra/gui/KeybindElement", "onKeyPressed", "(III)V", false));
            kp.instructions.add(new InsnNode(Opcodes.RETURN));
            keCn.methods.add(kp);
            added = true;
            System.out.println("  Added KeybindElement.keyPressed(III)V -> onKeyPressed");
        }

        // public void charTyped(char chr, int modifiers) { this.onCharTyped(chr, modifiers); }
        if (!hasMethod(keCn, "charTyped", "(CI)V")) {
            MethodNode ct = new MethodNode(Opcodes.ACC_PUBLIC, "charTyped", "(CI)V", null, null);
            ct.instructions.add(new VarInsnNode(Opcodes.ALOAD, 0));
            ct.instructions.add(new VarInsnNode(Opcodes.ILOAD, 1));
            ct.instructions.add(new VarInsnNode(Opcodes.ILOAD, 2));
            ct.instructions.add(new MethodInsnNode(Opcodes.INVOKEVIRTUAL, "ru/destra/gui/KeybindElement", "onCharTyped", "(CI)V", false));
            ct.instructions.add(new InsnNode(Opcodes.RETURN));
            keCn.methods.add(ct);
            added = true;
            System.out.println("  Added KeybindElement.charTyped(CI)V -> onCharTyped");
        }

        if (added) {
            // COMPUTE_MAXS only: preserves existing StackMapTable frames for the complex render()
            // method while computing fresh max stack/locals for the new trivial bridge methods
            // (which have no branches and thus need no StackMapTable).
            ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
            keCn.accept(cw);
            Files.write(kePath, cw.toByteArray());
            System.out.println("  Patched KeybindElement: added mouse/key/char bridge methods (enables RMB binding)");
        } else {
            System.out.println("  KeybindElement already has bridge methods (skipped)");
        }
    }

    private static boolean hasMethod(ClassNode cn, String name, String desc) {
        for (MethodNode m : cn.methods) {
            if (m.name.equals(name) && m.desc.equals(desc)) return true;
        }
        return false;
    }
}
