/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.VoicechatClient
 *  de.maxhenkel.voicechat.configbuilder.entry.ConfigEntry
 *  de.maxhenkel.voicechat.voice.client.AudioRecorder
 *  de.maxhenkel.voicechat.voice.client.ClientManager
 *  de.maxhenkel.voicechat.voice.client.ClientPlayerStateManager
 *  de.maxhenkel.voicechat.voice.client.ClientVoicechat
 *  de.maxhenkel.voicechat.voice.client.KeyEvents
 *  de.maxhenkel.voicechat.voice.common.ClientGroup
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class04141
 *  minecraft.class04654
 *  minecraft.class05096
 *  minecraft.class05216
 *  minecraft.class05362
 *  minecraft.class05936
 *  minecraft.class06541
 *  minecraft.class06601
 *  minecraft.class08394
 */
package de.maxhenkel.voicechat.gui;

import de.maxhenkel.voicechat.VoicechatClient;
import de.maxhenkel.voicechat.configbuilder.entry.ConfigEntry;
import de.maxhenkel.voicechat.gui.VoiceChatScreenBase;
import de.maxhenkel.voicechat.gui.VoiceChatScreenBase$HoverArea;
import de.maxhenkel.voicechat.gui.VoiceChatSettingsScreen;
import de.maxhenkel.voicechat.gui.group.GroupScreen;
import de.maxhenkel.voicechat.gui.group.JoinGroupScreen;
import de.maxhenkel.voicechat.gui.tooltips.DisableTooltipSupplier;
import de.maxhenkel.voicechat.gui.tooltips.HideTooltipSupplier;
import de.maxhenkel.voicechat.gui.tooltips.MuteTooltipSupplier;
import de.maxhenkel.voicechat.gui.tooltips.RecordingTooltipSupplier;
import de.maxhenkel.voicechat.gui.volume.AdjustVolumesScreen;
import de.maxhenkel.voicechat.gui.widgets.ImageButton;
import de.maxhenkel.voicechat.gui.widgets.ToggleImageButton;
import de.maxhenkel.voicechat.intercompatibility.ClientCompatibilityManager;
import de.maxhenkel.voicechat.voice.client.AudioRecorder;
import de.maxhenkel.voicechat.voice.client.ClientManager;
import de.maxhenkel.voicechat.voice.client.ClientPlayerStateManager;
import de.maxhenkel.voicechat.voice.client.ClientVoicechat;
import de.maxhenkel.voicechat.voice.client.KeyEvents;
import de.maxhenkel.voicechat.voice.common.ClientGroup;
import java.util.Objects;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01894;
import minecraft.class04141;
import minecraft.class04654;
import minecraft.class05096;
import minecraft.class05216;
import minecraft.class05362;
import minecraft.class05936;
import minecraft.class06541;
import minecraft.class06601;
import minecraft.class08394;

