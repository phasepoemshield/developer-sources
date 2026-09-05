/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class03481
 *  minecraft.class03502
 *  minecraft.class03556
 *  minecraft.class04782
 *  minecraft.class06361
 *  minecraft.class06371
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07299
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00891;
import minecraft.class01155;
import minecraft.class01164;
import minecraft.class01190;
import minecraft.class01194;
import minecraft.class03481;
import minecraft.class03502;
import minecraft.class03556;
import minecraft.class04782;
import minecraft.class06361;
import minecraft.class06371;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07299;
import org.jspecify.annotations.Nullable;

public class class01157
implements class03481 {
    public static final int N = 8;
    protected final class07209 y;
    private final class01190 u;
    final /* synthetic */ class06371 L;

    public boolean L() {
        return true;
    }

    public class01157(class06371 class063712, class07209 class072092) {
        this.L = class063712;
        this.y = class072092;
        this.u = new class01155(class072092);
    }

    public boolean i() {
        return true;
    }

    public void u() {
        this.L.method_5431();
    }

    public class01190 y() {
        return this.u;
    }

    public boolean N(class04782 class047822, class07209 class072092, class03556<class01194> class035562, @Nullable class01164 class011642) {
        if (class072092.equals((Object)this.y) && (class035562.N(class01194.R) || class035562.N(class01194.Z))) {
            return false;
        }
        if (class03502.N(class035562) == 0) {
            return false;
        }
        return class06361.T((class00500)this.L.w());
    }

    public void N(class04782 class047822, class07209 class072092, class03556<class01194> class035562, @Nullable class07049 class070492, @Nullable class07049 class070493, float f) {
        class00500 class005002 = this.L.w();
        if (class06361.T((class00500)class005002)) {
            int n = class03502.N(class035562);
            this.L.N(n);
            int n2 = class03502.N((float)f, (int)this.N());
            class00891 class008912 = class005002.i();
            if (class008912 instanceof class06361) {
                ((class06361)class008912).N(class070492, (class07299)class047822, this.y, class005002, n2, n);
            }
        }
    }

    public int N() {
        return 8;
    }
}

