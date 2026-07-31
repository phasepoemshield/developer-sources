package fun.nexisdlc.client.utils.client;

import fun.nexisdlc.client.utils.render.color.gradient.GradientUtil;
import net.minecraft.client.MinecraftClient;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.Arrays;
import java.util.stream.Stream;

public interface ILogger {
    public static MutableText gradient(String text, Formatting... formattings) {
        return GradientUtil.gradient(text, formattings);
    }

    public static MutableText formatMessage(String prefix, String message) {
        return gradient(prefix, Formatting.BOLD)
                .append(Text.literal("" + Formatting.GRAY + Formatting.BOLD + " ⇨" + Formatting.RESET + message));
    }

    static Text getPrefix() {
        return gradient("[Nexis Client]", Formatting.BOLD)
                .append(Text.literal("" + Formatting.GRAY + Formatting.BOLD + " ⇨" + Formatting.RESET));
    }

    default void logDirect(Text... components) {
        MutableText component = Text.literal("");
        component.append(getPrefix());
        component.append(Text.literal(" "));
        Arrays.asList(components).forEach(component::append);
        if (MinecraftClient.getInstance().player != null) {
            MinecraftClient.getInstance().inGameHud.getChatHud().addMessage(component);
        }
    }

    default void logDirect(String message, Formatting color) {
        Stream.of(message.split("\n")).forEach(line -> {
            MutableText component = Text.literal(line.replace("\t", "    "));
            component.setStyle(component.getStyle().withColor(color));
            logDirect(component);
        });
    }

    default void logDirect(String message) {
        logDirect(message, Formatting.GRAY);
    }
}
