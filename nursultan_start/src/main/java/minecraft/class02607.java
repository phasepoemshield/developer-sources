/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  minecraft.class00381
 *  minecraft.class00700
 *  minecraft.class00734
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class06570
 *  minecraft.class06635
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07079
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class07310
 *  minecraft.class08299
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import minecraft.class00381;
import minecraft.class00700;
import minecraft.class00734;
import minecraft.class02585;
import minecraft.class02592;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class06570;
import minecraft.class06635;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07079;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07310;
import minecraft.class08299;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;

public interface class02607 {
    public static final String d_ = "leash";
    public static final double e_ = 12.0;
    public static final double f_ = 6.0;
    public static final double a_ = 16.0;
    public static final class06889 b_ = new class06889(0.8, 0.2, 0.8);
    public static final float NR = 0.7f;
    public static final double NM = 10.0;
    public static final double NB = 0.11;
    public static final List<class06889> NZ = ImmutableList.of((Object)new class06889(0.0, 0.5, 0.5));
    public static final List<class06889> Nz = ImmutableList.of((Object)new class06889(0.0, 0.5, 0.0));
    public static final List<class06889> NU = ImmutableList.of((Object)new class06889(-0.5, 0.5, 0.5), (Object)new class06889(-0.5, 0.5, -0.5), (Object)new class06889(0.5, 0.5, -0.5), (Object)new class06889(0.5, 0.5, 0.5));

    private static class06889 L(class07049 class070492) {
        if (class070492 instanceof class07079 && ((class07079)class070492).Nt()) {
            return class06889.L;
        }
        return class070492.method_60478();
    }

    default public class06889 M(float f) {
        return this.ac_();
    }

    default public double M(class07049 class070492) {
        return class070492.method_5829().R().R(((class07049)this).method_5829().R());
    }

    public static <E extends class07049> float B(E e) {
        if (e.method_24828()) {
            return e.method_73183().method_8320(e.method_23314()).i().Z() * 0.91f;
        }
        if (e.method_52535()) {
            return 0.8f;
        }
        return 0.91f;
    }

    public static List<class02607> Z(class07049 class070492) {
        return class02607.N(class070492, (class02607 class026072) -> class026072.yW() == class070492);
    }

    default public boolean g() {
        return true;
    }

    private static <E extends class07049> @Nullable class07049 u(E e) {
        class07049 class070492;
        class02592 class025922 = ((class02607)e).S_();
        if (class025922 == null) {
            return null;
        }
        if (class025922.y != 0 && e.method_73183().method_8608() && (class070492 = e.method_73183().method_8469(class025922.y)) instanceof class07049) {
            class07049 class070493 = class070492;
            class025922.N(class070493);
        }
        return class025922.L;
    }

    private static <E extends class07049> void y(E e, class02592 class025922) {
        class07299 class072992;
        if (class025922.u != null && (class072992 = e.method_73183()) instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            Optional var3 = class025922.u.left();
            Optional var4 = class025922.u.right();
            if (var3.isPresent()) {
                class07049 class070492 = class047822.method_66347((UUID)var3.get());
                if (class070492 != null) {
                    class02607.N(e, class070492, true);
                    return;
                }
            } else if (var4.isPresent()) {
                class02607.N(e, (class07049)class00700.N((class07299)class047822, (class07209)((class07209)var4.get())), true);
                return;
            }
            if (e.field_6012 > 100) {
                e.method_5706(class047822, (class07310)class06570.Gr);
                ((class02607)e).N((class02592)null);
            }
        }
    }

    default public boolean N(class07049 class070492, class02592 class025922) {
        boolean bl = class070492.method_70986() && this.aa_();
        List<class02585> var4 = class02607.N((class07049)this, class070492, bl ? NU : NZ, bl ? NU : Nz);
        if (var4.isEmpty()) {
            return false;
        }
        class02585 class025852 = class02585.N(var4).N(bl ? 0.25 : 1.0);
        class025922.i += 10.0 * class025852.y();
        class06889 class068892 = class02607.L(class070492).u(((class07049)this).method_60478());
        ((class07049)this).method_45319(class025852.N().B(b_).i(class068892.L(0.11)));
        return true;
    }

