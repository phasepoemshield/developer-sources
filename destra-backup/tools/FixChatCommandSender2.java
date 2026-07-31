import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;
import java.util.*;
import java.util.zip.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;

public final class FixChatCommandSender2 {
    static final String CCS2 = "ru/destra/misc/ChatCommandSender2";
    static final String HOLDER = "ru/destra/misc/ChatCommandSender2Fields";
    static final String MC_DESC = "Lnet/minecraft/class_310;";

    public static void main(String[] args) throws Exception {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        if (args.length < 1) { System.err.println("Usage: FixChatCommandSender2 <jar-or-classfile>"); System.exit(1); }
        Path path = Path.of(args[0]);
        if (path.toString().endsWith(".class")) {
            patchClass(Files.readAllBytes(path), path);
        } else {
            patchJar(path);
        }
    }

    static void patchClass(byte[] bytes, Path path) throws Exception {
        ClassNode cn = new ClassNode();
        new ClassReader(bytes).accept(cn, ClassReader.EXPAND_FRAMES);
        fixForCompilation(cn);
        ClassWriter cw = new ClassWriter(0);
        cn.accept(cw);
        Files.write(path, cw.toByteArray());
        System.out.println("Patched precompiled: " + path);
    }

    static void fixForCompilation(ClassNode cn) {
        cn.access = Opcodes.ACC_PUBLIC | Opcodes.ACC_INTERFACE | Opcodes.ACC_ABSTRACT;
        String mcDesc = null;
        for (FieldNode fn : cn.fields) {
            if (fn.name.equals("mc")) {
                fn.access = Opcodes.ACC_PUBLIC | Opcodes.ACC_STATIC | Opcodes.ACC_FINAL;
                mcDesc = fn.desc;
            }
        }
        InsnList initBody = null;
        for (MethodNode mn : cn.methods) {
            if (mn.name.equals("init") && mn.desc.equals("()V")) {
                boolean hasPut = false;
                for (AbstractInsnNode i : mn.instructions)
                    if (i.getOpcode() == Opcodes.PUTSTATIC && ((FieldInsnNode) i).name.equals("mc")) { hasPut = true; break; }
                if (hasPut) {
                    initBody = new InsnList();
                    for (AbstractInsnNode i : mn.instructions) initBody.add(i.clone(null));
                }
                mn.instructions.clear();
                mn.instructions.add(new InsnNode(Opcodes.RETURN));
                mn.maxStack = 0; mn.maxLocals = 0;
            }
        }
        if (initBody == null && mcDesc != null) initBody = buildInitBody(cn, mcDesc);
        if (initBody != null) {
            for (MethodNode mn : cn.methods) {
                if (mn.name.equals("<clinit>") && mn.desc.equals("()V")) {
                    InsnList body = new InsnList();
                    for (AbstractInsnNode i : initBody) body.add(i.clone(null));
                    body.add(new InsnNode(Opcodes.RETURN));
                    mn.instructions = body;
                    mn.maxStack = 4; mn.maxLocals = 0;
                    break;
                }
            }
        }
    }

    static InsnList buildInitBody(ClassNode cn, String mcDesc) {
        String mcClass = mcDesc.substring(1, mcDesc.length() - 1);
        String method = "getInstance", owner = mcClass;
        boolean itf = false;
        for (MethodNode mn : cn.methods) {
            if (mn.instructions == null) continue;
            for (AbstractInsnNode i : mn.instructions) {
                if (i instanceof MethodInsnNode m && m.getOpcode() == Opcodes.INVOKESTATIC && m.desc.equals("()" + mcDesc)) {
                    owner = m.owner; method = m.name; itf = m.itf; break;
                }
            }
            if (!method.equals("getInstance") || !owner.equals(mcClass)) break;
        }
        InsnList body = new InsnList();
        body.add(new MethodInsnNode(Opcodes.INVOKESTATIC, owner, method, "()" + mcDesc, itf));
        body.add(new FieldInsnNode(Opcodes.PUTSTATIC, cn.name, "mc", mcDesc));
        return body;
    }

