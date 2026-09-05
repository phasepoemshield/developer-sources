/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class02233
 *  minecraft.class02566
 *  minecraft.class08394
 */
package page.langeweile.ok_zoomer.zoom.overlays;

import minecraft.class01054;
import minecraft.class01894;
import minecraft.class02233;
import minecraft.class02566;
import minecraft.class08394;
import page.langeweile.ok_zoomer.zoom.overlays.ZoomOverlay;
import page.langeweile.ok_zoomer.zoom.transitions.EasedTransitionMode;

public class ZoomerZoomOverlay
implements ZoomOverlay {
    private final class01894 textureId;
    private boolean active;

    @Override
    public void tick(boolean bl, double d, EasedTransitionMode easedTransitionMode) {
        if (bl || !easedTransitionMode.getActive()) {
            this.active = bl;
        }
    }

    public ZoomerZoomOverlay(class01894 class018942) {
        this.textureId = class018942;
        this.active = false;
    }

    @Override
    public boolean getActive() {
        return this.active;
    }

    @Override
    public void renderOverlay(class01054 class010542, class02233 class022332, EasedTransitionMode easedTransitionMode) {
        float f = easedTransitionMode.getFade(class022332.N(true));
        int n = class02566.N((float)1.0f, (float)f, (float)f, (float)f);
        class010542.N(class08394.NS, this.textureId, 0, 0, 0.0f, 0.0f, class010542.N(), class010542.y(), class010542.N(), class010542.y(), n);
    }
}

