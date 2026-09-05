/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class00780
 *  minecraft.class00869
 *  minecraft.class00873
 *  minecraft.class00891
 *  minecraft.class00901
 *  minecraft.class01362
 *  minecraft.class01478
 *  minecraft.class03189
 *  minecraft.class03238
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class04336
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class05974
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07732
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import minecraft.class00500;
import minecraft.class00780;
import minecraft.class00869;
import minecraft.class00873;
import minecraft.class00891;
import minecraft.class00901;
import minecraft.class01362;
import minecraft.class01478;
import minecraft.class03189;
import minecraft.class03238;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class04336;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class05974;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07732;

public class class00725
extends class07732
implements class00873 {
    public static final MapCodec<class00725> N = class00725.y(class00725::new);

    public class00725(class01362 class013622) {
        super(class013622);
    }

    public void N(class04782 class047822, class06069 class060692, class07209 class072092, class00500 class005002) {
        class07209 class072093 = class072092.method_10084();
        class00500 class005003 = class00869.yk.W();
        Optional optional = class047822.method_30349().L(class04227.ys).N(class03189.P);
        block0: for (int i = 0; i < 128; ++i) {
            class00873 class008732;
            class07209 class072094 = class072093;
            for (int j = 0; j < i / 16; ++j) {
                if (!class047822.method_8320((class072094 = class072094.method_10069(class060692.y(3) - 1, (class060692.y(3) - 1) * class060692.y(3) / 2, class060692.y(3) - 1)).method_10074()).N((class00891)this) || class047822.method_8320(class072094).W((class07290)class047822, class072094)) continue block0;
            }
            class00500 class005004 = class047822.method_8320(class072094);
            if (class005004.N(class005003.i()) && class060692.y(10) == 0 && (class008732 = (class00873)class005003.i()).N((class05487)class047822, class072094, class005004)) {
                class008732.N(class047822, class060692, class072094, class005004);
            }
            if (!class005004.P()) continue;
            if (class060692.y(8) == 0) {
                List var12 = ((class00780)class047822.i(class072094).N()).L().y();
                if (var12.isEmpty()) continue;
                int n = class060692.y(var12.size());
                class03556 var11 = ((class01478)((class03238)var12.get(n)).L()).i();
            } else {
                if (!optional.isPresent()) continue;
                class008732 = (class03556)optional.get();
            }
            ((class04336)class008732.N()).N((class05974)class047822, class047822.method_14178().U(), class060692, class072094);
        }
    }

    public MapCodec<class00725> N() {
        return N;
    }

    public boolean N(class07299 class072992, class06069 class060692, class07209 class072092, class00500 class005002) {
        return true;
    }

    public boolean N(class05487 class054872, class07209 class072092, class00500 class005002) {
        return class054872.method_8320(class072092.method_10084()).P();
    }

    public class00901 ay_() {
        return class00901.field_47834;
    }
}

