/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.IBaritone
 *  baritone.api.cache.IWaypoint
 *  baritone.api.cache.IWaypoint$Tag
 *  baritone.api.cache.IWaypointCollection
 *  baritone.api.cache.IWorldData
 *  baritone.api.cache.Waypoint
 *  baritone.api.command.Command
 *  baritone.api.command.IBaritoneChatControl
 *  baritone.api.command.argument.IArgConsumer
 *  baritone.api.command.datatypes.ForWaypoints
 *  baritone.api.command.datatypes.IDatatype
 *  baritone.api.command.datatypes.IDatatypeFor
 *  baritone.api.command.datatypes.IDatatypePost
 *  baritone.api.command.datatypes.RelativeBlockPos
 *  baritone.api.command.exception.CommandException
 *  baritone.api.command.exception.CommandInvalidStateException
 *  baritone.api.command.exception.CommandInvalidTypeException
 *  baritone.api.command.helpers.Paginator
 *  baritone.api.command.helpers.TabCompleteHelper
 *  baritone.api.pathing.goals.Goal
 *  baritone.api.pathing.goals.GoalBlock
 *  baritone.api.utils.BetterBlockPos
 *  minecraft.class00392
 *  minecraft.class00395
 *  minecraft.class00401
 *  minecraft.class00625
 *  minecraft.class00640
 *  minecraft.class00647
 *  minecraft.class05216
 *  minecraft.class06541
 *  minecraft.class07209
 */
package baritone.command.defaults;

import baritone.Baritone;
import baritone.api.IBaritone;
import baritone.api.cache.IWaypoint;
import baritone.api.cache.IWaypointCollection;
import baritone.api.cache.IWorldData;
import baritone.api.cache.Waypoint;
import baritone.api.command.Command;
import baritone.api.command.IBaritoneChatControl;
import baritone.api.command.argument.IArgConsumer;
import baritone.api.command.datatypes.ForWaypoints;
import baritone.api.command.datatypes.IDatatype;
import baritone.api.command.datatypes.IDatatypeFor;
import baritone.api.command.datatypes.IDatatypePost;
import baritone.api.command.datatypes.RelativeBlockPos;
import baritone.api.command.exception.CommandException;
import baritone.api.command.exception.CommandInvalidStateException;
import baritone.api.command.exception.CommandInvalidTypeException;
import baritone.api.command.helpers.Paginator;
import baritone.api.command.helpers.TabCompleteHelper;
import baritone.api.pathing.goals.Goal;
import baritone.api.pathing.goals.GoalBlock;
import baritone.api.utils.BetterBlockPos;
import baritone.command.defaults.WaypointsCommand$Action;
import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import minecraft.class00392;
import minecraft.class00395;
import minecraft.class00401;
import minecraft.class00625;
import minecraft.class00640;
import minecraft.class00647;
import minecraft.class05216;
import minecraft.class06541;
import minecraft.class07209;

