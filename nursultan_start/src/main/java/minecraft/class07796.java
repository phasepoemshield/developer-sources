/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class01118
 *  minecraft.class01362
 *  minecraft.class06237
 *  minecraft.class07190
 *  minecraft.class07209
 *  minecraft.class07299
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class01118;
import minecraft.class01362;
import minecraft.class06237;
import minecraft.class07190;
import minecraft.class07209;
import minecraft.class07299;
import org.jspecify.annotations.Nullable;

public abstract class class07796
extends class00891
implements class07190 {
    public class07796(class01362 class013622) {
        super(class013622);
    }

    protected static <E extends class00394, A extends class00394> @Nullable class01118<A> N(class00404<A> class004042, class00404<E> class004043, class01118<? super E> class011182) {
        return class004043 == class004042 ? class011182 : null;
    }

    protected @Nullable class06237 N(class00500 class005002, class07299 class072992, class07209 class072092) {
        class00394 class003942 = class072992.method_8321(class072092);
        return class003942 instanceof class06237 ? (class06237)class003942 : null;
    }

    protected boolean N(class00500 class005002, class07299 class072992, class07209 class072092, int n, int n2) {
        super.N(class005002, class072992, class072092, n, n2);
        class00394 class003942 = class072992.method_8321(class072092);
        if (class003942 == null) {
            return false;
        }
        return class003942.N(n, n2);
    }

    protected abstract MapCodec<? extends class07796> N();
}

