/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.ints.IntOpenHashSet
 *  java.lang.MatchException
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class00381
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00503
 *  minecraft.class00734
 *  minecraft.class01217
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class02484
 *  minecraft.class02626
 *  minecraft.class03289
 *  minecraft.class04206
 *  minecraft.class04252
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class04803
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04995
 *  minecraft.class05298
 *  minecraft.class05835
 *  minecraft.class05849
 *  minecraft.class05862
 *  minecraft.class06145
 *  minecraft.class06183
 *  minecraft.class06244
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class06912
 *  minecraft.class07049
 *  minecraft.class07065
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07089
 *  minecraft.class07107
 *  minecraft.class07113
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07323
 *  minecraft.class07438
 *  minecraft.class07451
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08372
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import minecraft.class00381;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00503;
import minecraft.class00734;
import minecraft.class01217;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class02484;
import minecraft.class02626;
import minecraft.class03289;
import minecraft.class04206;
import minecraft.class04252;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class04803;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04995;
import minecraft.class05298;
import minecraft.class05835;
import minecraft.class05849;
import minecraft.class05862;
import minecraft.class06145;
import minecraft.class06183;
import minecraft.class06244;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class06912;
import minecraft.class07049;
import minecraft.class07065;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07089;
import minecraft.class07107;
import minecraft.class07113;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07323;
import minecraft.class07438;
import minecraft.class07451;
import minecraft.class08005;
import minecraft.class08008;
import minecraft.class08036;
import minecraft.class08038;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08372;
import org.jspecify.annotations.Nullable;

