package fun.nexisdlc.client.utils.render.color.gradient;

import fun.nexisdlc.client.ClientColors;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public class GradientUtil {
    public static MutableText gradient(String text) {
        MutableText result = Text.empty();

        int color1 = ClientColors.GRADIENT_START.getRGB();
        int color2 = ClientColors.GRADIENT_END.getRGB();
        int steps = text.length();
        for (int i = 0; i < steps; i++) {
            float ratio = (float) i / (steps - 1);
            int r = (int) (((color1 >> 16) & 0xFF) * (1 - ratio) + ((color2 >> 16) & 0xFF) * ratio);
            int g = (int) (((color1 >> 8) & 0xFF) * (1 - ratio) + ((color2 >> 8) & 0xFF) * ratio);
            int b = (int) ((color1 & 0xFF) * (1 - ratio) + (color2 & 0xFF) * ratio);
            int color = (r << 16) | (g << 8) | b;
            result.append(Text.literal(String.valueOf(text.charAt(i))).styled(style -> style.withColor(color)));
        }
        return result;
    }

    public static MutableText gradient(String text, Formatting... formattings) {
        MutableText result = Text.empty();
        int color1 = ClientColors.GRADIENT_START.getRGB();
        int color2 = ClientColors.GRADIENT_END.getRGB();
        int steps = text.length();
        for (int i = 0; i < steps; i++) {
            float ratio = (float) i / (steps - 1);
            int r = (int) (((color1 >> 16) & 0xFF) * (1 - ratio) + ((color2 >> 16) & 0xFF) * ratio);
            int g = (int) (((color1 >> 8) & 0xFF) * (1 - ratio) + ((color2 >> 8) & 0xFF) * ratio);
            int b = (int) ((color1 & 0xFF) * (1 - ratio) + (color2 & 0xFF) * ratio);
            int color = (r << 16) | (g << 8) | b;
            MutableText charText = Text.literal(String.valueOf(text.charAt(i))).styled(style -> style.withColor(color));
            for (Formatting formatting : formattings) {
                charText.formatted(formatting);
            }
            result.append(charText);
        }
        return result;
    }

    public static MutableText formatMessage(String prefix, String message) {
        return gradient(prefix, Formatting.BOLD)
                .append(Text.literal("" + Formatting.DARK_GRAY + " ⇨ " + Formatting.RESET + message));
    }

    public static MutableText formatMessage(String prefix, MutableText message) {
        return gradient(prefix, Formatting.BOLD)
                .append(Text.literal("" + Formatting.DARK_GRAY + " ⇨ " + Formatting.RESET))
                .append(message);
    }

    public static MutableText formatMessageSimple(String prefix, String message, Formatting... prefixFormattings) {
        MutableText resultPrefix = Text.literal(prefix);
        for (Formatting formatting : prefixFormattings) {
            resultPrefix.formatted(formatting);
        }
        return resultPrefix
                .append(Text.literal("" + Formatting.DARK_GRAY + " ⇨ " + Formatting.RESET + message));
    }
}