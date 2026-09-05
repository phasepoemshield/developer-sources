/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01929
 *  minecraft.class02754
 *  minecraft.class02904
 *  minecraft.class05838
 *  minecraft.class06510
 *  minecraft.class06514
 *  minecraft.class06521
 *  minecraft.class06584
 *  minecraft.class07299
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class01929;
import minecraft.class02754;
import minecraft.class02904;
import minecraft.class05838;
import minecraft.class06510;
import minecraft.class06514;
import minecraft.class06521;
import minecraft.class06584;
import minecraft.class07299;
import org.jspecify.annotations.Nullable;

public abstract class class06184
implements class06521<class02904> {
    private final class06510 N;
    private final class06584 y;
    private final String L;
    private @Nullable class02754 u;

    public class06184(String string, class06510 class065102, class06584 class065842) {
        this.L = string;
        this.N = class065102;
        this.y = class065842;
    }

    protected class06584 U() {
        return this.y;
    }

    public class06510 z() {
        return this.N;
    }

    public abstract class05838<? extends class06184> u();

    public String y() {
        return this.L;
    }

    public class06584 method_8116(class02904 class029042, class01929 class019292) {
        return this.y.t();
    }

    public boolean method_8115(class02904 class029042, class07299 class072992) {
        return this.N.method_8093(class029042.L());
    }

    public abstract class06514<? extends class06184> method_8119();

    public class02754 method_61671() {
        if (this.u == null) {
            this.u = class02754.N((class06510)this.N);
        }
        return this.u;
    }
}

