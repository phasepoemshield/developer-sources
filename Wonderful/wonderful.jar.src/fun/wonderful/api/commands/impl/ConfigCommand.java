package fun.wonderful.api.commands.impl;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import fun.wonderful.Wonderful;
import fun.wonderful.api.commands.Command;
import fun.wonderful.api.utils.chat.ChatUtils;
import java.io.File;
import java.util.Arrays;
import net.minecraft.command.CommandSource;
import ru.ocz.protection.annotation.Compile;

public class ConfigCommand
extends Command {
    public ConfigCommand() {
        super("config");
    }

    public ConfigCommand(String name) {
        super(name);
    }

    @Override
    @Compile
    public native void execute(LiteralArgumentBuilder<CommandSource> var1);

        return (context, builder1) -> {
            File[] files;
            if (Wonderful.INSTANCE.configsDir.exists() && Wonderful.INSTANCE.configsDir.isDirectory() && (files = Wonderful.INSTANCE.configsDir.listFiles((dir, name) -> name.toLowerCase().endsWith(".wonder"))) != null) {
                Arrays.stream(files).map(File::getName).map(name -> name.replace(".wonder", "")).forEach(arg_0 -> ((SuggestionsBuilder)builder1).suggest(arg_0));
            }
            return builder1.buildFuture();
        };
    }

        return context -> {
            String config = (String)context.getArgument("config", String.class);
            try {
                Wonderful.INSTANCE.configStorage.saveConfig(config);
                ChatUtils.sendMessage("Конфиг " + config + " успешно сохранён!");
            }
            catch (Exception e2) {
                ChatUtils.sendMessage("Ошибка при сохранении конфига " + config + "!");
                e2.printStackTrace();
            }
            return 1;
        };
    }

        return (context, builder1) -> {
            File[] files;
            if (Wonderful.INSTANCE.configsDir.exists() && Wonderful.INSTANCE.configsDir.isDirectory() && (files = Wonderful.INSTANCE.configsDir.listFiles((dir, name) -> name.toLowerCase().endsWith(".wonder"))) != null) {
                Arrays.stream(files).map(File::getName).map(name -> name.replace(".wonder", "")).forEach(arg_0 -> ((SuggestionsBuilder)builder1).suggest(arg_0));
            }
            return builder1.buildFuture();
        };
    }

        return context -> {
            String config = (String)context.getArgument("config", String.class);
            try {
                Wonderful.INSTANCE.configStorage.loadConfig(config);
                ChatUtils.sendMessage("Конфиг " + config + " успешно загружен!");
            }
            catch (Exception e2) {
                ChatUtils.sendMessage("Ошибка при загрузке конфига " + config + "!");
                e2.printStackTrace();
            }
            return 1;
        };
    }

        return context -> {
            File[] files = Wonderful.INSTANCE.configsDir.listFiles((dir, name) -> name.toLowerCase().endsWith(".wonder"));
            if (files == null || files.length == 0) {
                ChatUtils.sendMessage("Список конфигов пуст!");
            } else {
                StringBuilder builder1 = new StringBuilder();
                for (int i2 = 0; i2 < files.length; ++i2) {
                    String fileName = files[i2].getName().replace(".wonder", "");
                    builder1.append(fileName);
                    if (i2 >= files.length - 1) continue;
                    builder1.append(", ");
                }
                ChatUtils.sendMessage("Конфиги: " + String.valueOf(builder1));
            }
            return 1;
        };
    }

        return context -> {
            try {
                File configsDir = new File(Wonderful.INSTANCE.globalsDir, "configs");
                if (!configsDir.exists()) {
                    configsDir.mkdirs();
                }
                new ProcessBuilder("explorer.exe", configsDir.getAbsolutePath()).start();
                ChatUtils.sendMessage("Папка с конфигами открыта!");
            }
            catch (Exception e2) {
                ChatUtils.sendMessage("Ошибка при открытии папки с конфигами!");
                e2.printStackTrace();
            }
            return 1;
        };
    }
}