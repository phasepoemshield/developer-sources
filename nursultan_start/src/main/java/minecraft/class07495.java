/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00743
 *  minecraft.class02741
 *  minecraft.class03507
 *  minecraft.class06584
 *  minecraft.class06686
 *  minecraft.class06695
 *  minecraft.class08036
 */
package minecraft;

import java.util.Iterator;
import java.util.List;
import minecraft.class00743;
import minecraft.class02741;
import minecraft.class03507;
import minecraft.class06584;
import minecraft.class06686;
import minecraft.class06695;
import minecraft.class07482;
import minecraft.class08036;

public class class07495
implements class03507 {
    private final class00743<class06584> N;
    private final int y;
    private final int u;
    private final class07482 i;

    public class07495(class07482 class074822, int n, int n2) {
        this(class074822, n, n2, (class00743<class06584>)class00743.method_10213((int)(n * n2), (Object)class06584.E));
    }

    private class07495(class07482 class074822, int n, int n2, class00743<class06584> class007432) {
        this.N = class007432;
        this.i = class074822;
        this.y = n;
        this.u = n2;
    }

    public int y() {
        return this.y;
    }

    public int N() {
        return this.u;
    }

    public void N(class02741 class027412) {
        for (class06584 class065842 : this.N) {
            class027412.N(class065842);
        }
    }

    public boolean method_5443(class08036 class080362) {
        return true;
    }

    public void method_5448() {
        this.N.clear();
    }

    public void method_5447(int n, class06584 class065842) {
        this.N.set(n, (Object)class065842);
        this.i.y((class06695)this);
    }

    public void method_5431() {
    }

    public class06584 method_5434(int n, int n2) {
        class06584 class065842 = class06686.N(this.N, (int)n, (int)n2);
        if (!class065842.R()) {
            this.i.y((class06695)this);
        }
        return class065842;
    }

    public class06584 method_5441(int n) {
        return class06686.N(this.N, (int)n);
    }

    public boolean method_5442() {
        Iterator var1 = this.N.iterator();
        while (var1.hasNext()) {
            if (((class06584)var1.next()).R()) continue;
            return false;
        }
        return true;
    }

    public List<class06584> aC_() {
        return List.copyOf(this.N);
    }

    public class06584 method_5438(int n) {
        if (n >= this.method_5439()) {
            return class06584.E;
        }
        return (class06584)this.N.get(n);
    }

    public int method_5439() {
        return this.N.size();
    }
}

