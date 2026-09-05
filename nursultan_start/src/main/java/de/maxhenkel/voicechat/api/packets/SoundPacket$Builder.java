/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.api.packets;

import de.maxhenkel.voicechat.api.packets.SoundPacket;
import java.util.UUID;
import javax.annotation.Nullable;

public interface SoundPacket$Builder<T extends SoundPacket$Builder<T, P>, P extends SoundPacket> {
    public P build();

    public T category(@Nullable String var1);

    public T channelId(UUID var1);

    public T opusEncodedData(byte[] var1);
}

