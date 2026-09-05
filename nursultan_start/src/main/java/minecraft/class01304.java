/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00580
 *  minecraft.class00937
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class04654
 *  minecraft.class04995
 *  minecraft.class05096
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class05482
 */
package minecraft;

import java.util.Objects;
import minecraft.class00392;
import minecraft.class00580;
import minecraft.class00937;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class04654;
import minecraft.class04995;
import minecraft.class05096;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class05482;

public class class01304
extends class05096 {
    private static final int N = 90;
    private final class00392 y;
    private class05482 L = class05482.N;
    private final Runnable u;
    private final class00392 i;
    private final boolean R;

    public class01304(Runnable runnable, class00392 class003922, class00392 class003923) {
        this(runnable, class003922, class003923, class05220.U, true);
    }

    public class01304(Runnable runnable, class00392 class003922, class00392 class003923, class00392 class003924, boolean bl) {
        super(class003922);
        this.u = runnable;
        this.y = class003923;
        this.i = class003924;
        this.R = bl;
    }

    public void method_25426() {
        super.method_25426();
        this.L = class05482.N((class01590)this.field_22793, (class00392)this.y, (int)(this.field_22789 - 50));
        int n = this.L.N();
        Objects.requireNonNull(this.field_22793);
        int n2 = n * 9;
        int n3 = class04995.N((int)(90 + n2 + 12), (int)(this.field_22790 / 6 + 96), (int)(this.field_22790 - 24));
        int n4 = 150;
        this.method_37063((class04654)class05362.method_46430((class00392)this.i, class053622 -> this.u.run()).N((this.field_22789 - 150) / 2, n3, 150, 20).N());
    }

    public boolean method_25422() {
        return this.R;
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        class00580 class005802 = class010542.B();
        class010542.N(this.field_22793, this.field_22785, this.field_22789 / 2, 70, -1);
        int n3 = this.field_22789 / 2;
        Objects.requireNonNull(this.field_22793);
        this.L.N(class00937.field_62010, n3, 90, 9, class005802);
    }

    public class00392 method_25435() {
        return class05220.N((class00392[])new class00392[]{super.method_25435(), this.y});
    }
}

