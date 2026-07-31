package fun.nexisdlc.commands.commands.defaults;

import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.utils.player.PlayerUtils;
import fun.nexisdlc.commands.Command;
import fun.nexisdlc.commands.argument.IArgConsumer;
import fun.nexisdlc.commands.datatypes.KeyDataType;
import fun.nexisdlc.commands.exception.CommandException;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionManager;
import fun.nexisdlc.modules.api.settings.impl.BooleanSetting;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import net.minecraft.util.Formatting;
import org.lwjgl.glfw.GLFW;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class BindCommand extends Command {
    FunctionManager functionManager;

    public BindCommand(Nexis Nexis) {
        super("bind");
        functionManager = Nexis.getFunctionManager();
    }

    @Override
    public void execute(String label, IArgConsumer args) throws CommandException {
        String action = args.hasAny() ? args.getString().toLowerCase(Locale.US) : "list";

        System.out.println("пырив");
        switch (action) {
            case "add":
                handleAddBind(args);
                break;
            case "remove":
                handleRemoveBind(args);
                break;
            case "list":
                handleListBinds(args, label);
                break;
            case "clear":
                handleClearBinds(args);
                break;
        }
    }

    void handleAddBind(IArgConsumer args) throws CommandException {
        args.requireExactly(2);

        String functionName = args.getString();
        int key = args.getDatatypeFor(KeyDataType.INSTANCE).getValue();

        Function function = functionManager.getFunctionByName(functionName);
        if (function == null) {
            logDirect("§cФункция §f" + functionName + "§c не найдена!");
            return;
        }

        functionManager.getVisibleFunctions().stream()
                .filter(f -> f.getBind() == key && f != function)
                .findFirst()
                .ifPresent(existing -> logDirect(Formatting.YELLOW + "Клавиша §b" +
                        PlayerUtils.getBindName(key) + Formatting.YELLOW +
                        " уже занята функцией §c" + existing.getName()));

        function.setBind(key);
        logDirect(Formatting.GREEN + "Функция §f" + function.getName() +
                Formatting.GREEN + " успешно привязана к §f" + PlayerUtils.getBindName(key));
    }

    void handleRemoveBind(IArgConsumer args) throws CommandException {
        args.requireExactly(1);
        String functionName = args.getString();

        Function function = functionManager.getFunctionByName(functionName);
        if (function == null) {
            logDirect("§cФункция §f" + functionName + "§c не найдена!");
            return;
        }

        if (function.getBind() == GLFW.GLFW_KEY_UNKNOWN || function.getBind() == GLFW.GLFW_MOUSE_BUTTON_1) {
            logDirect("§eУ функции §f" + function.getName() + "§e нет привязанной клавиши.");
            return;
        }

        String keyName = PlayerUtils.getBindName(function.getBind());
        function.setBind(GLFW.GLFW_KEY_UNKNOWN);
        logDirect("§aБинд §f" + function.getName() + " §8(§c" + keyName + "§8) §aуспешно удалён.");
    }

    void handleListBinds(IArgConsumer args, String label) throws CommandException {
        args.requireMax(0);

        List<Function> boundFunctions = functionManager.getVisibleFunctions().stream()
                .filter(f -> {
                    int bind = f.getBind();
                    return bind != GLFW.GLFW_KEY_UNKNOWN
                            && bind != -1
                            && bind != GLFW.GLFW_MOUSE_BUTTON_1;
                })
                .sorted(Comparator.comparing(f -> f.getName().toLowerCase(Locale.US)))
                .toList();

        // Собираем BooleanSetting-бинды
        int booleanBindCount = 0;
        for (Function f : functionManager.getVisibleFunctions()) {
            for (fun.nexisdlc.modules.api.settings.api.Setting<?> s : f.getSettings()) {
                if (s instanceof BooleanSetting bs && bs.isBound()) {
                    booleanBindCount++;
                }
            }
        }

        if (boundFunctions.isEmpty() && booleanBindCount == 0) {
            logDirect("§fНет привязанных функций. Используй §a.bind add <функция> <клавиша>");
            return;
        }

        logDirect("§fПривязанные функции:");

        for (Function func : boundFunctions) {
            String keyName = PlayerUtils.getBindName(func.getBind());
            logDirect(" §7• §f" + func.getName() + " §8→ §c" + keyName);
        }

        if (booleanBindCount > 0) {
            logDirect("§fПривязанные настройки:");
            for (Function f : functionManager.getVisibleFunctions()) {
                for (fun.nexisdlc.modules.api.settings.api.Setting<?> s : f.getSettings()) {
                    if (s instanceof BooleanSetting bs && bs.isBound()) {
                        String keyName = PlayerUtils.getBindName(bs.getBind());
                        logDirect(" §7• §f" + f.getName() + ": " + bs.getName() + " §8→ §c" + keyName);
                    }
                }
            }
        }

        logDirect("§8Страница §71§8/§71");
    }

    void handleClearBinds(IArgConsumer args) throws CommandException {
        args.requireMax(0);
        int cleared = 0;
        // Очищаем бинды функций
        for (Function f : functionManager.getFunctions()) {
            if (f.getBind() != GLFW.GLFW_KEY_UNKNOWN) {
                f.setBind(GLFW.GLFW_KEY_UNKNOWN);
                cleared++;
            }
        }
        // Очищаем бинды BooleanSetting
        for (Function f : functionManager.getFunctions()) {
            for (fun.nexisdlc.modules.api.settings.api.Setting<?> s : f.getSettings()) {
                if (s instanceof BooleanSetting bs && bs.isBound()) {
                    bs.setBind(-1);
                    cleared++;
                }
            }
        }
        logDirect(Formatting.GREEN + "Успешно удалено биндов: " + cleared);
    }

    @Override
    public Stream<String> tabComplete(String label, IArgConsumer args) throws CommandException {
        if (args.hasExactlyOne()) {
            String prefix = args.peekString(0).toLowerCase(Locale.US);
            return Stream.of("add", "remove", "list", "clear")
                    .filter(s -> s.startsWith(prefix))
                    .sorted();
        }

        String action = args.peekString(0).toLowerCase(Locale.US);

        if ("add".equals(action)) {
            if (args.hasExactly(2)) {
                String prefix = args.peekString(1).toLowerCase(Locale.US);
                return functionManager.getVisibleFunctions().stream()
                        .map(Function::getName)
                        .filter(name -> name.startsWith(prefix))
                        .sorted(String.CASE_INSENSITIVE_ORDER);
            }
            if (args.hasExactly(3)) {
                return args.tabCompleteDatatype(KeyDataType.INSTANCE);
            }
        }

        if ("remove".equals(action) && args.hasExactly(2)) {
            String prefix = args.peekString(1).toLowerCase(Locale.US);
            return functionManager.getVisibleFunctions().stream()
                    .filter(f -> {
                        int bind = f.getBind();
                        return bind != GLFW.GLFW_KEY_UNKNOWN
                                && bind != -1
                                && bind != GLFW.GLFW_MOUSE_BUTTON_1;
                    })
                    .map(Function::getName)
                    .map(String::toLowerCase)
                    .filter(name -> name.startsWith(prefix))
                    .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
                    .sorted(String.CASE_INSENSITIVE_ORDER);
        }

        return Stream.empty();
    }

    @Override
    public String getShortDesc() {
        return "Управление биндами для модулей.";
    }

    @Override
    public List<String> getLongDesc() {
        return Arrays.asList(
                "Эта команда позволяет управлять биндами для модулей, которые будут активироваться при нажатии определённых клавиш.",
                "",
                "Использование:",
                "> bind add <module> <key> - Привязывает модуль к указанной клавише.",
                "> bind remove <module> - Удаляет привязку модуля.",
                "> bind list - Показывает список всех текущих биндов модулей.",
                "> bind clear - Удаляет все бинды модулей."
        );
    }
}

