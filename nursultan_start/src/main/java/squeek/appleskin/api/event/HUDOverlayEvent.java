/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 */
package squeek.appleskin.api.event;

import minecraft.class01054;

public class HUDOverlayEvent {
    public int x;
    public int y;
    public class01054 context;
    public boolean isCanceled = false;

    HUDOverlayEvent(int n, int n2, class01054 class010542) {
        this.x = n;
        this.y = n2;
        this.context = class010542;
    }
}

