package fun.nexisdlc.commands.commands.defaults;

import fun.nexisdlc.ClientContainer;
import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.utils.irc.IRCManager;
import fun.nexisdlc.commands.Command;
import fun.nexisdlc.commands.argument.IArgConsumer;
import fun.nexisdlc.commands.exception.CommandException;
import fun.nexisdlc.modules.impl.utils.IRC;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import net.minecraft.util.Formatting;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class IRCCommand extends Command {

    protected IRCCommand(Nexis Nexis) {
        super("irc", "ircchat");
    }

    @Override
    public void execute(String label, IArgConsumer args) throws CommandException {
        if (!args.hasAny()) {
            showHelp();
            return;
        }

        String action = args.getString().toLowerCase(Locale.US);

        switch (action) {
            case "send" -> {
                String message = args.rawRest().trim();

                if (message.isEmpty()) {
                    logDirect(Formatting.RED + "Введите сообщение! .irc send <сообщение>", Formatting.RED);
                    return;
                }

                if (!IRC.isConnected()) {
                    logDirect(Formatting.RED + "IRC не подключен! Используйте .irc connect", Formatting.RED);
                    return;
                }

                IRC.sendIRCMessage(message);
            }

            case "connect" -> {
                IRC module = ClientContainer.getNexisInstance().getFunctionManager().getIRC();
                if (module == null) {
                    logDirect(Formatting.RED + "IRC модуль не найден!", Formatting.RED);
                    return;
                }

                if (IRC.isConnected()) {
                    logDirect(Formatting.YELLOW + "IRC уже подключен!");
                    return;
                }

                module.setState(true);
                logDirect(Formatting.GREEN + "IRC подключение...");
            }

            case "disconnect" -> {
                IRC module = ClientContainer.getNexisInstance().getFunctionManager().getIRC();
                if (module != null) {
                    module.setState(false);
                    logDirect(Formatting.RED + "IRC отключен!");
                } else {
                    logDirect(Formatting.RED + "IRC модуль не найден!", Formatting.RED);
                }
            }

            case "status" -> {
                if (IRC.isConnected()) {
                    IRCManager manager = IRC.getManager();
                    if (manager != null) {
                        logDirect(Formatting.GREEN + "IRC: Подключено");
                        logDirect(Formatting.GRAY + "Токен: " + (manager.getToken().isEmpty() ? "не установлен" : "установлен"));
                        logDirect(Formatting.GRAY + "Сообщений в истории: " + manager.getRecentMessages(100).size());
                    }
                } else {
                    logDirect(Formatting.RED + "IRC: Не подключено");
                }
            }
            case "clear" -> {
                IRCManager manager = IRC.getManager();
                if (manager != null) {
                    manager.clearMessages();
                    logDirect(Formatting.GREEN + "История IRC очищена!");
                }
            }

            case "help" -> showHelp();

            default -> {
                logDirect(Formatting.RED + "Неизвестная команда: " + action, Formatting.RED);
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
            String prefix = args.getString().toLowerCase(Locale.US);
            return Stream.of("send", "connect", "disconnect", "status", "clear", "help")
                    .filter(cmd -> cmd.startsWith(prefix));
        }

        return Stream.empty();
    }

    @Override
    public String getShortDesc() {
        return "Управление IRC чатом";
    }

    @Override
    public List<String> getLongDesc() {
        return Arrays.asList(
                "IRC чат для общения с другими игроками",
                "",
                "Использование:",
                "> irc send <сообщение> - Отправить сообщение",
                "> irc connect - Подключиться к серверу",
                "> irc disconnect - Отключиться от сервера",
                "> irc status - Проверить статус подключения",
                "> irc clear - Очистить историю сообщений",
                "> irc help - Показать эту справку"
        );
    }

    private void showHelp() {
        logDirect("IRC Chat - помощь:");
        logDirect(Formatting.GRAY + "  " + "irc send <сообщение> - Отправить сообщение");
        logDirect(Formatting.GRAY + "  " + "irc connect - Подключиться");
        logDirect(Formatting.GRAY + "  " + "irc disconnect - Отключиться");
        logDirect(Formatting.GRAY + "  " + "irc status - Статус");
        logDirect(Formatting.GRAY + "  " + "irc clear - Очистить историю");
    }
}
