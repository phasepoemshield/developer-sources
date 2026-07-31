import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;

public final class DebugFieldMatch {
    public static void main(String[] args) throws Exception {
        // Check what fields match our constants
        String gtiX = "\u5F1F\u044D";
        String gtiY = "\u5F1F\u0429";
        
        System.out.println("GTI_X codepoints: " + (int)gtiX.charAt(0) + " " + (int)gtiX.charAt(1));
        System.out.println("GTI_Y codepoints: " + (int)gtiY.charAt(0) + " " + (int)gtiY.charAt(1));
        
        String path = ".precompiled/ru/destra/gui/KeybindSettingElement.class";
        byte[] data = Files.readAllBytes(Path.of(path));
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);
        
        for (FieldNode fn : cn.fields) {
            if ("F".equals(fn.desc) && (fn.access & Opcodes.ACC_STATIC) == 0) {
                boolean matchX = fn.name.equals(gtiX);
                boolean matchY = fn.name.equals(gtiY);
                System.out.printf("  field '%s' cp=[%d %d] matchX=%b matchY=%b%n",
                    fn.name, (int)fn.name.charAt(0), fn.name.length() > 1 ? (int)fn.name.charAt(1) : -1,
                    matchX, matchY);
            }
        }
        
        // Also check the setBounds method field accesses
        for (MethodNode m : cn.methods) {
            if (m.desc.equals("(FFFF)V") && m.instructions.size() < 30) {
                System.out.println("\n=== setBounds field writes ===");
                int lastVar = -1;
                for (AbstractInsnNode insn : m.instructions) {
                    if (insn instanceof VarInsnNode) {
                        lastVar = ((VarInsnNode)insn).var;
                    }
                    if (insn instanceof FieldInsnNode && insn.getOpcode() == Opcodes.PUTFIELD) {
                        FieldInsnNode fin = (FieldInsnNode) insn;
                        boolean matchX = fin.name.equals(gtiX);
                        boolean matchY = fin.name.equals(gtiY);
                        System.out.printf("  FLOAD %d -> PUTFIELD %s.%s matchX=%b matchY=%b%n",
                            lastVar, fin.owner.substring(fin.owner.lastIndexOf('/')+1), fin.name, matchX, matchY);
                    }
                }
            }
        }
    }
}
