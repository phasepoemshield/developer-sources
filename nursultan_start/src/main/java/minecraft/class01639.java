/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03345
 *  minecraft.class07211
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class03345;
import minecraft.class07211;
import org.jspecify.annotations.Nullable;

public class class01639 {
    public final class03345 N;
    private byte u;
    byte y;
    public final int L;

    class01639(class03345 class033452, @Nullable class07211 class072112, int n) {
        this.N = class033452;
        if (class072112 != null) {
            this.y(class072112);
        }
        this.L = n;
    }

    public boolean equals(Object object) {
        if (!(object instanceof class01639)) {
            return false;
        }
        class01639 class016392 = (class01639)object;
        return this.N.M() == class016392.N.M();
    }

    public int hashCode() {
        return Long.hashCode(this.N.M());
    }

    void y(class07211 class072112) {
        this.u = (byte)(this.u | (this.u | 1 << class072112.ordinal()));
    }

    boolean N() {
        return this.u != 0;
    }

    public boolean N(int n) {
        return (this.u & 1 << n) > 0;
    }

    void N(byte by, class07211 class072112) {
        this.y = (byte)(this.y | (by | 1 << class072112.ordinal()));
    }

    boolean N(class07211 class072112) {
        return (this.y & 1 << class072112.ordinal()) > 0;
    }
}

