/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00502
 *  minecraft.class01054
 *  minecraft.class01631
 *  minecraft.class02566
 *  minecraft.class03458
 *  minecraft.class03933
 *  minecraft.class05971
 *  minecraft.class05973
 *  minecraft.class06069
 *  minecraft.class06202
 *  minecraft.class07282
 */
package minecraft;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import minecraft.class00392;
import minecraft.class00502;
import minecraft.class01054;
import minecraft.class01262;
import minecraft.class01264;
import minecraft.class01631;
import minecraft.class02566;
import minecraft.class03458;
import minecraft.class03933;
import minecraft.class05971;
import minecraft.class05973;
import minecraft.class06069;
import minecraft.class06202;
import minecraft.class07282;

class class01244
implements class01262 {
    private final class00502 N;
    private final Supplier<class01631> y;
    private final List<class03458> L;

    private class01244(class00502 class005022, List<class03458> list, Supplier<class01631> supplier) {
        this.N = class005022;
        this.L = list;
        this.y = supplier;
    }

    @Override
    public void N(class01054 class010542, float f, float f2) {
        Integer n = this.N.P().i();
        if (n != null) {
            float f3 = (float)(n >> 16 & 0xFF) / 255.0f;
            float f4 = (float)(n >> 8 & 0xFF) / 255.0f;
            float f5 = (float)(n & 0xFF) / 255.0f;
            class010542.N(1, 1, 15, 15, class02566.N((float)f2, (float)(f3 * f), (float)(f4 * f), (float)(f5 * f)));
        }
        class03933.N((class01054)class010542, (class01631)this.y.get(), (int)2, (int)2, (int)12, (int)class02566.N((float)f2, (float)f, (float)f, (float)f));
    }

    @Override
    public void N(class05973 class059732) {
        class059732.N((class05971)new class01264(this.L));
    }

    public static Optional<class01262> N(class06202 class062022, class00502 class005022) {
        ArrayList<class03458> arrayList = new ArrayList<class03458>();
        for (String string : class005022.B()) {
            class03458 class034582 = class062022.NE().N(string);
            if (class034582 == null || class034582.i() == class07282.field_9219) continue;
            arrayList.add(class034582);
        }
        if (arrayList.isEmpty()) {
            return Optional.empty();
        }
        class03458 class034583 = (class03458)arrayList.get(class06069.u().y(arrayList.size()));
        return Optional.of(new class01244(class005022, arrayList, () -> ((class03458)class034583).M()));
    }

    @Override
    public class00392 aw_() {
        return this.N.u();
    }

    @Override
    public boolean ax_() {
        return true;
    }
}

