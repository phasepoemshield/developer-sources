/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.voice.common;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

public class AudioUtils {
    public static final int SAMPLE_RATE = 48000;
    public static final int FRAME_SIZE = 960;
    public static final int DEFAULT_MAX_PAYLOAD_SIZE = 1024;
    public static final double LOWEST_DB = -127.0;
    private static final float FLOAT_SHORT_SCALE = 32767.0f;
    private static final float FLOAT_SHORT_SCALING_FACTOR = 3.051851E-5f;
    private static final float FLOAT_CLIP = 32766.0f;

    public static byte[] shortsToBytes(short[] sArray) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(sArray.length * 2).order(ByteOrder.LITTLE_ENDIAN);
        for (short s : sArray) {
            byteBuffer.putShort(s);
        }
        return byteBuffer.array();
    }

    public static float[] bytesToFloats(byte[] byArray) {
        float[] fArray = new float[byArray.length / 2];
        for (int i = 0; i < byArray.length / 2; ++i) {
            if ((byArray[i * 2 + 1] & 0x80) != 0) {
                fArray[i] = Short.MIN_VALUE + ((byArray[i * 2 + 1] & 0x7F) << 8) | byArray[i * 2] & 0xFF;
                continue;
            }
            fArray[i] = byArray[i * 2 + 1] << 8 & 0xFF00 | byArray[i * 2] & 0xFF;
        }
        return fArray;
    }

    public static float[] shortsToFloats(short[] sArray) {
        float[] fArray = new float[sArray.length];
        for (int i = 0; i < sArray.length; ++i) {
            fArray[i] = Short.valueOf(sArray[i]).floatValue();
        }
        return fArray;
    }

    public static short[] combineAudio(Iterable<short[]> iterable) {
        short[] sArray = new short[960];
        for (int i = 0; i < sArray.length; ++i) {
            int n = 0;
            for (short[] sArray2 : iterable) {
                if (sArray2 == null) {
                    n += 0;
                    continue;
                }
                n += sArray2[i];
            }
            if (n > Short.MAX_VALUE) {
                sArray[i] = Short.MAX_VALUE;
                continue;
            }
            if (n < Short.MIN_VALUE) {
                sArray[i] = Short.MIN_VALUE;
                continue;
            }
            sArray[i] = (short)n;
        }
        return sArray;
    }

    public static boolean isAboveThreshold(short[] sArray, double d) {
        return AudioUtils.getHighestAudioLevel(sArray) > d;
    }

    public static short[] floatsToShorts(float[] fArray) {
        float f = -32768.0f;
        float f2 = 32767.0f;
        for (int i = 0; i < fArray.length; ++i) {
            if (fArray[i] > f) {
                f = fArray[i];
            }
            if (!(fArray[i] < f2)) continue;
            f2 = fArray[i];
        }
        float f3 = Math.min(1.0f, 32766.0f / Math.max(Math.abs(f), Math.abs(f2)));
        short[] sArray = new short[fArray.length];
        for (int i = 0; i < fArray.length; ++i) {
            sArray[i] = Float.valueOf(fArray[i] * f3).shortValue();
        }
        return sArray;
    }

    public static short[] bytesToShorts(byte[] byArray) {
        if (byArray.length % 2 != 0) {
            throw new IllegalArgumentException("Input bytes need to be divisible by 2");
        }
        ShortBuffer shortBuffer = ByteBuffer.wrap(byArray).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer();
        short[] sArray = new short[shortBuffer.remaining()];
        shortBuffer.get(sArray);
        return sArray;
    }

    public static byte[] floatsToBytes(float[] fArray) {
        byte[] byArray = new byte[fArray.length * 2];
        for (int i = 0; i < fArray.length; ++i) {
            short s = Float.valueOf(fArray[i]).shortValue();
            byArray[i * 2] = (byte)(s & 0xFF);
            byArray[i * 2 + 1] = (byte)((s & 0xFF00) >> 8);
        }
        return byArray;
    }

    public static double percToDb(double d) {
        d = Math.min(Math.max(d, 0.0), 1.0);
        return (1.0 - d) * -127.0;
    }

    public static double linearToDb(double d) {
        if (d < 0.001) {
            return -127.0;
        }
        return 20.0 * Math.log10(d);
    }

    public static double dbToPerc(double d) {
        d = Math.min(Math.max(d, -127.0), 0.0);
        return (d + Math.abs(-127.0)) / Math.abs(-127.0);
    }

    public static int dbSample(double d) {
        double d2 = 32768.0 * Math.pow(10.0, d / 20.0);
        long l = Math.round(d2);
        if (l < 0L) {
            return 0;
        }
        if (l > 32768L) {
            return 32768;
        }
        return (int)l;
    }

    public static double sampleDb(short s) {
        if (s == 0) {
            return -127.0;
        }
        int n = Math.abs(s);
        double d = (double)n / 32768.0;
        double d2 = 20.0 * Math.log10(d);
        if (!Double.isFinite(d2)) {
            return -127.0;
        }
        if (d2 > 0.0) {
            d2 = 0.0;
        }
        if (d2 < -127.0) {
            d2 = -127.0;
        }
        return d2;
    }

    public static double dbToLinear(double d) {
        return Math.pow(10.0, d / 20.0);
    }

    public static short[] stereoFloatsToMonoShortsNormalized(float[] fArray) {
        short[] sArray = new short[fArray.length / 2];
        for (int i = 0; i < fArray.length; i += 2) {
            sArray[i / 2] = (short)Math.max(Math.min((fArray[i] + fArray[i + 1]) / 2.0f * 32767.0f, 32766.0f), -32767.0f);
        }
        return sArray;
    }

    public static float[] shortsToFloatsNormalized(short[] sArray) {
        float[] fArray = new float[sArray.length];
        for (int i = 0; i < sArray.length; ++i) {
            fArray[i] = (float)sArray[i] * 3.051851E-5f;
        }
        return fArray;
    }

    public static short[] floatsToShortsNormalized(float[] fArray) {
        short[] sArray = new short[fArray.length];
        for (int i = 0; i < fArray.length; ++i) {
            sArray[i] = (short)Math.max(Math.min(fArray[i] * 32767.0f, 32766.0f), -32767.0f);
        }
        return sArray;
    }

    public static double getHighestAudioLevel(short[] sArray) {
        int n = 0;
        for (short s : sArray) {
            if (Math.abs(s) <= n) continue;
            n = (short)Math.abs(s);
        }
        return AudioUtils.sampleDb((short)n);
    }
}

