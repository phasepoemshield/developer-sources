/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntArrayFIFOQueue
 *  minecraft.class03509
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07536
 */
package minecraft;

import it.unimi.dsi.fastutil.ints.IntArrayFIFOQueue;
import java.util.BitSet;
import java.util.EnumSet;
import java.util.Set;
import minecraft.class03476;
import minecraft.class03509;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07536;

public class class03503 {
    private static final int N = 4;
    private static final int y = 16;
    private static final int L = 15;
    private static final int u = 4096;
    private static final int i = 0;
    private static final int R = 4;
    private static final int M = 8;
    private static final int B = (int)Math.pow(16.0, 0.0);
    private static final int Z = (int)Math.pow(16.0, 1.0);
    private static final int z = (int)Math.pow(16.0, 2.0);
    private static final int U = -1;
    private static final class07211[] E = class07211.values();
    private final BitSet W = new BitSet(4096);
    private static final int[] m = (int[])class07536.N((Object)new int[1352], nArray -> {
        boolean bl = false;
        int n = 15;
        int n2 = 0;
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                for (int k = 0; k < 16; ++k) {
                    if (i != 0 && i != 15 && j != 0 && j != 15 && k != 0 && k != 15) continue;
                    nArray[n2++] = class03503.N(i, j, k);
                }
            }
        }
    });
    private int P = 4096;

    private static int y(class07209 class072092) {
        return class03503.N(class072092.method_10263() & 0xF, class072092.method_10264() & 0xF, class072092.method_10260() & 0xF);
    }

    private void N(int n, Set<class07211> set) {
        int n2 = n >> 0 & 0xF;
        if (n2 == 0) {
            set.add(class07211.field_11039);
        } else if (n2 == 15) {
            set.add(class07211.field_11034);
        }
        int n3 = n >> 8 & 0xF;
        if (n3 == 0) {
            set.add(class07211.field_11033);
        } else if (n3 == 15) {
            set.add(class07211.field_11036);
        }
        int n4 = n >> 4 & 0xF;
        if (n4 == 0) {
            set.add(class07211.field_11043);
        } else if (n4 == 15) {
            set.add(class07211.field_11035);
        }
    }

    private int N(int n, class07211 class072112) {
        switch (class03509.N[class072112.ordinal()]) {
            case 1: {
                if ((n >> 8 & 0xF) == 0) {
                    return -1;
                }
                return n - z;
            }
            case 2: {
                if ((n >> 8 & 0xF) == 15) {
                    return -1;
                }
                return n + z;
            }
            case 3: {
                if ((n >> 4 & 0xF) == 0) {
                    return -1;
                }
                return n - Z;
            }
            case 4: {
                if ((n >> 4 & 0xF) == 15) {
                    return -1;
                }
                return n + Z;
            }
            case 5: {
                if ((n >> 0 & 0xF) == 0) {
                    return -1;
                }
                return n - B;
            }
            case 6: {
                if ((n >> 0 & 0xF) == 15) {
                    return -1;
                }
                return n + B;
            }
        }
        return -1;
    }

    private Set<class07211> N(int n) {
        EnumSet<class07211> var2 = EnumSet.noneOf(class07211.class);
        IntArrayFIFOQueue intArrayFIFOQueue = new IntArrayFIFOQueue();
        intArrayFIFOQueue.enqueue(n);
        this.W.set(n, true);
        while (!intArrayFIFOQueue.isEmpty()) {
            int n2 = intArrayFIFOQueue.dequeueInt();
            this.N(n2, var2);
            for (class07211 class072112 : E) {
                int n3 = this.N(n2, class072112);
                if (n3 < 0 || this.W.get(n3)) continue;
                this.W.set(n3, true);
                intArrayFIFOQueue.enqueue(n3);
            }
        }
        return var2;
    }

    public void N(class07209 class072092) {
        this.W.set(class03503.y(class072092), true);
        --this.P;
    }

    public class03476 N() {
        class03476 class034762 = new class03476();
        if (4096 - this.P < 256) {
            class034762.N(true);
        } else if (this.P == 0) {
            class034762.N(false);
        } else {
            for (int n : m) {
                if (this.W.get(n)) continue;
                class034762.N(this.N(n));
            }
        }
        return class034762;
    }

    private static int N(int n, int n2, int n3) {
        return n << 0 | n2 << 8 | n3 << 4;
    }
}

