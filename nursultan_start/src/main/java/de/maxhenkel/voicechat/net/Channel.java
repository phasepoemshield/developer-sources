/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 *  de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager
 *  javax.annotation.Nullable
 *  minecraft.class00392
 *  minecraft.class04770
 */
package de.maxhenkel.voicechat.net;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager;
import de.maxhenkel.voicechat.net.NetManager$ServerReceiver;
import de.maxhenkel.voicechat.net.Packet;
import javax.annotation.Nullable;
import minecraft.class00392;
import minecraft.class04770;

public class Channel<T extends Packet<T>> {
    @Nullable
    private NetManager$ServerReceiver<T> serverListener;

    public void onServerPacket(class04770 class047702, T t) {
        if (!Voicechat.SERVER.getRateLimiter().allow(class047702.method_5667())) {
            Voicechat.LOGGER.warn("Player {} exceeded packet rate limit", class047702.method_5477().getString());
            class047702.field_13987.method_52396((class00392)class00392.N((String)"disconnect.exceeded_packet_rate", (String)"Kicked for exceeding packet rate limit"));
            return;
        }
        CommonCompatibilityManager.INSTANCE.execute(class047702.method_51469().method_8503(), () -> {
            if (this.serverListener != null) {
                this.serverListener.onPacket(class047702, (Packet)t);
            }
        });
    }

    public void setServerListener(NetManager$ServerReceiver<T> netManager$ServerReceiver) {
        this.serverListener = netManager$ServerReceiver;
    }
}

