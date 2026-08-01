package fun.nexisdlc.commands.commands.defaults;

import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.utils.config.AutoSellConfig;
import fun.nexisdlc.commands.Command;
import fun.nexisdlc.commands.argument.IArgConsumer;
import fun.nexisdlc.commands.exception.CommandException;
import fun.nexisdlc.commands.helpers.TabCompleteHelper;
import fun.nexisdlc.modules.api.Function;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.util.Formatting;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class AutoSellCommand extends Command {
    private final AutoSellConfig config;

    public AutoSellCommand(Nexis nexis) {
        super("autosell");
        this.config = nexis.getAutoSellConfig();
    }

    @Override
    public void execute(String label, IArgConsumer args) throws CommandException {
        if (!args.hasAny()) {
            logDirect("Использование: .autosell add <item> | remove <item> | list | clear", Formatting.GRAY);
            return;
        }

        String action = args.getString().toLowerCase(Locale.US);
        switch (action) {
            case "add" -> handleAdd(args);
            case "remove" -> handleRemove(args);
            case "list" -> handleList();
            case "clear" -> handleClear();
            default -> logDirect("Неизвестная подкоманда. Используйте: add, remove, list, clear", Formatting.RED);
        }
    }

    private void handleAdd(IArgConsumer args) throws CommandException {
        args.requireMin(1);
        String input = args.getString().toLowerCase(Locale.US);

        String itemId = resolveItemId(input);
        if (itemId == null) {
            logDirect("Предмет '" + input + "' не найден!", Formatting.RED);
            return;
        }

        if (config.contains(itemId)) {
            logDirect("Предмет " + itemId + " уже есть в списке!", Formatting.YELLOW);
            return;
        }

        config.add(itemId);
        logDirect("Добавлен предмет: " + itemId, Formatting.GREEN);
    }

    private void handleRemove(IArgConsumer args) throws CommandException {
        args.requireMin(1);
        String input = args.getString().toLowerCase(Locale.US);

        String itemId = resolveItemId(input);
        if (itemId == null) {
            logDirect("Предмет '" + input + "' не найден!", Formatting.RED);
            return;
        }

        if (!config.contains(itemId)) {
            logDirect("Предмет " + itemId + " не найден в списке!", Formatting.RED);
            return;
        }

        config.remove(itemId);
        logDirect("Удалён предмет: " + itemId, Formatting.GREEN);
    }

    private void handleList() {
        List<String> items = config.getItems();
        if (items.isEmpty()) {
            logDirect("Список autosell пуст", Formatting.GRAY);
            return;
        }

        logDirect("Список предметов autosell:", Formatting.GOLD);
        for (String item : items) {
            logDirect("  - " + item, Formatting.WHITE);
        }
    }

    private void handleClear() {
        config.clear();
        logDirect("Список autosell очищен", Formatting.GREEN);
    }

    private String resolveItemId(String input) {
        String fullId = input.contains(":") ? input : "minecraft:" + input;
        Identifier id = Identifier.tryParse(fullId);
        if (id == null) return null;
        Item item = Registries.ITEM.get(id);
        if (item == null || item == net.minecraft.item.Items.AIR) return null;
        return fullId;
    }

    @Override
    public Stream<String> tabComplete(String label, IArgConsumer args) throws CommandException {
        if (!args.hasAny()) {
            return new TabCompleteHelper()
                    .append("add", "remove", "list", "clear")
                    .sortAlphabetically()
                    .stream();
        }

        String first = args.getString().toLowerCase(Locale.US);

        if (!args.hasAny()) {
            return new TabCompleteHelper()
                    .append("add", "remove", "list", "clear")
                    .filterPrefix(first)
                    .sortAlphabetically()
                    .stream();
        }

        String second = args.getString().toLowerCase(Locale.US);

        if (first.equals("add")) {
            return Registries.ITEM.stream()
                    .filter(i -> i != Items.AIR)
                    .map(i -> Registries.ITEM.getId(i).getPath())
                    .filter(p -> p.startsWith(second))
                    .distinct()
                    .sorted()
                    .limit(80);
        }

        if (first.equals("remove")) {
            return config.getItems().stream()
                    .filter(id -> id.contains(second))
                    .sorted();
        }

        return Stream.empty();
    }

    @Override
    public String getShortDesc() {
        return "Управление списком автопродажи";
    }

    @Override
    public List<String> getLongDesc() {
        return Arrays.asList(
                ".autosell add <item> - добавить предмет в список автопродажи",
                ".autosell remove <item> - удалить предмет из списка автопродажи",
                ".autosell list - показать список предметов",
                ".autosell clear - очистить список"
        );
    }
}
