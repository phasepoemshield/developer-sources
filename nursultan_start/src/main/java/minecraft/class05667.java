/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  minecraft.class01226
 *  minecraft.class02680
 *  minecraft.class02816
 *  minecraft.class04782
 *  minecraft.class05663
 *  minecraft.class06069
 *  minecraft.class06559
 *  minecraft.class06563
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07310
 *  minecraft.class07324
 */
package minecraft;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import minecraft.class01226;
import minecraft.class02680;
import minecraft.class02816;
import minecraft.class04782;
import minecraft.class05663;
import minecraft.class06069;
import minecraft.class06559;
import minecraft.class06563;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07310;
import minecraft.class07324;

public class class05667
implements class05663 {
    private final class06581 N;
    private final int y;
    private final int L;
    private final int u;

    public class05667(class06581 class065812, int n) {
        this(class065812, n, 12, 1);
    }

    public class05667(class06581 class065812, int n, int n2, int n3) {
        this.N = class065812;
        this.y = n;
        this.L = n2;
        this.u = n3;
    }

    private static class06559 N(class06069 class060692) {
        return class06559.N((class06563)class06563.N((int)class060692.y(16)));
    }

    public class07324 N(class04782 class047822, class07049 class070492, class06069 class060692) {
        class02680 class026802 = new class02680((class07310)class06570.Ty, this.y);
        class06584 class065842 = new class06584((class07310)this.N);
        if (class065842.N(class01226.Lz)) {
            ArrayList arrayList = Lists.newArrayList();
            arrayList.add(class05667.N(class060692));
            if (class060692.z() > 0.7f) {
                arrayList.add(class05667.N(class060692));
            }
            if (class060692.z() > 0.8f) {
                arrayList.add(class05667.N(class060692));
            }
            class065842 = class02816.N((class06584)class065842, (List)arrayList);
        }
        return new class07324(class026802, class065842, this.L, this.u, 0.2f);
    }
}