public class VoiceChatScreen
extends VoiceChatScreenBase {
    private static final class01894 TEXTURE = class01894.N((String)"voicechat", (String)"textures/gui/gui_voicechat.png");
    private static final class01894 MICROPHONE = class01894.N((String)"voicechat", (String)"icons/microphone_button");
    private static final class01894 HIDE = class01894.N((String)"voicechat", (String)"icons/hide_button");
    private static final class01894 VOLUMES = class01894.N((String)"voicechat", (String)"icons/adjust_volumes");
    private static final class01894 SPEAKER = class01894.N((String)"voicechat", (String)"icons/speaker_button");
    private static final class01894 RECORD = class01894.N((String)"voicechat", (String)"icons/record_button");
    private static final class00392 TITLE = class00392.L((String)"gui.voicechat.voice_chat.title");
    private static final class00392 SETTINGS = class00392.L((String)"message.voicechat.settings");
    private static final class00392 GROUP = class00392.L((String)"message.voicechat.group");
    public static final class00392 ADJUST_PLAYER_VOLUMES = class00392.L((String)"message.voicechat.adjust_volumes");
    private ToggleImageButton mute;
    private ToggleImageButton disable;
    private VoiceChatScreenBase$HoverArea recordingHoverArea;
    private ClientPlayerStateManager stateManager = ClientManager.getPlayerStateManager();

    public VoiceChatScreen() {
        super(TITLE, 195, 76);
    }

    @Override
    public void method_25426() {
        ToggleImageButton toggleImageButton;
        super.method_25426();
        ClientVoicechat clientVoicechat = ClientManager.getClient();
        this.mute = new ToggleImageButton(this.guiLeft + 6, this.guiTop + this.ySize - 6 - 20, MICROPHONE, () -> ((ClientPlayerStateManager)this.stateManager).isMuted(), imageButton -> this.stateManager.setMuted(!this.stateManager.isMuted()), new MuteTooltipSupplier(this, this.stateManager));
        this.method_37063((class04654)this.mute);
        this.disable = new ToggleImageButton(this.guiLeft + 6 + 20 + 2, this.guiTop + this.ySize - 6 - 20, SPEAKER, () -> ((ClientPlayerStateManager)this.stateManager).isDisabled(), imageButton -> this.stateManager.setDisabled(!this.stateManager.isDisabled()), new DisableTooltipSupplier(this, this.stateManager));
        this.method_37063((class04654)this.disable);
        ImageButton imageButton2 = new ImageButton(this.guiLeft + 6 + 20 + 2 + 20 + 2, this.guiTop + this.ySize - 6 - 20, VOLUMES, imageButton -> this.field_22787.N((class05096)new AdjustVolumesScreen()));
        imageButton2.method_47400(class04141.N((class00392)ADJUST_PLAYER_VOLUMES));
        this.method_37063((class04654)imageButton2);
        if (clientVoicechat != null && ((Boolean)VoicechatClient.CLIENT_CONFIG.useNatives.get()).booleanValue() && (clientVoicechat.getRecorder() != null || clientVoicechat.getConnection() != null && clientVoicechat.getConnection().getData().allowRecording())) {
            toggleImageButton = new ToggleImageButton(this.guiLeft + this.xSize - 6 - 20 - 2 - 20, this.guiTop + this.ySize - 6 - 20, RECORD, () -> ClientManager.getClient() != null && ClientManager.getClient().getRecorder() != null, imageButton -> this.toggleRecording(), new RecordingTooltipSupplier(this));
            this.method_37063((class04654)toggleImageButton);
        }
        toggleImageButton = new ToggleImageButton(this.guiLeft + this.xSize - 6 - 20, this.guiTop + this.ySize - 6 - 20, HIDE, () -> ((ConfigEntry)VoicechatClient.CLIENT_CONFIG.hideIcons).get(), imageButton -> VoicechatClient.CLIENT_CONFIG.hideIcons.set((Object)((Boolean)VoicechatClient.CLIENT_CONFIG.hideIcons.get() == false ? 1 : 0)).save(), new HideTooltipSupplier(this));
        this.method_37063((class04654)toggleImageButton);
        class05362 class053623 = class05362.method_46430((class00392)SETTINGS, class053622 -> this.field_22787.N((class05096)new VoiceChatSettingsScreen())).N(this.guiLeft + 6, this.guiTop + 6 + 15, 75, 20).N();
        this.method_37063((class04654)class053623);
        class05362 class053624 = class05362.method_46430((class00392)GROUP, class053622 -> {
            ClientGroup clientGroup = this.stateManager.getGroup();
            if (clientGroup != null) {
                this.field_22787.N((class05096)new GroupScreen(clientGroup));
            } else {
                this.field_22787.N((class05096)new JoinGroupScreen());
            }
        }).N(this.guiLeft + this.xSize - 6 - 75 + 1, this.guiTop + 6 + 15, 75, 20).N();
        this.method_37063((class04654)class053624);
        class053624.field_22763 = clientVoicechat != null && clientVoicechat.getConnection() != null && clientVoicechat.getConnection().getData().groupsEnabled();
        this.recordingHoverArea = new VoiceChatScreenBase$HoverArea(72, this.ySize - 6 - 20, this.xSize - 122, 20);
        this.checkButtons();
    }

    public boolean method_25404(class06601 class066012) {
        if (class066012.v() == ClientCompatibilityManager.INSTANCE.getBoundKeyOf(KeyEvents.KEY_VOICE_CHAT).y()) {
            this.field_22787.N(null);
            return true;
        }
        return super.method_25404(class066012);
    }

    public void method_25393() {
        super.method_25393();
        this.checkButtons();
    }

    @Override
    public void method_25420(class01054 class010542, int n, int n2, float f) {
        class010542.N(class08394.Na, TEXTURE, this.guiLeft, this.guiTop, 0.0f, 0.0f, this.xSize, this.ySize, 256, 256);
    }

    private void checkButtons() {
        this.mute.field_22763 = MuteTooltipSupplier.canMuteMic();
        this.disable.field_22763 = this.stateManager.canEnable();
    }

    @Override
    public void renderForeground(class01054 class010542, int n, int n2, float f) {
        int n3 = this.field_22793.N((class05936)TITLE);
        class010542.N(this.field_22793, TITLE, this.guiLeft + (this.xSize - n3) / 2, this.guiTop + 7, -12566464, false);
        ClientVoicechat clientVoicechat = ClientManager.getClient();
        if (clientVoicechat != null && clientVoicechat.getRecorder() != null) {
            AudioRecorder audioRecorder = clientVoicechat.getRecorder();
            class05216 class052162 = class00392.y((String)audioRecorder.getDuration());
            class05216 class052163 = class052162.N(class06541.field_1079);
            int n4 = this.guiLeft + this.recordingHoverArea.getPosX() + this.recordingHoverArea.getWidth() / 2 - this.field_22793.N((class05936)class052162) / 2;
            int n5 = this.guiTop + this.recordingHoverArea.getPosY() + this.recordingHoverArea.getHeight() / 2;
            Objects.requireNonNull(this.field_22793);
            class010542.N(this.field_22793, (class00392)class052163, n4, n5 - 9 / 2, -16777216, false);
            if (this.recordingHoverArea.isHovered(this.guiLeft, this.guiTop, n, n2)) {
                class010542.N(this.field_22793, (class00392)class00392.N((String)"message.voicechat.storage_size", (Object[])new Object[]{audioRecorder.getStorage()}), n, n2);
            }
        }
    }

    private void toggleRecording() {
        ClientVoicechat clientVoicechat = ClientManager.getClient();
        if (clientVoicechat == null) {
            return;
        }
        clientVoicechat.toggleRecording();
    }
}

