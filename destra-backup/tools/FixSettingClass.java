import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.nio.file.*;
import java.nio.charset.*;

public final class FixSettingClass {
    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, StandardCharsets.UTF_8));
        Path p = Path.of(".precompiled/ru/destra/setting/Setting.class");
        byte[] data = Files.readAllBytes(p);
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        System.out.println("Class: " + cn.name);
        System.out.println("Signature: " + cn.signature);
        System.out.println("Interfaces: " + cn.interfaces);
        System.out.println("Fields:");
        for (FieldNode f : cn.fields) {
            System.out.println("  " + f.name + " " + f.desc + " sig=" + f.signature);
        }
        System.out.println("Methods:");
        for (MethodNode m : cn.methods) {
            System.out.println("  " + m.name + m.desc + " sig=" + m.signature);
        }

        // Remove all signatures
        cn.signature = null;
        for (FieldNode f : cn.fields) f.signature = null;
        for (MethodNode m : cn.methods) {
            m.signature = null;
            // Also remove Signature attribute from visible/invisible annotations
            if (m.visibleTypeAnnotations != null) m.visibleTypeAnnotations.clear();
            if (m.invisibleTypeAnnotations != null) m.invisibleTypeAnnotations.clear();
        }
        if (cn.visibleTypeAnnotations != null) cn.visibleTypeAnnotations.clear();
        if (cn.invisibleTypeAnnotations != null) cn.invisibleTypeAnnotations.clear();

        // Also check if there's a formalTypeParameters in the signature
        // The "Value" type variable might be in the class signature
        // Let's also try removing the interface Supplier and adding it back as raw
        cn.interfaces.removeIf(i -> i.contains("Supplier"));
        cn.interfaces.add("java/util/function/Supplier");

        ClassWriter cw = new ClassWriter(0);
        cn.accept(cw);
        Files.write(p, cw.toByteArray());
        System.out.println("Fixed Setting.class: removed signatures + fixed Supplier");

        // Also fix NumberSetting.class
        Path np = Path.of(".precompiled/ru/destra/setting/NumberSetting.class");
        byte[] ndata = Files.readAllBytes(np);
        ClassReader ncr = new ClassReader(ndata);
        ClassNode ncn = new ClassNode();
        ncr.accept(ncn, 0);
        ncn.signature = null;
        for (FieldNode f : ncn.fields) f.signature = null;
        for (MethodNode m : ncn.methods) {
            m.signature = null;
            if (m.visibleTypeAnnotations != null) m.visibleTypeAnnotations.clear();
            if (m.invisibleTypeAnnotations != null) m.invisibleTypeAnnotations.clear();
        }
        ClassWriter ncw = new ClassWriter(0);
        ncn.accept(ncw);
        Files.write(np, ncw.toByteArray());
        System.out.println("Fixed NumberSetting.class");

        // Fix ObjectSetting.class
        Path op = Path.of(".precompiled/ru/destra/setting/ObjectSetting.class");
        byte[] odata = Files.readAllBytes(op);
        ClassReader ocr = new ClassReader(odata);
        ClassNode ocn = new ClassNode();
        ocr.accept(ocn, 0);
        ocn.signature = null;
        for (FieldNode f : ocn.fields) f.signature = null;
        for (MethodNode m : ocn.methods) {
            m.signature = null;
            if (m.visibleTypeAnnotations != null) m.visibleTypeAnnotations.clear();
            if (m.invisibleTypeAnnotations != null) m.invisibleTypeAnnotations.clear();
        }
        ClassWriter ocw = new ClassWriter(0);
        ocn.accept(ocw);
        Files.write(op, ocw.toByteArray());
        System.out.println("Fixed ObjectSetting.class");

        // Fix BooleanSetting.class
        Path bp = Path.of(".precompiled/ru/destra/setting/BooleanSetting.class");
        if (Files.exists(bp)) {
            byte[] bdata = Files.readAllBytes(bp);
            ClassReader bcr = new ClassReader(bdata);
            ClassNode bcn = new ClassNode();
            bcr.accept(bcn, 0);
            bcn.signature = null;
            for (FieldNode f : bcn.fields) f.signature = null;
            for (MethodNode m : bcn.methods) {
                m.signature = null;
                if (m.visibleTypeAnnotations != null) m.visibleTypeAnnotations.clear();
                if (m.invisibleTypeAnnotations != null) m.invisibleTypeAnnotations.clear();
            }
            ClassWriter bcw = new ClassWriter(0);
            bcn.accept(bcw);
            Files.write(bp, bcw.toByteArray());
            System.out.println("Fixed BooleanSetting.class");
        }

        // Fix ModeSetting.class
        Path mp = Path.of(".precompiled/ru/destra/setting/ModeSetting.class");
        if (Files.exists(mp)) {
            byte[] mdata = Files.readAllBytes(mp);
            ClassReader mcr = new ClassReader(mdata);
            ClassNode mcn = new ClassNode();
            mcr.accept(mcn, 0);
            mcn.signature = null;
            for (FieldNode f : mcn.fields) f.signature = null;
            for (MethodNode m : mcn.methods) {
                m.signature = null;
                if (m.visibleTypeAnnotations != null) m.visibleTypeAnnotations.clear();
                if (m.invisibleTypeAnnotations != null) m.invisibleTypeAnnotations.clear();
            }
            ClassWriter mcw = new ClassWriter(0);
            mcn.accept(mcw);
            Files.write(mp, mcw.toByteArray());
            System.out.println("Fixed ModeSetting.class");
        }
    }
}
