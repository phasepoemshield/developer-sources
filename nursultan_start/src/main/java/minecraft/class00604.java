/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class00937
 *  minecraft.class01028
 *  minecraft.class01590
 *  minecraft.class02566
 *  minecraft.class05936
 *  minecraft.class08652
 *  org.joml.Matrix3x2f
 *  org.joml.Matrix3x2fc
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Objects;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class00577;
import minecraft.class00580;
import minecraft.class00937;
import minecraft.class01028;
import minecraft.class01590;
import minecraft.class02566;
import minecraft.class05936;
import minecraft.class08652;
import org.joml.Matrix3x2f;
import org.joml.Matrix3x2fc;
import org.jspecify.annotations.Nullable;

public class class00604
implements class00580 {
    private static final class00577 L = new class00577((Matrix3x2fc)new Matrix3x2f());
    private final class01590 u;
    private final int i;
    private final int R;
    private class00577 M = L;
    private boolean B;
    private @Nullable class00405 Z;
    private final Consumer<class00405> z = class004052 -> {
        if (class004052.Z() != null || this.B && class004052.U() != null) {
            this.Z = class004052;
        }
    };

    public class00604(class01590 class015902, int n, int n2) {
        this.u = class015902;
        this.i = n;
        this.R = n2;
    }

    public @Nullable class00405 y() {
        return this.Z;
    }

    public class00604 N(boolean bl) {
        this.B = bl;
        return this;
    }

    @Override
    public void N(class00392 class003922, int n, int n2, int n3, int n4, int n5, class00577 class005772) {
        int n6 = this.u.N((class05936)class003922);
        Objects.requireNonNull(this.u);
        int n7 = 9;
        this.N(class003922, n, n2, n3, n4, n5, n6, n7, class005772);
    }

    @Override
    public class00577 N() {
        return this.M;
    }

    @Override
    public void N(class00937 class009372, int n, int n2, class00577 class005772, class01028 class010282) {
        int n3 = class009372.N(n, this.u, class010282);
        class00580.N(new class08652(this.u, class010282, class005772.N(), n3, n2, class02566.y((float)class005772.y()), 0, true, true, class005772.L()), this.i, this.R, this.z);
    }

    @Override
    public void N(class00577 class005772) {
        this.M = class005772;
    }
}

