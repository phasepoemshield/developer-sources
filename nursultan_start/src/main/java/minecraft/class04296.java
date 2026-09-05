/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class01034
 *  minecraft.class04025
 *  minecraft.class05974
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;
import minecraft.class01034;
import minecraft.class04025;
import minecraft.class04297;
import minecraft.class04323;
import minecraft.class05974;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;

public class class04296
extends class04297 {
    private final class07211 L;
    private final class04025 u;
    private final class04025 i;
    private final int R;
    public static final MapCodec<class04296> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class07211.field_35088.fieldOf("direction_of_search").forGetter(class042962 -> class042962.L), (App)class04025.y.fieldOf("target_condition").forGetter(class042962 -> class042962.u), (App)class04025.y.optionalFieldOf("allowed_search_condition", (Object)class04025.i()).forGetter(class042962 -> class042962.i), (App)Codec.intRange((int)1, (int)32).fieldOf("max_steps").forGetter(class042962 -> class042962.R)).apply(instance, class04296::new));

    private class04296(class07211 class072112, class04025 class040252, class04025 class040253, int n) {
        this.L = class072112;
        this.u = class040252;
        this.i = class040253;
        this.R = n;
    }

    public static class04296 N(class07211 class072112, class04025 class040252, class04025 class040253, int n) {
        return new class04296(class072112, class040252, class040253, n);
    }

    @Override
    public Stream<class07209> N(class01034 class010342, class06069 class060692, class07209 class072092) {
        class07218 class072182 = class072092.method_25503();
        class05974 class059742 = class010342.y();
        if (!this.i.test((Object)class059742, (Object)class072182)) {
            return Stream.of(new class07209[0]);
        }
        for (int i = 0; i < this.R; ++i) {
            if (this.u.test((Object)class059742, (Object)class072182)) {
                return Stream.of(class072182);
            }
            class072182.N(this.L);
            if (class059742.method_31601(class072182.method_10264())) {
                return Stream.of(new class07209[0]);
            }
            if (!this.i.test((Object)class059742, (Object)class072182)) break;
        }
        if (this.u.test((Object)class059742, (Object)class072182)) {
            return Stream.of(class072182);
        }
        return Stream.of(new class07209[0]);
    }

    public static class04296 N(class07211 class072112, class04025 class040252, int n) {
        return class04296.N(class072112, class040252, class04025.i(), n);
    }

    @Override
    public class04323<?> N() {
        return class04323.z;
    }
}

