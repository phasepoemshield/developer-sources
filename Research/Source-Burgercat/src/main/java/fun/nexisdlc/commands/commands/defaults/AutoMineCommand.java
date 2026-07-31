package fun.nexisdlc.commands.commands.defaults;

import fun.nexisdlc.Nexis;
import fun.nexisdlc.commands.Command;
import fun.nexisdlc.commands.argument.IArgConsumer;
import fun.nexisdlc.commands.exception.CommandException;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.impl.player.AutoMine;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import net.minecraft.util.math.BlockPos;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class AutoMineCommand extends Command {
    Nexis nexis;

    public AutoMineCommand(Nexis nexis) {
        super("automine");
        this.nexis = nexis;
    }

    @Override
    public void execute(String label, IArgConsumer args) throws CommandException {
        AutoMine autoMine = nexis.getFunctionManager().getAutoMine();
        if (autoMine == null) return;

        if (!args.hasAny()) return;
        String action = args.getString().toLowerCase(Locale.US);
        if (action.equals("pos1")) {
            autoMine.setPos1(mc.player.getBlockPos());
            send("pos1 установлена");
        } else if (action.equals("pos2")) {
            autoMine.setPos2(mc.player.getBlockPos());
            send("pos2 установлена");
        }
    }

    private void send(String text) {
        Function.sendMessage(text);
    }

    @Override
    public Stream<String> tabComplete(String label, IArgConsumer args) throws CommandException {
        if (args.hasAny()) {
            String arg = args.getString();
            return Stream.of("pos1", "pos2").filter(s -> s.startsWith(arg.toLowerCase(Locale.US)));
        }
        return Stream.empty();
    }

    @Override
    public String getShortDesc() {
        return "Настройка области AutoMine";
    }

    @Override
    public List<String> getLongDesc() {
        return Arrays.asList(
                ".automine pos1 - ставит первую точку по текущей позиции",
                ".automine pos2 - ставит вторую точку по текущей позиции"
        );
    }
}
