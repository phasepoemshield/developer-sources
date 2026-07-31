import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;
import java.util.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;

public final class RecomputeAllFrames {
    static Map<String, String> supers = new HashMap<>();
    static ClassLoader extLoader;

    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, StandardCharsets.UTF_8));
        Path root = Path.of(".precompiled");

        // Build hierarchy from precompiled classes
        try (var s = Files.walk(root)) {
            s.filter(p -> p.toString().endsWith(".class")).forEach(p -> {
                try {
                    ClassReader cr = new ClassReader(Files.readAllBytes(p));
                    supers.put(cr.getClassName(), cr.getSuperName());
                } catch (Exception e) {}
            });
        }

        // Load minecraft intermediary jar (and any extra jars via sys prop) for Class.forName
        // resolution of net/minecraft/class_* hierarchy in getCommonSuperClass.
        List<java.net.URL> urls = new ArrayList<>();
        String extraCp = System.getProperty("extra.classpath");
        if (extraCp != null) {
            for (String p : extraCp.split(File.pathSeparator)) {
                if (!p.isEmpty()) { try { urls.add(new java.io.File(p).toURI().toURL()); } catch (Exception e) {} }
            }
        }
        extLoader = new java.net.URLClassLoader(urls.toArray(new java.net.URL[0]), ClassLoader.getSystemClassLoader());
        System.out.println("Hierarchy: " + supers.size() + " classes, extra CP urls: " + urls.size());

        int fixed = 0, skipped = 0;
        try (var stream = Files.walk(root)) {
            var files = stream.filter(p -> p.toString().endsWith(".class")).sorted().toList();
            System.out.println("Found " + files.size() + " classes");
            for (Path file : files) {
                if (file.getFileName().toString().equals("ChatCommandSender2.class")) { skipped++; continue; }
                try {
                    byte[] bytes = Files.readAllBytes(file);
                    ClassReader cr = new ClassReader(bytes);
                    ClassNode cn = new ClassNode();
                    cr.accept(cn, ClassReader.EXPAND_FRAMES);
                    ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES) {
                        @Override
                        protected String getCommonSuperClass(String a, String b) { return lca(a, b); }
                    };
                    cn.accept(cw);
                    byte[] newBytes = cw.toByteArray();
                    if (newBytes.length != bytes.length || !java.util.Arrays.equals(newBytes, bytes)) {
                        Files.write(file, newBytes);
                        Path bc = Path.of("build/classes/java/main/" + root.relativize(file).toString().replace('\\','/'));
                        if (Files.exists(bc)) Files.write(bc, newBytes);
                        fixed++;
                    } else { skipped++; }
                } catch (Exception e) {
                    System.out.println("  SKIP " + file.getFileName() + ": " + e.getMessage());
                    skipped++;
                }
            }
        }
        System.out.println("Done: " + fixed + " recomputed, " + skipped + " unchanged/skipped");
    }

    static String lca(String a, String b) {
        if (a.equals(b)) return a;
        Set<String> aAnc = new LinkedHashSet<>();
        String cur = a;
        while (cur != null && !cur.equals("java/lang/Object") && aAnc.add(cur)) {
            cur = resolveSuper(cur);
        }
        aAnc.add("java/lang/Object");
        cur = b;
        Set<String> bVis = new HashSet<>();
        while (cur != null && !cur.equals("java/lang/Object") && bVis.add(cur)) {
            if (aAnc.contains(cur)) return cur;
            cur = resolveSuper(cur);
        }
        return "java/lang/Object";
    }

    static String resolveSuper(String cls) {
        // First check precompiled hierarchy
        String s = supers.get(cls);
        if (s != null) return s;
        // Try Class.forName via extLoader (intermediary jar has net/minecraft/class_* classes)
        try {
            Class<?> c = Class.forName(cls.replace('/', '.'), false, extLoader);
            Class<?> sup = c.getSuperclass();
            return sup != null ? sup.getName().replace('.', '/') : "java/lang/Object";
        } catch (ClassNotFoundException e) {
            return "java/lang/Object";
        } catch (Throwable t) {
            return "java/lang/Object";
        }
    }
}
