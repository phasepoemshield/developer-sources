import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;

public final class CheckInitLists {
    public static void main(String[] args) throws Exception {
        String path = ".precompiled/ru/destra/gui/ClickGuiScreen.class";
        byte[] data = Files.readAllBytes(Path.of(path));
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        for (MethodNode m : cn.methods) {
            if ("<init>".equals(m.name)) {
                System.out.println("=== <init> (" + m.instructions.size() + " insns) ===");
                int offset = 0;
                for (AbstractInsnNode insn : m.instructions) {
                    if (insn.getType() == AbstractInsnNode.LINE || insn.getType() == AbstractInsnNode.LABEL) continue;
                    if (insn instanceof FieldInsnNode) {
                        FieldInsnNode fn = (FieldInsnNode) insn;
                        if (fn.name.equals("leftColumnModules") || fn.name.equals("rightColumnModules") ||
                            fn.name.equals("moduleElements") || fn.name.equals("filteredModuleCache")) {
                            System.out.printf("  %4d: %s %s.%s %s%n", offset,
                                insn.getOpcode()==Opcodes.PUTFIELD?"PUTFIELD":"GETFIELD",
                                fn.owner.substring(fn.owner.lastIndexOf('/')+1), fn.name, fn.desc);
                        }
                    }
                    offset++;
                }
            }
        }
    }
}