    private static Optional<class02585> N(class06889 class068892, class06889 class068893, double d, class06889 class068894, class06889 class068895) {
        double d2 = class068893.R(class068892);
        if (d2 < d) {
            return Optional.empty();
        }
        class06889 class068896 = class068892.u(class068893).u().L(d2 - d);
        double d3 = class02585.N(class068895, class068896);
        if (class068894.y(class068896) >= 0.0) {
            class068896 = class068896.L((double)0.3f);
        }
        return Optional.of(new class02585(class068896, d3));
    }

    private static <E extends class07049> List<class02585> N(E e, class07049 class070492, List<class06889> list, List<class06889> list2) {
        double d = ((class02607)e).q_();
        class06889 class068892 = class02607.L(e);
        float f = e.method_36454() * ((float)Math.PI / 180);
        class06889 class068893 = new class06889((double)e.method_17681(), (double)e.method_17682(), (double)e.method_17681());
        float f2 = class070492.method_36454() * ((float)Math.PI / 180);
        class06889 class068894 = new class06889((double)class070492.method_17681(), (double)class070492.method_17682(), (double)class070492.method_17681());
        ArrayList<class02585> arrayList = new ArrayList<class02585>();
        for (int i = 0; i < list.size(); ++i) {
            class06889 class068895 = list.get(i).B(class068893).y(-f);
            class06889 class068896 = e.method_73189().i(class068895);
            class06889 class068897 = list2.get(i).B(class068894).y(-f2);
            class02607.N(class070492.method_73189().i(class068897), class068896, d, class068892, class068895).ifPresent(arrayList::add);
        }
        return arrayList;
    }

    public static List<class02607> N(class07049 class070492, Predicate<class02607> predicate) {
        return class02607.N(class070492.method_73183(), class070492.method_5829().R(), predicate);
    }

    private static <E extends class07049> void N(E e, class07049 class070492, boolean bl) {
        class07299 class072992;
        class07049 class070493;
        class02592 class025922 = ((class02607)e).S_();
        if (class025922 == null) {
            class025922 = new class02592(class070492);
            ((class02607)e).N(class025922);
        } else {
            class070493 = class025922.L;
            class025922.N(class070492);
            if (class070493 != null && class070493 != class070492) {
                class070493.method_70982((class02607)e);
            }
        }
        if (bl && (class072992 = e.method_73183()) instanceof class04782) {
            class070493 = (class04782)class072992;
            class070493.method_14178().y(e, (class00381)new class06635(e, class070492));
        }
        if (e.method_5765()) {
            e.method_5848();
        }
    }

    default public void N(class07049 class070492, boolean bl) {
        if (this == class070492) {
            return;
        }
        class02607.N((class07049)this, class070492, bl);
    }

    public void N(@Nullable class02592 var1);

    public static class06889[] N(class07049 class070492, double d, double d2, double d3, double d4) {
        float f = class070492.method_17681();
        double d5 = d * (double)f;
        double d6 = d2 * (double)f;
        double d7 = d3 * (double)f;
        double d8 = d4 * (double)class070492.method_17682();
        return new class06889[]{new class06889(-d7, d8, d6 + d5), new class06889(-d7, d8, -d6 + d5), new class06889(d7, d8, -d6 + d5), new class06889(d7, d8, d6 + d5)};
    }

    default public void N(class08299 class082992) {
        class02592 class025922 = class082992.N(d_, class02592.N).orElse(null);
        if (this.S_() != null && class025922 == null) {
            this.yE();
        }
        this.N(class025922);
    }

    default public void N(class08329 class083292, @Nullable class02592 class025922) {
        class083292.y(d_, class02592.N, (Object)class025922);
    }

