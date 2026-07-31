import org.objectweb.asm.*;
import java.nio.file.*;

public final class CountReturns {
    public static void main(String[] args) throws Exception {
        byte[] data = Files.readAllBytes(Path.of(args[0]));
        ClassReader cr = new ClassReader(data);
        cr.accept(new ClassVisitor(Opcodes.ASM9) {
            @Override
            public MethodVisitor visitMethod(int access, String name, String desc, String sig, String[] exc) {
                if ("<clinit>".equals(name)) {
                    return new MethodVisitor(Opcodes.ASM9) {
                        int count = 0;
                        @Override
                        public void visitInsn(int opcode) {
                            if (opcode == Opcodes.RETURN) {
                                count++;
                                System.out.println("  RETURN #" + count);
                            }
                            super.visitInsn(opcode);
                        }
                        @Override
                        public void visitEnd() {
                            System.out.println("Total RETURNs in <clinit>: " + count);
                        }
                    };
                }
                return null;
            }
        }, 0);
    }
}
