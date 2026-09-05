/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  minecraft.class00404
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class01474
 *  minecraft.class04593
 *  minecraft.class05534
 *  minecraft.class05894
 *  minecraft.class05930
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07221
 *  minecraft.class07536
 *  minecraft.class08092
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class01474;
import minecraft.class04593;
import minecraft.class05534;
import minecraft.class05894;
import minecraft.class05930;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07221;
import minecraft.class07536;
import minecraft.class08092;

public class class01459
extends class01474 {
    public static final MapCodec<class01459> N = Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("probability").xmap(class01459::new, class014592 -> Float.valueOf(class014592.i));
    private static final class07211 L = class07211.field_11035;
    private static final class07211[] u = (class07211[])class07221.field_11062.N().filter(class072112 -> class072112 != L.b()).toArray(class07211[]::new);
    private final float i;

    public class01459(float f) {
        this.i = f;
    }

    public void N(class05894 class058942) {
        ObjectArrayList var2 = class058942.u();
        ObjectArrayList var3 = class058942.L();
        if (var3.isEmpty()) {
            return;
        }
        class06069 class060692 = class058942.y();
        if (class060692.z() >= this.i) {
            return;
        }
        int n = !var2.isEmpty() ? Math.max(((class07209)var2.getFirst()).method_10264() - 1, ((class07209)var3.getFirst()).method_10264() + 1) : Math.min(((class07209)var3.getFirst()).method_10264() + 1 + class060692.y(3), ((class07209)var3.getLast()).method_10264());
        List list = var3.stream().filter(class072092 -> class072092.method_10264() == n).flatMap(class072092 -> Stream.of(u).map(arg_0 -> ((class07209)class072092).method_10093(arg_0))).collect(Collectors.toList());
        if (list.isEmpty()) {
            return;
        }
        class07536.L(list, (class06069)class060692);
        Optional<class07209> optional = list.stream().filter(class072092 -> class058942.N(class072092) && class058942.N(class072092.method_10093(L))).findFirst();
        if (optional.isEmpty()) {
            return;
        }
        class058942.N(optional.get(), (class00500)class00869.Ti.W().y((class08092)class04593.y, (Comparable)L));
        class058942.N().N(optional.get(), class00404.field_20431).ifPresent(class046202 -> {
            int n = 2 + class060692.y(2);
            for (int i = 0; i < n; ++i) {
                class046202.N(class05534.N((int)class060692.y(599)));
            }
        });
    }

    protected class05930<?> N() {
        return class05930.R;
    }
}

