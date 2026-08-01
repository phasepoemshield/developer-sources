import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;

public final class CheckScaledResolution {
    public static void main(String[] args) throws Exception {
        for (String name : new String[]{"getScaledWidth", "getScaledHeight"}) {
            String path = ".precompiled/ru/destra/render/ScaledResolution.class";
            File f = new File(path);
            if (!f.exists()) continue;
            byte[] data = Files.readAllBytes(f.toPath());
            ClassReader cr = new ClassReader(data);
            ClassNode cn = new ClassNode();
            cr.accept(cn, 0);
            for (MethodNode m : cn.methods) {
                if (m.name.equals(name)) {
                    System.out.println("=== ScaledResolution." + name + m.desc + " (" + m.instructions.size() + " insns) ===");
                    for (AbstractInsnNode insn : m.instructions) {
                        if (insn.getType() == AbstractInsnNode.LINE || insn.getType() == AbstractInsnNode.LABEL) continue;
                        if (insn instanceof MethodInsnNode) {
                            MethodInsnNode mn = (MethodInsnNode) insn;
                            System.out.printf("  %s %s.%s%s%n", insn.getOpcode()==Opcodes.INVOKESTATIC?"INVOKESTATIC":"INVOKEVIRTUAL",
                                mn.owner.substring(mn.owner.lastIndexOf('/')+1), mn.name, mn.desc);
                        } else if (insn instanceof FieldInsnNode) {
                            FieldInsnNode fn = (FieldInsnNode) insn;
                            System.out.printf("  %s %s.%s%n", insn.getOpcode()==Opcodes.GETFIELD?"GETFIELD":"GETSTATIC",
                                fn.owner.substring(fn.owner.lastIndexOf('/')+1), fn.name);
                        } else {
                            System.out.printf("  OP_%d%n", insn.getOpcode());
                        }
                    }
                }
            }
        }
    }
}
