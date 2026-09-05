/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00500
 *  minecraft.class01467
 *  minecraft.class01476
 *  minecraft.class02142
 *  minecraft.class03194
 *  minecraft.class04887
 *  minecraft.class05291
 *  minecraft.class05312
 *  minecraft.class06069
 *  minecraft.class06338
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07221
 */
package minecraft;

import com.google.common.collect.Lists;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import minecraft.class00500;
import minecraft.class01467;
import minecraft.class01476;
import minecraft.class02142;
import minecraft.class03194;
import minecraft.class04887;
import minecraft.class05291;
import minecraft.class05312;
import minecraft.class06069;
import minecraft.class06338;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07221;

public class class02773
extends class05291 {
    public static final MapCodec<class02773> N = RecordCodecBuilder.mapCodec(instance -> class02773.N(instance).and(instance.group((App)class06338.b.optionalFieldOf("min_height_for_leaves", (Object)1).forGetter(class027732 -> class027732.M), (App)class02142.N((int)1, (int)64).fieldOf("bend_length").forGetter(class027732 -> class027732.B))).apply(instance, class02773::new));
    private final int M;
    private final class02142 B;

    public class02773(int n, int n2, int n3, int n4, class02142 class021422) {
        super(n, n2, n3);
        this.M = n4;
        this.B = class021422;
    }

    public List<class01467> N(class04887 class048872, BiConsumer<class07209, class00500> biConsumer, class06069 class060692, int n, class07209 class072092, class01476 class014762) {
        int n2;
        class07211 class072112 = class07221.field_11062.N(class060692);
        int n3 = n - 1;
        class07218 class072182 = class072092.method_25503();
        class07209 class072093 = class072182.method_10074();
        class02773.N((class04887)class048872, biConsumer, (class06069)class060692, (class07209)class072093, (class01476)class014762);
        ArrayList arrayList = Lists.newArrayList();
        for (n2 = 0; n2 <= n3; ++n2) {
            if (n2 + 1 >= n3 + class060692.y(2)) {
                class072182.N(class072112);
            }
            if (class03194.L((class04887)class048872, (class07209)class072182)) {
                this.y(class048872, biConsumer, class060692, (class07209)class072182, class014762);
            }
            if (n2 >= this.M) {
                arrayList.add(new class01467(class072182.method_10062(), 0, false));
            }
            class072182.N(class07211.field_11036);
        }
        n2 = this.B.N(class060692);
        for (int i = 0; i <= n2; ++i) {
            if (class03194.L((class04887)class048872, (class07209)class072182)) {
                this.y(class048872, biConsumer, class060692, (class07209)class072182, class014762);
            }
            arrayList.add(new class01467(class072182.method_10062(), 0, false));
            class072182.N(class072112);
        }
        return arrayList;
    }

    protected class05312<?> N() {
        return class05312.M;
    }
}

