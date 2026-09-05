/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.packets.MicrophonePacket
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.api.audiochannel;

import de.maxhenkel.voicechat.api.ServerPlayer;
import de.maxhenkel.voicechat.api.packets.MicrophonePacket;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface AudioChannel {
    public void setFilter(Predicate<ServerPlayer> var1);

    public void setCategory(@Nullable String var1);

    @Nullable
    public String getCategory();

    public void flush();

    public UUID getId();

    public void send(byte[] var1);

    public void send(MicrophonePacket var1);

    public boolean isClosed();
}

