package fun.nexisdlc.commands.datatypes;

import fun.nexisdlc.ClientContainer;
import fun.nexisdlc.client.utils.config.StaffStorage;
import fun.nexisdlc.commands.exception.CommandException;
import fun.nexisdlc.commands.helpers.TabCompleteHelper;

import java.util.List;
import java.util.stream.Stream;

public enum StaffDataType implements IDatatypeFor<StaffStorage.Staff> {
    INSTANCE;

    @Override
    public Stream<String> tabComplete(IDatatypeContext datatypeContext) throws CommandException {
        Stream<String> ways = getStaff().stream().map(StaffStorage.Staff::getName);
        String context = datatypeContext.getConsumer().getString();
        return new TabCompleteHelper().append(ways).filterPrefix(context).sortAlphabetically().stream();
    }

    @Override
    public StaffStorage.Staff get(IDatatypeContext datatypeContext) throws CommandException {
        String text = datatypeContext.getConsumer().getString();
        return getStaff().stream().filter(s -> s.getName().equalsIgnoreCase(text)).findFirst().orElse(null);
    }

    private List<? extends StaffStorage.Staff> getStaff() {
        return ClientContainer.getNexisInstance().getStaffStorage().getStaffs();
    }
}
