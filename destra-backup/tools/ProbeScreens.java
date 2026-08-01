import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;

public final class ProbeScreens {
    public static void main(String[] args) throws Exception {
        String[] names = {
            "ru/destra/gui/AbstractScaledScreen",
            "ru/destra/gui/CustomOptionsScreen",
            "ru/destra/gui/CustomServerListScreen",
            "ru/destra/gui/SelectWorldScreen"
        };
        PrintStream o = new PrintStream(new FileOutputStream(FileDescriptor.out), true, "UTF-8");
        for (String nm : names) {
            Path p = Path.of(".precompiled/" + nm + ".class");
            if (!Files.exists(p)) { o.println("=== " + nm + " : NOT FOUND ==="); continue; }
            ClassReader cr = new ClassReader(Files.readAllBytes(p));
            ClassNode cn = new ClassNode();
            cr.accept(cn, 0);
            o.println("=== " + nm + "  super=" + cn.superName
                    + "  abstract=" + ((cn.access & Opcodes.ACC_ABSTRACT) != 0) + " ===");
            for (FieldNode f : cn.fields) {
                if ((f.access & Opcodes.ACC_STATIC) == 0)
                    o.println("  field " + f.desc + " " + show(f.name));
            }
            for (MethodNode m : cn.methods) {
                if ("<init>".equals(m.name)) {
                    o.println("  -- <init> " + m.desc);
                    for (AbstractInsnNode i : m.instructions) {
                        if (i instanceof FieldInsnNode && i.getOpcode() == Opcodes.PUTFIELD) {
                            FieldInsnNode f = (FieldInsnNode) i;
                            o.println("     PUTFIELD owner=" + shortN(f.owner) + " name=" + show(f.name) + " desc=" + f.desc);
                        }
                    }
                }
            }
        }
    }
    static String shortN(String n){ return n==null?"":n.substring(n.lastIndexOf('/')+1); }
    static String show(String n){
        StringBuilder sb=new StringBuilder(); boolean na=false;
        for(int i=0;i<n.length();i++){char c=n.charAt(i); if(c>=128){na=true;sb.append(String.format("U+%04X",(int)c));}else sb.append(c);}
        return na? sb+" [orig]" : sb.toString();
    }
}
