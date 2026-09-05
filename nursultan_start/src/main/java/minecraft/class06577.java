/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01226
 *  minecraft.class02484
 *  minecraft.class03530
 *  minecraft.class04782
 *  minecraft.class06244
 *  minecraft.class06927
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07299
 *  minecraft.class07323
 *  minecraft.class07438
 *  minecraft.class08005
 *  minecraft.class08036
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import minecraft.class01226;
import minecraft.class02484;
import minecraft.class03530;
import minecraft.class04782;
import minecraft.class06244;
import minecraft.class06570;
import minecraft.class06573;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06927;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07299;
import minecraft.class07323;
import minecraft.class07438;
import minecraft.class08005;
import minecraft.class08036;
import org.jspecify.annotations.Nullable;

public abstract class class06577
extends class06581 {
    public static final Predicate<class06584> L = class065842 -> class065842.N((class03530<class06581>)class01226.yb);
    public static final Predicate<class06584> m = L.or(class065842 -> class065842.N(class06570.GJ));

    public Predicate<class06584> L() {
        return this.N();
    }

    public class06577(class06573 class065732) {
        super(class065732);
    }

    protected int i(class06584 class065842) {
        return 1;
    }

    public abstract int y();

    protected static List<class06584> N(class06584 class065842, class06584 class065843, class07438 class074382) {
        int n;
        Object object;
        if (class065843.R()) {
            return List.of();
        }
        Object object2 = class074382.method_73183();
        if (object2 instanceof class04782) {
            object = (class04782)object2;
            n = class07323.N((class04782)object, (class06584)class065842, (class07049)class074382, (int)1);
        } else {
            n = 1;
        }
        int n2 = n;
        object = new ArrayList(n2);
        object2 = class065843.t();
        for (int i = 0; i < n2; ++i) {
            class06584 class065844 = class06577.N(class065842, i == 0 ? class065843 : object2, class074382, i > 0);
            if (class065844.R()) continue;
            object.add(class065844);
        }
        return object;
    }

    protected static class06584 N(class06584 class065842, class06584 class065843, class07438 class074382, boolean bl) {
        int n;
        Object object;
        class07299 class072992;
        if (!bl && !class074382.method_56992() && (class072992 = class074382.method_73183()) instanceof class04782) {
            object = (class04782)class072992;
            v0 = class07323.N((class04782)object, (class06584)class065842, (class06584)class065843, (int)1);
        } else {
            v0 = n = 0;
        }
        if (n > class065843.c()) {
            return class06584.E;
        }
        if (n == 0) {
            object = class065843.L(1);
            ((class06584)object).N(class02484.l, class06244.field_17274);
            return object;
        }
        object = class065843.N(n);
        if (class065843.R() && class074382 instanceof class08036) {
            class072992 = (class08036)class074382;
            class072992.method_31548().Z(class065843);
        }
        return object;
    }

    protected abstract void N(class07438 var1, class08005 var2, int var3, float var4, float var5, float var6, @Nullable class07438 var7);

    public static class06584 N(class07438 class074382, Predicate<class06584> predicate) {
        if (predicate.test(class074382.method_5998(class07050.field_5810))) {
            return class074382.method_5998(class07050.field_5810);
        }
        if (predicate.test(class074382.method_5998(class07050.field_5808))) {
            return class074382.method_5998(class07050.field_5808);
        }
        return class06584.E;
    }

    protected void N(class04782 class047822, class07438 class074382, class07050 class070502, class06584 class065842, List<class06584> list, float f, float f2, boolean bl, @Nullable class07438 class074383) {
        float f3 = class07323.N((class04782)class047822, (class06584)class065842, (class07049)class074382, (float)0.0f);
        float f4 = list.size() == 1 ? 0.0f : 2.0f * f3 / (float)(list.size() - 1);
        float f5 = (float)((list.size() - 1) % 2) * f4 / 2.0f;
        float f6 = 1.0f;
        for (int i = 0; i < list.size(); ++i) {
            class06584 class065843 = list.get(i);
            if (class065843.R()) continue;
            float f7 = f5 + f6 * (float)((i + 1) / 2) * f4;
            f6 = -f6;
            int n = i;
            class08005.N((class08005)this.N((class07299)class047822, class074382, class065842, class065843, bl), (class04782)class047822, (class06584)class065843, class080052 -> this.N(class074382, (class08005)class080052, n, f, f2, f7, class074383));
            class065842.N(this.i(class065843), class074382, class070502.N());
            if (class065842.R()) break;
        }
    }

    public abstract Predicate<class06584> N();

    public class08005 N(class07299 class072992, class07438 class074382, class06584 class065842, class06584 class065843, boolean bl) {
        class06927 class069272;
        class06581 class065812 = class065843.B();
        class069272 = (class065812 instanceof class06927 ? (class069272 = (class06927)class065812) : (class06927)class06570.sD).N(class072992, class065843, class074382, class065842);
        if (bl) {
            class069272.y(true);
        }
        return class069272;
    }
}

