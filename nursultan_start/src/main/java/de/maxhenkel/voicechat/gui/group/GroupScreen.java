/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.VoicechatClient
 *  de.maxhenkel.voicechat.api.Group$Type
 *  de.maxhenkel.voicechat.configbuilder.entry.ConfigEntry
 *  de.maxhenkel.voicechat.net.ClientServerNetManager
 *  de.maxhenkel.voicechat.net.LeaveGroupPacket
 *  de.maxhenkel.voicechat.net.Packet
 *  de.maxhenkel.voicechat.voice.client.ClientManager
 *  de.maxhenkel.voicechat.voice.client.ClientPlayerStateManager
 *  de.maxhenkel.voicechat.voice.client.MicrophoneActivationType
 *  de.maxhenkel.voicechat.voice.common.ClientGroup
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class04141
 *  minecraft.class04654
 *  minecraft.class04995
 *  minecraft.class05096
 *  minecraft.class05216
 *  minecraft.class05936
 *  minecraft.class08394
 */
package de.maxhenkel.voicechat.gui.group;

import de.maxhenkel.voicechat.VoicechatClient;
import de.maxhenkel.voicechat.api.Group;
import de.maxhenkel.voicechat.configbuilder.entry.ConfigEntry;
import de.maxhenkel.voicechat.gui.GroupType;
import de.maxhenkel.voicechat.gui.VoiceChatScreenBase;
import de.maxhenkel.voicechat.gui.group.GroupList;
import de.maxhenkel.voicechat.gui.group.JoinGroupScreen;
import de.maxhenkel.voicechat.gui.tooltips.DisableTooltipSupplier;
import de.maxhenkel.voicechat.gui.tooltips.HideGroupHudTooltipSupplier;
import de.maxhenkel.voicechat.gui.tooltips.MuteTooltipSupplier;
import de.maxhenkel.voicechat.gui.widgets.ImageButton;
import de.maxhenkel.voicechat.gui.widgets.ToggleImageButton;
import de.maxhenkel.voicechat.net.ClientServerNetManager;
import de.maxhenkel.voicechat.net.LeaveGroupPacket;
import de.maxhenkel.voicechat.net.Packet;
import de.maxhenkel.voicechat.voice.client.ClientManager;
import de.maxhenkel.voicechat.voice.client.ClientPlayerStateManager;
import de.maxhenkel.voicechat.voice.client.MicrophoneActivationType;
import de.maxhenkel.voicechat.voice.common.ClientGroup;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01894;
import minecraft.class04141;
import minecraft.class04654;
import minecraft.class04995;
import minecraft.class05096;
import minecraft.class05216;
import minecraft.class05936;
import minecraft.class08394;

