import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;

public final class PatchKSESetBounds {
    static final String PATH = ".precompiled/ru/destra/gui/KeybindSettingElement.class";

    public static void main(String[] args) throws Exception {
        byte[] data = Files.readAllBytes(Path.of(PATH));
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, ClassReader.EXPAND_FRAMES);

        for (MethodNode m : cn.methods) {
            if (m.desc.equals("(FFFF)V") && m.instructions.size() < 30) {
                System.out.println("Patching setBounds " + m.name + m.desc);

                // Find the obfuscated field PUTFIELDs and swap their FLOAD indices
                // Original: ?щ = FLOAD 1, ?э = FLOAD 2  (SWAPPED)
                // Fix:      ?щ = FLOAD 2, ?э = FLOAD 1  (CORRECT)

                // Collect all VarInsnNode + FieldInsnNode pairs
                java.util.List<VarInsnNode> varLoads = new java.util.ArrayList<>();
                java.util.List<FieldInsnNode> fieldPuts = new java.util.ArrayList<>();
                java.util.List<AbstractInsnNode> obfPuts = new java.util.ArrayList<>();

                AbstractInsnNode prevVar = null;
                for (AbstractInsnNode insn : m.instructions) {
                    if (insn instanceof VarInsnNode && insn.getOpcode() == Opcodes.FLOAD) {
                        prevVar = (VarInsnNode) insn;
                    }
                    if (insn instanceof FieldInsnNode && insn.getOpcode() == Opcodes.PUTFIELD) {
                        FieldInsnNode fn = (FieldInsnNode) insn;
                        // Only obfuscated fields (not parent x/y/width/height)
                        if (fn.owner.equals(cn.name) && "F".equals(fn.desc) && prevVar != null) {
                            obfPuts.add(insn);
                            System.out.println("  Found obf PUTFIELD " + fn.name + " = FLOAD " + ((VarInsnNode)prevVar).var);
                        }
                    }
                }

                // Now swap: for each obfuscated PUTFIELD, find the preceding FLOAD and swap var index
                // ?щ should get FLOAD 2 (was 1), ?э should get FLOAD 1 (was 2)
                for (AbstractInsnNode insn : m.instructions) {
                    if (insn instanceof FieldInsnNode && insn.getOpcode() == Opcodes.PUTFIELD) {
                        FieldInsnNode fn = (FieldInsnNode) insn;
                        if (!fn.owner.equals(cn.name) || !"F".equals(fn.desc)) continue;

                        // Find preceding FLOAD
                        AbstractInsnNode prev = insn.getPrevious();
                        while (prev != null && !(prev instanceof VarInsnNode && prev.getOpcode() == Opcodes.FLOAD)) {
                            prev = prev.getPrevious();
                        }
                        if (prev == null) continue;
                        VarInsnNode vload = (VarInsnNode) prev;

                        // Swap: if var==1 → var=2, if var==2 → var=1
                        if (vload.var == 1) {
                            vload.var = 2;
                            System.out.println("  Swapped FLOAD 1→2 for " + fn.name);
                        } else if (vload.var == 2) {
                            vload.var = 1;
                            System.out.println("  Swapped FLOAD 2→1 for " + fn.name);
                        }
                    }
                }
                break;
            }
        }

        ClassWriter cw = new ClassWriter(0);
        cn.accept(cw);
        byte[] result = cw.toByteArray();
        FileOutputStream fos = new FileOutputStream(PATH);
        fos.write(result);
        fos.flush();
        fos.getFD().sync();
        fos.close();
        System.out.println("Written " + result.length + " bytes");
    }
}
