/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11390
 *  Nursultan.class11938
 *  baritone.utils.accessor.IFireworkRocketEntity
 *  it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair
 *  minecraft.class00753
 *  minecraft.class01194
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class02484
 *  minecraft.class02813
 *  minecraft.class02827
 *  minecraft.class03289
 *  minecraft.class03556
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class05640
 *  minecraft.class05835
 *  minecraft.class05849
 *  minecraft.class05862
 *  minecraft.class06145
 *  minecraft.class06183
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07089
 *  minecraft.class07107
 *  minecraft.class07113
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07438
 *  minecraft.class07451
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08400
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import Nursultan.class11390;
import Nursultan.class11938;
import baritone.utils.accessor.IFireworkRocketEntity;
import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.List;
import java.util.OptionalInt;
import minecraft.class00753;
import minecraft.class01194;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class02484;
import minecraft.class02813;
import minecraft.class02827;
import minecraft.class03289;
import minecraft.class03556;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class05640;
import minecraft.class05835;
import minecraft.class05849;
import minecraft.class05862;
import minecraft.class06145;
import minecraft.class06183;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07089;
import minecraft.class07107;
import minecraft.class07113;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07438;
import minecraft.class07451;
import minecraft.class08005;
import minecraft.class08038;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08400;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class08006
extends class08005
implements class05640,
IFireworkRocketEntity {
    private static final class02131<class06584> N = class03289.N(class08006.class, (class04383)class02154.B);
    private static final class02131<OptionalInt> y = class03289.N(class08006.class, (class04383)class02154.n);
    private static final class02131<Boolean> L = class03289.N(class08006.class, (class04383)class02154.U);
    private static final int u = 0;
    private static final int R = 0;
    private static final boolean M = false;
    private int B = 0;
    private int Z = 0;
    private @Nullable class07438 z;
    private Double U;

    public class06584 L() {
        return (class06584)this.field_6011.N(N);
    }

    private void L(class04782 class047822) {
        float f = 0.0f;
        List<class02827> var3 = this.R();
        if (!var3.isEmpty()) {
            f = 5.0f + (float)(var3.size() * 2);
        }
        if (f > 0.0f) {
            if (this.z != null) {
                this.z.method_64397(class047822, this.method_48923().N(this, this.z()), 5.0f + (float)(var3.size() * 2));
            }
            double d = 5.0;
            class06889 class068892 = this.method_73189();
            for (class07438 class074382 : this.method_73183().N(class07438.class, this.method_5829().M(5.0))) {
                if (class074382 == this.z || this.method_5858((class07049)class074382) > 25.0) continue;
                boolean bl = false;
                for (int i = 0; i < 2; ++i) {
                    class06889 class068893 = new class06889(class074382.method_23317(), class074382.method_23323(0.5 * (double)i), class074382.method_23321());
                    if (this.method_73183().N(new class05862(class068892, class068893, class05849.field_17558, class05835.field_1348, (class07049)this)).N() != class07113.field_1333) continue;
                    bl = true;
                    break;
                }
                if (!bl) continue;
                float f2 = f * (float)Math.sqrt((5.0 - (double)this.method_5739((class07049)class074382)) / 5.0);
                class074382.method_64397(class047822, this.method_48923().N(this, this.z()), f2);
            }
        }
    }

    private static class06584 M() {
        return new class06584((class07310)class06570.GJ);
    }

    protected void method_5693(class04293 class042932) {
        class042932.N(N, (Object)class08006.M());
        class042932.N(y, (Object)OptionalInt.empty());
        class042932.N(L, (Object)false);
    }

    @Override
    public void method_5773() {
        class07089 class070892;
        class06889 class068892;
        class06889 class068893;
        this.N((CallbackInfo)null);
        super.method_5773();
        if (this.i()) {
            if (this.z == null) {
                ((OptionalInt)this.field_6011.N(y)).ifPresent(n -> {
                    class07049 class070492 = this.method_73183().method_8469(n);
                    if (class070492 instanceof class07438) {
                        this.z = (class07438)class070492;
                    }
                });
            }
            if (this.z != null) {
                if (this.z.method_6128()) {
                    class068893 = this.z.method_5720();
                    double d = this.N(1.5);
                    double d2 = 0.1;
                    class06889 class068894 = this.z.method_18798();
                    this.z.method_18799(class068894.y(class068893.M * 0.1 + (class068893.M * this.N(1.5) - class068894.M) * 0.5, class068893.B * 0.1 + (class068893.B * this.N(1.5) - class068894.B) * 0.5, class068893.Z * 0.1 + (class068893.Z * this.N(1.5) - class068894.Z) * 0.5));
                    class068892 = this.z.method_40123(class06570.GJ);
                } else {
                    class068892 = class06889.L;
                }
                this.method_5814(this.z.method_23317() + class068892.M, this.z.method_23318() + class068892.B, this.z.method_23321() + class068892.Z);
                this.method_18799(this.z.method_18798());
            }
            class070892 = class08038.N((class07049)this, this::N);
        } else {
            if (!this.y()) {
                double d = this.field_5976 ? 1.0 : 1.15;
                this.method_18799(this.method_18798().u(d, 1.0, d).y(0.0, 0.04, 0.0));
            }
            class068892 = this.method_18798();
            class070892 = class08038.N((class07049)this, this::N);
            this.method_5784(class07451.field_6308, class068892);
            this.method_61409();
            this.method_18799(class068892);
        }
        if (!this.field_5960 && this.method_5805() && class070892.N() != class07113.field_1333) {
            this.y(class070892);
            this.field_64356 = true;
        }
        this.T();
        if (this.B == 0 && !this.method_5701()) {
            this.method_73183().method_43128(null, this.method_23317(), this.method_23318(), this.method_23321(), class04909.UO, class04911.field_15256, 3.0f, 1.0f);
        }
        ++this.B;
        if (this.method_73183().method_8608() && this.B % 2 < 2) {
            this.method_73183().method_8406((class07126)class07107.g, this.method_23317(), this.method_23318(), this.method_23321(), this.field_5974.E() * 0.05, -this.method_18798().B * 0.5, this.field_5974.E() * 0.05);
        }
        if (this.B > this.Z && (class068893 = this.method_73183()) instanceof class04782) {
            class068892 = (class04782)class068893;
            this.y((class04782)class068892);
        }
    }

    @Override
    protected void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N("Life", this.B);
        class083292.N("LifeTime", this.Z);
        class083292.N("FireworksItem", class06584.y, (Object)this.L());
        class083292.N("ShotAtAngle", ((Boolean)this.field_6011.N(L)).booleanValue());
    }

    public boolean method_5727(double d, double d2, double d3) {
        return super.method_5727(d, d2, d3) && !this.i();
    }

    public boolean method_5640(double d) {
        return d < 4096.0 && !this.i();
    }

    @Override
    protected void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.B = class082992.N("Life", 0);
        this.Z = class082992.N("LifeTime", 0);
        this.field_6011.N(N, (Object)class082992.N("FireworksItem", class06584.y).orElse(class08006.M()));
        this.field_6011.N(L, (Object)class082992.N("ShotAtAngle", false));
    }

    public void method_5711(byte by) {
        if (by == 17 && this.method_73183().method_8608()) {
            class06889 class068892 = this.method_18798();
            this.method_73183().method_8547(this.method_23317(), this.method_23318(), this.method_23321(), class068892.M, class068892.B, class068892.Z, this.R());
        }
        super.method_5711(by);
    }

    public boolean method_5732() {
        return false;
    }

    public class08006(class07078<? extends class08006> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    public class08006(class07299 class072992, double d, double d2, double d3, class06584 class065842) {
        super((class07078<? extends class08005>)class07078.Nu, class072992);
        this.B = 0;
        this.method_5814(d, d2, d3);
        this.field_6011.N(N, (Object)class065842.t());
        int n = 1;
        class02813 class028132 = (class02813)class065842.method_58694(class02484.NT);
        if (class028132 != null) {
            n += class028132.N();
        }
        this.method_18800(this.field_5974.N(0.0, 0.002297), 0.05, this.field_5974.N(0.0, 0.002297));
        this.Z = 10 * n + this.field_5974.y(6) + this.field_5974.y(7);
    }

    public class08006(class07299 class072992, @Nullable class07049 class070492, double d, double d2, double d3, class06584 class065842) {
        this(class072992, d, d2, d3, class065842);
        this.L(class070492);
    }

    public class08006(class07299 class072992, class06584 class065842, class07438 class074382) {
        this(class072992, (class07049)class074382, class074382.method_23317(), class074382.method_23318(), class074382.method_23321(), class065842);
        this.field_6011.N(y, (Object)OptionalInt.of(class074382.method_5628()));
        this.z = class074382;
    }

    public class08006(class07299 class072992, class06584 class065842, class07049 class070492, double d, double d2, double d3, boolean bl) {
        this(class072992, class065842, d, d2, d3, bl);
        this.L(class070492);
    }

    public class08006(class07299 class072992, class06584 class065842, double d, double d2, double d3, boolean bl) {
        this(class072992, d, d2, d3, class065842);
        this.field_6011.N(L, (Object)bl);
    }

    private boolean i() {
        return ((OptionalInt)this.field_6011.N(y)).isPresent();
    }

    private boolean u() {
        return !this.R().isEmpty();
    }

    public boolean y() {
        return (Boolean)this.field_6011.N(L);
    }

    private void y(class04782 class047822) {
        class047822.method_8421((class07049)this, (byte)17);
        this.method_32875((class03556)class01194.G, this.z());
        this.L(class047822);
        this.method_31472();
    }

    private void N(CallbackInfo callbackInfo) {
        this.U = null;
    }

    private double N(double d) {
        if (this.U == null) {
            class11390 class113902 = class11390.y((double)d);
            class11938.L().L((Object)class113902);
            this.U = class113902.N();
        }
        return this.U;
    }

    @Override
    protected void N(class06145 class061452) {
        super.N(class061452);
        class07299 class072992 = this.method_73183();
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            this.y(class047822);
        }
    }

    @Override
    protected void N(class06183 class061832) {
        class07209 class072092 = new class07209((class00753)class061832.u());
        this.method_73183().method_8320(class072092).N(this.method_73183(), class072092, (class07049)this, class08400.N, true);
        class07299 class072992 = this.method_73183();
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            if (this.u()) {
                this.y(class047822);
            }
        }
        super.N(class061832);
    }

    public class07438 getBoostedEntity() {
        class07049 class070492;
        if (this.i() && this.z == null && (class070492 = this.method_73183().method_8469(((OptionalInt)this.field_6011.N(y)).getAsInt())) instanceof class07438) {
            this.z = (class07438)class070492;
        }
        return this.z;
    }

    private List<class02827> R() {
        class02813 class028132 = (class02813)((class06584)this.field_6011.N(N)).method_58694(class02484.NT);
        return class028132 != null ? class028132.y() : List.of();
    }

    @Override
    public DoubleDoubleImmutablePair a_(class07438 class074382, class07072 class070722) {
        double d = class074382.method_73189().M - this.method_73189().M;
        double d2 = class074382.method_73189().Z - this.method_73189().Z;
        return DoubleDoubleImmutablePair.of((double)d, (double)d2);
    }
}

