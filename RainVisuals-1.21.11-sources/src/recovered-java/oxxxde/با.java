/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.render.OverlayTexture
 */
package oxxxde;

import net.minecraft.client.render.OverlayTexture;

public final class \u0628\u0627 {
    private static final ThreadLocal<Boolean> ARMOR_OVERLAY_ACTIVE = ThreadLocal.withInitial(() -> false);
    private static final ThreadLocal<Integer> ARMOR_OVERLAY = ThreadLocal.withInitial(() -> OverlayTexture.DEFAULT_UV);

    public static boolean isArmorOverlayActive() {
        return ARMOR_OVERLAY_ACTIVE.get();
    }

    public static void setArmorOverlay(int overlay) {
        ARMOR_OVERLAY_ACTIVE.set(true);
        ARMOR_OVERLAY.set(overlay);
    }

    public static void restoreArmorOverlay(boolean active, int overlay) {
        ARMOR_OVERLAY_ACTIVE.set(active);
        ARMOR_OVERLAY.set(overlay);
    }

    public static int getArmorOverlay() {
        return ARMOR_OVERLAY.get();
    }

    public static int resolveArmorOverlay(int fallback) {
        return \u0628\u0627.isArmorOverlayActive() ? \u0628\u0627.getArmorOverlay() : fallback;
    }

    private \u0628\u0627() {
    }
}

