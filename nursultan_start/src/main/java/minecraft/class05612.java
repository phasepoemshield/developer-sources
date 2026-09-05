/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00318
 *  minecraft.class00500
 *  minecraft.class05487
 *  minecraft.class05974
 *  minecraft.class06058
 *  minecraft.class06069
 *  minecraft.class06391
 *  minecraft.class06761
 *  minecraft.class07209
 *  minecraft.class07284
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00318;
import minecraft.class00500;
import minecraft.class05487;
import minecraft.class05610;
import minecraft.class05974;
import minecraft.class06058;
import minecraft.class06069;
import minecraft.class06391;
import minecraft.class06761;
import minecraft.class07209;
import minecraft.class07284;

public class class05612
extends class06391<class05610> {
    public class05612(Codec<class05610> codec) {
        super(codec);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean N(class06058<class05610> class060582) {
        class05610 class056102 = (class05610)class060582.R();
        class05974 class059742 = class060582.y();
        class07209 class072092 = class060582.i();
        class00500 class005002 = class056102.N().N(class060582.u(), class072092);
        if (!class005002.N((class05487)class059742, class072092)) return false;
        if (class005002.i() instanceof class06761) {
            if (!class059742.R(class072092.method_10084())) return false;
            class06761.N((class07284)class059742, (class00500)class005002, (class07209)class072092, (int)2);
        } else if (class005002.i() instanceof class00318) {
            class00318.N((class07284)class059742, (class07209)class072092, (class06069)class059742.method_8409(), (int)2);
        } else {
            class059742.method_8652(class072092, class005002, 2);
        }
        if (!class056102.y()) return true;
        class059742.N(class072092, class059742.method_8320(class072092).i(), 1);
        return true;
    }
}

