/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02325
 *  minecraft.class02328
 *  minecraft.class02332
 *  minecraft.class02346
 *  minecraft.class07536
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class02325;
import minecraft.class02328;
import minecraft.class02332;
import minecraft.class02346;
import minecraft.class07536;
import minecraft.class08501;
import minecraft.class08506;
import minecraft.class08508;
import minecraft.class08516;
import minecraft.class08527;
import org.jspecify.annotations.Nullable;

public abstract class class08538
implements class02325 {
    private @Nullable class08516[] N = new class08516[256];
    private final class02346 y;
    private final class02332 L = new class02332();
    private @Nullable class08506[] u = new class08506[16];
    private int i;
    private final class08508 R = new class08508(this);

    public class02328 L() {
        Object object;
        int n;
        int n2 = this.u.length;
        if (this.i >= n2) {
            n = class07536.N((int)n2, (int)(this.i + 1));
            object = new class08506[n];
            System.arraycopy(this.u, 0, object, 0, n2);
            this.u = object;
        }
        if ((object = this.u[n = this.i++]) == null) {
            this.u[n] = object = new class08506();
        } else {
            ((class08506)object).L();
        }
        return object;
    }

    protected class08538(class02346 class023462) {
        this.y = class023462;
    }

    public class02325 i() {
        return this.R;
    }

    public void u() {
        --this.i;
    }

    private class08516 y(int n) {
        class08516 class085162;
        int n2 = this.N.length;
        if (n >= n2) {
            int n3 = class07536.N((int)n2, (int)(n + 1));
            class08516[] class08516Array = new class08516[n3];
            System.arraycopy(this.N, 0, class08516Array, 0, n2);
            this.N = class08516Array;
        }
        if ((class085162 = this.N[n]) == null) {
            this.N[n] = class085162 = new class08516();
        }
        return class085162;
    }

    public class02346 y() {
        return this.y;
    }

    public @Nullable Object N(class08501 class085012) {
        class08527<Object> class085272;
        Object object;
        int n = this.M();
        class08516 class085162 = this.y(n);
        int n2 = class085162.N(class085012.N());
        if (n2 != -1) {
            object = class085162.N(n2);
            if (object != null) {
                if (object == class08527.L) {
                    return null;
                }
                this.N(object.L());
                return object.y();
            }
        } else {
            n2 = class085162.y(class085012.N());
        }
        if ((object = class085012.y().y((class02325)this)) == null) {
            class085272 = class08527.N();
        } else {
            int n3 = this.M();
            class085272 = new class08527<Object>(object, n3);
        }
        class085162.N(n2, class085272);
        return object;
    }

    public class02332 N() {
        return this.L;
    }
}

