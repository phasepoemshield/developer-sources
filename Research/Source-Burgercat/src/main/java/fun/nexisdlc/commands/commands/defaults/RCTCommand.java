package fun.nexisdlc.commands.commands.defaults;

import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.utils.client.ILogger;
import fun.nexisdlc.commands.Command;
import fun.nexisdlc.commands.argument.IArgConsumer;
import fun.nexisdlc.commands.exception.CommandException;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class RCTCommand extends Command implements ILogger {
    // private final RCTRepository repository;

    protected RCTCommand(Nexis Nexis) {
        super("rct");
     //   repository = Nexis.getRCTRepository();
    }
    
    @Override
    public void execute(String label, IArgConsumer args) throws CommandException {
        /*
        if (!ServerUtil.isHolyWorld()) {
            Notifications.warn("[RCT] Не работает на этом сервере ", "  сервере", 3000);
            return;
        }

        if (ServerUtil.isPvp()) {
            Notifications.warn("[RCT] Вы находитесь в режиме пвп  ", " пвп", 3000);
            return;
        }

        if (args.hasAny()) {
            args.requireMin(1);
            int anarchy = args.getArgs().getFirst().getAs(Integer.class);
            repository.reconnect(anarchy);
        } else repository.reconnect(ServerUtil.getAnarchy());

         */
    }

    @Override
    public Stream<String> tabComplete(String label, IArgConsumer args) throws CommandException {
        return Stream.empty();
    }


    @Override
    public String getShortDesc() {
        return "Перезаходит на анархию";
    }


    @Override
    public List<String> getLongDesc() {
        return Arrays.asList(
                "Перезаходит на анархию",
                "",
                "Использование:",
                "> rct <anarchy> - Заходит на <anarchy>",
                "> rct - Перезаходит на анархию где вы только что были"
        );
    }
}