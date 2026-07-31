import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public final class FixInvokerSelfRecursion {
    public static void main(String[] args) throws Exception {
        Path dir = Path.of(".precompiled/sg/mx");
        int fixed = 0;
        try (var s = Files.list(dir)) {
            var files = s.filter(p -> p.toString().endsWith(".class")).toList();
            for (Path p : files) {
                ClassNode cn = new ClassNode();
                new ClassReader(Files.readAllBytes(p)).accept(cn, 0);
                boolean changed = false;
                for (MethodNode m : cn.methods) {
                    if (m.visibleAnnotations == null) continue;
                    for (AnnotationNode a : m.visibleAnnotations) {
                        if (!"Lorg/spongepowered/asm/mixin/gen/Invoker;".equals(a.desc) && !"Lorg/spongepowered/asm/mixin/gen/Accessor;".equals(a.desc)) continue;
                        // Get the annotation value
                        String annValue = null;
                        if (a.values != null) {
                            for (int i = 0; i < a.values.size(); i += 2) {
                                if ("value".equals(a.values.get(i))) {
                                    Object v = a.values.get(i + 1);
                                    if (v instanceof String) annValue = (String) v;
                                    break;
                                }
                            }
                        }
                        if (annValue == null) continue;
                        // If method name == annotation value, rename method to avoid self-recursion
                        if (m.name.equals(annValue)) {
                            String prefix = "Lorg/spongepowered/asm/mixin/gen/Invoker;".equals(a.desc) ? "invoke" : "access";
                            // Generate a unique name: prefix + capitalized annotation value
                            String newName = prefix + Character.toUpperCase(annValue.charAt(0)) + annValue.substring(1);
                            // If name already exists, append a number
                            int suffix = 0;
                            Set<String> existing = new HashSet<>();
                            for (MethodNode mm : cn.methods) existing.add(mm.name);
                            while (existing.contains(newName)) { newName = prefix + Character.toUpperCase(annValue.charAt(0)) + annValue.substring(1) + "_" + (++suffix); }
                            System.out.println("  " + p.getFileName() + " :: @" + ("Lorg/spongepowered/asm/mixin/gen/Invoker;".equals(a.desc) ? "Invoker" : "Accessor") + " method " + m.name + " -> " + newName + " (value stays " + annValue + ")");
                            m.name = newName;
                            changed = true;
                            fixed++;
                        }
                    }
                }
                if (changed) {
                    ClassWriter cw = new ClassWriter(0);
                    cn.accept(cw);
                    byte[] out = cw.toByteArray();
                    Files.write(p, out);
                    Path bc = Path.of("build/classes/java/main/sg/mx/" + p.getFileName());
                    if (Files.exists(bc)) Files.write(bc, out);
                }
            }
        }
        System.out.println("Fixed " + fixed + " @Invoker/@Accessor self-recursion methods");
    }
}
