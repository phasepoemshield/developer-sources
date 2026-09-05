/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Stopwatch
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.objects.Object2LongMap
 *  it.unimi.dsi.fastutil.objects.Object2LongMap$Entry
 *  it.unimi.dsi.fastutil.objects.Object2LongOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 *  minecraft.class00201
 *  minecraft.class00392
 *  minecraft.class00394
 *  minecraft.class00734
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class01894
 *  minecraft.class03529
 *  minecraft.class04272
 *  minecraft.class04782
 *  minecraft.class05163
 *  minecraft.class05882
 *  minecraft.class05946
 *  minecraft.class06993
 *  minecraft.class07049
 *  minecraft.class07062
 *  minecraft.class07209
 *  minecraft.class08036
 *  minecraft.class08405
 *  minecraft.class08432
 *  minecraft.class08595
 *  minecraft.class08610
 *  minecraft.class08625
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.base.Stopwatch;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2LongMap;
import it.unimi.dsi.fastutil.objects.Object2LongOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Collection;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import minecraft.class00201;
import minecraft.class00392;
import minecraft.class00394;
import minecraft.class00734;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class01894;
import minecraft.class03529;
import minecraft.class04272;
import minecraft.class04782;
import minecraft.class05163;
import minecraft.class05511;
import minecraft.class05520;
import minecraft.class05523;
import minecraft.class05524;
import minecraft.class05532;
import minecraft.class05882;
import minecraft.class05946;
import minecraft.class06993;
import minecraft.class07049;
import minecraft.class07062;
import minecraft.class07209;
import minecraft.class08036;
import minecraft.class08405;
import minecraft.class08432;
import minecraft.class08595;
import minecraft.class08610;
import minecraft.class08625;
import org.jspecify.annotations.Nullable;

public class class05513 {
    private final class03529<class00201> N;
    private @Nullable class07209 y;
    private final class04782 L;
    private final Collection<class05532> u = Lists.newArrayList();
    private final int i;
    private final Collection<class05882> R = Lists.newCopyOnWriteArrayList();
    private final Object2LongMap<Runnable> M = new Object2LongOpenHashMap();
    private boolean B;
    private boolean Z;
    private int z;
    private boolean U;
    private final class04272 E;
    private final Stopwatch W = Stopwatch.createUnstarted();
    private boolean m;
    private final class06993 P;
    private @Nullable class08405 s;
    private @Nullable class08610 T;

    public int w() {
        return ((class00201)this.N.N()).z();
    }

    public @Nullable class07209 L() {
        return this.y;
    }

    public class04782 M() {
        return this.L;
    }

    public @Nullable class05513 P() {
        class08610 class086102 = this.N(Objects.requireNonNull(this.y), this.P, this.L);
        if (class086102 != null) {
            this.T = class086102;
            this.N();
            return this;
        }
        return null;
    }

    class05882 T() {
        class05882 class058822 = new class05882(this);
        this.R.add(class058822);
        return class058822;
    }

    public Stream<class05532> Q() {
        return this.u.stream();
    }

    public class05513(class03529<class00201> class035292, class06993 class069932, class04782 class047822, class04272 class042722) {
        this.N = class035292;
        this.L = class047822;
        this.E = class042722;
        this.i = ((class00201)class035292.N()).R();
        this.P = class069932;
    }

    public String toString() {
        return this.y().toString();
    }

    public boolean B() {
        return this.m && this.s == null;
    }

    private void I() {
        if (this.U) {
            return;
        }
        this.U = true;
        this.W.start();
        this.R().m();
        try {
            ((class00201)this.N.N()).N(new class05523(this));
        }
        catch (class08405 class084052) {
            this.N(class084052);
        }
        catch (Exception exception) {
            this.N((class08405)new class08432((Throwable)exception));
        }
    }

    private void J() {
        if (!this.m) {
            this.m = true;
            if (this.W.isRunning()) {
                this.W.stop();
            }
        }
    }

    public boolean Z() {
        return this.s != null;
    }

    public class00734 i() {
        return this.R().R();
    }

    public boolean b() {
        return ((class00201)this.N.N()).B();
    }

    int s() {
        return this.z;
    }

    public class06993 n() {
        return ((class00201)this.N.N()).m().R().N(this.P);
    }

    public int l() {
        return this.i;
    }

    public boolean d() {
        return ((class00201)this.N.N()).z() > 1;
    }

    public @Nullable class08405 m() {
        return this.s;
    }

    public int k() {
        return ((class00201)this.N.N()).U();
    }

    public class00201 t() {
        return (class00201)this.N.N();
    }

