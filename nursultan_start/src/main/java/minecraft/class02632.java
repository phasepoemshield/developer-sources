/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06758
 *  minecraft.class06889
 *  minecraft.class07210
 */
package minecraft;

import java.util.OptionalInt;
import minecraft.class02627;
import minecraft.class02649;
import minecraft.class06758;
import minecraft.class06889;
import minecraft.class07210;

public class class02632 {
    private class02627 N = (class072102, class072112) -> class06758.N((class07210)class072102, (double)0.7, (class06889)new class06889(0.0, 0.1, 0.0));
    private float y = 6.0f;
    private float L = 1.1f;
    private OptionalInt u = OptionalInt.empty();

    public class02632 y(float f) {
        this.L = f;
        return this;
    }

    public class02649 N() {
        return new class02649(this.N, this.y, this.L, this.u);
    }

    public class02632 N(int n) {
        this.u = OptionalInt.of(n);
        return this;
    }

    public class02632 N(class02627 class026272) {
        this.N = class026272;
        return this;
    }

    public class02632 N(float f) {
        this.y = f;
        return this;
    }
}

