/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.voice.client.AudioChannel
 *  de.maxhenkel.voicechat.voice.client.ClientGroupManager
 *  de.maxhenkel.voicechat.voice.client.ClientManager
 *  de.maxhenkel.voicechat.voice.client.ClientPlayerStateManager
 *  de.maxhenkel.voicechat.voice.client.ClientVoicechat
 *  de.maxhenkel.voicechat.voice.client.KeyEvents
 *  de.maxhenkel.voicechat.voice.common.ClientGroup
 *  javax.annotation.Nullable
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class06202
 *  org.joml.Matrix3x2fStack
 */
package de.maxhenkel.voicechat.debug;

import de.maxhenkel.voicechat.debug.DebugOverlay$AudioChannelInfo;
import de.maxhenkel.voicechat.debug.DebugOverlay$TimerThread;
import de.maxhenkel.voicechat.gui.GroupType;
import de.maxhenkel.voicechat.intercompatibility.ClientCompatibilityManager;
import de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager;
import de.maxhenkel.voicechat.voice.client.AudioChannel;
import de.maxhenkel.voicechat.voice.client.ClientGroupManager;
import de.maxhenkel.voicechat.voice.client.ClientManager;
import de.maxhenkel.voicechat.voice.client.ClientPlayerStateManager;
import de.maxhenkel.voicechat.voice.client.ClientVoicechat;
import de.maxhenkel.voicechat.voice.client.KeyEvents;
import de.maxhenkel.voicechat.voice.common.ClientGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class06202;
import org.joml.Matrix3x2fStack;

public class DebugOverlay {
    private static final class06202 mc = class06202.Nq();
    private final Map<UUID, DebugOverlay$AudioChannelInfo> audioChannelInfoMap;
    private boolean active;
    @Nullable
    private DebugOverlay$TimerThread timer;
    private List<String> rightText = new ArrayList<String>();
    public static final int MAX_AUDIO_CHANNELS = 4;
    private static final int LEFT_PADDING = 5;

    public DebugOverlay() {
        this.audioChannelInfoMap = new LinkedHashMap<UUID, DebugOverlay$AudioChannelInfo>();
        ClientCompatibilityManager.INSTANCE.onRenderHUD(this::render);
    }

    private void addStateStrings(List<String> list) {
        ClientGroupManager clientGroupManager = ClientManager.getGroupManager();
        Collection collection = clientGroupManager.getGroups();
        ClientPlayerStateManager clientPlayerStateManager = ClientManager.getPlayerStateManager();
        ClientGroup clientGroup = clientPlayerStateManager.getGroup();
        list.add(String.format("Groups: %s", collection.size()));
        list.add(this.clientGroupToString(clientGroup));
        list.add(String.format("States: %s Disconnected: %s Disabled: %s Muted: %s", clientPlayerStateManager.getPlayerStates(true).size(), clientPlayerStateManager.isDisconnected(), clientPlayerStateManager.isDisabled(), clientPlayerStateManager.isMuted()));
    }

    void updateCache() {
        ClientVoicechat clientVoicechat = ClientManager.getClient();
        if (clientVoicechat == null) {
            this.audioChannelInfoMap.clear();
            return;
        }
        Map map = clientVoicechat.getAudioChannels();
        this.audioChannelInfoMap.values().removeIf(debugOverlay$AudioChannelInfo -> !map.containsKey(debugOverlay$AudioChannelInfo.id));
        for (Map.Entry entry : map.entrySet()) {
            AudioChannel audioChannel = (AudioChannel)entry.getValue();
            DebugOverlay$AudioChannelInfo debugOverlay$AudioChannelInfo2 = this.audioChannelInfoMap.computeIfAbsent((UUID)entry.getKey(), uUID -> new DebugOverlay$AudioChannelInfo((UUID)entry.getKey()));
            debugOverlay$AudioChannelInfo2.update(audioChannel);
        }
    }

