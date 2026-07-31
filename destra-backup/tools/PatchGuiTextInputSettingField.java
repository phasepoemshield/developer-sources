import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.nio.file.*;
import java.util.*;

/**
 * Recovered GuiTextInput subclasses write the Setting into a shadow field {@code й}
 * instead of {@code GuiTextInput.setting}. KeybindSettingElement reads the parent field
 * for visibility and ModeChangeScreen2 height (needs instanceof ModeSetting).
 *
 * Rewrite ctor putfield й → GuiTextInput.setting (and keep a duplicate put to й if the
 * field still exists, so existing reads of й keep working).
 */
public final class PatchGuiTextInputSettingField {
    static final String PARENT = "ru/destra/gui/GuiTextInput";
    static final String SETTING_DESC = "Lru/destra/setting/Setting;";
    static final String[] TARGETS = {
            "ru/destra/misc/ModeChangeScreen2",
            "ru/destra/gui/ModelPreviewWidget",
            "ru/destra/gui/ModeChangeElement",
            "ru/destra/gui/CheckboxComponent",
            "ru/destra/gui/KeybindElement",
            "ru/destra/gui/SliderElement",
            "ru/destra/gui/TextInputField",
            "ru/destra/gui/CommandInputElement",
            "ru/destra/misc/ColorPickerPanel",
            "ru/destra/gui/PresetsScreen",
            "ru/destra/core/ModuleButton"
    };

    public static void main(String[] args) throws Exception {
        int total = 0;
        for (String internal : TARGETS) {
            total += patch(internal);
        }
        total += patchModeChangeHeight();
        System.out.println("PatchGuiTextInputSettingField: total changes=" + total);
    }

