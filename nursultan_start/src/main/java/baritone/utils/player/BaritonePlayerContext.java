/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.cache.IWorldData
 *  baritone.api.utils.BetterBlockPos
 *  baritone.api.utils.IPlayerContext
 *  baritone.api.utils.IPlayerController
 *  baritone.api.utils.RayTraceUtils
 *  baritone.api.utils.Rotation
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class07049
 *  minecraft.class07089
 *  minecraft.class07209
 *  minecraft.class07299
 */
package baritone.utils.player;

import baritone.Baritone;
import baritone.api.cache.IWorldData;
import baritone.api.utils.BetterBlockPos;
import baritone.api.utils.IPlayerContext;
import baritone.api.utils.IPlayerController;
import baritone.api.utils.RayTraceUtils;
import baritone.api.utils.Rotation;
import baritone.utils.player.BaritonePlayerController;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class07049;
import minecraft.class07089;
import minecraft.class07209;
import minecraft.class07299;

public final class BaritonePlayerContext
implements IPlayerContext {
    private final Baritone baritone;
    private final class06202 mc;
    private final IPlayerController playerController;

    public class06202 minecraft() {
        return this.mc;
    }

    public BaritonePlayerContext(Baritone baritone, class06202 class062022) {
        this.baritone = baritone;
        this.mc = class062022;
        this.playerController = new BaritonePlayerController(class062022);
    }

    public class04453 player() {
        return (class04453)this.mc.T_4;
    }

    public class07299 world() {
        return (class03448)this.mc.T_3;
    }

    public IWorldData worldData() {
        return this.baritone.getWorldProvider().getCurrentWorld();
    }

    public BetterBlockPos viewerPos() {
        class07049 class070492 = this.mc.F();
        return class070492 == null ? this.playerFeet() : BetterBlockPos.from((class07209)class070492.method_24515());
    }

    public class07089 objectMouseOver() {
        return RayTraceUtils.rayTraceTowards((class07049)this.player(), (Rotation)this.playerRotations(), (double)this.playerController().getBlockReachDistance());
    }

    public Rotation playerRotations() {
        return this.baritone.getLookBehavior().getEffectiveRotation().orElseGet(() -> super.playerRotations());
    }

    public IPlayerController playerController() {
        return this.playerController;
    }
}

