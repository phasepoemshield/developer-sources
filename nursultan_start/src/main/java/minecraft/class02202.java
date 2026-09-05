/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00873
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07299
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00873;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class07299;

public class class02202
extends class00891
implements class00873 {
    public static final MapCodec<class02202> N = class02202.y(class02202::new);

    public class02202(class01362 class013622) {
        super(class013622);
    }

    public class07209 N(class07209 class072092) {
        return class072092.method_10074();
    }

    public void N(class04782 class047822, class06069 class060692, class07209 class072092, class00500 class005002) {
        class047822.method_8501(class072092.method_10074(), class00869.nR.W());
    }

    public MapCodec<class02202> N() {
        return N;
    }

    public boolean N(class07299 class072992, class06069 class060692, class07209 class072092, class00500 class005002) {
        return true;
    }

    public boolean N(class05487 class054872, class07209 class072092, class00500 class005002) {
        return class054872.method_8320(class072092.method_10074()).P();
    }
}

