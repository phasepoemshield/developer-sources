package sg.mx;

import java.util.HashSet;
import java.util.Set;
import net.minecraft.client.gui.DrawContext;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(targets = "ru.destra.render.GuiRenderUtil", remap = false)
public abstract class GuiRenderUtilDiagnosticMixin {

    private static final Set<String> destra$seenTexts = new HashSet<>();
    private static int destra$textCallCount = 0;

    private static String destra$buildKey(String method, ru.destra.font.FontRenderer font, String text, int color) {
        String fontName = font == null ? "null" : String.valueOf(System.identityHashCode(font));
        String t = text == null ? "null" : (text.length() > 40 ? text.substring(0, 40) + "..." : text);
        return method + "|" + fontName + "|" + t + "|0x" + Integer.toHexString(color);
    }

    @Inject(method = "drawTextWithScale", at = @At("HEAD"), remap = false)
    private static void destra$diagDrawTextWithScale(
            DrawContext ctx, ru.destra.font.FontRenderer font, String text, float x, float y, int color, float size, float thickness,
            CallbackInfo ci) {
        destra$textCallCount++;
        String key = destra$buildKey("drawTextWithScale", font, text, color);
        if (destra$seenTexts.add(key)) {
            int glyphCount = -1;
            boolean hasGlyph = false;
            if (font != null) {
                try {
                    java.lang.reflect.Method hasGlyphMethod = font.getClass().getMethod("hasGlyph", int.class);
                    hasGlyph = (boolean) hasGlyphMethod.invoke(font, (int) 'A');
                    java.lang.reflect.Field glyphMapField = font.getClass().getDeclaredField("glyphMap");
                    glyphMapField.setAccessible(true);
                    java.util.Map<?, ?> glyphMap = (java.util.Map<?, ?>) glyphMapField.get(font);
                    glyphCount = glyphMap == null ? -2 : glyphMap.size();
                } catch (Exception e) {
                    glyphCount = -3;
                }
            }
            // Removed console spam
        }
    }

    @Inject(method = "drawText", at = @At("HEAD"), remap = false)
    private static void destra$diagDrawText(
            DrawContext ctx, ru.destra.font.FontRenderer font, String text, float x, float y, int color, float size, float thickness,
            CallbackInfo ci) {
        destra$textCallCount++;
        String key = destra$buildKey("drawText", font, text, color);
        if (destra$seenTexts.add(key)) {
            int glyphCount = -1;
            if (font != null) {
                try {
                    java.lang.reflect.Field glyphMapField = font.getClass().getDeclaredField("glyphMap");
                    glyphMapField.setAccessible(true);
                    java.util.Map<?, ?> glyphMap = (java.util.Map<?, ?>) glyphMapField.get(font);
                    glyphCount = glyphMap == null ? -2 : glyphMap.size();
                } catch (Exception e) {
                    glyphCount = -3;
                }
            }
            // Removed console spam
        }
    }

    @Inject(method = "drawTextLeft", at = @At("HEAD"), remap = false)
    private static void destra$diagDrawTextLeft(
            DrawContext ctx, ru.destra.font.FontRenderer font, String text, float x, float y, int color, float size,
            CallbackInfo ci) {
        destra$textCallCount++;
        String key = destra$buildKey("drawTextLeft", font, text, color);
        if (destra$seenTexts.add(key)) {
            int glyphCount = -1;
            if (font != null) {
                try {
                    java.lang.reflect.Field glyphMapField = font.getClass().getDeclaredField("glyphMap");
                    glyphMapField.setAccessible(true);
                    java.util.Map<?, ?> glyphMap = (java.util.Map<?, ?>) glyphMapField.get(font);
                    glyphCount = glyphMap == null ? -2 : glyphMap.size();
                } catch (Exception e) {
                    glyphCount = -3;
                }
            }
            // Removed console spam
        }
    }
}
