package fun.nexisdlc.commands.commands.defaults;

import fun.nexisdlc.commands.Command;
import fun.nexisdlc.commands.argument.IArgConsumer;
import fun.nexisdlc.commands.exception.CommandException;
import fun.nexisdlc.modules.impl.utils.ProxyServer;
import net.minecraft.util.Formatting;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;
public class UnHookCommand extends Command {
    public UnHookCommand() {
        super("unhook");
    }
    @Override
    public void execute(String label, IArgConsumer args) throws CommandException {
        String action = args.hasAny() ? args.getString().toLowerCase(Locale.ROOT) : "status";
        switch (action) {
            case "switch" -> {
                args.requireMax(0);
                logDirect(ProxyServer.switchControlTarget());
            }
            case "status" -> {
                args.requireMax(0);
                ProxyServer.getDebugStatusLines().forEach(this::logDirect);
            }
            case "target" -> {
                if (!args.hasAny()) {
                    logDirect(ProxyServer.setTargetServer(""));
                    return;
                }
                String target = args.getString();
                args.requireMax(0);
                logDirect(ProxyServer.setTargetServer(target));
            }
            case "stop" -> {
                args.requireMax(0);
                logDirect(ProxyServer.stopProxy());
            }
            default -> printUsage();
        }
    }
    @Override
    public Stream<String> tabComplete(String label, IArgConsumer args) throws CommandException {
        if (args.hasExactlyOne()) {
            String prefix = args.peekString(0).toLowerCase(Locale.ROOT);
            return Stream.of("status", "switch", "target", "stop")
                    .filter(s -> s.startsWith(prefix))
                    .sorted();
        }
        if (args.hasExactly(2) && "target".equalsIgnoreCase(args.peekString(0))) {
            String prefix = args.peekString(1).toLowerCase(Locale.ROOT);
            return Stream.of("last")
                    .filter(s -> s.startsWith(prefix))
                    .sorted();
        }
        return Stream.empty();
    }
    @Override
    public String getShortDesc() {
        return "Управление режимом UnHook.";
    }
    @Override
    public List<String> getLongDesc() {
        return Arrays.asList(
                "Прокси работает в отдельном процессе, переживает закрытие клиента.",
                "",
                "> unhook status              — статус прокси-процесса",
                "> unhook switch              — переключить управление между клиентами",
                "> unhook target <host:port>  — задать цель",
                "> unhook stop                — остановить прокси + сервер"
        );
    }
    private void printUsage() {
        logDirect(Formatting.WHITE + "unhook status / switch / target <addr> / stop");
    }
}
