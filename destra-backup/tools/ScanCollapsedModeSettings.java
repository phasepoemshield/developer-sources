import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

/**
 * Phase-2 audit: find Module classes whose ModeSetting ctor still has collapsed identical mode labels.
 */
public final class ScanCollapsedModeSettings {
    public static void main(String[] args) throws Exception {
        Path dir = Path.of(args.length > 0 ? args[0] : ".precompiled/ru/destra/module");
        List<String> hits = new ArrayList<>();
        try (var stream = Files.list(dir)) {
            for (Path p : stream.filter(x -> x.toString().endsWith("Module.class")).sorted().toList()) {
                ClassNode cn = new ClassNode();
                new ClassReader(Files.readAllBytes(p)).accept(cn, 0);
                MethodNode init = null;
                for (MethodNode mn : cn.methods) {
                    if ("<init>".equals(mn.name)) { init = mn; break; }
                }
                if (init == null) continue;
                List<String> collapsed = findCollapsed(init);
                if (!collapsed.isEmpty()) {
                    hits.add(cn.name + " collapsed modes: " + collapsed);
                }
            }
        }
        Path out = Path.of("build/diagnostics/collapsed-modes.txt");
        Files.createDirectories(out.getParent());
        Files.writeString(out, hits.isEmpty() ? "No collapsed ModeSettings found.\n" : String.join("\n", hits) + "\n");
        System.out.println("ScanCollapsedModeSettings: " + hits.size() + " module(s) with collapsed modes");
        hits.forEach(System.out::println);
        System.out.println("Wrote " + out);
    }

    static List<String> findCollapsed(MethodNode init) {
        List<String> result = new ArrayList<>();
        AbstractInsnNode[] insns = init.instructions.toArray();
        for (int i = 0; i < insns.length; i++) {
            if (!(insns[i] instanceof MethodInsnNode min)) continue;
            if (!"ru/destra/setting/ModeSetting".equals(min.owner) || !"<init>".equals(min.name)) continue;
            if (!"(Ljava/lang/String;Lru/destra/core/Module;[Ljava/lang/String;)V".equals(min.desc)) continue;
            int anew = -1;
            for (int j = i - 1; j >= 0; j--) {
                if (insns[j] instanceof TypeInsnNode tin
                        && tin.getOpcode() == Opcodes.ANEWARRAY
                        && "java/lang/String".equals(tin.desc)) {
                    anew = j;
                    break;
                }
            }
            if (anew < 0) continue;
            List<String> modes = new ArrayList<>();
            for (int j = anew + 1; j < i; j++) {
                if (insns[j] instanceof LdcInsnNode ldc && ldc.cst instanceof String) {
                    AbstractInsnNode n = insns[j].getNext();
                    int hops = 0;
                    boolean aastore = false;
                    while (n != null && hops < 4) {
                        if (n.getOpcode() == Opcodes.AASTORE) { aastore = true; break; }
                        if (n instanceof MethodInsnNode) break;
                        n = n.getNext();
                        hops++;
                    }
                    if (aastore) modes.add((String) ldc.cst);
                }
            }
            if (modes.size() >= 2 && modes.stream().distinct().count() == 1) {
                result.add(modes.size() + "x \"" + modes.get(0) + "\"");
            }
        }
        return result;
    }
}
