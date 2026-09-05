/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class03289
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04782
 *  minecraft.class05220
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07050
 *  minecraft.class07078
 *  minecraft.class07082
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07327
 *  minecraft.class08036
 *  minecraft.class08299
 *  minecraft.class08329
 */
package minecraft;

import minecraft.class00392;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class03289;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04782;
import minecraft.class05220;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07050;
import minecraft.class07078;
import minecraft.class07082;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07327;
import minecraft.class07496;
import minecraft.class07504;
import minecraft.class08036;
import minecraft.class08299;
import minecraft.class08329;

public class class07480
extends class07504 {
    static final class02131<String> y = class03289.N(class07480.class, (class04383)class02154.i);
    static final class02131<class00392> L = class03289.N(class07480.class, (class04383)class02154.R);
    private final class07327 u = new class07496(this);
    private static final int B = 4;
    private int Z;

    public void method_5674(class02131<?> class021312) {
        super.method_5674(class021312);
        if (L.equals(class021312)) {
            try {
                this.u.y((class00392)this.method_5841().N(L));
            }
            catch (Throwable throwable) {}
        } else if (y.equals(class021312)) {
            this.u.N((String)this.method_5841().N(y));
        }
    }

    @Override
    public class06584 method_31480() {
        return new class06584((class07310)class06570.ly);
    }

    @Override
    protected void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(y, (Object)"");
        class042932.N(L, (Object)class05220.N);
    }

    @Override
    protected void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        this.u.N(class083292);
    }

    public class07082 method_5688(class08036 class080362, class07050 class070502) {
        if (!class080362.method_7338()) {
            return class07082.i;
        }
        if (class080362.method_73183().method_8608()) {
            class080362.method_7257(this);
        }
        return class07082.N;
    }

    @Override
    protected void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.u.N(class082992);
        this.method_5841().N(y, (Object)this.U().u());
        this.method_5841().N(L, (Object)this.U().L());
    }

    public class07480(class07078<? extends class07480> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    public class07327 U() {
        return this.u;
    }

    protected class06581 z() {
        return class06570.sZ;
    }

    @Override
    public void N(class04782 class047822, int n, int n2, int n3, boolean bl) {
        if (bl && this.field_6012 - this.Z >= 4) {
            this.U().y(class047822);
            this.Z = this.field_6012;
        }
    }

    @Override
    public class00500 R() {
        return class00869.MQ.W();
    }
}

