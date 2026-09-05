/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.context.CommandContext
 *  de.maxhenkel.voicechat.voice.server.PingManager$PingListener
 *  minecraft.class00392
 *  minecraft.class07701
 */
package de.maxhenkel.voicechat.command;

import com.mojang.brigadier.context.CommandContext;
import de.maxhenkel.voicechat.voice.server.PingManager;
import minecraft.class00392;
import minecraft.class07701;

class VoicechatCommands$1
implements PingManager.PingListener {
    final /* synthetic */ CommandContext val$commandSource;

    VoicechatCommands$1(CommandContext commandContext) {
        this.val$commandSource = commandContext;
    }

    public void onPong(int n, long l) {
        if (n <= 1) {
            ((class07701)this.val$commandSource.getSource()).N(() -> class00392.N((String)"message.voicechat.ping_received", (Object[])new Object[]{l}), false);
        } else {
            ((class07701)this.val$commandSource.getSource()).N(() -> class00392.N((String)"message.voicechat.ping_received_attempt", (Object[])new Object[]{l, n}), false);
        }
    }

    public void onTimeout(int n) {
        ((class07701)this.val$commandSource.getSource()).N(() -> class00392.N((String)"message.voicechat.ping_timed_out", (Object[])new Object[]{n}), false);
    }

    public void onFailedAttempt(int n) {
        ((class07701)this.val$commandSource.getSource()).N(() -> class00392.L((String)"message.voicechat.ping_retry"), false);
    }
}

