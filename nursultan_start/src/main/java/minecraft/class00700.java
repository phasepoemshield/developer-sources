/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class01194
 *  minecraft.class01210
 *  minecraft.class01599
 *  minecraft.class02607
 *  minecraft.class02901
 *  minecraft.class03556
 *  minecraft.class04293
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07041
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07078
 *  minecraft.class07082
 *  minecraft.class07209
 *  minecraft.class07276
 *  minecraft.class07280
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class08036
 *  minecraft.class08299
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.List;
import minecraft.class00381;
import minecraft.class00734;
import minecraft.class01194;
import minecraft.class01210;
import minecraft.class01599;
import minecraft.class02607;
import minecraft.class02901;
import minecraft.class03556;
import minecraft.class04293;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07041;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07078;
import minecraft.class07082;
import minecraft.class07209;
import minecraft.class07276;
import minecraft.class07280;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class08036;
import minecraft.class08299;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;

public class class00700
extends class02901 {
    public static final double N = 0.375;

    public void L() {
        this.method_5783(class04909.TL, 1.0f, 1.0f);
    }

    public class06584 method_31480() {
        return new class06584((class07310)class06570.Gr);
    }

    public class00381<class07280> method_18002(class01599 class015992) {
        return new class07276((class07049)this, 0, this.s());
    }

    public void method_70982(class02607 class026072) {
        if (class02607.Z((class07049)this).isEmpty()) {
            this.method_31472();
        }
    }

    public class06889 method_30951(float f) {
        return this.method_30950(f).y(0.0, 0.2, 0.0);
    }

    protected void method_5693(class04293 class042932) {
    }

    protected void method_5652(class08329 class083292) {
    }

    public boolean method_5640(double d) {
        return d < 1024.0;
    }

    public class07082 method_5688(class08036 class080362, class07050 class070502) {
        class07041 class070412;
        class07082 class070822;
        if (this.method_73183().method_8608()) {
            return class07082.N;
        }
        if (class080362.method_5998(class070502).N(class06570.vr) && (class070822 = super.method_5688(class080362, class070502)) instanceof class07041 && (class070412 = (class07041)class070822).L()) {
            return class070822;
        }
        boolean bl = false;
        List var4 = class02607.Z((class07049)class080362);
        for (class02607 class026072 : var4) {
            if (!class026072.R((class07049)this)) continue;
            class026072.N((class07049)this, true);
            bl = true;
        }
        boolean bl2 = false;
        if (!bl && !class080362.method_21823()) {
            List var6 = class02607.Z((class07049)this);
            for (class02607 class026073 : var6) {
                if (!class026073.R((class07049)class080362)) continue;
                class026073.N((class07049)class080362, true);
                bl2 = true;
            }
        }
        if (bl || bl2) {
            this.method_32875((class03556)class01194.y, (class07049)class080362);
            this.method_43077(class04909.TL);
            return class07082.N;
        }
        return super.method_5688(class080362, class070502);
    }

    protected void method_5749(class08299 class082992) {
    }

    public class00700(class07299 class072992, class07209 class072092) {
        super(class07078.Nk, class072992, class072092);
        this.method_5814(class072092.method_10263(), class072092.method_10264(), class072092.method_10260());
    }

    public class00700(class07078<? extends class00700> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    public boolean y() {
        return this.method_73183().method_8320(this.y).N(class01210.A);
    }

    public void N(class04782 class047822, @Nullable class07049 class070492) {
        this.method_5783(class04909.Ty, 1.0f, 1.0f);
    }

    public static class00700 N(class07299 class072992, class07209 class072092) {
        int n = class072092.method_10263();
        int n2 = class072092.method_10264();
        int n3 = class072092.method_10260();
        for (class00700 class007002 : class072992.N(class00700.class, new class00734((double)n - 1.0, (double)n2 - 1.0, (double)n3 - 1.0, (double)n + 1.0, (double)n2 + 1.0, (double)n3 + 1.0))) {
            if (!class007002.s().equals((Object)class072092)) continue;
            return class007002;
        }
        class00700 class007003 = new class00700(class072992, class072092);
        class072992.method_8649((class07049)class007003);
        return class007003;
    }

    protected void N() {
        this.method_23327((double)this.y.method_10263() + 0.5, (double)this.y.method_10264() + 0.375, (double)this.y.method_10260() + 0.5);
        double d = (double)this.method_5864().z() / 2.0;
        double d2 = this.method_5864().U();
        this.method_5857(new class00734(this.method_23317() - d, this.method_23318(), this.method_23321() - d, this.method_23317() + d, this.method_23318() + d2, this.method_23321() + d));
    }
}

