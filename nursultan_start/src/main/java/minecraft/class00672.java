/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.BiMap
 *  com.google.common.collect.Sets
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class00891
 *  minecraft.class01111
 *  minecraft.class01194
 *  minecraft.class02674
 *  minecraft.class02859
 *  minecraft.class03556
 *  minecraft.class04293
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class05487
 *  minecraft.class05989
 *  minecraft.class06069
 *  minecraft.class06889
 *  minecraft.class06912
 *  minecraft.class07049
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07086
 *  minecraft.class07209
 *  minecraft.class07218
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08299
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.BiMap;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import minecraft.class00500;
import minecraft.class00734;
import minecraft.class00753;
import minecraft.class00891;
import minecraft.class01111;
import minecraft.class01194;
import minecraft.class02674;
import minecraft.class02859;
import minecraft.class03556;
import minecraft.class04293;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class05487;
import minecraft.class05989;
import minecraft.class06069;
import minecraft.class06889;
import minecraft.class06912;
import minecraft.class07049;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07086;
import minecraft.class07209;
import minecraft.class07218;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08299;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;

public class class00672
extends class07049 {
    private static final int y = 2;
    private static final double L = 3.0;
    private static final double u = 15.0;
    private int i = 2;
    public long N;
    private int R;
    private boolean M;
    private @Nullable class04770 B;
    private final Set<class07049> Z = Sets.newHashSet();
    private int z;

    public Stream<class07049> L() {
        return this.Z.stream().filter(class07049::method_5805);
    }

    protected void method_5693(class04293 class042932) {
    }

    public void method_5773() {
        List var1;
        super.method_5773();
        if (this.i == 2) {
            if (this.method_73183().method_8608()) {
                this.method_73183().method_8486(this.method_23317(), this.method_23318(), this.method_23321(), class04909.TM, class04911.field_15252, 10000.0f, 0.8f + this.field_5974.z() * 0.2f, false);
                this.method_73183().method_8486(this.method_23317(), this.method_23318(), this.method_23321(), class04909.TR, class04911.field_15252, 2.0f, 0.5f + this.field_5974.z() * 0.2f, false);
            } else {
                class07086 class070862 = this.method_73183().y();
                if (class070862 == class07086.field_5802 || class070862 == class07086.field_5807) {
                    this.N(4);
                }
                this.u();
                class00672.N(this.method_73183(), this.i());
                this.method_32876((class03556)class01194.J);
            }
        }
        --this.i;
        if (this.i < 0) {
            if (this.R == 0) {
                if (this.method_73183() instanceof class04782) {
                    var1 = this.method_73183().method_8333((class07049)this, new class00734(this.method_23317() - 15.0, this.method_23318() - 15.0, this.method_23321() - 15.0, this.method_23317() + 15.0, this.method_23318() + 6.0 + 15.0, this.method_23321() + 15.0), class070492 -> class070492.method_5805() && !this.Z.contains(class070492));
                    for (class07049 class070493 : ((class04782)this.method_73183()).method_18766(class047702 -> class047702.method_5739((class07049)this) < 256.0f)) {
                        class06912.D.N((class04770)class070493, this, var1);
                    }
                }
                this.method_31472();
            } else if (this.i < -this.field_5974.y(10)) {
                --this.R;
                this.i = 1;
                this.N = this.field_5974.B();
                this.N(0);
            }
        }
        if (this.i >= 0) {
            if (!(this.method_73183() instanceof class04782)) {
                this.method_73183().method_8509(2);
            } else if (!this.M) {
                var1 = this.method_73183().method_8333((class07049)this, new class00734(this.method_23317() - 3.0, this.method_23318() - 3.0, this.method_23321() - 3.0, this.method_23317() + 3.0, this.method_23318() + 6.0 + 3.0, this.method_23321() + 3.0), class07049::method_5805);
                for (class07049 class070493 : var1) {
                    class070493.method_5800((class04782)this.method_73183(), this);
                }
                this.Z.addAll(var1);
                if (this.B != null) {
                    class06912.I.N(this.B, (Collection)var1);
                }
            }
        }
    }

    public class04911 method_5634() {
        return class04911.field_15252;
    }

    public final boolean method_64397(class04782 class047822, class07072 class070722, float f) {
        return false;
    }

    protected void method_5652(class08329 class083292) {
    }

    public boolean method_5640(double d) {
        double d2 = 64.0 * class00672.method_5824();
        return d < d2 * d2;
    }

    protected void method_5749(class08299 class082992) {
    }

    public class00672(class07078<? extends class00672> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.N = this.field_5974.B();
        this.R = this.field_5974.y(3) + 1;
    }

    private class07209 i() {
        class06889 class068892 = this.method_73189();
        return class07209.method_49637((double)class068892.M, (double)(class068892.B - 1.0E-6), (double)class068892.Z);
    }

    private void u() {
        class07209 class072092 = this.i();
        class00500 class005002 = this.method_73183().method_8320(class072092);
        class00891 class008912 = class005002.i();
        if (class008912 instanceof class01111) {
            ((class01111)class008912).L(class005002, this.method_73183(), class072092);
        }
    }

    public int y() {
        return this.z;
    }

    private static Optional<class07209> y(class07299 class072992, class07209 class072092) {
        for (class07209 class072093 : class07209.method_34848((class06069)class072992.field_9229, (int)10, (class07209)class072092, (int)1)) {
            class00500 class005003 = class072992.method_8320(class072093);
            if (!(class005003.i() instanceof class02674)) continue;
            class02674.f_((class00500)class005003).ifPresent(class005002 -> class072992.method_8501(class072093, class005002));
            class072992.N(3002, class072093, -1);
            return Optional.of(class072093);
        }
        return Optional.empty();
    }

    public @Nullable class04770 N() {
        return this.B;
    }

    public void N(boolean bl) {
        this.M = bl;
    }

    private static void N(class07299 class072992, class07209 class072092, class07218 class072182, int n) {
        Optional<class07209> var5;
        class072182.N((class00753)class072092);
        for (int i = 0; i < n && !(var5 = class00672.y(class072992, (class07209)class072182)).isEmpty(); ++i) {
            class072182.N((class00753)var5.get());
        }
    }

    private static void N(class07299 class072992, class07209 class072092) {
        class00500 class005002 = class072992.method_8320(class072092);
        boolean bl = ((BiMap)class02859.y.get()).get((Object)class005002.i()) != null;
        boolean bl2 = class005002.i() instanceof class02674;
        if (!bl2 && !bl) {
            return;
        }
        if (bl2) {
            class072992.method_8501(class072092, class02674.g_((class00500)class072992.method_8320(class072092)));
        }
        class07218 class072182 = class072092.method_25503();
        int n = class072992.field_9229.y(3) + 3;
        for (int i = 0; i < n; ++i) {
            int n2 = class072992.field_9229.y(8) + 1;
            class00672.N(class072992, class072092, class072182, n2);
        }
    }

    private void N(int n) {
        class07299 class072992;
        if (this.M || !((class072992 = this.method_73183()) instanceof class04782)) {
            return;
        }
        class04782 class047822 = (class04782)class072992;
        class072992 = this.method_24515();
        if (!class047822.method_76058((class07209)class072992)) {
            return;
        }
        class00500 class005002 = class05989.y((class07290)class047822, (class07209)class072992);
        if (class047822.method_8320((class07209)class072992).P() && class005002.N((class05487)class047822, (class07209)class072992)) {
            class047822.method_8501((class07209)class072992, class005002);
            ++this.z;
        }
        for (int i = 0; i < n; ++i) {
            class07209 class072092 = class072992.method_10069(this.field_5974.y(3) - 1, this.field_5974.y(3) - 1, this.field_5974.y(3) - 1);
            class005002 = class05989.y((class07290)class047822, (class07209)class072092);
            if (!class047822.method_8320(class072092).P() || !class005002.N((class05487)class047822, class072092)) continue;
            class047822.method_8501(class072092, class005002);
            ++this.z;
        }
    }

    public void N(@Nullable class04770 class047702) {
        this.B = class047702;
    }
}

