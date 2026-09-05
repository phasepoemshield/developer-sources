/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.voice.common.PlayerState
 *  javax.annotation.Nullable
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class01631
 *  minecraft.class07536
 *  minecraft.class08394
 */
package de.maxhenkel.voicechat.gui.volume;

import de.maxhenkel.voicechat.gui.GameProfileUtils;
import de.maxhenkel.voicechat.gui.volume.AdjustVolumesScreen;
import de.maxhenkel.voicechat.gui.volume.PlayerVolumeEntry$AdjustPlayerVolumeEntry;
import de.maxhenkel.voicechat.gui.volume.VolumeEntry;
import de.maxhenkel.voicechat.voice.common.PlayerState;
import javax.annotation.Nullable;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class01631;
import minecraft.class07536;
import minecraft.class08394;

public class PlayerVolumeEntry
extends VolumeEntry {
    @Nullable
    protected final PlayerState state;

    public PlayerVolumeEntry(@Nullable PlayerState playerState, AdjustVolumesScreen adjustVolumesScreen) {
        super(adjustVolumesScreen, new PlayerVolumeEntry$AdjustPlayerVolumeEntry(playerState != null ? playerState.getUuid() : class07536.R, playerState != null ? playerState.getName() : null));
        this.state = playerState;
    }

    @Nullable
    public PlayerState getState() {
        return this.state;
    }

    @Override
    public void renderElement(class01054 class010542, int n, int n2, int n3, int n4, int n5, int n6, boolean bl, float f, int n7, int n8, int n9, int n10) {
        if (this.state != null) {
            class01631 class016312 = GameProfileUtils.getSkin(this.state.getUuid());
            class010542.N(class08394.Na, class016312.N().y(), n7, n8, 8.0f, 8.0f, 24, 24, 8, 8, 64, 64);
            class010542.N(class08394.Na, class016312.N().y(), n7, n8, 40.0f, 8.0f, 24, 24, 8, 8, 64, 64);
            this.renderScrollingString(class010542, (class00392)class00392.y((String)this.state.getName()));
        } else {
            class010542.N(class08394.Na, OTHER_VOLUME_ICON, 24, 24, 0, 0, n7, n8, 24, 24);
            this.renderScrollingString(class010542, OTHER_VOLUME);
            if (bl) {
                class010542.N((class01590)this.minecraft.i_3, OTHER_VOLUME_DESCRIPTION, n5, n6);
            }
        }
    }
}

