import java.io.*;
import java.nio.file.*;
import java.util.zip.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;

public final class PatchCCS2Stdout {
    static final String CCS2 = "ru/destra/misc/ChatCommandSender2";
    static final String HOLDER = "ru/destra/misc/ChatCommandSender2Fields";
    static final String MC_DESC = "Lnet/minecraft/class_310;";

    public static void main(String[] args) throws Exception {
        if (args.length < 1) { System.err.println("Usage: PatchCCS2Stdout <jar>"); System.exit(1); }
        Path path = Path.of(args[0]);
        byte[] result = patchJar(path);
        FileOutputStream rawOut = new FileOutputStream(FileDescriptor.out);
        rawOut.write(result);
        rawOut.flush();
        rawOut.close();
        System.err.println("Written " + result.length + " bytes to stdout");
    }

    static byte[] patchJar(Path path) throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] holderBytes = createHolderClass();
        byte[] apiExceptionBytes = createApiException();
        int patched = 0;
        boolean holderWritten = false;
        boolean apiExceptionWritten = false;

        try (ZipFile zf = new ZipFile(path.toFile());
             ZipOutputStream zos = new ZipOutputStream(baos)) {

            for (var entry : zf.stream().toList()) {
                String name = entry.getName();

                if (name.equals(HOLDER + ".class")) {
                    zos.putNextEntry(new ZipEntry(name));
                    zos.write(holderBytes);
                    zos.closeEntry();
                    holderWritten = true;
                    continue;
                }

                if (name.equals("ru/dreamix/protection/api/exceptions/ApiException.class")) {
                    zos.putNextEntry(new ZipEntry(name));
                    zos.write(apiExceptionBytes);
                    zos.closeEntry();
                    apiExceptionWritten = true;
                    continue;
                }

                if (name.equals(CCS2 + ".class")) {
                    byte[] bytes = readAll(zf, entry);
                    ClassNode cn = new ClassNode();
                    new ClassReader(bytes).accept(cn, ClassReader.EXPAND_FRAMES);
                    cn.fields.removeIf(f -> f.name.equals("mc"));
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
                    ClassWriter cw = new SafeClassWriter();
                    cn.accept(cw);
                    zos.putNextEntry(new ZipEntry(name));
                    zos.write(cw.toByteArray());
                    zos.closeEntry();
                } else if (name.equals("ru/destra/util/ColorUtil.class")) {
                    byte[] bytes = readAll(zf, entry);
                    ClassNode cn = new ClassNode();
                    new ClassReader(bytes).accept(cn, ClassReader.EXPAND_FRAMES);
                    stubGradientText(cn);
                    ClassWriter cw = new ClassWriter(0);
                    cn.accept(cw);
                    zos.putNextEntry(new ZipEntry(name));
                    zos.write(cw.toByteArray());
                    zos.closeEntry();
                    System.err.println("Stubbed ColorUtil.gradientText");
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
                        ClassWriter cw = new SafeClassWriter();
                        cn.accept(cw);
                        zos.putNextEntry(new ZipEntry(name));
                        zos.write(cw.toByteArray());
                        zos.closeEntry();
                        patched++;
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
            }
            if (!apiExceptionWritten) {
                zos.putNextEntry(new ZipEntry("ru/dreamix/protection/api/exceptions/ApiException.class"));
                zos.write(apiExceptionBytes);
                zos.closeEntry();
            }
        }

        System.err.println("Patched " + patched + " classes");
        return baos.toByteArray();
    }

    static class SafeClassWriter extends ClassWriter {
        SafeClassWriter() { super(ClassWriter.COMPUTE_FRAMES); }
        @Override
        protected String getCommonSuperClass(String type1, String type2) {
            return "java/lang/Object";
        }
    }

    static void stubGradientText(ClassNode cn) {
        for (int i = 0; i < cn.methods.size(); i++) {
            MethodNode mn = cn.methods.get(i);
            if (mn.name.equals("gradientText") && mn.desc.equals("(Ljava/lang/String;II[Ljava/lang/Boolean;)Lnet/minecraft/class_5250;")) {
                InsnList body = new InsnList();
                // return Text.literal(arg0)
                body.add(new VarInsnNode(Opcodes.ALOAD, 0));
                body.add(new MethodInsnNode(Opcodes.INVOKESTATIC, "net/minecraft/class_2561", "method_43470", "(Ljava/lang/String;)Lnet/minecraft/class_5250;", true));
                body.add(new InsnNode(Opcodes.ARETURN));
                mn.instructions = body;
                mn.maxStack = 1; mn.maxLocals = 4;
                mn.tryCatchBlocks = null;
                mn.localVariables = null;
                System.err.println("  gradientText stubbed -> Text.literal(input)");
                return;
            }
        }
        System.err.println("  WARNING: gradientText not found in ColorUtil");
    }

    static byte[] createApiException() {
        ClassNode cn = new ClassNode();
        cn.version = Opcodes.V21;
        cn.access = Opcodes.ACC_PUBLIC;
        cn.name = "ru/dreamix/protection/api/exceptions/ApiException";
        cn.superName = "java/lang/Exception";

        // ()V
        MethodNode ctor1 = new MethodNode(Opcodes.ACC_PUBLIC, "<init>", "()V", null, null);
        ctor1.instructions.add(new VarInsnNode(Opcodes.ALOAD, 0));
        ctor1.instructions.add(new MethodInsnNode(Opcodes.INVOKESPECIAL, "java/lang/Exception", "<init>", "()V", false));
        ctor1.instructions.add(new InsnNode(Opcodes.RETURN));
        ctor1.maxStack = 1; ctor1.maxLocals = 1;
        cn.methods.add(ctor1);

        // (Ljava/lang/String;)V
        MethodNode ctor2 = new MethodNode(Opcodes.ACC_PUBLIC, "<init>", "(Ljava/lang/String;)V", null, null);
        ctor2.instructions.add(new VarInsnNode(Opcodes.ALOAD, 0));
        ctor2.instructions.add(new VarInsnNode(Opcodes.ALOAD, 1));
        ctor2.instructions.add(new MethodInsnNode(Opcodes.INVOKESPECIAL, "java/lang/Exception", "<init>", "(Ljava/lang/String;)V", false));
        ctor2.instructions.add(new InsnNode(Opcodes.RETURN));
        ctor2.maxStack = 2; ctor2.maxLocals = 2;
        cn.methods.add(ctor2);

        // (Ljava/lang/String;Ljava/lang/Throwable;)V
        MethodNode ctor3 = new MethodNode(Opcodes.ACC_PUBLIC, "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", null, null);
        ctor3.instructions.add(new VarInsnNode(Opcodes.ALOAD, 0));
        ctor3.instructions.add(new VarInsnNode(Opcodes.ALOAD, 1));
        ctor3.instructions.add(new VarInsnNode(Opcodes.ALOAD, 2));
        ctor3.instructions.add(new MethodInsnNode(Opcodes.INVOKESPECIAL, "java/lang/Exception", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false));
        ctor3.instructions.add(new InsnNode(Opcodes.RETURN));
        ctor3.maxStack = 3; ctor3.maxLocals = 3;
        cn.methods.add(ctor3);

        // (Ljava/lang/Throwable;)V
        MethodNode ctor4 = new MethodNode(Opcodes.ACC_PUBLIC, "<init>", "(Ljava/lang/Throwable;)V", null, null);
        ctor4.instructions.add(new VarInsnNode(Opcodes.ALOAD, 0));
        ctor4.instructions.add(new VarInsnNode(Opcodes.ALOAD, 1));
        ctor4.instructions.add(new MethodInsnNode(Opcodes.INVOKESPECIAL, "java/lang/Exception", "<init>", "(Ljava/lang/Throwable;)V", false));
        ctor4.instructions.add(new InsnNode(Opcodes.RETURN));
        ctor4.maxStack = 2; ctor4.maxLocals = 2;
        cn.methods.add(ctor4);

        ClassWriter cw = new ClassWriter(0);
        cn.accept(cw);
        return cw.toByteArray();
    }

    static byte[] createHolderClass() {
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

    static byte[] readAll(ZipFile zf, ZipEntry entry) throws IOException {
        var baos = new ByteArrayOutputStream();
        try (InputStream is = zf.getInputStream(entry)) { is.transferTo(baos); }
        return baos.toByteArray();
    }
}
