package codex.fakeplayer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public final class InjectFakePlayerBootstrap {
    private static final String RESCUE_OWNER = "codex/wonderfulrescue/WonderfulRescueClient";
    private static final String FAKE_BOOTSTRAP_OWNER = "codex/fakeplayer/FakePlayerBootstrap";

    private InjectFakePlayerBootstrap() {
    }

    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            throw new IllegalArgumentException("Usage: <input class> <output class>");
        }

        ClassReader reader = new ClassReader(Files.readAllBytes(Path.of(args[0])));
        ClassWriter writer = new ClassWriter(reader, 0);
        reader.accept(new ClassVisitor(Opcodes.ASM9, writer) {
            @Override
            public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
                MethodVisitor visitor = super.visitMethod(access, name, descriptor, signature, exceptions);
                if (!"onInitializeClient".equals(name) || !"()V".equals(descriptor)) {
                    return visitor;
                }
                return new MethodVisitor(Opcodes.ASM9, visitor) {
                    private boolean injected;

                    @Override
                    public void visitMethodInsn(int opcode, String owner, String methodName, String methodDescriptor, boolean isInterface) {
                        super.visitMethodInsn(opcode, owner, methodName, methodDescriptor, isInterface);
                        if (!injected && opcode == Opcodes.INVOKESTATIC && RESCUE_OWNER.equals(owner)
                                && "ensureModulesInitialized".equals(methodName) && "()V".equals(methodDescriptor)) {
                            injected = true;
                            super.visitTypeInsn(Opcodes.NEW, FAKE_BOOTSTRAP_OWNER);
                            super.visitInsn(Opcodes.DUP);
                            super.visitMethodInsn(Opcodes.INVOKESPECIAL, FAKE_BOOTSTRAP_OWNER, "<init>", "()V", false);
                            super.visitMethodInsn(Opcodes.INVOKEVIRTUAL, FAKE_BOOTSTRAP_OWNER, "onInitializeClient", "()V", false);
                        }
                    }

                    @Override
                    public void visitEnd() {
                        if (!injected) {
                            throw new IllegalStateException("Could not find module initialization call in " + RESCUE_OWNER);
                        }
                        super.visitEnd();
                    }
                };
            }
        }, 0);
        Files.write(Path.of(args[1]), writer.toByteArray());
    }
}
