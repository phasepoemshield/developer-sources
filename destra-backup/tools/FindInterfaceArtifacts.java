import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;

// Find abstract classes that should be interfaces (decompiler artifact):
// - is abstract class (not interface)
// - has implementers (other classes list it in interfaces) but no extenders (no class has it as super)
// - has no instance fields (interface fields must be public static final)
// These cause IncompatibleClassChangeError when an implementer tries to load.
public class FindInterfaceArtifacts {
    public static void main(String[] args) throws Exception {
        String root = args.length > 0 ? args[0] : ".precompiled/ru/destra";
        // Pass 1: load all classes
        Map<String, ClassNode> all = new HashMap<>();
        Files.walk(Path.of(root)).filter(p -> p.toString().endsWith(".class")).forEach(p -> {
            try {
                ClassNode cn = new ClassNode();
                new ClassReader(Files.readAllBytes(p)).accept(cn, ClassReader.SKIP_CODE | ClassReader.SKIP_DEBUG | ClassReader.SKIP_FRAMES);
                all.put(cn.name, cn);
            } catch (Exception e) {}
        });
        // Count extenders and implementers per class
        Map<String, Integer> extenders = new HashMap<>();
        Map<String, Integer> implementers = new HashMap<>();
        for (ClassNode cn : all.values()) {
            if (cn.superName != null) extenders.merge(cn.superName, 1, Integer::sum);
            if (cn.interfaces != null) for (String i : cn.interfaces) implementers.merge(i, 1, Integer::sum);
        }
        // Find candidates
        List<String> candidates = new ArrayList<>();
        for (ClassNode cn : all.values()) {
            if ((cn.access & Opcodes.ACC_INTERFACE) != 0) continue; // already interface
            if ((cn.access & Opcodes.ACC_ABSTRACT) == 0) continue;  // not abstract
            if ((cn.access & Opcodes.ACC_ANNOTATION) != 0) continue;
            int ext = extenders.getOrDefault(cn.name, 0);
            int impl = implementers.getOrDefault(cn.name, 0);
            if (impl == 0) continue;          // nobody implements it
            if (ext > 0) continue;            // somebody extends it -> must stay class
            // Check no instance (non-static) fields
            boolean hasInstanceField = false;
            for (FieldNode f : cn.fields) {
                if ((f.access & Opcodes.ACC_STATIC) == 0) { hasInstanceField = true; break; }
            }
            if (hasInstanceField) continue;
            candidates.add(cn.name.replace('/', '.'));
        }
        Collections.sort(candidates);
        System.out.println("=== Abstract classes that should be interfaces (" + candidates.size() + ") ===");
        for (String c : candidates) {
            int impl = implementers.getOrDefault(c.replace('.', '/'), 0);
            System.out.println("  " + c + "  implementers=" + impl);
        }
    }
}
