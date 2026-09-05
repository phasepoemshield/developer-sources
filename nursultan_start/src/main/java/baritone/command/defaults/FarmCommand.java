/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.IBaritone
 *  baritone.api.cache.IWaypoint
 *  baritone.api.command.Command
 *  baritone.api.command.argument.IArgConsumer
 *  baritone.api.command.datatypes.ForWaypoints
 *  baritone.api.command.datatypes.IDatatypeFor
 *  baritone.api.command.exception.CommandException
 *  baritone.api.command.exception.CommandInvalidStateException
 *  baritone.api.utils.BetterBlockPos
 */
package baritone.command.defaults;

import baritone.api.IBaritone;
import baritone.api.cache.IWaypoint;
import baritone.api.command.Command;
import baritone.api.command.argument.IArgConsumer;
import baritone.api.command.datatypes.ForWaypoints;
import baritone.api.command.datatypes.IDatatypeFor;
import baritone.api.command.exception.CommandException;
import baritone.api.command.exception.CommandInvalidStateException;
import baritone.api.utils.BetterBlockPos;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FarmCommand
extends Command {
    public FarmCommand(IBaritone iBaritone) {
        super(iBaritone, new String[]{"farm"});
    }

    public void execute(String string, IArgConsumer iArgConsumer) throws CommandException {
        iArgConsumer.requireMax(2);
        int n = 0;
        BetterBlockPos betterBlockPos = null;
        if (iArgConsumer.has(1)) {
            n = (Integer)iArgConsumer.getAs(Integer.class);
        }
        if (iArgConsumer.has(1)) {
            IWaypoint[] iWaypointArray = (IWaypoint[])iArgConsumer.getDatatypeFor((IDatatypeFor)ForWaypoints.INSTANCE);
            IWaypoint iWaypoint = null;
            switch (iWaypointArray.length) {
                case 0: {
                    throw new CommandInvalidStateException("No waypoints found");
                }
                case 1: {
                    iWaypoint = iWaypointArray[0];
                    break;
                }
                default: {
                    throw new CommandInvalidStateException("Multiple waypoints were found");
                }
            }
            betterBlockPos = iWaypoint.getLocation();
        }
        this.baritone.getFarmProcess().farm(n, betterBlockPos);
        this.logDirect("Farming");
    }

    public String getShortDesc() {
        return "Farm nearby crops";
    }

    public List<String> getLongDesc() {
        return Arrays.asList("The farm command starts farming nearby plants. It harvests mature crops and plants new ones.", "", "Usage:", "> farm - farms every crop it can find.", "> farm <range> - farm crops within range from the starting position.", "> farm <range> <waypoint> - farm crops within range from waypoint.");
    }

    public Stream<String> tabComplete(String string, IArgConsumer iArgConsumer) {
        return Stream.empty();
    }
}

