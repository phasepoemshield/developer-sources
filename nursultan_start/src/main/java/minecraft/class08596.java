/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00864
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class05487
 *  minecraft.class06092
 *  minecraft.class06665
 *  minecraft.class06942
 *  minecraft.class06993
 *  minecraft.class07111
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class08064
 *  minecraft.class08092
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.function.Function;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00864;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class05487;
import minecraft.class06092;
import minecraft.class06665;
import minecraft.class06942;
import minecraft.class06993;
import minecraft.class07111;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class08064;
import minecraft.class08092;
import minecraft.class08614;

public class class08596
extends class00864
implements class08614 {
    public static final MapCodec<class08596> N = class08596.y(class08596::new);
    public static final class08064<class07211> y = class06665.f;
    private final Function<class00500, class00494> L;

    public class08596(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)((class00500)this.Q.y()).y(y, (Comparable)class07211.field_11043)).y((class08092)this.u(), (Comparable)Integer.valueOf(1)));
        this.L = this.y();
    }

    private Function<class00500, class00494> y() {
        return this.N(this.N(y, this.u()));
    }

    public boolean N(class00500 class005002, class06942 class069422) {
        if (this.N(class005002, class069422, this.u())) {
            return true;
        }
        return super.N(class005002, class069422);
    }

    public class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return this.L.apply(class005002);
    }

    public class00500 N(class06942 class069422) {
        return this.N(class069422, (class00891)this, this.u(), y);
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y, this.u()});
    }

    protected MapCodec<class08596> N() {
        return N;
    }

    public class00500 N(class00500 class005002, class06993 class069932) {
        return (class00500)class005002.y(y, (Comparable)class069932.N((class07211)class005002.L(y)));
    }

    public class00500 N(class00500 class005002, class07111 class071112) {
        return class005002.N(class071112.N((class07211)class005002.L(y)));
    }

    protected boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        class07209 class072093 = class072092.method_10074();
        return class054872.method_8320(class072093).L((class07290)class054872, class072093, class07211.field_11036);
    }
}

