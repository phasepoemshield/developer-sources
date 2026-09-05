/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.schematic.CompositeSchematic
 *  baritone.api.schematic.IStaticSchematic
 *  minecraft.class00500
 */
package baritone.utils.schematic.litematica;

import baritone.api.schematic.CompositeSchematic;
import baritone.api.schematic.IStaticSchematic;
import java.util.Collections;
import minecraft.class00500;

class LitematicaHelper$LitematicaPlacementSchematic
extends CompositeSchematic
implements IStaticSchematic {
    private final String name;

    public LitematicaHelper$LitematicaPlacementSchematic(String string) {
        super(0, 0, 0);
        this.name = string;
    }

    public String toString() {
        return this.name;
    }

    public class00500 getDirect(int n, int n2, int n3) {
        if (this.inSchematic(n, n2, n3, null)) {
            return this.desiredState(n, n2, n3, null, Collections.emptyList());
        }
        return null;
    }
}

