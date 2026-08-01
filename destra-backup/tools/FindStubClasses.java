import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;
import java.util.*;

public final class FindStubClasses {
    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, StandardCharsets.UTF_8));
        Path ecDir = Path.of(".precompiled/sg/ec");
        File[] files = ecDir.toFile().listFiles((d, n) -> n.endsWith(".class"));
        int stubs = 0;
        int real = 0;
        for (File f : files) {
            byte[] data = Files.readAllBytes(f.toPath());
            ClassReader cr = new ClassReader(data);
            ClassNode cn = new ClassNode();
            cr.accept(cn, 0);
            boolean hasStubCtor = false;
            boolean hasRealCtor = false;
            for (MethodNode m : cn.methods) {
                if (m.name.equals("<init>") && m.desc.equals("()V")) {
                    int insnCount = m.instructions == null ? 0 : m.instructions.size();
                    if (insnCount <= 3) hasStubCtor = true;
                }
                if (m.name.equals("<init>") && !m.desc.equals("()V")) {
                    int insnCount = m.instructions == null ? 0 : m.instructions.size();
                    if (insnCount <= 4) hasStubCtor = true;
                    else hasRealCtor = true;
                }
            }
            int fieldCount = cn.fields.size();
            if (hasStubCtor && fieldCount > 0) {
                System.out.println("STUB: " + f.getName() + " (" + cn.name + ") fields=" + fieldCount);
                for (FieldNode fld : cn.fields) System.out.println("  " + fld.name + " " + fld.desc);
                stubs++;
            } else {
                real++;
            }
        }
        System.out.println("\nStubs: " + stubs + " Real: " + real);
    }
}
