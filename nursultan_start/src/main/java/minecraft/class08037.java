/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class02329
 *  minecraft.class02484
 *  minecraft.class03289
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class06517
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07055
 *  minecraft.class07078
 *  minecraft.class07103
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07438
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class02131;
import minecraft.class02154;
import minecraft.class02329;
import minecraft.class02484;
import minecraft.class03289;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class06517;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07055;
import minecraft.class07078;
import minecraft.class07103;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07438;
import minecraft.class08007;
import org.jspecify.annotations.Nullable;

public class class08037
extends class08007 {
    private static final int u = 600;
    private static final int R = -1;
    private static final class02131<Integer> M = class03289.N(class08037.class, (class04383)class02154.y);
    private static final byte B = 0;

    @Override
    protected class06584 M() {
        return new class06584((class07310)class06570.sD);
    }

    @Override
    protected void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(M, (Object)-1);
    }

    @Override
    public void method_5773() {
        super.method_5773();
        if (this.method_73183().method_8608()) {
            if (this.y()) {
                if (this.N % 5 == 0) {
                    this.N(1);
                }
            } else {
                this.N(2);
            }
        } else if (this.y() && this.N != 0 && !this.b().equals((Object)class06517.N) && this.N >= 600) {
            this.method_73183().method_8421((class07049)this, (byte)0);
            this.N(new class06584((class07310)class06570.sD));
        }
    }

    public void method_5711(byte by) {
        if (by == 0) {
            int n = this.m();
            if (n != -1) {
                float f = (float)(n >> 16 & 0xFF) / 255.0f;
                float f2 = (float)(n >> 8 & 0xFF) / 255.0f;
                float f3 = (float)(n >> 0 & 0xFF) / 255.0f;
                for (int i = 0; i < 20; ++i) {
                    this.method_73183().method_8406((class07126)class02329.N((class07103)class07107.t, (float)f, (float)f2, (float)f3), this.method_23322(0.5), this.method_23319(), this.method_23325(0.5), 0.0, 0.0, 0.0);
                }
            }
        } else {
            super.method_5711(by);
        }
    }

    public class08037(class07078<? extends class08037> class070782, class07299 class072992) {
        super((class07078<? extends class08007>)class070782, class072992);
    }

    public class08037(class07299 class072992, class07438 class074382, class06584 class065842, @Nullable class06584 class065843) {
        super((class07078<? extends class08007>)class07078.Z, class074382, class072992, class065842, class065843);
        this.v();
    }

    public class08037(class07299 class072992, double d, double d2, double d3, class06584 class065842, @Nullable class06584 class065843) {
        super((class07078<? extends class08007>)class07078.Z, d, d2, d3, class072992, class065842, class065843);
        this.v();
    }

    private class06517 b() {
        return (class06517)this.B().a_(class02484.h, (Object)class06517.N);
    }

    public int m() {
        return (Integer)this.field_6011.N(M);
    }

    private void v() {
        class06517 class065172 = this.b();
        this.field_6011.N(M, (Object)(class065172.equals((Object)class06517.N) ? -1 : class065172.y()));
    }

    private float j() {
        return ((Float)this.B().a_(class02484.r, (Object)Float.valueOf(1.0f))).floatValue();
    }

    private void N(class06517 class065172) {
        this.B().N(class02484.h, (Object)class065172);
        this.v();
    }

    @Override
    protected void N(class06584 class065842) {
        super.N(class065842);
        this.v();
    }

    public void N(class07055 class070552) {
        this.N(this.b().N(class070552));
    }

    private void N(int n) {
        int n2 = this.m();
        if (n2 == -1 || n <= 0) {
            return;
        }
        for (int i = 0; i < n; ++i) {
            this.method_73183().method_8406((class07126)class02329.N((class07103)class07107.t, (int)n2), this.method_23322(0.5), this.method_23319(), this.method_23325(0.5), 0.0, 0.0, 0.0);
        }
    }

    @Override
    protected void N(class07438 class074382) {
        super.N(class074382);
        class07049 class070492 = this.P();
        class06517 class065172 = this.b();
        float f = this.j();
        class065172.N(class070552 -> class074382.method_37222(class070552, class070492), f);
    }
}

