package fun.nexisdlc.commands.commands.defaults;

import fun.nexisdlc.Nexis;
import fun.nexisdlc.commands.Command;
import fun.nexisdlc.commands.argument.IArgConsumer;
import fun.nexisdlc.commands.exception.CommandException;
import fun.nexisdlc.modules.impl.combat.AimBot;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import net.minecraft.util.Formatting;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class AimBotCommand extends Command {

    Nexis nexis;

    protected AimBotCommand(Nexis nexis) {
        super("aimbot");
        this.nexis = nexis;
    }

    @Override
    public void execute(String label, IArgConsumer args) throws CommandException {
        if (!args.hasAny()) {
            showHelp();
            return;
        }

        String action = args.getString().toLowerCase(Locale.US);
        AimBot aimBot = getAimBot();
        if (aimBot == null) {
            return;
        }

        switch (action) {
            case "generate" -> {
                aimBot.generateRandomPattern(true);
            }
            case "autorefresh" -> {
                if (!args.hasAny()) {
                    int current = aimBot.getAutoRefreshSeconds();
                    if (current > 0) {
                        logDirect("AimBot autorefresh: каждые " + current + " сек.", Formatting.GRAY);
                    } else {
                        logDirect("AimBot autorefresh выключен. Используй: .aimbot autorefresh <сек>", Formatting.GRAY);
                    }
                    return;
                }

                Integer seconds = args.getAsOrNull(Integer.class);
                if (seconds == null) {
                    logDirect("Неверное значение секунд. Используй число: .aimbot autorefresh <сек>", Formatting.RED);
                    return;
                }

                if (seconds < 0) {
                    logDirect("Секунды не могут быть отрицательными.", Formatting.RED);
                    return;
                }

                if (seconds > 3600) {
                    logDirect("Максимум 3600 секунд (1 час).", Formatting.RED);
                    return;
                }

                aimBot.configureAutoRefresh(seconds, true);
            }
            case "status" -> {
                String state = aimBot.isState() ? "включен" : "выключен";
                int autoRefresh = aimBot.getAutoRefreshSeconds();
                logDirect("AimBot " + state + ", паттерн #" + aimBot.getCurrentPatternId()
                        + ", autorefresh: " + (autoRefresh > 0 ? (autoRefresh + " сек") : "off"), Formatting.GRAY);
            }
            case "help" -> showHelp();
            default -> {
                logDirect("Неизвестная подкоманда: " + action, Formatting.RED);
                showHelp();
            }
        }
    }

    @Override
    public Stream<String> tabComplete(String label, IArgConsumer args) throws CommandException {
        if (!args.hasAny()) {
            return Stream.empty();
        }

        if (args.hasExactlyOne()) {
            String prefix = args.peekString(0).toLowerCase(Locale.US);
            return Stream.of("generate", "autorefresh", "status", "help")
                    .filter(option -> option.startsWith(prefix));
        }

        String action = args.peekString(0).toLowerCase(Locale.US);
        if ("autorefresh".equals(action) && args.hasExactly(2)) {
            String prefix = args.peekString(1);
            return Stream.of("0", "5", "10", "15", "30", "60")
                    .filter(value -> value.startsWith(prefix));
        }

        return Stream.empty();
    }

    @Override
    public String getShortDesc() {
        return "Генерация и автообновление паттернов рандомизации AimBot";
    }

    @Override
    public List<String> getLongDesc() {
        return Arrays.asList(
                "Управляет системой паттернов рандомизации AimBot.",
                "",
                "Использование:",
                "> aimbot generate - сгенерировать новый паттерн",
                "> aimbot autorefresh <сек> - автообновлять паттерн (0 = выключить)",
                "> aimbot status - текущий статус",
                "> aimbot help - подсказка"
        );
    }

    private void showHelp() {
        logDirect("AimBot pattern - помощь:");
        logDirect(Formatting.GRAY + "  .aimbot generate - новый паттерн");
        logDirect(Formatting.GRAY + "  .aimbot autorefresh <сек> - автообновление (сохраняется в конфиг)");
        logDirect(Formatting.GRAY + "  .aimbot autorefresh 0 - выключить автообновление");
        logDirect(Formatting.GRAY + "  .aimbot status - текущий статус");
    }

    private AimBot getAimBot() {
        if (Nexis.getFunctionManager() != null && Nexis.getFunctionManager().getAimBot() instanceof AimBot aimBot) {
            return aimBot;
        }
        logDirect("Модуль AimBot не найден", Formatting.RED);
        return null;
    }
}
