/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00734
 *  minecraft.class01312
 *  minecraft.class01325
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class03289
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04641
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class06889
 *  minecraft.class06912
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07082
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class08036
 *  minecraft.class08299
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00734;
import minecraft.class01312;
import minecraft.class01325;
import minecraft.class01956;
import minecraft.class01959;
import minecraft.class01981;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class03289;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04641;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class06889;
import minecraft.class06912;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07082;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08036;
import minecraft.class08299;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;

public class class01952
extends class07049
implements class01956,
class01959 {
    private static final class02131<Float> N = class03289.N(class01952.class, (class04383)class02154.u);
    private static final class02131<Float> y = class03289.N(class01952.class, (class04383)class02154.u);
    private static final class02131<Boolean> L = class03289.N(class01952.class, (class04383)class02154.U);
    private static final String u = "width";
    private static final String i = "height";
    private static final String R = "attack";
    private static final String M = "interaction";
    private static final String B = "response";
    private static final float Z = 1.0f;
    private static final float z = 1.0f;
    private static final boolean U = false;
    private @Nullable class01981 E;
    private @Nullable class01981 W;

    public final boolean L() {
        return (Boolean)this.field_6011.N(L);
    }

    @Override
    public @Nullable class07438 T() {
        if (this.W != null) {
            return this.method_73183().N(this.W.N());
        }
        return null;
    }

    public class01325 method_18377(class01312 class013122) {
        return this.u();
    }

    public boolean method_5696() {
        return true;
    }

    public class04641 method_5657() {
        return class04641.field_15975;
    }

    public void method_5674(class02131<?> class021312) {
        super.method_5674(class021312);
        if (y.equals(class021312) || N.equals(class021312)) {
            this.method_18382();
        }
    }

    protected void method_5693(class04293 class042932) {
        class042932.N(N, (Object)Float.valueOf(1.0f));
        class042932.N(y, (Object)Float.valueOf(1.0f));
        class042932.N(L, (Object)false);
    }

    protected class00734 method_65341(class06889 class068892) {
        return this.u().N(class068892);
    }

    public void method_5773() {
    }

    public final boolean method_64397(class04782 class047822, class07072 class070722, float f) {
        return false;
    }

    protected void method_5652(class08329 class083292) {
        class083292.N(u, this.N());
        class083292.N(i, this.y());
        class083292.y(R, class01981.N, (Object)this.E);
        class083292.y(M, class01981.N, (Object)this.W);
        class083292.N(B, this.L());
    }

    public boolean method_5863() {
        return true;
    }

    public boolean method_49108() {
        return false;
    }

    public class07082 method_5688(class08036 class080362, class07050 class070502) {
        if (this.method_73183().method_8608()) {
            return this.L() ? class07082.N : class07082.L;
        }
        this.W = new class01981(class080362.method_5667(), this.method_73183().N());
        return class07082.L;
    }

    protected void method_5749(class08299 class082992) {
        this.N(class082992.N(u, 1.0f));
        this.y(class082992.N(i, 1.0f));
        this.E = class082992.N(R, class01981.N).orElse(null);
        this.W = class082992.N(M, class01981.N).orElse(null);
        this.N(class082992.N(B, false));
        this.method_5857(this.method_33332());
    }

    public boolean method_5698(class07049 class070492) {
        if (class070492 instanceof class08036) {
            class08036 class080362 = (class08036)class070492;
            this.E = new class01981(class080362.method_5667(), this.method_73183().N());
            if (class080362 instanceof class04770) {
                class04770 class047702 = (class04770)class080362;
                class06912.B.N(class047702, (class07049)this, class080362.method_48923().s(), 1.0f, 1.0f, false);
            }
            return !this.L();
        }
        return false;
    }

    public class01952(class07078<?> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.field_5960 = true;
    }

    private class01325 u() {
        return class01325.y((float)this.N(), (float)this.y());
    }

    public final float y() {
        return ((Float)this.field_6011.N(y)).floatValue();
    }

    public final void y(float f) {
        this.field_6011.N(y, (Object)Float.valueOf(f));
    }

    public final float N() {
        return ((Float)this.field_6011.N(N)).floatValue();
    }

    public final void N(float f) {
        this.field_6011.N(N, (Object)Float.valueOf(f));
    }

    public final void N(boolean bl) {
        this.field_6011.N(L, (Object)bl);
    }

    @Override
    public @Nullable class07438 method_49107() {
        if (this.E != null) {
            return this.method_73183().N(this.E.N());
        }
        return null;
    }
}

