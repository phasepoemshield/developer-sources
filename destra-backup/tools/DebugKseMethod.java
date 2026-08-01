import org.objectweb.asm.*;
import java.nio.file.*;

public final class DebugKseMethod {
    public static void main(String[] args) throws Exception {
        byte[] data = Files.readAllBytes(Path.of(args[0]));
        ClassReader cr = new ClassReader(data);
        cr.accept(new ClassVisitor(Opcodes.ASM9) {
            @Override
            public MethodVisitor visitMethod(int access, String name, String desc, String sig, String[] exc) {
                if ("(FFFF)V".equals(desc)) {
                    System.out.println("Found bounds method: " + name + desc);
                    return new MethodVisitor(Opcodes.ASM9) {
                        @Override
                        public void visitFieldInsn(int opcode, String owner, String name, String descriptor) {
                            System.out.println("  putfield " + owner + "." + name + ":" + descriptor + " (opcode=" + opcode + ")");
                        }
                        @Override
                        public void visitVarInsn(int opcode, int var) {
                            System.out.println("  var" + var + " (opcode=" + opcode + ")");
                        }
                        @Override
                        public void visitInsn(int opcode) {
                            System.out.println("  insn " + opcode);
                        }
                    };
                }
                return null;
            }
        }, 0);
    }
}
