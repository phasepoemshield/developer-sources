/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class01467
 *  minecraft.class01476
 *  minecraft.class02135
 *  minecraft.class02142
 *  minecraft.class04887
 *  minecraft.class05291
 *  minecraft.class05312
 *  minecraft.class06069
 *  minecraft.class07004
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07221
 *  minecraft.class08092
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class01467;
import minecraft.class01476;
import minecraft.class02135;
import minecraft.class02142;
import minecraft.class04887;
import minecraft.class05291;
import minecraft.class05312;
import minecraft.class06069;
import minecraft.class07004;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07221;
import minecraft.class08092;

public class class01939
extends class05291 {
    private static final Codec<class02135> M = class02135.N.codec().validate(class021352 -> {
        if (class021352.L() - class021352.y() < 1) {
            return DataResult.error(() -> "Need at least 2 blocks variation for the branch starts to fit both branches");
        }
        return DataResult.success((Object)class021352);
    });
    public static final MapCodec<class01939> N = RecordCodecBuilder.mapCodec(instance -> class01939.N(instance).and(instance.group((App)class02142.N((int)1, (int)3).fieldOf("branch_count").forGetter(class019392 -> class019392.B), (App)class02142.N((int)2, (int)16).fieldOf("branch_horizontal_length").forGetter(class019392 -> class019392.Z), (App)class02142.N((int)-16, (int)0, M).fieldOf("branch_start_offset_from_top").forGetter(class019392 -> class019392.z), (App)class02142.N((int)-16, (int)16).fieldOf("branch_end_offset_from_top").forGetter(class019392 -> class019392.E))).apply(instance, class01939::new));
    private final class02142 B;
    private final class02142 Z;
    private final class02135 z;
    private final class02135 U;
    private final class02142 E;

    public class01939(int n, int n2, int n3, class02142 class021422, class02142 class021423, class02135 class021352, class02142 class021424) {
        super(n, n2, n3);
        this.B = class021422;
        this.Z = class021423;
        this.z = class021352;
        this.U = class02135.y((int)class021352.y(), (int)(class021352.L() - 1));
        this.E = class021424;
    }

    private class01467 N(class04887 class048872, BiConsumer<class07209, class00500> biConsumer, class06069 class060692, int n, class07209 class072092, class01476 class014762, Function<class00500, class00500> function, class07211 class072112, int n2, boolean bl, class07218 class072182) {
        int n3;
        class07211 class072113;
        class072182.N((class00753)class072092).N(class07211.field_11036, n2);
        int n4 = n - 1 + this.E.N(class060692);
        boolean bl2 = bl || n4 < n2;
        int n5 = this.Z.N(class060692) + (bl2 ? 1 : 0);
        class07209 class072093 = class072092.method_10079(class072112, n5).method_10086(n4);
        int n6 = bl2 ? 2 : 1;
        for (int i = 0; i < n6; ++i) {
            this.N(class048872, biConsumer, class060692, (class07209)class072182.N(class072112), class014762, function);
        }
        class07211 class072114 = class072113 = class072093.method_10264() > class072182.method_10264() ? class07211.field_11036 : class07211.field_11033;
        while ((n3 = class072182.method_19455((class00753)class072093)) != 0) {
            float f = (float)Math.abs(class072093.method_10264() - class072182.method_10264()) / (float)n3;
            boolean bl3 = class060692.z() < f;
            class072182.N(bl3 ? class072113 : class072112);
            this.N(class048872, biConsumer, class060692, (class07209)class072182, class014762, bl3 ? Function.identity() : function);
        }
        return new class01467(class072093.method_10084(), 0, false);
    }

    public List<class01467> N(class04887 class048872, BiConsumer<class07209, class00500> biConsumer, class06069 class060692, int n, class07209 class072092, class01476 class014762) {
        boolean bl;
        int n2;
        class01939.N((class04887)class048872, biConsumer, (class06069)class060692, (class07209)class072092.method_10074(), (class01476)class014762);
        int n3 = Math.max(0, n - 1 + this.z.N(class060692));
        int n4 = Math.max(0, n - 1 + this.U.N(class060692));
        if (n4 >= n3) {
            ++n4;
        }
        boolean bl2 = (n2 = this.B.N(class060692)) == 3;
        boolean bl3 = bl = n2 >= 2;
        int n5 = bl2 ? n : (bl ? Math.max(n3, n4) + 1 : n3 + 1);
        for (int i = 0; i < n5; ++i) {
            this.y(class048872, biConsumer, class060692, class072092.method_10086(i), class014762);
        }
        ArrayList<class01467> arrayList = new ArrayList<class01467>();
        if (bl2) {
            arrayList.add(new class01467(class072092.method_10086(n5), 0, false));
        }
        class07218 class072182 = new class07218();
        class07211 class072112 = class07221.field_11062.N(class060692);
        Function<class00500, class00500> function = class005002 -> (class00500)class005002.L((class08092)class07004.L, (Comparable)class072112.z());
        arrayList.add(this.N(class048872, biConsumer, class060692, n, class072092, class014762, function, class072112, n3, n3 < n5 - 1, class072182));
        if (bl) {
            arrayList.add(this.N(class048872, biConsumer, class060692, n, class072092, class014762, function, class072112.b(), n4, n4 < n5 - 1, class072182));
        }
        return arrayList;
    }

    protected class05312<?> N() {
        return class05312.Z;
    }
}

