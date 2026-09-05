/*
 * Decompiled with CFR 0.152.
 */
package baritone.api.command.datatypes;

import baritone.api.IBaritone;
import baritone.api.cache.IWaypoint;
import baritone.api.cache.IWaypoint$Tag;
import baritone.api.cache.IWaypointCollection;
import baritone.api.command.datatypes.IDatatypeContext;
import baritone.api.command.datatypes.IDatatypeFor;
import baritone.api.command.exception.CommandException;
import baritone.api.command.helpers.TabCompleteHelper;
import java.util.Comparator;
import java.util.stream.Stream;

public enum ForWaypoints implements IDatatypeFor<IWaypoint[]>
{
    INSTANCE;


    @Override
    public IWaypoint[] get(IDatatypeContext iDatatypeContext) throws CommandException {
        String string = iDatatypeContext.getConsumer().getString();
        IWaypoint$Tag iWaypoint$Tag = IWaypoint$Tag.getByName(string);
        return iWaypoint$Tag == null ? ForWaypoints.getWaypointsByName(iDatatypeContext.getBaritone(), string) : ForWaypoints.getWaypointsByTag(iDatatypeContext.getBaritone(), iWaypoint$Tag);
    }

    public static IWaypointCollection waypoints(IBaritone iBaritone) {
        return iBaritone.getWorldProvider().getCurrentWorld().getWaypoints();
    }

    public static IWaypoint[] getWaypoints(IBaritone iBaritone) {
        return (IWaypoint[])ForWaypoints.waypoints(iBaritone).getAllWaypoints().stream().sorted(Comparator.comparingLong(IWaypoint::getCreationTimestamp).reversed()).toArray(IWaypoint[]::new);
    }

    public static IWaypoint[] getWaypointsByTag(IBaritone iBaritone, IWaypoint$Tag iWaypoint$Tag) {
        return (IWaypoint[])ForWaypoints.waypoints(iBaritone).getByTag(iWaypoint$Tag).stream().sorted(Comparator.comparingLong(IWaypoint::getCreationTimestamp).reversed()).toArray(IWaypoint[]::new);
    }

    public static IWaypoint[] getWaypointsByName(IBaritone iBaritone, String string) {
        return (IWaypoint[])Stream.of(ForWaypoints.getWaypoints(iBaritone)).filter(iWaypoint -> iWaypoint.getName().equalsIgnoreCase(string)).toArray(IWaypoint[]::new);
    }

    public static String[] getWaypointNames(IBaritone iBaritone) {
        return (String[])Stream.of(ForWaypoints.getWaypoints(iBaritone)).map(IWaypoint::getName).filter(string -> !string.isEmpty()).toArray(String[]::new);
    }

    @Override
    public Stream<String> tabComplete(IDatatypeContext iDatatypeContext) throws CommandException {
        return new TabCompleteHelper().append(ForWaypoints.getWaypointNames(iDatatypeContext.getBaritone())).sortAlphabetically().prepend(IWaypoint$Tag.getAllNames()).filterPrefix(iDatatypeContext.getConsumer().getString()).stream();
    }
}

