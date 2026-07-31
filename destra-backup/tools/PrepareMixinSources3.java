import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;

public final class PrepareMixinSources3 {
    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, StandardCharsets.UTF_8));

        // Read original file as bytes
        byte[] origBytes = Files.readAllBytes(Path.of("src/main/java/sg/mx/GameRendererMixin.java"));
        String grm = new String(origBytes, StandardCharsets.UTF_8);
        
        // Build field name strings using char concatenation
        char sh = (char)0x0448, CS = (char)0x0421;
        String[] suffixes = {
            String.valueOf((char)0x0420), // Р
            String.valueOf((char)0x044A), // ъ
            String.valueOf((char)0x043C), // м
            String.valueOf((char)0x041B), // Л
            String.valueOf((char)0x0418), // И
            String.valueOf((char)0x0432), // в
            String.valueOf((char)0x044E), // ю
            String.valueOf((char)0x0433), // г
            String.valueOf((char)0x0436), // ж
            String.valueOf((char)0x042E), // Ю
            String.valueOf((char)0x043B), // л
        };
        String[] values = {
            "0.017453292F", "0.05F", "1.0F", "10.0F", "5.0F", "5.0F", "5.0F", "8.0F", "2.0F", "3.0F", "0.15F"
        };
        
        for (int i = 0; i < suffixes.length; i++) {
            String fieldName = String.valueOf(sh) + String.valueOf(CS) + suffixes[i];
            String search = "private static final float " + fieldName + ";";
            String replace = "private static final float " + fieldName + " = " + values[i] + ";";
            boolean found = grm.contains(search);
            System.out.println("Field " + i + " [" + Integer.toHexString(fieldName.charAt(0)) + "/" + Integer.toHexString(fieldName.charAt(1)) + "/" + Integer.toHexString(fieldName.charAt(2)) + "]: " + (found ? "FOUND" : "NOT FOUND"));
            if (found) {
                grm = grm.replace(search, replace);
            }
        }
        
        // Replace obfuscated calls
        grm = grm.replace("var5.zoomKeyBinding._/* $VF was: 5 */()", "ru.destra.misc.ModuleHelper.getValue(var5.zoomKeyBinding)");
        grm = grm.replace("var4." + (char)0x0414 + "()", "ru.destra.misc.ModuleHelper.isEnabled(var4)");
        grm = grm.replace("DestraClient.getInstance().getModuleManager().zoom." + (char)0x0414 + "()", "ru.destra.misc.ModuleHelper.isEnabled(DestraClient.getInstance().getModuleManager().zoom)");
        grm = grm.replace("import ru.dreamix.fabricloader.VMBridge;\n", "");
        grm = grm.replace("static {\n      VMBridge.identifyClass(GameRendererMixin.class, \"daBK0vsq\");\n   }", "static {}");
        
        // Write as UTF-8 bytes
        Path grmDir = Path.of("C:/Users/Vlad/AppData/Local/Temp/opencode/mixin_compile/sg/mx");
        Files.createDirectories(grmDir);
        byte[] outBytes = grm.getBytes(StandardCharsets.UTF_8);
        Files.write(grmDir.resolve("GameRendererMixin.java"), outBytes);
        System.out.println("Written GameRendererMixin.java (" + outBytes.length + " bytes)");
        
        // Verify: check bytes at first field declaration
        String outStr = new String(outBytes, StandardCharsets.UTF_8);
        int idx = outStr.indexOf("private static final float ");
        if (idx >= 0) {
            byte[] fieldBytes = new byte[8];
            System.arraycopy(outBytes, idx + 28, fieldBytes, 0, Math.min(8, outBytes.length - idx - 28));
            StringBuilder hex = new StringBuilder();
            for (byte b : fieldBytes) hex.append(String.format("%02X ", b));
            System.out.println("First field hex: " + hex);
        }
        
        // OverlayTextureMixin
        byte[] otmBytes = Files.readAllBytes(Path.of("src/main/java/sg/mx/OverlayTextureMixin.java"));
        String otm = new String(otmBytes, StandardCharsets.UTF_8);
        
        String[] otmFields = {
            "I" + (char)0x5F1F, // I弟
            "I" + (char)0x0447, // Iч
            "I" + (char)0x041E, // IО
            "I" + (char)0x042D, // IЭ
            "I" + (char)0x044C, // Iь
        };
        String[] otmValues = {"0", "0.5F", "0.0F", "-255.0F", "0"};
        String[] otmTypes = {"int", "float", "float", "float", "int"};
        
        for (int i = 0; i < otmFields.length; i++) {
            String search = "private static final " + otmTypes[i] + " " + otmFields[i] + ";";
            String replace = "private static final " + otmTypes[i] + " " + otmFields[i] + " = " + otmValues[i] + ";";
            if (otm.contains(search)) {
                otm = otm.replace(search, replace);
                System.out.println("OTM field " + i + ": FOUND");
            } else {
                System.out.println("OTM field " + i + ": NOT FOUND");
            }
        }
        
        otm = otm.replace("var3.opacity._/* $VF was: 5 */()", "ru.destra.misc.ModuleHelper.getValue(var3.opacity)");
        otm = otm.replace("var3." + (char)0x0414 + "()", "ru.destra.misc.ModuleHelper.isEnabled(var3)");
        otm = otm.replace("import ru.dreamix.fabricloader.VMBridge;\n", "");
        otm = otm.replace("static {\n      VMBridge.identifyClass(OverlayTextureMixin.class, \"aRNya8Pg\");\n   }", "static {}");
        
        Files.write(grmDir.resolve("OverlayTextureMixin.java"), otm.getBytes(StandardCharsets.UTF_8));
        System.out.println("Written OverlayTextureMixin.java");
    }
}
