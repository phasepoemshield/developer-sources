/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Ordering
 *  minecraft.class00392
 *  minecraft.class01028
 *  minecraft.class01054
 *  minecraft.class01056
 *  minecraft.class01463
 *  minecraft.class01590
 *  minecraft.class01894
 *  minecraft.class02071
 *  minecraft.class03448
 *  minecraft.class03556
 *  minecraft.class04453
 *  minecraft.class05216
 *  minecraft.class05220
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class07055
 *  minecraft.class07063
 *  minecraft.class07084
 *  minecraft.class08394
 */
package minecraft;

import com.google.common.collect.Ordering;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import minecraft.class00392;
import minecraft.class01028;
import minecraft.class01054;
import minecraft.class01056;
import minecraft.class01463;
import minecraft.class01590;
import minecraft.class01894;
import minecraft.class02071;
import minecraft.class03448;
import minecraft.class03556;
import minecraft.class04453;
import minecraft.class05216;
import minecraft.class05220;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class07055;
import minecraft.class07063;
import minecraft.class07084;
import minecraft.class08394;

public class class04973 {
    private static final class01894 L = class01894.y((String)"container/inventory/effect_background");
    private static final class01894 u = class01894.y((String)"container/inventory/effect_background_ambient");
    private static final int i = 18;
    public static final int N = 7;
    private static final int R = 32;
    public static final int y = 32;
    private final class01463<?> M;
    private final class06202 B;

    public class04973(class01463<?> class014632) {
        this.M = class014632;
        this.B = class06202.Nq();
    }

    private int N(class01054 class010542, class01590 class015902, class00392 class003922, class00392 class003923, int n, int n2, boolean bl, int n3) {
        int n4 = 32 + class015902.N((class05936)class003922) + 7;
        int n5 = 32 + class015902.N((class05936)class003923) + 7;
        int n6 = Math.min(n3, Math.max(n4, n5));
        class010542.N(class08394.Na, bl ? u : L, n, n2, n6, 32);
        return n6;
    }

    private class00392 N(class07055 class070552) {
        class05216 class052162 = ((class07084)class070552.L().N()).M().L();
        if (class070552.i() >= 1 && class070552.i() <= 9) {
            class052162.y(class05220.l).y((class00392)class00392.L((String)("enchantment.level." + (class070552.i() + 1))));
        }
        return class052162;
    }

    private void N(class01054 class010542, class00392 class003922, class00392 class003923, class01590 class015902, int n, int n2, int n3, int n4, int n5, int n6) {
        boolean bl;
        int n7 = n + 32;
        int n8 = n2 + 7;
        int n9 = n3 - 32 - 7;
        if (n9 > 0) {
            boolean bl2 = class015902.N((class05936)class003922) > n9;
            class01028 class010282 = bl2 ? class02071.N((class00392)class003922, (class01590)class015902, (int)n9) : class003922.method_30937();
            class010542.y(class015902, class010282, n7, n8, -1);
            Objects.requireNonNull(class015902);
            class010542.y(class015902, class003923, n7, n8 + 9, -8355712);
            bl = bl2;
        } else {
            bl = true;
        }
        if (bl && n5 >= n && n5 <= n + n3 && n6 >= n2 && n6 <= n2 + n4) {
            class010542.N(this.M.method_64506(), List.of(class003922, class003923), Optional.empty(), n5, n6);
        }
    }

    public boolean N() {
        int n = this.M.T + this.M.B + 2;
        return this.M.field_22789 - n >= 32;
    }

    private void N(class01054 class010542, Collection<class07055> collection, int n, int n2, int n3, int n4, int n5) {
        List list = Ordering.natural().sortedCopy(collection);
        int n6 = this.M.b;
        class01590 class015902 = this.M.method_64506();
        for (class07055 class070552 : list) {
            boolean bl = class070552.R();
            class00392 class003922 = this.N(class070552);
            class00392 class003923 = class07063.N((class07055)class070552, (float)1.0f, (float)((class03448)this.B.T_3).method_54719().R());
            int n7 = this.N(class010542, class015902, class003922, class003923, n, n6, bl, n5);
            this.N(class010542, class003922, class003923, class015902, n, n6, n7, n2, n3, n4);
            class010542.N(class08394.Na, class01056.N((class03556)class070552.L()), n + 7, n6 + 7, 18, 18);
            n6 += n2;
        }
    }

    public void N(class01054 class010542, int n, int n2) {
        int n3 = this.M.T + this.M.B + 2;
        int n4 = this.M.field_22789 - n3;
        Collection var6 = ((class04453)this.B.T_4).method_6026();
        if (var6.isEmpty() || n4 < 32) {
            return;
        }
        int n5 = n4 >= 120 ? n4 - 7 : 32;
        int n6 = 33;
        if (var6.size() > 5) {
            n6 = 132 / (var6.size() - 1);
        }
        this.N(class010542, var6, n3, n6, n, n2, n5);
    }
}

