/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.schematic.AbstractSchematic
 *  baritone.api.schematic.IStaticSchematic
 *  minecraft.class00500
 */
package baritone.utils.schematic;

import baritone.api.schematic.AbstractSchematic;
import baritone.api.schematic.IStaticSchematic;
import java.util.List;
import minecraft.class00500;

public class StaticSchematic
extends AbstractSchematic
implements IStaticSchematic {
    protected class00500[][][] states;

    public class00500[] getColumn(int n, int n2) {
        return this.states[n][n2];
    }

    public StaticSchematic() {
    }

    public StaticSchematic(class00500[][][] class00500Array) {
        this.states = class00500Array;
        boolean bl = class00500Array.length == 0 || class00500Array[0].length == 0 || class00500Array[0][0].length == 0;
        this.x = bl ? 0 : class00500Array.length;
        this.z = bl ? 0 : class00500Array[0].length;
        this.y = bl ? 0 : class00500Array[0][0].length;
    }

    public class00500 getDirect(int n, int n2, int n3) {
        return this.states[n][n3][n2];
    }

    public class00500 desiredState(int n, int n2, int n3, class00500 class005002, List<class00500> list) {
        return this.states[n][n3][n2];
    }
}

