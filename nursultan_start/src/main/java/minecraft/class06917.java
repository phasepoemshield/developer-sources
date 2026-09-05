/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00743
 *  minecraft.class06584
 *  minecraft.class06686
 *  minecraft.class06695
 *  minecraft.class07288
 *  minecraft.class07316
 *  minecraft.class07324
 *  minecraft.class08036
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Iterator;
import minecraft.class00743;
import minecraft.class06584;
import minecraft.class06686;
import minecraft.class06695;
import minecraft.class07288;
import minecraft.class07316;
import minecraft.class07324;
import minecraft.class08036;
import org.jspecify.annotations.Nullable;

public class class06917
implements class06695 {
    private final class07288 N;
    private final class00743<class06584> y = class00743.method_10213((int)3, (Object)class06584.E);
    private @Nullable class07324 u;
    private int i;
    private int R;

    public int L() {
        return this.R;
    }

    public class06917(class07288 class072882) {
        this.N = class072882;
    }

    public @Nullable class07324 y() {
        return this.u;
    }

    private boolean y(int n) {
        return n == 0 || n == 1;
    }

    public void N() {
        class06584 class065842;
        class06584 class065843;
        this.u = null;
        if (((class06584)this.y.get(0)).R()) {
            class065843 = (class06584)this.y.get(1);
            class065842 = class06584.E;
        } else {
            class065843 = (class06584)this.y.get(0);
            class065842 = (class06584)this.y.get(1);
        }
        if (class065843.R()) {
            this.method_5447(2, class06584.E);
            this.R = 0;
            return;
        }
        class07316 class073162 = this.N.y();
        if (!class073162.isEmpty()) {
            class07324 class073242 = class073162.N(class065843, class065842, this.i);
            if (class073242 == null || class073242.b()) {
                this.u = class073242;
                class073242 = class073162.N(class065842, class065843, this.i);
            }
            if (class073242 != null && !class073242.b()) {
                this.u = class073242;
                this.method_5447(2, class073242.B());
                this.R = class073242.T();
            } else {
                this.method_5447(2, class06584.E);
                this.R = 0;
            }
        }
        this.N.d_(this.method_5438(2));
    }

    public void N(int n) {
        this.i = n;
        this.N();
    }

    public boolean method_5443(class08036 class080362) {
        return this.N.N() == class080362;
    }

    public void method_5448() {
        this.y.clear();
    }

    public void method_5447(int n, class06584 class065842) {
        this.y.set(n, (Object)class065842);
        class065842.R(this.a_(class065842));
        if (this.y(n)) {
            this.N();
        }
    }

    public void method_5431() {
        this.N();
    }

    public class06584 method_5434(int n, int n2) {
        class06584 class065842 = (class06584)this.y.get(n);
        if (n == 2 && !class065842.R()) {
            return class06686.N(this.y, (int)n, (int)class065842.c());
        }
        class06584 class065843 = class06686.N(this.y, (int)n, (int)n2);
        if (!class065843.R() && this.y(n)) {
            this.N();
        }
        return class065843;
    }

    public class06584 method_5441(int n) {
        return class06686.N(this.y, (int)n);
    }

    public boolean method_5442() {
        Iterator var1 = this.y.iterator();
        while (var1.hasNext()) {
            if (((class06584)var1.next()).R()) continue;
            return false;
        }
        return true;
    }

    public class06584 method_5438(int n) {
        return (class06584)this.y.get(n);
    }

    public int method_5439() {
        return this.y.size();
    }
}

