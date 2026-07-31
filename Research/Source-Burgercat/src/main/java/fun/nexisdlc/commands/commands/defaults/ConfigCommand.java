package fun.nexisdlc.commands.commands.defaults;

import fun.nexisdlc.ClientContainer;
import fun.nexisdlc.Nexis;
import fun.nexisdlc.NexisClient;
import fun.nexisdlc.client.utils.config.ConfigStorage;
import fun.nexisdlc.commands.Command;
import fun.nexisdlc.commands.argument.IArgConsumer;
import fun.nexisdlc.commands.datatypes.ConfigFileDataType;
import fun.nexisdlc.commands.exception.CommandException;
import fun.nexisdlc.commands.helpers.Paginator;
import fun.nexisdlc.commands.helpers.TabCompleteHelper;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

import static fun.nexisdlc.commands.IChatControl.FORCE_COMMAND_PREFIX;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ConfigCommand extends Command {
    protected ConfigCommand(Nexis Nexis) {
        super("config", "cfg");
    }

    @Override
    public void execute(String label, IArgConsumer args) throws CommandException {
        String action = args.hasAny() ? args.getString().toLowerCase(Locale.US) : "list";
        ConfigStorage configStorage = configStorage();
        if (configStorage == null) {
            logDirect("ConfigStorage ещё не инициализирован.", Formatting.RED);
            return;
        }

        if (action.equals("load") || action.contains("load")) {
            args.requireMin(1);
            String name = args.getString();

            if (configStorage.findConfig(name) != null) {
                try {
                    configStorage.loadConfiguration(name);
                    logDirect(String.format("Конфигурация %s загружена!", name));
                } catch (Exception e) {
                    logDirect(String.format("Ошибка при загрузке конфига! Детали: %s", e.getMessage()), Formatting.RED);
                }
            } else {
                logDirect(String.format("Конфигурация %s не найдена!", name), Formatting.RED);
            }
        }

        if (action.equals("save") || action.contains("save")) {
            args.requireMin(1);
            String name = args.getString();

            try {
                ConfigStorage.saveConfiguration(name);
                logDirect(String.format("Конфигурация %s сохранена!", name));
            } catch (Exception e) {
                logDirect(String.format("Ошибка при сохранении конфига! Детали: %s", e.getMessage()), Formatting.RED);
            }
        }

        if (action.equals("list") || action.contains("list")) {
            Paginator.paginate(
                    args, new Paginator<>(
                            getConfigs()),
                    () -> logDirect("Список конфигов:"),
                    config -> {
                        MutableText namesComponent = Text.literal(config);
                        namesComponent.setStyle(namesComponent.getStyle().withColor(Formatting.WHITE));
                        return namesComponent;
                    },
                    FORCE_COMMAND_PREFIX + label
            );
        }

        if (action.equals("dir") || action.contains("dir")) {
            try {
                Runtime.getRuntime().exec("explorer " + configStorage.CONFIG_DIR.getAbsolutePath());
            } catch (IOException e) {
                logDirect("Папка с конфигурациями не найдена!" + e.getMessage());
            }
        }
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
                    .prepend("load", "save", "list", "dir")
                    .filterPrefix(prefix)
                    .stream();
        }

        if (args.hasExactly(2)) {
            String action = args.getString();
            action = action.toLowerCase(Locale.US);

            if (action.equals("load") || action.equals("save")) {
                return args.tabCompleteDatatype(ConfigFileDataType.INSTANCE);
            }
        }

        return Stream.empty();
    }

    @Override
    public String getShortDesc() {
        return "Позволяет взаимодействовать с конфигами в чите";
    }

    @Override
    public List<String> getLongDesc() {
        return Arrays.asList(
                "С помощью этой команды можно загружать/сохранять конфиги",
                "",
                "Использование:",
                "> config load <name> - Загружает конфиг.",
                "> config save <name> - Сохраняет конфиг.",
                "> config list - Возвращает список конфигов",
                "> config dir - Открывает папку с конфигами."
        );
    }

    public List<String> getConfigs() {
        ConfigStorage configStorage = configStorage();
        List<String> configs = new ArrayList<>();
        if (configStorage == null) {
            return configs;
        }
        File[] configFiles = configStorage.CONFIG_DIR.listFiles();

        if (configFiles != null) {
            for (File configFile : configFiles) {
                if (configFile.isFile() && configFile.getName().endsWith(".json")) {
                    String configName = configFile.getName().replace(".json", "");
                    configs.add(configName);
                }
            }
        }

        return configs;
    }

    private ConfigStorage configStorage() {
        ConfigStorage storage = NexisClient.getConfigStorage();
        return storage != null ? storage : ClientContainer.getNexisInstance().getConfigStorage();
    }
}
