/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00500
 *  minecraft.class01118
 *  minecraft.class01362
 *  minecraft.class04782
 *  minecraft.class06584
 *  minecraft.class07209
 *  minecraft.class07235
 *  minecraft.class07299
 *  minecraft.class07796
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class01118;
import minecraft.class01362;
import minecraft.class04782;
import minecraft.class06584;
import minecraft.class07209;
import minecraft.class07235;
import minecraft.class07299;
import minecraft.class07796;
import org.jspecify.annotations.Nullable;

public class class07033
extends class07796 {
    public static final MapCodec<class07033> N = class07033.y(class07033::new);

    public class07033(class01362 class013622) {
        super(class013622);
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class06584 class065842, boolean bl) {
        super.N(class005002, class047822, class072092, class065842, bl);
        if (bl) {
            int n = 15 + class047822.field_9229.y(15) + class047822.field_9229.y(15);
            this.N(class047822, class072092, n);
        }
    }

    public MapCodec<class07033> N() {
        return N;
    }

    public <T extends class00394> @Nullable class01118<T> N(class07299 class072992, class00500 class005002, class00404<T> class004042) {
        return class07033.N(class004042, (class00404)class00404.field_11889, (class01118)(class072992.method_8608() ? class07235::N : class07235::y));
    }

    public class00394 N(class07209 class072092, class00500 class005002) {
        return new class07235(class072092, class005002);
    }
}

