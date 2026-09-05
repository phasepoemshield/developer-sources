/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00405
 *  minecraft.class00577
 *  minecraft.class00580
 *  minecraft.class00937
 *  minecraft.class01028
 *  minecraft.class01054
 *  minecraft.class01065
 *  minecraft.class01590
 *  minecraft.class02566
 *  minecraft.class03050
 *  minecraft.class03054
 *  minecraft.class05936
 *  minecraft.class06608
 *  org.joml.Matrix3x2f
 *  org.joml.Matrix3x2fc
 *  org.joml.Vector2f
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.function.Consumer;
import minecraft.class00405;
import minecraft.class00577;
import minecraft.class00580;
import minecraft.class00937;
import minecraft.class01028;
import minecraft.class01054;
import minecraft.class01065;
import minecraft.class01590;
import minecraft.class02566;
import minecraft.class03050;
import minecraft.class03054;
import minecraft.class05936;
import minecraft.class06465;
import minecraft.class06608;
import org.joml.Matrix3x2f;
import org.joml.Matrix3x2fc;
import org.joml.Vector2f;
import org.jspecify.annotations.Nullable;

class class06469
implements class06465,
Consumer<class00405> {
    private final class01054 N;
    private final class01590 y;
    private final class00580 L;
    private class00577 u;
    private final int i;
    private final int R;
    private final Vector2f M = new Vector2f();
    private @Nullable class00405 B;
    private final boolean Z;

    public class06469(class01054 class010542, class01590 class015902, int n, int n2, boolean bl) {
        this.N = class010542;
        this.y = class015902;
        this.L = class010542.N(class01065.field_63852, (Consumer)this);
        this.i = n;
        this.R = n2;
        this.Z = bl;
        this.u = this.L.N();
        this.N();
    }

    private boolean N(int n, int n2, int n3, int n4) {
        return class00580.N((float)this.M.x, (float)this.M.y, (float)n, (float)n2, (float)n3, (float)n4);
    }

    @Override
    public void N(int n, int n2, int n3, int n4, float f, class03054 class030542) {
        int n5 = class02566.N((float)f, (int)class030542.i());
        this.N.N(n, n2, n3, n4, n5);
        if (this.N(n, n2, n3, n4)) {
            this.N(class030542);
        }
    }

    @Override
    public void N(int n, int n2, boolean bl, class03054 class030542, class03050 class030502) {
        int n3 = n2 - class030502.field_39767 - 1;
        int n4 = n + class030502.field_39766;
        boolean bl2 = this.N(n, n3, n4, n2);
        if (bl2) {
            this.N(class030542);
        }
        if (bl || bl2) {
            class030502.N(this.N, n, n3);
        }
    }

    private void N(class03054 class030542) {
        if (class030542.M() != null) {
            this.N.y(this.y, this.y.L((class05936)class030542.M(), 210), this.i, this.R);
        }
    }

    @Override
    public boolean N(int n, float f, class01028 class010282) {
        this.B = null;
        this.L.N(class00937.field_62009, 0, n, this.u.y(f), class010282);
        if (this.Z && this.B != null && this.B.U() != null) {
            this.N.N(class06608.u);
        }
        return this.B != null;
    }

    @Override
    public void N(Consumer<Matrix3x2f> consumer) {
        consumer.accept((Matrix3x2f)this.N.i());
        this.u = this.u.N((Matrix3x2fc)new Matrix3x2f((Matrix3x2fc)this.N.i()));
        this.N();
    }

    @Override
    public void N(int n, int n2, int n3, int n4, int n5) {
        this.N.N(n, n2, n3, n4, n5);
    }

    @Override
    public void accept(class00405 class004052) {
        this.B = class004052;
    }

    private void N() {
        this.N.i().invert(new Matrix3x2f()).transformPosition((float)this.i, (float)this.R, this.M);
    }
}