    static void patchJar(Path path) throws Exception {
        Path tmpJar = Path.of(path + ".patched.jar");
        int patched = 0;
        boolean holderWritten = false;

        byte[] holderBytes = createHolderClass();

        try (ZipFile zf = new ZipFile(path.toFile())) {
            try (ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(tmpJar.toFile()))) {
                for (var entry : zf.stream().toList()) {
                    String name = entry.getName();

                    if (name.equals(HOLDER + ".class")) {
                        zos.putNextEntry(new ZipEntry(name));
                        zos.write(holderBytes);
                        zos.closeEntry();
                        holderWritten = true;
                        System.out.println("Overwrote " + HOLDER);
                        continue;
                    }

                    if (name.equals(CCS2 + ".class")) {
                        byte[] bytes = readAll(zf, entry);
                        ClassNode cn = new ClassNode();
                        new ClassReader(bytes).accept(cn, ClassReader.EXPAND_FRAMES);

                        System.out.println("  CCS2 fields: " + cn.fields.size());
                        for (FieldNode fn : cn.fields) {
                            System.out.println("    field: " + fn.name + " " + fn.desc + " access=0x" + Integer.toHexString(fn.access));
                        }
                        boolean hadMc = cn.fields.removeIf(f -> f.name.equals("mc"));

                        for (MethodNode mn : cn.methods) {
                            if (mn.name.equals("<clinit>") || mn.name.equals("init")) {
                                mn.instructions.clear();
                                mn.instructions.add(new InsnNode(Opcodes.RETURN));
                                mn.maxStack = 0; mn.maxLocals = 0;
                            }
                        }

                        for (MethodNode mn : cn.methods) {
                            if (mn.instructions == null) continue;
                            for (AbstractInsnNode insn : mn.instructions) {
                                if (insn instanceof FieldInsnNode fin) {
                                    if (fin.owner.equals(CCS2) && fin.name.equals("mc")) {
                                        fin.owner = HOLDER;
                                    }
                                }
                            }
                        }

                        ClassWriter cw = new ClassWriter(0);
                        cn.accept(cw);
                        zos.putNextEntry(new ZipEntry(name));
                        zos.write(cw.toByteArray());
                        zos.closeEntry();
                        System.out.println("CCS2: removed mc=" + hadMc + ", emptied clinit/init, rewrote own refs");

                    } else if (name.endsWith(".class")) {
                        byte[] bytes = readAll(zf, entry);
                        ClassNode cn = new ClassNode();
                        new ClassReader(bytes).accept(cn, ClassReader.EXPAND_FRAMES);

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
                            zos.putNextEntry(new ZipEntry(name));
                            zos.write(cw.toByteArray());
                            zos.closeEntry();
                            patched++;
                            System.out.println("  Rewrote -> " + name);
                        } else {
                            zos.putNextEntry(new ZipEntry(name));
                            try (InputStream is = zf.getInputStream(entry)) { is.transferTo(zos); }
                            zos.closeEntry();
                        }
                    } else {
                        zos.putNextEntry(new ZipEntry(name));
                        try (InputStream is = zf.getInputStream(entry)) { is.transferTo(zos); }
                        zos.closeEntry();
                    }
                }

                if (!holderWritten) {
                    zos.putNextEntry(new ZipEntry(HOLDER + ".class"));
                    zos.write(holderBytes);
                    zos.closeEntry();
                    System.out.println("Created " + HOLDER);
                }
            }
        }

        System.out.println("Temp jar size: " + Files.size(tmpJar));
        Files.copy(tmpJar, path, StandardCopyOption.REPLACE_EXISTING);
        Files.delete(tmpJar);
        System.out.println("Replaced jar. Final size: " + Files.size(path));
        System.out.println("Done: " + patched + " classes patched");
    }

    static byte[] createHolderClass() {
        ClassNode cn = new ClassNode();
        cn.version = Opcodes.V21;
        cn.access = Opcodes.ACC_PUBLIC;
        cn.name = HOLDER;
        cn.superName = "java/lang/Object";

        FieldNode mcField = new FieldNode(
            Opcodes.ACC_PUBLIC | Opcodes.ACC_STATIC,
            "mc", MC_DESC, null, null
        );
        cn.fields.add(mcField);

        MethodNode clinit = new MethodNode(Opcodes.ACC_STATIC, "<clinit>", "()V", null, null);
        clinit.instructions.add(new MethodInsnNode(
            Opcodes.INVOKESTATIC, "net/minecraft/class_310", "method_1551",
            "()" + MC_DESC, false));
        clinit.instructions.add(new FieldInsnNode(
            Opcodes.PUTSTATIC, HOLDER, "mc", MC_DESC));
        clinit.instructions.add(new InsnNode(Opcodes.RETURN));
        clinit.maxStack = 1; clinit.maxLocals = 0;
        cn.methods.add(clinit);

        MethodNode ctor = new MethodNode(Opcodes.ACC_PUBLIC, "<init>", "()V", null, null);
        ctor.instructions.add(new VarInsnNode(Opcodes.ALOAD, 0));
        ctor.instructions.add(new MethodInsnNode(
            Opcodes.INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false));
        ctor.instructions.add(new InsnNode(Opcodes.RETURN));
        ctor.maxStack = 1; ctor.maxLocals = 1;
        cn.methods.add(ctor);

        ClassWriter cw = new ClassWriter(0);
        cn.accept(cw);
        return cw.toByteArray();
    }

    static byte[] readAll(ZipFile zf, ZipEntry entry) throws IOException {
        var baos = new ByteArrayOutputStream();
        try (InputStream is = zf.getInputStream(entry)) { is.transferTo(baos); }
        return baos.toByteArray();
    }
}
