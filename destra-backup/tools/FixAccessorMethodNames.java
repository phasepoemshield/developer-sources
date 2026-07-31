import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public final class FixAccessorMethodNames {
    // Map: accessor class name -> map of (desc -> caller method name)
    // We scan all precompiled classes for calls to accessor interfaces to find expected names.
    static Map<String, Map<String, String>> callerNames = new HashMap<>();

    public static void main(String[] args) throws Exception {
        Path root = Path.of(".precompiled");
        // Phase 1: scan all classes for calls to accessor interfaces
        try (var s = Files.walk(root)) {
            var files = s.filter(p -> p.toString().endsWith(".class")).toList();
            for (Path p : files) {
                ClassReader cr = new ClassReader(Files.readAllBytes(p));
                ClassNode cn = new ClassNode();
                cr.accept(cn, ClassReader.SKIP_CODE | ClassReader.SKIP_DEBUG | ClassReader.SKIP_FRAMES);
                for (MethodNode m : cn.methods) {
                    if (m.instructions == null) continue;
                    for (AbstractInsnNode insn = m.instructions.getFirst(); insn != null; insn = insn.getNext()) {
                        if (insn instanceof MethodInsnNode min) {
                            // Check if owner is an accessor interface (ends with Accessor)
                            if (min.owner.contains("Accessor") && min.owner.startsWith("sg/mx/")) {
                                callerNames.computeIfAbsent(min.owner, k -> new HashMap<>())
                                    .putIfAbsent(min.name + min.desc, min.name);
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Found caller names for " + callerNames.size() + " accessor interfaces");

        // Phase 2: rename accessor methods to match caller names
        Path mxDir = Path.of(".precompiled/sg/mx");
        int fixed = 0;
        try (var s = Files.list(mxDir)) {
            var files = s.filter(p -> p.toString().endsWith(".class")).toList();
            for (Path p : files) {
                ClassNode cn = new ClassNode();
                new ClassReader(Files.readAllBytes(p)).accept(cn, 0);
                if (!cn.name.contains("Accessor")) continue;
                Map<String, String> expected = callerNames.get(cn.name);
                if (expected == null) continue;
                boolean changed = false;
                for (MethodNode m : cn.methods) {
                    // Find @Invoker or @Accessor annotation
                    boolean isAccessor = false;
                    String annValue = null;
                    if (m.visibleAnnotations != null) {
                        for (AnnotationNode a : m.visibleAnnotations) {
                            if ("Lorg/spongepowered/asm/mixin/gen/Invoker;".equals(a.desc) || "Lorg/spongepowered/asm/mixin/gen/Accessor;".equals(a.desc)) {
                                isAccessor = true;
                                if (a.values != null) {
                                    for (int i = 0; i < a.values.size(); i += 2) {
                                        if ("value".equals(a.values.get(i))) {
                                            Object v = a.values.get(i + 1);
                                            if (v instanceof String) annValue = (String) v;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (!isAccessor) continue;
                    // Find what callers expect
                    String callerName = expected.get(m.name + m.desc);
                    if (callerName == null) {
                        // Try with desc only
                        for (var e : expected.entrySet()) {
                            if (e.getKey().endsWith(m.desc)) { callerName = e.getValue(); break; }
                        }
                    }
                    if (callerName == null) continue;
                    if (!m.name.equals(callerName)) {
                        System.out.println("  " + p.getFileName() + " :: rename " + m.name + " -> " + callerName + " (annValue=" + annValue + ")");
                        m.name = callerName;
                        changed = true;
                        fixed++;
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
        System.out.println("Renamed " + fixed + " accessor methods to match caller expectations");
    }
}
