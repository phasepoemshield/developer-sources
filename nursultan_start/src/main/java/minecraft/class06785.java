/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00500
 *  minecraft.class00701
 *  minecraft.class00753
 *  minecraft.class00891
 *  minecraft.class01231
 *  minecraft.class01362
 *  minecraft.class04206
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06942
 *  minecraft.class07204
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08713
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class00500;
import minecraft.class00701;
import minecraft.class00753;
import minecraft.class00891;
import minecraft.class01231;
import minecraft.class01362;
import minecraft.class04206;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06942;
import minecraft.class07204;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08713;

public class class06785
extends class07204 {
    public static final MapCodec<class06785> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class04206.i.T().fieldOf("concrete").forGetter(class067852 -> class067852.y), (App)class06785.t()).apply(instance, class06785::new));
    private final class00891 y;

    private static boolean T(class00500 class005002) {
        return class005002.Y().N(class01231.N);
    }

    public class06785(class00891 class008912, class01362 class013622) {
        super(class013622);
        this.y = class008912;
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (class06785.N((class07290)class054872, class072092)) {
            return this.y.W();
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    public int N(class00500 class005002, class07290 class072902, class07209 class072092) {
        return class005002.N((class07290)class072902, (class07209)class072092).NU;
    }

    public MapCodec<class06785> N() {
        return N;
    }

    public class00500 N(class06942 class069422) {
        class00500 class005002;
        class07209 class072092;
        class07299 class072992 = class069422.method_8045();
        if (class06785.N((class07290)class072992, class072092 = class069422.method_8037(), class005002 = class072992.method_8320(class072092))) {
            return this.y.W();
        }
        return super.N(class069422);
    }

    private static boolean N(class07290 class072902, class07209 class072092, class00500 class005002) {
        return class06785.T(class005002) || class06785.N(class072902, class072092);
    }

    private static boolean N(class07290 class072902, class07209 class072092) {
        boolean bl = false;
        class07218 class072182 = class072092.method_25503();
        for (class07211 class072112 : class07211.values()) {
            class00500 class005002 = class072902.method_8320((class07209)class072182);
            if (class072112 == class07211.field_11033 && !class06785.T(class005002)) continue;
            class072182.N((class00753)class072092, class072112);
            class005002 = class072902.method_8320((class07209)class072182);
            if (!class06785.T(class005002) || class005002.L(class072902, class072092, class072112.b())) continue;
            bl = true;
            break;
        }
        return bl;
    }

    public void N(class07299 class072992, class07209 class072092, class00500 class005002, class00500 class005003, class00701 class007012) {
        if (class06785.N((class07290)class072992, class072092, class005003)) {
            class072992.method_8652(class072092, this.y.W(), 3);
        }
    }
}

