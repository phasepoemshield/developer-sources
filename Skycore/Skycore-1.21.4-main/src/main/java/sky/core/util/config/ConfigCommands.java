package sky.core.util.config;

import java.awt.Desktop;
import java.io.IOException;
import java.util.List;
import net.minecraft.client.MinecraftClient;
import net.minecraft.text.ClickEvent;
import net.minecraft.text.HoverEvent;
import net.minecraft.text.MutableText;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.TextColor;
import net.minecraft.util.Formatting;
import sky.core.Skycore;
import sky.core.ui.gui.click.theme.Themes;

public final class ConfigCommands {
    private static final String[] PREFIXES = {".cfg", ".config"};

    private ConfigCommands() {
    }

    public static boolean handle(String message) {
        if (message == null) {
            return false;
        }

        String trimmed = message.trim();
        String args = null;
        for (String prefix : PREFIXES) {
            if (trimmed.equalsIgnoreCase(prefix)) {
                args = "";
                break;
            }
            if (trimmed.regionMatches(true, 0, prefix + " ", 0, prefix.length() + 1)) {
                args = trimmed.substring(prefix.length()).trim();
                break;
            }
        }

        if (args == null) {
            return false;
        }

        execute(args);
        return true;
    }

    private static void execute(String args) {
        ConfigManager configManager = Skycore.getInstance().getConfigManager();
        if (configManager == null) {
            return;
        }

        if (args.isEmpty()) {
            send("Использование: .cfg save/load/remove/list/dir/clear/reset <name>");
            return;
        }

        String[] parts = args.split("\\s+");
        String action = parts[0].toLowerCase();

        switch (action) {
            case "save" -> {
                if (parts.length < 2) {
                    send("Укажи имя: .cfg save <name>");
                    return;
                }
                configManager.saveConfig(parts[1]);
                send("Конфиг \"" + parts[1] + "\" сохранён!");
            }
            case "load" -> {
                if (parts.length < 2) {
                    send("Укажи имя: .cfg load <name>");
                    return;
                }
                if (!configManager.getConfigNames().contains(parts[1])) {
                    send("Конфиг \"" + parts[1] + "\" не найден.");
                    return;
                }
                configManager.loadConfig(parts[1]);
                send("Конфиг \"" + parts[1] + "\" загружен!");
            }
            case "remove", "delete" -> {
                if (parts.length < 2) {
                    send("Укажи имя: .cfg remove <name>");
                    return;
                }
                if (!configManager.getConfigNames().contains(parts[1])) {
                    send("Конфиг \"" + parts[1] + "\" не найден.");
                    return;
                }
                configManager.deleteConfig(parts[1]);
                send("Конфиг \"" + parts[1] + "\" удалён!");
            }
            case "list" -> {
                List<String> names = configManager.getConfigNames();
                if (names.isEmpty()) {
                    send("Список конфигураций пуст!");
                    return;
                }
                send("Список конфигов:");
                for (String name : names) {
                    MutableText line = Text.literal(name).formatted(Formatting.WHITE);
                    line.append(clickable(" [Загрузить]", ".cfg load " + name, Formatting.GREEN, "Загрузить " + name));
                    line.append(clickable(" [Удалить]", ".cfg remove " + name, Formatting.RED, "Удалить " + name));
                    send(line);
                }
            }
            case "dir" -> openConfigDirectory(configManager);
            case "clear" -> {
                for (String name : configManager.getConfigNames()) {
                    configManager.deleteConfig(name);
                }
                send("Список конфигов очищен!");
            }
            case "reset" -> {
                configManager.resetToDefaults();
                send("Конфиг сброшен!");
            }
            default -> send("Неизвестная команда. Используй: save, load, remove, list, dir, clear, reset");
        }
    }

    private static MutableText clickable(String label, String command, Formatting color, String hover) {
        return Text.literal(label)
                .setStyle(Style.EMPTY
                        .withColor(color)
                        .withClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, command))
                        .withHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, Text.literal(hover))));
    }

    private static void openConfigDirectory(ConfigManager configManager) {
        try {
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().open(configManager.getConfigDirectory());
            }
        } catch (IOException exception) {
            send("Не удалось открыть папку: " + configManager.getConfigDirectory().getAbsolutePath());
        }
    }

    private static void send(String message) {
        send(Text.literal(message).formatted(Formatting.GRAY));
    }

    private static void send(Text message) {
        MinecraftClient client = MinecraftClient.getInstance();
        if (client.player != null) {
            MutableText prefix = Text.literal("SkyCore")
                    .setStyle(Style.EMPTY.withColor(TextColor.fromRgb(Themes.getCurrent().getSwatchColor().getRGB() & 0xFFFFFF)));
            MutableText separator = Text.literal(" / ").formatted(Formatting.DARK_GRAY);
            client.player.sendMessage(Text.empty().append(prefix).append(separator).append(message), false);
        }
    }
}
