package fun.nexisdlc.commands.datatypes;

import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.utils.config.FriendStorage;
import fun.nexisdlc.commands.exception.CommandException;
import fun.nexisdlc.commands.helpers.TabCompleteHelper;

import java.util.List;
import java.util.stream.Stream;

public enum FriendDataType implements IDatatypeFor<FriendStorage.Friend> {
    INSTANCE;

    @Override
    public Stream<String> tabComplete(IDatatypeContext datatypeContext) throws CommandException {
        Stream<String> ways = getStaff().stream().map(FriendStorage.Friend::getName);
        String context = datatypeContext.getConsumer().getString();
        return new TabCompleteHelper().append(ways).filterPrefix(context).sortAlphabetically().stream();
    }

    @Override
    public FriendStorage.Friend get(IDatatypeContext datatypeContext) throws CommandException {
        String text = datatypeContext.getConsumer().getString();
        return getStaff().stream().filter(s -> s.getName().equalsIgnoreCase(text)).findFirst().orElse(null);
    }

    private List<? extends FriendStorage.Friend> getStaff() {
        return Nexis.getInstance().getFriendStorage().getFriends();
    }
}