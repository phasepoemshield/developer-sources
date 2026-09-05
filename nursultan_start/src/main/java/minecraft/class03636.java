/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class01471
 *  minecraft.class01476
 *  minecraft.class02142
 *  minecraft.class03619
 *  minecraft.class04887
 *  minecraft.class06069
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
import java.util.Optional;
import java.util.function.BiConsumer;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class01471;
import minecraft.class01476;
import minecraft.class02142;
import minecraft.class03619;
import minecraft.class03628;
import minecraft.class03647;
import minecraft.class03653;
import minecraft.class04887;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07221;

public class class03636
extends class03647 {
    public static final int N = 8;
    public static final int y = 15;
    public static final MapCodec<class03636> L = RecordCodecBuilder.mapCodec(instance -> class03636.N(instance).and((App)class03653.N.fieldOf("mangrove_root_placement").forGetter(class036362 -> class036362.B)).apply(instance, class03636::new));
    private final class03653 B;

    public class03636(class02142 class021422, class01471 class014712, Optional<class03628> optional, class03653 class036532) {
        super(class021422, class014712, optional);
        this.B = class036532;
    }

    @Override
    protected class03619<?> N() {
        return class03619.N;
    }

    private boolean N(class04887 class048872, class06069 class060692, class07209 class072092, class07211 class072112, class07209 class072093, List<class07209> list, int n) {
        int n2 = this.B.i();
        if (n == n2 || list.size() > n2) {
            return false;
        }
        for (class07209 class072094 : this.N(class072092, class072112, class060692, class072093)) {
            if (!this.N(class048872, class072094)) continue;
            list.add(class072094);
            if (this.N(class048872, class060692, class072094, class072112, class072093, list, n + 1)) continue;
            return false;
        }
        return true;
    }

    protected List<class07209> N(class07209 class072092, class07211 class072112, class06069 class060692, class07209 class072093) {
        class07209 class072094 = class072092.method_10074();
        class07209 class072095 = class072092.method_10093(class072112);
        int n = class072092.method_19455((class00753)class072093);
        int n2 = this.B.u();
        float f = this.B.R();
        if (n > n2 - 3 && n <= n2) {
            return class060692.z() < f ? List.of(class072094, class072095.method_10074()) : List.of(class072094);
        }
        if (n > n2) {
            return List.of(class072094);
        }
        if (class060692.z() < f) {
            return List.of(class072094);
        }
        return class060692.Z() ? List.of(class072095) : List.of(class072094);
    }

    @Override
    protected boolean N(class04887 class048872, class07209 class072092) {
        return super.N(class048872, class072092) || class048872.method_16358(class072092, class005002 -> class005002.N(this.B.N()));
    }

    @Override
    protected void N(class04887 class048872, BiConsumer<class07209, class00500> biConsumer, class06069 class060692, class07209 class072092, class01476 class014762) {
        if (class048872.method_16358(class072092, class005002 -> class005002.N(this.B.y()))) {
            class00500 class005003 = this.B.L().N(class060692, class072092);
            biConsumer.accept(class072092, this.N(class048872, class072092, class005003));
        } else {
            super.N(class048872, biConsumer, class060692, class072092, class014762);
        }
    }

    @Override
    public boolean N(class04887 class048872, BiConsumer<class07209, class00500> biConsumer, class06069 class060692, class07209 class072092, class07209 class072093, class01476 class014762) {
        ArrayList arrayList = Lists.newArrayList();
        class07218 class072182 = class072092.method_25503();
        while (class072182.method_10264() < class072093.method_10264()) {
            if (!this.N(class048872, (class07209)class072182)) {
                return false;
            }
            class072182.N(class07211.field_11036);
        }
        arrayList.add(class072093.method_10074());
        for (class07211 class072112 : class07221.field_11062) {
            ArrayList arrayList2;
            class07209 class072094 = class072093.method_10093(class072112);
            if (!this.N(class048872, class060692, class072094, class072112, class072093, arrayList2 = Lists.newArrayList(), 0)) {
                return false;
            }
            arrayList.addAll(arrayList2);
            arrayList.add(class072093.method_10093(class072112));
        }
        for (class07211 class072112 : arrayList) {
            this.N(class048872, biConsumer, class060692, (class07209)class072112, class014762);
        }
        return true;
    }
}

