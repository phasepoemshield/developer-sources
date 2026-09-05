/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class02233
 */
package page.langeweile.ok_zoomer.zoom.overlays;

import minecraft.class01054;
import minecraft.class02233;
import page.langeweile.ok_zoomer.zoom.transitions.EasedTransitionMode;

public interface ZoomOverlay {
    public void tick(boolean var1, double var2, EasedTransitionMode var4);

    public boolean getActive();

    default public boolean cancelOverlayRendering() {
        return false;
    }

    public void renderOverlay(class01054 var1, class02233 var2, EasedTransitionMode var3);

    default public void tickBeforeRender(class02233 class022332) {
    }
}