public class WaypointsCommand
extends Command {
    private Map<IWorldData, List<IWaypoint>> deletedWaypoints = new HashMap<IWorldData, List<IWaypoint>>();

    public WaypointsCommand(IBaritone iBaritone) {
        super(iBaritone, new String[]{"waypoints", "waypoint", "wp"});
    }

    /*
     * Unable to fully structure code
     */
    public void execute(String var1_1, IArgConsumer var2_2) throws CommandException {
        v0 = var3_3 = var2_2.hasAny() != false ? WaypointsCommand$Action.getByName(var2_2.getString()) : WaypointsCommand$Action.LIST;
        if (var3_3 == null) {
            throw new CommandInvalidTypeException(var2_2.consumed(), "an action");
        }
        var4_4 = (BiFunction<IWaypoint, WaypointsCommand$Action, class00392>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;, lambda$execute$0(java.lang.String baritone.api.cache.IWaypoint baritone.command.defaults.WaypointsCommand$Action ), (Lbaritone/api/cache/IWaypoint;Lbaritone/command/defaults/WaypointsCommand$Action;)Lminecraft/class00392;)((String)var1_1);
        var5_5 = (Function<IWaypoint, class00392>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$execute$1(java.util.function.BiFunction baritone.command.defaults.WaypointsCommand$Action baritone.api.cache.IWaypoint ), (Lbaritone/api/cache/IWaypoint;)Lminecraft/class00392;)(var4_4, (WaypointsCommand$Action)var3_3);
        if (var3_3 != WaypointsCommand$Action.LIST) ** GOTO lbl18
        v1 = var6_6 = var2_2.hasAny() != false ? IWaypoint.Tag.getByName((String)var2_2.peekString()) : null;
        if (var6_6 != null) {
            var2_2.get();
        }
        v2 = var7_11 = var6_6 != null ? ForWaypoints.getWaypointsByTag((IBaritone)this.baritone, (IWaypoint.Tag)var6_6) : ForWaypoints.getWaypoints((IBaritone)this.baritone);
        if (var7_11.length > 0) {
            var2_2.requireMax(1);
            Paginator.paginate((IArgConsumer)var2_2, (Object[])var7_11, (Runnable)(Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$execute$2(baritone.api.cache.IWaypoint$Tag ), ()V)((WaypointsCommand)this, (IWaypoint.Tag)var6_6), var5_5, (String)String.format("%s%s %s%s", new Object[]{IBaritoneChatControl.FORCE_COMMAND_PREFIX, var1_1, var3_3.names[0], var6_6 != null ? " " + var6_6.getName() : ""}));
        } else {
            var2_2.requireMax(0);
            throw new CommandInvalidStateException(var6_6 != null ? "No waypoints found by that tag" : "No waypoints found");
lbl18:
            // 1 sources

            if (var3_3 == WaypointsCommand$Action.SAVE) {
                v3 = var6_7 = var2_2.hasAny() != false ? IWaypoint.Tag.getByName((String)var2_2.peekString()) : null;
                if (var6_7 == null) {
                    var6_7 = IWaypoint.Tag.USER;
                } else {
                    var2_2.get();
                }
                var7_12 = var2_2.hasExactlyOne() != false || var2_2.hasExactly(4) != false ? var2_2.getString() : "";
                var8_16 = var2_2.hasAny() != false ? (BetterBlockPos)var2_2.getDatatypePost((IDatatypePost)RelativeBlockPos.INSTANCE, (Object)this.ctx.playerFeet()) : this.ctx.playerFeet();
                var2_2.requireMax(0);
                var9_25 = new Waypoint(var7_12, var6_7, var8_16);
                ForWaypoints.waypoints((IBaritone)this.baritone).addWaypoint((IWaypoint)var9_25);
                var10_29 = class00392.y((String)"Waypoint added: ");
                var10_29.y(var10_29.method_10866().N(class06541.field_1080));
                var10_29.y(var4_4.apply((IWaypoint)var9_25, WaypointsCommand$Action.INFO));
                this.logDirect(new class00392[]{var10_29});
            } else if (var3_3 == WaypointsCommand$Action.CLEAR) {
                var2_2.requireMax(1);
                var6_8 = var2_2.getString();
                var7_13 = IWaypoint.Tag.getByName((String)var6_8);
                if (var7_13 == null) {
                    throw new CommandInvalidStateException("Invalid tag, \"" + var6_8 + "\"");
                }
                for (IWaypoint var12_37 : var8_17 = ForWaypoints.getWaypointsByTag((IBaritone)this.baritone, (IWaypoint.Tag)var7_13)) {
                    ForWaypoints.waypoints((IBaritone)this.baritone).removeWaypoint(var12_37);
                }
                this.deletedWaypoints.computeIfAbsent(this.baritone.getWorldProvider().getCurrentWorld(), (Function<IWorldData, List>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$execute$3(baritone.api.cache.IWorldData ), (Lbaritone/api/cache/IWorldData;)Ljava/util/List;)()).addAll(Arrays.asList(var8_17));
                var9_26 = class00392.y((String)String.format("Cleared %d waypoints, click to restore them", new Object[]{((IWaypoint[])var8_17).length}));
                var9_26.y(var9_26.method_10866().N((class00647)new class00625(String.format("%s%s restore @ %s", new Object[]{IBaritoneChatControl.FORCE_COMMAND_PREFIX, var1_1, Stream.of(var8_17).map((Function<IWaypoint, String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$execute$4(baritone.api.cache.IWaypoint ), (Lbaritone/api/cache/IWaypoint;)Ljava/lang/String;)()).collect(Collectors.joining(" "))}))));
                this.logDirect(new class00392[]{var9_26});
            } else if (var3_3 == WaypointsCommand$Action.RESTORE) {
                var6_9 = new ArrayList<E>();
                var7_14 = this.deletedWaypoints.getOrDefault(this.baritone.getWorldProvider().getCurrentWorld(), Collections.emptyList());
                if (var2_2.peekString().equals("@")) {
                    var2_2.get();
                    block5: while (var2_2.hasAny()) {
                        var8_18 = (Long)var2_2.getAs(Long.class);
                        for (IWaypoint var11_34 : var7_14) {
                            if (var11_34.getCreationTimestamp() != var8_18) continue;
                            var6_9.add(var11_34);
                            continue block5;
                        }
                    }
                } else {
                    var2_2.requireExactly(1);
                    var8_19 = var7_14.size();
                    var9_27 = Math.min(var8_19, (Integer)var2_2.getAs(Integer.class));
                    var6_9 = new ArrayList<T>(var7_14.subList(var8_19 - var9_27, var8_19));
                }
                var6_9.forEach((Consumer<IWaypoint>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, addWaypoint(baritone.api.cache.IWaypoint ), (Lbaritone/api/cache/IWaypoint;)V)((IWaypointCollection)ForWaypoints.waypoints((IBaritone)this.baritone)));
                var7_14.removeIf((Predicate<IWaypoint>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, contains(java.lang.Object ), (Lbaritone/api/cache/IWaypoint;)Z)(var6_9));
                this.logDirect(String.format("Restored %d waypoints", new Object[]{var6_9.size()}));
            } else {
                var6_10 = (IWaypoint[])var2_2.getDatatypeFor((IDatatypeFor)ForWaypoints.INSTANCE);
                var7_15 = null;
                if (var2_2.hasAny() && var2_2.peekString().equals("@")) {
                    var2_2.requireExactly(2);
                    var2_2.get();
                    var8_20 = (Long)var2_2.getAs(Long.class);
                    for (IWaypoint var13_39 : var6_10) {
                        if (var13_39.getCreationTimestamp() != var8_20) continue;
                        var7_15 = var13_39;
                        break;
                    }
                    if (var7_15 == null) {
                        throw new CommandInvalidStateException("Timestamp was specified but no waypoint was found");
                    }
                } else {
                    switch (((IWaypoint[])var6_10).length) {
                        case 0: {
                            throw new CommandInvalidStateException("No waypoints found");
                        }
                        case 1: {
                            var7_15 = var6_10[0];
                            break;
                        }
                    }
                }
                if (var7_15 == null) {
                    var2_2.requireMax(1);
                    Paginator.paginate((IArgConsumer)var2_2, (Object[])var6_10, (Runnable)(Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$execute$5(), ()V)((WaypointsCommand)this), var5_5, (String)String.format("%s%s %s %s", new Object[]{IBaritoneChatControl.FORCE_COMMAND_PREFIX, var1_1, var3_3.names[0], var2_2.consumedString()}));
                } else if (var3_3 == WaypointsCommand$Action.INFO) {
                    this.logDirect(new class00392[]{var5_5.apply(var7_15)});
                    this.logDirect(String.format("Position: %s", new Object[]{var7_15.getLocation()}));
                    var8_21 = class00392.y((String)"Click to delete this waypoint");
                    var8_21.y(var8_21.method_10866().N((class00647)new class00625(String.format("%s%s delete %s @ %d", new Object[]{IBaritoneChatControl.FORCE_COMMAND_PREFIX, var1_1, var7_15.getTag().getName(), var7_15.getCreationTimestamp()}))));
                    var9_28 = class00392.y((String)"Click to set goal to this waypoint");
                    var9_28.y(var9_28.method_10866().N((class00647)new class00625(String.format("%s%s goal %s @ %d", new Object[]{IBaritoneChatControl.FORCE_COMMAND_PREFIX, var1_1, var7_15.getTag().getName(), var7_15.getCreationTimestamp()}))));
                    var10_32 = class00392.y((String)"Click to show a command to recreate this waypoint");
                    var10_32.y(var10_32.method_10866().N((class00647)new class00640(String.format("%s%s save %s %s %s %s %s", new Object[]{Baritone.settings().prefix.value, var1_1, var7_15.getTag().getName(), var7_15.getName(), var7_15.getLocation().x, var7_15.getLocation().y, var7_15.getLocation().z}))));
                    var11_36 = class00392.y((String)"Click to return to the waypoints list");
                    var11_36.y(var11_36.method_10866().N((class00647)new class00625(String.format("%s%s list", new Object[]{IBaritoneChatControl.FORCE_COMMAND_PREFIX, var1_1}))));
                    this.logDirect(new class00392[]{var8_21});
                    this.logDirect(new class00392[]{var9_28});
                    this.logDirect(new class00392[]{var10_32});
                    this.logDirect(new class00392[]{var11_36});
                } else if (var3_3 == WaypointsCommand$Action.DELETE) {
                    ForWaypoints.waypoints((IBaritone)this.baritone).removeWaypoint(var7_15);
                    this.deletedWaypoints.computeIfAbsent(this.baritone.getWorldProvider().getCurrentWorld(), (Function<IWorldData, List>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$execute$6(baritone.api.cache.IWorldData ), (Lbaritone/api/cache/IWorldData;)Ljava/util/List;)()).add(var7_15);
                    var8_22 = class00392.y((String)"That waypoint has successfully been deleted, click to restore it");
                    var8_22.y(var8_22.method_10866().N((class00647)new class00625(String.format("%s%s restore @ %s", new Object[]{IBaritoneChatControl.FORCE_COMMAND_PREFIX, var1_1, var7_15.getCreationTimestamp()}))));
                    this.logDirect(new class00392[]{var8_22});
                } else if (var3_3 == WaypointsCommand$Action.GOAL) {
                    var8_23 = new GoalBlock((class07209)var7_15.getLocation());
                    this.baritone.getCustomGoalProcess().setGoal((Goal)var8_23);
                    this.logDirect(String.format("Goal: %s", new Object[]{var8_23}));
                } else if (var3_3 == WaypointsCommand$Action.GOTO) {
                    var8_24 = new GoalBlock((class07209)var7_15.getLocation());
                    this.baritone.getCustomGoalProcess().setGoalAndPath((Goal)var8_24);
                    this.logDirect(String.format("Going to: %s", new Object[]{var8_24}));
                }
            }
        }
    }

    private static /* synthetic */ class00392 lambda$execute$0(String string, IWaypoint iWaypoint, WaypointsCommand$Action waypointsCommand$Action) {
        class05216 class052162 = class00392.y((String)"");
        class05216 class052163 = class00392.y((String)(iWaypoint.getTag().name() + " "));
        class052163.y(class052163.method_10866().N(class06541.field_1080));
        String string2 = iWaypoint.getName();
        class05216 class052164 = class00392.y((String)(!string2.isEmpty() ? string2 : "<empty>"));
        class052164.y(class052164.method_10866().N(!string2.isEmpty() ? class06541.field_1080 : class06541.field_1063));
        class05216 class052165 = class00392.y((String)(" @ " + String.valueOf(new Date(iWaypoint.getCreationTimestamp()))));
        class052165.y(class052165.method_10866().N(class06541.field_1063));
        class052162.y((class00392)class052163);
        class052162.y((class00392)class052164);
        class052162.y((class00392)class052165);
        class052162.y(class052162.method_10866().N((class00395)new class00401((class00392)class00392.y((String)"Click to select"))).N((class00647)new class00625(String.format("%s%s %s %s @ %d", IBaritoneChatControl.FORCE_COMMAND_PREFIX, string, waypointsCommand$Action.names[0], iWaypoint.getTag().getName(), iWaypoint.getCreationTimestamp()))));
        return class052162;
    }

    public String getShortDesc() {
        return "Manage waypoints";
    }

    public List<String> getLongDesc() {
        return Arrays.asList("The waypoint command allows you to manage Baritone's waypoints.", "", "Waypoints can be used to mark positions for later. Waypoints are each given a tag and an optional name.", "", "Note that the info, delete, and goal commands let you specify a waypoint by tag. If there is more than one waypoint with a certain tag, then they will let you select which waypoint you mean.", "", "Missing arguments for the save command use the USER tag, creating an unnamed waypoint and your current position as defaults.", "", "Usage:", "> wp [l/list] - List all waypoints.", "> wp <l/list> <tag> - List all waypoints by tag.", "> wp <s/save> - Save an unnamed USER waypoint at your current position", "> wp <s/save> [tag] [name] [pos] - Save a waypoint with the specified tag, name and position.", "> wp <i/info/show> <tag/name> - Show info on a waypoint by tag or name.", "> wp <d/delete> <tag/name> - Delete a waypoint by tag or name.", "> wp <restore> <n> - Restore the last n deleted waypoints.", "> wp <c/clear> <tag> - Delete all waypoints with the specified tag.", "> wp <g/goal> <tag/name> - Set a goal to a waypoint by tag or name.", "> wp <goto> <tag/name> - Set a goal to a waypoint by tag or name and start pathing.");
    }

    private static /* synthetic */ class00392 lambda$execute$1(BiFunction biFunction, WaypointsCommand$Action waypointsCommand$Action, IWaypoint iWaypoint) {
        return (class00392)biFunction.apply(iWaypoint, waypointsCommand$Action == WaypointsCommand$Action.LIST ? WaypointsCommand$Action.INFO : waypointsCommand$Action);
    }

    private /* synthetic */ void lambda$execute$2(IWaypoint.Tag tag) {
        this.logDirect(tag != null ? String.format("All waypoints by tag %s:", tag.name()) : "All waypoints:");
    }

    private /* synthetic */ void lambda$execute$5() {
        this.logDirect("Multiple waypoints were found:");
    }

    private static /* synthetic */ String lambda$execute$4(IWaypoint iWaypoint) {
        return Long.toString(iWaypoint.getCreationTimestamp());
    }

    private static /* synthetic */ List lambda$execute$3(IWorldData iWorldData) {
        return new ArrayList();
    }

    private static /* synthetic */ List lambda$execute$6(IWorldData iWorldData) {
        return new ArrayList();
    }

    public Stream<String> tabComplete(String string, IArgConsumer iArgConsumer) throws CommandException {
        if (iArgConsumer.hasAny()) {
            if (iArgConsumer.hasExactlyOne()) {
                return new TabCompleteHelper().append(WaypointsCommand$Action.getAllNames()).sortAlphabetically().filterPrefix(iArgConsumer.getString()).stream();
            }
            WaypointsCommand$Action waypointsCommand$Action = WaypointsCommand$Action.getByName(iArgConsumer.getString());
            if (iArgConsumer.hasExactlyOne()) {
                if (waypointsCommand$Action == WaypointsCommand$Action.LIST || waypointsCommand$Action == WaypointsCommand$Action.SAVE || waypointsCommand$Action == WaypointsCommand$Action.CLEAR) {
                    return new TabCompleteHelper().append(IWaypoint.Tag.getAllNames()).sortAlphabetically().filterPrefix(iArgConsumer.getString()).stream();
                }
                if (waypointsCommand$Action == WaypointsCommand$Action.RESTORE) {
                    return Stream.empty();
                }
                return iArgConsumer.tabCompleteDatatype((IDatatype)ForWaypoints.INSTANCE);
            }
            if (iArgConsumer.has(3) && waypointsCommand$Action == WaypointsCommand$Action.SAVE) {
                iArgConsumer.get();
                iArgConsumer.get();
                return iArgConsumer.tabCompleteDatatype((IDatatype)RelativeBlockPos.INSTANCE);
            }
        }
        return Stream.empty();
    }
}

