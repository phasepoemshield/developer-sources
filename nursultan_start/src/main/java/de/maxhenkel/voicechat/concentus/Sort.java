/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.Inlines
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.Inlines;

class Sort {
    Sort() {
    }

    static void silk_insertion_sort_increasing(int[] nArray, int[] nArray2, int n, int n2) {
        int n3;
        int n4;
        int n5;
        Inlines.OpusAssert((n2 > 0 ? 1 : 0) != 0);
        Inlines.OpusAssert((n > 0 ? 1 : 0) != 0);
        Inlines.OpusAssert((n >= n2 ? 1 : 0) != 0);
        for (n5 = 0; n5 < n2; ++n5) {
            nArray2[n5] = n5;
        }
        n5 = 1;
        while (n5 < n2) {
            n4 = nArray[n5];
            for (n3 = n5 - 1; n3 >= 0 && n4 < nArray[n3]; --n3) {
                nArray[n3 + 1] = nArray[n3];
                nArray2[n3 + 1] = nArray2[n3];
            }
            nArray[n3 + 1] = n4;
            nArray2[n3 + 1] = n5++;
        }
        for (n5 = n2; n5 < n; ++n5) {
            n4 = nArray[n5];
            if (n4 >= nArray[n2 - 1]) continue;
            for (n3 = n2 - 2; n3 >= 0 && n4 < nArray[n3]; --n3) {
                nArray[n3 + 1] = nArray[n3];
                nArray2[n3 + 1] = nArray2[n3];
            }
            nArray[n3 + 1] = n4;
            nArray2[n3 + 1] = n5;
        }
    }

    static void silk_insertion_sort_decreasing_int16(short[] sArray, int[] nArray, int n, int n2) {
        int n3;
        short s;
        int n4;
        Inlines.OpusAssert((n2 > 0 ? 1 : 0) != 0);
        Inlines.OpusAssert((n > 0 ? 1 : 0) != 0);
        Inlines.OpusAssert((n >= n2 ? 1 : 0) != 0);
        for (n4 = 0; n4 < n2; ++n4) {
            nArray[n4] = n4;
        }
        n4 = 1;
        while (n4 < n2) {
            s = sArray[n4];
            for (n3 = n4 - 1; n3 >= 0 && s > sArray[n3]; --n3) {
                sArray[n3 + 1] = sArray[n3];
                nArray[n3 + 1] = nArray[n3];
            }
            sArray[n3 + 1] = s;
            nArray[n3 + 1] = n4++;
        }
        for (n4 = n2; n4 < n; ++n4) {
            s = sArray[n4];
            if (s <= sArray[n2 - 1]) continue;
            for (n3 = n2 - 2; n3 >= 0 && s > sArray[n3]; --n3) {
                sArray[n3 + 1] = sArray[n3];
                nArray[n3 + 1] = nArray[n3];
            }
            sArray[n3 + 1] = s;
            nArray[n3 + 1] = n4;
        }
    }

    static void silk_insertion_sort_increasing_all_values_int16(short[] sArray, int n) {
        Inlines.OpusAssert((n > 0 ? 1 : 0) != 0);
        for (int i = 1; i < n; ++i) {
            short s = sArray[i];
            for (int j = i - 1; j >= 0 && s < sArray[j]; --j) {
                sArray[j + 1] = sArray[j];
            }
            sArray[j + 1] = s;
        }
    }
}

