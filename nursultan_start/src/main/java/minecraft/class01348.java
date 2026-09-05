/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class04782
 *  minecraft.class05378
 *  minecraft.class05735
 *  minecraft.class05836
 *  minecraft.class06289
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07075
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class08041
 *  minecraft.class08092
 *  net.fabricmc.fabric.mixin.content.registry.WorkAtComposterAccessor
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class04782;
import minecraft.class05378;
import minecraft.class05735;
import minecraft.class05836;
import minecraft.class06289;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07075;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class08041;
import minecraft.class08092;
import net.fabricmc.fabric.mixin.content.registry.WorkAtComposterAccessor;

public class class01348
extends class05735
implements WorkAtComposterAccessor {
    private static List<class06581> N = ImmutableList.of((Object)class06570.by, (Object)class06570.lk);

    private void L(class04782 class047822, class08041 class080412) {
        class07075 class070752 = class080412.n();
        if (class070752.N_61(class06570.bu) > 36) {
            return;
        }
        int n = class070752.N_61(class06570.bL);
        int n2 = 3;
        int n3 = 3;
        int n4 = Math.min(3, n / 3);
        if (n4 == 0) {
            return;
        }
        int n5 = n4 * 3;
        class070752.N(class06570.bL, n5);
        class06584 class065842 = class070752.N(new class06584((class07310)class06570.bu, n4));
        if (!class065842.R()) {
            class080412.method_5699(class047822, class065842, 0.5f);
        }
    }

    protected void y(class04782 class047822, class08041 class080412) {
        Optional var3 = class080412.method_18868().L(class05378.L);
        if (var3.isEmpty()) {
            return;
        }
        class06289 class062892 = (class06289)var3.get();
        class00500 class005002 = class047822.method_8320(class062892.y());
        if (class005002.N(class00869.TL)) {
            this.L(class047822, class080412);
            this.N(class047822, class080412, class062892, class005002);
        }
    }

    public static /* synthetic */ List N() {
        return N;
    }

    public static /* synthetic */ void N(List list) {
        N = list;
    }

    private void N(class04782 class047822, class08041 class080412, class06289 class062892, class00500 class005002) {
        class07209 class072092 = class062892.y();
        if ((Integer)class005002.L((class08092)class05836.i) == 8) {
            class005002 = class05836.N((class07049)class080412, (class00500)class005002, (class07299)class047822, (class07209)class072092);
        }
        int n = 20;
        int n2 = 10;
        int[] nArray = new int[N.size()];
        class07075 class070752 = class080412.n();
        int n3 = class070752.method_5439();
        class00500 class005003 = class005002;
        for (int i = n3 - 1; i >= 0 && n > 0; --i) {
            int n4;
            class06584 class065842 = class070752.method_5438(i);
            int n5 = N.indexOf(class065842.B());
            if (n5 == -1) continue;
            int n6 = class065842.c();
            nArray[n5] = n4 = nArray[n5] + n6;
            int n7 = Math.min(Math.min(n4 - 10, n), n6);
            if (n7 <= 0) continue;
            n -= n7;
            for (int j = 0; j < n7; ++j) {
                if ((Integer)(class005003 = class05836.N((class07049)class080412, (class00500)class005003, (class04782)class047822, (class06584)class065842, (class07209)class072092)).L((class08092)class05836.i) != 7) continue;
                this.N(class047822, class005002, class072092, class005003);
                return;
            }
        }
        this.N(class047822, class005002, class072092, class005003);
    }

    private void N(class04782 class047822, class00500 class005002, class07209 class072092, class00500 class005003) {
        class047822.N(1500, class072092, class005003 != class005002 ? 1 : 0);
    }
}

