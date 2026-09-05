/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class02233
 *  minecraft.class04995
 *  minecraft.class08394
 */
package page.langeweile.ok_zoomer.zoom.overlays;

import minecraft.class01054;
import minecraft.class01894;
import minecraft.class02233;
import minecraft.class04995;
import minecraft.class08394;
import page.langeweile.ok_zoomer.zoom.overlays.ZoomOverlay;
import page.langeweile.ok_zoomer.zoom.transitions.EasedTransitionMode;

public class SpyglassZoomOverlay
implements ZoomOverlay {
    private final class01894 textureId;
    private float scale;
    private boolean active;

    @Override
    public void tick(boolean bl, double d, EasedTransitionMode easedTransitionMode) {
        this.active = bl;
    }

    public SpyglassZoomOverlay(class01894 class018942) {
        this.textureId = class018942;
        this.scale = 0.5f;
        this.active = false;
    }

    @Override
    public boolean getActive() {
        return this.active;
    }

    @Override
    public boolean cancelOverlayRendering() {
        return true;
    }

    @Override
    public void renderOverlay(class01054 class010542, class02233 class022332, EasedTransitionMode easedTransitionMode) {
        int n = class010542.N();
        int n2 = class010542.y();
        float f = Math.min(n, n2);
        float f2 = Math.min((float)n / f, (float)n2 / f) * this.scale;
        int n3 = class04995.y((float)(f * f2));
        int n4 = class04995.y((float)(f * f2));
        int n5 = (n - n3) / 2;
        int n6 = (n2 - n4) / 2;
        int n7 = n5 + n3;
        int n8 = n6 + n4;
        class010542.N(class08394.Na, this.textureId, n5, n6, 0.0f, 0.0f, n3, n4, n3, n4);
        class010542.N(class08394.NH, 0, n8, n, n2, -16777216);
        class010542.N(class08394.NH, 0, 0, n, n6, -16777216);
        class010542.N(class08394.NH, 0, n6, n5, n8, -16777216);
        class010542.N(class08394.NH, n7, n6, n, n8, -16777216);
    }

    @Override
    public void tickBeforeRender(class02233 class022332) {
        this.scale = !this.active ? 0.5f : class04995.B((float)(0.5f * class022332.N()), (float)this.scale, (float)1.125f);
    }
}

