/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00753
 *  minecraft.class01296
 *  minecraft.class04782
 *  minecraft.class05475
 *  minecraft.class06293
 *  minecraft.class06889
 *  minecraft.class07209
 *  minecraft.class07475
 *  minecraft.class07978
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00753;
import minecraft.class01296;
import minecraft.class04782;
import minecraft.class05475;
import minecraft.class06293;
import minecraft.class06889;
import minecraft.class07209;
import minecraft.class07475;
import minecraft.class07978;
import org.jspecify.annotations.Nullable;

public class class05696
extends class07978 {
    private static final int Z = 10;
    private static final int z = 7;

    protected @Nullable class06889 M() {
        class01296 class012962;
        class04782 class047822 = (class04782)this.y.method_73183();
        class01296 class012963 = class06293.N((class04782)class047822, (class01296)(class012962 = class01296.N((class07209)this.y.method_24515())), (int)2);
        if (class012963 != class012962) {
            return class05475.N((class07475)this.y, (int)10, (int)7, (class06889)class06889.L((class00753)class012963.U()), (double)1.5707963705062866);
        }
        return null;
    }

    public class05696(class07475 class074752, double d, boolean bl) {
        super(class074752, d, 10, bl);
    }

    public boolean N() {
        class07209 class072092;
        class04782 class047822 = (class04782)this.y.method_73183();
        if (class047822.method_19500(class072092 = this.y.method_24515())) {
            return false;
        }
        return super.N();
    }
}

