import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;

public final class PrepareMixinFinal {
    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, StandardCharsets.UTF_8));

        // Read original as bytes
        byte[] orig = Files.readAllBytes(Path.of("src/main/java/sg/mx/GameRendererMixin.java"));
        String grm = new String(orig, StandardCharsets.UTF_8);

        // Use char codes to build search strings
        char D = (char) 0x0414;
        // Field 0: шСР = 0.017453292F
        grm = replaceField(grm, (char)0x0448, (char)0x0421, (char)0x0420, "0.017453292F");
        // Field 1: шСъ = 0.05F
        grm = replaceField(grm, (char)0x0448, (char)0x0421, (char)0x044A, "0.05F");
        // Field 2: шСм = 1.0F
        grm = replaceField(grm, (char)0x0448, (char)0x0421, (char)0x043C, "1.0F");
        // Field 3: шСЛ = 10.0F
        grm = replaceField(grm, (char)0x0448, (char)0x0421, (char)0x041B, "10.0F");
        // Field 4: шСИ = 5.0F
        grm = replaceField(grm, (char)0x0448, (char)0x0421, (char)0x0418, "5.0F");
        // Field 5: шСв = 5.0F
        grm = replaceField(grm, (char)0x0448, (char)0x0421, (char)0x0432, "5.0F");
        // Field 6: шСю = 5.0F
        grm = replaceField(grm, (char)0x0448, (char)0x0421, (char)0x044E, "5.0F");
        // Field 7: шСг = 8.0F
        grm = replaceField(grm, (char)0x0448, (char)0x0421, (char)0x0433, "8.0F");
        // Field 8: шСж = 2.0F
        grm = replaceField(grm, (char)0x0448, (char)0x0421, (char)0x0436, "2.0F");
        // Field 9: шСЮ = 3.0F
        grm = replaceField(grm, (char)0x0448, (char)0x0421, (char)0x042E, "3.0F");
        // Field 10: шСл = 0.15F
        grm = replaceField(grm, (char)0x0448, (char)0x0421, (char)0x043B, "0.15F");

        // Replace obfuscated method calls
        grm = grm.replace("var5.zoomKeyBinding._/* $VF was: 5 */()", "ru.destra.misc.ModuleHelper.getValue(var5.zoomKeyBinding)");
        grm = grm.replace("var4." + D + "()", "ru.destra.misc.ModuleHelper.isEnabled(var4)");
        grm = grm.replace("DestraClient.getInstance().getModuleManager().zoom." + D + "()", "ru.destra.misc.ModuleHelper.isEnabled(DestraClient.getInstance().getModuleManager().zoom)");
        grm = grm.replace("import ru.dreamix.fabricloader.VMBridge;\n", "");
        grm = grm.replace("static {\n      VMBridge.identifyClass(GameRendererMixin.class, \"daBK0vsq\");\n   }", "static {}");

        Path outDir = Path.of("tools_out/mixin_src/sg/mx");
        Files.createDirectories(outDir);
        Files.write(outDir.resolve("GameRendererMixin.java"), grm.getBytes(StandardCharsets.UTF_8));

        // Verify: check if file has actual Cyrillic or literal backslash-u
        byte[] outBytes = Files.readAllBytes(outDir.resolve("GameRendererMixin.java"));
        boolean hasLiteralU = false;
        for (int i = 0; i < outBytes.length - 5; i++) {
            if (outBytes[i] == 0x5C && outBytes[i+1] == 0x75) { // backslash-u
                hasLiteralU = true;
                break;
            }
        }
        System.out.println("Output has literal escape: " + hasLiteralU);
        System.out.println("Output size: " + outBytes.length);

        // OverlayTextureMixin
        byte[] otmOrig = Files.readAllBytes(Path.of("src/main/java/sg/mx/OverlayTextureMixin.java"));
        String otm = new String(otmOrig, StandardCharsets.UTF_8);
        otm = replaceFieldTyped(otm, "int", "I" + (char)0x5F1F, "0");
        otm = replaceFieldTyped(otm, "float", "I" + (char)0x0447, "0.5F");
        otm = replaceFieldTyped(otm, "float", "I" + (char)0x041E, "0.0F");
        otm = replaceFieldTyped(otm, "float", "I" + (char)0x042D, "-255.0F");
        otm = replaceFieldTyped(otm, "int", "I" + (char)0x044C, "0");
        otm = otm.replace("var3.opacity._/* $VF was: 5 */()", "ru.destra.misc.ModuleHelper.getValue(var3.opacity)");
        otm = otm.replace("var3." + D + "()", "ru.destra.misc.ModuleHelper.isEnabled(var3)");
        otm = otm.replace("import ru.dreamix.fabricloader.VMBridge;\n", "");
        otm = otm.replace("static {\n      VMBridge.identifyClass(OverlayTextureMixin.class, \"aRNya8Pg\");\n   }", "static {}");
        Files.write(outDir.resolve("OverlayTextureMixin.java"), otm.getBytes(StandardCharsets.UTF_8));
        System.out.println("OverlayTextureMixin written");
    }

    static String replaceField(String src, char a, char b, char c, String value) {
        String fieldName = String.valueOf(a) + String.valueOf(b) + String.valueOf(c);
        String search = "private static final float " + fieldName + ";";
        String replace = "private static final float " + fieldName + " = " + value + ";";
        boolean found = src.contains(search);
        System.out.println("Field " + Integer.toHexString(a) + "/" + Integer.toHexString(b) + "/" + Integer.toHexString(c) + ": " + (found ? "FOUND" : "NOT FOUND"));
        if (found) return src.replace(search, replace);
        return src;
    }

    static String replaceFieldTyped(String src, String type, String fieldName, String value) {
        String search = "private static final " + type + " " + fieldName + ";";
        String replace = "private static final " + type + " " + fieldName + " = " + value + ";";
        boolean found = src.contains(search);
        System.out.println("OTM " + type + " " + Integer.toHexString(fieldName.charAt(1)) + ": " + (found ? "FOUND" : "NOT FOUND"));
        if (found) return src.replace(search, replace);
        return src;
    }
}
