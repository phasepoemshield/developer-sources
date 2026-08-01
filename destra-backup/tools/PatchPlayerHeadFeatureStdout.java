import java.io.*;
import java.nio.file.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;

public final class PatchPlayerHeadFeatureStdout {
    public static void main(String[] args) throws Exception {
        if (args.length < 1) { System.err.println("Usage: PatchPlayerHeadFeatureStdout <classfile>"); System.exit(1); }
        byte[] data = Files.readAllBytes(Path.of(args[0]));
        ClassNode cn = new ClassNode();
        new ClassReader(data).accept(cn, 0);

        for (MethodNode mn : cn.methods) {
            if (mn.instructions == null) continue;
            for (AbstractInsnNode insn : mn.instructions) {
                if (insn instanceof MethodInsnNode min) {
                    // Replace getContextModel():EntityModel with context.getModel():EntityModel
                    // In 1.21.4 FeatureRenderer.getContextModel() returns null.
                    // context field (field_17155) holds FeatureRendererContext with getModel().
                    if (min.name.equals("getContextModel") && min.owner.equals(cn.name)) {
                        // Insert checkcast FeatureRendererAccessor before the call (stack has `this`).
                        InsnList inject = new InsnList();
                        inject.add(new TypeInsnNode(Opcodes.CHECKCAST, "sg/mx/FeatureRendererAccessor"));
                        mn.instructions.insertBefore(insn, inject);
                        // Replace the MethodInsnNode: invokeinterface destra$getContext()
                        min.setOpcode(Opcodes.INVOKEINTERFACE);
                        min.owner = "sg/mx/FeatureRendererAccessor";
                        min.name = "destra$getContext";
                        min.desc = "()Lnet/minecraft/client/render/entity/feature/FeatureRendererContext;";
                        min.itf = true;
                        // Insert invokevirtual getModel() right after destra$getContext()
                        // so the stack has EntityModel (matching original getContextModel return).
                        mn.instructions.insert(insn, new MethodInsnNode(Opcodes.INVOKEINTERFACE,
                                "net/minecraft/client/render/entity/feature/FeatureRendererContext",
                                "getModel", "()Lnet/minecraft/client/render/entity/model/EntityModel;", true));
                        System.err.println("  Replaced getContextModel -> FeatureRendererAccessor.destra$getContext().getModel() in " + mn.name);
                    }
                }
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
