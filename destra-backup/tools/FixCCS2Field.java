import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.zip.*;

public final class FixCCS2Field {
    static final String CCS2 = "ru/destra/misc/ChatCommandSender2";
    static final String HOLDER = "ru/destra/misc/ChatCommandSender2Fields";
    static final String MC_DESC = "Lnet/minecraft/class_310;";

    public static void main(String[] args) throws Exception {
        Path jar = Path.of("build/libs/destra-recovered-1.0.0.jar");
        if (!Files.exists(jar)) { System.out.println("jar not found"); return; }

        // Read all entries into memory
        List<String> names = new ArrayList<>();
        Map<String, byte[]> entries = new LinkedHashMap<>();
        try (ZipFile zf = new ZipFile(jar.toFile())) {
            for (var e = zf.entries(); e.hasMoreElements(); ) {
                ZipEntry ze = e.nextElement();
                String name = ze.getName();
                try (InputStream is = zf.getInputStream(ze)) {
                    byte[] data = is.readAllBytes();
                    names.add(name);
                    entries.put(name, data);
                }
            }
        }

        // Patch CCS2: remove mc field, empty clinit/init, rewrite own getstatic/putstatic CCS2.mc -> holder
        byte[] ccs2Data = entries.get(CCS2 + ".class");
        if (ccs2Data != null) {
            ClassNode cn = new ClassNode();
            new ClassReader(ccs2Data).accept(cn, 0);
            System.out.println("CCS2 fields before: " + cn.fields.size());
            for (FieldNode f : cn.fields) System.out.println("  " + f.name + " " + f.desc + " 0x" + Integer.toHexString(f.access));
            boolean removed = cn.fields.removeIf(f -> f.name.equals("mc"));
            System.out.println("removed mc: " + removed);
            for (MethodNode mn : cn.methods) {
                if (mn.name.equals("<clinit>") || mn.name.equals("init")) {
                    mn.instructions.clear();
                    mn.instructions.add(new InsnNode(Opcodes.RETURN));
                    mn.maxStack = 0; mn.maxLocals = 0;
                }
                if (mn.instructions != null) {
                    for (AbstractInsnNode insn : mn.instructions) {
                        if (insn instanceof FieldInsnNode fin && fin.owner.equals(CCS2) && fin.name.equals("mc")) {
                            fin.owner = HOLDER;
                        }
                    }
                }
            }
            ClassWriter cw = new ClassWriter(0);
            cn.accept(cw);
            entries.put(CCS2 + ".class", cw.toByteArray());
        }

        // Rewrite all getstatic/putstatic CCS2.mc -> holder in ALL classes
        int patched = 0;
        for (String name : names) {
            if (!name.endsWith(".class")) continue;
            if (name.equals(CCS2 + ".class")) continue;
            byte[] data = entries.get(name);
            ClassNode cn = new ClassNode();
            new ClassReader(data).accept(cn, 0);
            boolean modified = false;
            for (MethodNode mn : cn.methods) {
                if (mn.instructions == null) continue;
                for (AbstractInsnNode insn : mn.instructions) {
                    if (insn instanceof FieldInsnNode fin) {
                        if (fin.owner.equals(CCS2) && fin.name.equals("mc")) {
                            fin.owner = HOLDER;
                            modified = true;
                        }
                    }
                }
            }
            if (modified) {
                ClassWriter cw = new ClassWriter(0);
                cn.accept(cw);
                entries.put(name, cw.toByteArray());
                patched++;
                System.out.println("rewrote CCS2.mc ref in: " + name);
            }
        }

        // Ensure holder class exists
        if (!entries.containsKey(HOLDER + ".class")) {
            entries.put(HOLDER + ".class", createHolder());
            names.add(HOLDER + ".class");
            System.out.println("created holder");
        } else {
            entries.put(HOLDER + ".class", createHolder());
            System.out.println("overwrote holder");
        }

        // Write jar back via Files.newOutputStream (writes to real disk, avoids virtualization on Files.copy)
        try (OutputStream os = Files.newOutputStream(jar, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.CREATE);
             ZipOutputStream zos = new ZipOutputStream(os)) {
            for (String name : names) {
                zos.putNextEntry(new ZipEntry(name));
                zos.write(entries.get(name));
                zos.closeEntry();
            }
        }
        System.out.println("jar rewritten: " + Files.size(jar) + " bytes, " + patched + " classes patched");
    }

    static byte[] createHolder() {
        ClassNode cn = new ClassNode();
        cn.version = Opcodes.V21;
        cn.access = Opcodes.ACC_PUBLIC;
        cn.name = HOLDER;
        cn.superName = "java/lang/Object";
        cn.fields.add(new FieldNode(Opcodes.ACC_PUBLIC | Opcodes.ACC_STATIC, "mc", MC_DESC, null, null));
        MethodNode clinit = new MethodNode(Opcodes.ACC_STATIC, "<clinit>", "()V", null, null);
        clinit.instructions.add(new MethodInsnNode(Opcodes.INVOKESTATIC, "net/minecraft/class_310", "method_1551", "()" + MC_DESC, false));
        clinit.instructions.add(new FieldInsnNode(Opcodes.PUTSTATIC, HOLDER, "mc", MC_DESC));
        clinit.instructions.add(new InsnNode(Opcodes.RETURN));
        clinit.maxStack = 1; clinit.maxLocals = 0;
        cn.methods.add(clinit);
        MethodNode ctor = new MethodNode(Opcodes.ACC_PUBLIC, "<init>", "()V", null, null);
        ctor.instructions.add(new VarInsnNode(Opcodes.ALOAD, 0));
        ctor.instructions.add(new MethodInsnNode(Opcodes.INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false));
        ctor.instructions.add(new InsnNode(Opcodes.RETURN));
        ctor.maxStack = 1; ctor.maxLocals = 1;
        cn.methods.add(ctor);
        ClassWriter cw = new ClassWriter(0);
        cn.accept(cw);
        return cw.toByteArray();
    }
}
