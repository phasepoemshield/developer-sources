/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import Nursultan.class11304;

public class class11291 {
    public void N(int n, byte[] byArray) {
        switch (n) {
            case 1: {
                new class11304().N(byArray);
                break;
            }
            default: {
                throw new IllegalStateException("Unsupported preset format: " + n);
            }
        }
    }
}

