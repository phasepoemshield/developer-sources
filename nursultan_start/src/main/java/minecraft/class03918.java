/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00580
 *  minecraft.class00937
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class04452
 *  minecraft.class04654
 *  minecraft.class05096
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class05482
 *  minecraft.class07536
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Objects;
import minecraft.class00392;
import minecraft.class00580;
import minecraft.class00937;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class04452;
import minecraft.class04654;
import minecraft.class05096;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class05482;
import minecraft.class07536;
import org.jspecify.annotations.Nullable;

public class class03918
extends class05096 {
    private static final int N = 80;
    private static final int y = 120;
    private static final int L = 360;
    private final @Nullable class00392 u;
    private final class00392 i;
    private final Runnable R;
    private @Nullable class05482 M;
    private class05362 B;
    private int Z;

    protected class03918(class00392 class003922, @Nullable class00392 class003923, class00392 class003924, Runnable runnable, int n) {
        super(class003922);
        this.u = class003923;
        this.i = class003924;
        this.R = runnable;
        this.Z = n;
    }

    public static class03918 N(class00392 class003922, class00392 class003923, Runnable runnable) {
        return new class03918(class003922, null, class003923, runnable, 0);
    }

    public static class03918 N(class00392 class003922, class00392 class003923, class00392 class003924, Runnable runnable) {
        return new class03918(class003922, class003923, class003924, runnable, 20);
    }

    public void method_25426() {
        super.method_25426();
        if (this.u != null) {
            this.M = class05482.N((class01590)this.field_22793, (class00392)this.u, (int)360);
        }
        int n = 150;
        int n2 = 20;
        int n3 = Math.max(this.M != null ? this.M.N() : 1, 5);
        Objects.requireNonNull(this.field_22793);
        int n4 = n3 * 9;
        int n5 = Math.min(120 + n4, this.field_22790 - 40);
        this.B = (class05362)this.method_37063((class04654)class05362.method_46430((class00392)this.i, class053622 -> this.method_25419()).N((this.field_22789 - 150) / 2, n5, 150, 20).N());
    }

    public boolean method_25422() {
        return this.M != null && this.B.field_22763;
    }

    public void method_25393() {
        if (this.Z > 0) {
            --this.Z;
        }
        this.B.field_22763 = this.Z == 0;
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        class00580 class005802 = class010542.B();
        class010542.N(this.field_22793, this.field_22785, this.field_22789 / 2, 80, -1);
        if (this.M == null) {
            String string = class04452.N((long)class07536.L());
            class010542.N(this.field_22793, string, this.field_22789 / 2, 120, -6250336);
        } else {
            int n3 = this.field_22789 / 2;
            Objects.requireNonNull(this.field_22793);
            this.M.N(class00937.field_62010, n3, 120, 9, class005802);
        }
    }

    public void method_25419() {
        this.R.run();
    }

    public class00392 method_25435() {
        return class05220.N((class00392[])new class00392[]{this.field_22785, this.u != null ? this.u : class05220.N});
    }
}

