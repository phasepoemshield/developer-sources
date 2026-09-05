/*
 * Decompiled with CFR 0.152.
 */
package page.langeweile.ok_zoomer.events;

import page.langeweile.ok_zoomer.config.ConfigEnums$SpyglassModes;
import page.langeweile.ok_zoomer.config.ConfigEnums$ZoomModes;

class ManageZoomEvent$1 {
    static final /* synthetic */ int[] $SwitchMap$page$langeweile$ok_zoomer$config$ConfigEnums$SpyglassModes;
    static final /* synthetic */ int[] $SwitchMap$page$langeweile$ok_zoomer$config$ConfigEnums$ZoomModes;

    static {
        $SwitchMap$page$langeweile$ok_zoomer$config$ConfigEnums$ZoomModes = new int[ConfigEnums$ZoomModes.values().length];
        try {
            ManageZoomEvent$1.$SwitchMap$page$langeweile$ok_zoomer$config$ConfigEnums$ZoomModes[ConfigEnums$ZoomModes.HOLD.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ManageZoomEvent$1.$SwitchMap$page$langeweile$ok_zoomer$config$ConfigEnums$ZoomModes[ConfigEnums$ZoomModes.TOGGLE.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ManageZoomEvent$1.$SwitchMap$page$langeweile$ok_zoomer$config$ConfigEnums$ZoomModes[ConfigEnums$ZoomModes.PERSISTENT.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        $SwitchMap$page$langeweile$ok_zoomer$config$ConfigEnums$SpyglassModes = new int[ConfigEnums$SpyglassModes.values().length];
        try {
            ManageZoomEvent$1.$SwitchMap$page$langeweile$ok_zoomer$config$ConfigEnums$SpyglassModes[ConfigEnums$SpyglassModes.REQUIRE_ITEM.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ManageZoomEvent$1.$SwitchMap$page$langeweile$ok_zoomer$config$ConfigEnums$SpyglassModes[ConfigEnums$SpyglassModes.BOTH.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ManageZoomEvent$1.$SwitchMap$page$langeweile$ok_zoomer$config$ConfigEnums$SpyglassModes[ConfigEnums$SpyglassModes.REPLACE_ZOOM.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

