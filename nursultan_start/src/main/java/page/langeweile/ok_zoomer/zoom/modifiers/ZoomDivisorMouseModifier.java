/*
 * Decompiled with CFR 0.152.
 */
package page.langeweile.ok_zoomer.zoom.modifiers;

import page.langeweile.ok_zoomer.zoom.modifiers.MouseModifier;

public class ZoomDivisorMouseModifier
implements MouseModifier {
    private boolean active = false;

    @Override
    public void tick(boolean bl) {
        this.active = bl;
    }

    @Override
    public boolean getActive() {
        return this.active;
    }

    @Override
    public double applyYModifier(double d, double d2, double d3, double d4) {
        return d * (this.active ? d4 : 1.0);
    }

    @Override
    public double applyXModifier(double d, double d2, double d3, double d4) {
        return d * (this.active ? d4 : 1.0);
    }
}

