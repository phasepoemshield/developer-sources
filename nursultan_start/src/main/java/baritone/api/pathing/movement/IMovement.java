/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07209
 */
package baritone.api.pathing.movement;

import baritone.api.pathing.movement.MovementStatus;
import baritone.api.utils.BetterBlockPos;
import minecraft.class07209;

public interface IMovement {
    public void reset();

    public MovementStatus update();

    public double getCost();

    public BetterBlockPos getSrc();

    public BetterBlockPos getDest();

    public class07209 getDirection();

    public boolean safeToCancel();

    public void resetBlockCache();

    public boolean calculatedWhileLoaded();
}

