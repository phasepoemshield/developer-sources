/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00072
 *  minecraft.class04949
 *  minecraft.class04981
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00072;
import minecraft.class04949;
import minecraft.class04981;
import minecraft.class05099;
import minecraft.class05110;
import org.jspecify.annotations.Nullable;

public class class05119 {
    final String N;
    final String y;
    final class04949 L;
    final long u;
    final @Nullable String i;
    public final boolean R;
    public final boolean M;
    public final class05110 B;
    public final boolean Z;
    public final boolean z;

    public class05119(class04981 class049812, int n) {
        boolean bl = this.M = n == 4;
        if (this.M) {
            this.N = class05099.i.getString();
            this.u = class049812.j;
            this.i = class049812.v;
            this.R = class049812.j == -1;
            this.y = "";
            this.L = class04949.field_46697;
            this.Z = false;
            this.z = class049812.z();
        } else {
            class00072 class000722 = (class00072)class049812.z.get(n);
            this.N = class000722.y.N(n);
            this.u = class000722.y.M;
            this.i = class000722.y.B;
            this.R = class000722.y.Z;
            this.y = class000722.y.i;
            this.L = class000722.y.R;
            this.Z = class000722.y();
            this.z = class049812.T == n && !class049812.z();
        }
        this.B = class05099.N(this.z, this.R, class049812.U);
    }
}

