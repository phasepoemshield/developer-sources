/*
 * Decompiled with CFR 0.152.
 */
package page.langeweile.ok_zoomer.events;

import page.langeweile.ok_zoomer.config.OkZoomerConfigManager;
import page.langeweile.ok_zoomer.utils.OwoUtils;

public class ApplyLoadOnceOptionsEvent {
    public static void readyClient() {
        if (((Boolean)OkZoomerConfigManager.CONFIG.tweaks.printOwoOnStart.value()).booleanValue()) {
            OwoUtils.printOwo();
        }
    }
}

