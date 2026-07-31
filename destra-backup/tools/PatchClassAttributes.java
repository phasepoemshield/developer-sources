import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public final class PatchClassAttributes {
    public static void main(String[] args) throws Exception {
        Path root = Path.of(".precompiled");
        int patched = 0, classesPatched = 0;

        try (var s = Files.walk(root)) {
            var files = s.filter(p -> p.toString().endsWith(".class")).toList();
            for (Path p : files) {
                byte[] bytes = Files.readAllBytes(p);
                ClassReader cr = new ClassReader(bytes);
                ClassNode cn = new ClassNode();
                cr.accept(cn, 0);
                boolean changed = false;

                // 1. Strip NestMembers and NestHost attributes — recovered classes have broken
                //    references to classes in wrong packages (decompiler artifact) which the JVM
                //    rejects with IncompatibleClassChangeError. These attributes are optional.
                if (cn.nestMembers != null && !cn.nestMembers.isEmpty()) {
                    cn.nestMembers.clear();
                    changed = true;
                }
                if (cn.nestHostClass != null && !cn.nestHostClass.isEmpty()) {
                    cn.nestHostClass = null;
                    changed = true;
                }

                // Strip PermittedSubclasses attribute — sealed classes with broken refs cause
                // ClassFormatError, and final classes with PermittedSubclasses are illegal.
                if (cn.permittedSubclasses != null && !cn.permittedSubclasses.isEmpty()) {
                    cn.permittedSubclasses.clear();
                    cn.permittedSubclasses = null;
                    changed = true;
                }

                // 2. Clean InnerClasses: remove entries with null/empty innerName or invalid chars
                if (cn.innerClasses != null) {
                    Iterator<InnerClassNode> it = cn.innerClasses.iterator();
                    while (it.hasNext()) {
                        InnerClassNode ic = it.next();
                        // 'name' is the internal class name; must not contain . ; [ and must not
                        // be a descriptor. 'innerName' (simple name) may legitimately be null
                        // for anonymous classes, so we only validate 'name'.
                        if (ic.name == null || ic.name.isEmpty()) {
                            it.remove(); changed = true; continue;
                        }
                        if (ic.name.contains(".") || ic.name.contains(";")
                                || ic.name.contains("[") || ic.name.contains("<") || ic.name.contains(">")) {
                            it.remove(); changed = true; continue;
                        }
                        if (ic.name.startsWith("L") && ic.name.endsWith(";")) {
                            it.remove(); changed = true; continue;
                        }
                        // Clean inner class access flags (strip ACC_STRICT and other invalid bits)
                        int validI = Opcodes.ACC_PUBLIC | Opcodes.ACC_PRIVATE | Opcodes.ACC_PROTECTED
                                | Opcodes.ACC_STATIC | Opcodes.ACC_FINAL | Opcodes.ACC_INTERFACE
                                | Opcodes.ACC_ABSTRACT | Opcodes.ACC_SYNTHETIC | Opcodes.ACC_ANNOTATION
                                | Opcodes.ACC_ENUM;
                        if ((ic.access & ~validI) != 0) { ic.access &= validI; changed = true; }
                    }
                }

                // 3. Fix invalid access flags on fields/methods/classes (strip illegal bits,
                //    keep only valid JVM flag combinations)
                int validClass = Opcodes.ACC_PUBLIC | Opcodes.ACC_FINAL | Opcodes.ACC_SUPER
                        | Opcodes.ACC_INTERFACE | Opcodes.ACC_ABSTRACT | Opcodes.ACC_SYNTHETIC
                        | Opcodes.ACC_ANNOTATION | Opcodes.ACC_ENUM | Opcodes.ACC_MODULE;
                if ((cn.access & ~validClass) != 0) {
                    cn.access &= validClass;
                    changed = true;
                }
                for (FieldNode f : cn.fields) {
                    int validF = Opcodes.ACC_PUBLIC | Opcodes.ACC_PRIVATE | Opcodes.ACC_PROTECTED
                            | Opcodes.ACC_STATIC | Opcodes.ACC_FINAL | Opcodes.ACC_VOLATILE
                            | Opcodes.ACC_TRANSIENT | Opcodes.ACC_SYNTHETIC | Opcodes.ACC_ENUM;
                    if ((f.access & ~validF) != 0) { f.access &= validF; changed = true; }
                    // Fix ACC_FINAL on interface fields (0x9 = public+static without final)
                    if ((cn.access & Opcodes.ACC_INTERFACE) != 0 && (f.access & Opcodes.ACC_STATIC) != 0
                            && (f.access & Opcodes.ACC_FINAL) == 0) {
                        f.access |= Opcodes.ACC_FINAL;
                        changed = true;
                    }
                }
                for (MethodNode m : cn.methods) {
                    // ACC_STRICT (0x0400) was removed in Java 16+, must be stripped for Java 21.
                    int validM = Opcodes.ACC_PUBLIC | Opcodes.ACC_PRIVATE | Opcodes.ACC_PROTECTED
                            | Opcodes.ACC_STATIC | Opcodes.ACC_FINAL | Opcodes.ACC_SYNCHRONIZED
                            | Opcodes.ACC_BRIDGE | Opcodes.ACC_VARARGS | Opcodes.ACC_NATIVE
                            | Opcodes.ACC_ABSTRACT | Opcodes.ACC_SYNTHETIC;
                    if ((m.access & ~validM) != 0) { m.access &= validM; changed = true; }
                }

            // Always enforce mutually-exclusive flag combinations (even if nothing else changed).
            int cnAcc = fixAccess(cn.access, false);
            // Remove ACC_INTERFACE from non-interface classes (decompiler artifact)
            if ((cn.access & Opcodes.ACC_INTERFACE) != 0 && (cn.access & Opcodes.ACC_ANNOTATION) == 0 && (cn.access & Opcodes.ACC_ENUM) == 0 && (cn.access & Opcodes.ACC_MODULE) == 0) {
                // Check if it's really an interface by looking at methods — if they have bodies, it's not
                boolean hasMethodBodies = false;
                for (MethodNode mm : cn.methods) {
                    if (mm.instructions != null && mm.instructions.size() > 1) { hasMethodBodies = true; break; }
                }
                if (hasMethodBodies && !cn.name.contains("Accessor") && !cn.name.contains("Mixin")) {
                    cnAcc &= ~Opcodes.ACC_INTERFACE;
                    if (cnAcc != cn.access) { cn.access = cnAcc; changed = true; }
                }
            }
            if (cnAcc != cn.access) { cn.access = cnAcc; changed = true; }
            for (FieldNode f : cn.fields) { int a = fixAccess(f.access, false); if (a != f.access) { f.access = a; changed = true; } }
            for (MethodNode m : cn.methods) { int a = fixAccess(m.access, true); if (a != m.access) { m.access = a; changed = true; } }
            for (InnerClassNode ic : cn.innerClasses) { int a = fixAccess(ic.access, true); if (a != ic.access) { ic.access = a; changed = true; } }

                if (changed) {
                    ClassWriter cw = new ClassWriter(0);
                    cn.accept(cw);
                    byte[] out = cw.toByteArray();
                    Files.write(p, out);
                    Path bc = Path.of("build/classes/java/main/" + root.relativize(p).toString().replace('\\','/'));
                    if (Files.exists(bc)) Files.write(bc, out);
                    patched++;
                    classesPatched++;
                }
            }
        }
        System.out.println("Patched attributes in " + classesPatched + " classes");
    }

    static int fixAccess(int access, boolean isMethod) {
        if ((access & Opcodes.ACC_PUBLIC) != 0) access &= ~(Opcodes.ACC_PRIVATE | Opcodes.ACC_PROTECTED);
        else if ((access & Opcodes.ACC_PRIVATE) != 0) access &= ~Opcodes.ACC_PROTECTED;
        if (isMethod && (access & Opcodes.ACC_FINAL) != 0) access &= ~Opcodes.ACC_ABSTRACT;
        return access;
    }
}