    private void drawRight(class01054 class010542, List<String> list) {
        for (int i = 0; i < list.size(); ++i) {
            String string = list.get(i);
            if (string == null || string.isEmpty()) continue;
            class010542.i().pushMatrix();
            int n = ((class01590)DebugOverlay.mc.i_3).y(string);
            Matrix3x2fStack matrix3x2fStack = class010542.i();
            float f = mc.Nt().P() - n - 5;
            float f2 = i;
            Objects.requireNonNull((class01590)DebugOverlay.mc.i_3);
            matrix3x2fStack.translate(f, 25.0f + f2 * (9.0f + 1.0f));
            Objects.requireNonNull((class01590)DebugOverlay.mc.i_3);
            class010542.N(-1, -1, n, 9, -1873784752);
            class010542.N((class01590)DebugOverlay.mc.i_3, string, 0, 0, -1, false);
            class010542.i().popMatrix();
        }
    }

    private void render(class01054 class010542, float f) {
        if (!this.active) {
            return;
        }
        this.rightText.clear();
        this.rightText.add(String.format("%s %s debug overlay", CommonCompatibilityManager.INSTANCE.getModName(), CommonCompatibilityManager.INSTANCE.getModVersion()));
        this.rightText.add(String.format("Press ALT + %s to toggle", ClientCompatibilityManager.INSTANCE.getBoundKeyOf(KeyEvents.KEY_VOICE_CHAT).u().getString()));
        this.rightText.add(null);
        ClientVoicechat clientVoicechat = ClientManager.getClient();
        if (clientVoicechat == null) {
            this.rightText.add("Voice chat not running");
            this.drawRight(class010542, this.rightText);
            return;
        }
        this.rightText.add(String.format("UUID: %s", ClientManager.getPlayerStateManager().getOwnID()));
        this.rightText.add(null);
        this.addStateStrings(this.rightText);
        this.rightText.add(null);
        this.addAudioChannelStrings(this.rightText);
        this.drawRight(class010542, this.rightText);
    }

    private void addAudioChannelStrings(List<String> list) {
        list.add(String.format("Audio Channels: %s", this.audioChannelInfoMap.size()));
        ArrayList<Map.Entry<UUID, DebugOverlay$AudioChannelInfo>> arrayList = new ArrayList<Map.Entry<UUID, DebugOverlay$AudioChannelInfo>>(this.audioChannelInfoMap.entrySet());
        for (int i = 0; i < arrayList.size() && i < 4; ++i) {
            Map.Entry<UUID, DebugOverlay$AudioChannelInfo> entry = arrayList.get(i);
            DebugOverlay$AudioChannelInfo debugOverlay$AudioChannelInfo = entry.getValue();
            if (debugOverlay$AudioChannelInfo.audioBufferCount < 0) {
                list.add(String.format("ID: %s Packets: %s Reordering: %S Lost: %s Queue: STOPPED", entry.getKey().toString().substring(24), debugOverlay$AudioChannelInfo.bufferedPackets, debugOverlay$AudioChannelInfo.packetReorderingBuffer, debugOverlay$AudioChannelInfo.lostPackets));
                continue;
            }
            list.add(String.format("ID: %s Packets: %s Reordering: %S Lost: %s Queue: %s/%s", entry.getKey().toString().substring(24), debugOverlay$AudioChannelInfo.bufferedPackets, debugOverlay$AudioChannelInfo.packetReorderingBuffer, debugOverlay$AudioChannelInfo.lostPackets, debugOverlay$AudioChannelInfo.audioBufferCount, debugOverlay$AudioChannelInfo.audioBufferSize));
        }
        if (arrayList.size() > 4) {
            list.add(String.format("%s more channels", arrayList.size() - 4));
        }
    }

    private String clientGroupToString(ClientGroup clientGroup) {
        if (clientGroup == null) {
            return "Group: N/A";
        }
        return String.format("Group: %s Name: %s Password: %s Persistent: %s Type: %s", clientGroup.getId().toString().substring(24), clientGroup.getName(), clientGroup.hasPassword(), clientGroup.isPersistent(), GroupType.fromType(clientGroup.getType()).name());
    }

    public void toggle() {
        boolean bl = this.active = !this.active;
        if (this.active) {
            this.audioChannelInfoMap.clear();
            this.timer = new DebugOverlay$TimerThread(this);
        } else {
            if (this.timer != null) {
                this.timer.close();
            }
            this.audioChannelInfoMap.clear();
        }
    }
}

