package fun.nexisdlc.commands.commands.defaults;

import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.utils.client.ILogger;
import fun.nexisdlc.client.utils.config.GPSStorage;
import fun.nexisdlc.commands.Command;
import fun.nexisdlc.commands.argument.IArgConsumer;
import fun.nexisdlc.commands.datatypes.GpsDataType;
import fun.nexisdlc.commands.exception.CommandException;
import fun.nexisdlc.commands.helpers.Paginator;
import fun.nexisdlc.commands.helpers.TabCompleteHelper;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

import static fun.nexisdlc.commands.IChatControl.FORCE_COMMAND_PREFIX;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class GpsCommand extends Command implements ILogger {
    final GPSStorage wayRepository;

    protected GpsCommand(Nexis Nexis) {
        super("gps");
        wayRepository = Nexis.getGpsStorage();
    }

    @Override
    public void execute(String label, IArgConsumer args) throws CommandException {
        String arg = args.hasAny() ? args.getString().toLowerCase(Locale.US) : "list";
        switch (arg) {
            case "add" -> handleAddWay(args);
            case "remove" -> handleRemoveWay(args);
            case "clear" -> handleClearWays(args);
            case "list" -> handleListWays(label, args);
        }
    }

    void handleAddWay(IArgConsumer args) throws CommandException {
        args.requireMin(3);
        String name = args.getString();
        int x = args.getArgs().get(0).getAs(Integer.class);
        int y = args.getArgs().get(1).getAs(Integer.class);
        int z = args.getArgs().get(2).getAs(Integer.class);

        if (wayRepository.exists(name)) {
            logDirect("Метка с таким именем уже есть в списке!", Formatting.RED);
            return;
        }

        logDirect("Добавлена метка " + name + ", Координаты:" + " (" + x + ", " + y + ", " + z + ")", Formatting.GRAY);
        wayRepository.add(name, x, y, z);
    }

    
    void handleRemoveWay(IArgConsumer args) throws CommandException {
        args.requireMax(1);
        String name = args.getString();
        if (wayRepository.exists(name)) {
            wayRepository.remove(name);
            logDirect(Formatting.GREEN + "Метка " + Formatting.RED + name + Formatting.GREEN + " была успешна удалена!");
        } else logDirect("Метка с названием '" + name + "' не найдена!");
    }
    
    void handleListWays(String label, IArgConsumer args) throws CommandException {
        args.requireMax(1);
        Paginator.paginate(args, new Paginator<>(wayRepository.getPoints()),
                () -> logDirect("Список меток:"),
                way -> Text.literal(Formatting.GRAY + "Название: " + Formatting.RED + way.getName())
                        .append(Text.literal(Formatting.GRAY + " Координаты: " + Formatting.WHITE + " (" + way.getX() + ", " + way.getY() + ", " + way.getZ() + ")")
                                ), FORCE_COMMAND_PREFIX + label);
    }
    
    void handleClearWays(IArgConsumer args) throws CommandException {
        args.requireMax(1);
        wayRepository.clear();
        logDirect(Formatting.GREEN + "Все метки были удалены.");
    }

    @Override
    public Stream<String> tabComplete(String label, IArgConsumer args) throws CommandException {
        if (args.hasAny()) {
            String arg = args.getString();
            if (arg.equalsIgnoreCase("remove")) {
                if (args.hasExactlyOne()) return args.tabCompleteDatatype(GpsDataType.INSTANCE);
            } else if (arg.equalsIgnoreCase("add")) {
                String string = args.has(5) ? "" : args.has(4) ? "z" : args.has(3) ? "y" : args.has(2) ? "x" : "Название";
                return new TabCompleteHelper().sortAlphabetically().prepend(string).stream();
            } else {
                return new TabCompleteHelper().sortAlphabetically().prepend("add", "remove", "list", "clear").filterPrefix(arg).stream();
            }
        }
        return Stream.empty();
    }


    @Override
    public String getShortDesc() {
        return "Позволяет ставить метки в мире";
    }

    
    @Override
    public List<String> getLongDesc() {
        return Arrays.asList(
                "С помощью этой команды можно добавлять/удалять метки в мире",
                "",
                "Использование:",
                "> way add <name> <x> <y> <z> - Добавляет метку",
                "> way remove <name> - Удаляет метку",
                "> way list - Возвращает список меток",
                "> way clear - Очищает список меток."
        );
    }
}