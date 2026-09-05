/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01001
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class02477
 *  minecraft.class02484
 *  minecraft.class02666
 *  minecraft.class03289
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04782
 *  minecraft.class06113
 *  minecraft.class07052
 *  minecraft.class07077
 *  minecraft.class07078
 *  minecraft.class07299
 *  minecraft.class07446
 *  minecraft.class07652
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08401
 *  minecraft.class08403
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class01001;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class02477;
import minecraft.class02484;
import minecraft.class02666;
import minecraft.class03289;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04782;
import minecraft.class06113;
import minecraft.class07052;
import minecraft.class07077;
import minecraft.class07078;
import minecraft.class07299;
import minecraft.class07446;
import minecraft.class07652;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08401;
import minecraft.class08403;
import minecraft.class08577;
import minecraft.class08579;
import org.jspecify.annotations.Nullable;

public class class08583
extends class07652 {
    private static final class02131<class03556<class08403>> N = class03289.N(class08583.class, (class04383)class02154.d);

    protected void method_66649(class02666 class026662) {
        this.method_66650(class026662, class02484.Na);
        super.method_66649(class026662);
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(N, class08577.N(this.method_56673(), class08401.N));
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class08577.N(class083292, this.N());
    }

    public <T> @Nullable T method_58694(class02477<? extends T> class024772) {
        if (class024772 == class02484.Na) {
            return (T)class08583.method_66651(class024772, this.N());
        }
        return (T)super.method_58694(class024772);
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        class08577.N(class082992, class04227.Nr).ifPresent(this::N);
    }

    public class08583(class07078<? extends class08583> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    public void N(class03556<class08403> class035562) {
        this.field_6011.N(N, class035562);
    }

    public @Nullable class08583 y(class04782 class047822, class07077 class070772) {
        class08583 class085832 = (class08583)class07078.J.N((class07299)class047822, class06113.field_16466);
        if (class085832 != null && class070772 instanceof class08583) {
            class08583 class085833 = (class08583)class070772;
            class085832.N(this.field_5974.Z() ? this.N() : class085833.N());
        }
        return class085832;
    }

    public class07446 N(class01001 class010012, class07052 class070522, class06113 class061132, @Nullable class07446 class074462) {
        class08577.N(class08579.N(class010012, this.method_24515()), class04227.Nr).ifPresent(this::N);
        return super.N(class010012, class070522, class061132, class074462);
    }

    public class03556<class08403> N() {
        return (class03556)this.field_6011.N(N);
    }

    protected <T> boolean method_66654(class02477<T> class024772, T t) {
        if (class024772 == class02484.Na) {
            this.N((class03556<class08403>)((class03556)class08583.method_66651((class02477)class02484.Na, t)));
            return true;
        }
        return super.method_66654(class024772, t);
    }
}

