/*
 * Decompiled with CFR 0.152.
 */
package page.langeweile.ok_zoomer.events;

import page.langeweile.ok_zoomer.config.OkZoomerConfigManager;
import page.langeweile.ok_zoomer.key_binds.ZoomKeyBinds;
import page.langeweile.ok_zoomer.utils.ZoomUtils;

public class ManageExtraKeysEvent {
    public static void startClientTick() {
        if (!ZoomKeyBinds.areExtraKeyBindsEnabled()) {
            return;
        }
        if (!((Boolean)OkZoomerConfigManager.CONFIG.controls.extraKeyBinds.value()).booleanValue()) {
            return;
        }
        if (ZoomKeyBinds.DECREASE_ZOOM_KEY.R() && !ZoomKeyBinds.INCREASE_ZOOM_KEY.R()) {
            ZoomUtils.changeZoomDivisor(false);
        }
        if (ZoomKeyBinds.INCREASE_ZOOM_KEY.R() && !ZoomKeyBinds.DECREASE_ZOOM_KEY.R()) {
            ZoomUtils.changeZoomDivisor(true);
        }
        if (ZoomKeyBinds.RESET_ZOOM_KEY.R()) {
            ZoomUtils.resetZoomDivisor(true);
        }
    }
}

