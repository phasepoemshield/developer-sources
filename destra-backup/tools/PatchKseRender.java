import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.nio.file.*;
import java.util.*;

public final class PatchKseRender {
    public static void main(String[] args) throws Exception {
        Path classFile = Path.of(args[0]);
        byte[] data = Files.readAllBytes(classFile);
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        String renderMethodDesc = "(Lnet/minecraft/client/gui/DrawContext;II)V";

        for (MethodNode method : cn.methods) {
            if (renderMethodDesc.equals(method.desc) && method.name.length() == 1) {
                System.out.println("Found render method: " + method.name + method.desc);

                InsnList inject = new InsnList();
                inject.add(new VarInsnNode(Opcodes.ALOAD, 0));
                inject.add(new VarInsnNode(Opcodes.ALOAD, 1));
                inject.add(new VarInsnNode(Opcodes.ILOAD, 2));
                inject.add(new VarInsnNode(Opcodes.ILOAD, 3));
                inject.add(new VarInsnNode(Opcodes.FLOAD, 4));
                inject.add(new MethodInsnNode(Opcodes.INVOKESTATIC,
                    "ru/destra/fix/ModuleRenderHelper",
                    "renderModule",
                    "(Ljava/lang/Object;Lnet/minecraft/client/gui/DrawContext;II)Z",
                    false));
                LabelNode skipLabel = new LabelNode();
                inject.add(new JumpInsnNode(Opcodes.IFEQ, skipLabel));
                inject.add(new InsnNode(Opcodes.RETURN));
                inject.add(skipLabel);

                method.instructions.insert(inject);
                System.out.println("Injected render override at HEAD of " + method.name);
                break;
            }
        }

        ClassWriter cw = new ClassWriter(0);
        cn.accept(cw);
        byte[] result = cw.toByteArray();
        Files.write(classFile, result);
        System.out.println("Patched: " + data.length + " -> " + result.length + " bytes");
    }
}
