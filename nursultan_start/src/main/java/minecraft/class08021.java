/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00683
 *  minecraft.class01339
 *  minecraft.class04293
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class06145
 *  minecraft.class06183
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07089
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07276
 *  minecraft.class07299
 *  minecraft.class07323
 *  minecraft.class07438
 */
package minecraft;

import minecraft.class00683;
import minecraft.class01339;
import minecraft.class04293;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class06145;
import minecraft.class06183;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07089;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07276;
import minecraft.class07299;
import minecraft.class07323;
import minecraft.class07438;
import minecraft.class08005;
import minecraft.class08038;

public class class08021
extends class08005 {
    @Override
    public void method_31471(class07276 class072762) {
        super.method_31471(class072762);
        class06889 class068892 = class072762.Z();
        for (int i = 0; i < 7; ++i) {
            double d = 0.4 + 0.1 * (double)i;
            this.method_73183().method_8406((class07126)class07107.NE, this.method_23317(), this.method_23318(), this.method_23321(), class068892.M * d, class068892.B, class068892.Z * d);
        }
        this.method_18799(class068892);
    }

    protected void method_5693(class04293 class042932) {
    }

    @Override
    public void method_5773() {
        super.method_5773();
        class06889 class068892 = this.method_18798();
        class07089 class070892 = class08038.N((class07049)this, this::N);
        this.y(class070892);
        double d = this.method_23317() + class068892.M;
        double d2 = this.method_23318() + class068892.B;
        double d3 = this.method_23321() + class068892.Z;
        this.T();
        float f = 0.99f;
        if (this.method_73183().N(this.method_5829()).noneMatch(class01339::P)) {
            this.method_31472();
            return;
        }
        if (this.method_5799()) {
            this.method_31472();
            return;
        }
        this.method_18799(class068892.L((double)0.99f));
        this.method_56990();
        this.method_5814(d, d2, d3);
    }

    protected double method_7490() {
        return 0.06;
    }

    public class08021(class07078<? extends class08021> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    public class08021(class07299 class072992, class00683 class006832) {
        this((class07078<? extends class08021>)class07078.NO, class072992);
        this.L((class07049)class006832);
        this.method_5814(class006832.method_23317() - (double)(class006832.method_17681() + 1.0f) * 0.5 * (double)class04995.m((double)(class006832.fields_4212a028292fd3c078969e3ee4c71d9e8_0.floatValue() * ((float)Math.PI / 180))), class006832.method_23320() - (double)0.1f, class006832.method_23321() + (double)(class006832.method_17681() + 1.0f) * 0.5 * (double)class04995.P((double)(class006832.fields_4212a028292fd3c078969e3ee4c71d9e8_0.floatValue() * ((float)Math.PI / 180))));
    }

    @Override
    protected void N(class06183 class061832) {
        super.N(class061832);
        if (!this.method_73183().method_8608()) {
            this.method_31472();
        }
    }

    @Override
    protected void N(class06145 class061452) {
        super.N(class061452);
        class07049 class070492 = this.z();
        if (class070492 instanceof class07438) {
            class04782 class047822;
            class07438 class074382 = (class07438)class070492;
            class070492 = class061452.L();
            class07072 class070722 = this.method_48923().y((class07049)this, class074382);
            class07299 class072992 = this.method_73183();
            if (class072992 instanceof class04782 && class070492.method_64397(class047822 = (class04782)class072992, class070722, 1.0f)) {
                class07323.N((class04782)class047822, (class07049)class070492, (class07072)class070722);
            }
        }
    }
}

