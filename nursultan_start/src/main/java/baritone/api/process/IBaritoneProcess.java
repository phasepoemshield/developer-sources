/*
 * Decompiled with CFR 0.152.
 */
package baritone.api.process;

import baritone.api.process.PathingCommand;

public interface IBaritoneProcess {
    public static final double DEFAULT_PRIORITY = -1.0;

    default public double priority() {
        return -1.0;
    }

    public boolean isActive();

    default public String displayName() {
        if (!this.isActive()) {
            return "INACTIVE";
        }
        return this.displayName0();
    }

    public PathingCommand onTick(boolean var1, boolean var2);

    public String displayName0();

    public void onLostControl();

    public boolean isTemporary();
}

