/*
 * Decompiled with CFR 0.152.
 */
package page.langeweile.ok_zoomer.zoom.modifiers;

public interface MouseModifier {
    public void tick(boolean var1);

    public boolean getActive();

    public double applyYModifier(double var1, double var3, double var5, double var7);

    public double applyXModifier(double var1, double var3, double var5, double var7);
}

