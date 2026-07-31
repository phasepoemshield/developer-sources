import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;

public final class AnalyzeIngameGuiMixinClinit {
    public static void main(String[] args) throws Exception {
        String path = ".precompiled/sg/mx/IngameGuiMixin.class";
        File f = new File(path);
        if (!f.exists()) { System.out.println("NOT FOUND"); return; }
        byte[] data = Files.readAllBytes(f.toPath());
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, ClassReader.EXPAND_FRAMES);

        System.out.println("=== Static Identifier fields ===");
        for (FieldNode fn : cn.fields) {
            if ((fn.access & Opcodes.ACC_STATIC) != 0 && fn.desc.equals("Lnet/minecraft/util/Identifier;")) {
                System.out.printf("  %s%n", fn.name);
            }
        }

        System.out.println("\n=== <clinit> bytecode ===");
        for (MethodNode m : cn.methods) {
            if ("<clinit>".equals(m.name)) {
                int offset = 0;
                for (AbstractInsnNode insn : m.instructions) {
                    if (insn.getType() == AbstractInsnNode.LINE || insn.getType() == AbstractInsnNode.LABEL) continue;
                    if (insn instanceof FieldInsnNode) {
                        FieldInsnNode fin = (FieldInsnNode) insn;
                        System.out.printf("  %4d: %s %s.%s %s%n", offset,
                            insn.getOpcode()==Opcodes.GETSTATIC?"GETSTATIC":"PUTSTATIC",
                            fin.owner.substring(fin.owner.lastIndexOf('/')+1), fin.name, fin.desc);
                    } else if (insn instanceof MethodInsnNode) {
                        MethodInsnNode mn = (MethodInsnNode) insn;
                        System.out.printf("  %4d: INVOKESTATIC %s.%s%s%n", offset,
                            mn.owner.substring(mn.owner.lastIndexOf('/')+1), mn.name, mn.desc);
                    } else if (insn instanceof LdcInsnNode) {
                        System.out.printf("  %4d: LDC %s%n", offset, ((LdcInsnNode)insn).cst);
                    } else {
                        System.out.printf("  %4d: OP_%d%n", offset, insn.getOpcode());
                    }
                    offset++;
                }
            }
        }
    }
}
