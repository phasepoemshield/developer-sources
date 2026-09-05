/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.events.MergeClientSoundEvent
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.plugins.impl.events;

import de.maxhenkel.voicechat.api.events.MergeClientSoundEvent;
import de.maxhenkel.voicechat.plugins.impl.events.ClientEventImpl;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class MergeClientSoundEventImpl
extends ClientEventImpl
implements MergeClientSoundEvent {
    @Nullable
    private List<short[]> audioToMerge;

    @Override
    public boolean isCancellable() {
        return false;
    }

    @Nullable
    public List<short[]> getAudioToMerge() {
        return this.audioToMerge;
    }

    public void mergeAudio(short[] sArray) {
        if (this.audioToMerge == null) {
            this.audioToMerge = new ArrayList<short[]>();
        }
        this.audioToMerge.add(sArray);
    }
}

