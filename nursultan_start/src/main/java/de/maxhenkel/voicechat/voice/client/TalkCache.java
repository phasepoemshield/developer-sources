/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  minecraft.class07049
 */
package de.maxhenkel.voicechat.voice.client;

import de.maxhenkel.voicechat.voice.client.ClientManager;
import de.maxhenkel.voicechat.voice.client.ClientVoicechat;
import de.maxhenkel.voicechat.voice.client.TalkCache$CategoryCache;
import de.maxhenkel.voicechat.voice.client.TalkCache$PlayerCache;
import de.maxhenkel.voicechat.voice.common.AudioUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import minecraft.class07049;

public class TalkCache {
    private static final long TIMEOUT = 250L;
    private static final TalkCache$PlayerCache DEFAULT = new TalkCache$PlayerCache(0L, false, -127.0);
    private final Map<UUID, TalkCache$PlayerCache> playerCache = new HashMap<UUID, TalkCache$PlayerCache>();
    private final Map<String, TalkCache$CategoryCache> categoryCache = new HashMap<String, TalkCache$CategoryCache>();
    private Supplier<Long> timestampSupplier = System::currentTimeMillis;

    public double getCategoryAudioLevel(String string) {
        TalkCache$CategoryCache talkCache$CategoryCache = this.categoryCache.get(string);
        if (talkCache$CategoryCache == null) {
            return -127.0;
        }
        if (this.timestampSupplier.get() - talkCache$CategoryCache.timestamp >= 250L) {
            return -127.0;
        }
        return talkCache$CategoryCache.audioLevel;
    }

    public double getPlayerAudioLevel(UUID uUID) {
        TalkCache$PlayerCache talkCache$PlayerCache = this.playerCache.getOrDefault(uUID, DEFAULT);
        if (this.timestampSupplier.get() - talkCache$PlayerCache.timestamp >= 250L) {
            return -127.0;
        }
        return talkCache$PlayerCache.audioLevel;
    }

    public void updateCategoryVolume(String string, double d) {
        TalkCache$CategoryCache talkCache$CategoryCache = this.categoryCache.get(string);
        if (talkCache$CategoryCache == null) {
            talkCache$CategoryCache = new TalkCache$CategoryCache(this.timestampSupplier.get(), d);
            this.categoryCache.put(string, talkCache$CategoryCache);
        } else {
            talkCache$CategoryCache.timestamp = this.timestampSupplier.get();
            talkCache$CategoryCache.audioLevel = d;
        }
    }

    public void setTimestampSupplier(Supplier<Long> supplier) {
        this.timestampSupplier = supplier;
    }

    public boolean isWhispering(UUID uUID) {
        Object object;
        if (uUID.equals(ClientManager.getPlayerStateManager().getOwnID()) && (object = ClientManager.getClient()) != null && ((ClientVoicechat)object).getMicThread() != null && ((ClientVoicechat)object).getMicThread().isWhispering()) {
            return true;
        }
        object = this.playerCache.getOrDefault(uUID, DEFAULT);
        return ((TalkCache$PlayerCache)object).whispering && this.timestampSupplier.get() - ((TalkCache$PlayerCache)object).timestamp < 250L;
    }

    public boolean isWhispering(class07049 class070492) {
        return this.isWhispering(class070492.method_5667());
    }

    public boolean isTalking(UUID uUID) {
        Object object;
        if (uUID.equals(ClientManager.getPlayerStateManager().getOwnID()) && (object = ClientManager.getClient()) != null && ((ClientVoicechat)object).getMicThread() != null && ((ClientVoicechat)object).getMicThread().isTalking()) {
            return true;
        }
        object = this.playerCache.getOrDefault(uUID, DEFAULT);
        return this.timestampSupplier.get() - ((TalkCache$PlayerCache)object).timestamp < 250L;
    }

    public boolean isTalking(class07049 class070492) {
        return this.isTalking(class070492.method_5667());
    }

    @Deprecated
    public void updateTalking(UUID uUID, boolean bl) {
        this.updateTalking(uUID, bl, -127.0);
    }

    private void updateTalking(UUID uUID, boolean bl, double d) {
        TalkCache$PlayerCache talkCache$PlayerCache = this.playerCache.get(uUID);
        if (talkCache$PlayerCache == null) {
            talkCache$PlayerCache = new TalkCache$PlayerCache(this.timestampSupplier.get(), bl, d);
            this.playerCache.put(uUID, talkCache$PlayerCache);
        } else {
            talkCache$PlayerCache.timestamp = this.timestampSupplier.get();
            talkCache$PlayerCache.whispering = bl;
            talkCache$PlayerCache.audioLevel = d;
        }
    }

    public void updateLevel(UUID uUID, @Nullable String string, boolean bl, short[] sArray) {
        double d = AudioUtils.getHighestAudioLevel(sArray);
        if (string != null) {
            this.updateCategoryVolume(string, d);
        }
        this.updateTalking(uUID, bl, d);
    }
}

