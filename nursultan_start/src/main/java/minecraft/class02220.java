/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class04782
 *  minecraft.class06889
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07284
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00753;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class02206;
import minecraft.class02250;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class04782;
import minecraft.class06889;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07284;
import org.jspecify.annotations.Nullable;

public class class02220 {
    public static final int N = 20;
    private long y;
    private @Nullable class03556<class02206> L;
    private final class07209 u;
    private final class02250 i;

    public long L() {
        return this.y;
    }

    public class02220(class02250 class022502, class07209 class072092) {
        this.i = class022502;
        this.u = class072092;
    }

    private boolean u() {
        return this.y % 20L == 0L;
    }

    public void y(class07284 class072842, @Nullable class00500 class005002) {
        if (this.L == null) {
            return;
        }
        if (((class02206)((Object)this.L.N())).N(this.y)) {
            this.N(class072842, class005002);
            return;
        }
        if (this.u()) {
            class072842.N((class03556)class01194.g, this.u, class01164.N((class00500)class005002));
            class02220.N(class072842, this.u);
        }
        ++this.y;
    }

    public @Nullable class02206 y() {
        if (this.L == null) {
            return null;
        }
        return (class02206)((Object)this.L.N());
    }

    private static void N(class07284 class072842, class07209 class072092) {
        if (class072842 instanceof class04782) {
            class04782 class047822 = (class04782)class072842;
            class06889 class068892 = class06889.L((class00753)class072092).y(0.0, (double)1.2f, 0.0);
            float f = (float)class072842.method_8409().y(4) / 24.0f;
            class047822.method_65096((class07126)class07107.Ni, class068892.N(), class068892.y(), class068892.L(), 0, (double)f, 0.0, 0.0, 1.0);
        }
    }

    public void N(class07284 class072842, @Nullable class00500 class005002) {
        if (this.L == null) {
            return;
        }
        this.L = null;
        this.y = 0L;
        class072842.N((class03556)class01194.I, this.u, class01164.N((class00500)class005002));
        class072842.N(1011, this.u, 0);
        this.i.notifyChange();
    }

    public void N(class07284 class072842, class03556<class02206> class035562) {
        this.L = class035562;
        this.y = 0L;
        int n = class072842.method_30349().L(class04227.yz).N((Object)((class02206)((Object)this.L.N())));
        class072842.method_8444(null, 1010, this.u, n);
        this.i.notifyChange();
    }

    public void N(class03556<class02206> class035562, long l) {
        if (((class02206)((Object)class035562.N())).N(l)) {
            return;
        }
        this.L = class035562;
        this.y = l;
    }

    public boolean N() {
        return this.L != null;
    }
}

