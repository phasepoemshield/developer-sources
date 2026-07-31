import java.nio.charset.*;
import java.util.*;

public class RecoverEncoding {
    public static void main(String[] args) throws Exception {
        // Sample mojibake strings from WorldParticlesModule clinit
        String[] samples = {
            "_world particles with shapes and with_",
            "forms",
            "all",
            "spawn mode",
            "glow",
            "physics",
            "theme color",
            "custom color",
            "spawn delay",
            "max particles",
            "spawn radius",
            "particle size",
            "move speed",
            "rain speed",
            "rotation speed",
            "glow size",
            "lines",
            "line count",
            "slow lines",
            "lifetime",
            "star", "heart", "snowflake", "logo", "orbeez", "cross", "shards", "cubes", "pyramids"
        };
        // The actual mojibake bytes from the class (UTF-8 encoded mojibake).
        // We'll read them from the class file directly. For now test conversion chains on a known mojibake.
        // Mojibake seen: "Сборка" style. Let's hardcode one from the dump and try chains.
        String moji = "â¥ª¨¥"; // placeholder
        // Read from arg if provided
        if (args.length > 0) moji = args[0];

        String[] charsets = {"UTF-8", "windows-1251", "ISO-8859-1", "windows-1252", "KOI8-R", "IBM866"};
        System.out.println("Input mojibake: " + moji);
        for (String c1 : charsets) {
            byte[] bytes;
            try { bytes = moji.getBytes(c1); } catch (Exception e) { continue; }
            for (String c2 : charsets) {
                if (c1.equals(c2)) continue;
                try {
                    String recovered = new String(bytes, c2);
                    // Check if it looks like readable Cyrillic (mostly Cyrillic + ASCII)
                    int cyr = 0, total = 0;
                    for (int i = 0; i < recovered.length(); i++) {
                        char ch = recovered.charAt(i);
                        total++;
                        if ((ch >= 0x0400 && ch <= 0x04FF) || (ch >= 0x0020 && ch <= 0x007E)) cyr++;
                    }
                    if (total > 0 && cyr * 100 / total > 80 && recovered.length() > 0) {
                        boolean hasCyrillic = false;
                        for (int i = 0; i < recovered.length(); i++) if (recovered.charAt(i) >= 0x0400 && recovered.charAt(i) <= 0x04FF) { hasCyrillic = true; break; }
                        if (hasCyrillic) System.out.println("  " + c1 + " -> " + c2 + ": " + recovered);
                    }
                } catch (Exception e) {}
            }
        }
    }
}
