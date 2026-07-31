package fun.nexisdlc.commands.commands.defaults;

import fun.nexisdlc.client.utils.config.ThemeConfig;
import fun.nexisdlc.commands.Command;
import fun.nexisdlc.commands.argument.IArgConsumer;
import fun.nexisdlc.commands.exception.CommandException;
import fun.nexisdlc.commands.helpers.TabCompleteHelper;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import net.minecraft.util.Formatting;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ThemeCommand extends Command {

    protected ThemeCommand() {
        super("theme");
    }

    @Override
    public void execute(String label, IArgConsumer args) throws CommandException {
        String action = args.hasAny() ? args.getString().toLowerCase(Locale.US) : "list";

        if (action.equals("dir")) {
            File dir = ThemeConfig.getThemesDir();
            if (dir != null && dir.exists()) {
                try {
                    Runtime.getRuntime().exec("explorer " + dir.getAbsolutePath());
                } catch (IOException e) {
                    logDirect("Не удалось открыть папку тем: " + e.getMessage(), Formatting.RED);
                }
            } else {
                logDirect("Папка тем не найдена.", Formatting.RED);
            }
            return;
        }

        if (action.equals("reload")) {
            try {
                ThemeConfig.reload();
                logDirect("Темы перезагружены. Текущая тема: " + ThemeConfig.getCurrentThemeName());
            } catch (Exception e) {
                logDirect("Ошибка при перезагрузке тем: " + e.getMessage(), Formatting.RED);
            }
            return;
        }

        if (action.equals("list")) {
            List<ThemeConfig.Theme> themes = ThemeConfig.getThemes();
            logDirect("Темы (" + themes.size() + "):");
            for (ThemeConfig.Theme theme : themes) {
                logDirect(" - " + theme.name + (theme.name.equals(ThemeConfig.getCurrentThemeName()) ? " [x]" : ""));
            }
            return;
        }

        logDirect("Использование: .theme <dir|reload|list>", Formatting.RED);
    }

    @Override
    public Stream<String> tabComplete(String label, IArgConsumer args) throws CommandException {
        if (!args.hasAny()) {
            return Stream.empty();
        }
        if (args.hasExactlyOne()) {
            String prefix = args.getString().toLowerCase(Locale.US);
            return new TabCompleteHelper()
                    .sortAlphabetically()
                    .prepend("dir", "reload", "list")
                    .filterPrefix(prefix)
                    .stream();
        }
        return Stream.empty();
    }

    @Override
    public String getShortDesc() {
        return "Управление темами";
    }

    @Override
    public List<String> getLongDesc() {
        return Arrays.asList(
                "Команда для управления кастомными темами.",
                "",
                "Использование:",
                "> .theme dir - Открывает папку с темами.",
                "> .theme reload - Перезагружает темы из файлов.",
                "> .theme list - Показывает список тем."
        );
    }
}
