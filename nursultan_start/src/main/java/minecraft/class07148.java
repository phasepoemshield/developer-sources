/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00675
 *  minecraft.class00703
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class02329
 *  minecraft.class03289
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04995
 *  minecraft.class07078
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class07623
 *  minecraft.class08299
 *  minecraft.class08329
 */
package minecraft;

import minecraft.class00675;
import minecraft.class00703;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class02329;
import minecraft.class03289;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04995;
import minecraft.class07078;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07156;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07623;
import minecraft.class08299;
import minecraft.class08329;

public abstract class class07148
extends class00675 {
    private static final class02131<Byte> N = class03289.N(class07148.class, (class04383)class02154.N);
    private static final int R = 0;
    protected int y = 0;
    private class07156 M = class07156.field_7377;

    public class00703 M() {
        if (this.n()) {
            return class00703.field_7212;
        }
        if (this.Ng()) {
            return class00703.field_19012;
        }
        return class00703.field_7207;
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(N, (Object)0);
    }

    public void method_5773() {
        super.method_5773();
        if (this.method_73183().method_8608() && this.n()) {
            class07156 class071562 = this.t();
            float f = (float)class071562.field_7374[0];
            float f2 = (float)class071562.field_7374[1];
            float f3 = (float)class071562.field_7374[2];
            float f4 = ((class07438)this).fields_4212a028292fd3c078969e3ee4c71d9e8_0.floatValue() * ((float)Math.PI / 180) + class04995.P((double)((float)this.field_6012 * 0.6662f)) * 0.25f;
            float f5 = class04995.P((double)f4);
            float f6 = class04995.m((double)f4);
            double d = 0.6 * (double)this.method_55693();
            double d2 = 1.8 * (double)this.method_55693();
            this.method_73183().method_8406((class07126)class02329.N(class07107.t, (float)f, (float)f2, (float)f3), this.method_23317() + (double)f5 * d, this.method_23318() + d2, this.method_23321() + (double)f6 * d, 0.0, 0.0, 0.0);
            this.method_73183().method_8406((class07126)class02329.N(class07107.t, (float)f, (float)f2, (float)f3), this.method_23317() - (double)f5 * d, this.method_23318() + d2, this.method_23321() - (double)f6 * d, 0.0, 0.0, 0.0);
        }
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N("SpellTicks", this.y);
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.y = class082992.N("SpellTicks", 0);
    }

    protected class07148(class07078<? extends class07148> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    public boolean n() {
        if (this.method_73183().method_8608()) {
            return (Byte)this.field_6011.N(N) > 0;
        }
        return this.y > 0;
    }

    protected abstract class04891 m();

    protected class07156 t() {
        if (!this.method_73183().method_8608()) {
            return this.M;
        }
        return class07156.N(((Byte)this.field_6011.N(N)).byteValue());
    }

    static /* synthetic */ class07623 N(class07148 class071482) {
        return class071482.V;
    }

    public void N(class07156 class071562) {
        this.M = class071562;
        this.field_6011.N(N, (Object)((byte)class071562.field_7375));
    }

    protected void N(class04782 class047822) {
        super.N(class047822);
        if (this.y > 0) {
            --this.y;
        }
    }

    protected int G() {
        return this.y;
    }
}

