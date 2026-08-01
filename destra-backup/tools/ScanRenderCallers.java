import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public final class ScanRenderCallers {
    static final Set<String> TARGETS = Set.of(
        "ru/destra/hud/DraggableHudElement.render",
        "ru/destra/hud/DraggableHudManager.4"
    );
    static final Map<String, String> WANT = Map.of(
        "ru/destra/hud/DraggableHudElement", "render:(Lnet/minecraft/class_332;IILnet/minecraft/class_1041;)V",
        "ru/destra/hud/DraggableHudManager", "4:(Lnet/minecraft/class_332;IILnet/minecraft/class_1041;)V"
    );

    public static void main(String[] args) throws Exception {
        Path root = Paths.get(".precompiled");
        List<Path> classes = new ArrayList<>();
        Files.walk(root).filter(p -> p.toString().endsWith(".class")).forEach(classes::add);
        for (Path p : classes) {
            try {
                byte[] data = Files.readAllBytes(p);
                ClassReader cr = new ClassReader(data);
                ClassNode cn = new ClassNode();
                cr.accept(cn, ClassReader.SKIP_DEBUG | ClassReader.SKIP_FRAMES);
                for (MethodNode m : cn.methods) {
                    if (m.instructions == null) continue;
                    for (AbstractInsnNode insn : m.instructions) {
                        if (insn instanceof MethodInsnNode) {
                            MethodInsnNode mi = (MethodInsnNode) insn;
                            String want = WANT.get(mi.owner);
                            if (want != null && (mi.name + ":" + mi.desc).equals(want)) {
                                System.out.println(p + " :: " + cn.name + "." + m.name + m.desc + " -> " + mi.owner + "." + mi.name + mi.desc);
                            }
                        }
                    }
                }
            } catch (Exception e) {
                // ignore
            }
        }
        System.out.println("DONE");
    }
}
