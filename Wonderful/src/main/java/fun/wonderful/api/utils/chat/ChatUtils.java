package fun.wonderful.api.utils.chat;

import fun.wonderful.api.utils.color.ColorUtils;
import java.awt.Color;
import lombok.Generated;
import net.minecraft.text.Text;
import net.minecraft.text.Style;
import net.minecraft.client.MinecraftClient;
import net.minecraft.text.MutableText;
import net.minecraft.text.TextColor;

public final class ChatUtils {
    public static void sendMessage(Object message) {
        MinecraftClient mc = MinecraftClient.getInstance();
        if (mc.player == null) {
            System.out.println("[Wonderful] " + String.valueOf(message));
            return;
        }
        MutableText text = Text.literal((String)"");
        String prefix = "Wonderful";
        for (int i2 = 0; i2 < prefix.length(); ++i2) {
            text.append((Text)Text.literal((String)String.valueOf(prefix.charAt(i2))).setStyle(Style.EMPTY.withBold(Boolean.valueOf(true)).withColor(TextColor.fromRgb((int)ColorUtils.gradient(ColorUtils.getThemeColor(0), ColorUtils.getThemeColor(90), (float)i2 / (float)prefix.length())))));
        }
        text.append((Text)Text.literal((String)" ⇨ ").setStyle(Style.EMPTY.withBold(Boolean.valueOf(false)).withColor(TextColor.fromRgb((int)new Color(200, 200, 200).getRGB()))));
        if (message instanceof Text) {
            Text messageText = (Text)message;
            text.append(messageText);
        } else {
            text.append((Text)Text.literal((String)String.valueOf(message)).setStyle(Style.EMPTY.withBold(Boolean.valueOf(false)).withColor(TextColor.fromRgb((int)new Color(200, 200, 200).getRGB()))));
        }
        mc.player.sendMessage((Text)text, false);
    }

    @Generated
    private ChatUtils() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }
}