    private static <E extends class07049> void N(E e, boolean bl, boolean bl2) {
        class02592 class025922 = ((class02607)e).S_();
        if (class025922 != null && class025922.L != null) {
            ((class02607)e).N((class02592)null);
            ((class02607)e).Nv();
            class07299 class072992 = e.method_73183();
            if (class072992 instanceof class04782) {
                class04782 class047822 = (class04782)class072992;
                if (bl2) {
                    e.method_5706(class047822, (class07310)class06570.Gr);
                }
                if (bl) {
                    class047822.method_14178().y(e, (class00381)new class06635(e, null));
                }
                class025922.L.method_70982((class02607)e);
            }
        }
    }

    public static <E extends class07049> void N(class04782 class047822, E e) {
        class07049 class070492;
        class02592 class025922 = ((class02607)e).S_();
        if (class025922 != null && class025922.u != null) {
            class02607.y(e, class025922);
        }
        if (class025922 == null || class025922.L == null) {
            return;
        }
        if (!e.method_73187() || !class025922.L.method_73187()) {
            if (((Boolean)class047822.method_64395().N(class07305.U)).booleanValue()) {
                ((class02607)e).yU();
            } else {
                ((class02607)e).yE();
            }
        }
        if ((class070492 = ((class02607)e).yW()) != null && class070492.method_73183() == e.method_73183()) {
            double d = ((class02607)e).M(class070492);
            ((class02607)e).a_(class070492);
            if (d > ((class02607)e).p_()) {
                class047822.method_43128(null, class070492.method_23317(), class070492.method_23318(), class070492.method_23321(), class04909.Tu, class04911.field_15254, 1.0f, 1.0f);
                ((class02607)e).Nn();
            } else if (d > ((class02607)e).q_() - (double)class070492.method_17681() - (double)e.method_17681() && ((class02607)e).N(class070492, class025922)) {
                ((class02607)e).o_();
            } else {
                ((class02607)e).b_(class070492);
            }
            e.method_36456((float)((double)e.method_36454() - class025922.i));
            class025922.i *= (double)class02607.B(e);
        }
    }

    public static List<class02607> N(class07299 class072992, class06889 class068892, Predicate<class02607> predicate) {
        double d = 32.0;
        class00734 class007342 = class00734.N((class06889)class068892, (double)32.0, (double)32.0, (double)32.0);
        return class072992.N(class07049.class, class007342, (T class070492) -> {
            class02607 class026072;
            return class070492 instanceof class02607 && predicate.test(class026072 = (class02607)class070492);
        }).stream().map(class02607.class::cast).toList();
    }

    default public void W(int n) {
        this.N(new class02592(n));
        class02607.N((class07049)this, false, false);
    }

    default public boolean R(class07049 class070492) {
        if (this == class070492) {
            return false;
        }
        if (this.M(class070492) > this.p_()) {
            return false;
        }
        return this.g();
    }

    default public void yE() {
        class02607.N((class07049)this, true, false);
    }

    default public @Nullable class07049 yW() {
        return class02607.u((class07049)this);
    }

    default public boolean g_() {
        return this.S_() != null && this.S_().L != null;
    }

    default public void yU() {
        class02607.N((class07049)this, true, true);
    }

    default public void a_(class07049 class070492) {
        class070492.method_70980(this);
    }

    default public boolean aa_() {
        return false;
    }

    default public class06889 ac_() {
        class07049 class070492 = (class07049)this;
        return new class06889(0.0, (double)class070492.method_5751(), (double)(class070492.method_17681() * 0.4f));
    }

    default public class06889[] ab_() {
        return class02607.N((class07049)this, 0.0, 0.5, 0.5, 0.5);
    }

    default public void b_(class07049 class070492) {
    }

    default public void Nv() {
    }

    public @Nullable class02592 S_();

    default public double p_() {
        return 12.0;
    }

    default public boolean yz() {
        return this.S_() != null;
    }

    default public void Nn() {
        this.yU();
    }

    default public void o_() {
        ((class07049)this).method_70983();
    }

    default public double q_() {
        return 6.0;
    }
}

