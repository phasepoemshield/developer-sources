package codex.fakeplayer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public final class InjectTargetEspFallback {
    private static final String TARGET_ESP_OWNER = "fun/wonderful/client/modules/impl/render/TargetESP";
    private static final String FAKE_PLAYER_OWNER = "codex/fakeplayer/FakePlayerModule";

    private InjectTargetEspFallback() {
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
                if (!"onRender3D".equals(name) || !"(Lfun/wonderful/api/events/implement/Event3DRender;)V".equals(descriptor)) {
                    return visitor;
                }
                return new MethodVisitor(Opcodes.ASM9, visitor) {
                    private boolean injected;

                    @Override
                    public void visitVarInsn(int opcode, int varIndex) {
                        super.visitVarInsn(opcode, varIndex);
                        if (!injected && opcode == Opcodes.ASTORE && varIndex == 4) {
                            injected = true;
                            super.visitVarInsn(Opcodes.ALOAD, 4);
                            super.visitMethodInsn(Opcodes.INVOKESTATIC, FAKE_PLAYER_OWNER, "getTargetForEsp", "(Lnet/minecraft/class_1309;)Lnet/minecraft/class_1309;", false);
                            super.visitVarInsn(Opcodes.ASTORE, 4);
                        }
                    }

                    @Override
                    public void visitEnd() {
                        if (!injected) {
                            throw new IllegalStateException("Could not find TargetESP target local in " + TARGET_ESP_OWNER);
                        }
                        super.visitEnd();
                    }
                };
            }
        }, 0);
        Files.write(Path.of(args[1]), writer.toByteArray());
    }
}