    /**
     * KeybindSettingElement height for ModeChangeScreen2 used GuiTextInput.setting instanceof ModeSetting.
     * After recovery that field is often null/fallback, so height stays 0. Use modeSetting directly.
     */
    static int patchModeChangeHeight() throws Exception {
        Path p = Path.of(".precompiled/ru/destra/gui/KeybindSettingElement.class");
        ClassNode cn = new ClassNode();
        new ClassReader(Files.readAllBytes(p)).accept(cn, 0);
        int changed = 0;

        for (MethodNode mn : cn.methods) {
            // float 4(GuiTextInput, float)
            if (!"4".equals(mn.name) || !"(Lru/destra/gui/GuiTextInput;F)F".equals(mn.desc)) continue;

            AbstractInsnNode[] arr = mn.instructions.toArray();
            for (int i = 0; i < arr.length - 6; i++) {
                // instanceof ModeChangeScreen2
                if (!(arr[i] instanceof TypeInsnNode tin)
                        || tin.getOpcode() != Opcodes.INSTANCEOF
                        || !"ru/destra/misc/ModeChangeScreen2".equals(tin.desc)) {
                    continue;
                }
                // Find: getfield GuiTextInput.setting → instanceof ModeSetting
                for (int j = i + 1; j < Math.min(i + 12, arr.length); j++) {
                    if (!(arr[j] instanceof FieldInsnNode fin)) continue;
                    if (fin.getOpcode() != Opcodes.GETFIELD) continue;
                    if (!"ru/destra/gui/GuiTextInput".equals(fin.owner) || !"setting".equals(fin.name)) continue;

                    AbstractInsnNode prev = fin.getPrevious();
                    if (prev instanceof TypeInsnNode ct
                            && ct.getOpcode() == Opcodes.CHECKCAST
                            && "ru/destra/misc/ModeChangeScreen2".equals(ct.desc)) {
                        break; // already patched
                    }

                    InsnList repl = new InsnList();
                    repl.add(new TypeInsnNode(Opcodes.CHECKCAST, "ru/destra/misc/ModeChangeScreen2"));
                    repl.add(new FieldInsnNode(
                            Opcodes.GETFIELD,
                            "ru/destra/misc/ModeChangeScreen2",
                            "modeSetting",
                            "Lru/destra/setting/ModeSetting;"));
                    mn.instructions.insert(fin, repl);
                    mn.instructions.remove(fin);
                    changed++;
                    System.out.println("  KeybindSettingElement.4: ModeChangeScreen2 height via modeSetting");
                    break;
                }
            }
        }

        // Same for ModeChangeElement → settingGroup
        for (MethodNode mn : cn.methods) {
            if (!"4".equals(mn.name) || !"(Lru/destra/gui/GuiTextInput;F)F".equals(mn.desc)) continue;
            AbstractInsnNode[] arr = mn.instructions.toArray();
            for (int i = 0; i < arr.length - 6; i++) {
                if (!(arr[i] instanceof TypeInsnNode tin)
                        || tin.getOpcode() != Opcodes.INSTANCEOF
                        || !"ru/destra/gui/ModeChangeElement".equals(tin.desc)) {
                    continue;
                }
                for (int j = i + 1; j < Math.min(i + 12, arr.length); j++) {
                    if (!(arr[j] instanceof FieldInsnNode fin)) continue;
                    if (fin.getOpcode() != Opcodes.GETFIELD) continue;
                    if (!"ru/destra/gui/GuiTextInput".equals(fin.owner) || !"setting".equals(fin.name)) continue;

                    // Avoid double-patch
                    AbstractInsnNode prev = fin.getPrevious();
                    if (prev instanceof TypeInsnNode ct
                            && ct.getOpcode() == Opcodes.CHECKCAST
                            && "ru/destra/gui/ModeChangeElement".equals(ct.desc)) {
                        break;
                    }

                    InsnList repl = new InsnList();
                    repl.add(new TypeInsnNode(Opcodes.CHECKCAST, "ru/destra/gui/ModeChangeElement"));
                    repl.add(new FieldInsnNode(
                            Opcodes.GETFIELD,
                            "ru/destra/gui/ModeChangeElement",
                            "settingGroup",
                            "Lru/destra/setting/SettingGroup;"));
                    mn.instructions.insert(fin, repl);
                    mn.instructions.remove(fin);
                    changed++;
                    System.out.println("  KeybindSettingElement.4: ModeChangeElement height via settingGroup");
                    break;
                }
            }
        }

        if (changed > 0) {
            ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS) {
                @Override
                protected String getCommonSuperClass(String type1, String type2) {
                    if (type1.startsWith("net/minecraft/") || type2.startsWith("net/minecraft/")) {
                        return "java/lang/Object";
                    }
                    try {
                        return super.getCommonSuperClass(type1, type2);
                    } catch (Throwable e) {
                        return "java/lang/Object";
                    }
                }
            };
            cn.accept(cw);
            byte[] out = cw.toByteArray();
            Files.write(p, out);
            Path bc = Path.of("build/classes/java/main/ru/destra/gui/KeybindSettingElement.class");
            if (Files.exists(bc.getParent())) {
                Files.write(bc, out);
            }
            System.out.println("  Wrote KeybindSettingElement (" + out.length + " bytes)");
        }
        return changed;
    }

    static int patch(String internal) throws Exception {
        Path p = Path.of(".precompiled/" + internal + ".class");
        if (!Files.exists(p)) {
            System.out.println("  skip missing " + internal);
            return 0;
        }
        ClassNode cn = new ClassNode();
        new ClassReader(Files.readAllBytes(p)).accept(cn, 0);

        boolean hasShadowYi = false;
        for (FieldNode f : cn.fields) {
            if ("й".equals(f.name) && SETTING_DESC.equals(f.desc)) {
                hasShadowYi = true;
                break;
            }
        }

        int changed = 0;
        for (MethodNode mn : cn.methods) {
            if (!"<init>".equals(mn.name)) continue;

            // Idempotent: skip if ctor already writes GuiTextInput.setting
            boolean already = false;
            for (AbstractInsnNode insn : mn.instructions) {
                if (insn instanceof FieldInsnNode fin
                        && fin.getOpcode() == Opcodes.PUTFIELD
                        && PARENT.equals(fin.owner)
                        && "setting".equals(fin.name)
                        && SETTING_DESC.equals(fin.desc)) {
                    already = true;
                    break;
                }
            }
            if (already) continue;

            AbstractInsnNode[] arr = mn.instructions.toArray();
            for (AbstractInsnNode insn : arr) {
                if (!(insn instanceof FieldInsnNode fin)) continue;
                if (fin.getOpcode() != Opcodes.PUTFIELD) continue;
                if (!SETTING_DESC.equals(fin.desc)) continue;
                if (!"й".equals(fin.name)) continue;
                if (!cn.name.equals(fin.owner) && !PARENT.equals(fin.owner)) continue;

                // stack before putfield: ..., this, setting
                // Insert: DUP2; putfield GuiTextInput.setting; then original putfield й
                InsnList inject = new InsnList();
                inject.add(new InsnNode(Opcodes.DUP2));
                inject.add(new FieldInsnNode(Opcodes.PUTFIELD, PARENT, "setting", SETTING_DESC));
                mn.instructions.insertBefore(fin, inject);
                if (hasShadowYi) {
                    fin.owner = cn.name;
                    fin.name = "й";
                } else {
                    mn.instructions.insert(fin, new InsnNode(Opcodes.POP2));
                    mn.instructions.remove(fin);
                }
                changed++;
                System.out.println("  " + internal + ".<init>: also set GuiTextInput.setting");
            }
        }

        if (changed > 0) {
            ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
            cn.accept(cw);
            byte[] out = cw.toByteArray();
            Files.write(p, out);
            Path bc = Path.of("build/classes/java/main/" + internal + ".class");
            if (Files.exists(bc.getParent())) {
                Files.createDirectories(bc.getParent());
                Files.write(bc, out);
            }
        }
        return changed;
    }
}
