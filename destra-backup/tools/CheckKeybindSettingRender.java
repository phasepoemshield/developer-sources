import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;

public final class CheckKeybindSettingRender {
    public static void main(String[] args) throws Exception {
        String path = ".precompiled/ru/destra/gui/KeybindSettingElement.class";
        byte[] data = Files.readAllBytes(Path.of(path));
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        System.out.println("Super: " + cn.superName);

        // Check the render method
        for (MethodNode m : cn.methods) {
            if (m.desc.contains("DrawContext") && m.desc.contains("II") && m.instructions.size() > 100) {
                System.out.println("\n=== " + m.name + m.desc + " (" + m.instructions.size() + " insns) ===");

                int ownFloatGets = 0;
                int parentFloatGets = 0;
                int ownFloatPuts = 0;

                for (AbstractInsnNode insn : m.instructions) {
                    if (insn instanceof FieldInsnNode) {
                        FieldInsnNode fn = (FieldInsnNode) insn;
                        if ("F".equals(fn.desc)) {
                            if (fn.owner.equals(cn.name)) {
                                if (insn.getOpcode() == Opcodes.GETFIELD) ownFloatGets++;
                                if (insn.getOpcode() == Opcodes.PUTFIELD) ownFloatPuts++;
                            } else {
                                if (insn.getOpcode() == Opcodes.GETFIELD) parentFloatGets++;
                            }
                        }
                    }
                }
                System.out.printf("  own GETFIELD F=%d, own PUTFIELD F=%d, parent GETFIELD F=%d%n",
                    ownFloatGets, ownFloatPuts, parentFloatGets);
            }
        }

        // List all instance float fields
        System.out.println("\n=== Instance float fields ===");
        for (FieldNode fn : cn.fields) {
            if ("F".equals(fn.desc) && (fn.access & Opcodes.ACC_STATIC) == 0) {
                String hex = "";
                for (int i = 0; i < fn.name.length(); i++) hex += String.format("U+%04X ", (int) fn.name.charAt(i));
                System.out.printf("  %s [%s]%n", fn.name, hex.trim());
            }
        }
    }
}
