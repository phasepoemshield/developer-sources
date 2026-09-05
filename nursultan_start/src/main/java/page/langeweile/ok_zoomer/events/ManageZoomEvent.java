/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04453
 *  minecraft.class06202
 */
package page.langeweile.ok_zoomer.events;

import minecraft.class04453;
import minecraft.class06202;
import page.langeweile.ok_zoomer.config.ConfigEnums$SpyglassModes;
import page.langeweile.ok_zoomer.config.ConfigEnums$ZoomModes;
import page.langeweile.ok_zoomer.config.OkZoomerConfigManager;
import page.langeweile.ok_zoomer.events.ManageZoomEvent$1;
import page.langeweile.ok_zoomer.key_binds.ZoomKeyBinds;
import page.langeweile.ok_zoomer.utils.ZoomUtils;
import page.langeweile.ok_zoomer.zoom.Zoom;

public class ManageZoomEvent {
    private static boolean lastZooming = false;
    private static boolean persistentZoom = false;
    private static boolean lastZoomWasSpyglass = false;

    /*
     * Unable to fully structure code
     */
    public static void startClientTick(class06202 var0) {
        if ((class04453)var0.T_4 == null) {
            return;
        }
        switch (ManageZoomEvent$1.$SwitchMap$page$langeweile$ok_zoomer$config$ConfigEnums$SpyglassModes[((ConfigEnums$SpyglassModes)OkZoomerConfigManager.CONFIG.controls.spyglassMode.value()).ordinal()]) {
            case 1: 
            case 2: {
                break;
            }
            default: {
                ** GOTO lbl-1000
            }
        }
        if (!ZoomUtils.hasSpyglass((class04453)var0.T_4)) {
            v0 = true;
        } else lbl-1000:
        // 2 sources

        {
            v0 = var1_1 = false;
        }
        if (var1_1) {
            Zoom.setZooming(false);
            ZoomUtils.resetZoomDivisor(false);
            ManageZoomEvent.lastZooming = false;
            return;
        }
        if (!((ConfigEnums$ZoomModes)OkZoomerConfigManager.CONFIG.controls.zoomMode.value()).equals(ConfigEnums$ZoomModes.HOLD)) {
            if (!ManageZoomEvent.persistentZoom) {
                ManageZoomEvent.persistentZoom = true;
                ManageZoomEvent.lastZooming = true;
                ZoomUtils.resetZoomDivisor(false);
            }
        } else if (ManageZoomEvent.persistentZoom) {
            ManageZoomEvent.persistentZoom = false;
            ManageZoomEvent.lastZooming = true;
        }
        switch (ManageZoomEvent$1.$SwitchMap$page$langeweile$ok_zoomer$config$ConfigEnums$SpyglassModes[((ConfigEnums$SpyglassModes)OkZoomerConfigManager.CONFIG.controls.spyglassMode.value()).ordinal()]) {
            case 2: 
            case 3: {
                v1 = true;
                break;
            }
            default: {
                v1 = false;
            }
        }
        var2_2 = v1;
        var3_3 = ZoomKeyBinds.ZOOM_KEY.R();
        var4_4 = ((class04453)var0.T_4).method_31550();
        v2 = var5_5 = var3_3 != false || var2_2 != false && var4_4 != false;
        if (var5_5 == ManageZoomEvent.lastZooming) {
            return;
        }
        var6_6 = (Boolean)OkZoomerConfigManager.CONFIG.controls.spyglassSounds.value();
        switch (ManageZoomEvent$1.$SwitchMap$page$langeweile$ok_zoomer$config$ConfigEnums$ZoomModes[((ConfigEnums$ZoomModes)OkZoomerConfigManager.CONFIG.controls.zoomMode.value()).ordinal()]) {
            case 1: {
                Zoom.setZooming(var5_5);
                ZoomUtils.resetZoomDivisor(false);
                break;
            }
            case 2: {
                if (var5_5) {
                    Zoom.setZooming(Zoom.isZooming() == false);
                    ZoomUtils.resetZoomDivisor(false);
                    break;
                }
                var6_6 = false;
                break;
            }
            case 3: {
                Zoom.setZooming(true);
                ZoomUtils.keepZoomStepsWithinBounds();
            }
        }
        if (var6_6 && !var4_4 && !ManageZoomEvent.lastZoomWasSpyglass) {
            var7_7 = ((ConfigEnums$ZoomModes)OkZoomerConfigManager.CONFIG.controls.zoomMode.value()).equals(ConfigEnums$ZoomModes.PERSISTENT) == false ? Zoom.isZooming() : var3_3;
            ((class04453)var0.T_4).method_5783(var7_7 != false ? ZoomUtils.ZOOM_IN_SOUND : ZoomUtils.ZOOM_OUT_SOUND, 1.0f, 1.0f);
        }
        ManageZoomEvent.lastZooming = var5_5;
        ManageZoomEvent.lastZoomWasSpyglass = var4_4 != false && var3_3 == false;
    }
}

