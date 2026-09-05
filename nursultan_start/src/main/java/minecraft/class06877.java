/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class02733
 *  minecraft.class04782
 *  minecraft.class06069
 *  minecraft.class06667
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class08092
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class02733;
import minecraft.class04782;
import minecraft.class06069;
import minecraft.class06667;
import minecraft.class06896;
import minecraft.class06942;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class08092;
import org.jspecify.annotations.Nullable;

public class class06877
extends class00891 {
    public static final MapCodec<class06877> N = class06877.y(class06877::new);
    public static final class06667 y = class06896.i;

    public class06877(class01362 class013622) {
        super(class013622);
        this.P((class00500)this.W().y((class08092)y, (Comparable)Boolean.valueOf(false)));
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y});
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        if (((Boolean)class005002.L((class08092)y)).booleanValue() && !class047822.W(class072092)) {
            class047822.method_8652(class072092, (class00500)class005002.N((class08092)y), 2);
        }
    }

    public MapCodec<class06877> N() {
        return N;
    }

    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class00891 class008912, @Nullable class02733 class027332, boolean bl) {
        if (class072992.method_8608()) {
            return;
        }
        boolean bl2 = (Boolean)class005002.L((class08092)y);
        if (bl2 != class072992.W(class072092)) {
            if (bl2) {
                class072992.N(class072092, (class00891)this, 4);
            } else {
                class072992.method_8652(class072092, (class00500)class005002.N((class08092)y), 2);
            }
        }
    }

    public @Nullable class00500 N(class06942 class069422) {
        return (class00500)this.W().y((class08092)y, (Comparable)Boolean.valueOf(class069422.method_8045().W(class069422.method_8037())));
    }
}

