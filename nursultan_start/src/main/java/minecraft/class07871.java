/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00503
 *  minecraft.class01217
 *  minecraft.class01312
 *  minecraft.class01317
 *  minecraft.class01325
 *  minecraft.class01328
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class03289
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class07047
 *  minecraft.class07049
 *  minecraft.class07055
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07438
 *  minecraft.class07473
 *  minecraft.class07629
 *  minecraft.class08036
 *  minecraft.class08299
 *  minecraft.class08329
 */
package minecraft;

import java.util.Iterator;
import minecraft.class00381;
import minecraft.class00503;
import minecraft.class01217;
import minecraft.class01312;
import minecraft.class01317;
import minecraft.class01325;
import minecraft.class01328;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class03289;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07047;
import minecraft.class07049;
import minecraft.class07055;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07438;
import minecraft.class07473;
import minecraft.class07629;
import minecraft.class07902;
import minecraft.class08036;
import minecraft.class08299;
import minecraft.class08329;

public class class07871
extends class07629 {
    private static final class02131<Integer> B = class03289.N(class07871.class, (class04383)class02154.y);
    int N;
    int y;
    private static final class01317 Z = (class074382, class047822) -> {
        if (class074382 instanceof class08036 && ((class08036)class074382).method_68878()) {
            return false;
        }
        return !class074382.method_5864().N(class01217.Y);
    };
    static final class01328 L = class01328.y().i().u().N(Z);
    public static final int u = 0;
    public static final int i = 1;
    public static final int R = 2;
    private static final int W = 0;

    public void method_5674(class02131<?> class021312) {
        if (B.equals(class021312)) {
            this.method_18382();
        }
        super.method_5674(class021312);
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(B, (Object)0);
    }

    public void method_5773() {
        if (!this.method_73183().method_8608() && this.method_5805() && this.method_6034()) {
            if (this.N > 0) {
                if (this.v() == 0) {
                    this.method_56078(class04909.lQ);
                    this.N(1);
                } else if (this.N > 40 && this.v() == 1) {
                    this.method_56078(class04909.lQ);
                    this.N(2);
                }
                ++this.N;
            } else if (this.v() != 0) {
                if (this.y > 60 && this.v() == 2) {
                    this.method_56078(class04909.lY);
                    this.N(1);
                } else if (this.y > 100 && this.v() == 1) {
                    this.method_56078(class04909.lY);
                    this.N(0);
                }
                ++this.y;
            }
        }
        super.method_5773();
    }

    public void method_5694(class08036 class080362) {
        int n = this.v();
        if (class080362 instanceof class04770) {
            class04770 class047702 = (class04770)class080362;
            if (n > 0 && class080362.method_64397(class047702.method_51469(), this.method_48923().y((class07438)this), (float)(1 + n))) {
                if (!this.method_5701()) {
                    class047702.field_13987.method_14364((class00381)new class00503(class00503.U, 0.0f));
                }
                class080362.method_37222(new class07055(class07047.j, 60 * n, 0), (class07049)this);
            }
        }
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N("PuffState", this.v());
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.N(Math.min(class082992.N("PuffState", 0), 2));
    }

    public class07871(class07078<? extends class07871> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.method_18382();
    }

    protected class04891 m() {
        return class04909.lg;
    }

    public int v() {
        return (Integer)this.field_6011.N(B);
    }

    private static float y(int n) {
        switch (n) {
            case 1: {
                return 0.7f;
            }
            case 0: {
                return 0.5f;
            }
        }
        return 1.0f;
    }

    public void N(int n) {
        this.field_6011.N(B, (Object)n);
    }

    private void N(class04782 class047822, class07079 class070792) {
        int n = this.v();
        if (class070792.method_64397(class047822, this.method_48923().y((class07438)this), (float)(1 + n))) {
            class070792.method_37222(new class07055(class07047.j, 60 * n, 0), (class07049)this);
            this.method_5783(class04909.lJ, 1.0f, 1.0f);
        }
    }

    public class06584 Y() {
        return new class06584((class07310)class06570.jb);
    }

    protected void l_() {
        super.l_();
        this.e.N(1, (class07473)new class07902(this));
    }

    public class04891 method_6002() {
        return class04909.lO;
    }

    public class01325 method_55694(class01312 class013122) {
        return super.method_55694(class013122).N(class07871.y(this.v()));
    }

    public void method_6007() {
        super.method_6007();
        Object object = this.method_73183();
        if (object instanceof class04782) {
            class04782 class047822 = (class04782)object;
            if (this.method_5805() && this.v() > 0) {
                object = this.method_73183().N(class07079.class, this.method_5829().M(0.3), class070792 -> L.N(class047822, (class07438)this, (class07438)class070792));
                Iterator iterator = object.iterator();
                while (iterator.hasNext()) {
                    class07079 class070793 = (class07079)iterator.next();
                    if (!class070793.method_5805()) continue;
                    this.N(class047822, class070793);
                }
            }
        }
    }

    public class04891 method_6011(class07072 class070722) {
        return class04909.lI;
    }
}

