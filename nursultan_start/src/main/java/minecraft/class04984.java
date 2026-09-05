/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class00751
 *  minecraft.class00869
 *  minecraft.class00873
 *  minecraft.class00891
 *  minecraft.class00901
 *  minecraft.class01362
 *  minecraft.class03161
 *  minecraft.class03238
 *  minecraft.class04227
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class05946
 *  minecraft.class05974
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07299
 *  minecraft.class08088
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00500;
import minecraft.class00751;
import minecraft.class00869;
import minecraft.class00873;
import minecraft.class00891;
import minecraft.class00901;
import minecraft.class01362;
import minecraft.class03161;
import minecraft.class03238;
import minecraft.class04227;
import minecraft.class04782;
import minecraft.class05015;
import minecraft.class05487;
import minecraft.class05946;
import minecraft.class05974;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07299;
import minecraft.class08088;

public class class04984
extends class00891
implements class00873 {
    public static final MapCodec<class04984> N = class04984.y(class04984::new);

    public class04984(class01362 class013622) {
        super(class013622);
    }

    protected void y_2(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        if (!class04984.y(class005002, (class05487)class047822, class072092)) {
            class047822.method_8501(class072092, class00869.id.W());
        }
    }

    private static boolean y(class00500 class005002, class05487 class054872, class07209 class072092) {
        class07209 class072093 = class072092.method_10084();
        class00500 class005003 = class054872.method_8320(class072093);
        return class05015.N(class005002, class005003, class07211.field_11036, class005003.z()) < 15;
    }

    private void N(class00751<class03238<?, ?>> class007512, class05946<class03238<?, ?>> class059462, class04782 class047822, class08088 class080882, class06069 class060692, class07209 class072092) {
        class007512.N(class059462).ifPresent(class035292 -> ((class03238)class035292.N()).N((class05974)class047822, class080882, class060692, class072092));
    }

    public MapCodec<class04984> N() {
        return N;
    }

    public boolean N(class05487 class054872, class07209 class072092, class00500 class005002) {
        return class054872.method_8320(class072092.method_10084()).P();
    }

    public boolean N(class07299 class072992, class06069 class060692, class07209 class072092, class00500 class005002) {
        return true;
    }

    public void N(class04782 class047822, class06069 class060692, class07209 class072092, class00500 class005002) {
        class00500 class005003 = class047822.method_8320(class072092);
        class07209 class072093 = class072092.method_10084();
        class08088 class080882 = class047822.method_14178().U();
        class00751 class007512 = class047822.method_30349().L(class04227.Nh);
        if (class005003.N(class00869.sn)) {
            this.N(class007512, class03161.B, class047822, class080882, class060692, class072093);
        } else if (class005003.N(class00869.sE)) {
            this.N(class007512, class03161.z, class047822, class080882, class060692, class072093);
            this.N(class007512, class03161.E, class047822, class080882, class060692, class072093);
            if (class060692.y(8) == 0) {
                this.N(class007512, class03161.m, class047822, class080882, class060692, class072093);
            }
        }
    }

    public class00901 ay_() {
        return class00901.field_47834;
    }
}

