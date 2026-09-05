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

public class HideGroupHudTooltipSupplier
implements ImageButton$TooltipSupplier {
    public static final class00392 SHOW_GROUP_HUD_ENABLED = class00392.L((String)"message.voicechat.show_group_hud.enabled");
    public static final class00392 SHOW_GROUP_HUD_DISABLED = class00392.L((String)"message.voicechat.show_group_hud.disabled");
    private final class05096 screen;
    @Nullable
    private Boolean lastState;

    public HideGroupHudTooltipSupplier(class05096 class050962) {
        this.screen = class050962;
    }

    @Override
    public void updateTooltip(ImageButton imageButton) {
        boolean bl = (Boolean)VoicechatClient.CLIENT_CONFIG.showGroupHud.get();
        if (this.lastState == null || this.lastState != bl) {
            this.lastState = bl;
            imageButton.method_47400(class04141.N((class00392)(bl ? SHOW_GROUP_HUD_ENABLED : SHOW_GROUP_HUD_DISABLED)));
        }
    }
}

