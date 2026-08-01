import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;

public final class PrepareMixinSources {
    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, StandardCharsets.UTF_8));

        // GameRendererMixin
        String grm = Files.readString(Path.of("src/main/java/sg/mx/GameRendererMixin.java"), StandardCharsets.UTF_8);
        // Hardcode field values
        grm = grm.replace("private static final float \u0448\u0421\u0420;", "private static final float \u0448\u0421\u0420 = 0.017453292F;");
        grm = grm.replace("private static final float \u0448\u0421\u044a;", "private static final float \u0448\u0421\u044a = 0.05F;");
        grm = grm.replace("private static final float \u0448\u0421\u043c;", "private static final float \u0448\u0421\u043c = 1.0F;");
        grm = grm.replace("private static final float \u0448\u0421\u041b;", "private static final float \u0448\u0421\u041b = 10.0F;");
        grm = grm.replace("private static final float \u0448\u0421\u0418;", "private static final float \u0448\u0421\u0418 = 5.0F;");
        grm = grm.replace("private static final float \u0448\u0421\u0432;", "private static final float \u0448\u0421\u0432 = 5.0F;");
        grm = grm.replace("private static final float \u0448\u0421\u044e;", "private static final float \u0448\u0421\u044e = 5.0F;");
        grm = grm.replace("private static final float \u0448\u0421\u0433;", "private static final float \u0448\u0421\u0433 = 8.0F;");
        grm = grm.replace("private static final float \u0448\u0421\u0436;", "private static final float \u0448\u0421\u0436 = 2.0F;");
        grm = grm.replace("private static final float \u0448\u0421\u042e;", "private static final float \u0448\u0421\u042e = 3.0F;");
        grm = grm.replace("private static final float \u0448\u0421\u043b;", "private static final float \u0448\u0421\u043b = 0.15F;");
        // Replace _() with ModuleHelper.getValue()
        grm = grm.replace("var5.zoomKeyBinding._/* $VF was: 5 */()", "ru.destra.misc.ModuleHelper.getValue(var5.zoomKeyBinding)");
        // Replace Д() with ModuleHelper.isEnabled()
        grm = grm.replace("var4.\u0414()", "ru.destra.misc.ModuleHelper.isEnabled(var4)");
        grm = grm.replace("DestraClient.getInstance().getModuleManager().zoom.\u0414()", "ru.destra.misc.ModuleHelper.isEnabled(DestraClient.getInstance().getModuleManager().zoom)");
        // Remove VMBridge static block
        grm = grm.replace("static {\n      VMBridge.identifyClass(GameRendererMixin.class, \"daBK0vsq\");\n   }", "static {}");
        grm = grm.replace("import ru.dreamix.fabricloader.VMBridge;\n", "");
        // Write to temp dir
        Path grmDir = Path.of("C:/Users/Vlad/AppData/Local/Temp/opencode/mixin_compile/sg/mx");
        Files.createDirectories(grmDir);
        Files.writeString(grmDir.resolve("GameRendererMixin.java"), grm, StandardCharsets.UTF_8);
        System.out.println("Prepared GameRendererMixin.java");

        // OverlayTextureMixin
        String otm = Files.readString(Path.of("src/main/java/sg/mx/OverlayTextureMixin.java"), StandardCharsets.UTF_8);
        otm = otm.replace("private static final int I\u5f1f;", "private static final int I\u5f1f = 0;");
        otm = otm.replace("private static final float I\u0447;", "private static final float I\u0447 = 0.5F;");
        otm = otm.replace("private static final float I\u041e;", "private static final float I\u041e = 0.0F;");
        otm = otm.replace("private static final float I\u042d;", "private static final float I\u042d = -255.0F;");
        otm = otm.replace("private static final int I\u044c;", "private static final int I\u044c = 0;");
        otm = otm.replace("var3.opacity._/* $VF was: 5 */()", "ru.destra.misc.ModuleHelper.getValue(var3.opacity)");
        otm = otm.replace("var3.\u0414()", "ru.destra.misc.ModuleHelper.isEnabled(var3)");
        otm = otm.replace("static {\n      VMBridge.identifyClass(OverlayTextureMixin.class, \"aRNya8Pg\");\n   }", "static {}");
        otm = otm.replace("import ru.dreamix.fabricloader.VMBridge;\n", "");
        Files.writeString(grmDir.resolve("OverlayTextureMixin.java"), otm, StandardCharsets.UTF_8);
        System.out.println("Prepared OverlayTextureMixin.java");
    }
}
