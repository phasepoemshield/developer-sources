/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class02733
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07284
 *  minecraft.class07299
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00891;
import minecraft.class02733;
import minecraft.class04376;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07284;
import minecraft.class07299;
import org.jspecify.annotations.Nullable;

public class class04351
implements class04376 {
    private final class07299 y;

    public class04351(class07299 class072992) {
        this.y = class072992;
    }

    @Override
    public void N(class00500 class005002, class07209 class072092, class00891 class008912, @Nullable class02733 class027332, boolean bl) {
        class04376.N(this.y, class005002, class072092, class008912, class027332, bl);
    }

    @Override
    public void N(class07209 class072092, class00891 class008912, @Nullable class02733 class027332) {
        class00500 class005002 = this.y.method_8320(class072092);
        this.N(class005002, class072092, class008912, class027332, false);
    }

    @Override
    public void N(class07211 class072112, class00500 class005002, class07209 class072092, class07209 class072093, int n, int n2) {
        class04376.N((class07284)this.y, class072112, class072092, class072093, class005002, n, n2 - 1);
    }
}

