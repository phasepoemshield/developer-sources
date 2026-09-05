/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  net.caffeinemc.mods.sodium.client.SodiumClientMod
 *  net.caffeinemc.mods.sodium.client.util.Dim2i
 */
package net.caffeinemc.mods.sodium.client.gui.widgets;

import minecraft.class00392;
import net.caffeinemc.mods.sodium.client.SodiumClientMod;
import net.caffeinemc.mods.sodium.client.gui.VideoSettingsScreen;
import net.caffeinemc.mods.sodium.client.gui.widgets.FlatButtonWidget;
import net.caffeinemc.mods.sodium.client.util.Dim2i;

public class DonationButtonWidget {
    private static final int DONATE_BUTTON_WIDTH = 100;
    private static final int CLOSE_BUTTON_MARGIN = 3;
    private final FlatButtonWidget hideDonateButton;
    private final FlatButtonWidget donateButtonText;
    private boolean donateButtonEnabled;

    public DonationButtonWidget(VideoSettingsScreen videoSettingsScreen, Runnable runnable, Runnable runnable2) {
        this.hideDonateButton = new FlatButtonWidget(new Dim2i(videoSettingsScreen.getLimitX() - 20 - 5, videoSettingsScreen.getY(), 20, 20), (class00392)class00392.y((String)"x"), runnable2, true, false);
        this.donateButtonText = new FlatButtonWidget(new Dim2i(this.hideDonateButton.getX() - 3 - 100, videoSettingsScreen.getY(), 100, 20), (class00392)class00392.L((String)"sodium.options.buttons.donate"), runnable, true, false);
        this.updateDisplay(videoSettingsScreen, !SodiumClientMod.options().notifications.hasClearedDonationButton);
    }

    public int getWidth() {
        if (this.donateButtonEnabled) {
            return 133;
        }
        return 0;
    }

    public void updateDisplay(VideoSettingsScreen videoSettingsScreen, boolean bl) {
        this.donateButtonEnabled = bl;
        videoSettingsScreen.setWidgetPresence(this.hideDonateButton, this.donateButtonEnabled);
        videoSettingsScreen.setWidgetPresence(this.donateButtonText, this.donateButtonEnabled);
    }
}

