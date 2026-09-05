/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00500
 *  minecraft.class01929
 *  minecraft.class02484
 *  minecraft.class02666
 *  minecraft.class02676
 *  minecraft.class02854
 *  minecraft.class03136
 *  minecraft.class03490
 *  minecraft.class05074
 *  minecraft.class05946
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class07001
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07269
 *  minecraft.class08092
 *  minecraft.class08299
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.List;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class01929;
import minecraft.class01967;
import minecraft.class01986;
import minecraft.class02484;
import minecraft.class02666;
import minecraft.class02676;
import minecraft.class02854;
import minecraft.class03136;
import minecraft.class03490;
import minecraft.class05074;
import minecraft.class05946;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class07001;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07269;
import minecraft.class08092;
import minecraft.class08299;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;

public class class01958
extends class00394
implements class01986,
class03136 {
    public static final String N = "sherds";
    public static final String y = "item";
    public static final int u = 1;
    public long i;
    public @Nullable class01967 R;
    private class03490 Z;
    private class06584 m = class06584.E;
    protected @Nullable class05946<class05074> M;
    protected long B;

    public class07269 i() {
        return class07269.N((class00394)this);
    }

    public @Nullable class05946<class05074> M() {
        return this.M;
    }

    public class01958(class07209 class072092, class00500 class005002) {
        super(class00404.field_42781, class072092, class005002);
        this.Z = class03490.N;
    }

    public long B() {
        return this.B;
    }

    @Override
    public class00394 Z() {
        return this;
    }

    public class03490 z() {
        return this.Z;
    }

    public class07211 u() {
        return (class07211)this.w().L((class08092)class06665.f);
    }

    public void y(class08329 class083292) {
        super.y(class083292);
        class083292.L(N);
        class083292.L(y);
    }

    protected void N(class08329 class083292) {
        super.N(class083292);
        if (!this.Z.equals((Object)class03490.N)) {
            class083292.N(N, class03490.y, (Object)this.Z);
        }
        if (!this.a_(class083292) && !this.m.R()) {
            class083292.N(y, class06584.y, (Object)this.m);
        }
    }

    @Override
    public void N(class06584 class065842) {
        this.y(null);
        this.m = class065842;
    }

    @Override
    public class06584 N(int n) {
        this.y(null);
        class06584 class065842 = this.m.N(n);
        if (this.m.R()) {
            this.m = class06584.E;
        }
        return class065842;
    }

    @Override
    public class06584 N() {
        this.y(null);
        return this.m;
    }

    public void N(class01967 class019672) {
        if (this.z == null || this.z.method_8608()) {
            return;
        }
        this.z.method_8427(this.d(), this.w().i(), 1, class019672.ordinal());
    }

    public boolean N(int n, int n2) {
        if (this.z != null && n == 1 && n2 >= 0 && n2 < class01967.values().length) {
            this.i = this.z.N();
            this.R = class01967.values()[n2];
            return true;
        }
        return super.N(n, n2);
    }

    public void N(long l) {
        this.B = l;
    }

    public void N(@Nullable class05946<class05074> class059462) {
        this.M = class059462;
    }

    public class07001 N(class01929 class019292) {
        return this.u(class019292);
    }

    protected void N(class08299 class082992) {
        super.N(class082992);
        this.Z = class082992.N(N, class03490.y).orElse(class03490.N);
        this.m = !this.c_(class082992) ? class082992.N(y, class06584.y).orElse(class06584.E) : class06584.E;
    }

    protected void N(class02676 class026762) {
        super.N(class026762);
        class026762.N(class02484.Nt, (Object)this.Z);
        class026762.N(class02484.NG, (Object)class02854.N(List.of(this.m)));
    }

    protected void N_9(class02666 class026662) {
        super.N_9(class026662);
        this.Z = (class03490)class026662.a_(class02484.Nt, (Object)class03490.N);
        this.m = ((class02854)class026662.a_(class02484.NG, (Object)class02854.N)).N();
    }

    public static class06584 N(class03490 class034902) {
        class06584 class065842 = class06570.RB.E();
        class065842.N(class02484.Nt, (Object)class034902);
        return class065842;
    }
}

