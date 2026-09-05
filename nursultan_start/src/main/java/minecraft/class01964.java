/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Dynamic
 *  minecraft.class00143
 *  minecraft.class00500
 *  minecraft.class00717
 *  minecraft.class00753
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class01210
 *  minecraft.class01226
 *  minecraft.class01289
 *  minecraft.class01312
 *  minecraft.class01325
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class02607
 *  minecraft.class03289
 *  minecraft.class03556
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04396
 *  minecraft.class04425
 *  minecraft.class04643
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class05378
 *  minecraft.class05456
 *  minecraft.class05781
 *  minecraft.class05946
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06273
 *  minecraft.class06289
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class06898
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07072
 *  minecraft.class07077
 *  minecraft.class07078
 *  minecraft.class07082
 *  minecraft.class07105
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07438
 *  minecraft.class07475
 *  minecraft.class07633
 *  minecraft.class08036
 *  minecraft.class08700
 */
package minecraft;

import com.mojang.serialization.Dynamic;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import minecraft.class00143;
import minecraft.class00500;
import minecraft.class00717;
import minecraft.class00753;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class01210;
import minecraft.class01226;
import minecraft.class01289;
import minecraft.class01312;
import minecraft.class01325;
import minecraft.class01972;
import minecraft.class01984;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class02607;
import minecraft.class03289;
import minecraft.class03556;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04396;
import minecraft.class04425;
import minecraft.class04643;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class05378;
import minecraft.class05456;
import minecraft.class05781;
import minecraft.class05946;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06273;
import minecraft.class06289;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class06898;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07072;
import minecraft.class07077;
import minecraft.class07078;
import minecraft.class07082;
import minecraft.class07105;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07438;
import minecraft.class07475;
import minecraft.class07633;
import minecraft.class08036;
import minecraft.class08700;

