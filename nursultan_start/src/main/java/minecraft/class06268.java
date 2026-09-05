/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10568
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.bytes.ByteArrayList
 *  it.unimi.dsi.fastutil.bytes.ByteList
 *  it.unimi.dsi.fastutil.ints.IntSet
 *  minecraft.class00947
 *  minecraft.class03475
 *  minecraft.class06248
 *  minecraft.class06253
 *  minecraft.class06255
 *  minecraft.class06258
 *  minecraft.class06262
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import Nursultan.class10568;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.bytes.ByteArrayList;
import it.unimi.dsi.fastutil.bytes.ByteList;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.IntBuffer;
import minecraft.class00947;
import minecraft.class03475;
import minecraft.class06248;
import minecraft.class06253;
import minecraft.class06255;
import minecraft.class06258;
import minecraft.class06262;
import minecraft.class06267;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class06268
implements class06262 {
    static final Logger N = LogUtils.getLogger();
    private static final int L = 16;
    private static final int u = 2;
    private static final int i = 32;
    private static final int R = 64;
    private static final int M = 96;
    private static final int B = 128;
    private final class03475<class06248> Z;

    class06268(class03475<class06248> class034752) {
        this.Z = class034752;
    }

    static int N(int n, ByteList byteList, int n2) {
        return class06268.N(n, byteList.getByte(n2));
    }

    private static int N(int n, byte by) {
        return switch (by) {
            case 48 -> 0;
            case 49 -> 1;
            case 50 -> 2;
            case 51 -> 3;
            case 52 -> 4;
            case 53 -> 5;
            case 54 -> 6;
            case 55 -> 7;
            case 56 -> 8;
            case 57 -> 9;
            case 65 -> 10;
            case 66 -> 11;
            case 67 -> 12;
            case 68 -> 13;
            case 69 -> 14;
            case 70 -> 15;
            default -> throw new IllegalArgumentException("Invalid entry at line " + n + ": expected hex digit, got " + (char)by);
        };
    }

    private static boolean N(InputStream inputStream, ByteList byteList, int n) throws IOException {
        int n2;
        while ((n2 = inputStream.read()) != -1) {
            if (n2 == n) {
                return true;
            }
            byteList.add((byte)n2);
        }
        return false;
    }

    static void N(InputStream inputStream, class10568 class105682) throws IOException {
        int n = 0;
        ByteArrayList byteArrayList = new ByteArrayList(128);
        while (true) {
            int n2;
            boolean bl = class06268.N(inputStream, (ByteList)byteArrayList, 58);
            int n3 = byteArrayList.size();
            if (n3 == 0 && !bl) break;
            if (!bl || n3 != 4 && n3 != 5 && n3 != 6) {
                throw new IllegalArgumentException("Invalid entry at line " + n + ": expected 4, 5 or 6 hex digits followed by a colon");
            }
            int n4 = 0;
            for (n2 = 0; n2 < n3; ++n2) {
                n4 = n4 << 4 | class06268.N(n, byteArrayList.getByte(n2));
            }
            byteArrayList.clear();
            class06268.N(inputStream, (ByteList)byteArrayList, 10);
            n2 = byteArrayList.size();
            class06267 class062672 = switch (n2) {
                case 32 -> class06255.N((int)n, (ByteList)byteArrayList);
                case 64 -> class06258.N((int)n, (ByteList)byteArrayList);
                case 96 -> class06253.N((int)n, (ByteList)byteArrayList);
                case 128 -> class06253.y((int)n, (ByteList)byteArrayList);
                default -> throw new IllegalArgumentException("Invalid entry at line " + n + ": expected hex number describing (8,16,24,32) x 16 bitmap, followed by a new line");
            };
            class105682.accept(n4, class062672);
            ++n;
            byteArrayList.clear();
        }
    }

    public IntSet N() {
        return this.Z.y();
    }

    static void N(IntBuffer intBuffer, int n, int n2, int n3) {
        int n4 = 32 - n2 - 1;
        int n5 = 32 - n3 - 1;
        for (int i = n4; i >= n5; --i) {
            if (i >= 32 || i < 0) {
                intBuffer.put(0);
                continue;
            }
            boolean bl = (n >> i & 1) != 0;
            intBuffer.put(bl ? -1 : 0);
        }
    }

    static void N(IntBuffer intBuffer, class06267 class062672, int n, int n2) {
        for (int i = 0; i < 16; ++i) {
            int n3 = class062672.N(i);
            class06268.N(intBuffer, n3, n, n2);
        }
    }

    public @Nullable class00947 N(int n) {
        return (class00947)this.Z.N(n);
    }
}

