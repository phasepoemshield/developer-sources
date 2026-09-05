/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class00873
 *  minecraft.class01362
 *  minecraft.class04090
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class05543
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08815
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;
import minecraft.class00500;
import minecraft.class00873;
import minecraft.class01362;
import minecraft.class04090;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class05543;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08815;

public class class05580
extends class08815
implements class00873 {
    public static final MapCodec<class05580> N = class05580.y(class05580::new);
    private final class04090 i = new class04090((class05543)this);

    public class05580(class01362 class013622) {
        super(class013622);
    }

    public class04090 y() {
        return this.i;
    }

    protected boolean y(class00500 class005002) {
        return class005002.Y().W();
    }

    public static ToIntFunction<class00500> y(int n) {
        return class005002 -> class05543.T((class00500)class005002) ? n : 0;
    }

    public MapCodec<class05580> N() {
        return N;
    }

    public void N(class04782 class047822, class06069 class060692, class07209 class072092, class00500 class005002) {
        this.i.N(class005002, (class07284)class047822, class072092, class060692);
    }

    public boolean N(class07299 class072992, class06069 class060692, class07209 class072092, class00500 class005002) {
        return true;
    }

    public boolean N(class05487 class054872, class07209 class072092, class00500 class005002) {
        return class07211.N().anyMatch(class072112 -> this.i.N(class005002, (class07290)class054872, class072092, class072112.b()));
    }
}

