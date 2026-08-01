package fun.nexisdlc.commands.commands.defaults;

import fun.nexisdlc.ClientContainer;
import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.utils.config.FriendStorage;
import fun.nexisdlc.commands.Command;
import fun.nexisdlc.commands.argument.IArgConsumer;
import fun.nexisdlc.commands.datatypes.FriendDataType;
import fun.nexisdlc.commands.datatypes.TabPlayerDataType;
import fun.nexisdlc.commands.exception.CommandException;
import fun.nexisdlc.commands.helpers.Paginator;
import fun.nexisdlc.commands.helpers.TabCompleteHelper;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

import static fun.nexisdlc.commands.IChatControl.FORCE_COMMAND_PREFIX;

public class FriendCommand extends Command {
    final FriendStorage friendRepository;

    protected FriendCommand(Nexis Nexis) {
        super("friend");
        friendRepository = Nexis.getFriendStorage();
    }

    @Override
    public void execute(String label, IArgConsumer args) throws CommandException {
        String arg = args.hasAny() ? args.getString().toLowerCase(Locale.US) : "list";
        switch (arg) {
            case "add" -> handleAddFriend(args);
            case "remove" -> handleRemove(args);
            case "clear" -> handleClear(args);
            case "list" -> handleList(label, args);
        }
    }

    void handleAddFriend(IArgConsumer args) throws CommandException {
        args.requireMin(1);
        String name = args.getString();

        if (friendRepository.exists(name)) {
            logDirect("Этот ник уже есть в списке!", Formatting.RED);
            return;
        }

        logDirect("Добавлен ник " + name, Formatting.GRAY);
        friendRepository.add(name);
    }

    void handleRemove(IArgConsumer args) throws CommandException {
        args.requireMax(1);
        String name = args.getString();
        if (friendRepository.exists(name)) {
            logDirect(Formatting.GREEN + "Ник " + Formatting.RED + name + Formatting.GREEN + " был убран из списка!");
            friendRepository.remove(name);
        } else {
            logDirect("Игрок с никнеймом '" + name + "' не найден!");
        }
    }

    void handleList(String label, IArgConsumer args) throws CommandException {
        args.requireMax(1);

        Paginator.paginate(
                args, new Paginator<>(ClientContainer.getNexisInstance().getFriendStorage().getFriends()),
                () -> logDirect("Список никнеймов друзей:"),
                friend -> {
                    String names = friend.getName();
                    MutableText namesComponent = Text.literal(names);
                    namesComponent.setStyle(namesComponent.getStyle().withColor(Formatting.WHITE));
                    return namesComponent;
                },
                FORCE_COMMAND_PREFIX + label
        );
    }

    void handleClear(IArgConsumer args) throws CommandException {
        args.requireMax(1);
        friendRepository.clear();
        logDirect(Formatting.GREEN + "Все ники друзей были удалены.");
    }

    @Override
    public Stream<String> tabComplete(String label, IArgConsumer args) throws CommandException {
        if (args.hasAny()) {
            String arg = args.getString();
            if (args.hasExactlyOne()) {
                if (arg.equalsIgnoreCase("add")) {
                    return args.tabCompleteDatatype(TabPlayerDataType.INSTANCE);
                } else if (arg.equalsIgnoreCase("remove")) {
                    return args.tabCompleteDatatype(FriendDataType.INSTANCE);
                }
            } else {
                return new TabCompleteHelper()
                        .sortAlphabetically()
                        .prepend("add", "remove", "list", "clear")
                        .filterPrefix(arg)
                        .stream();
            }
        }
        return Stream.empty();
    }
    
    @Override
    public String getShortDesc() {
        return "Позволяет управлять списком друзей";
    }

    
    @Override
    public List<String> getLongDesc() {
        return Arrays.asList(
                "С помощью этой команды можно добавлять/удалять друзей в список",
                "",
                "Использование:",
                "> friend add <name> - Добавляет имя в список друзей.",
                "> friend remove <name> - Удаляет имя из списка друзей.",
                "> friend list - Возвращает список друзей",
                "> friend clear - Очищает список друзей."
        );
    }
}
