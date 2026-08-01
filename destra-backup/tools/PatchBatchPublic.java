import java.io.*;
import java.nio.file.*;
import java.util.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;

public final class PatchBatchPublic {
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.err.println("Usage: PatchBatchPublic <classfile>[:method,...] <classfile> ... [--build <dir>]");
            System.exit(1);
        }

        String buildDir = null;
        List<String> classArgs = new ArrayList<>();
        for (int i = 0; i < args.length; i++) {
            if ("--build".equals(args[i]) && i + 1 < args.length) {
                buildDir = args[++i];
            } else {
                classArgs.add(args[i]);
            }
        }

        int patched = 0;
        List<File> classFiles = new ArrayList<>();
        for (String arg : classArgs) {
            String path;
            Set<String> targets = new HashSet<>();
            int colon = arg.indexOf(':');
            if (colon >= 0) {
                path = arg.substring(0, colon);
                String[] methods = arg.substring(colon + 1).split(",");
                for (String m : methods) if (!m.isEmpty()) targets.add(m);
            } else {
                path = arg;
            }

            File f = new File(path);
            if (!f.exists()) {
                System.err.println("SKIP (not found): " + path);
                continue;
            }
            if (f.isDirectory()) {
                collectClasses(f, classFiles);
            } else {
                classFiles.add(f);
            }
        }

        for (File f : classFiles) {
            byte[] data = Files.readAllBytes(f.toPath());
            ClassNode cn = new ClassNode();
            new ClassReader(data).accept(cn, 0);

            int changed = 0;
            for (MethodNode mn : cn.methods) {
                if ("<clinit>".equals(mn.name)) continue;
                int acc = mn.access;
                acc &= ~Opcodes.ACC_PRIVATE;
                acc &= ~Opcodes.ACC_PROTECTED;
                acc |= Opcodes.ACC_PUBLIC;
                if (mn.access != acc) { mn.access = acc; changed++; }
            }
            for (FieldNode fn : cn.fields) {
                int acc = fn.access;
                acc &= ~Opcodes.ACC_PRIVATE;
                acc &= ~Opcodes.ACC_PROTECTED;
                acc |= Opcodes.ACC_PUBLIC;
                if (fn.access != acc) { fn.access = acc; changed++; }
            }

            if (changed > 0) {
                ClassWriter cw = new ClassWriter(0);
                cn.accept(cw);
                byte[] out = cw.toByteArray();
                Files.write(f.toPath(), out);
                if (buildDir != null) {
                    String normalized = f.getAbsolutePath().replace('\\', '/');
                    int idx = normalized.indexOf(".precompiled/");
                    String rel = idx >= 0 ? normalized.substring(idx + ".precompiled/".length()) : f.getName();
                    File bf = new File(buildDir, rel);
                    bf.getParentFile().mkdirs();
                    Files.write(bf.toPath(), out);
                }
                System.err.println("  " + f.getName() + ": " + changed + " member(s) -> public");
                patched++;
            }
        }
        System.err.println("PatchBatchPublic: patched " + patched + " class(es)");
    }

    static void collectClasses(File dir, List<File> out) {
        File[] files = dir.listFiles();
        if (files == null) return;
        for (File f : files) {
            if (f.isDirectory()) collectClasses(f, out);
            else if (f.getName().endsWith(".class")) out.add(f);
        }
    }
}
