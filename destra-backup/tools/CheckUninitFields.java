import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class CheckUninitFields {
    public static void main(String[] args) throws Exception {
        Path root = Path.of(".precompiled/ru/destra");
        java.util.List<Path> classes = new ArrayList<>();
        Files.walk(root).filter(p -> p.toString().endsWith(".class")).forEach(classes::add);
        Collections.sort(classes);

        int total = 0;
        for (Path path : classes) {
            byte[] data = Files.readAllBytes(path);
            ClassReader cr = new ClassReader(data);
            ClassNode cn = new ClassNode();
            cr.accept(cn, 0);

            String className = cn.name.replace('/', '.');
            boolean isAbstract = (cn.access & Opcodes.ACC_ABSTRACT) != 0;
            boolean isInterface = (cn.access & 0x0200) != 0;
            if (isInterface) continue;

            // Collect all non-static object-typed fields
            java.util.List<FieldNode> objFields = new ArrayList<>();
            for (FieldNode f : cn.fields) {
                if ((f.access & Opcodes.ACC_STATIC) != 0) continue;
                if (f.desc.startsWith("L") || f.desc.startsWith("[L") || f.desc.equals("[I") || f.desc.equals("[Z") || f.desc.equals("[D") || f.desc.equals("[F")) {
                    objFields.add(f);
                }
            }
            if (objFields.isEmpty()) continue;

            // Collect all PUTFIELD targets in <init> methods
            Set<String> initFields = new HashSet<>();
            for (MethodNode m : cn.methods) {
                if (m.name.equals("<init>")) {
                    for (AbstractInsnNode insn : m.instructions) {
                        if (insn instanceof FieldInsnNode && insn.getOpcode() == Opcodes.PUTFIELD) {
                            FieldInsnNode fn = (FieldInsnNode) insn;
                            if (fn.owner.equals(cn.name)) {
                                initFields.add(fn.name);
                            }
                        }
                    }
                }
            }

            // Also check instance initializer blocks (non-<init>, non-<clinit> methods called during construction? No, just <init>)
            // Report fields not initialized
            java.util.List<String> uninit = new ArrayList<>();
            for (FieldNode f : objFields) {
                if (!initFields.contains(f.name)) {
                    uninit.add(f.name + " : " + f.desc);
                }
            }
            if (!uninit.isEmpty()) {
                total++;
                System.out.println((isAbstract ? "[ABSTRACT] " : "") + className);
                for (String u : uninit) {
                    System.out.println("    " + u);
                }
            }
        }
        System.out.println("\nTotal classes with uninitialized object fields: " + total);
    }
}
