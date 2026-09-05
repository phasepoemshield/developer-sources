/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05016
 *  minecraft.class05630
 *  minecraft.class06202
 */
package page.langeweile.ok_zoomer.zoom.modifiers;

import minecraft.class05016;
import minecraft.class05630;
import minecraft.class06202;
import page.langeweile.ok_zoomer.zoom.modifiers.MouseModifier;

public class CinematicCameraMouseModifier
implements MouseModifier {
    private final class05016 cursorXZoomSmoother = new class05016();
    private final class05016 cursorYZoomSmoother = new class05016();
    private final float multiplier;
    private boolean active;
    private class06202 minecraft;
    private boolean cinematicCameraEnabled;

    @Override
    public void tick(boolean bl) {
        this.ensureClient();
        if (this.multiplier == 1.0f && ((class05630)this.minecraft.i_7).Nd && !this.cinematicCameraEnabled) {
            this.cursorXZoomSmoother.N();
            this.cursorYZoomSmoother.N();
        }
        if (!bl && this.active) {
            this.cursorXZoomSmoother.N();
            this.cursorYZoomSmoother.N();
        }
        this.cinematicCameraEnabled = ((class05630)this.minecraft.i_7).Nd;
        this.active = bl;
    }

    public CinematicCameraMouseModifier(float f) {
        this.multiplier = f;
        this.active = false;
        this.ensureClient();
    }

    @Override
    public boolean getActive() {
        return this.active;
    }

    @Override
    public double applyYModifier(double d, double d2, double d3, double d4) {
        if (this.cinematicCameraEnabled) {
            this.cursorYZoomSmoother.N();
            return d;
        }
        return this.cursorYZoomSmoother.N(d, d3 * (double)this.multiplier * d2);
    }

    @Override
    public double applyXModifier(double d, double d2, double d3, double d4) {
        if (this.cinematicCameraEnabled) {
            this.cursorXZoomSmoother.N();
            return d;
        }
        return this.cursorXZoomSmoother.N(d, d3 * (double)this.multiplier * d2);
    }

    private void ensureClient() {
        if (this.minecraft == null) {
            this.minecraft = class06202.Nq();
        }
    }
}

