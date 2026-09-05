/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Dynamic
 *  minecraft.class01289
 *  minecraft.class04643
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class05781
 *  minecraft.class06113
 *  minecraft.class07072
 *  minecraft.class07077
 *  minecraft.class07078
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class08185
 *  minecraft.class08700
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.Dynamic;
import minecraft.class01289;
import minecraft.class04643;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class05781;
import minecraft.class06113;
import minecraft.class07072;
import minecraft.class07077;
import minecraft.class07078;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08156;
import minecraft.class08185;
import minecraft.class08700;
import org.jspecify.annotations.Nullable;

public class class08157
extends class08156 {
    private static final int p = 300;

    public int method_5748() {
        return 300;
    }

    public void method_5670() {
        class07299 class072992;
        int n = this.method_5669();
        super.method_5670();
        if (!this.Nt() && (class072992 = this.method_73183()) instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            this.N(class047822, n);
        }
    }

    protected class04891 method_5737() {
        return this.method_6109() ? class04909.yW : class04909.vu;
    }

    public class08157(class07078<? extends class08157> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    protected class04891 s() {
        if (this.method_6109()) {
            return this.method_5869() ? class04909.yi : class04909.yR;
        }
        return this.method_5869() ? class04909.jA : class04909.jf;
    }

    @Override
    protected class04891 l() {
        return this.method_5869() ? class04909.jx : class04909.jD;
    }

    public boolean g() {
        return !this.Q();
    }

    @Override
    protected void N(class04782 class047822) {
        class04643 class046432 = class08700.N();
        class046432.N("nautilusBrain");
        this.method_18868().N(class047822, (class07438)this);
        class046432.L();
        class046432.N("nautilusActivityUpdate");
        class08185.N((class08157)this);
        class046432.L();
        super.N(class047822);
    }

    public @Nullable class08157 y(class04782 class047822, class07077 class070772) {
        class08157 class081572 = (class08157)class07078.NH.N((class07299)class047822, class06113.field_16466);
        if (class081572 != null && this.NQ()) {
            class081572.a_(this.NI());
            class081572.N(true, true);
        }
        return class081572;
    }

    protected void N(class04782 class047822, int n) {
        if (this.method_5805() && !this.method_5799()) {
            this.method_5855(n - 1);
            if (this.method_5669() <= -20) {
                this.method_5855(0);
                this.method_64397(class047822, this.method_48923().v(), 2.0f);
            }
        } else {
            this.method_5855(300);
        }
    }

    protected void O() {
        class04891 class048912 = this.method_6109() ? class04909.yZ : class04909.vN;
        this.method_56078(class048912);
    }

    @Override
    protected class04891 G() {
        return this.method_5869() ? class04909.jC : class04909.jS;
    }

    public class05781<class08157> method_28306() {
        return class08185.N();
    }

    public class04891 method_6002() {
        if (this.method_6109()) {
            return this.method_5869() ? class04909.yM : class04909.yB;
        }
        return this.method_5869() ? class04909.jh : class04909.jr;
    }

    public class01289<class08157> method_18868() {
        return super.method_18868();
    }

    public class04891 method_6011(class07072 class070722) {
        if (this.method_6109()) {
            return this.method_5869() ? class04909.yz : class04909.yU;
        }
        return this.method_5869() ? class04909.vy : class04909.vL;
    }

    public class01289<?> method_18867(Dynamic<?> dynamic) {
        return class08185.N((class01289)this.method_28306().N(dynamic));
    }
}

