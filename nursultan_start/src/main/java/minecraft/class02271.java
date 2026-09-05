/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00891
 *  minecraft.class01118
 *  minecraft.class01362
 *  minecraft.class02308
 *  minecraft.class04782
 *  minecraft.class06183
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06942
 *  minecraft.class06993
 *  minecraft.class07050
 *  minecraft.class07082
 *  minecraft.class07101
 *  minecraft.class07111
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07299
 *  minecraft.class07796
 *  minecraft.class08036
 *  minecraft.class08064
 *  minecraft.class08092
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00891;
import minecraft.class01118;
import minecraft.class01362;
import minecraft.class02261;
import minecraft.class02274;
import minecraft.class02281;
import minecraft.class02284;
import minecraft.class02296;
import minecraft.class02302;
import minecraft.class02308;
import minecraft.class04782;
import minecraft.class06183;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06942;
import minecraft.class06993;
import minecraft.class07050;
import minecraft.class07082;
import minecraft.class07101;
import minecraft.class07111;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07299;
import minecraft.class07796;
import minecraft.class08036;
import minecraft.class08064;
import minecraft.class08092;
import org.jspecify.annotations.Nullable;

public class class02271
extends class07796 {
    public static final MapCodec<class02271> N = class02271.y(class02271::new);
    public static final class08092<class02302> y = class06665.yg;
    public static final class08064<class07211> L = class07101.R;
    public static final class06667 u = class06665.yJ;

    public class02271(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)((class00500)((class00500)this.Q.y()).y(L, (Comparable)class07211.field_11043)).y(y, (Comparable)((Object)class02302.field_48899))).y((class08092)u, (Comparable)Boolean.valueOf(false)));
    }

    public class00500 N(class00500 class005002, class07111 class071112) {
        return class005002.N(class071112.N((class07211)class005002.L(L)));
    }

    public class00500 N(class00500 class005002, class06993 class069932) {
        return (class00500)class005002.y(L, (Comparable)class069932.N((class07211)class005002.L(L)));
    }

    public MapCodec<class02271> N() {
        return N;
    }

    public class07082 N(class06584 class065842, class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class07050 class070502, class06183 class061832) {
        if (class065842.R() || class005002.L(y) != class02302.field_48900) {
            return class07082.R;
        }
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            class00394 class003942 = class047822.method_8321(class072092);
            if (!(class003942 instanceof class02261)) {
                return class07082.R;
            }
            class02261 class022612 = (class02261)class003942;
            class02308.N((class04782)class047822, (class07209)class072092, (class00500)class005002, (class02281)class022612.R(), (class02296)class022612.N(), (class02274)class022612.L(), (class08036)class080362, (class06584)class065842);
        }
        return class07082.y;
    }

    public @Nullable class00394 N(class07209 class072092, class00500 class005002) {
        return new class02261(class072092, class005002);
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{L, y, u});
    }

    public <T extends class00394> @Nullable class01118<T> N(class07299 class072993, class00500 class005003, class00404<T> class004042) {
        class01118 class011182;
        if (class072993 instanceof class04782) {
            class04782 class047822 = (class04782)class072993;
            class011182 = class02271.N(class004042, (class00404)class00404.field_48859, (class072992, class072092, class005002, class022612) -> class02308.N((class04782)class047822, (class07209)class072092, (class00500)class005002, (class02281)class022612.R(), (class02296)class022612.N(), (class02274)class022612.L()));
        } else {
            class011182 = class02271.N(class004042, (class00404)class00404.field_48859, (class072992, class072092, class005002, class022612) -> class02284.N(class072992, class072092, class005002, class022612.u(), class022612.L()));
        }
        return class011182;
    }

    public class00500 N(class06942 class069422) {
        return (class00500)this.W().y(L, (Comparable)class069422.method_8042().b());
    }
}

