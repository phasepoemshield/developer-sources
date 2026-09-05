/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.concentus;

class Downmix {
    Downmix() {
    }

    static void downmix_int(short[] sArray, int n, int[] nArray, int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8;
        for (n8 = 0; n8 < n3; ++n8) {
            nArray[n8 + n2] = sArray[(n8 + n4) * n7 + n5];
        }
        if (n6 > -1) {
            for (n8 = 0; n8 < n3; ++n8) {
                int n9 = n8 + n2;
                nArray[n9] = nArray[n9] + sArray[(n8 + n4) * n7 + n6];
            }
        } else if (n6 == -2) {
            for (int i = 1; i < n7; ++i) {
                for (n8 = 0; n8 < n3; ++n8) {
                    int n10 = n8 + n2;
                    nArray[n10] = nArray[n10] + sArray[(n8 + n4) * n7 + i];
                }
            }
        }
        int n11 = 4096;
        n11 = n7 == -2 ? (n11 /= n7) : (n11 /= 2);
        for (n8 = 0; n8 < n3; ++n8) {
            int n12 = n8 + n2;
            nArray[n12] = nArray[n12] * n11;
        }
    }
}

