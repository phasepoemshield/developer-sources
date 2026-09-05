/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10473
 *  Nursultan.class10475
 *  Nursultan.class10476
 *  minecraft.class00412
 *  minecraft.class00717
 *  minecraft.class00751
 *  minecraft.class01001
 *  minecraft.class02055
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class03289
 *  minecraft.class04227
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04782
 *  minecraft.class06069
 *  minecraft.class06091
 *  minecraft.class06113
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07052
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07085
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class07446
 *  minecraft.class07473
 *  minecraft.class08299
 *  minecraft.class08329
 *  net.caffeinemc.mods.lithium.common.world.LithiumData
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10473;
import Nursultan.class10475;
import Nursultan.class10476;
import java.util.function.Predicate;
import minecraft.class00412;
import minecraft.class00717;
import minecraft.class00751;
import minecraft.class01001;
import minecraft.class02055;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class03289;
import minecraft.class04227;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04782;
import minecraft.class04845;
import minecraft.class04868;
import minecraft.class04877;
import minecraft.class04891;
import minecraft.class06069;
import minecraft.class06091;
import minecraft.class06113;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07052;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07085;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07446;
import minecraft.class07473;
import minecraft.class08299;
import minecraft.class08329;
import net.caffeinemc.mods.lithium.common.world.LithiumData;
import org.jspecify.annotations.Nullable;

