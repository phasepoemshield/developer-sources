/*
 * Decompiled with CFR 0.152.
 */
package page.langeweile.ok_zoomer.zoom.modifiers;

import page.langeweile.ok_zoomer.zoom.modifiers.MouseModifier;

public class ContainingMouseModifier
implements MouseModifier {
    private final MouseModifier[] modifiers;
    private boolean active;

    @Override
    public void tick(boolean bl) {
        boolean bl2 = false;
        for (MouseModifier mouseModifier : this.modifiers) {
            mouseModifier.tick(bl);
            if (!bl) continue;
            bl2 = true;
        }
        this.active = bl2;
    }

    public ContainingMouseModifier(MouseModifier ... mouseModifierArray) {
        this.modifiers = mouseModifierArray;
        this.active = false;
    }

    @Override
    public boolean getActive() {
        return this.active;
    }

    @Override
    public double applyYModifier(double d, double d2, double d3, double d4) {
        double d5 = d;
        for (MouseModifier mouseModifier : this.modifiers) {
            d5 = mouseModifier.applyYModifier(d5, d2, d3, d4);
        }
        return d5;
    }

    @Override
    public double applyXModifier(double d, double d2, double d3, double d4) {
        double d5 = d;
        for (MouseModifier mouseModifier : this.modifiers) {
            d5 = mouseModifier.applyXModifier(d5, d2, d3, d4);
        }
        return d5;
    }
}

