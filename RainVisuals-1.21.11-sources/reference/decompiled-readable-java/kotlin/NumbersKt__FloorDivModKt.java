/*
 * Decompiled with CFR 0.152.
 */
package kotlin;

import kotlin.Metadata;
import kotlin.NumbersKt__BigIntegersKt;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.internal.IntrinsicConstEvaluation;

@Metadata(mv={1, 9, 0}, k=5, xi=49, d1={"\u0000*\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\n\n\u0002\b\u0010\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\u001a\u001c\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u00a2\u0006\u0004\b\u0003\u0010\u0004\u001a\u001c\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\u0087\b\u00a2\u0006\u0004\b\u0003\u0010\u0005\u001a\u001c\u0010\u0003\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0006H\u0087\b\u00a2\u0006\u0004\b\u0003\u0010\u0007\u001a\u001c\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\bH\u0087\b\u00a2\u0006\u0004\b\u0003\u0010\t\u001a\u001c\u0010\u0003\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u00a2\u0006\u0004\b\u0003\u0010\n\u001a\u001c\u0010\u0003\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0002H\u0087\b\u00a2\u0006\u0004\b\u0003\u0010\u000b\u001a\u001c\u0010\u0003\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0006H\u0087\b\u00a2\u0006\u0004\b\u0003\u0010\f\u001a\u001c\u0010\u0003\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0001\u001a\u00020\bH\u0087\b\u00a2\u0006\u0004\b\u0003\u0010\r\u001a\u001c\u0010\u0003\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u00a2\u0006\u0004\b\u0003\u0010\u000e\u001a\u001c\u0010\u0003\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0002H\u0087\b\u00a2\u0006\u0004\b\u0003\u0010\u000f\u001a\u001c\u0010\u0003\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0006H\u0087\b\u00a2\u0006\u0004\b\u0003\u0010\u0010\u001a\u001c\u0010\u0003\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0001\u001a\u00020\bH\u0087\b\u00a2\u0006\u0004\b\u0003\u0010\u0011\u001a\u001c\u0010\u0003\u001a\u00020\u0002*\u00020\b2\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u00a2\u0006\u0004\b\u0003\u0010\u0012\u001a\u001c\u0010\u0003\u001a\u00020\u0002*\u00020\b2\u0006\u0010\u0001\u001a\u00020\u0002H\u0087\b\u00a2\u0006\u0004\b\u0003\u0010\u0013\u001a\u001c\u0010\u0003\u001a\u00020\u0006*\u00020\b2\u0006\u0010\u0001\u001a\u00020\u0006H\u0087\b\u00a2\u0006\u0004\b\u0003\u0010\u0014\u001a\u001c\u0010\u0003\u001a\u00020\u0002*\u00020\b2\u0006\u0010\u0001\u001a\u00020\bH\u0087\b\u00a2\u0006\u0004\b\u0003\u0010\u0015\u001a\u001c\u0010\u0016\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u00a2\u0006\u0004\b\u0016\u0010\u0017\u001a\u001c\u0010\u0016\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\u0087\b\u00a2\u0006\u0004\b\u0016\u0010\u0005\u001a\u001c\u0010\u0016\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0006H\u0087\b\u00a2\u0006\u0004\b\u0016\u0010\u0007\u001a\u001c\u0010\u0016\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\bH\u0087\b\u00a2\u0006\u0004\b\u0016\u0010\u0018\u001a\u001c\u0010\u0016\u001a\u00020\u0019*\u00020\u00192\u0006\u0010\u0001\u001a\u00020\u0019H\u0087\b\u00a2\u0006\u0004\b\u0016\u0010\u001a\u001a\u001c\u0010\u0016\u001a\u00020\u0019*\u00020\u00192\u0006\u0010\u0001\u001a\u00020\u001bH\u0087\b\u00a2\u0006\u0004\b\u0016\u0010\u001c\u001a\u001c\u0010\u0016\u001a\u00020\u0019*\u00020\u001b2\u0006\u0010\u0001\u001a\u00020\u0019H\u0087\b\u00a2\u0006\u0004\b\u0016\u0010\u001d\u001a\u001c\u0010\u0016\u001a\u00020\u001b*\u00020\u001b2\u0006\u0010\u0001\u001a\u00020\u001bH\u0087\b\u00a2\u0006\u0004\b\u0016\u0010\u001e\u001a\u001c\u0010\u0016\u001a\u00020\u0000*\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u00a2\u0006\u0004\b\u0016\u0010\u001f\u001a\u001c\u0010\u0016\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0002H\u0087\b\u00a2\u0006\u0004\b\u0016\u0010\u000b\u001a\u001c\u0010\u0016\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0006H\u0087\b\u00a2\u0006\u0004\b\u0016\u0010\f\u001a\u001c\u0010\u0016\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0001\u001a\u00020\bH\u0087\b\u00a2\u0006\u0004\b\u0016\u0010 \u001a\u001c\u0010\u0016\u001a\u00020\u0000*\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u00a2\u0006\u0004\b\u0016\u0010!\u001a\u001c\u0010\u0016\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0002H\u0087\b\u00a2\u0006\u0004\b\u0016\u0010\"\u001a\u001c\u0010\u0016\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0006H\u0087\b\u00a2\u0006\u0004\b\u0016\u0010\u0010\u001a\u001c\u0010\u0016\u001a\u00020\b*\u00020\u00062\u0006\u0010\u0001\u001a\u00020\bH\u0087\b\u00a2\u0006\u0004\b\u0016\u0010#\u001a\u001c\u0010\u0016\u001a\u00020\u0000*\u00020\b2\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u00a2\u0006\u0004\b\u0016\u0010$\u001a\u001c\u0010\u0016\u001a\u00020\u0002*\u00020\b2\u0006\u0010\u0001\u001a\u00020\u0002H\u0087\b\u00a2\u0006\u0004\b\u0016\u0010\u0013\u001a\u001c\u0010\u0016\u001a\u00020\u0006*\u00020\b2\u0006\u0010\u0001\u001a\u00020\u0006H\u0087\b\u00a2\u0006\u0004\b\u0016\u0010\u0014\u001a\u001c\u0010\u0016\u001a\u00020\b*\u00020\b2\u0006\u0010\u0001\u001a\u00020\bH\u0087\b\u00a2\u0006\u0004\b\u0016\u0010%\u00a8\u0006&"}, d2={"", "other", "", "floorDiv", "(BB)I", "(BI)I", "", "(BJ)J", "", "(BS)I", "(IB)I", "(II)I", "(IJ)J", "(IS)I", "(JB)J", "(JI)J", "(JJ)J", "(JS)J", "(SB)I", "(SI)I", "(SJ)J", "(SS)I", "mod", "(BB)B", "(BS)S", "", "(DD)D", "", "(DF)D", "(FD)D", "(FF)F", "(IB)B", "(IS)S", "(JB)B", "(JI)I", "(JS)S", "(SB)B", "(SS)S", "kotlin-stdlib"}, xs="kotlin/NumbersKt")
class NumbersKt__FloorDivModKt
extends NumbersKt__BigIntegersKt {
    @InlineOnly
    @SinceKotlin(version="1.5")
    @IntrinsicConstEvaluation
    private static final long mod(byte $this$mod, long other) {
        long l = (long)$this$mod % other;
        return l + (other & ((l ^ other) & (l | -l)) >> 63);
    }

    @InlineOnly
    @SinceKotlin(version="1.5")
    @IntrinsicConstEvaluation
    private static final int floorDiv(byte $this$floorDiv, int other) {
        byte by = $this$floorDiv;
        int n = by / other;
        if ((by ^ other) < 0) {
            if (n * other != by) {
                --n;
            }
        }
        return n;
    }

    @SinceKotlin(version="1.5")
    @InlineOnly
    @IntrinsicConstEvaluation
    private static final int floorDiv(int $this$floorDiv, short other) {
        int n = $this$floorDiv;
        short s = other;
        int n2 = n / s;
        if ((n ^ s) < 0) {
            if (n2 * s != n) {
                --n2;
            }
        }
        return n2;
    }

    @IntrinsicConstEvaluation
    @InlineOnly
    @SinceKotlin(version="1.5")
    private static final long floorDiv(byte $this$floorDiv, long other) {
        long l = $this$floorDiv;
        long l2 = l / other;
        if ((l ^ other) < 0L && l2 * other != l) {
            l2 += -1L;
        }
        return l2;
    }

    @SinceKotlin(version="1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int floorDiv(short $this$floorDiv, byte other) {
        short s = $this$floorDiv;
        byte by = other;
        int n = s / by;
        if ((s ^ by) < 0) {
            if (n * by != s) {
                --n;
            }
        }
        return n;
    }

    @IntrinsicConstEvaluation
    @InlineOnly
    @SinceKotlin(version="1.5")
    private static final byte mod(short $this$mod, byte other) {
        short s = $this$mod;
        byte by = other;
        int n = s % by;
        return (byte)(n + (by & ((n ^ by) & (n | -n)) >> 31));
    }

    @IntrinsicConstEvaluation
    @SinceKotlin(version="1.5")
    @InlineOnly
    private static final short mod(byte $this$mod, short other) {
        byte by = $this$mod;
        short s = other;
        int n = by % s;
        return (short)(n + (s & ((n ^ s) & (n | -n)) >> 31));
    }

    @InlineOnly
    @IntrinsicConstEvaluation
    @SinceKotlin(version="1.5")
    private static final long mod(int $this$mod, long other) {
        long l = (long)$this$mod % other;
        return l + (other & ((l ^ other) & (l | -l)) >> 63);
    }

    /*
     * Enabled aggressive block sorting
     */
    @SinceKotlin(version="1.5")
    @InlineOnly
    @IntrinsicConstEvaluation
    private static final double mod(float $this$mod, double other) {
        double d;
        double d2 = (double)$this$mod % other;
        if (!(d2 == 0.0)) {
            if (!(Math.signum(d2) == Math.signum(other))) {
                d = d2 + other;
                return d;
            }
        }
        d = d2;
        return d;
    }

    @SinceKotlin(version="1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int mod(long $this$mod, int other) {
        long l = $this$mod;
        long l2 = other;
        long l3 = l % l2;
        return (int)(l3 + (l2 & ((l3 ^ l2) & (l3 | -l3)) >> 63));
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @SinceKotlin(version="1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final double mod(double $this$mod, double other) {
        void var4_2;
        double d;
        double r = $this$mod % other;
        if (!(r == 0.0)) {
            if (!(Math.signum(r) == Math.signum(other))) {
                d = r + other;
                return d;
            }
        }
        d = var4_2;
        return d;
    }

    /*
     * WARNING - void declaration
     */
    @IntrinsicConstEvaluation
    @SinceKotlin(version="1.5")
    @InlineOnly
    private static final int floorDiv(int $this$floorDiv, int other) {
        void var2_2;
        int q = $this$floorDiv / other;
        if (($this$floorDiv ^ other) < 0) {
            if (q * other != $this$floorDiv) {
                --q;
            }
        }
        return (int)var2_2;
    }

    @IntrinsicConstEvaluation
    @InlineOnly
    @SinceKotlin(version="1.5")
    private static final byte mod(byte $this$mod, byte other) {
        byte by = $this$mod;
        byte by2 = other;
        int n = by % by2;
        return (byte)(n + (by2 & ((n ^ by2) & (n | -n)) >> 31));
    }

    /*
     * Enabled aggressive block sorting
     */
    @InlineOnly
    @SinceKotlin(version="1.5")
    @IntrinsicConstEvaluation
    private static final double mod(double $this$mod, float other) {
        double d;
        double d2 = $this$mod;
        double d3 = other;
        double d4 = d2 % d3;
        if (!(d4 == 0.0)) {
            if (!(Math.signum(d4) == Math.signum(d3))) {
                d = d4 + d3;
                return d;
            }
        }
        d = d4;
        return d;
    }

    @InlineOnly
    @IntrinsicConstEvaluation
    @SinceKotlin(version="1.5")
    private static final byte mod(long $this$mod, byte other) {
        long l = $this$mod;
        long l2 = other;
        long l3 = l % l2;
        return (byte)(l3 + (l2 & ((l3 ^ l2) & (l3 | -l3)) >> 63));
    }

    @IntrinsicConstEvaluation
    @SinceKotlin(version="1.5")
    @InlineOnly
    private static final int mod(int $this$mod, int other) {
        int r = $this$mod % other;
        return r + (other & ((r ^ other) & (r | -r)) >> 31);
    }

    @InlineOnly
    @IntrinsicConstEvaluation
    @SinceKotlin(version="1.5")
    private static final long floorDiv(long $this$floorDiv, short other) {
        long l = $this$floorDiv;
        long l2 = other;
        long l3 = l / l2;
        if ((l ^ l2) < 0L && l3 * l2 != l) {
            l3 += -1L;
        }
        return l3;
    }

    @IntrinsicConstEvaluation
    @InlineOnly
    @SinceKotlin(version="1.5")
    private static final int mod(short $this$mod, int other) {
        int n = $this$mod % other;
        return n + (other & ((n ^ other) & (n | -n)) >> 31);
    }

    @SinceKotlin(version="1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long mod(short $this$mod, long other) {
        long l = (long)$this$mod % other;
        return l + (other & ((l ^ other) & (l | -l)) >> 63);
    }

    @IntrinsicConstEvaluation
    @InlineOnly
    @SinceKotlin(version="1.5")
    private static final int floorDiv(int $this$floorDiv, byte other) {
        int n = $this$floorDiv;
        byte by = other;
        int n2 = n / by;
        if ((n ^ by) < 0) {
            if (n2 * by != n) {
                --n2;
            }
        }
        return n2;
    }

    @InlineOnly
    @SinceKotlin(version="1.5")
    @IntrinsicConstEvaluation
    private static final int floorDiv(short $this$floorDiv, int other) {
        short s = $this$floorDiv;
        int n = s / other;
        if ((s ^ other) < 0) {
            if (n * other != s) {
                --n;
            }
        }
        return n;
    }

    @IntrinsicConstEvaluation
    @SinceKotlin(version="1.5")
    @InlineOnly
    private static final int floorDiv(byte $this$floorDiv, byte other) {
        byte by = $this$floorDiv;
        byte by2 = other;
        int n = by / by2;
        if ((by ^ by2) < 0) {
            if (n * by2 != by) {
                --n;
            }
        }
        return n;
    }

    @SinceKotlin(version="1.5")
    @InlineOnly
    @IntrinsicConstEvaluation
    private static final int floorDiv(short $this$floorDiv, short other) {
        short s = $this$floorDiv;
        short s2 = other;
        int n = s / s2;
        if ((s ^ s2) < 0) {
            if (n * s2 != s) {
                --n;
            }
        }
        return n;
    }

    @SinceKotlin(version="1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long floorDiv(long $this$floorDiv, long other) {
        long q = $this$floorDiv / other;
        if (($this$floorDiv ^ other) < 0L && q * other != $this$floorDiv) {
            long l = q;
            q = l + -1L;
        }
        return q;
    }

    @IntrinsicConstEvaluation
    @SinceKotlin(version="1.5")
    @InlineOnly
    private static final long floorDiv(short $this$floorDiv, long other) {
        long l = $this$floorDiv;
        long l2 = l / other;
        if ((l ^ other) < 0L && l2 * other != l) {
            l2 += -1L;
        }
        return l2;
    }

    @IntrinsicConstEvaluation
    @SinceKotlin(version="1.5")
    @InlineOnly
    private static final long mod(long $this$mod, long other) {
        long r = $this$mod % other;
        return r + (other & ((r ^ other) & (r | -r)) >> 63);
    }

    @InlineOnly
    @SinceKotlin(version="1.5")
    @IntrinsicConstEvaluation
    private static final long floorDiv(long $this$floorDiv, int other) {
        long l = $this$floorDiv;
        long l2 = other;
        long l3 = l / l2;
        if ((l ^ l2) < 0L && l3 * l2 != l) {
            l3 += -1L;
        }
        return l3;
    }

    @InlineOnly
    @SinceKotlin(version="1.5")
    @IntrinsicConstEvaluation
    private static final short mod(int $this$mod, short other) {
        int n = $this$mod;
        short s = other;
        int n2 = n % s;
        return (short)(n2 + (s & ((n2 ^ s) & (n2 | -n2)) >> 31));
    }

    @IntrinsicConstEvaluation
    @InlineOnly
    @SinceKotlin(version="1.5")
    private static final byte mod(int $this$mod, byte other) {
        int n = $this$mod;
        byte by = other;
        int n2 = n % by;
        return (byte)(n2 + (by & ((n2 ^ by) & (n2 | -n2)) >> 31));
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @IntrinsicConstEvaluation
    @InlineOnly
    @SinceKotlin(version="1.5")
    private static final float mod(float $this$mod, float other) {
        void var2_2;
        float f;
        float r = $this$mod % other;
        if (!(r == 0.0f)) {
            if (!(Math.signum(r) == Math.signum(other))) {
                f = r + other;
                return f;
            }
        }
        f = var2_2;
        return f;
    }

    @SinceKotlin(version="1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final short mod(long $this$mod, short other) {
        long l = $this$mod;
        long l2 = other;
        long l3 = l % l2;
        return (short)(l3 + (l2 & ((l3 ^ l2) & (l3 | -l3)) >> 63));
    }

    @InlineOnly
    @SinceKotlin(version="1.5")
    @IntrinsicConstEvaluation
    private static final short mod(short $this$mod, short other) {
        short s = $this$mod;
        short s2 = other;
        int n = s % s2;
        return (short)(n + (s2 & ((n ^ s2) & (n | -n)) >> 31));
    }

    @IntrinsicConstEvaluation
    @SinceKotlin(version="1.5")
    @InlineOnly
    private static final long floorDiv(long $this$floorDiv, byte other) {
        long l = $this$floorDiv;
        long l2 = other;
        long l3 = l / l2;
        if ((l ^ l2) < 0L && l3 * l2 != l) {
            l3 += -1L;
        }
        return l3;
    }

    @SinceKotlin(version="1.5")
    @InlineOnly
    @IntrinsicConstEvaluation
    private static final int floorDiv(byte $this$floorDiv, short other) {
        byte by = $this$floorDiv;
        short s = other;
        int n = by / s;
        if ((by ^ s) < 0) {
            if (n * s != by) {
                --n;
            }
        }
        return n;
    }

    @SinceKotlin(version="1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long floorDiv(int $this$floorDiv, long other) {
        long l = $this$floorDiv;
        long l2 = l / other;
        if ((l ^ other) < 0L && l2 * other != l) {
            l2 += -1L;
        }
        return l2;
    }

    @SinceKotlin(version="1.5")
    @InlineOnly
    @IntrinsicConstEvaluation
    private static final int mod(byte $this$mod, int other) {
        int n = $this$mod % other;
        return n + (other & ((n ^ other) & (n | -n)) >> 31);
    }
}

