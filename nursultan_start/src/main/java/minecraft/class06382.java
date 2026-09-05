/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  minecraft.class00404
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class03300
 *  minecraft.class04347
 *  minecraft.class04367
 *  minecraft.class04758
 *  minecraft.class04890
 *  minecraft.class05163
 *  minecraft.class05171
 *  minecraft.class05324
 *  minecraft.class05905
 *  minecraft.class05974
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07321
 *  minecraft.class07536
 *  minecraft.class08088
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Collection;
import java.util.List;
import minecraft.class00404;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class03300;
import minecraft.class04347;
import minecraft.class04367;
import minecraft.class04758;
import minecraft.class04890;
import minecraft.class05163;
import minecraft.class05171;
import minecraft.class05324;
import minecraft.class05905;
import minecraft.class05974;
import minecraft.class06069;
import minecraft.class06273;
import minecraft.class07209;
import minecraft.class07321;
import minecraft.class07536;
import minecraft.class08088;

public class class06382
extends class04347 {
    public static final MapCodec<class06382> N = class06382.N(class06382::new);

    public class06382(class04758 class047582) {
        super(class05171::new, 21, 21, class047582);
    }

    public class04367<?> N() {
        return class04367.y;
    }

    public void N(class05974 class059742, class05324 class053242, class08088 class080882, class06069 class060692, class05163 class051632, class07321 class073212, class03300 class033002) {
        class04890 class0489022;
        class05905 class059052 = class05905.N(class00753::compareTo);
        for (class04890 class0489022 : class033002.L()) {
            if (!(class0489022 instanceof class05171)) continue;
            class05171 class051712 = (class05171)class0489022;
            class059052.addAll(class051712.N());
            class06382.N(class051632, class059742, class051712.y());
        }
        ObjectArrayList objectArrayList = new ObjectArrayList((Collection)class059052.stream().toList());
        class0489022 = class06069.y((long)class059742.method_8412()).L().N(class033002.y().M());
        class07536.L((List)objectArrayList, (class06069)class0489022);
        int n = Math.min(class059052.size(), class0489022.y(5, 8));
        for (class07209 class072092 : objectArrayList) {
            if (n > 0) {
                --n;
                class06382.N(class051632, class059742, class072092);
                continue;
            }
            if (!class051632.y((class00753)class072092)) continue;
            class059742.method_8652(class072092, class00869.e.W(), 2);
        }
    }

    private static void N(class05163 class051632, class05974 class059742, class07209 class072092) {
        if (class051632.y((class00753)class072092)) {
            class059742.method_8652(class072092, class00869.H.W(), 2);
            class059742.N(class072092, class00404.field_42780).ifPresent(class019652 -> class019652.N(class06273.yU, class072092.method_10063()));
        }
    }
}

