/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09693
 */
package Nursultan;

import Nursultan.class09693;

public final class class09794 {
    private static final float N = 0.25f;
    private static final float y = 8.0f;
    private float L = 1.0f;
    private int u;

    public int y() {
        return this.u;
    }

    public float N() {
        return this.L;
    }

    public void N(float f) {
        float f2 = class09693.N((float)f, (float)0.25f, (float)8.0f);
        if (Float.floatToIntBits(this.L) == Float.floatToIntBits(f2)) {
            return;
        }
        this.L = f2;
        ++this.u;
    }
}

