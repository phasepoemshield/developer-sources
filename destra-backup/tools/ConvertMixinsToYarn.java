import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;
import java.util.*;
import java.util.regex.*;
import java.util.zip.*;

public final class ConvertMixinsToYarn {
    static Map<String, String> classMap = new HashMap<>();
    static Map<String, String> methodMap = new HashMap<>();
    static Map<String, String> fieldMap = new HashMap<>();

    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, StandardCharsets.UTF_8));

        String mappingsPath = System.getProperty("mappings.path");
        if (mappingsPath != null && Files.exists(Path.of(mappingsPath))) {
            parseMappings(Path.of(mappingsPath));
        } else {
            parseMappingsFromJar();
        }
        System.out.println("Loaded maps: classes=" + classMap.size() + " methods=" + methodMap.size() + " fields=" + fieldMap.size());

        Path mixinDir = Path.of("src/main/java/sg/mx");
        int converted = 0, unchanged = 0;
        try (var stream = Files.list(mixinDir)) {
            var files = stream.filter(p -> p.toString().endsWith(".java")).sorted().toList();
            System.out.println("Found " + files.size() + " files");
            for (Path file : files) {
                String content = Files.readString(file, StandardCharsets.UTF_8);
                String result = convert(content);
                if (!result.equals(content)) {
                    Files.writeString(file, result, StandardCharsets.UTF_8);
                    converted++;
                    System.out.println("Converted: " + file.getFileName());
                } else {
                    unchanged++;
                }
            }
        }
        System.out.println("Done: " + converted + " converted, " + unchanged + " unchanged");
    }

    static String convert(String content) {
        String result = content;

        // 1. Replace full intermediary paths net/minecraft/class_XXXX($class_YYYY)* -> net/minecraft/<yarn>
        // Handles inner classes like net/minecraft/class_459$class_462
        Pattern pathPat = Pattern.compile("net/minecraft/class_\\d+(?:\\$class_\\d+)*");
        Matcher pm = pathPat.matcher(result);
        StringBuffer psb = new StringBuffer();
        while (pm.find()) {
            String key = pm.group();
            String simple = key.substring(key.lastIndexOf('/') + 1);
            String yarn = classMap.get(simple);
            pm.appendReplacement(psb, Matcher.quoteReplacement(yarn != null ? yarn : key));
        }
        pm.appendTail(psb);
        result = psb.toString();

        // 2. Replace net.minecraft.class_XXXX(.class_YYYY)* -> net.minecraft.<yarn dotted>
        Pattern dotPat = Pattern.compile("net\\.minecraft\\.class_\\d+(?:\\$class_\\d+)*");
        Matcher dm = dotPat.matcher(result);
        StringBuffer dsb = new StringBuffer();
        while (dm.find()) {
            String key = dm.group();
            String simple = key.substring(key.lastIndexOf('.') + 1);
            String yarn = classMap.get(simple);
            String replacement = yarn != null ? "net.minecraft." + yarn.replace('/', '.').replace("net.minecraft.", "") : key;
            dm.appendReplacement(dsb, Matcher.quoteReplacement(replacement));
        }
        dm.appendTail(dsb);
        result = dsb.toString();

        // 3. Replace remaining standalone class_XXXX -> simple Yarn name (last segment)
        Pattern classPat = Pattern.compile("\\bclass_\\d+\\b");
        Matcher cm = classPat.matcher(result);
        StringBuffer csb = new StringBuffer();
        while (cm.find()) {
            String key = cm.group();
            String yarn = classMap.get(key);
            String simple = yarn != null && yarn.contains("/") ? yarn.substring(yarn.lastIndexOf('/') + 1) : yarn;
            cm.appendReplacement(csb, Matcher.quoteReplacement(simple != null ? simple : key));
        }
        cm.appendTail(csb);
        result = csb.toString();

        // 4. Single-pass replacement for method_XXXX
        Pattern methodPat = Pattern.compile("\\bmethod_\\d+\\b");
        Matcher mm = methodPat.matcher(result);
        StringBuffer msb = new StringBuffer();
        while (mm.find()) {
            String key = mm.group();
            String yarn = methodMap.get(key);
            mm.appendReplacement(msb, Matcher.quoteReplacement(yarn != null ? yarn : key));
        }
        mm.appendTail(msb);
        result = msb.toString();

        // 5. Field names: field_XXXX
        Pattern fieldPat = Pattern.compile("\\bfield_\\d+\\b");
        Matcher fm = fieldPat.matcher(result);
        StringBuffer fsb = new StringBuffer();
        while (fm.find()) {
            String key = fm.group();
            String yarn = fieldMap.get(key);
            fm.appendReplacement(fsb, Matcher.quoteReplacement(yarn != null ? yarn : key));
        }
        fm.appendTail(fsb);
        result = fsb.toString();

        // Do NOT add remap = false - we need remap = true (default) for production support
        // Loom will generate refmap and remapJar will handle Yarn->intermediary

        return result;
    }

    static String addRemapFalse(String content) {
        if (content.contains("remap = false") || content.contains("remap=false")) {
            return content;
        }

        // Match @Mixin(...) - handle nested parens properly
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < content.length()) {
            int idx = content.indexOf("@Mixin(", i);
            if (idx < 0) {
                sb.append(content, i, content.length());
                break;
            }
            sb.append(content, i, idx);
            // Find matching closing paren
            int start = idx + 7;
            int depth = 1;
            int end = start;
            while (end < content.length() && depth > 0) {
                char c = content.charAt(end);
                if (c == '(') depth++;
                else if (c == ')') depth--;
                end++;
            }
            String inner = content.substring(start, end - 1).trim();
            String replacement;
            if (inner.contains("=") || inner.contains("value") || inner.contains("targets")) {
                replacement = "@Mixin(" + inner + ", remap = false)";
            } else {
                replacement = "@Mixin(value = " + inner + ", remap = false)";
            }
            sb.append(replacement);
            i = end;
        }
        return sb.toString();
    }

    static void parseMappingsFromJar() throws IOException {
        Path localTiny = Path.of("mappings/mappings.tiny");
        if (Files.exists(localTiny)) {
            parseMappings(localTiny);
            return;
        }
        String jarPath = System.getProperty("yarn.jar");
        if (jarPath == null) {
            String userHome = System.getProperty("user.home");
            Path yarnDir = Path.of(userHome, ".gradle/caches/modules-2/files-2.1/net.fabricmc/yarn");
            if (Files.exists(yarnDir)) {
                try (var s = Files.walk(yarnDir)) {
                    var found = s.filter(p -> p.getFileName().toString().endsWith(".jar")).findFirst().orElse(null);
                    if (found != null) jarPath = found.toString();
                }
            }
        }
        if (jarPath == null) throw new FileNotFoundException("mappings/mappings.tiny not found");
        System.out.println("Reading mappings from jar: " + jarPath);
        try (ZipFile zf = new ZipFile(jarPath)) {
            ZipEntry entry = zf.getEntry("mappings/mappings.tiny");
            if (entry == null) {
                throw new IOException("mappings/mappings.tiny not found in jar");
            }
            try (BufferedReader br = new BufferedReader(new InputStreamReader(zf.getInputStream(entry), StandardCharsets.UTF_8))) {
                parseMappingsReader(br);
            }
        }
    }

    static void parseMappings(Path file) throws IOException {
        try (BufferedReader br = Files.newBufferedReader(file, StandardCharsets.UTF_8)) {
            parseMappingsReader(br);
        }
    }

    static void parseMappingsReader(BufferedReader br) throws IOException {
        String line;
        while ((line = br.readLine()) != null) {
            if (line.isEmpty()) continue;
            char type = line.charAt(0);
            String[] parts = line.split("\t");

            if (type == 'c') {
                if (parts.length >= 3) {
                    String intermName = parts[1];
                    String yarnName = parts[2];
                    String intermSimple = intermName.contains("/") ? intermName.substring(intermName.lastIndexOf('/') + 1) : intermName;
                    classMap.put(intermSimple, yarnName);
                }
            } else if (type == '\t') {
                int mIdx = -1;
                for (int i = 0; i < parts.length; i++) {
                    if (parts[i].equals("m") || parts[i].equals("f")) {
                        mIdx = i;
                        break;
                    }
                }
                if (mIdx >= 0 && parts.length >= mIdx + 4) {
                    String memberType = parts[mIdx];
                    String interm = parts[mIdx + 2];
                    String yarn = parts[mIdx + 3];
                    if (memberType.equals("m")) {
                        if (!methodMap.containsKey(interm)) {
                            methodMap.put(interm, yarn);
                        }
                    } else {
                        fieldMap.put(interm, yarn);
                    }
                }
            }
        }
    }
}
