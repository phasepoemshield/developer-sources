/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11352
 *  Nursultan.class11938
 *  it.unimi.dsi.fastutil.ints.Int2ObjectArrayMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class00743
 *  minecraft.class02484
 *  minecraft.class02596
 *  minecraft.class02741
 *  minecraft.class03530
 *  minecraft.class03556
 *  minecraft.class04770
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06686
 *  minecraft.class06695
 *  minecraft.class07049
 *  minecraft.class07061
 *  minecraft.class07074
 *  minecraft.class07080
 *  minecraft.class07085
 *  minecraft.class07438
 *  minecraft.class07482
 *  minecraft.class07878
 *  minecraft.class08294
 *  minecraft.class08310
 *  minecraft.class08332
 *  minecraft.class08599
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import Nursultan.class11352;
import Nursultan.class11938;
import it.unimi.dsi.fastutil.ints.Int2ObjectArrayMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Predicate;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class00743;
import minecraft.class02484;
import minecraft.class02596;
import minecraft.class02741;
import minecraft.class03530;
import minecraft.class03556;
import minecraft.class04770;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06686;
import minecraft.class06695;
import minecraft.class07049;
import minecraft.class07061;
import minecraft.class07074;
import minecraft.class07080;
import minecraft.class07085;
import minecraft.class07438;
import minecraft.class07482;
import minecraft.class07878;
import minecraft.class08036;
import minecraft.class08294;
import minecraft.class08310;
import minecraft.class08332;
import minecraft.class08599;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class08044
implements class06695,
class07061 {
    public static final int N = 5;
    public static final int y = 36;
    public static final int u = 9;
    public static final int i = 40;
    public static final int R = 41;
    public static final int M = 42;
    public static final int B = -1;
    public static final Int2ObjectMap<class07085> Z = new Int2ObjectArrayMap(Map.of(class07085.field_6166.N(36), class07085.field_6166, class07085.field_6172.N(36), class07085.field_6172, class07085.field_6174.N(36), class07085.field_6174, class07085.field_6169.N(36), class07085.field_6169, 40, class07085.field_6171, 41, class07085.field_48824, 42, class07085.field_55946));
    private static final class00392 E = class00392.L((String)"container.inventory");
    private final class00743<class06584> W = class00743.method_10213((int)36, (Object)class06584.E);
    private int m;
    public final class08036 z;
    public final class08599 U;
    private int P;

    public static int L() {
        return 9;
    }

    public static boolean L(int n) {
        return n >= 0 && n < 9;
    }

    public void L(class06584 class065842) {
        int n;
        this.N(this.M());
        if (!((class06584)this.W.get(this.m)).R() && (n = this.i()) != -1) {
            this.W.set(n, (Object)((class06584)this.W.get(this.m)));
        }
        this.W.set(this.m, (Object)class065842);
    }

    public int M() {
        int n;
        int n2;
        for (n2 = 0; n2 < 9; ++n2) {
            n = (this.m + n2) % 9;
            if (!((class06584)this.W.get(n)).R()) continue;
            return n;
        }
        for (n2 = 0; n2 < 9; ++n2) {
            n = (this.m + n2) % 9;
            if (((class06584)this.W.get(n)).I()) continue;
            return n;
        }
        return this.m;
    }

    public boolean M(class06584 class065842) {
        return this.N(-1, class065842);
    }

    public class00392 method_5477() {
        return E;
    }

    public class08044(class08036 class080362, class08599 class085992) {
        this.z = class080362;
        this.U = class085992;
    }

    public void B(class06584 class065842) {
        this.N(class065842, true);
    }

    public void B() {
        for (int i = 0; i < this.W.size(); ++i) {
            class06584 class065842 = this.method_5438(i);
            if (class065842.R()) continue;
            class065842.N(this.z.method_73183(), (class07049)this.z, (class07085)(i == this.m ? class07085.field_6173 : null));
        }
    }

    public void Z(class06584 class065842) {
        for (int i = 0; i < this.W.size(); ++i) {
            if (this.W.get(i) != class065842) continue;
            this.W.set(i, (Object)class06584.E);
            return;
        }
        for (class07085 class070852 : Z.values()) {
            if (this.U.N(class070852) != class065842) continue;
            this.U.N(class070852, class06584.E);
            return;
        }
    }

    public void Z() {
        for (int i = 0; i < this.W.size(); ++i) {
            class06584 class065842 = (class06584)this.W.get(i);
            if (class065842.R()) continue;
            this.z.method_7329(class065842, true, false);
            this.W.set(i, (Object)class06584.E);
        }
        this.U.N((class07438)this.z);
    }

    public int i() {
        for (int i = 0; i < this.W.size(); ++i) {
            if (!((class06584)this.W.get(i)).R()) continue;
            return i;
        }
        return -1;
    }

    public static boolean i(class06584 class065842) {
        return !class065842.m() && !class065842.I() && !class065842.L(class02484.B);
    }

    private int U(class06584 class065842) {
        int n = this.R(class065842);
        if (n == -1) {
            n = this.i();
        }
        if (n == -1) {
            return class065842.c();
        }
        return this.y(n, class065842);
    }

    public int z() {
        return this.P;
    }

    public boolean z(class06584 class065842) {
        Iterator var2 = this.iterator();
        while (var2.hasNext()) {
            class06584 class065843 = (class06584)var2.next();
            if (class065843.R() || !class06584.L((class06584)class065843, (class06584)class065842)) continue;
            return true;
        }
        return false;
    }

    public class02596 u(int n) {
        return new class02596(n, this.method_5438(n).t());
    }

    public class00743<class06584> u() {
        return this.W;
    }

    public int u(class06584 class065842) {
        for (int i = 0; i < this.W.size(); ++i) {
            if (((class06584)this.W.get(i)).R() || !class06584.L((class06584)class065842, (class06584)((class06584)this.W.get(i)))) continue;
            return i;
        }
        return -1;
    }

    private int y(int n, class06584 class065842) {
        int n2;
        int n3;
        int n4 = class065842.c();
        class06584 class065843 = this.method_5438(n);
        if (class065843.R()) {
            class065843 = class065842.L(0);
            this.method_5447(n, class065843);
        }
        if ((n3 = Math.min(n4, n2 = this.a_(class065843) - class065843.c())) == 0) {
            return n4;
        }
        class065843.M(n3);
        class065843.u(5);
        return n4 -= n3;
    }

    public class06584 y() {
        return (class06584)this.W.get(this.m);
    }

    public void y(int n) {
        this.N(this.M());
        class06584 class065842 = (class06584)this.W.get(this.m);
        this.W.set(this.m, (Object)((class06584)this.W.get(n)));
        this.W.set(n, (Object)class065842);
    }

    public boolean y(Predicate<class06584> predicate) {
        Iterator var2 = this.iterator();
        while (var2.hasNext()) {
            class06584 class065842 = (class06584)var2.next();
            if (!predicate.test(class065842)) continue;
            return true;
        }
        return false;
    }

    public boolean N(class03530<class06581> class035302) {
        Iterator var2 = this.iterator();
        while (var2.hasNext()) {
            class06584 class065842 = (class06584)var2.next();
            if (class065842.R() || !class065842.N(class035302)) continue;
            return true;
        }
        return false;
    }

    private void N(int n, class06584 class065842, CallbackInfo callbackInfo) {
        class11938.L().L((Object)class11352.N());
    }

    public void N(int n) {
        if (!class08044.L(n)) {
            throw new IllegalArgumentException("Invalid selected slot");
        }
        this.m = n;
    }

    public class06584 N(class06584 class065842) {
        return (class06584)this.W.set(this.m, (Object)class065842);
    }

    private void N(CallbackInfo callbackInfo) {
        class11938.L().L((Object)class11352.N());
    }

    public int N() {
        return this.m;
    }

    public class06584 N(boolean bl) {
        class06584 class065842 = this.y();
        if (class065842.R()) {
            return class06584.E;
        }
        return this.method_5434(this.m, bl ? class065842.c() : 1);
    }

    public void N(class02741 class027412) {
        for (class06584 class065842 : this.W) {
            class027412.N(class065842);
        }
    }

    public void N(class08044 class080442) {
        for (int i = 0; i < this.method_5439(); ++i) {
            this.method_5447(i, class080442.method_5438(i));
        }
        this.N(class080442.N());
    }

    public void N(class08294<class08332> class082942) {
        for (int i = 0; i < this.W.size(); ++i) {
            class06584 class065842 = (class06584)this.W.get(i);
            if (class065842.R()) continue;
            class082942.N((Object)new class08332(i, class065842));
        }
    }

    public boolean N(int n, class06584 class065842) {
        if (class065842.R()) {
            return false;
        }
        try {
            if (!class065842.m()) {
                int n2;
                do {
                    n2 = class065842.c();
                    if (n == -1) {
                        class065842.i(this.U(class065842));
                        continue;
                    }
                    class065842.i(this.y(n, class065842));
                } while (!class065842.R() && class065842.c() < n2);
                if (class065842.c() == n2 && this.z.method_56992()) {
                    class065842.i(0);
                    return true;
                }
                return class065842.c() < n2;
            }
            if (n == -1) {
                n = this.i();
            }
            if (n >= 0) {
                this.W.set(n, (Object)class065842.M());
                ((class06584)this.W.get(n)).u(5);
                return true;
            }
            if (this.z.method_56992()) {
                class065842.i(0);
                return true;
            }
            return false;
        }
        catch (Throwable throwable) {
            class07080 class070802 = class07080.N((Throwable)throwable, (String)"Adding item to inventory");
            class07074 class070742 = class070802.N("Item being added");
            class070742.N("Item ID", (Object)class06581.N((class06581)class065842.B()));
            class070742.N("Item data", (Object)class065842.P());
            class070742.N("Item name", () -> class065842.d().getString());
            throw new class07878(class070802);
        }
    }

    public int N(class03556<class06581> class035562, class06584 class065842) {
        for (int i = 0; i < this.W.size(); ++i) {
            class06584 class065843 = (class06584)this.W.get(i);
            if (class065843.R() || !class065843.N(class035562) || !class08044.i(class065843) || !class065842.R() && !class06584.L((class06584)class065842, (class06584)class065843)) continue;
            return i;
        }
        return -1;
    }

    public void N(class06584 class065842, boolean bl) {
        while (!class065842.R()) {
            class08036 class080362;
            int n = this.R(class065842);
            if (n == -1) {
                n = this.i();
            }
            if (n == -1) {
                this.z.method_7328(class065842, false);
                break;
            }
            int n2 = class065842.U() - this.method_5438(n).c();
            if (!this.N(n, class065842.N(n2)) || !bl || !((class080362 = this.z) instanceof class04770)) continue;
            ((class04770)class080362).field_13987.method_14364((class00381)this.u(n));
        }
    }

    private boolean N(class06584 class065842, class06584 class065843) {
        return !class065842.R() && class06584.L((class06584)class065842, (class06584)class065843) && class065842.E() && class065842.c() < this.a_(class065842);
    }

    public void N(class08310<class08332> class083102) {
        this.W.clear();
        for (class08332 class083322 : class083102) {
            if (!class083322.N(this.W.size())) continue;
            this.method_5447(class083322.N(), class083322.y());
        }
    }

    public int N(Predicate<class06584> predicate, int n, class06695 class066952) {
        int n2 = 0;
        boolean bl = n == 0;
        n2 += class06686.N((class06695)this, predicate, (int)(n - n2), (boolean)bl);
        n2 += class06686.N((class06695)class066952, predicate, (int)(n - n2), (boolean)bl);
        class06584 class065842 = ((class07482)this.z.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).M();
        n2 += class06686.N((class06584)class065842, predicate, (int)(n - n2), (boolean)bl);
        if (class065842.R()) {
            ((class07482)this.z.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).N(class06584.E);
        }
        return n2;
    }

    public boolean method_5443(class08036 class080362) {
        return true;
    }

    public void method_5448() {
        this.W.clear();
        this.U.y();
    }

    public void method_5447(int n, class06584 class065842) {
        class07085 class070852;
        this.N(n, class065842, null);
        if (n < this.W.size()) {
            this.W.set(n, (Object)class065842);
        }
        if ((class070852 = (class07085)Z.get(n)) != null) {
            this.U.N(class070852, class065842);
        }
    }

    public void method_5431() {
        this.N((CallbackInfo)null);
        ++this.P;
    }

    public class06584 method_5434(int n, int n2) {
        class06584 class065842;
        if (n < this.W.size()) {
            return class06686.N(this.W, (int)n, (int)n2);
        }
        class07085 class070852 = (class07085)Z.get(n);
        if (class070852 != null && !(class065842 = this.U.N(class070852)).R()) {
            return class065842.N(n2);
        }
        return class06584.E;
    }

    public class06584 method_5441(int n) {
        if (n < this.W.size()) {
            class06584 class065842 = (class06584)this.W.get(n);
            this.W.set(n, (Object)class06584.E);
            return class065842;
        }
        class07085 class070852 = (class07085)Z.get(n);
        if (class070852 != null) {
            return this.U.N(class070852, class06584.E);
        }
        return class06584.E;
    }

    public boolean method_5442() {
        for (class06584 class065842 : this.W) {
            if (class065842.R()) continue;
            return false;
        }
        for (class06584 class065842 : Z.values()) {
            if (this.U.N((class07085)class065842).R()) continue;
            return false;
        }
        return true;
    }

    public int R(class06584 class065842) {
        if (this.N(this.method_5438(this.m), class065842)) {
            return this.m;
        }
        if (this.N(this.method_5438(40), class065842)) {
            return 40;
        }
        for (int i = 0; i < this.W.size(); ++i) {
            if (!this.N((class06584)this.W.get(i), class065842)) continue;
            return i;
        }
        return -1;
    }

    public class06584 method_5438(int n) {
        if (n < this.W.size()) {
            return (class06584)this.W.get(n);
        }
        class07085 class070852 = (class07085)Z.get(n);
        if (class070852 != null) {
            return this.U.N(class070852);
        }
        return class06584.E;
    }

    public int method_5439() {
        return this.W.size() + Z.size();
    }
}

