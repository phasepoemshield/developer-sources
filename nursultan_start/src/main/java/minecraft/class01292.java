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
 *  minecraft.class05096
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class05482
 *  minecraft.class05725
 *  minecraft.class06601
 */
package minecraft;

import java.util.Objects;
import minecraft.class00392;
import minecraft.class00580;
import minecraft.class00937;
import minecraft.class01054;
import minecraft.class01318;
import minecraft.class01590;
import minecraft.class04654;
import minecraft.class05096;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class05482;
import minecraft.class05725;
import minecraft.class06601;

public class class01292
extends class05096 {
    private static final class00392 i = class00392.L((String)"selectWorld.backupJoinSkipButton");
    public static final class00392 N = class00392.L((String)"selectWorld.backupJoinConfirmButton");
    private final Runnable R;
    protected final class01318 y;
    private final class00392 M;
    private final boolean B;
    private class05482 Z = class05482.N;
    final class00392 L;
    protected int u;
    private class05725 z;

    public class01292(Runnable runnable, class01318 class013182, class00392 class003922, class00392 class003923, boolean bl) {
        this(runnable, class013182, class003922, class003923, N, bl);
    }

    public class01292(Runnable runnable, class01318 class013182, class00392 class003922, class00392 class003923, class00392 class003924, boolean bl) {
        super(class003922);
        this.R = runnable;
        this.y = class013182;
        this.M = class003923;
        this.B = bl;
        this.L = class003924;
    }

    public void method_25426() {
        super.method_25426();
        this.Z = class05482.N((class01590)this.field_22793, (class00392)this.M, (int)(this.field_22789 - 50));
        int n = this.Z.N() + 1;
        Objects.requireNonNull(this.field_22793);
        int n2 = n * 9;
        this.z = class05725.y((class00392)class00392.L((String)"selectWorld.backupEraseCache").y(-2039584), (class01590)this.field_22793).N(this.field_22789 / 2 - 155 + 80, 76 + n2).N();
        if (this.B) {
            this.method_37063((class04654)this.z);
        }
        this.method_37063((class04654)class05362.method_46430((class00392)this.L, class053622 -> this.y.proceed(true, this.z.y())).N(this.field_22789 / 2 - 155, 100 + n2, 150, 20).N());
        this.method_37063((class04654)class05362.method_46430((class00392)i, class053622 -> this.y.proceed(false, this.z.y())).N(this.field_22789 / 2 - 155 + 160, 100 + n2, 150, 20).N());
        this.method_37063((class04654)class05362.method_46430((class00392)class05220.i, class053622 -> this.R.run()).N(this.field_22789 / 2 - 155 + 80, 124 + n2, 150, 20).N());
    }

    public boolean method_25422() {
        return false;
    }

    public boolean method_25404(class06601 class066012) {
        if (class066012.v() == 256) {
            this.R.run();
            return true;
        }
        return super.method_25404(class066012);
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        class00580 class005802 = class010542.B();
        class010542.N(this.field_22793, this.field_22785, this.field_22789 / 2, 50, -1);
        int n3 = this.field_22789 / 2;
        Objects.requireNonNull(this.field_22793);
        this.Z.N(class00937.field_62010, n3, 70, 9, class005802);
    }
}

