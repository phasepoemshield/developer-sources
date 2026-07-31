package fun.wonderful.api.commands.impl;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import fun.wonderful.api.commands.Command;
import fun.wonderful.api.storages.implement.helpertstorages.enumvar.ModuleClass;
import fun.wonderful.api.utils.chat.ChatUtils;
import fun.wonderful.client.modules.Module;
import java.lang.reflect.Field;
import java.util.Optional;
import net.minecraft.command.CommandSource;
import org.lwjgl.glfw.GLFW;

public class BindCommand
extends Command {
    public BindCommand() {
        super("bind");
    }

    @Override
    public void execute(LiteralArgumentBuilder<CommandSource> var1) {
    }


    private Optional<Module> findModuleByName(String moduleName) {
        return ModuleClass.INSTANCE.getObject().stream().filter(module -> module.getName().equalsIgnoreCase(moduleName)).findFirst();
    }

    private int getKeyCode(String keyName) {
        if ("NONE".equalsIgnoreCase(keyName)) {
            return -1;
        }
        try {
            return GLFW.class.getField("GLFW_KEY_" + keyName).getInt(null);
        }
        catch (IllegalAccessException | NoSuchFieldException ignored) {
            return -1;
        }
    }

    private SuggestionProvider<CommandSource> createModuleSuggestions() {
        return (context, suggestionsBuilder) -> {
            String remaining = suggestionsBuilder.getRemaining().toLowerCase();
            ModuleClass.INSTANCE.getObject().stream().map(Module::getName).filter(name -> name.toLowerCase().startsWith(remaining)).forEach(arg_0 -> ((SuggestionsBuilder)suggestionsBuilder).suggest(arg_0));
            return suggestionsBuilder.buildFuture();
        };
    }

    private SuggestionProvider<CommandSource> createKeySuggestions() {
        return (context, suggestionsBuilder) -> {
            String remaining = suggestionsBuilder.getRemaining().toUpperCase();
            for (Field field : GLFW.class.getDeclaredFields()) {
                String keyName;
                String fieldName = field.getName();
                if (!fieldName.startsWith("GLFW_KEY_") || !(keyName = fieldName.replace("GLFW_KEY_", "")).startsWith(remaining)) continue;
                suggestionsBuilder.suggest(keyName);
            }
            if ("NONE".startsWith(remaining)) {
                suggestionsBuilder.suggest("NONE");
            }
            return suggestionsBuilder.buildFuture();
        };
    }

    private com.mojang.brigadier.Command<CommandSource> bindKeyCommand() {
        return ctx -> {
            String moduleName = (String)ctx.getArgument("module", String.class);
            Optional<Module> optionalModule = this.findModuleByName(moduleName);
            if (optionalModule.isEmpty()) {
                ChatUtils.sendMessage("Модуль " + moduleName + " не найден");
                return 1;
            }
            Module module = optionalModule.get();
            String keyName = ((String)ctx.getArgument("key", String.class)).toUpperCase();
            int keyCode = this.getKeyCode(keyName);
            if (keyCode == -1) {
                ChatUtils.sendMessage("Клавиша " + keyName + " не найдена");
            } else {
                module.setKey(keyCode);
                ChatUtils.sendMessage("Модуль " + module.getName() + " привязан к клавише " + keyName);
            }
            return 1;
        };
    }

    private com.mojang.brigadier.Command<CommandSource> unbindSingleCommand() {
        return ctx -> {
            String moduleName = (String)ctx.getArgument("module", String.class);
            Optional<Module> optionalModule = this.findModuleByName(moduleName);
            if (optionalModule.isEmpty()) {
                ChatUtils.sendMessage("Модуль " + moduleName + " не найден");
                return 1;
            }
            Module module = optionalModule.get();
            module.setKey(-1);
            ChatUtils.sendMessage("Привязка клавиши для модуля " + module.getName() + " удалена");
            return 1;
        };
    }

    private com.mojang.brigadier.Command<CommandSource> unbindAllCommand() {
        return ctx -> {
            ModuleClass.INSTANCE.getObject().forEach(module -> module.setKey(-1));
            ChatUtils.sendMessage("Все привязки клавиш удалены");
            return 1;
        };
    }

    private com.mojang.brigadier.Command<CommandSource> listBindingsCommand() {
        return ctx -> {
            StringBuilder bindingsList = new StringBuilder("Список привязанных модулей: ");
            boolean hasBinds = ModuleClass.INSTANCE.getObject().stream().filter(module -> module.getKey() != -1).peek(module -> bindingsList.append("Модуль: ").append(module.getName()).append(" -> Клавиша: ").append(module.getKey()).append("\n")).findAny().isPresent();
            if (!hasBinds) {
                ChatUtils.sendMessage("Нет привязанных модулей");
            } else {
                ChatUtils.sendMessage(bindingsList.toString());
            }
            return 1;
        };
    }
}