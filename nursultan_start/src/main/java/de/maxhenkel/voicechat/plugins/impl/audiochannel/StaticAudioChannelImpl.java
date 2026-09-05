/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.VoicechatConnection
 *  de.maxhenkel.voicechat.api.audiochannel.StaticAudioChannel
 *  de.maxhenkel.voicechat.api.packets.MicrophonePacket
 *  de.maxhenkel.voicechat.voice.common.GroupSoundPacket
 *  de.maxhenkel.voicechat.voice.server.ClientConnection
 *  de.maxhenkel.voicechat.voice.server.Group
 *  de.maxhenkel.voicechat.voice.server.Server
 *  de.maxhenkel.voicechat.voice.server.ServerGroupManager
 *  minecraft.class01062
 *  minecraft.class04770
 */
package de.maxhenkel.voicechat.plugins.impl.audiochannel;

import de.maxhenkel.voicechat.api.VoicechatConnection;
import de.maxhenkel.voicechat.api.audiochannel.StaticAudioChannel;
import de.maxhenkel.voicechat.api.packets.MicrophonePacket;
import de.maxhenkel.voicechat.plugins.impl.ServerPlayerImpl;
import de.maxhenkel.voicechat.plugins.impl.VoicechatServerApiImpl;
import de.maxhenkel.voicechat.plugins.impl.audiochannel.AudioChannelImpl;
import de.maxhenkel.voicechat.voice.common.GroupSoundPacket;
import de.maxhenkel.voicechat.voice.server.ClientConnection;
import de.maxhenkel.voicechat.voice.server.Group;
import de.maxhenkel.voicechat.voice.server.Server;
import de.maxhenkel.voicechat.voice.server.ServerGroupManager;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import minecraft.class01062;
import minecraft.class04770;

public class StaticAudioChannelImpl
extends AudioChannelImpl
implements StaticAudioChannel {
    protected boolean bypassGroupIsolation;
    protected final Set<UUID> targets = new HashSet<UUID>();

    public StaticAudioChannelImpl(UUID uUID, Server server) {
        super(uUID, server);
    }

    public void flush() {
        GroupSoundPacket groupSoundPacket = new GroupSoundPacket(this.channelId, this.channelId, new byte[0], this.sequenceNumber.getAndIncrement(), this.category);
        this.broadcast(groupSoundPacket);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void broadcast(GroupSoundPacket groupSoundPacket) {
        Set<UUID> set = this.targets;
        synchronized (set) {
            class01062 class010622 = this.server.getServer().Nm();
            ServerGroupManager serverGroupManager = this.server.getGroupManager();
            for (UUID uUID : this.targets) {
                Group group;
                class04770 class047702;
                ClientConnection clientConnection = this.server.getConnection(uUID);
                if (clientConnection == null || (class047702 = class010622.y(uUID)) == null || !this.bypassGroupIsolation && (group = serverGroupManager.getPlayerGroup(class047702)) != null && group.isIsolated() || this.filter != null && !this.filter.test(new ServerPlayerImpl(class047702))) continue;
                VoicechatServerApiImpl.sendPacket(class047702, groupSoundPacket);
            }
        }
    }

    public void send(MicrophonePacket microphonePacket) {
        this.send(microphonePacket.getOpusEncodedData());
    }

    public void send(byte[] byArray) {
        this.broadcast(new GroupSoundPacket(this.channelId, this.channelId, byArray, this.sequenceNumber.getAndIncrement(), this.category));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void addTarget(VoicechatConnection voicechatConnection) {
        Set<UUID> set = this.targets;
        synchronized (set) {
            this.targets.add(voicechatConnection.getPlayer().getUuid());
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void removeTarget(VoicechatConnection voicechatConnection) {
        Set<UUID> set = this.targets;
        synchronized (set) {
            this.targets.remove(voicechatConnection.getPlayer().getUuid());
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void clearTargets() {
        Set<UUID> set = this.targets;
        synchronized (set) {
            this.targets.clear();
        }
    }

    public boolean bypassesGroupIsolation() {
        return this.bypassGroupIsolation;
    }

    public void setBypassGroupIsolation(boolean bl) {
        this.bypassGroupIsolation = bl;
    }
}

