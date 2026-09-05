/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00743
 *  minecraft.class03729
 *  minecraft.class06584
 *  minecraft.class06686
 *  minecraft.class06695
 *  minecraft.class08036
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Iterator;
import minecraft.class00743;
import minecraft.class03729;
import minecraft.class06584;
import minecraft.class06686;
import minecraft.class06695;
import minecraft.class06946;
import minecraft.class08036;
import org.jspecify.annotations.Nullable;

public class class06919
implements class06695,
class06946 {
    private final class00743<class06584> N = class00743.method_10213((int)1, (Object)class06584.E);
    private @Nullable class03729<?> y;

    @Override
    public void N(@Nullable class03729<?> class037292) {
        this.y = class037292;
    }

    @Override
    public @Nullable class03729<?> N() {
        return this.y;
    }

    public boolean method_5443(class08036 class080362) {
        return true;
    }

    public void method_5448() {
        this.N.clear();
    }

    public void method_5447(int n, class06584 class065842) {
        this.N.set(0, (Object)class065842);
    }

    public void method_5431() {
    }

    public class06584 method_5434(int n, int n2) {
        return class06686.N(this.N, (int)0);
    }

    public class06584 method_5441(int n) {
        return class06686.N(this.N, (int)0);
    }

    public boolean method_5442() {
        Iterator var1 = this.N.iterator();
        while (var1.hasNext()) {
            if (((class06584)var1.next()).R()) continue;
            return false;
        }
        return true;
    }

    public class06584 method_5438(int n) {
        return (class06584)this.N.get(0);
    }

    public int method_5439() {
        return 1;
    }
}

