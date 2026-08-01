import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public final class PatchScoreboardSingleplayer {
    static final String CLASS = "ru/destra/module/ScoreboardHudModule";
    static final String SERVER_PROVIDER = "ru/destra/network/ServerPlaceholderProvider";
    static final String GET_SERVER_ADDRESS = "getServerAddress";
    static final String SINGLEPLAYER = "singleplayer";

    public static void main(String[] args) throws Exception {
        Path classFile = Path.of(".precompiled/ru/destra/module/ScoreboardHudModule.class");
        if (!Files.exists(classFile)) {
            System.err.println("ScoreboardHudModule.class not found: " + classFile);
            return;
        }

        byte[] data = Files.readAllBytes(classFile);
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        boolean patched = false;
        for (MethodNode mn : cn.methods) {
            if (mn.name.equals("onRender2D") && mn.desc.equals("(Lru/destra/event/Render2DEvent;)V") && mn.instructions != null && mn.instructions.size() > 0) {
                System.err.println("Patching onRender2D in ScoreboardHudModule");

                InsnList inject = new InsnList();
                // if ("singleplayer".equals(ServerPlaceholderProvider.getServerAddress())) return;
                inject.add(new MethodInsnNode(Opcodes.INVOKESTATIC, SERVER_PROVIDER, GET_SERVER_ADDRESS, "()Ljava/lang/String;", false));
                inject.add(new LdcInsnNode(SINGLEPLAYER));
                inject.add(new MethodInsnNode(Opcodes.INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false));
                LabelNode skip = new LabelNode();
                inject.add(new JumpInsnNode(Opcodes.IFEQ, skip));
                inject.add(new InsnNode(Opcodes.RETURN));
                inject.add(skip);

                mn.instructions.insert(inject);

                mn.tryCatchBlocks.clear();
                mn.localVariables = null;
                patched = true;
                break;
            }
        }

        if (patched) {
            ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS) {
                @Override
                protected String getCommonSuperClass(String type1, String type2) {
                    return "java/lang/Object";
                }
            };
            cn.accept(cw);
            Files.write(classFile, cw.toByteArray());
            System.err.println("PatchScoreboardSingleplayer: patched " + classFile);
        } else {
            System.err.println("PatchScoreboardSingleplayer: onRender2D not found");
        }
    }
}
