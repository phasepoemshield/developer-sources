import org.objectweb.asm.*;
import java.nio.file.*;

public final class AsmPatchClickGui {
    static final String CLASS = "ru/destra/gui/ClickGuiScreen";
    static final String FIELD_NS = "\u0448\u0423\u0416";
    static final String FIELD_PATH = "\u0448\u0423\u042C";

    public static void main(String[] args) throws Exception {
        if (args.length != 1) throw new IllegalArgumentException("Expected class file path");
        Path classFile = Path.of(args[0]);
        byte[] data = Files.readAllBytes(classFile);

        boolean[] alreadyPatched = {false};

        ClassReader cr = new ClassReader(data);
        ClassWriter cw = new ClassWriter(cr, ClassWriter.COMPUTE_MAXS);

        ClassVisitor cv = new ClassVisitor(Opcodes.ASM9, cw) {
            @Override
            public MethodVisitor visitMethod(int access, String name, String desc, String sig, String[] exc) {
                MethodVisitor mv = super.visitMethod(access, name, desc, sig, exc);
                if ("<clinit>".equals(name)) {
                    return new ClinitPatcher(mv, alreadyPatched);
                }
                return mv;
            }
        };

        cr.accept(cv, 0);
        if (alreadyPatched[0]) {
            System.out.println("Already patched");
            return;
        }
        byte[] result = cw.toByteArray();
        Files.write(classFile, result);
        System.out.println("ASM patched: " + data.length + " -> " + result.length + " bytes");
    }

    static class ClinitPatcher extends MethodVisitor {
        private final boolean[] alreadyPatched;
        private boolean hasStaticInit = false;

        ClinitPatcher(MethodVisitor delegate, boolean[] alreadyPatched) {
            super(Opcodes.ASM9, delegate);
            this.alreadyPatched = alreadyPatched;
        }

        @Override
        public void visitMethodInsn(int opcode, String owner, String name, String desc, boolean isInterface) {
            if (opcode == Opcodes.INVOKESTATIC && "staticInit".equals(name) && CLASS.equals(owner)) {
                hasStaticInit = true;
            }
            super.visitMethodInsn(opcode, owner, name, desc, isInterface);
        }

        @Override
        public void visitInsn(int opcode) {
            if (opcode == Opcodes.RETURN && !hasStaticInit) {
                Label skipInit = new Label();
                visitFieldInsn(Opcodes.GETSTATIC, CLASS, FIELD_NS, "Ljava/lang/String;");
                visitJumpInsn(Opcodes.IFNONNULL, skipInit);
                visitLdcInsn("destra");
                visitFieldInsn(Opcodes.PUTSTATIC, CLASS, FIELD_NS, "Ljava/lang/String;");
                visitLdcInsn("images/logoup.png");
                visitFieldInsn(Opcodes.PUTSTATIC, CLASS, FIELD_PATH, "Ljava/lang/String;");
                visitMethodInsn(Opcodes.INVOKESTATIC, CLASS, "staticInit", "()V", false);
                visitLabel(skipInit);
                System.out.println("Injected: field inits + staticInit() before RETURN");
            } else if (hasStaticInit) {
                alreadyPatched[0] = true;
            }
            super.visitInsn(opcode);
        }

        @Override
        public void visitEnd() {
            super.visitEnd();
        }
    }
}
