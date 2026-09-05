/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00891
 *  minecraft.class01118
 *  minecraft.class01362
 *  minecraft.class02142
 *  minecraft.class02151
 *  minecraft.class04782
 *  minecraft.class06069
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07796
 *  minecraft.class08092
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00891;
import minecraft.class01118;
import minecraft.class01362;
import minecraft.class02142;
import minecraft.class02151;
import minecraft.class04078;
import minecraft.class04782;
import minecraft.class06069;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07796;
import minecraft.class08092;
import org.jspecify.annotations.Nullable;

public class class04066
extends class07796 {
    public static final MapCodec<class04066> N = class04066.y(class04066::new);
    public static final class06667 y = class06665.L;
    private final class02142 L = class02151.N((int)5);

    public class04066(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)this.Q.y()).y((class08092)y, (Comparable)Boolean.valueOf(false)));
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class06584 class065842, boolean bl) {
        super.N(class005002, class047822, class072092, class065842, bl);
        if (bl) {
            this.N(class047822, class072092, class065842, this.L);
        }
    }

    public <T extends class00394> @Nullable class01118<T> N(class07299 class072992, class00500 class005002, class00404<T> class004042) {
        if (class072992.method_8608()) {
            return null;
        }
        return class04066.N(class004042, (class00404)class00404.field_37647, class04078::N);
    }

    public MapCodec<class04066> N() {
        return N;
    }

    public @Nullable class00394 N(class07209 class072092, class00500 class005002) {
        return new class04078(class072092, class005002);
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        if (((Boolean)class005002.L((class08092)y)).booleanValue()) {
            class047822.method_8652(class072092, (class00500)class005002.y((class08092)y, (Comparable)Boolean.valueOf(false)), 3);
        }
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y});
    }
}

