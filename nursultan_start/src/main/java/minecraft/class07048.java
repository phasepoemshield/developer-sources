/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  minecraft.class01312
 *  minecraft.class01325
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class02329
 *  minecraft.class02477
 *  minecraft.class02484
 *  minecraft.class02566
 *  minecraft.class02666
 *  minecraft.class03244
 *  minecraft.class03289
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04641
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class06517
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08372
 *  minecraft.class08636
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import minecraft.class01312;
import minecraft.class01325;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class02329;
import minecraft.class02477;
import minecraft.class02484;
import minecraft.class02566;
import minecraft.class02666;
import minecraft.class03244;
import minecraft.class03289;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04641;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class06517;
import minecraft.class07049;
import minecraft.class07055;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07084;
import minecraft.class07103;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08372;
import minecraft.class08636;
import org.jspecify.annotations.Nullable;

public class class07048
extends class07049
implements class03244 {
    private static final int i = 5;
    private static final class02131<Float> R = class03289.N(class07048.class, (class04383)class02154.u);
    private static final class02131<Boolean> M = class03289.N(class07048.class, (class04383)class02154.U);
    private static final class02131<class07126> B = class03289.N(class07048.class, (class04383)class02154.E);
    private static final float Z = 32.0f;
    private static final int z = 0;
    private static final int U = 0;
    private static final float E = 0.0f;
    private static final float W = 0.0f;
    private static final float m = 1.0f;
    private static final float P = 0.5f;
    private static final float s = 3.0f;
    public static final float N = 6.0f;
    public static final float y = 0.5f;
    public static final int L = -1;
    public static final int u = 600;
    private static final int T = 20;
    private static final int b = 20;
    private static final class02329 j = class02329.N((class07103)class07107.t, (int)-1);
    private @Nullable class07126 v;
    private class06517 n = class06517.N;
    private float t = 1.0f;
    private final Map<class07049, Integer> G = Maps.newHashMap();
    private int l = -1;
    private int d = 20;
    private int w = 20;
    private int k = 0;
    private float Y = 0.0f;
    private float Q = 0.0f;
    private @Nullable class08372<class07438> O;

    public void L(float f) {
        this.Y = f;
    }

    public boolean L() {
        return (Boolean)this.method_5841().N(M);
    }

    public void L(int n) {
        this.d = n;
    }

    public int M() {
        return this.k;
    }

    @Override
    public class01325 method_18377(class01312 class013122) {
        return class01325.y((float)(this.N() * 2.0f), (float)0.5f);
    }

    @Override
    public void method_18382() {
        double d = this.method_23317();
        double d2 = this.method_23318();
        double d3 = this.method_23321();
        super.method_18382();
        this.method_5814(d, d2, d3);
    }

    @Override
    public class04641 method_5657() {
        return class04641.field_15975;
    }

    @Override
    public void method_5674(class02131<?> class021312) {
        if (R.equals(class021312)) {
            this.method_18382();
        }
        super.method_5674(class021312);
    }

    @Override
    protected void method_66649(class02666 class026662) {
        this.method_66650(class026662, class02484.h);
        this.method_66650(class026662, class02484.r);
        super.method_66649(class026662);
    }

    @Override
    protected void method_5693(class04293 class042932) {
        class042932.N(R, (Object)Float.valueOf(3.0f));
        class042932.N(M, (Object)false);
        class042932.N(B, (Object)j);
    }

    @Override
    public void method_5773() {
        super.method_5773();
        class07299 class072992 = this.method_73183();
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            this.N(class047822);
        } else {
            this.E();
        }
    }

    @Override
    public final boolean method_64397(class04782 class047822, class07072 class070722, float f) {
        return false;
    }

    @Override
    protected void method_5652(class08329 class083292) {
        class083292.N("Age", this.field_6012);
        class083292.N("Duration", this.l);
        class083292.N("WaitTime", this.d);
        class083292.N("ReapplicationDelay", this.w);
        class083292.N("DurationOnUse", this.k);
        class083292.N("RadiusOnUse", this.Y);
        class083292.N("RadiusPerTick", this.Q);
        class083292.N("Radius", this.N());
        class083292.y("custom_particle", class07107.yE, (Object)this.v);
        class08372.N(this.O, (class08329)class083292, (String)"Owner");
        if (!this.n.equals((Object)class06517.N)) {
            class083292.N("potion_contents", class06517.L, (Object)this.n);
        }
        if (this.t != 1.0f) {
            class083292.N("potion_duration_scale", this.t);
        }
    }

    @Override
    public <T> @Nullable T method_58694(class02477<? extends T> class024772) {
        if (class024772 == class02484.h) {
            return class07048.method_66651(class024772, this.n);
        }
        if (class024772 == class02484.r) {
            return class07048.method_66651(class024772, Float.valueOf(this.t));
        }
        return super.method_58694(class024772);
    }

    @Override
    protected void method_5749(class08299 class082992) {
        this.field_6012 = class082992.N("Age", 0);
        this.l = class082992.N("Duration", -1);
        this.d = class082992.N("WaitTime", 20);
        this.w = class082992.N("ReapplicationDelay", 20);
        this.k = class082992.N("DurationOnUse", 0);
        this.Y = class082992.N("RadiusOnUse", 0.0f);
        this.Q = class082992.N("RadiusPerTick", 0.0f);
        this.N(class082992.N("Radius", 3.0f));
        this.O = class08372.N((class08299)class082992, (String)"Owner");
        this.N((class07126)class082992.N("custom_particle", class07107.yE).orElse(null));
        this.N(class082992.N("potion_contents", class06517.L).orElse(class06517.N));
        this.t = class082992.N("potion_duration_scale", 1.0f);
    }

    public class07048(class07078<? extends class07048> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.field_5960 = true;
    }

    public class07048(class07299 class072992, double d, double d2, double d3) {
        this((class07078<? extends class07048>)class07078.R, class072992);
        this.method_5814(d, d2, d3);
    }

    public int B() {
        return this.d;
    }

    public @Nullable class07438 z() {
        return class08372.y(this.O, (class07299)this.method_73183());
    }

    public float i() {
        return this.Y;
    }

    private void U() {
        if (this.v != null) {
            this.field_6011.N(B, (Object)this.v);
        } else {
            int n = class02566.M((int)this.n.y());
            this.field_6011.N(B, (Object)class02329.N((class07103)j.method_10295(), (int)n));
        }
    }

    public int u() {
        return this.l;
    }

    public void u(float f) {
        this.Q = f;
    }

    public void y(float f) {
        this.t = f;
    }

    public void y(int n) {
        this.k = n;
    }

    public class07126 y() {
        return (class07126)this.method_5841().N(B);
    }

    private void E() {
        float f;
        int n;
        boolean bl = this.L();
        float f2 = this.N();
        if (bl && this.field_5974.Z()) {
            return;
        }
        class07126 class071262 = this.y();
        if (bl) {
            n = 2;
            f = 0.2f;
        } else {
            n = class04995.u((float)((float)Math.PI * f2 * f2));
            f = f2;
        }
        for (int i = 0; i < n; ++i) {
            float f3 = this.field_5974.z() * ((float)Math.PI * 2);
            float f4 = class04995.N((float)this.field_5974.z()) * f;
            double d = this.method_23317() + (double)(class04995.P((double)f3) * f4);
            double d2 = this.method_23318();
            double d3 = this.method_23321() + (double)(class04995.m((double)f3) * f4);
            if (class071262.method_10295() == class07107.t) {
                if (bl && this.field_5974.Z()) {
                    this.method_73183().method_8494((class07126)j, d, d2, d3, 0.0, 0.0, 0.0);
                    continue;
                }
                this.method_73183().method_8494(class071262, d, d2, d3, 0.0, 0.0, 0.0);
                continue;
            }
            if (bl) {
                this.method_73183().method_8494(class071262, d, d2, d3, 0.0, 0.0, 0.0);
                continue;
            }
            this.method_73183().method_8494(class071262, d, d2, d3, (0.5 - this.field_5974.U()) * 0.15, (double)0.01f, (0.5 - this.field_5974.U()) * 0.15);
        }
    }

    public float N() {
        return ((Float)this.method_5841().N(R)).floatValue();
    }

    public void N(class06517 class065172) {
        this.n = class065172;
        this.U();
    }

    public void N(float f) {
        if (!this.method_73183().method_8608()) {
            this.method_5841().N(R, (Object)Float.valueOf(class04995.N((float)f, (float)0.0f, (float)32.0f)));
        }
    }

    public void N(int n) {
        this.l = n;
    }

    public void N(@Nullable class07438 class074382) {
        this.O = class08372.N((class08636)class074382);
    }

    protected void N(boolean bl) {
        this.method_5841().N(M, (Object)bl);
    }

    private void N(class04782 class047822) {
        boolean bl;
        if (this.l != -1 && this.field_6012 - this.d >= this.l) {
            this.method_31472();
            return;
        }
        boolean bl2 = this.L();
        boolean bl3 = bl = this.field_6012 < this.d;
        if (bl2 != bl) {
            this.N(bl);
        }
        if (bl) {
            return;
        }
        float f = this.N();
        if (this.Q != 0.0f) {
            if ((f += this.Q) < 0.5f) {
                this.method_31472();
                return;
            }
            this.N(f);
        }
        if (this.field_6012 % 5 == 0) {
            this.G.entrySet().removeIf(entry -> this.field_6012 >= (Integer)entry.getValue());
            if (!this.n.L()) {
                this.G.clear();
            } else {
                ArrayList arrayList = new ArrayList();
                this.n.N(arrayList::add, this.t);
                List var6 = this.method_73183().N(class07438.class, this.method_5829());
                if (!var6.isEmpty()) {
                    for (class07438 class074382 : var6) {
                        double d;
                        double d2;
                        if (this.G.containsKey(class074382) || !class074382.method_6086()) continue;
                        if (arrayList.stream().noneMatch(arg_0 -> ((class07438)class074382).method_6049(arg_0)) || !((d2 = class074382.method_23317() - this.method_23317()) * d2 + (d = class074382.method_23321() - this.method_23321()) * d <= (double)(f * f))) continue;
                        this.G.put((class07049)class074382, this.field_6012 + this.w);
                        for (class07055 class070552 : arrayList) {
                            if (((class07084)class070552.L().N()).N()) {
                                ((class07084)class070552.L().N()).N(class047822, this, (class07049)this.z(), class074382, class070552.i(), 0.5);
                                continue;
                            }
                            class074382.method_37222(new class07055(class070552), (class07049)this);
                        }
                        if (this.Y != 0.0f) {
                            if ((f += this.Y) < 0.5f) {
                                this.method_31472();
                                return;
                            }
                            this.N(f);
                        }
                        if (this.k == 0 || this.l == -1) continue;
                        this.l += this.k;
                        if (this.l > 0) continue;
                        this.method_31472();
                        return;
                    }
                }
            }
        }
    }

    public void N(@Nullable class07126 class071262) {
        this.v = class071262;
        this.U();
    }

    public void N(class07055 class070552) {
        this.N(this.n.N(class070552));
    }

    public float R() {
        return this.Q;
    }

    @Override
    protected <T> boolean method_66654(class02477<T> class024772, T t) {
        if (class024772 == class02484.h) {
            this.N((class06517)class07048.method_66651(class02484.h, t));
            return true;
        }
        if (class024772 == class02484.r) {
            this.y(((Float)class07048.method_66651(class02484.r, t)).floatValue());
            return true;
        }
        return super.method_66654(class024772, t);
    }
}

