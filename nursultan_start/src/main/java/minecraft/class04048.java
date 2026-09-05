/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class05487
 *  minecraft.class05974
 *  minecraft.class07209
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class04025;
import minecraft.class04054;
import minecraft.class05487;
import minecraft.class05974;
import minecraft.class07209;

public class class04048
implements class04025 {
    public static final MapCodec<class04048> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class00753.method_39677((int)16).optionalFieldOf("offset", (Object)class00753.field_11176).forGetter(class040482 -> class040482.i), (App)class00500.N.fieldOf("state").forGetter(class040482 -> class040482.R)).apply(instance, class04048::new));
    private final class00753 i;
    private final class00500 R;

    protected class04048(class00753 class007532, class00500 class005002) {
        this.i = class007532;
        this.R = class005002;
    }

    @Override
    public boolean test(class05974 class059742, class07209 class072092) {
        return this.R.N((class05487)class059742, class072092.method_10081(this.i));
    }

    @Override
    public class04054<?> N() {
        return class04054.M;
    }
}

