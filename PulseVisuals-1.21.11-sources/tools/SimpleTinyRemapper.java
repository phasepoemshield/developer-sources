import jdk.internal.org.objectweb.asm.ClassReader;
import jdk.internal.org.objectweb.asm.ClassWriter;
import jdk.internal.org.objectweb.asm.commons.ClassRemapper;
import jdk.internal.org.objectweb.asm.commons.Remapper;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.util.jar.*;
import java.util.zip.ZipEntry;

public final class SimpleTinyRemapper {
    private record MemberKey(String owner, String name, String desc) {}

    private static final class TinyMappings extends Remapper {
        final Map<String, String> classes = new HashMap<>();
        final Map<MemberKey, String> methods = new HashMap<>();
        final Map<MemberKey, String> fields = new HashMap<>();
        final Map<String, String> uniqueMethods = new HashMap<>();
        final Map<String, String> uniqueFields = new HashMap<>();
        final Set<String> conflictingMethods = new HashSet<>();
        final Set<String> conflictingFields = new HashSet<>();

        static TinyMappings read(Path tiny) throws IOException {
            TinyMappings out = new TinyMappings();
            try (BufferedReader reader = Files.newBufferedReader(tiny, StandardCharsets.UTF_8)) {
                String headerLine = reader.readLine();
                if (headerLine == null) throw new IOException("Empty mappings file");
                String[] header = headerLine.split("\\t", -1);
                if (header.length < 5 || !header[0].equals("tiny") || !header[1].equals("2")) {
                    throw new IOException("Expected Tiny v2 mappings");
                }
                int interNs = -1, namedNs = -1;
                for (int i = 3; i < header.length; i++) {
                    if (header[i].equals("intermediary")) interNs = i - 3;
                    if (header[i].equals("named")) namedNs = i - 3;
                }
                if (interNs < 0 || namedNs < 0) throw new IOException("Missing intermediary/named namespaces");

                String currentOwner = null;
                String line;
                while ((line = reader.readLine()) != null) {
                    if (line.isEmpty() || line.startsWith("#")) continue;
                    String[] c = line.split("\\t", -1);
                    if (c[0].equals("c")) {
                        int a = 1 + interNs, b = 1 + namedNs;
                        if (c.length <= Math.max(a, b)) continue;
                        currentOwner = c[a];
                        out.classes.put(currentOwner, c[b]);
                    } else if (c[0].isEmpty() && c.length >= 5 && currentOwner != null) {
                        String kind = c[1];
                        if (!kind.equals("m") && !kind.equals("f")) continue;
                        String desc = c[2];
                        String interName = c[3 + interNs];
                        String namedName = c[3 + namedNs];
                        MemberKey key = new MemberKey(currentOwner, interName, desc);
                        if (kind.equals("m")) {
                            out.methods.put(key, namedName);
                            addUnique(out.uniqueMethods, out.conflictingMethods, interName, namedName);
                        } else {
                            out.fields.put(key, namedName);
                            addUnique(out.uniqueFields, out.conflictingFields, interName, namedName);
                        }
                    }
                }
            }
            out.conflictingMethods.forEach(out.uniqueMethods::remove);
            out.conflictingFields.forEach(out.uniqueFields::remove);
            return out;
        }

        private static void addUnique(Map<String, String> map, Set<String> conflicts, String oldName, String newName) {
            String prev = map.putIfAbsent(oldName, newName);
            if (prev != null && !prev.equals(newName)) conflicts.add(oldName);
        }

        @Override
        public String map(String internalName) {
            return classes.getOrDefault(internalName, internalName);
        }

        @Override
        public String mapMethodName(String owner, String name, String descriptor) {
            String exact = methods.get(new MemberKey(owner, name, descriptor));
            if (exact != null) return exact;
            return uniqueMethods.getOrDefault(name, name);
        }

        @Override
        public String mapInvokeDynamicMethodName(String name, String descriptor) {
            return uniqueMethods.getOrDefault(name, name);
        }

        @Override
        public String mapFieldName(String owner, String name, String descriptor) {
            String exact = fields.get(new MemberKey(owner, name, descriptor));
            if (exact != null) return exact;
            return uniqueFields.getOrDefault(name, name);
        }

        @Override
        public String mapRecordComponentName(String owner, String name, String descriptor) {
            return mapFieldName(owner, name, descriptor);
        }
    }

    public static void main(String[] args) throws Exception {
        if (args.length != 3) {
            System.err.println("Usage: SimpleTinyRemapper <input.jar> <mappings.tiny> <output.jar>");
            System.exit(2);
        }
        Path input = Path.of(args[0]);
        Path mappingsPath = Path.of(args[1]);
        Path output = Path.of(args[2]);
        TinyMappings mappings = TinyMappings.read(mappingsPath);
        Files.createDirectories(output.toAbsolutePath().getParent());

        int remapped = 0, copied = 0, failed = 0;
        Set<String> outputNames = new HashSet<>();
        try (JarFile jar = new JarFile(input.toFile());
             JarOutputStream out = new JarOutputStream(Files.newOutputStream(output))) {
            Enumeration<JarEntry> entries = jar.entries();
            while (entries.hasMoreElements()) {
                JarEntry entry = entries.nextElement();
                if (entry.isDirectory()) continue;
                String name = entry.getName();
                // Signature files are invalid after modifying classes.
                String upper = name.toUpperCase(Locale.ROOT);
                if (upper.startsWith("META-INF/") && (upper.endsWith(".SF") || upper.endsWith(".RSA") || upper.endsWith(".DSA"))) {
                    continue;
                }
                byte[] data;
                try (InputStream in = jar.getInputStream(entry)) {
                    data = in.readAllBytes();
                }
                String outName = name;
                if (name.endsWith(".class")) {
                    try {
                        ClassReader reader = new ClassReader(data);
                        String oldClass = reader.getClassName();
                        String newClass = mappings.map(oldClass);
                        ClassWriter writer = new ClassWriter(0);
                        reader.accept(new ClassRemapper(writer, mappings), 0);
                        data = writer.toByteArray();
                        outName = newClass + ".class";
                        remapped++;
                    } catch (Throwable t) {
                        failed++;
                        System.err.println("Failed to remap " + name + ": " + t);
                    }
                } else {
                    copied++;
                }
                if (!outputNames.add(outName)) {
                    throw new IOException("Duplicate output entry: " + outName);
                }
                JarEntry dst = new JarEntry(outName);
                dst.setTime(entry.getTime());
                out.putNextEntry(dst);
                out.write(data);
                out.closeEntry();
            }
        }
        System.out.printf(Locale.ROOT,
                "classes=%d resources=%d failed=%d classMappings=%d methodMappings=%d fieldMappings=%d%n",
                remapped, copied, failed, mappings.classes.size(), mappings.methods.size(), mappings.fields.size());
        if (failed > 0) System.exit(1);
    }
}
