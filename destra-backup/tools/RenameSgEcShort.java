import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;
import java.util.*;
import org.objectweb.asm.*;

public final class RenameSgEcShort {
    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, StandardCharsets.UTF_8));
        Path ecDir = Path.of(".precompiled/sg/ec");

        // Run "cmd.exe /c dir /x" to get short names
        ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/c", "dir /x", ecDir.toString());
        pb.redirectErrorStream(true);
        Process proc = pb.start();
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(proc.getInputStream(), Charset.forName("Cp866")));
        String line;
        int counter = 0;
        // dir /x format: "date time size SHORTNAME  LONGNAME"
        // We want: SHORTNAME (if contains ~) -> generate N00xx, read this_class
        Map<String, String> renameMap = new LinkedHashMap<>();

        while ((line = reader.readLine()) != null) {
            // Lines with .class and ~ (short name marker)
            if (!line.contains(".class") || !line.contains("~")) continue;
            // Parse: tokens are whitespace separated
            // Format: DATE TIME SIZE SHORTNAME LONGNAME
            // But date/time have spaces. Let's find the short name pattern (ends with ~1.CLA or similar)
            String[] parts = line.split("\\s+");
            String shortName = null;
            for (String p : parts) {
                if (p.contains("~") && p.toUpperCase().endsWith(".CLA")) {
                    shortName = p;
                    break;
                }
            }
            if (shortName == null) continue;

            // Read the file via short name
            File f = new File(ecDir.toFile(), shortName);
            if (!f.exists()) {
                System.out.println("SKIP (not found): " + shortName);
                continue;
            }
            byte[] data = Files.readAllBytes(f.toPath());
            ClassReader cr = new ClassReader(data);
            String origName = cr.getClassName();
            boolean nonAscii = false;
            for (int i = 0; i < origName.length(); i++) {
                if (origName.charAt(i) > 127) { nonAscii = true; break; }
            }
            if (nonAscii && origName.startsWith("sg/ec/")) {
                String newName = "N" + String.format("%04d", counter++);
                File newFile = new File(ecDir.toFile(), newName + ".class");
                if (newFile.exists()) {
                    // Already exists (e.g. from previous run), delete old and write
                    newFile.delete();
                }
                if (!f.renameTo(newFile)) {
                    System.out.println("RENAME FAILED: " + shortName + " -> " + newName);
                } else {
                    System.out.println("Renamed: " + shortName + " (" + origName + ") -> " + newName);
                }
                renameMap.put(origName, "sg/ec/" + newName);
            }
        }
        proc.waitFor();

        // Write rename map to a file that Java can read (created by Java, not PowerShell)
        Path mapFile = Path.of(".precompiled/sg/ec/_rename_map.txt");
        List<String> lines = new ArrayList<>();
        for (Map.Entry<String, String> e : renameMap.entrySet()) {
            lines.add(e.getKey() + "=" + e.getValue());
        }
        Files.write(mapFile, lines, StandardCharsets.UTF_8);
        System.out.println("Total renamed: " + renameMap.size());
        System.out.println("Map written to: " + mapFile);
    }
}
