/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.utils.Rotation
 *  minecraft.class07209
 *  minecraft.class07211
 */
package baritone.process;

import baritone.api.utils.Rotation;
import minecraft.class07209;
import minecraft.class07211;

public class BuilderProcess$Placement {
    final int hotbarSelection;
    final class07209 placeAgainst;
    final class07211 side;
    final Rotation rot;

    public BuilderProcess$Placement(int n, class07209 class072092, class07211 class072112, Rotation rotation) {
        this.hotbarSelection = n;
        this.placeAgainst = class072092;
        this.side = class072112;
        this.rot = rotation;
    }
}

