/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.Channel
 */
package de.maxhenkel.voicechat.mixin;

import io.netty.channel.Channel;

public interface ConnectionAccessor {
    public Channel getChannel();
}

