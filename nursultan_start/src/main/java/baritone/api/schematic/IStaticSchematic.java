/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 */
package baritone.api.schematic;

import baritone.api.schematic.ISchematic;
import minecraft.class00500;

public interface IStaticSchematic
extends ISchematic {
    default public class00500[] getColumn(int n, int n2) {
        class00500[] class00500Array = new class00500[this.heightY()];
        for (int i = 0; i < this.heightY(); ++i) {
            class00500Array[i] = this.getDirect(n, i, n2);
        }
        return class00500Array;
    }

    public class00500 getDirect(int var1, int var2, int var3);
}

