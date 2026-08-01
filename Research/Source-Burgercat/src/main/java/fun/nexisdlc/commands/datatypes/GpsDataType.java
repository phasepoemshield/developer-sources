package fun.nexisdlc.commands.datatypes;

import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.utils.config.GPSStorage;
import fun.nexisdlc.commands.exception.CommandException;
import fun.nexisdlc.commands.helpers.TabCompleteHelper;

import java.util.List;
import java.util.stream.Stream;

public enum GpsDataType implements IDatatypeFor<GPSStorage.GPSPoint> {
    INSTANCE;

    @Override
    public Stream<String> tabComplete(IDatatypeContext datatypeContext) throws CommandException {
        Stream<String> ways = getWay().stream().map(GPSStorage.GPSPoint::getName);
        String context = datatypeContext.getConsumer().getString();
        return new TabCompleteHelper().append(ways).filterPrefix(context).sortAlphabetically().stream();
    }

    @Override
    public GPSStorage.GPSPoint get(IDatatypeContext datatypeContext) throws CommandException {
        String text = datatypeContext.getConsumer().getString();
        return getWay().stream().filter(s -> s.getName().equalsIgnoreCase(text)).findFirst().orElse(null);
    }

    private List<? extends GPSStorage.GPSPoint> getWay() {
        return Nexis.getInstance().getGpsStorage().getPoints();
    }
}
