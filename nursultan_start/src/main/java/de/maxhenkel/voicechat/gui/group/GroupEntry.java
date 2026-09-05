/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.voice.client.ClientManager
 *  de.maxhenkel.voicechat.voice.client.ClientVoicechat
 *  de.maxhenkel.voicechat.voice.common.PlayerState
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class01894
 *  minecraft.class02566
 *  minecraft.class05096
 *  minecraft.class05216
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class08394
 */
package de.maxhenkel.voicechat.gui.group;

import de.maxhenkel.voicechat.gui.GameProfileUtils;
import de.maxhenkel.voicechat.gui.volume.AdjustVolumeSlider;
import de.maxhenkel.voicechat.gui.volume.PlayerVolumeEntry$AdjustPlayerVolumeEntry;
import de.maxhenkel.voicechat.gui.widgets.ListScreenEntryBase;
import de.maxhenkel.voicechat.voice.client.ClientManager;
import de.maxhenkel.voicechat.voice.client.ClientVoicechat;
import de.maxhenkel.voicechat.voice.common.PlayerState;
import java.util.Objects;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class01894;
import minecraft.class02566;
import minecraft.class05096;
import minecraft.class05216;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class08394;

public class GroupEntry
extends ListScreenEntryBase<GroupEntry> {
    protected static final class01894 TALK_OUTLINE = class01894.N((String)"voicechat", (String)"icons/talk_outline");
    protected static final class01894 SPEAKER_OFF = class01894.N((String)"voicechat", (String)"icons/speaker_small_off");
    protected static final int PADDING = 4;
    protected static final int BG_FILL = class02566.y((int)255, (int)74, (int)74, (int)74);
    protected static final int PLAYER_NAME_COLOR = class02566.y((int)255, (int)255, (int)255, (int)255);
    protected final class05096 parent;
    protected final class06202 minecraft;
    protected PlayerState state;
    protected final AdjustVolumeSlider volumeSlider;

    public GroupEntry(class05096 class050962, PlayerState playerState) {
        this.parent = class050962;
        this.minecraft = class06202.Nq();
        this.state = playerState;
        this.volumeSlider = new AdjustVolumeSlider(0, 0, 100, 20, new PlayerVolumeEntry$AdjustPlayerVolumeEntry(playerState.getUuid(), playerState.getName()));
        this.children.add(this.volumeSlider);
    }

    public PlayerState getState() {
        return this.state;
    }

    public void setState(PlayerState playerState) {
        this.state = playerState;
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        ClientVoicechat clientVoicechat;
        int n3 = this.method_73380();
        int n4 = this.method_73382();
        int n5 = this.method_73387();
        int n6 = this.method_73384();
        class010542.N(n3, n4, n3 + n5, n4 + n6, BG_FILL);
        class010542.i().pushMatrix();
        int n7 = n6 - 8;
        class010542.i().translate((float)(n3 + 4), (float)(n4 + 4));
        float f2 = (float)n7 / 10.0f;
        class010542.i().scale(f2, f2);
        if (!this.state.isDisabled() && (clientVoicechat = ClientManager.getClient()) != null && clientVoicechat.getTalkCache().isTalking(this.state.getUuid())) {
            class010542.N(class08394.Na, TALK_OUTLINE, 16, 16, 0, 0, 0, 0, 10, 10);
        }
        clientVoicechat = GameProfileUtils.getSkin(this.state.getUuid());
        class010542.N(class08394.Na, clientVoicechat.N().y(), 1, 1, 8.0f, 8.0f, 8, 8, 64, 64);
        class010542.N(class08394.Na, clientVoicechat.N().y(), 1, 1, 40.0f, 8.0f, 8, 8, 64, 64);
        if (this.state.isDisabled()) {
            class010542.i().pushMatrix();
            class010542.i().translate(1.0f, 1.0f);
            class010542.i().scale(0.5f, 0.5f);
            class010542.N(class08394.Na, SPEAKER_OFF, 0, 0, 16, 16);
            class010542.i().popMatrix();
        }
        class010542.i().popMatrix();
        class05216 class052162 = class00392.y((String)this.state.getName());
        class01590 class015902 = (class01590)this.minecraft.i_3;
        int n8 = n4 + n6 / 2;
        Objects.requireNonNull((class01590)this.minecraft.i_3);
        class010542.N(class015902, (class00392)class052162, n3 + 4 + n7 + 4, n8 - 9 / 2, PLAYER_NAME_COLOR, false);
        if (bl && !ClientManager.getPlayerStateManager().getOwnID().equals(this.state.getUuid())) {
            this.volumeSlider.method_25358(Math.min(n5 - (4 + n7 + 4 + ((class01590)this.minecraft.i_3).N((class05936)class052162) + 4 + 4), 100));
            this.volumeSlider.y(n3 + (n5 - this.volumeSlider.method_25368() - 4), n4 + (n6 - this.volumeSlider.method_25364()) / 2);
            this.volumeSlider.method_25394(class010542, n, n2, f);
        }
    }
}

