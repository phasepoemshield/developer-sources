/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class04248
 *  minecraft.class07001
 *  minecraft.class07280
 *  minecraft.class07709
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00381;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04248;
import minecraft.class07001;
import minecraft.class07280;
import minecraft.class07709;
import org.jspecify.annotations.Nullable;

public class class08093
implements class00381<class07280> {
    public static final class02362<class00667, class08093> N = class00381.N(class08093::N, class08093::new);
    private final int y;
    private final @Nullable class07001 L;

    public class08093(int n, @Nullable class07001 class070012) {
        this.y = n;
        this.L = class070012;
    }

    private class08093(class00667 class006672) {
        this.y = class006672.E();
        this.L = class006672.P();
    }

    public boolean i() {
        return true;
    }

    public @Nullable class07001 y() {
        return this.L;
    }

    public int N() {
        return this.y;
    }

    private void N(class00667 class006672) {
        class006672.L(this.y);
        class006672.N((class07709)this.L);
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public class02897<class08093> method_65080() {
        return class04248.yM;
    }
}

