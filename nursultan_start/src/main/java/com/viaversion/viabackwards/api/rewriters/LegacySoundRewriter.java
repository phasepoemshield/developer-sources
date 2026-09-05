/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.rewriter.RewriterBase
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectMap
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectMap$Entry
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectOpenHashMap
 */
package com.viaversion.viabackwards.api.rewriters;

import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viaversion.api.rewriter.RewriterBase;
import com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectMap;
import com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectOpenHashMap;

@Deprecated
public abstract class LegacySoundRewriter<T extends BackwardsProtocol<?, ?, ?, ?>>
extends RewriterBase<T> {
    protected final Int2ObjectMap<SoundData> soundRewrites = new Int2ObjectOpenHashMap(64);

    protected LegacySoundRewriter(T protocol) {
        super(protocol);
    }

    public SoundData added(int id, int replacement, float newPitch) {
        SoundData data = new SoundData(replacement, true, newPitch, true);
        this.soundRewrites.put(id, (Object)data);
        return data;
    }

    public SoundData added(int id, int replacement) {
        return this.added(id, replacement, -1.0f);
    }

    public SoundData removed(int id) {
        SoundData data = new SoundData(-1, false, -1.0f, false);
        this.soundRewrites.put(id, (Object)data);
        return data;
    }

    public float handlePitch(int soundId) {
        SoundData data = (SoundData)((Object)this.soundRewrites.get(soundId));
        return data != null ? data.newPitch() : 1.0f;
    }

    public int handleSounds(int soundId) {
        int newSoundId = soundId;
        SoundData data = (SoundData)((Object)this.soundRewrites.get(soundId));
        if (data != null) {
            return data.replacementSound();
        }
        for (Int2ObjectMap.Entry entry : this.soundRewrites.int2ObjectEntrySet()) {
            if (soundId <= entry.getIntKey()) continue;
            if (((SoundData)((Object)entry.getValue())).added()) {
                --newSoundId;
                continue;
            }
            ++newSoundId;
        }
        return newSoundId;
    }

    public boolean hasPitch(int soundId) {
        SoundData data = (SoundData)((Object)this.soundRewrites.get(soundId));
        return data != null && data.changePitch();
    }

    public record SoundData(int replacementSound, boolean changePitch, float newPitch, boolean added) {
    }
}

