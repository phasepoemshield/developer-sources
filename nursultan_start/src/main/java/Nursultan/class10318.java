/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04157
 *  minecraft.class07321
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Consumer;
import minecraft.class04157;
import minecraft.class07321;

public final class class10318
extends Record
implements class04157 {
    private final class07321 center;
    private final int viewDistance;

    public int L() {
        return this.center.B + this.viewDistance + 1;
    }

    public class10318(class07321 class073212, int n) {
        this.center = class073212;
        this.viewDistance = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class10318.class, "center;viewDistance", "center", "viewDistance"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class10318.class, "center;viewDistance", "center", "viewDistance"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class10318.class, "center;viewDistance", "center", "viewDistance"}, this);
    }

    public class07321 i() {
        return this.center;
    }

    public int u() {
        return this.center.Z + this.viewDistance + 1;
    }

    public int y() {
        return this.center.Z - this.viewDistance - 1;
    }

    public int N() {
        return this.center.B - this.viewDistance - 1;
    }

    public boolean N(class10318 class103182) {
        return this.N() <= class103182.L() && this.L() >= class103182.N() && this.y() <= class103182.u() && this.u() >= class103182.y();
    }

    public boolean N(int n, int n2, boolean bl) {
        return class04157.N((int)this.center.B, (int)this.center.Z, (int)this.viewDistance, (int)n, (int)n2, (boolean)bl);
    }

    public void N(Consumer<class07321> consumer) {
        for (int i = this.N(); i <= this.L(); ++i) {
            for (int j = this.y(); j <= this.u(); ++j) {
                if (!this.N(i, j)) continue;
                consumer.accept(new class07321(i, j));
            }
        }
    }

    public int R() {
        return this.viewDistance;
    }
}

