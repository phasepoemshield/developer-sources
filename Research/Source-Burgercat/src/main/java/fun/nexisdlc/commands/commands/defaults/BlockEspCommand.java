package fun.nexisdlc.commands.commands.defaults;

import fun.nexisdlc.client.utils.client.ILogger;
import fun.nexisdlc.client.utils.config.BlockEspStorage;
import fun.nexisdlc.commands.Command;
import fun.nexisdlc.commands.argument.IArgConsumer;
import fun.nexisdlc.commands.exception.CommandException;
import fun.nexisdlc.commands.helpers.Paginator;
import fun.nexisdlc.commands.helpers.TabCompleteHelper;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

import static fun.nexisdlc.commands.IChatControl.FORCE_COMMAND_PREFIX;

public class BlockEspCommand extends Command implements ILogger {
    private static final int DIR_PAGE_LIMIT = 80;
    private static final int TAB_LIMIT = 200;

    private final BlockEspStorage storage = BlockEspStorage.getInstance();

    protected BlockEspCommand() {
        super("blockesp");
    }

    @Override
    public void execute(String label, IArgConsumer args) throws CommandException {
        String sub = args.hasAny() ? args.getString().toLowerCase(Locale.US) : "list";
        switch (sub) {
            case "add" -> handleAdd(args);
            case "remove", "del", "delete" -> handleRemove(args);
            case "clear" -> handleClear(args);
            case "dir", "blocks" -> handleDir(label, args);
            case "list" -> handleList(label, args);
            default -> logDirect(Formatting.RED + "Неизвестная команда. Используй: blockesp add/remove/list/dir/clear");
        }
    }

    private void handleAdd(IArgConsumer args) throws CommandException {
        args.requireMax(1);
        String rawId = args.getString();
        String id = normalizeForChat(rawId);
        if (id == null) {
            logDirect(Formatting.RED + "Неверный ID блока.");
            return;
        }
        if (storage.exists(id)) {
            logDirect(Formatting.YELLOW + "Блок уже есть в BlockESP: " + Formatting.WHITE + id);
            return;
        }
        if (storage.add(id)) {
            logDirect(Formatting.GREEN + "Добавлен блок в BlockESP: " + Formatting.WHITE + id);
        } else {
            logDirect(Formatting.RED + "Блок не найден: " + Formatting.WHITE + id);
        }
    }

    private void handleRemove(IArgConsumer args) throws CommandException {
        args.requireMax(1);
        String rawId = args.getString();
        String id = normalizeForChat(rawId);
        if (id != null && storage.remove(id)) {
            logDirect(Formatting.GREEN + "Удалён блок из BlockESP: " + Formatting.WHITE + id);
        } else {
            logDirect(Formatting.RED + "Блок не найден в списке: " + Formatting.WHITE + rawId);
        }
    }

    private void handleClear(IArgConsumer args) throws CommandException {
        args.requireMax(1);
        storage.clear();
        logDirect(Formatting.GREEN + "Список BlockESP очищен.");
    }

    private void handleList(String label, IArgConsumer args) throws CommandException {
        args.requireMax(1);
        List<String> ids = storage.getBlockIds();
        if (ids.isEmpty()) {
            logDirect(Formatting.GRAY + "BlockESP список пуст. Пример: .blockesp add minecraft:diamond_ore");
            return;
        }
        Paginator.paginate(args, new Paginator<>(ids),
                () -> logDirect("BlockESP блоки:"),
                id -> Text.literal(Formatting.GRAY + "- " + Formatting.WHITE + id),
                FORCE_COMMAND_PREFIX + label);
    }

    private void handleDir(String label, IArgConsumer args) throws CommandException {
        args.requireMax(1);
        String filter = args.hasAny() ? args.getString() : "";
        List<String> ids = BlockEspStorage.streamBlockIds(filter).limit(DIR_PAGE_LIMIT);
        Paginator.paginate(args, new Paginator<>(ids),
                () -> logDirect("Доступные блоки" + (filter.isEmpty() ? ":" : " по фильтру '" + filter + "':")),
                id -> Text.literal(Formatting.GRAY + "- " + Formatting.WHITE + id),
                FORCE_COMMAND_PREFIX + label + " dir");
    }

    @Override
    public Stream<String> tabComplete(String label, IArgConsumer args) throws CommandException {
        if (!args.hasAny()) {
            return new TabCompleteHelper()
                    .sortAlphabetically()
                    .prepend("add", "remove", "list", "dir", "clear")
                    .stream();
        }

        String sub = args.getString();
        String subLower = sub.toLowerCase(Locale.US);

        if (subLower.equals("add")) {
            String prefix = args.hasAny() ? args.getString() : "minecraft:";
            return BlockEspStorage.streamBlockIds(prefix).limit(TAB_LIMIT).stream();
        }

        if (subLower.equals("dir") || subLower.equals("blocks")) {
            String prefix = args.hasAny() ? args.getString() : "minecraft:";
            return BlockEspStorage.streamBlockIds(prefix).limit(TAB_LIMIT).stream();
        }

        if (subLower.equals("remove") || subLower.equals("del") || subLower.equals("delete")) {
            String prefix = args.hasAny() ? args.getString().toLowerCase(Locale.US) : "";
            return storage.getBlockIds().stream()
                    .filter(id -> prefix.isEmpty() || id.toLowerCase(Locale.US).startsWith(prefix) || id.toLowerCase(Locale.US).contains(prefix));
        }

        if (subLower.equals("list") || subLower.equals("clear")) {
            return Stream.empty();
        }

        return new TabCompleteHelper()
                .sortAlphabetically()
                .prepend("add", "remove", "list", "dir", "clear")
                .filterPrefix(sub)
                .stream();
    }

    @Override
    public String getShortDesc() {
        return "Рендерит выбранные блоки сквозь стены";
    }

    @Override
    public List<String> getLongDesc() {
        return Arrays.asList(
                "BlockESP показывает выбранные блоки такой же обводкой, как BlockOverlay, но сквозь блоки.",
                "",
                "Использование:",
                "> blockesp add <minecraft:block> - добавить блок",
                "> blockesp remove <minecraft:block> - удалить блок",
                "> blockesp list - список выбранных блоков",
                "> blockesp dir [filter] - список всех блоков/поиск по блокам",
                "> blockesp clear - очистить список",
                "",
                "Пример: .blockesp add minecraft:diamond_ore"
        );
    }

    private static String normalizeForChat(String rawId) {
        if (BlockEspStorage.normalize(rawId) == null) {
            return null;
        }
        return BlockEspStorage.normalize(rawId).toString();
    }
}
