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

public class class04304
implements class04025 {
    public static final MapCodec<class04304> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class00753.method_39677((int)16).optionalFieldOf("offset", (Object)class07209.field_10980).forGetter(class043042 -> class043042.i)).apply(instance, class04304::new));
    private final class00753 i;

    public class04304(class00753 class007532) {
        this.i = class007532;
    }

    public class04054<?> N() {
        return class04054.B;
    }

    public boolean test(class05974 class059742, class07209 class072092) {
        return !class059742.method_31606(class072092.method_10081(this.i));
    }
}

