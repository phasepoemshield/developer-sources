/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.IBaritone
 *  baritone.api.command.Command
 *  baritone.api.command.ICommand
 */
package baritone.command.defaults;

import baritone.api.IBaritone;
import baritone.api.command.Command;
import baritone.api.command.ICommand;
import baritone.command.defaults.AxisCommand;
import baritone.command.defaults.BlacklistCommand;
import baritone.command.defaults.BuildCommand;
import baritone.command.defaults.ClickCommand;
import baritone.command.defaults.ComeCommand;
import baritone.command.defaults.CommandAlias;
import baritone.command.defaults.ETACommand;
import baritone.command.defaults.ElytraCommand;
import baritone.command.defaults.ExecutionControlCommands;
import baritone.command.defaults.ExploreCommand;
import baritone.command.defaults.ExploreFilterCommand;
import baritone.command.defaults.FarmCommand;
import baritone.command.defaults.FindCommand;
import baritone.command.defaults.FollowCommand;
import baritone.command.defaults.ForceCancelCommand;
import baritone.command.defaults.GcCommand;
import baritone.command.defaults.GoalCommand;
import baritone.command.defaults.GotoCommand;
import baritone.command.defaults.HelpCommand;
import baritone.command.defaults.InvertCommand;
import baritone.command.defaults.LitematicaCommand;
import baritone.command.defaults.MineCommand;
import baritone.command.defaults.PathCommand;
import baritone.command.defaults.PickupCommand;
import baritone.command.defaults.ProcCommand;
import baritone.command.defaults.ReloadAllCommand;
import baritone.command.defaults.RenderCommand;
import baritone.command.defaults.RepackCommand;
import baritone.command.defaults.SaveAllCommand;
import baritone.command.defaults.SelCommand;
import baritone.command.defaults.SetCommand;
import baritone.command.defaults.SurfaceCommand;
import baritone.command.defaults.ThisWayCommand;
import baritone.command.defaults.TunnelCommand;
import baritone.command.defaults.VersionCommand;
import baritone.command.defaults.WaypointsCommand;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class DefaultCommands {
    private DefaultCommands() {
    }

    public static List<ICommand> createAll(IBaritone iBaritone) {
        Objects.requireNonNull(iBaritone);
        ArrayList<Command> arrayList = new ArrayList<Command>(Arrays.asList(new Command[]{new HelpCommand(iBaritone), new SetCommand(iBaritone), new CommandAlias(iBaritone, Arrays.asList("modified", "mod", "baritone", "modifiedsettings"), "List modified settings", "set modified"), new CommandAlias(iBaritone, "reset", "Reset all settings or just one", "set reset"), new GoalCommand(iBaritone), new GotoCommand(iBaritone), new PathCommand(iBaritone), new ProcCommand(iBaritone), new ETACommand(iBaritone), new VersionCommand(iBaritone), new RepackCommand(iBaritone), new BuildCommand(iBaritone), new LitematicaCommand(iBaritone), new ComeCommand(iBaritone), new AxisCommand(iBaritone), new ForceCancelCommand(iBaritone), new GcCommand(iBaritone), new InvertCommand(iBaritone), new TunnelCommand(iBaritone), new RenderCommand(iBaritone), new FarmCommand(iBaritone), new FollowCommand(iBaritone), new PickupCommand(iBaritone), new ExploreFilterCommand(iBaritone), new ReloadAllCommand(iBaritone), new SaveAllCommand(iBaritone), new ExploreCommand(iBaritone), new BlacklistCommand(iBaritone), new FindCommand(iBaritone), new MineCommand(iBaritone), new ClickCommand(iBaritone), new SurfaceCommand(iBaritone), new ThisWayCommand(iBaritone), new WaypointsCommand(iBaritone), new CommandAlias(iBaritone, "sethome", "Sets your home waypoint", "waypoints save home"), new CommandAlias(iBaritone, "home", "Path to your home waypoint", "waypoints goto home"), new SelCommand(iBaritone), new ElytraCommand(iBaritone)}));
        ExecutionControlCommands executionControlCommands = new ExecutionControlCommands(iBaritone);
        arrayList.add(executionControlCommands.pauseCommand);
        arrayList.add(executionControlCommands.resumeCommand);
        arrayList.add(executionControlCommands.pausedCommand);
        arrayList.add(executionControlCommands.cancelCommand);
        return Collections.unmodifiableList(arrayList);
    }
}

