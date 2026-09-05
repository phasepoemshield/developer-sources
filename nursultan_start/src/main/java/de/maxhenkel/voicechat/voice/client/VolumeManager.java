/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.voice.client;

import de.maxhenkel.voicechat.voice.common.AudioUtils;
import java.util.Arrays;

public class VolumeManager {
    public static final double MIN_GAIN = -40.0;
    public static final double MAX_GAIN = 24.0;
    private static final short MAX_AMPLIFICATION = 32766;
    private final double[] maxVolumes = new double[50];
    private int index;

    public VolumeManager() {
        Arrays.fill(this.maxVolumes, -1.0);
    }

    private static double getMaximumMultiplier(short[] sArray, double d) {
        short s = 0;
        for (short s2 : sArray) {
            short s3 = s2 <= Short.MIN_VALUE ? (short)Math.abs(s2 + 1) : (short)Math.abs(s2);
            if (s3 <= s) continue;
            s = s3;
        }
        if (s == 0) {
            return d;
        }
        return Math.min(d, 32766.0 / (double)s);
    }

    public void adjustVolume(short[] sArray, double d) {
        int n;
        double d2 = d <= -40.0 ? 0.0 : AudioUtils.dbToLinear(d);
        this.maxVolumes[this.index] = VolumeManager.getMaximumMultiplier(sArray, d2);
        this.index = (this.index + 1) % this.maxVolumes.length;
        double d3 = -1.0;
        double[] dArray = this.maxVolumes;
        int n2 = dArray.length;
        for (n = 0; n < n2; ++n) {
            double d4 = dArray[n];
            if (d4 < 0.0) continue;
            if (d3 < 0.0) {
                d3 = d4;
                continue;
            }
            if (!(d4 < d3)) continue;
            d3 = d4;
        }
        double d5 = Math.min(d3, d2);
        for (n = 0; n < sArray.length; ++n) {
            sArray[n] = (short)((double)sArray[n] * d5);
        }
    }
}

