/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00743
 *  minecraft.class02903
 *  minecraft.class02919
 *  minecraft.class02950
 *  minecraft.class03507
 *  minecraft.class04782
 *  minecraft.class05838
 *  minecraft.class05857
 *  minecraft.class06584
 *  minecraft.class06695
 *  minecraft.class07299
 *  minecraft.class08036
 */
package minecraft;

import minecraft.class00743;
import minecraft.class02903;
import minecraft.class02919;
import minecraft.class02950;
import minecraft.class03507;
import minecraft.class04782;
import minecraft.class05838;
import minecraft.class05857;
import minecraft.class06584;
import minecraft.class06695;
import minecraft.class06937;
import minecraft.class06946;
import minecraft.class07299;
import minecraft.class08036;

public class class06930
extends class06937 {
    private final class03507 N;
    private final class08036 y;
    private int M;

    public class06930(class08036 class080362, class03507 class035072, class06695 class066952, int n, int n2, int n3) {
        super(class066952, n, n2, n3);
        this.y = class080362;
        this.N = class035072;
    }

    @Override
    public boolean u() {
        return true;
    }

    @Override
    protected void y(int n) {
        this.M += n;
    }

    private class00743<class06584> N(class02903 class029032, class07299 class072992) {
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            return class047822.method_64577().N(class05838.N, (class02950)class029032, (class07299)class047822).map(class037292 -> ((class05857)class037292.y()).N(class029032)).orElseGet(() -> class06930.N(class029032));
        }
        return class05857.y((class02903)class029032);
    }

    @Override
    public void N(class08036 class080362, class06584 class065842) {
        this.c_(class065842);
        class02919 class029192 = this.N.aD_();
        class02903 class029032 = class029192.N();
        int n = class029192.y();
        int n2 = class029192.L();
        class00743<class06584> var7 = this.N(class029032, class080362.method_73183());
        for (int i = 0; i < class029032.M(); ++i) {
            for (int j = 0; j < class029032.R(); ++j) {
                int n3 = j + n + (i + n2) * this.N.y();
                class06584 class065843 = this.N.method_5438(n3);
                class06584 class065844 = (class06584)var7.get(j + i * class029032.R());
                if (!class065843.R()) {
                    this.N.method_5434(n3, 1);
                    class065843 = this.N.method_5438(n3);
                }
                if (class065844.R()) continue;
                if (class065843.R()) {
                    this.N.method_5447(n3, class065844);
                    continue;
                }
                if (class06584.L((class06584)class065843, (class06584)class065844)) {
                    class065844.M(class065843.c());
                    this.N.method_5447(n3, class065844);
                    continue;
                }
                if (this.y.method_31548().M(class065844)) continue;
                this.y.method_7328(class065844, false);
            }
        }
    }

    @Override
    public boolean N(class06584 class065842) {
        return false;
    }

    @Override
    public class06584 N(int n) {
        if (this.R()) {
            this.M += Math.min(n, this.i().c());
        }
        return super.N(n);
    }

    @Override
    protected void N(class06584 class065842, int n) {
        this.M += n;
        this.c_(class065842);
    }

    private static class00743<class06584> N(class02903 class029032) {
        class00743 class007432 = class00743.method_10213((int)class029032.N(), (Object)class06584.E);
        for (int i = 0; i < class007432.size(); ++i) {
            class007432.set(i, (Object)class029032.N(i));
        }
        return class007432;
    }

    @Override
    protected void c_(class06584 class065842) {
        class06695 class066952;
        if (this.M > 0) {
            class065842.N(this.y, this.M);
        }
        if ((class066952 = this.L) instanceof class06946) {
            ((class06946)class066952).N(this.y, this.N.aC_());
        }
        this.M = 0;
    }
}

