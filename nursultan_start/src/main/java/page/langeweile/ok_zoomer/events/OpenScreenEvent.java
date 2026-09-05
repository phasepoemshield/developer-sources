/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05096
 *  minecraft.class06202
 */
package page.langeweile.ok_zoomer.events;

import minecraft.class05096;
import minecraft.class06202;
import page.langeweile.ok_zoomer.config.screen.OkZoomerConfigScreen;
import page.langeweile.ok_zoomer.utils.FabricZoomUtils;

public class OpenScreenEvent {
    public static void endClientTick(class06202 class062022) {
        if (FabricZoomUtils.shouldOpenCommandScreen()) {
            class062022.N((class05096)new OkZoomerConfigScreen((class05096)class062022.v_3));
            FabricZoomUtils.setOpenCommandScreen(false);
        }
    }
}

