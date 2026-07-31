package fun.nexisdlc.commands.datatypes;

import fun.nexisdlc.client.utils.client.IMinecraft;
import fun.nexisdlc.commands.exception.CommandException;
import fun.nexisdlc.commands.helpers.TabCompleteHelper;

import java.util.stream.Stream;

public enum TabPlayerDataType implements IDatatypeFor<String>, IMinecraft {
    INSTANCE;

    @Override
    public Stream<String> tabComplete(IDatatypeContext ctx) throws CommandException {
        if (mc.getNetworkHandler() == null) {
            return Stream.empty();
        }
        return new TabCompleteHelper()
                .append(mc.getNetworkHandler().getPlayerList().stream()
                        .map(entry -> entry.getProfile() != null ? entry.getProfile().name() : "")
                        .filter(s -> !s.isEmpty()))
                .filterPrefix(ctx.getConsumer().getString())
                .sortAlphabetically()
                .stream();
    }

    @Override
    public String get(IDatatypeContext datatypeContext) throws CommandException {
        return datatypeContext.getConsumer().getString();
    }
}
