/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.behavior.look.ITickableAimProcessor
 *  minecraft.class05630
 */
package baritone.behavior;

import baritone.Baritone;
import baritone.api.behavior.look.ITickableAimProcessor;
import baritone.api.utils.IPlayerContext;
import baritone.api.utils.Rotation;
import baritone.behavior.LookBehavior$AbstractAimProcessor$1;
import baritone.behavior.look.ForkableRandom;
import minecraft.class05630;

abstract class LookBehavior$AbstractAimProcessor
implements ITickableAimProcessor {
    protected final IPlayerContext ctx;
    private final ForkableRandom rand;
    private double randomYawOffset;
    private double randomPitchOffset;

    public final void tick() {
        this.randomYawOffset = (this.rand.nextDouble() - 0.5) * (Double)Baritone.settings().randomLooking.value;
        this.randomPitchOffset = (this.rand.nextDouble() - 0.5) * (Double)Baritone.settings().randomLooking.value;
        double d = this.rand.nextDouble() - 0.5;
        if (Math.abs(d) < 0.1) {
            d *= 4.0;
        }
        this.randomYawOffset += d * (Double)Baritone.settings().randomLooking113.value;
    }

    LookBehavior$AbstractAimProcessor(LookBehavior$AbstractAimProcessor lookBehavior$AbstractAimProcessor) {
        this.ctx = lookBehavior$AbstractAimProcessor.ctx;
        this.rand = lookBehavior$AbstractAimProcessor.rand.fork();
        this.randomYawOffset = lookBehavior$AbstractAimProcessor.randomYawOffset;
        this.randomPitchOffset = lookBehavior$AbstractAimProcessor.randomPitchOffset;
    }

    public LookBehavior$AbstractAimProcessor(IPlayerContext iPlayerContext) {
        this.ctx = iPlayerContext;
        this.rand = new ForkableRandom();
    }

    public final void advance(int n) {
        for (int i = 0; i < n; ++i) {
            this.tick();
        }
    }

    public final ITickableAimProcessor fork() {
        return new LookBehavior$AbstractAimProcessor$1(this, this);
    }

    public Rotation nextRotation(Rotation rotation) {
        Rotation rotation2 = this.peekRotation(rotation);
        this.tick();
        return rotation2;
    }

    public final Rotation peekRotation(Rotation rotation) {
        Rotation rotation2 = this.getPrevRotation();
        float f = rotation.getYaw();
        float f2 = rotation.getPitch();
        if (f2 == rotation2.getPitch()) {
            f2 = this.nudgeToLevel(f2);
        }
        f = (float)((double)f + this.randomYawOffset);
        f2 = (float)((double)f2 + this.randomPitchOffset);
        return new Rotation(this.calculateMouseMove(rotation2.getYaw(), f), this.calculateMouseMove(rotation2.getPitch(), f2)).clamp();
    }

    protected abstract Rotation getPrevRotation();

    private float calculateMouseMove(float f, float f2) {
        float f3 = f2 - f;
        double d = this.angleToMouse(f3);
        return f + this.mouseToAngle(d);
    }

    private float mouseToAngle(double d) {
        double d2 = (Double)((class05630)this.ctx.minecraft().i_7).u().method_41753() * (double)0.6f + (double)0.2f;
        return (float)(d * d2 * d2 * d2 * 8.0) * 0.15f;
    }

    private float nudgeToLevel(float f) {
        if (f < -20.0f) {
            return f + 1.0f;
        }
        if (f > 10.0f) {
            return f - 1.0f;
        }
        return f;
    }

    private double angleToMouse(float f) {
        float f2 = this.mouseToAngle(1.0);
        return Math.round(f / f2);
    }
}

