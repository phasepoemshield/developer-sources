import java.io.*;
import java.nio.file.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;

public final class PatchWorldParticlesStdout {
    static final String NAMESPACE = "destra";
    static final String[] TEXTURE_PATHS = {
        "images/particles/star.png",       // 0 STAR
        "images/particles/heart.png",      // 1 HEART
        "images/particles/snowflake.png",  // 2 SNOWFLAKE
        "images/particles/logo.png",       // 3 LOGO
        "images/particles/glow.png",       // 4 ORBEEZ
        "images/particles/sparkle.png",    // 5 CROSS
        "images/particles/particle1.png",  // 6 SHARDS
        "images/particles/particle2.png",  // 7 CUBES
        "images/particles/particle2.png",  // 8 PYRAMIDS
    };

    public static void main(String[] args) throws Exception {
        if (args.length < 1) { System.err.println("Usage: PatchWorldParticlesStdout <classfile>"); System.exit(1); }
        byte[] data = Files.readAllBytes(Path.of(args[0]));
        ClassNode cn = new ClassNode();
        new ClassReader(data).accept(cn, 0);

        for (MethodNode mn : cn.methods) {
            if (mn.name.equals("getTextureId") && mn.desc.equals("(Lru/destra/particle/ParticleShapeType;)Lnet/minecraft/util/Identifier;")) {
                InsnList body = new InsnList();
                LabelNode[] labels = new LabelNode[TEXTURE_PATHS.length];
                for (int i = 0; i < labels.length; i++) labels[i] = new LabelNode();
                LabelNode defaultLabel = new LabelNode();
                LabelNode endLabel = new LabelNode();

                body.add(new VarInsnNode(Opcodes.ALOAD, 1));
                body.add(new MethodInsnNode(Opcodes.INVOKEVIRTUAL, "ru/destra/particle/ParticleShapeType", "ordinal", "()I", false));
                body.add(new TableSwitchInsnNode(0, TEXTURE_PATHS.length - 1, defaultLabel, labels));

                for (int i = 0; i < TEXTURE_PATHS.length; i++) {
                    body.add(labels[i]);
                    body.add(new LdcInsnNode(NAMESPACE));
                    body.add(new LdcInsnNode(TEXTURE_PATHS[i]));
                    body.add(new MethodInsnNode(Opcodes.INVOKESTATIC, "net/minecraft/util/Identifier", "of", "(Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/util/Identifier;", false));
                    body.add(new JumpInsnNode(Opcodes.GOTO, endLabel));
                }
                body.add(defaultLabel);
                body.add(new LdcInsnNode(NAMESPACE));
                body.add(new LdcInsnNode(TEXTURE_PATHS[0]));
                body.add(new MethodInsnNode(Opcodes.INVOKESTATIC, "net/minecraft/util/Identifier", "of", "(Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/util/Identifier;", false));
                body.add(endLabel);
                body.add(new InsnNode(Opcodes.ARETURN));

                mn.instructions = body;
                mn.maxStack = 2;
                mn.maxLocals = 2;
                mn.tryCatchBlocks = null;
                System.err.println("  Rewrote getTextureId with hardcoded paths");
            }
        }

        ClassWriter cw = new ClassWriter(0);
        cn.accept(cw);
        byte[] out = cw.toByteArray();
        FileOutputStream rawOut = new FileOutputStream(FileDescriptor.out);
        rawOut.write(out);
        rawOut.flush();
        rawOut.close();
        System.err.println("Written " + out.length + " bytes to stdout");
    }
}
