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
 *  minecraft.class04782
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07796
 *  minecraft.class08064
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
import minecraft.class04481;
import minecraft.class04512;
import minecraft.class04782;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07796;
import minecraft.class08064;
import minecraft.class08092;
import org.jspecify.annotations.Nullable;

public class class04487
extends class07796 {
    public static final MapCodec<class04487> N = class04487.y(class04487::new);
    public static final class08064<class04481> y = class06665.yO;
    public static final class06667 L = class06665.yJ;

    public class04487(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)((class00500)this.Q.y()).y(y, (Comparable)((Object)class04481.field_47383))).y((class08092)L, (Comparable)Boolean.valueOf(false)));
    }

    public MapCodec<class04487> N() {
        return N;
    }

    public <T extends class00394> @Nullable class01118<T> N(class07299 class072993, class00500 class005003, class00404<T> class004042) {
        class01118 class011182;
        if (class072993 instanceof class04782) {
            class04782 class047822 = (class04782)class072993;
            class011182 = class04487.N(class004042, (class00404)class00404.field_47352, (class072992, class072092, class005002, class045122) -> class045122.L().N(class047822, class072092, (boolean)class005002.u((class08092)class06665.yJ).orElse(false)));
        } else {
            class011182 = class04487.N(class004042, (class00404)class00404.field_47352, (class072992, class072092, class005002, class045122) -> class045122.L().N(class072992, class072092, (boolean)class005002.u((class08092)class06665.yJ).orElse(false)));
        }
        return class011182;
    }

    public @Nullable class00394 N(class07209 class072092, class00500 class005002) {
        return new class04512(class072092, class005002);
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y, L});
    }
}

