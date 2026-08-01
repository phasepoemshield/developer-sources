package fun.nexisdlc.commands.commands.defaults;

import fun.nexisdlc.Nexis;
import fun.nexisdlc.commands.Command;
import fun.nexisdlc.commands.ICommand;
import fun.nexisdlc.commands.argument.IArgConsumer;
import fun.nexisdlc.commands.commands.manager.CommandRepository;
import fun.nexisdlc.commands.exception.CommandException;
import fun.nexisdlc.commands.exception.CommandNotFoundException;
import fun.nexisdlc.commands.helpers.TabCompleteHelper;
import net.minecraft.text.ClickEvent;
import net.minecraft.text.HoverEvent;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static fun.nexisdlc.commands.IChatControl.FORCE_COMMAND_PREFIX;

public class HelpCommand extends Command {
    private final Nexis nexis;

    protected HelpCommand(Nexis nexis) {
        super("help");
        this.nexis = nexis;
    }

    @Override
    public void execute(String label, IArgConsumer args) throws CommandException {
        args.requireMax(1);

        CommandRepository commandRepository = nexis.getCommandRepository();

        if (!args.hasAny() || args.is(Integer.class)) {
            logDirect("Доступные команды в чите:", Formatting.AQUA);

            commandRepository.getRegistry().descendingStream()
                    .filter(command -> !command.hiddenFromHelp())
                    .forEach(command -> {
                        String names = String.join("/", command.getNames());
                        String name = command.getNames().get(0);

                        MutableText namesComponent = Text.literal(names)
                                .styled(style -> style.withColor(Formatting.WHITE));

                        MutableText shortDescComponent = Text.literal(" - " + command.getShortDesc())
                                .styled(style -> style.withColor(Formatting.DARK_GRAY));

                        MutableText hoverComponent = Text.literal("")
                                .append(namesComponent)
                                .append(Text.literal("\n" + command.getShortDesc()))
                                .styled(style -> style.withColor(Formatting.GRAY));

                        MutableText clickableName = Text.literal(name)
                                .styled(style -> style
                                        .withColor(Formatting.GRAY)
                                        .withClickEvent(new ClickEvent.RunCommand(FORCE_COMMAND_PREFIX + "help " + name))
                                        .withHoverEvent(new HoverEvent.ShowText(Text.literal("Нажмите, чтобы посмотреть подробную справку"))));

                        MutableText line = clickableName.copy().append(shortDescComponent);

                        line.styled(style -> style.withHoverEvent(new HoverEvent.ShowText(hoverComponent)));

                        logDirect(line);
                    });

        } else {
            String commandName = args.getString().toLowerCase();
            ICommand command = commandRepository.getCommand(commandName);
            if (command == null) {
                throw new CommandNotFoundException(commandName);
            }

            logDirect("");
            command.getLongDesc().forEach(this::logDirect);
            logDirect("");

            MutableText returnComponent = Text.literal("Нажмите, чтобы вернуться к списку команд")
                    .styled(style -> style
                            .withColor(Formatting.AQUA)
                            .withClickEvent(new ClickEvent.RunCommand(FORCE_COMMAND_PREFIX + "help"))
                            .withHoverEvent(new HoverEvent.ShowText(Text.literal("Вернуться к общему списку"))));

            logDirect(returnComponent);
        }
    }

    @Override
    public Stream<String> tabComplete(String label, IArgConsumer args) throws CommandException {
        if (args.hasExactlyOne()) {
            return new TabCompleteHelper()
                    .addCommands(nexis.getInstance().getCommandRepository())
                    .filterPrefix(args.getString())
                    .stream();
        }
        return Stream.empty();
    }

    @Override
    public String getShortDesc() {
        return "Просмотр всех доступных команд";
    }

    @Override
    public List<String> getLongDesc() {
        return Arrays.asList(
                "С помощью этой команды можно просмотреть подробную справочную информацию о том, как использовать определенные команды",
                "",
                "Использование:",
                "> help - Перечисляет все команды и их краткие описания.",
                "> help <command> - Отображение справочной информации по конкретной команде."
        );
    }
}