import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;

public final class PrepareMixinSources2 {
    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, StandardCharsets.UTF_8));

        String grm = Files.readString(Path.of("src/main/java/sg/mx/GameRendererMixin.java"), StandardCharsets.UTF_8);
        
        // Build search/replace strings using char codes
        char sh = 0x0448, CS = 0x0421, SR = 0x0420, sx = 0x044A, sm = 0x043c, SL = 0x041b;
        char SI = 0x0418, sv = 0x0432, sju = 0x044e, sg = 0x0433, szh = 0x0436, sJU = 0x042e;
        char sl = 0x043b, D = 0x0414;
        
        String[] fieldNames = {
            "" + sh + CS + SR,   // шСР
            "" + sh + CS + sx,   // шСъ
            "" + sh + CS + sm,   // шСм
            "" + sh + CS + SL,   // шСЛ
            "" + sh + CS + SI,   // шСИ
            "" + sh + CS + sv,   // шСв
            "" + sh + CS + sju,  // шСю
            "" + sh + CS + sg,   // шСг
            "" + sh + CS + szh,  // шСж
            "" + sh + CS + sJU,  // шСЮ
            "" + sh + CS + sl,   // шСл
        };
        String[] fieldValues = {
            "0.017453292F", "0.05F", "1.0F", "10.0F", "5.0F", "5.0F", "5.0F", "8.0F", "2.0F", "3.0F", "0.15F"
        };
        
        for (int i = 0; i < fieldNames.length; i++) {
            String search = "private static final float " + fieldNames[i] + ";";
            String replace = "private static final float " + fieldNames[i] + " = " + fieldValues[i] + ";";
            if (grm.contains(search)) {
                grm = grm.replace(search, replace);
                System.out.println("Replaced: " + fieldNames[i] + " = " + fieldValues[i]);
            } else {
                System.out.println("NOT FOUND: " + fieldNames[i]);
            }
        }
        
        // Replace _() with ModuleHelper.getValue()
        grm = grm.replace("var5.zoomKeyBinding._/* $VF was: 5 */()", "ru.destra.misc.ModuleHelper.getValue(var5.zoomKeyBinding)");
        
        // Replace Д() calls
        String dSearch1 = "var4." + D + "()";
        grm = grm.replace(dSearch1, "ru.destra.misc.ModuleHelper.isEnabled(var4)");
        
        String dSearch2 = "DestraClient.getInstance().getModuleManager().zoom." + D + "()";
        grm = grm.replace(dSearch2, "ru.destra.misc.ModuleHelper.isEnabled(DestraClient.getInstance().getModuleManager().zoom)");
        
        // Remove VMBridge
        grm = grm.replace("import ru.dreamix.fabricloader.VMBridge;\n", "");
        grm = grm.replace("static {\n      VMBridge.identifyClass(GameRendererMixin.class, \"daBK0vsq\");\n   }", "static {}");
        
        Path grmDir = Path.of("C:/Users/Vlad/AppData/Local/Temp/opencode/mixin_compile/sg/mx");
        Files.createDirectories(grmDir);
        Files.writeString(grmDir.resolve("GameRendererMixin.java"), grm, StandardCharsets.UTF_8);
        System.out.println("Written GameRendererMixin.java");
        
        // Verify output
        byte[] out = Files.readAllBytes(grmDir.resolve("GameRendererMixin.java"));
        int idx = new String(out, StandardCharsets.UTF_8).indexOf("private static final float ");
        if (idx >= 0) {
            byte[] fieldBytes = new byte[6];
            System.arraycopy(out, idx + 28, fieldBytes, 0, 6);
            System.out.println("Field name hex: " + bytesToHex(fieldBytes));
        }
        
        // OverlayTextureMixin
        String otm = Files.readString(Path.of("src/main/java/sg/mx/OverlayTextureMixin.java"), StandardCharsets.UTF_8);
        char I弟 = 0x5F1F, Ich = 0x0447, IO = 0x041E, IE = 0x042D, Ib = 0x044C;
        
        otm = otm.replace("private static final int I" + I弟 + ";", "private static final int I" + I弟 + " = 0;");
        otm = otm.replace("private static final float I" + Ich + ";", "private static final float I" + Ich + " = 0.5F;");
        otm = otm.replace("private static final float I" + IO + ";", "private static final float I" + IO + " = 0.0F;");
        otm = otm.replace("private static final float I" + IE + ";", "private static final float I" + IE + " = -255.0F;");
        otm = otm.replace("private static final int I" + Ib + ";", "private static final int I" + Ib + " = 0;");
        otm = otm.replace("var3.opacity._/* $VF was: 5 */()", "ru.destra.misc.ModuleHelper.getValue(var3.opacity)");
        otm = otm.replace("var3." + D + "()", "ru.destra.misc.ModuleHelper.isEnabled(var3)");
        otm = otm.replace("import ru.dreamix.fabricloader.VMBridge;\n", "");
        otm = otm.replace("static {\n      VMBridge.identifyClass(OverlayTextureMixin.class, \"aRNya8Pg\");\n   }", "static {}");
        
        Files.writeString(grmDir.resolve("OverlayTextureMixin.java"), otm, StandardCharsets.UTF_8);
        System.out.println("Written OverlayTextureMixin.java");
    }
    
    static String bytesToHex(byte[] b) {
        StringBuilder sb = new StringBuilder();
        for (byte x : b) sb.append(String.format("%02X ", x));
        return sb.toString();
    }
}
