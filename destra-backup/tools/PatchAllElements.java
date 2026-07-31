import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public final class PatchAllElements {
    static final String PRECOMP = ".precompiled/ru/destra/gui/";

    // SettingComponent subclass field mapping (from setBounds: иг=FLOAD1=x, иж=FLOAD2=y):
    static final String SC_X = "\u0438\u0433";
    static final String SC_Y = "\u0438\u0436";
    static final String SC_WIDTH = "\u0438\u042E";
    static final String SC_ALPHA = "\u0438\u0034";
    static final String SC_HEIGHT = "\u0438\u043B";

    // GuiTextInput subclass field mapping (from setBounds: ?э=FLOAD1=x, ?щ=FLOAD2=y):
    // ?э = U+5F1F U+044D, ?щ = U+5F1F U+0429
    static final String GTI_X = "\u5F1F\u044D";
    static final String GTI_Y = "\u5F1F\u0429";
    static final String GTI_WIDTH = "\u5F1F\u005F";
    static final String GTI_HEIGHT = "\u5F1F\u0437";

    public static void main(String[] args) throws Exception {
        patchElement("CheckboxElement", "ru/destra/gui/SettingComponent",
            SC_X, SC_Y, SC_WIDTH, SC_ALPHA, SC_HEIGHT);
        patchElement("CheckboxComponent", "ru/destra/gui/GuiTextInput",
            GTI_X, GTI_Y, GTI_WIDTH, null, GTI_HEIGHT);
        patchElement("ColorSliderElement", "ru/destra/gui/SettingComponent",
            SC_X, SC_Y, SC_WIDTH, SC_ALPHA, SC_HEIGHT);
        patchElement("SliderElement", "ru/destra/gui/GuiTextInput",
            GTI_X, GTI_Y, GTI_WIDTH, null, GTI_HEIGHT);
        patchElement("ModeChangeElement", "ru/destra/gui/GuiTextInput",
            GTI_X, GTI_Y, GTI_WIDTH, null, GTI_HEIGHT);
        patchElement("KeybindElement", "ru/destra/gui/GuiTextInput",
            GTI_X, GTI_Y, GTI_WIDTH, null, GTI_HEIGHT);
        // KeybindSettingElement NOT patched - it has its own setBounds (я) that
        // correctly sets both parent and obfuscated fields, and render reads
        // obfuscated fields. Patching breaks the setBounds/render swap consistency.
    }

    static void patchElement(String className, String parent,
                             String xField, String yField, String widthField,
                             String alphaField, String heightField) throws Exception {
        String path = PRECOMP + className + ".class";
        File f = new File(path);
        if (!f.exists()) { System.out.println(className + ": NOT FOUND"); return; }

        byte[] data = Files.readAllBytes(f.toPath());
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, ClassReader.EXPAND_FRAMES);

        int replaced = 0;
        for (MethodNode m : cn.methods) {
            if ("<init>".equals(m.name) || "<clinit>".equals(m.name)) continue;

            for (AbstractInsnNode insn : m.instructions) {
                if (!(insn instanceof FieldInsnNode)) continue;
                FieldInsnNode fin = (FieldInsnNode) insn;
                if (!fin.owner.equals(cn.name) || !"F".equals(fin.desc)) continue;

                String newName = null;
                if (fin.name.equals(xField)) newName = "x";
                else if (fin.name.equals(yField)) newName = "y";
                else if (fin.name.equals(widthField)) newName = "width";
                else if (alphaField != null && fin.name.equals(alphaField)) newName = "alpha";
                else if (fin.name.equals(heightField)) newName = "height";

                if (newName != null) {
                    fin.owner = parent;
                    fin.name = newName;
                    replaced++;
                }
            }
        }

        for (int i = cn.methods.size() - 1; i >= 0; i--) {
            MethodNode m = cn.methods.get(i);
            if (("setBounds".equals(m.name) && "(FFFF)V".equals(m.desc))
                || ("setAlpha".equals(m.name) && "(F)V".equals(m.desc))) {
                cn.methods.remove(i);
            }
        }

        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS | ClassWriter.COMPUTE_FRAMES) {
            @Override
            protected String getCommonSuperClass(String type1, String type2) {
                if (type1.startsWith("net/minecraft/") || type2.startsWith("net/minecraft/")) return "java/lang/Object";
                try { return super.getCommonSuperClass(type1, type2); }
                catch (Throwable e) { return "java/lang/Object"; }
            }
        };
        cn.accept(cw);
        byte[] result = cw.toByteArray();
        FileOutputStream fos = new FileOutputStream(f);
        fos.write(result);
        fos.flush();
        fos.getFD().sync();
        fos.close();
        System.out.println(className + ": replaced " + replaced + " field accesses -> " + parent);
    }
}
