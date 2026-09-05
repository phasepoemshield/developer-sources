/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09458
 *  com.google.common.collect.ImmutableList
 *  minecraft.class00390
 *  minecraft.class00392
 *  minecraft.class00580
 *  minecraft.class00937
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class04654
 *  minecraft.class05096
 *  minecraft.class05220
 *  minecraft.class05361
 *  minecraft.class05362
 *  minecraft.class05482
 *  minecraft.class05936
 */
package minecraft;

import Nursultan.class09458;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Objects;
import minecraft.class00390;
import minecraft.class00392;
import minecraft.class00580;
import minecraft.class00937;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class04654;
import minecraft.class05096;
import minecraft.class05220;
import minecraft.class05361;
import minecraft.class05362;
import minecraft.class05482;
import minecraft.class05936;

public class class01274
extends class05096 {
    private static final int N = 20;
    private static final int y = 5;
    private static final int L = 20;
    private final class00392 u;
    private final List<class00392> i;
    private final ImmutableList<class09458> R;
    private class05482 M = class05482.N;
    private int B;
    private int Z;

    protected class01274(class00392 class003922, List<class00392> list, ImmutableList<class09458> immutableList) {
        super(class003922);
        this.i = list;
        this.u = class05220.N((class00392[])new class00392[]{class003922, class00390.N(list, (class00392)class05220.N)});
        this.R = immutableList;
    }

    public void method_25426() {
        for (class09458 class094582 : this.R) {
            this.Z = Math.max(this.Z, 20 + this.field_22793.N((class05936)class094582.N) + 20);
        }
        int n = 5 + this.Z + 5;
        int n2 = n * this.R.size();
        this.M = class05482.N((class01590)this.field_22793, (int)n2, (class00392[])this.i.toArray(new class00392[0]));
        int n3 = this.M.N();
        Objects.requireNonNull(this.field_22793);
        int n4 = n3 * 9;
        this.B = (int)((double)this.field_22790 / 2.0 - (double)n4 / 2.0);
        Objects.requireNonNull(this.field_22793);
        int n5 = this.B + n4 + 18;
        int n6 = (int)((double)this.field_22789 / 2.0 - (double)n2 / 2.0);
        for (class09458 class094583 : this.R) {
            this.method_37063((class04654)class05362.method_46430((class00392)class094583.N, (class05361)class094583.y).N(n6, n5, this.Z, 20).N());
            n6 += n;
        }
    }

    public boolean method_25422() {
        return false;
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        class00580 class005802 = class010542.B();
        int n3 = this.field_22789 / 2;
        Objects.requireNonNull(this.field_22793);
        class010542.N(this.field_22793, this.field_22785, n3, this.B - 18, -1);
        int n4 = this.field_22789 / 2;
        Objects.requireNonNull(this.field_22793);
        this.M.N(class00937.field_62010, n4, this.B, 9, class005802);
    }

    public class00392 method_25435() {
        return this.u;
    }
}