public class GroupScreen
extends VoiceChatScreenBase {
    protected static final class01894 TEXTURE = class01894.N((String)"voicechat", (String)"textures/gui/gui_group.png");
    protected static final class01894 LEAVE = class01894.N((String)"voicechat", (String)"icons/leave");
    protected static final class01894 MICROPHONE = class01894.N((String)"voicechat", (String)"icons/microphone_button");
    protected static final class01894 SPEAKER = class01894.N((String)"voicechat", (String)"icons/speaker_button");
    protected static final class01894 GROUP_HUD = class01894.N((String)"voicechat", (String)"icons/group_hud_button");
    protected static final class00392 TITLE = class00392.L((String)"gui.voicechat.group.title");
    protected static final class00392 LEAVE_GROUP = class00392.L((String)"message.voicechat.leave_group");
    protected static final int HEADER_SIZE = 16;
    protected static final int FOOTER_SIZE = 32;
    protected static final int UNIT_SIZE = 18;
    protected static final int CELL_HEIGHT = 36;
    protected GroupList groupList;
    protected int units;
    protected final ClientGroup group;
    protected ToggleImageButton mute;
    protected ToggleImageButton disable;
    protected ToggleImageButton showHUD;
    protected ImageButton leave;

    public GroupScreen(ClientGroup clientGroup) {
        super(TITLE, 236, 0);
        this.group = clientGroup;
    }

    @Override
    public void method_25426() {
        super.method_25426();
        this.guiLeft += 2;
        this.guiTop = 32;
        int n = class04995.u((float)2.2222223f);
        this.units = Math.max(n, (this.field_22790 - 16 - 32 - this.guiTop * 2) / 18);
        this.ySize = 16 + this.units * 18 + 32;
        ClientPlayerStateManager clientPlayerStateManager = ClientManager.getPlayerStateManager();
        if (this.groupList != null) {
            this.groupList.updateSize(this.field_22789, this.units * 18, 0, this.guiTop + 16);
        } else {
            this.groupList = new GroupList(this, this.field_22789, this.units * 18, this.guiTop + 16, 36);
        }
        this.method_25429((class04654)this.groupList);
        int n2 = this.guiTop + this.ySize - 20 - 7;
        int n3 = 20;
        this.mute = new ToggleImageButton(this.guiLeft + 7, n2, MICROPHONE, () -> ((ClientPlayerStateManager)clientPlayerStateManager).isMuted(), imageButton -> clientPlayerStateManager.setMuted(!clientPlayerStateManager.isMuted()), new MuteTooltipSupplier(this, clientPlayerStateManager));
        this.method_37063((class04654)this.mute);
        this.disable = new ToggleImageButton(this.guiLeft + 7 + n3 + 3, n2, SPEAKER, () -> ((ClientPlayerStateManager)clientPlayerStateManager).isDisabled(), imageButton -> clientPlayerStateManager.setDisabled(!clientPlayerStateManager.isDisabled()), new DisableTooltipSupplier(this, clientPlayerStateManager));
        this.method_37063((class04654)this.disable);
        this.showHUD = new ToggleImageButton(this.guiLeft + 7 + (n3 + 3) * 2, n2, GROUP_HUD, () -> ((ConfigEntry)VoicechatClient.CLIENT_CONFIG.showGroupHud).get(), imageButton -> VoicechatClient.CLIENT_CONFIG.showGroupHud.set((Object)((Boolean)VoicechatClient.CLIENT_CONFIG.showGroupHud.get() == false ? 1 : 0)).save(), new HideGroupHudTooltipSupplier(this));
        this.method_37063((class04654)this.showHUD);
        this.leave = new ImageButton(this.guiLeft + this.xSize - n3 - 7, n2, LEAVE, imageButton -> {
            ClientServerNetManager.sendToServer((Packet)new LeaveGroupPacket());
            this.field_22787.N((class05096)new JoinGroupScreen());
        });
        this.leave.method_47400(class04141.N((class00392)LEAVE_GROUP));
        this.method_37063((class04654)this.leave);
        this.checkButtons();
    }

    public void method_25393() {
        super.method_25393();
        this.checkButtons();
    }

    @Override
    public void method_25420(class01054 class010542, int n, int n2, float f) {
        class010542.N(class08394.Na, TEXTURE, this.guiLeft, this.guiTop, 0.0f, 0.0f, this.xSize, 16, 256, 256);
        for (int i = 0; i < this.units; ++i) {
            class010542.N(class08394.Na, TEXTURE, this.guiLeft, this.guiTop + 16 + 18 * i, 0.0f, 16.0f, this.xSize, 18, 256, 256);
        }
        class010542.N(class08394.Na, TEXTURE, this.guiLeft, this.guiTop + 16 + 18 * this.units, 0.0f, 34.0f, this.xSize, 32, 256, 256);
        class010542.N(class08394.Na, TEXTURE, this.guiLeft + 10, this.guiTop + 16 + 6 - 2, (float)this.xSize, 0.0f, 12, 12, 256, 256);
    }

    private void checkButtons() {
        this.mute.field_22763 = ((MicrophoneActivationType)VoicechatClient.CLIENT_CONFIG.microphoneActivationType.get()).equals((Object)MicrophoneActivationType.VOICE);
        this.showHUD.field_22763 = (Boolean)VoicechatClient.CLIENT_CONFIG.hideIcons.get() == false;
    }

    @Override
    public void renderForeground(class01054 class010542, int n, int n2, float f) {
        this.groupList.method_25394(class010542, n, n2, f);
        class05216 class052162 = this.group.getType().equals((Object)Group.Type.NORMAL) ? class00392.N((String)"message.voicechat.group_title", (Object[])new Object[]{class00392.y((String)this.group.getName())}) : class00392.N((String)"message.voicechat.group_type_title", (Object[])new Object[]{class00392.y((String)this.group.getName()), GroupType.fromType(this.group.getType()).getTranslation()});
        class010542.N(this.field_22793, (class00392)class052162, this.guiLeft + this.xSize / 2 - this.field_22793.N((class05936)class052162) / 2, this.guiTop + 5, -12566464, false);
    }
}

