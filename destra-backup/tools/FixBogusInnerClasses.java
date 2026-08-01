import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class FixBogusInnerClasses {
    public static void main(String[] args) throws Exception {
        String root = ".precompiled";
        if (args.length > 0) root = args[0];
        int fixed = 0;
        Path rootPath = Path.of(root);
        try (var s = Files.walk(rootPath)) {
            var files = s.filter(p -> p.toString().endsWith(".class")).toList();
            for (Path p : files) {
                byte[] bytes = Files.readAllBytes(p);
                ClassReader cr = new ClassReader(bytes);
                ClassNode cn = new ClassNode();
                cr.accept(cn, 0);
                boolean changed = false;
                String className = cn.name;
                boolean isInnerClass = className.contains("$");

                if (cn.innerClasses != null && !cn.innerClasses.isEmpty() && !isInnerClass) {
                    cn.innerClasses.clear();
                    changed = true;
                }

                if (!isInnerClass && cn.interfaces != null && !cn.interfaces.isEmpty() && !className.contains("Mixin") && !className.contains("Accessor")) {
                    List<String> toRemove = new ArrayList<>();
                    for (String iface : cn.interfaces) {
                        if (iface.equals("java/util/function/Predicate")) {
                            boolean hasTest = false;
                            for (MethodNode m : cn.methods) {
                                if (m.name.equals("test") && m.desc.equals("(Ljava/lang/Object;)Z")) {
                                    hasTest = true;
                                    break;
                                }
                            }
                            if (!hasTest) {
                                toRemove.add(iface);
                            }
                        }
                    }
                    if (!toRemove.isEmpty()) {
                        cn.interfaces.removeAll(toRemove);
                        changed = true;
                        System.out.println("Removed bogus interfaces from " + className + ": " + toRemove);
                    }
                }

                if (changed) {
                    ClassWriter cw = new ClassWriter(0);
                    cn.accept(cw);
                    byte[] out = cw.toByteArray();
                    Files.write(p, out);
                    Path bc = Path.of("build/classes/java/main/" + rootPath.relativize(p).toString().replace('\\','/'));
                    if (Files.exists(bc)) Files.write(bc, out);
                    fixed++;
                    System.out.println("Fixed: " + p + " (" + out.length + " bytes)");
                }
            }
        }
        System.out.println("Total fixed: " + fixed);
    }
}