public class class01964
extends class07633 {
    private static final int R = 1700;
    private static final int M = 6000;
    private static final int B = 30;
    private static final int Z = 120;
    private static final int X = 48000;
    private static final float p = 0.4f;
    private static final class01325 F = class01325.y((float)class07078.yb.z(), (float)(class07078.yb.U() - 0.4f)).y(0.81f);
    private static final class02131<class01972> A = class03289.N(class01964.class, (class04383)class02154.J);
    private static final class02131<Integer> f = class03289.N(class01964.class, (class04383)class02154.y);
    public final class04396 N = new class04396();
    public final class04396 y = new class04396();
    public final class04396 L = new class04396();
    public final class04396 u = new class04396();
    public final class04396 i = new class04396();

    private class01972 w() {
        return (class01972)((Object)this.field_6011.N(A));
    }

    public void X() {
        super.X();
        if (this.method_5809() || this.method_5799()) {
            this.N(class04425.field_18, 0.0f);
        }
    }

    private class01964 Q() {
        this.method_5783(class04909.YK, 1.0f, this.method_6109() ? 1.3f : 1.0f);
        return this;
    }

    public void method_5674(class02131<?> class021312) {
        if (A.equals(class021312)) {
            class01972 class019722 = this.w();
            this.Y();
            switch (class019722.ordinal()) {
                case 2: {
                    this.y.y(this.field_6012);
                    break;
                }
                case 3: {
                    this.L.y(this.field_6012);
                    break;
                }
                case 5: {
                    this.u.y(this.field_6012);
                    break;
                }
                case 6: {
                    this.i.y(this.field_6012);
                    break;
                }
                case 1: {
                    this.N.y(this.field_6012);
                }
            }
            this.method_18382();
        }
        super.method_5674(class021312);
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(A, (Object)class01972.field_42665);
        class042932.N(f, (Object)0);
    }

    public void method_5773() {
        switch (this.w().ordinal()) {
            case 5: {
                this.N(this.u).o();
                break;
            }
            case 4: {
                this.NO();
            }
        }
        super.method_5773();
    }

    protected void method_5712(class07209 class072092, class00500 class005002) {
        this.method_5783(class04909.YO, 0.15f, 1.0f);
    }

    public class01964(class07078<? extends class07633> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.f().N(true);
        this.N(class04425.field_18, -1.0f);
        this.N(class04425.field_36432, -1.0f);
        this.N(class04425.field_43351, -1.0f);
    }

    public static class05300 B() {
        return class07633.Ne().N(class05298.l, (double)0.1f).N(class05298.n, 14.0);
    }

    private class01964 I() {
        this.field_6011.N(f, (Object)(this.field_6012 + 120));
        this.method_73183().method_8421((class07049)this, (byte)63);
        return this;
    }

    protected class04891 s() {
        return Set.of(class01972.field_42670, class01972.field_42669).contains((Object)this.w()) ? null : class04909.YI;
    }

    public boolean n() {
        return this.w() == class01972.field_42670 || this.w() == class01972.field_42669;
    }

    private class07209 l() {
        class06889 class068892 = this.d();
        return class07209.method_49637((double)class068892.N(), (double)(this.method_23318() + (double)0.2f), (double)class068892.L());
    }

    private class06889 d() {
        return this.method_73189().i(this.method_5663().L(2.25));
    }

    public void a() {
        this.N(class04425.field_18, -1.0f);
    }

    public boolean m() {
        return ((class07438)this).fields_12212a028292fd3c078969e3ee4c71d9e8_1.L(class05378.A).orElse(false);
    }

    private void o() {
        class04782 class047822;
        class07299 class072992;
        block3: {
            block2: {
                class072992 = this.method_73183();
                if (!(class072992 instanceof class04782)) break block2;
                class047822 = (class04782)class072992;
                if ((Integer)this.field_6011.N(f) == this.field_6012) break block3;
            }
            return;
        }
        class072992 = this.l();
        this.method_64169(class047822, class06273.NJ, (arg_0, arg_1) -> this.N((class07209)class072992, arg_0, arg_1));
        this.method_5783(class04909.Yq, 1.0f, 1.0f);
    }

    Optional<class07209> t() {
        return IntStream.range(0, 5).mapToObj(n -> class05456.N((class07475)this, (int)(10 + 2 * n), (int)3)).filter(Objects::nonNull).map(class07209::method_49638).filter(class072092 -> this.method_73183().method_8621().N(class072092)).map(class07209::method_10074).filter(this::N).findFirst();
    }

    public boolean v() {
        return !this.m() && !this.Nk() && !this.method_5799() && !this.NX() && this.method_24828() && !this.method_5765() && !this.g_();
    }

    public void y(boolean bl) {
        this.u(bl ? -48000 : 0);
    }

    private class01964 y(class07209 class072092) {
        List list = this.NQ().limit(20L).collect(Collectors.toList());
        list.add(0, class06289.N((class05946)this.method_73183().method_27983(), (class07209)class072092));
        this.method_18868().N(class05378.yy, list);
        return this;
    }

    public class07077 y(class04782 class047822, class07077 class070772) {
        return (class07077)class07078.yb.N((class07299)class047822, class06113.field_16466);
    }

    private class01964 y(class01972 class019722) {
        this.field_6011.N(A, (Object)class019722);
        return this;
    }

    public class01964 N(class01972 class019722) {
        switch (class019722.ordinal()) {
            case 0: {
                this.y(class01972.field_42665);
                break;
            }
            case 2: {
                this.y(class01972.field_42667).Q();
                break;
            }
            case 3: {
                this.method_5783(class04909.YV, 1.0f, 1.0f);
                this.y(class01972.field_42668);
                break;
            }
            case 4: {
                this.y(class01972.field_42669);
                break;
            }
            case 5: {
                this.y(class01972.field_42670).I();
                break;
            }
            case 6: {
                this.method_5783(class04909.Yc, 1.0f, 1.0f);
                this.y(class01972.field_42671);
                break;
            }
            case 1: {
                this.method_5783(class04909.YX, 1.0f, 1.0f);
                this.y(class01972.field_42666);
            }
        }
        return this;
    }

    public boolean N(class07633 class076332) {
        if (class076332 instanceof class01964) {
            class01964 class019642 = (class01964)class076332;
            Set<class01972> set = Set.of(class01972.field_42665, class01972.field_42667, class01972.field_42666);
            return set.contains((Object)this.w()) && set.contains((Object)class019642.w()) && super.N(class076332);
        }
        return false;
    }

    public class07082 N(class08036 class080362, class07050 class070502) {
        class06584 class065842 = class080362.method_5998(class070502);
        boolean bl = this.N(class065842);
        class07082 class070822 = super.N(class080362, class070502);
        if (class070822.N() && bl) {
            this.O();
        }
        return class070822;
    }

    public class01964 N(boolean bl) {
        if (bl) {
            this.y(this.method_23312());
        }
        return this;
    }

    private /* synthetic */ void N(class07209 class072092, class04782 class047822, class06584 class065842) {
        class00717 class007172 = new class00717(this.method_73183(), (double)class072092.method_10263(), (double)class072092.method_10264(), (double)class072092.method_10260(), class065842);
        class007172.L();
        class047822.method_8649((class07049)class007172);
    }

    private boolean N(class07209 class072092) {
        return this.method_73183().method_8320(class072092).N(class01210.LK) && this.NQ().noneMatch(class062892 -> class06289.N((class05946)this.method_73183().method_27983(), (class07209)class072092).equals(class062892)) && Optional.ofNullable(this.f().N(class072092, 1)).map(class00143::z).orElse(false) != false;
    }

    private class01964 N(class04396 class043962) {
        if (class043962.N((float)this.field_6012) > 1700L && class043962.N((float)this.field_6012) < 6000L) {
            class07209 class072092 = this.l();
            class00500 class005002 = this.method_73183().method_8320(class072092.method_10074());
            if (class005002.b() != class06898.field_11455) {
                for (int i = 0; i < 30; ++i) {
                    class06889 class068892 = class06889.y((class00753)class072092).y(0.0, (double)-0.65f, 0.0);
                    this.method_73183().method_8406((class07126)new class07105(class07107.y, class005002), class068892.M, class068892.B, class068892.Z, 0.0, 0.0, 0.0);
                }
                if (this.field_6012 % 10 == 0) {
                    this.method_73183().method_8486(this.method_23317(), this.method_23318(), this.method_23321(), class005002.O().R(), this.method_5634(), 0.5f, 0.5f, false);
                }
            }
        }
        if (this.field_6012 % 10 == 0) {
            this.method_73183().N((class03556)class01194.n, this.l(), class01164.N((class07049)this));
        }
        return this;
    }

    protected void N(class04782 class047822) {
        class04643 class046432 = class08700.N();
        class046432.N("snifferBrain");
        this.method_18868().N(class047822, (class07438)this);
        class046432.y("snifferActivityUpdate");
        class01984.y(this);
        class046432.L();
        super.N(class047822);
    }

    public boolean N(class06584 class065842) {
        return class065842.N(class01226.NY);
    }

    public void N(class04782 class047822, class07633 class076332) {
        class06584 class065842 = new class06584((class07310)class06570.Ez);
        class00717 class007172 = new class00717((class07299)class047822, this.method_73189().N(), this.method_73189().y(), this.method_73189().L(), class065842);
        class007172.L();
        this.N(class047822, class076332, null);
        this.method_5783(class04909.Ya, 1.0f, (this.field_5974.z() - this.field_5974.z()) * 0.2f + 0.5f);
        class047822.method_8649((class07049)class007172);
    }

    public boolean W() {
        return this.w() == class01972.field_42669;
    }

    protected void O() {
        this.method_73183().method_43129(null, (class07049)this, class04909.Yg, class04911.field_15254, 1.0f, class04995.y((class06069)this.method_73183().field_9229, (float)0.8f, (float)1.2f));
    }

    boolean G() {
        return !this.Nk() && !this.m() && !this.method_6109() && !this.method_5799() && this.method_24828() && !this.method_5765() && this.N(this.l().method_10074());
    }

    public int NR() {
        return 50;
    }

    private void Y() {
        this.u.N();
        this.L.N();
        this.i.N();
        this.N.N();
        this.y.N();
    }

    private void NO() {
        if (this.method_73183().method_8608() && this.field_6012 % 20 == 0) {
            this.method_73183().method_8486(this.method_23317(), this.method_23318(), this.method_23321(), class04909.Ye, this.method_5634(), 1.0f, 1.0f, false);
        }
    }

    public boolean aa_() {
        return true;
    }

    public class06889[] ab_() {
        return class02607.N((class07049)this, (double)-0.01, (double)0.63, (double)0.38, (double)1.15);
    }

    private Stream<class06289> NQ() {
        return this.method_18868().L(class05378.yy).stream().flatMap(Collection::stream);
    }

    public class05781<class01964> method_28306() {
        return class01289.N(class01984.y, class01984.N);
    }

    public class04891 method_6002() {
        return class04909.Yo;
    }

    public class01325 method_55694(class01312 class013122) {
        if (this.w() == class01972.field_42670) {
            return F.N(this.method_17825());
        }
        return super.method_55694(class013122);
    }

    public void method_6043() {
        super.method_6043();
        if (this.q.L() > 0.0 && this.method_18798().z() < 0.01) {
            this.method_5724(0.1f, new class06889(0.0, 0.0, 1.0));
        }
    }

    public class01289<class01964> method_18868() {
        return super.method_18868();
    }

    public void method_6078(class07072 class070722) {
        this.N(class01972.field_42665);
        super.method_6078(class070722);
    }

    public class04891 method_6011(class07072 class070722) {
        return class04909.YJ;
    }

    public class01289<?> method_18867(Dynamic<?> dynamic) {
        return class01984.N((class01289<class01964>)this.method_28306().N(dynamic));
    }
}

