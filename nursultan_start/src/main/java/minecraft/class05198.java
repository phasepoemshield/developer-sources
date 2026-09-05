/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00405
 */
package minecraft;

import minecraft.class00405;
import minecraft.class05197;
import minecraft.class05228;

class class05198
implements class05197 {
    private final float y;
    private int L = -1;
    private class00405 u = class00405.N;
    private boolean i;
    private float R;
    private int M = -1;
    private class00405 B = class00405.N;
    private int Z;
    private int z;
    final /* synthetic */ class05228 N;

    private boolean L() {
        return this.L != -1;
    }

    public class05198(class05228 class052282, float f) {
        this.N = class052282;
        this.y = Math.max(f, 1.0f);
    }

    @Override
    public boolean accept(int n, class00405 class004052, int n2) {
        int n3 = n + this.z;
        switch (n2) {
            case 10: {
                return this.N(n3, class004052);
            }
            case 32: {
                this.M = n3;
                this.B = class004052;
            }
        }
        float f = this.N.N.getWidth(n2, class004052);
        this.R += f;
        if (this.i && this.R > this.y) {
            if (this.M != -1) {
                return this.N(this.M, this.B);
            }
            return this.N(n3, class004052);
        }
        this.i |= f != 0.0f;
        this.Z = n3 + Character.charCount(n2);
        return true;
    }

    public class00405 y() {
        return this.u;
    }

    public void N(int n) {
        this.z += n;
    }

    public int N() {
        return this.L() ? this.L : this.Z;
    }

    private boolean N(int n, class00405 class004052) {
        this.L = n;
        this.u = class004052;
        return false;
    }
}

