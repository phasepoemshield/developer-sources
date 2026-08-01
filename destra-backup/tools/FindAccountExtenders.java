import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;

// Find classes that extend Account (superName == Account) — these would break if Account
// is converted from abstract class to interface (can't extend an interface).
public class FindAccountExtenders {
    public static void main(String[] args) throws Exception {
        String root = args.length > 0 ? args[0] : ".precompiled/ru/destra";
        String target = "ru/destra/social/Account";
        int[] counts = new int[2]; // extenders, implementers
        List<String> impl = new ArrayList<>(), ext = new ArrayList<>();
        Files.walk(Path.of(root)).filter(p -> p.toString().endsWith(".class")).forEach(p -> {
            try {
                ClassNode cn = new ClassNode();
                new ClassReader(Files.readAllBytes(p)).accept(cn, ClassReader.SKIP_CODE | ClassReader.SKIP_DEBUG | ClassReader.SKIP_FRAMES);
                if (target.equals(cn.superName)) { ext.add(cn.name.replace('/','.')); counts[0]++; }
                if (cn.interfaces != null && cn.interfaces.contains(target)) { impl.add(cn.name.replace('/','.')); counts[1]++; }
            } catch (Exception e) {}
        });
        System.out.println("=== Classes that EXTEND Account (superName=Account): " + counts[0] + " ===");
        for (String s : ext) System.out.println("  " + s);
        System.out.println("=== Classes that IMPLEMENT Account (in interfaces list): " + counts[1] + " ===");
        for (String s : impl) System.out.println("  " + s);
    }
}
