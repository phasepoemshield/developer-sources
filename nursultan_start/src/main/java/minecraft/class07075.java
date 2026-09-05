/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  minecraft.class00743
 *  minecraft.class02741
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06686
 *  minecraft.class06695
 *  minecraft.class06712
 *  minecraft.class06941
 *  minecraft.class07310
 *  minecraft.class08036
 *  minecraft.class08294
 *  minecraft.class08310
 *  net.fabricmc.fabric.impl.transfer.item.SpecialLogicInventory
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import minecraft.class00743;
import minecraft.class02741;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06686;
import minecraft.class06695;
import minecraft.class06712;
import minecraft.class06941;
import minecraft.class07310;
import minecraft.class08036;
import minecraft.class08294;
import minecraft.class08310;
import net.fabricmc.fabric.impl.transfer.item.SpecialLogicInventory;
import org.jspecify.annotations.Nullable;

public class class07075
implements class06695,
class06941,
SpecialLogicInventory {
    private final int y;
    public final class00743<class06584> N;
    private @Nullable List<class06712> u;
    private boolean i = false;

    public boolean L(class06584 class065842) {
        boolean bl = false;
        for (class06584 class065843 : this.N) {
            if (!class065843.R() && (!class06584.L((class06584)class065843, (class06584)class065842) || class065843.c() >= class065843.U())) continue;
            bl = true;
            break;
        }
        return bl;
    }

    public class07075(int n) {
        this.y = n;
        this.N = class00743.method_10213((int)n, (Object)class06584.E);
    }

    public class07075(class06584 ... class06584Array) {
        this.y = class06584Array.length;
        this.N = class00743.method_10212((Object)class06584.E, (Object[])class06584Array);
    }

    public String toString() {
        return this.N.stream().filter(class065842 -> !class065842.R()).collect(Collectors.toList()).toString();
    }

    private void i(class06584 class065842) {
        for (int i = 0; i < this.y; ++i) {
            class06584 class065843 = this.method_5438(i);
            if (!class06584.L((class06584)class065843, (class06584)class065842)) continue;
            this.N(class065842, class065843);
            if (!class065842.R()) continue;
            return;
        }
    }

    private void u(class06584 class065842) {
        for (int i = 0; i < this.y; ++i) {
            if (!this.method_5438(i).R()) continue;
            this.method_5447(i, class065842.M());
            return;
        }
    }

    public class00743<class06584> y() {
        return this.N;
    }

    public void y(class06712 class067122) {
        if (this.u != null) {
            this.u.remove(class067122);
        }
    }

    private void N(class06584 class065842, class06584 class065843) {
        int n = this.a_(class065843);
        int n2 = Math.min(class065842.c(), n - class065843.c());
        if (n2 > 0) {
            class065843.M(n2);
            class065842.B(n2);
            this.method_5431();
        }
    }

    public List<class06584> N() {
        List<class06584> list = this.N.stream().filter(class065842 -> !class065842.R()).collect(Collectors.toList());
        this.method_5448();
        return list;
    }

    public void N(class07075 class070752) {
        if (!this.i) {
            class070752.method_5431();
        }
    }

    public void N(class02741 class027412) {
        for (class06584 class065842 : this.N) {
            class027412.y(class065842);
        }
    }

    public class06584 N(class06584 class065842) {
        if (class065842.R()) {
            return class06584.E;
        }
        class06584 class065843 = class065842.t();
        this.i(class065843);
        if (class065843.R()) {
            return class06584.E;
        }
        this.u(class065843);
        if (class065843.R()) {
            return class06584.E;
        }
        return class065843;
    }

    public class06584 N(class06581 class065812, int n) {
        class06584 class065842 = new class06584((class07310)class065812, 0);
        for (int i = this.y - 1; i >= 0; --i) {
            class06584 class065843 = this.method_5438(i);
            if (!class065843.B().equals(class065812)) continue;
            int n2 = n - class065842.c();
            class06584 class065844 = class065843.N(n2);
            class065842.M(class065844.c());
            if (class065842.c() == n) break;
        }
        if (!class065842.R()) {
            this.method_5431();
        }
        return class065842;
    }

    public void N(class06712 class067122) {
        if (this.u == null) {
            this.u = Lists.newArrayList();
        }
        this.u.add(class067122);
    }

    public void N(class08294<class06584> class082942) {
        for (int i = 0; i < this.method_5439(); ++i) {
            class06584 class065842 = this.method_5438(i);
            if (class065842.R()) continue;
            class082942.N((Object)class065842);
        }
    }

    public void N(class08310<class06584> class083102) {
        this.method_5448();
        for (class06584 class065842 : class083102) {
            this.N(class065842);
        }
    }

    public boolean method_5443(class08036 class080362) {
        return true;
    }

    public void method_5448() {
        this.N.clear();
        this.method_5431();
    }

    public void method_5447(int n, class06584 class065842) {
        this.N.set(n, (Object)class065842);
        class065842.R(this.a_(class065842));
        class07075 class070752 = this;
        this.N(class070752);
    }

    public void method_5431() {
        if (this.u != null) {
            Iterator<class06712> var1 = this.u.iterator();
            while (var1.hasNext()) {
                var1.next().N((class06695)this);
            }
        }
    }

    public class06584 method_5434(int n, int n2) {
        class06584 class065842 = class06686.N(this.N, (int)n, (int)n2);
        if (!class065842.R()) {
            this.method_5431();
        }
        return class065842;
    }

    public class06584 method_5441(int n) {
        class06584 class065842 = (class06584)this.N.get(n);
        if (class065842.R()) {
            return class06584.E;
        }
        this.N.set(n, (Object)class06584.E);
        return class065842;
    }

    public boolean method_5442() {
        Iterator var1 = this.N.iterator();
        while (var1.hasNext()) {
            if (((class06584)var1.next()).R()) continue;
            return false;
        }
        return true;
    }

    public void fabric_onFinalCommit(int n, class06584 class065842, class06584 class065843) {
    }

    public void fabric_setSuppress(boolean bl) {
        this.i = bl;
    }

    public class06584 method_5438(int n) {
        if (n < 0 || n >= this.N.size()) {
            return class06584.E;
        }
        return (class06584)this.N.get(n);
    }

    public int method_5439() {
        return this.y;
    }
}

