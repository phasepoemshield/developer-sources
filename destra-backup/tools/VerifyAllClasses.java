import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import org.objectweb.asm.util.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.zip.*;

public final class VerifyAllClasses {
    // className -> {superName} for LCA
    static Map<String, String> supers = new HashMap<>();

    public static void main(String[] args) throws Exception {
        Path jar = Path.of("build/libs/destra-recovered-1.0.0.jar");
        // Build hierarchy from jar
        try (ZipFile zf = new ZipFile(jar.toFile())) {
            for (var e = zf.entries(); e.hasMoreElements(); ) {
                var en = e.nextElement();
                if (!en.getName().endsWith(".class")) continue;
                try {
                    ClassReader cr = new ClassReader(zf.getInputStream(en).readAllBytes());
                    supers.put(cr.getClassName(), cr.getSuperName());
                } catch (Exception ex) {}
            }
        }
        System.out.println("Hierarchy: " + supers.size() + " classes");

        int ok = 0, errors = 0;
        List<String> errorList = new ArrayList<>();
        try (ZipFile zf = new ZipFile(jar.toFile())) {
            for (var e = zf.entries(); e.hasMoreElements(); ) {
                var en = e.nextElement();
                if (!en.getName().endsWith(".class")) continue;
                String name = en.getName();
                try {
                    byte[] bytes = zf.getInputStream(en).readAllBytes();
                    ClassReader cr = new ClassReader(bytes);
                    // Verify RAW bytes from jar (what the JVM actually loads), do NOT recompute frames.
                    StringWriter sw = new StringWriter();
                    PrintWriter pw = new PrintWriter(sw);
                    try {
                        CheckClassAdapter.verify(cr, false, pw);
                    } catch (Throwable t) {
                        pw.println("EXCEPTION: " + t);
                    }
                    String out = sw.toString();
                    if (out.length() > 0) {
                        errors++;
                        errorList.add(name);
                        String firstLine = out.lines().findFirst().orElse("");
                        System.out.println("FAIL " + name + ": " + firstLine);
                    } else {
                        ok++;
                    }
                } catch (Throwable t) {
                    errors++;
                    errorList.add(name);
                    System.out.println("FAIL " + name + ": " + t);
                }
            }
        }
        System.out.println("\n=== SUMMARY ===");
        System.out.println("OK: " + ok + ", FAILED: " + errors);
        if (!errorList.isEmpty()) {
            System.out.println("Failed classes:");
            for (var n : errorList) System.out.println("  " + n);
        }
    }

    static String lca(String a, String b) {
        if (a.equals(b)) return a;
        Set<String> aAnc = new LinkedHashSet<>();
        String cur = a;
        while (cur != null && !cur.equals("java/lang/Object") && aAnc.add(cur)) {
            cur = supers.getOrDefault(cur, "java/lang/Object");
        }
        aAnc.add("java/lang/Object");
        cur = b;
        Set<String> bVis = new HashSet<>();
        while (cur != null && !cur.equals("java/lang/Object") && bVis.add(cur)) {
            if (aAnc.contains(cur)) return cur;
            cur = supers.getOrDefault(cur, "java/lang/Object");
        }
        return "java/lang/Object";
    }
}
