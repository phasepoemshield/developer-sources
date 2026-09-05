/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00886
 *  minecraft.class00891
 *  minecraft.class01231
 *  minecraft.class01362
 *  minecraft.class02733
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class07117
 *  minecraft.class07192
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07284
 *  minecraft.class07299
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00394;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00886;
import minecraft.class00891;
import minecraft.class01231;
import minecraft.class01362;
import minecraft.class02733;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class07117;
import minecraft.class07192;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07284;
import minecraft.class07299;
import org.jspecify.annotations.Nullable;

public class class07711
extends class00891 {
    public static final MapCodec<class07711> N = class07711.y(class07711::new);
    public static final int y = 6;
    public static final int L = 64;
    private static final class07211[] u = class07211.values();

    public class07711(class01362 class013622) {
        super(class013622);
    }

    private boolean y(class07299 class072992, class07209 class072094) {
        return class07209.method_49925((class07209)class072094, (int)6, (int)65, (class072092, consumer) -> {
            for (class07211 class072112 : u) {
                consumer.accept(class072092.method_10093(class072112));
            }
        }, class072093 -> {
            class00886 class008862;
            if (class072093.equals((Object)class072094)) {
                return class07192.field_55165;
            }
            class00500 class005002 = class072992.method_8320(class072093);
            if (!class072992.method_8316(class072093).N(class01231.N)) {
                return class07192.field_55166;
            }
            class00891 class008912 = class005002.i();
            if (class008912 instanceof class00886 && !(class008862 = (class00886)class008912).N(null, (class07284)class072992, class072093, class005002).R()) {
                return class07192.field_55165;
            }
            if (class005002.i() instanceof class07117) {
                class072992.method_8652(class072093, class00869.N.W(), 3);
            } else if (class005002.N(class00869.Wh) || class005002.N(class00869.Wr) || class005002.N(class00869.yJ) || class005002.N(class00869.yo)) {
                class008862 = class005002.k() ? class072992.method_8321(class072093) : null;
                class07711.N((class00500)class005002, (class07284)class072992, (class07209)class072093, (class00394)class008862);
                class072992.method_8652(class072093, class00869.N.W(), 3);
            } else {
                return class07192.field_55166;
            }
            return class07192.field_55165;
        }) > 1;
    }

    public MapCodec<class07711> N() {
        return N;
    }

    protected void N(class07299 class072992, class07209 class072092) {
        if (this.y(class072992, class072092)) {
            class072992.method_8652(class072092, class00869.Nx.W(), 2);
            class072992.method_8396(null, class072092, class04909.QP, class04911.field_15245, 1.0f, 1.0f);
        }
    }

    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class00891 class008912, @Nullable class02733 class027332, boolean bl) {
        this.N(class072992, class072092);
        super.N(class005002, class072992, class072092, class008912, class027332, bl);
    }

    protected void N_23(class00500 class005002, class07299 class072992, class07209 class072092, class00500 class005003, boolean bl) {
        if (class005003.N(class005002.i())) {
            return;
        }
        this.N(class072992, class072092);
    }
}

