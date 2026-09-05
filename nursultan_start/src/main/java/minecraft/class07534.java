/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01001
 *  minecraft.class04782
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class06113
 *  minecraft.class06889
 *  minecraft.class07047
 *  minecraft.class07049
 *  minecraft.class07052
 *  minecraft.class07055
 *  minecraft.class07078
 *  minecraft.class07086
 *  minecraft.class07141
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class07446
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class01001;
import minecraft.class04782;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class06113;
import minecraft.class06889;
import minecraft.class07047;
import minecraft.class07049;
import minecraft.class07052;
import minecraft.class07055;
import minecraft.class07078;
import minecraft.class07086;
import minecraft.class07141;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07446;
import org.jspecify.annotations.Nullable;

public class class07534
extends class07141 {
    public static class05300 M() {
        return class07141.B().N(class05298.n, 12.0);
    }

    public class06889 method_55668(class07049 class070492) {
        if (class070492.method_17681() <= this.method_17681()) {
            return new class06889(0.0, 0.21875 * (double)this.method_55693(), 0.0);
        }
        return super.method_55668(class070492);
    }

    public class07534(class07078<? extends class07534> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    public @Nullable class07446 N(class01001 class010012, class07052 class070522, class06113 class061132, @Nullable class07446 class074462) {
        return class074462;
    }

    public boolean method_6121(class04782 class047822, class07049 class070492) {
        if (super.method_6121(class047822, class070492)) {
            if (class070492 instanceof class07438) {
                int n = 0;
                if (this.method_73183().y() == class07086.field_5802) {
                    n = 7;
                } else if (this.method_73183().y() == class07086.field_5807) {
                    n = 15;
                }
                if (n > 0) {
                    ((class07438)class070492).method_37222(new class07055(class07047.j, n * 20, 0), (class07049)this);
                }
            }
            return true;
        }
        return false;
    }
}

