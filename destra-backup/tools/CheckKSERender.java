import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;

public final class CheckKSERender {
    public static void main(String[] args) throws Exception {
        String path = ".precompiled/ru/destra/gui/KeybindSettingElement.class";
        byte[] data = Files.readAllBytes(Path.of(path));
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        for (MethodNode m : cn.methods) {
            if (m.desc.contains("DrawContext") && m.desc.contains("II") && m.instructions.size() > 100) {
                System.out.println("=== " + m.name + m.desc + " (" + m.instructions.size() + " insns) ===");
                int ownGets = 0, parentGets = 0;
                for (AbstractInsnNode insn : m.instructions) {
                    if (insn instanceof FieldInsnNode) {
                        FieldInsnNode fn = (FieldInsnNode) insn;
                        if ("F".equals(fn.desc) && insn.getOpcode() == Opcodes.GETFIELD) {
                            if (fn.owner.equals(cn.name)) ownGets++;
                            else parentGets++;
                        }
                    }
                }
                System.out.printf("  own GETFIELD F=%d, parent GETFIELD F=%d%n", ownGets, parentGets);
            }
        }
    }
}
