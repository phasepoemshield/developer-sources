/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.floats.FloatUnaryOperator
 *  minecraft.class04995
 */
package page.langeweile.ok_zoomer.zoom.transitions;

import it.unimi.dsi.fastutil.floats.FloatUnaryOperator;
import minecraft.class04995;

public class EasedTransitionMode {
    private final FloatUnaryOperator startTransition;
    private final FloatUnaryOperator endTransition;
    private final FloatUnaryOperator scrollTransition;
    private final int targetStartTicks;
    private final int targetEndTicks;
    private final int targetScrollTicks;
    private final boolean invertStartTransition;
    private final boolean invertEndTransition;
    private boolean active;
    private int ticks;
    private float startZoomMultiplier;
    private float startFadeMultiplier;
    private float lastZoomMultiplier;
    private float internalMultiplier;
    private float lastInternalMultiplier;
    private float internalFade;
    private float lastInternalFade;
    private boolean scrollMode;

    public void tick(boolean bl, double d) {
        boolean bl2;
        float f = (float)(1.0 / d);
        float f2 = bl ? 1.0f : 0.0f;
        boolean bl3 = bl2 = bl && this.targetStartTicks == 0 || !bl && this.targetEndTicks == 0;
        if (bl2) {
            this.internalMultiplier = bl ? f : 1.0f;
            this.internalFade = bl ? f2 : 1.0f;
            this.lastInternalMultiplier = this.internalMultiplier;
            this.lastInternalFade = this.internalFade;
        } else {
            boolean bl4;
            int n;
            int n2 = bl ? (this.scrollMode ? this.targetScrollTicks : this.targetStartTicks) : this.targetEndTicks;
            int n3 = n = bl ? this.targetEndTicks : this.targetStartTicks;
            boolean bl5 = bl ? !this.scrollMode && this.invertStartTransition : (bl4 = this.invertEndTransition);
            if (this.ticks <= n2) {
                ++this.ticks;
            }
            this.lastInternalMultiplier = this.internalMultiplier;
            this.lastInternalFade = this.internalFade;
            if (this.active != bl) {
                if (bl && this.ticks >= n) {
                    this.internalMultiplier = 1.0f;
                    this.internalFade = 0.0f;
                }
                this.ticks = 1;
                this.startZoomMultiplier = this.internalMultiplier;
                this.startFadeMultiplier = this.internalFade;
                this.scrollMode = false;
            }
            if (bl && this.ticks != 1 && f != this.lastZoomMultiplier) {
                this.scrollMode = true;
                this.ticks = this.targetScrollTicks / 2;
                this.lastZoomMultiplier = this.internalMultiplier;
            }
            if (this.scrollMode) {
                if (this.targetScrollTicks == 0) {
                    this.lastInternalMultiplier = this.internalMultiplier = bl ? f : 1.0f;
                }
                if (f != this.lastZoomMultiplier) {
                    this.ticks = 1;
                    this.startZoomMultiplier = this.lastZoomMultiplier;
                    this.startFadeMultiplier = f2;
                }
            }
            float f3 = (float)Math.min(this.ticks, n2) / (float)n2;
            if (bl4) {
                f3 = 1.0f - f3;
            }
            float f4 = this.ticks <= n2 ? (bl ? (this.scrollMode ? this.scrollTransition.apply(f3) : this.startTransition.apply(f3)) : this.endTransition.apply(f3)) : 1.0f;
            f4 = Math.min(bl4 ? 1.0f - f4 : f4, 1.2f);
            if (this.ticks <= n2) {
                this.internalMultiplier = class04995.B((float)f4, (float)this.startZoomMultiplier, (float)(bl ? f : 1.0f));
                this.internalFade = class04995.B((float)f4, (float)this.startFadeMultiplier, (float)(bl ? f2 : 0.0f));
            }
        }
        this.active = bl;
        this.lastZoomMultiplier = f;
    }

    public EasedTransitionMode(FloatUnaryOperator floatUnaryOperator, FloatUnaryOperator floatUnaryOperator2, FloatUnaryOperator floatUnaryOperator3, int n, int n2, int n3, boolean bl, boolean bl2) {
        this.startTransition = floatUnaryOperator;
        this.endTransition = floatUnaryOperator2;
        this.scrollTransition = floatUnaryOperator3;
        this.targetStartTicks = n;
        this.targetEndTicks = n2;
        this.targetScrollTicks = n3;
        this.invertStartTransition = bl;
        this.invertEndTransition = bl2;
        this.active = false;
        this.ticks = 1;
        this.startZoomMultiplier = 1.0f;
        this.startFadeMultiplier = 0.0f;
        this.lastZoomMultiplier = 1.0f;
        this.internalMultiplier = 1.0f;
        this.lastInternalMultiplier = 1.0f;
        this.internalFade = 0.0f;
        this.lastInternalFade = 0.0f;
        this.scrollMode = false;
    }

    public double getInternalMultiplier() {
        return this.internalMultiplier;
    }

    public boolean getActive() {
        return this.active || this.ticks <= this.targetEndTicks;
    }

    public float applyZoom(float f, float f2) {
        return f * class04995.B((float)f2, (float)this.lastInternalMultiplier, (float)this.internalMultiplier);
    }

    public float getFade(float f) {
        return class04995.B((float)f, (float)this.lastInternalFade, (float)this.internalFade);
    }
}

