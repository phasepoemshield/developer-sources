/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.IBaritone
 *  baritone.api.command.Command
 *  baritone.api.process.IBaritoneProcess
 */
package baritone.command.defaults;

import baritone.api.IBaritone;
import baritone.api.command.Command;
import baritone.api.process.IBaritoneProcess;
import baritone.command.defaults.ExecutionControlCommands$1;
import baritone.command.defaults.ExecutionControlCommands$2;
import baritone.command.defaults.ExecutionControlCommands$3;
import baritone.command.defaults.ExecutionControlCommands$4;
import baritone.command.defaults.ExecutionControlCommands$5;

public class ExecutionControlCommands {
    Command pauseCommand;
    Command resumeCommand;
    Command pausedCommand;
    Command cancelCommand;

    public ExecutionControlCommands(IBaritone iBaritone) {
        boolean[] blArray = new boolean[]{false};
        iBaritone.getPathingControlManager().registerProcess((IBaritoneProcess)new ExecutionControlCommands$1(this, blArray, iBaritone));
        this.pauseCommand = new ExecutionControlCommands$2(this, iBaritone, new String[]{"pause", "p", "paws"}, blArray);
        this.resumeCommand = new ExecutionControlCommands$3(this, iBaritone, new String[]{"resume", "r", "unpause", "unpaws"}, blArray);
        this.pausedCommand = new ExecutionControlCommands$4(this, iBaritone, new String[]{"paused"}, blArray);
        this.cancelCommand = new ExecutionControlCommands$5(this, iBaritone, new String[]{"cancel", "c", "stop"}, blArray);
    }
}