    private void g() {
        ++this.z;
        if (this.z < 0) {
            return;
        }
        if (!this.U) {
            this.I();
        }
        ObjectIterator var1 = this.M.object2LongEntrySet().iterator();
        while (var1.hasNext()) {
            Object2LongMap.Entry entry = (Object2LongMap.Entry)var1.next();
            if (entry.getLongValue() > (long)this.z) continue;
            try {
                ((Runnable)entry.getKey()).run();
            }
            catch (class08405 class084052) {
                this.N(class084052);
            }
            catch (Exception exception) {
                this.N((class08405)new class08432((Throwable)exception));
            }
            var1.remove();
        }
        if (this.z > this.i) {
            if (this.R.isEmpty()) {
                this.N(new class05524((class00392)class00392.N((String)"test.error.timeout.no_result", (Object[])new Object[]{((class00201)this.N.N()).R()})));
            } else {
                this.R.forEach(class058822 -> class058822.L(this.z));
                if (this.s == null) {
                    this.N(new class05524((class00392)class00392.N((String)"test.error.timeout.no_sequences_finished", (Object[])new Object[]{((class00201)this.N.N()).R()})));
                }
            }
        } else {
            this.R.forEach(class058822 -> class058822.y(this.z));
        }
    }

    public class01894 v() {
        return ((class00201)this.N.N()).i();
    }

    public boolean j() {
        return !((class00201)this.N.N()).B();
    }

    public boolean U() {
        return this.m;
    }

    public boolean z() {
        return this.U;
    }

    public class07209 u() {
        return this.T.b();
    }

    public class01894 y() {
        return this.N.B().N();
    }

    public long E() {
        return this.W.elapsed(TimeUnit.MILLISECONDS);
    }

    public void N(class05520 class055202) {
        if (this.U()) {
            return;
        }
        if (!this.B) {
            this.N((class00392)class00392.L((String)"test.error.ticking_without_structure"));
        }
        if (this.T == null) {
            this.N((class00392)class00392.L((String)"test.error.missing_block_entity"));
        }
        if (this.s != null) {
            this.J();
        }
        if (!this.Z) {
            if (!this.T.u().y().allMatch(arg_0 -> ((class04782)this.L).method_66588(arg_0))) {
                return;
            }
        }
        this.Z = true;
        this.g();
        if (this.U()) {
            if (this.s != null) {
                this.u.forEach(class055322 -> class055322.y(this, class055202));
            } else {
                this.u.forEach(class055322 -> class055322.N(this, class055202));
            }
        }
    }

    public void N(class05532 class055322) {
        this.u.add(class055322);
    }

    public void N(@Nullable class07209 class072092) {
        this.y = class072092;
    }

    public class05513 N(int n) {
        this.z = -(((class00201)this.N.N()).M() + n + 1);
        return this;
    }

    public void N() {
        if (this.B) {
            return;
        }
        class08610 class086102 = this.R();
        if (!class086102.T()) {
            this.N((class00392)class00392.N((String)"test.error.structure.failure", (Object[])new Object[]{class086102.B().getString()}));
        }
        this.B = true;
        class086102.j();
        class05163 class051632 = class086102.u();
        this.L.method_14196().N(class051632);
        this.L.method_23658(class051632);
        this.u.forEach(class055322 -> class055322.N(this));
    }

    public void N(class00392 class003922) {
        this.N(new class05511(class003922, this.z));
    }

    public void N(class08405 class084052) {
        this.s = class084052;
    }

    private @Nullable class08610 N(class07209 class072092, class06993 class069932, class04782 class047822) {
        class047822.method_8501(class072092, class00869.Ty.W());
        class00394 class003942 = class047822.method_8321(class072092);
        if (class003942 instanceof class08610) {
            class08610 class086102 = (class08610)class003942;
            class05946 var5 = this.G().B();
            class00753 class007532 = class08610.N((class04782)class047822, (class05946)var5).orElse(new class00753(1, 1, 1));
            class086102.N(new class08595(Optional.of(var5), class007532, class069932, false, class08625.field_56014, Optional.empty()));
            return class086102;
        }
        return null;
    }

    public void N(long l, Runnable runnable) {
        this.M.put((Object)runnable, l);
    }

    public void W() {
        if (this.s == null) {
            this.J();
            class00734 class007342 = this.i();
            this.M().N(class07049.class, class007342.M(1.0), class070492 -> !(class070492 instanceof class08036)).forEach(class070492 -> class070492.method_5650(class07062.field_26999));
        }
    }

    public class08610 R() {
        if (this.T == null) {
            if (this.y == null) {
                throw new IllegalStateException("This GameTestInfo has no position");
            }
            class00394 class003942 = this.L.method_8321(this.y);
            if (class003942 instanceof class08610) {
                class08610 class086102;
                this.T = class086102 = (class08610)class003942;
            }
            if (this.T == null) {
                throw new IllegalStateException("Could not find a test instance block entity at the given coordinate " + String.valueOf(this.y));
            }
        }
        return this.T;
    }

    public class05513 O() {
        class05513 class055132 = new class05513(this.N, this.P, this.L, this.Y());
        if (this.y != null) {
            class055132.N(this.y);
        }
        return class055132;
    }

    public class03529<class00201> G() {
        return this.N;
    }

    public class04272 Y() {
        return this.E;
    }
}