public abstract class class08007
extends class08005 {
    private static final double u = 2.0;
    private static final int R = 7;
    private static final float M = 0.6f;
    private static final float B = 0.99f;
    private static final short Z = 0;
    private static final byte z = 0;
    private static final boolean U = false;
    private static final boolean E = false;
    private static final byte W = 0;
    private static final class02131<Byte> m = class03289.N(class08007.class, (class04383)class02154.N);
    private static final class02131<Byte> P = class03289.N(class08007.class, (class04383)class02154.N);
    private static final class02131<Boolean> s = class03289.N(class08007.class, (class04383)class02154.U);
    private static final int T = 1;
    private static final int b = 2;
    private @Nullable class00500 j;
    protected int N;
    public class08008 y = class08008.field_7592;
    public int L = 0;
    private int v = 0;
    private double n = 2.0;
    private class04891 t = this.u();
    private @Nullable IntOpenHashSet G;
    private @Nullable List<class07049> l;
    private class06584 d = this.M();
    private @Nullable class06584 w = null;

    protected void L() {
        ++this.v;
        if (this.v >= 1200) {
            this.method_31472();
        }
    }

    public void L(boolean bl) {
        this.field_5960 = bl;
        this.N(2, bl);
    }

    @Override
    public void L(@Nullable class07049 class070492) {
        class08008 class080082;
        super.L(class070492);
        class07049 class070493 = class070492;
        int n = 0;
        block4: while (true) {
            switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class08036.class, class02626.class}, (Object)class070493, (int)n)) {
                case 0: {
                    class08036 class080362 = (class08036)class070493;
                    if (this.y != class08008.field_7592) {
                        n = 1;
                        continue block4;
                    }
                    class080082 = class08008.field_7593;
                    break block4;
                }
                case 1: {
                    class02626 class026262 = (class02626)class070493;
                    class080082 = class08008.field_7592;
                    break block4;
                }
                default: {
                    class080082 = this.y;
                    break block4;
                }
            }
            break;
        }
        this.y = class080082;
    }

    protected abstract class06584 M();

    public boolean method_5675() {
        return !this.y();
    }

    public @Nullable class04803 method_32318(int n) {
        if (n == 0) {
            return class04803.N(this::B, this::N);
        }
        return super.method_32318(n);
    }

    public void method_5674(class02131<?> class021312) {
        super.method_5674(class021312);
        if (!this.field_5953 && this.L <= 0 && class021312.equals(s) && this.y()) {
            this.L = 7;
        }
    }

    public @Nullable class06584 method_59958() {
        return this.w;
    }

    protected void method_5693(class04293 class042932) {
        class042932.N(m, (Object)0);
        class042932.N(P, (Object)0);
        class042932.N(s, (Object)false);
    }

    @Override
    public void method_5773() {
        class00494 class004942;
        boolean bl = !this.W();
        class06889 class068892 = this.method_18798();
        class07209 class072092 = this.method_24515();
        class00500 class005002 = this.method_73183().method_8320(class072092);
        if (!class005002.P() && bl && !(class004942 = class005002.M((class07290)this.method_73183(), class072092)).method_1110()) {
            class06889 class068893 = this.method_73189();
            for (class00734 class007342 : class004942.method_1090()) {
                if (!class007342.N(class072092).u(class068893)) continue;
                this.method_18799(class06889.L);
                this.N(true);
                break;
            }
        }
        if (this.L > 0) {
            --this.L;
        }
        if (this.method_5721()) {
            this.method_5646();
        }
        if (this.y() && bl) {
            if (!this.method_73183().method_8608()) {
                if (this.j != class005002 && this.m()) {
                    this.b();
                } else {
                    this.L();
                }
            }
            ++this.N;
            if (this.method_5805()) {
                this.method_61409();
            }
            if (!this.method_73183().method_8608()) {
                this.method_33572(this.method_20802() > 0);
            }
            return;
        }
        this.N = 0;
        class004942 = this.method_73189();
        if (this.method_5799()) {
            this.y(this.E());
            this.N((class06889)class004942);
        }
        if (this.Z()) {
            for (int i = 0; i < 4; ++i) {
                this.method_73183().method_8406((class07126)class07107.M, class004942.M + class068892.M * (double)i / 4.0, class004942.B + class068892.B * (double)i / 4.0, class004942.Z + class068892.Z * (double)i / 4.0, -class068892.M, -class068892.B + 0.2, -class068892.Z);
            }
        }
        float f = !bl ? (float)(class04995.u((double)(-class068892.M), (double)(-class068892.Z)) * 57.2957763671875) : (float)(class04995.u((double)class068892.M, (double)class068892.Z) * 57.2957763671875);
        float f2 = (float)(class04995.u((double)class068892.B, (double)class068892.Z()) * 57.2957763671875);
        this.method_36457(class08007.N(this.method_36455(), f2));
        this.method_36456(class08007.N(this.method_36454(), f));
        this.s();
        if (bl) {
            class00734 class007342;
            class007342 = this.method_73183().y(new class05862((class06889)class004942, class004942.i(class068892), class05849.field_17558, class05835.field_1348, (class07049)this));
            this.y((class06183)class007342);
        } else {
            this.method_33574(class004942.i(class068892));
            this.method_61409();
        }
        if (!this.method_5799()) {
            this.y(0.99f);
        }
        if (bl && !this.y()) {
            this.method_56990();
        }
        super.method_5773();
    }

    public void method_5784(class07451 class074512, class06889 class068892) {
        super.method_5784(class074512, class068892);
        if (class074512 != class07451.field_6308 && this.m()) {
            this.b();
        }
    }

    protected class07065 method_33570() {
        return class07065.field_28630;
    }

    protected double method_7490() {
        return 0.05;
    }

    public void method_5762(double d, double d2, double d3) {
        if (this.y()) {
            return;
        }
        super.method_5762(d, d2, d3);
    }

    public void method_5694(class08036 class080362) {
        if (this.method_73183().method_8608() || !this.y() && !this.W() || this.L > 0) {
            return;
        }
        if (this.N(class080362)) {
            class080362.method_6103(this, 1);
            this.method_31472();
        }
    }

    @Override
    protected void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N("life", (short)this.v);
        class083292.y("inBlockState", class00500.N, (Object)this.j);
        class083292.N("shake", (byte)this.L);
        class083292.N("inGround", this.y());
        class083292.N("pickup", class08008.field_56665, (Object)this.y);
        class083292.N("damage", this.n);
        class083292.N("crit", this.Z());
        class083292.N("PierceLevel", this.U());
        class083292.N("SoundEvent", class04206.y.T(), (Object)this.t);
        class083292.N("item", class06584.y, (Object)this.d);
        class083292.y("weapon", class06584.y, (Object)this.w);
    }

    @Override
    public boolean method_5863() {
        return super.method_5863() && !this.y();
    }

    public boolean method_5640(double d) {
        double d2 = this.method_5829().N() * 10.0;
        if (Double.isNaN(d2)) {
            d2 = 1.0;
        }
        return d < (d2 *= 64.0 * class08007.method_5824()) * d2;
    }

    @Override
    protected void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.v = class082992.N("life", (short)0);
        this.j = class082992.N("inBlockState", class00500.N).orElse(null);
        this.L = class082992.N("shake", (byte)0) & 0xFF;
        this.N(class082992.N("inGround", false));
        this.n = class082992.N("damage", 2.0);
        this.y = class082992.N("pickup", class08008.field_56665).orElse(class08008.field_7592);
        this.y(class082992.N("crit", false));
        this.N(class082992.N("PierceLevel", (byte)0));
        this.t = class082992.N("SoundEvent", class04206.y.T()).orElse(this.u());
        this.N(class082992.N("item", class06584.y).orElse(this.M()));
        this.w = class082992.N("weapon", class06584.y).orElse(null);
    }

    public void method_5750(class06889 class068892) {
        super.method_5750(class068892);
        this.v = 0;
        if (this.y() && class068892.B() > 0.0) {
            this.N(false);
        }
    }

    @Override
    public void method_5700(boolean bl, class07209 class072092) {
        if (this.y()) {
            return;
        }
        super.method_5700(bl, class072092);
    }

    @Override
    public void method_5764(boolean bl) {
        if (this.y()) {
            return;
        }
        super.method_5764(bl);
    }

    public boolean method_5732() {
        return this.method_5864().N(class01217.q);
    }

    protected class08007(class07078<? extends class08007> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    protected class08007(class07078<? extends class08007> class070782, double d, double d2, double d3, class07299 class072992, class06584 class065842, @Nullable class06584 class065843) {
        this(class070782, class072992);
        this.d = class065842.t();
        this.method_66652(class065842);
        if ((class06244)class065842.y(class02484.l) != null) {
            this.y = class08008.field_7594;
        }
        this.method_5814(d, d2, d3);
        if (class065843 != null && class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            if (class065843.R()) {
                throw new IllegalArgumentException("Invalid weapon firing an arrow");
            }
            this.w = class065843.t();
            int n = class07323.N((class04782)class047822, (class06584)class065843, (class06584)this.d);
            if (n > 0) {
                this.N((byte)n);
            }
        }
    }

    protected class08007(class07078<? extends class08007> class070782, class07438 class074382, class07299 class072992, class06584 class065842, @Nullable class06584 class065843) {
        this(class070782, class074382.method_23317(), class074382.method_23320() - (double)0.1f, class074382.method_23321(), class072992, class065842, class065843);
        this.L((class07049)class074382);
    }

    public class06584 B() {
        return this.d;
    }

    public boolean Z() {
        return ((Byte)this.field_6011.N(m) & 1) != 0;
    }

    protected final class04891 i() {
        return this.t;
    }

    private void b() {
        this.N(false);
        class06889 class068892 = this.method_18798();
        this.method_18799(class068892.u((double)(this.field_5974.z() * 0.2f), (double)(this.field_5974.z() * 0.2f), (double)(this.field_5974.z() * 0.2f)));
        this.v = 0;
    }

    private boolean m() {
        return this.y() && this.method_73183().y(new class00734(this.method_73189(), this.method_73189()).M(0.06));
    }

    private void j() {
        if (this.l != null) {
            this.l.clear();
        }
        if (this.G != null) {
            this.G.clear();
        }
    }

    public byte U() {
        return (Byte)this.field_6011.N(P);
    }

    protected class04891 u() {
        return class04909.No;
    }

    protected boolean y() {
        return (Boolean)this.field_6011.N(s);
    }

    private void y(float f) {
        class06889 class068892 = this.method_18798();
        this.method_18799(class068892.L((double)f));
    }

    private void y(class06183 class061832) {
        while (this.method_5805()) {
            class06889 class068892 = this.method_73189();
            ArrayList<class06145> arrayList = new ArrayList<class06145>(this.y(class068892, class061832.y()));
            arrayList.sort(Comparator.comparingDouble(class061452 -> class068892.M(class061452.L().method_73189())));
            class06889 class068893 = ((class07089)Objects.requireNonNullElse(arrayList.isEmpty() ? null : (class06145)arrayList.getFirst(), class061832)).y();
            this.method_33574(class068893);
            this.method_64166(class068892, class068893);
            if (this.field_51994 != null && this.field_51994.i()) {
                this.method_60698();
            }
            if (arrayList.isEmpty()) {
                if (!this.method_5805() || class061832.N() == class07113.field_1333) break;
                this.y((class07089)class061832);
                this.field_64356 = true;
                break;
            }
            if (!this.method_5805() || this.field_5960) continue;
            class04252 class042522 = this.N(arrayList);
            this.field_64356 = true;
            if (this.U() > 0 && class042522 == class04252.N) continue;
            break;
        }
    }

    public void y(boolean bl) {
        this.N(1, bl);
    }

    protected Collection<class06145> y(class06889 class068892, class06889 class068893) {
        return class08038.N(this.method_73183(), (class07049)this, class068892, class068893, this.method_5829().y(this.method_18798()).M(1.0), this::N, false);
    }

    protected float E() {
        return 0.6f;
    }

    private void N(int n, boolean bl) {
        byte by = (Byte)this.field_6011.N(m);
        if (bl) {
            this.field_6011.N(m, (Object)((byte)(by | n)));
        } else {
            this.field_6011.N(m, (Object)((byte)(by & ~n)));
        }
    }

    protected void N(class07438 class074382, class07072 class070722) {
        float f;
        class07299 class072992;
        if (this.w != null && (class072992 = this.method_73183()) instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            f = class07323.u((class04782)class047822, (class06584)this.w, (class07049)class074382, (class07072)class070722, (float)0.0f);
        } else {
            f = 0.0f;
        }
        double d = f;
        if (d > 0.0) {
            double d2 = Math.max(0.0, 1.0 - class074382.method_45325(class05298.b));
            class06889 class068892 = this.method_18798().u(1.0, 0.0, 1.0).u().L(d * 0.6 * d2);
            if (class068892.B() > 0.0) {
                class074382.method_5762(class068892.M, 0.1, class068892.Z);
            }
        }
    }

    @Override
    protected void N(class06183 class061832) {
        class04782 class047822;
        this.j = this.method_73183().method_8320(class061832.u());
        super.N(class061832);
        class06584 class065842 = this.method_59958();
        class07299 class072992 = this.method_73183();
        if (class072992 instanceof class04782) {
            class047822 = (class04782)class072992;
            if (class065842 != null) {
                this.N(class047822, class061832, class065842);
            }
        }
        class047822 = this.method_18798();
        class072992 = new class06889(Math.signum(class047822.M), Math.signum(class047822.B), Math.signum(class047822.Z));
        class06889 class068892 = class072992.L((double)0.05f);
        this.method_33574(this.method_73189().u(class068892));
        this.method_18799(class06889.L);
        this.method_5783(this.i(), 1.0f, 1.2f / (this.field_5974.z() * 0.2f + 0.9f));
        this.N(true);
        this.L = 7;
        this.y(false);
        this.N((byte)0);
        this.N(class04909.No);
        this.j();
    }

    protected void N(class06584 class065842) {
        this.d = !class065842.R() ? class065842 : this.M();
    }

    public void N(class04891 class048912) {
        this.t = class048912;
    }

    @Override
    public void N(double d, double d2, double d3, float f, float f2) {
        super.N(d, d2, d3, f, f2);
        this.v = 0;
    }

    @Override
    protected void N(class06145 class061452) {
        class07299 class072992;
        super.N(class061452);
        class07049 class070492 = class061452.L();
        float f = (float)this.method_18798().M();
        double d = this.n;
        class07049 class070493 = this.z();
        class07072 class070722 = this.method_48923().N(this, (class07049)(class070493 != null ? class070493 : this));
        if (this.method_59958() != null && (class072992 = this.method_73183()) instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            d = class07323.N((class04782)class047822, (class06584)this.method_59958(), (class07049)class070492, (class07072)class070722, (float)((float)d));
        }
        int n = class04995.L((double)class04995.N((double)((double)f * d), (double)0.0, (double)2.147483647E9));
        if (this.U() > 0) {
            if (this.G == null) {
                this.G = new IntOpenHashSet(5);
            }
            if (this.l == null) {
                this.l = Lists.newArrayListWithCapacity((int)5);
            }
            if (this.G.size() < this.U() + 1) {
                this.G.add(class070492.method_5628());
            } else {
                this.method_31472();
                return;
            }
        }
        if (this.Z()) {
            long l = this.field_5974.y(n / 2 + 2);
            n = (int)Math.min(l + (long)n, Integer.MAX_VALUE);
        }
        if (class070493 instanceof class07438) {
            class072992 = (class07438)class070493;
            class072992.method_6114(class070492);
        }
        boolean bl = class070492.method_5864() == class07078.F;
        int n2 = class070492.method_20802();
        if (this.method_5809() && !bl) {
            class070492.method_5639(5.0f);
        }
        if (class070492.method_64420(class070722, (float)n)) {
            if (bl) {
                return;
            }
            if (class070492 instanceof class07438) {
                class04782 class047823;
                class07438 class074382 = (class07438)class070492;
                if (!this.method_73183().method_8608() && this.U() <= 0) {
                    class074382.method_6097(class074382.method_6022() + 1);
                }
                this.N(class074382, class070722);
                class07299 class072993 = this.method_73183();
                if (class072993 instanceof class04782) {
                    class047823 = (class04782)class072993;
                    class07323.N((class04782)class047823, (class07049)class074382, (class07072)class070722, (class06584)this.method_59958());
                }
                this.N(class074382);
                if (class074382 instanceof class08036 && class070493 instanceof class04770) {
                    class047823 = (class04770)class070493;
                    if (!this.method_5701() && class074382 != class047823) {
                        class047823.field_13987.method_14364((class00381)new class00503(class00503.B, 0.0f));
                    }
                }
                if (!class070492.method_5805() && this.l != null) {
                    this.l.add((class07049)class074382);
                }
                if (!this.method_73183().method_8608() && class070493 instanceof class04770) {
                    class047823 = (class04770)class070493;
                    if (this.l != null) {
                        class06912.q.N((class04770)class047823, this.l, this.w);
                    } else if (!class070492.method_5805()) {
                        class06912.q.N((class04770)class047823, List.of(class070492), this.w);
                    }
                }
            }
            this.method_5783(this.t, 1.0f, 1.2f / (this.field_5974.z() * 0.2f + 0.9f));
            if (this.U() <= 0) {
                this.method_31472();
            }
        } else {
            class070492.method_20803(n2);
            this.N(class04252.y, class070492, (class08372<class07049>)this.i, false);
            this.method_18799(this.method_18798().L(0.2));
            class07299 class072994 = this.method_73183();
            if (class072994 instanceof class04782) {
                class04782 class047824 = (class04782)class072994;
                if (this.method_18798().B() < 1.0E-7) {
                    if (this.y == class08008.field_7593) {
                        this.method_5699(class047824, this.R(), 0.1f);
                    }
                    this.method_31472();
                }
            }
        }
    }

    public void N(float f) {
        this.N((double)(f * 2.0f) + this.field_5974.N((double)this.method_73183().y().N() * 0.11, 0.57425));
    }

    protected boolean N(class08036 class080362) {
        return switch (this.y.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> false;
            case 1 -> class080362.method_31548().M(this.R());
            case 2 -> class080362.method_56992();
        };
    }

    protected @Nullable class06145 N(class06889 class068892, class06889 class068893) {
        return class08038.N(this.method_73183(), this, class068892, class068893, this.method_5829().y(this.method_18798()).M(1.0), this::N);
    }

    @Override
    public void N(class06581 class065812) {
        this.w = null;
    }

    protected void N(class07438 class074382) {
    }

    protected void N(boolean bl) {
        this.field_6011.N(s, (Object)bl);
    }

    @Override
    protected boolean N(class07049 class070492) {
        class07049 class070493;
        if (class070492 instanceof class08036 && (class070493 = this.z()) instanceof class08036 && !((class08036)class070493).method_7256((class08036)class070492)) {
            return false;
        }
        return super.N(class070492) && (this.G == null || !this.G.contains(class070492.method_5628()));
    }

    private void N(byte by) {
        this.field_6011.N(P, (Object)by);
    }

    private class04252 N(Collection<class06145> collection) {
        for (class06145 class061452 : collection) {
            class04252 class042522 = this.y((class07089)class061452);
            if (this.method_5805() && class042522 == class04252.N) continue;
            return class042522;
        }
        return class04252.N;
    }

    protected void N(class04782 class047822, class06183 class061832, class06584 class065842) {
        class06889 class068892 = class061832.u().method_60913(class061832.y());
        class07049 class070492 = this.z();
        class07323.N((class04782)class047822, (class06584)class065842, (class07438)(class070492 instanceof class07438 ? (class07438)class070492 : null), (class07049)this, null, (class06889)class068892, (class00500)class047822.method_8320(class061832.u()), class065812 -> {
            this.w = null;
        });
    }

    private void N(class06889 class068892) {
        class06889 class068893 = this.method_18798();
        for (int i = 0; i < 4; ++i) {
            float f = 0.25f;
            this.method_73183().method_8406((class07126)class07107.u, class068892.M - class068893.M * 0.25, class068892.B - class068893.B * 0.25, class068892.Z - class068893.Z * 0.25, class068893.M, class068893.B, class068893.Z);
        }
    }

    public void N(double d) {
        this.n = d;
    }

    public boolean W() {
        if (!this.method_73183().method_8608()) {
            return this.field_5960;
        }
        return ((Byte)this.field_6011.N(m) & 2) != 0;
    }

    protected class06584 R() {
        return this.d.t();
    }

    @Override
    protected boolean v_() {
        return true;
    }
}

