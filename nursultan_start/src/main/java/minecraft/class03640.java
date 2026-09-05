/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class01467
 *  minecraft.class01476
 *  minecraft.class02142
 *  minecraft.class03541
 *  minecraft.class03543
 *  minecraft.class04227
 *  minecraft.class04887
 *  minecraft.class05291
 *  minecraft.class05312
 *  minecraft.class05946
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07221
 */
package minecraft;

import com.google.common.collect.Lists;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class01467;
import minecraft.class01476;
import minecraft.class02142;
import minecraft.class03541;
import minecraft.class03543;
import minecraft.class04227;
import minecraft.class04887;
import minecraft.class05291;
import minecraft.class05312;
import minecraft.class05946;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07221;

public class class03640
extends class05291 {
    public static final MapCodec<class03640> N = RecordCodecBuilder.mapCodec(instance -> class03640.N(instance).and(instance.group((App)class02142.i.fieldOf("extra_branch_steps").forGetter(class036402 -> class036402.M), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("place_branch_per_log_probability").forGetter(class036402 -> Float.valueOf(class036402.B)), (App)class02142.u.fieldOf("extra_branch_length").forGetter(class036402 -> class036402.Z), (App)class03541.N((class05946)class04227.Z).fieldOf("can_grow_through").forGetter(class036402 -> class036402.z))).apply(instance, class03640::new));
    private final class02142 M;
    private final float B;
    private final class02142 Z;
    private final class03543<class00891> z;

    public class03640(int n, int n2, int n3, class02142 class021422, float f, class02142 class021423, class03543<class00891> class035432) {
        super(n, n2, n3);
        this.M = class021422;
        this.B = f;
        this.Z = class021423;
        this.z = class035432;
    }

    protected class05312<?> N() {
        return class05312.B;
    }

    private void N(class04887 class048872, BiConsumer<class07209, class00500> biConsumer, class06069 class060692, int n, class01476 class014762, List<class01467> list, class07218 class072182, int n2, class07211 class072112, int n3, int n4) {
        int n5 = n2 + n3;
        int n6 = class072182.method_10263();
        int n7 = class072182.method_10260();
        for (int i = n3; i < n && n4 > 0; ++i, --n4) {
            if (i < 1) continue;
            int n8 = n2 + i;
            n5 = n8;
            if (this.y(class048872, biConsumer, class060692, (class07209)class072182.N(n6 += class072112.P(), n8, n7 += class072112.T()), class014762)) {
                ++n5;
            }
            list.add(new class01467(class072182.method_10062(), 0, false));
        }
        if (n5 - n2 > 1) {
            class07209 class072092 = new class07209(n6, n5, n7);
            list.add(new class01467(class072092, 0, false));
            list.add(new class01467(class072092.method_10087(2), 0, false));
        }
    }

    protected boolean N(class04887 class048872, class07209 class072092) {
        return super.N(class048872, class072092) || class048872.method_16358(class072092, class005002 -> class005002.N(this.z));
    }

    public List<class01467> N(class04887 class048872, BiConsumer<class07209, class00500> biConsumer, class06069 class060692, int n, class07209 class072092, class01476 class014762) {
        ArrayList arrayList = Lists.newArrayList();
        class07218 class072182 = new class07218();
        for (int i = 0; i < n; ++i) {
            int n2 = class072092.method_10264() + i;
            if (this.y(class048872, biConsumer, class060692, (class07209)class072182.N(class072092.method_10263(), n2, class072092.method_10260()), class014762) && i < n - 1 && class060692.z() < this.B) {
                class07211 class072112 = class07221.field_11062.N(class060692);
                int n3 = this.Z.N(class060692);
                int n4 = Math.max(0, n3 - this.Z.N(class060692) - 1);
                int n5 = this.M.N(class060692);
                this.N(class048872, biConsumer, class060692, n, class014762, arrayList, class072182, n2, class072112, n4, n5);
            }
            if (i != n - 1) continue;
            arrayList.add(new class01467((class07209)class072182.N(class072092.method_10263(), n2 + 1, class072092.method_10260()), 0, false));
        }
        return arrayList;
    }
}