public abstract class class04882
extends class06091 {
    protected static final class02131<Boolean> L = class03289.N(class04882.class, (class04383)class02154.U);
    public static Predicate<class00717> u = class007172 -> !class007172.R() && class007172.method_5805() && class06584.N((class06584)class007172.N(), (class06584)class04877.N((class02055<class00412>)class007172.method_56673().L(class04227.NF)));
    private static final int N = 0;
    private static final boolean y = false;
    public @Nullable class04877 i;
    private int R = 0;
    private boolean M = false;
    private int B;

    protected void w() {
        ((class07438)this).fields_6212a028292fd3c078969e3ee4c71d9e8_2 = ((class07438)this).fields_6212a028292fd3c078969e3ee4c71d9e8_2 + 2;
    }

    public static /* synthetic */ boolean L(class04882 class048822) {
        return class048822.o();
    }

    public @Nullable class04877 K() {
        return this.i;
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(L, (Object)false);
    }

    public boolean method_64397(class04782 class047822, class07072 class070722, float f) {
        if (this.NQ()) {
            this.K().j();
        }
        return super.method_64397(class047822, class070722, f);
    }

    public void method_5652(class08329 class083292) {
        class07299 class072992;
        super.method_5652(class083292);
        class083292.N("Wave", this.R);
        class083292.N("CanJoinRaid", this.M);
        if (this.i != null && (class072992 = this.method_73183()) instanceof class04782) {
            ((class04782)class072992).method_19495().N(this.i).ifPresent(n -> class083292.N("RaidId", n));
        }
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.R = class082992.N("Wave", 0);
        this.M = class082992.N("CanJoinRaid", false);
        class07299 class072992 = this.method_73183();
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            class082992.i("RaidId").ifPresent(n -> {
                this.i = class047822.method_19495().N((int)n);
                if (this.i != null) {
                    this.i.N(class047822, this.R, this, false);
                    if (this.Q()) {
                        this.i.N(this.R, this);
                    }
                }
            });
        }
    }

    public class04882(class07078<? extends class04882> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    public void Z(boolean bl) {
        this.M = bl;
    }

    public boolean V() {
        class00751 class007512;
        class06584 class065842 = this.method_6118(class07085.field_6169);
        boolean bl = !class065842.R() && class06584.N((class06584)class065842, (class06584)this.N((class02055)(class007512 = this.method_56673().L(class04227.NF))));
        boolean bl2 = this.Q();
        return bl && bl2;
    }

    public boolean e() {
        class07299 class072992 = this.method_73183();
        if (!(class072992 instanceof class04782)) {
            return false;
        }
        class04782 class047822 = (class04782)class072992;
        return this.K() != null || class047822.method_19502(this.method_24515()) != null;
    }

    public static /* synthetic */ class06069 i(class04882 class048822) {
        return class048822.field_5974;
    }

    public boolean q() {
        return this.M;
    }

    public void z(boolean bl) {
        this.field_6011.N(L, (Object)bl);
    }

    public static /* synthetic */ class06069 u(class04882 class048822) {
        return class048822.field_5974;
    }

    public void y(int n) {
        this.B = n;
    }

    private static /* synthetic */ boolean y(class00717 class007172) {
        class06584 class065842 = ((LithiumData)class007172.method_73183()).lithium$getData().ominousBanner();
        if (class065842 == null) {
            class065842 = class04877.N((class02055<class00412>)class007172.method_56673().L(class04227.NF));
        }
        return !class007172.R() && class007172.method_5805() && class06584.N((class06584)class007172.N(), (class06584)class065842);
    }

    public static /* synthetic */ class06069 y(class04882 class048822) {
        return class048822.field_5974;
    }

    public abstract class04891 E();

    public boolean N(double d) {
        if (this.K() == null) {
            return super.N(d);
        }
        return false;
    }

    public @Nullable class07446 N(class01001 class010012, class07052 class070522, class06113 class061132, @Nullable class07446 class074462) {
        this.Z(this.method_5864() != class07078.yp || class061132 != class06113.field_16459);
        return super.N(class010012, class070522, class061132, class074462);
    }

    public static /* synthetic */ class06069 N(class04882 class048822) {
        return class048822.field_5974;
    }

    public void N(@Nullable class04877 class048772) {
        this.i = class048772;
    }

    public void N(class04782 class047822, class00717 class007172) {
        class00751 class007512;
        boolean bl;
        class06584 class065842 = class007172.N();
        boolean bl2 = bl = this.NQ() && this.K().y(this.NO()) != null;
        if (this.NQ() && !bl && class06584.N((class06584)class065842, (class06584)this.N((class02055)(class007512 = this.method_56673().L(class04227.NF))))) {
            class07085 class070852 = class07085.field_6169;
            class06584 class065843 = this.method_6118(class070852);
            double d = this.NE().y(class070852);
            if (!class065843.R() && (double)Math.max(this.field_5974.z() - 0.1f, 0.0f) < d) {
                this.method_5775(class047822, class065843);
            }
            this.method_29499(class007172);
            this.method_5673(class070852, class065842);
            this.method_6103((class07049)class007172, class065842.c());
            class007172.method_31472();
            this.K().N(this.NO(), this);
            this.M(true);
        } else {
            super.N(class047822, class007172);
        }
    }

    public void N(int n) {
        this.R = n;
    }

    private class06584 N(class02055 class020552) {
        class06584 class065842 = ((LithiumData)this.method_73183()).lithium$getData().ominousBanner();
        if (class065842 == null) {
            class065842 = class04877.N((class02055<class00412>)class020552);
        }
        return class065842;
    }

    public abstract void N(class04782 var1, int var2, boolean var3);

    public boolean O() {
        return !this.NQ();
    }

    public boolean Nu() {
        return super.Nu() || this.K() != null;
    }

    public int NO() {
        return this.R;
    }

    public void l_() {
        super.l_();
        this.e.N(1, (class07473)new class10473(this, this));
        this.e.N(3, new class04845<class04882>(this));
        this.e.N(4, (class07473)new class10476(this, (double)1.05f, 1));
        this.e.N(5, (class07473)new class10475(this, this));
    }

    public boolean NQ() {
        return this.K() != null && this.K().T();
    }

    public boolean Ng() {
        return (Boolean)this.field_6011.N(L);
    }

    public int NI() {
        return this.B;
    }

    public void method_6007() {
        Object object = this.method_73183();
        if (object instanceof class04782) {
            class04782 class047822 = (class04782)object;
            if (this.method_5805()) {
                object = this.K();
                if (this.q()) {
                    if (object == null) {
                        class04877 class048772;
                        if (this.method_73183().N() % 20L == 0L && (class048772 = class047822.method_19502(this.method_24515())) != null && class04868.N(this)) {
                            class048772.N(class047822, class048772.z(), this, null, true);
                        }
                    } else {
                        class07438 class074382 = this.T();
                        if (class074382 != null && (class074382.method_5864() == class07078.Ly || class074382.method_5864() == class07078.Nn)) {
                            ((class07438)this).fields_6212a028292fd3c078969e3ee4c71d9e8_2 = 0;
                        }
                    }
                }
            }
        }
        super.method_6007();
    }

    public void method_6078(class07072 class070722) {
        class07299 class072992 = this.method_73183();
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            class072992 = class070722.u();
            class04877 class048772 = this.K();
            if (class048772 != null) {
                if (this.Q()) {
                    class048772.L(this.NO());
                }
                if (class072992 != null && class072992.method_5864() == class07078.Ly) {
                    class048772.N((class07049)class072992);
                }
                class048772.N(class047822, this, false);
            }
        }
        super.method_6078(class070722);
    }
}

