/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00912
 *  minecraft.class00947
 *  minecraft.class05237
 *  minecraft.class05247
 *  minecraft.class07948
 */
package minecraft;

import minecraft.class00912;
import minecraft.class00947;
import minecraft.class05237;
import minecraft.class05247;
import minecraft.class05840;
import minecraft.class05852;
import minecraft.class07948;

class class05861
implements class00947 {
    final int N;
    final int y;
    final float L;
    final float u;
    private final class05247 M;
    final int i;
    final /* synthetic */ class05852 R;

    class05861(class05852 class058522, float f, float f2, int n, int n2, float f3, int n3) {
        this.R = class058522;
        this.N = n;
        this.y = n2;
        this.M = class05247.N((float)(f3 / class058522.N));
        this.L = f / class058522.N;
        this.u = f2 / class058522.N;
        this.i = n3;
    }

    public class05247 N() {
        return this.M;
    }

    public class07948 N(class00912 class009122) {
        return class009122.N(this.M, (class05237)new class05840(this));
    }
}

