/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.VoicechatClient
 *  javax.annotation.Nullable
 *  minecraft.class00392
 *  minecraft.class04141
 *  minecraft.class05096
 */
package de.maxhenkel.voicechat.gui.tooltips;

import de.maxhenkel.voicechat.VoicechatClient;
import de.maxhenkel.voicechat.gui.widgets.ImageButton;
import de.maxhenkel.voicechat.gui.widgets.ImageButton$TooltipSupplier;
import javax.annotation.Nullable;
import minecraft.class00392;
import minecraft.class04141;
import minecraft.class05096;

public class HideTooltipSupplier
implements ImageButton$TooltipSupplier {
    public static final class00392 HIDE_ICONS_ENABLED = class00392.L((String)"message.voicechat.hide_icons.enabled");
    public static final class00392 HIDE_ICONS_DISABLED = class00392.L((String)"message.voicechat.hide_icons.disabled");
    private final class05096 screen;
    @Nullable
    private Boolean lastState;

    public HideTooltipSupplier(class05096 class050962) {
        this.screen = class050962;
    }

    @Override
    public void updateTooltip(ImageButton imageButton) {
        boolean bl = (Boolean)VoicechatClient.CLIENT_CONFIG.hideIcons.get();
        if (this.lastState == null || this.lastState != bl) {
            this.lastState = bl;
            imageButton.method_47400(class04141.N((class00392)(bl ? HIDE_ICONS_ENABLED : HIDE_ICONS_DISABLED)));
        }
    }
}

