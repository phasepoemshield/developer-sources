/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10763
 *  minecraft.class00245
 *  minecraft.class04782
 *  minecraft.class04882
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class06069
 *  minecraft.class06171
 *  minecraft.class07049
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07148
 *  minecraft.class07150
 *  minecraft.class07299
 *  minecraft.class07427
 *  minecraft.class07625
 *  minecraft.class07881
 *  minecraft.class07952
 *  minecraft.class07962
 *  minecraft.class07978
 *  minecraft.class07989
 *  minecraft.class08036
 *  minecraft.class08042
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10763;
import minecraft.class00245;
import minecraft.class04782;
import minecraft.class04882;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class06069;
import minecraft.class06171;
import minecraft.class07049;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07148;
import minecraft.class07150;
import minecraft.class07299;
import minecraft.class07427;
import minecraft.class07464;
import minecraft.class07473;
import minecraft.class07475;
import minecraft.class07539;
import minecraft.class07544;
import minecraft.class07546;
import minecraft.class07625;
import minecraft.class07881;
import minecraft.class07952;
import minecraft.class07962;
import minecraft.class07978;
import minecraft.class07989;
import minecraft.class08036;
import minecraft.class08042;
import org.jspecify.annotations.Nullable;

public class class07538
extends class07148 {
    private @Nullable class07881 N;

    static /* synthetic */ class06069 L(class07538 class075382) {
        return class075382.field_5974;
    }

    protected boolean method_61416(class07049 class070492) {
        class08042 class080422;
        if (class070492 == this) {
            return true;
        }
        if (super.method_61416(class070492)) {
            return true;
        }
        if (class070492 instanceof class08042 && (class080422 = (class08042)class070492).z() != null) {
            return this.method_61416((class07049)class080422.z());
        }
        return false;
    }

    public class07538(class07078<? extends class07538> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.J = 10;
    }

    public static class05300 B() {
        return class07150.Y().N(class05298.l, 0.5).N(class05298.P, 12.0).N(class05298.n, 24.0);
    }

    static /* synthetic */ class06069 i(class07538 class075382) {
        return class075382.field_5974;
    }

    protected class04891 s() {
        return class04909.UR;
    }

    protected class04891 m() {
        return class04909.UM;
    }

    static /* synthetic */ class06069 u(class07538 class075382) {
        return class075382.field_5974;
    }

    static /* synthetic */ class06069 y(class07538 class075382) {
        return class075382.field_5974;
    }

    public class04891 E() {
        return class04909.UB;
    }

    void N(@Nullable class07881 class078812) {
        this.N = class078812;
    }

    static /* synthetic */ class06069 N(class07538 class075382) {
        return class075382.field_5974;
    }

    public void N(class04782 class047822, int n, boolean bl) {
    }

    public @Nullable class07881 W() {
        return this.N;
    }

    protected void l_() {
        super.l_();
        this.e.N(0, (class07473)new class07427((class07079)this));
        this.e.N(1, (class07473)new class10763(this));
        this.e.N(2, new class07464<class08036>((class07475)((Object)this), class08036.class, 8.0f, 0.6, 1.0));
        this.e.N(3, new class07464<class00245>((class07475)((Object)this), class00245.class, 8.0f, 0.6, 1.0));
        this.e.N(4, (class07473)((Object)new class07544(this)));
        this.e.N(5, (class07473)((Object)new class07546(this)));
        this.e.N(6, (class07473)((Object)new class07539(this)));
        this.e.N(8, (class07473)new class07978((class07475)((Object)this), 0.6));
        this.e.N(9, (class07473)new class07962((class07079)this, class08036.class, 3.0f, 1.0f));
        this.e.N(10, (class07473)new class07962((class07079)this, class07079.class, 8.0f));
        this.H.N(1, (class07473)new class07989((class07475)((Object)this), new Class[]{class04882.class}).N(new Class[0]));
        this.H.N(2, (class07473)new class07952((class07079)this, class08036.class, true).L(300));
        this.H.N(3, (class07473)new class07952((class07079)this, class06171.class, false).L(300));
        this.H.N(3, (class07473)new class07952((class07079)this, class07625.class, false));
    }

    public class04891 method_6002() {
        return class04909.UZ;
    }

    public class04891 method_6011(class07072 class070722) {
        return class04909.UU;
    }
}

