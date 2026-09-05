/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  minecraft.class06889
 */
package de.maxhenkel.voicechat.voice.client.speaker;

import de.maxhenkel.voicechat.voice.client.speaker.SpeakerException;
import javax.annotation.Nullable;
import minecraft.class06889;

public interface Speaker {
    public void close();

    public void open() throws SpeakerException;

    public void play(short[] var1, float var2, @Nullable class06889 var3, @Nullable String var4, float var5);

    default public void play(short[] sArray, float f, @Nullable String string) {
        this.play(sArray, f, null, string, 0.0f);
    }
}

