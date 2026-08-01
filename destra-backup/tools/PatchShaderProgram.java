import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.nio.file.*;

public final class PatchShaderProgram {
    static final String OLD_OWNER = "org/lwjgl/opengl/GL20";
    static final String OLD_NAME = "glShaderSource";
    static final String OLD_DESC = "(ILjava/lang/CharSequence;)V";
    static final String NEW_OWNER = "ru/destra/render/GlShaderHelper";
    static final String NEW_NAME = "shaderSource";
    static final String NEW_DESC = "(ILjava/lang/String;)V";

    public static void main(String[] args) throws Exception {
        Path classFile = Path.of(".precompiled/ru/destra/render/ShaderProgram.class");
        byte[] data = Files.readAllBytes(classFile);
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        int patched = 0;
        for (MethodNode m : cn.methods) {
            for (AbstractInsnNode insn : m.instructions) {
                if (insn instanceof MethodInsnNode) {
                    MethodInsnNode min = (MethodInsnNode) insn;
                    if (min.getOpcode() == Opcodes.INVOKESTATIC
                            && OLD_OWNER.equals(min.owner)
                            && OLD_NAME.equals(min.name)
                            && OLD_DESC.equals(min.desc)) {
                        min.owner = NEW_OWNER;
                        min.name = NEW_NAME;
                        min.desc = NEW_DESC;
                        patched++;
                        System.err.println("  Patched glShaderSource call in " + m.name + m.desc);
                    }
                }
            }
        }

        ClassWriter cw = new ClassWriter(0);
        cn.accept(cw);
        Files.write(classFile, cw.toByteArray());
        System.err.println("PatchShaderProgram: patched " + patched + " call(s)");
    }
}
