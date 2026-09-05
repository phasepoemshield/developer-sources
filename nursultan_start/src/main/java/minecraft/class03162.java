/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00753
 *  minecraft.class04025
 *  minecraft.class04054
 *  minecraft.class05974
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class00753;
import minecraft.class04025;
import minecraft.class04054;
import minecraft.class05974;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;

public class class03162
implements class04025 {
    private final class00753 i;
    private final class07211 R;
    public static final MapCodec<class03162> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class00753.method_39677((int)16).optionalFieldOf("offset", (Object)class00753.field_11176).forGetter(class031622 -> class031622.i), (App)class07211.field_29502.fieldOf("direction").forGetter(class031622 -> class031622.R)).apply(instance, class03162::new));

    public class03162(class00753 class007532, class07211 class072112) {
        this.i = class007532;
        this.R = class072112;
    }

    public boolean test(class05974 class059742, class07209 class072092) {
        class07209 class072093 = class072092.method_10081(this.i);
        return class059742.method_8320(class072093).L((class07290)class059742, class072093, this.R);
    }

    public class04054<?> N() {
        return class04054.u;
    }
}

