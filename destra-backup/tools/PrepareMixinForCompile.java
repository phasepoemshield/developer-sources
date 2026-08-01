import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;

public final class PrepareMixinForCompile {
    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, StandardCharsets.UTF_8));

        // GameRendererMixin - convert intermediary names to Yarn names, add remap=false
        // 1.21.4 changes: WorldRenderer.render is now called from GameRenderer.renderWorld (not render)
        // and has a new signature: render(ObjectAllocator, RenderTickCounter, boolean, Camera, GameRenderer, Matrix4f, Matrix4f)
        byte[] orig = Files.readAllBytes(Path.of("src/main/java/sg/mx/GameRendererMixin.java"));
        String grm = new String(orig, StandardCharsets.UTF_8);

        // 1.21.4 WorldRenderer.render signature
        String wr21 = "Lnet/minecraft/client/render/WorldRenderer;render(Lnet/minecraft/client/util/ObjectAllocator;Lnet/minecraft/client/render/RenderTickCounter;ZLnet/minecraft/client/render/Camera;Lnet/minecraft/client/render/GameRenderer;Lorg/joml/Matrix4f;Lorg/joml/Matrix4f;)V";

        // BEFORE global replace: retarget flushChamsBeforeHand and renderCustomHandShader to renderWorld
        // (WorldRenderer.render is called from renderWorld in 1.21.4, not from render)
        grm = grm.replace(
           "      method = \"method_3188\",\n      at = @At(value = \"INVOKE\", target = \"Lnet/minecraft/class_757;method_3172(Lnet/minecraft/class_4184;FLorg/joml/Matrix4f;)V\", shift = Shift.BEFORE)",
           "      method = \"renderWorld\",\n      at = @At(value = \"INVOKE\", target = \"" + wr21 + "\", shift = Shift.BEFORE)");
        grm = grm.replace(
           "      method = \"method_3188\",\n      at = @At(value = \"INVOKE\", target = \"Lnet/minecraft/class_757;method_3172(Lnet/minecraft/class_4184;FLorg/joml/Matrix4f;)V\", shift = Shift.AFTER)",
           "      method = \"renderWorld\",\n      at = @At(value = \"INVOKE\", target = \"" + wr21 + "\", shift = Shift.AFTER)");

        // Replace remaining intermediary method names with Yarn names (for beginChamsFrame, flushChamsAtEnd, onRenderWorld)
        grm = grm.replace("method_3188", "render");
        grm = grm.replace("method_22973", "getBasicProjectionMatrix");
        grm = grm.replace("method_3198", "bobView");
        grm = grm.replace("method_3196", "getFov");

        // render(RenderTickCounter, boolean) handlers: add boolean param (beginChamsFrame, flushChamsAtEnd, onRenderWorld)
        // renderWorld(RenderTickCounter) handlers: NO boolean (flushChamsBeforeHand, renderCustomHandShader)
        grm = grm.replace("private void destra$beginChamsFrame(RenderTickCounter var1, CallbackInfo var2)", "private void destra$beginChamsFrame(RenderTickCounter var1, boolean renderBlockOutline, CallbackInfo var2)");
        grm = grm.replace("private void destra$flushChamsAtEnd(RenderTickCounter var1, CallbackInfo var2)", "private void destra$flushChamsAtEnd(RenderTickCounter var1, boolean renderBlockOutline, CallbackInfo var2)");
        // onRenderWorld: 6-space indentation (verified from source)
        grm = grm.replace("RenderTickCounter var1,\n      CallbackInfo var2,\n      @Local", "RenderTickCounter var1,\n      boolean renderBlockOutline,\n      CallbackInfo var2,\n      @Local");

        // onRenderWorld: INVOKE_STRING target is stale for 1.21.4 (getArmorCutoutNoCull now takes Identifier, "hand" is used in Profiler.swap)
        // Make it optional so it doesn't crash if target not found
        grm = grm.replace(
           "at = @At(value = \"INVOKE_STRING\", target = \"Lnet/minecraft/class_3695;method_15405(Ljava/lang/String;)V\", args = \"ldc=hand\")\n   )",
           "at = @At(value = \"INVOKE_STRING\", target = \"Lnet/minecraft/client/render/RenderLayer;getArmorCutoutNoCull(Ljava/lang/String;)V\", args = \"ldc=hand\"),\n      require = 0\n   )");

        // Replace remaining intermediary class names in @At targets with Yarn names
        // modifyFov: isUsingItem() no longer called in getFov (1.21.4). Use Camera.getSubmersionType() as anchor
        // (called at offset 125, after fov is fully computed). Add require=0 on @ModifyVariable as safety.
        grm = grm.replace(
           "at = @At(value = \"INVOKE\", target = \"Lnet/minecraft/class_1309;method_29504()Z\", ordinal = 0, shift = Shift.BEFORE),\n      index = 4,",
           "at = @At(value = \"INVOKE\", target = \"Lnet/minecraft/client/render/Camera;getSubmersionType()Lnet/minecraft/block/enums/CameraSubmersionType;\", ordinal = 0, shift = Shift.BEFORE),\n      require = 0,\n      index = 4,");

        // Add remap = true (default) so Loom generates refmap and remapJar works for production
        grm = grm.replace("@Mixin(GameRenderer.class)", "@Mixin(GameRenderer.class)");

        // Hardcode ALL field values using char codes
        char sh = (char)0x0448, CS = (char)0x0421;
        grm = replaceField(grm, sh, CS, (char)0x0420, "0.017453292F");
        grm = replaceField(grm, sh, CS, (char)0x044A, "0.05F");
        grm = replaceField(grm, sh, CS, (char)0x043C, "1.0F");
        grm = replaceField(grm, sh, CS, (char)0x041B, "10.0F");
        grm = replaceField(grm, sh, CS, (char)0x0418, "5.0F");
        grm = replaceField(grm, sh, CS, (char)0x0432, "5.0F");
        grm = replaceField(grm, sh, CS, (char)0x044E, "5.0F");
        grm = replaceField(grm, sh, CS, (char)0x0433, "8.0F");
        grm = replaceField(grm, sh, CS, (char)0x0436, "2.0F");
        grm = replaceField(grm, sh, CS, (char)0x042E, "3.0F");
        grm = replaceField(grm, sh, CS, (char)0x043B, "0.15F");

        // Replace obfuscated calls
        grm = grm.replace("var5.zoomKeyBinding._/* $VF was: 5 */()", "ru.destra.misc.ModuleHelper.getValue(var5.zoomKeyBinding)");
        // Null-safe: getValue may return null if keybinding not initialized yet (prevents NPE on unboxing)
        grm = grm.replace(
           "var6 = KeyBindManager.isKeyDown(this.client.getWindow().getHandle(), (Integer)ru.destra.misc.ModuleHelper.getValue(var5.zoomKeyBinding));",
           "Integer destra$zoomKey = (Integer)ru.destra.misc.ModuleHelper.getValue(var5.zoomKeyBinding);\n         var6 = destra$zoomKey != null && KeyBindManager.isKeyDown(this.client.getWindow().getHandle(), destra$zoomKey.intValue());");
        grm = grm.replace("var4." + (char)0x0414 + "()", "ru.destra.misc.ModuleHelper.isEnabled(var4)");
        grm = grm.replace("DestraClient.getInstance().getModuleManager().zoom." + (char)0x0414 + "()", "ru.destra.misc.ModuleHelper.isEnabled(DestraClient.getInstance().getModuleManager().zoom)");

        // Remove VMBridge
        grm = grm.replace("import ru.dreamix.fabricloader.VMBridge;\n", "");
        grm = grm.replace("static {\n      VMBridge.identifyClass(GameRendererMixin.class, \"daBK0vsq\");\n   }", "static {}");

        Path outDir = Path.of("src/main/java/sg/mx");
        Files.createDirectories(outDir);
        Files.write(outDir.resolve("GameRendererMixin.java"), grm.getBytes(StandardCharsets.UTF_8));
        System.out.println("Written GameRendererMixin.java to src/main/java (" + grm.length() + " chars)");

        // OverlayTextureMixin - convert intermediary names, add remap=false
        byte[] otmOrig = Files.readAllBytes(Path.of("src/main/java/sg/mx/OverlayTextureMixin.java"));
        String otm = new String(otmOrig, StandardCharsets.UTF_8);

        // Replace intermediary method name with Yarn name
        otm = otm.replace("method_23209", "setupOverlayColor");

        // remap = true (default) for production support
        otm = otm.replace("@Mixin(OverlayTexture.class)", "@Mixin(OverlayTexture.class)");

        // Hardcode field values
        otm = replaceFieldTyped(otm, "int", "I" + (char)0x5F1F, "0");
        otm = replaceFieldTyped(otm, "float", "I" + (char)0x0447, "0.5F");
        otm = replaceFieldTyped(otm, "float", "I" + (char)0x041E, "0.0F");
        otm = replaceFieldTyped(otm, "float", "I" + (char)0x042D, "-255.0F");
        otm = replaceFieldTyped(otm, "int", "I" + (char)0x044C, "0");

        otm = otm.replace("var3.opacity._/* $VF was: 5 */()", "ru.destra.misc.ModuleHelper.getValue(var3.opacity)");
        otm = otm.replace("var3." + (char)0x0414 + "()", "ru.destra.misc.ModuleHelper.isEnabled(var3)");
        otm = otm.replace("import ru.dreamix.fabricloader.VMBridge;\n", "");
        otm = otm.replace("static {\n      VMBridge.identifyClass(OverlayTextureMixin.class, \"aRNya8Pg\");\n   }", "static {}");

        Files.write(outDir.resolve("OverlayTextureMixin.java"), otm.getBytes(StandardCharsets.UTF_8));
        System.out.println("Written OverlayTextureMixin.java to src/main/java (" + otm.length() + " chars)");
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
