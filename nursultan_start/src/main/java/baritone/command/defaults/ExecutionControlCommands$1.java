/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.IBaritone
 *  baritone.api.process.IBaritoneProcess
 *  baritone.api.process.PathingCommand
 *  baritone.api.process.PathingCommandType
 */
package baritone.command.defaults;

import baritone.api.IBaritone;
import baritone.api.process.IBaritoneProcess;
import baritone.api.process.PathingCommand;
import baritone.api.process.PathingCommandType;

class ExecutionControlCommands$1
implements IBaritoneProcess {
    final /* synthetic */ boolean[] val$paused;
    final /* synthetic */ IBaritone val$baritone;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    ExecutionControlCommands$1() {
        void var3_-1;
        void var2_-1;
        this.val$paused = var2_-1;
        this.val$baritone = var3_-1;
    }

    public double priority() {
        return 0.0;
    }

    public boolean isActive() {
        return this.val$paused[0];
    }

    public PathingCommand onTick(boolean bl, boolean bl2) {
        this.val$baritone.getInputOverrideHandler().clearAllKeys();
        return new PathingCommand(null, PathingCommandType.REQUEST_PAUSE);
    }

    public String displayName0() {
        return "Pause/Resume Commands";
    }

    public void onLostControl() {
    }

    public boolean isTemporary() {
        return true;
    }
}

