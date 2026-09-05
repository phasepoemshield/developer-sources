/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.audio.AudioConverter
 *  de.maxhenkel.voicechat.voice.common.AudioUtils
 */
package de.maxhenkel.voicechat.plugins.impl.audio;

import de.maxhenkel.voicechat.api.audio.AudioConverter;
import de.maxhenkel.voicechat.voice.common.AudioUtils;

public class AudioConverterImpl
implements AudioConverter {
    public byte[] shortsToBytes(short[] sArray) {
        return AudioUtils.shortsToBytes((short[])sArray);
    }

    public float[] bytesToFloats(byte[] byArray) {
        return AudioUtils.bytesToFloats((byte[])byArray);
    }

    public float[] shortsToFloats(short[] sArray) {
        return AudioUtils.shortsToFloats((short[])sArray);
    }

    public short[] floatsToShorts(float[] fArray) {
        return AudioUtils.floatsToShorts((float[])fArray);
    }

    public short[] bytesToShorts(byte[] byArray) {
        return AudioUtils.bytesToShorts((byte[])byArray);
    }

    public byte[] floatsToBytes(float[] fArray) {
        return AudioUtils.floatsToBytes((float[])fArray);
    }
}

