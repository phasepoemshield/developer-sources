/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class05974
 *  minecraft.class07209
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class04025;
import minecraft.class04054;
import minecraft.class05974;
import minecraft.class07209;

class class04029
implements class04025 {
    public static final MapCodec<class04029> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class04025.y.fieldOf("predicate").forGetter(class040292 -> class040292.i)).apply(instance, class04029::new));
    private final class04025 i;

    public class04029(class04025 class040252) {
        this.i = class040252;
    }

    @Override
    public class04054<?> N() {
        return class04054.U;
    }

    @Override
    public boolean test(class05974 class059742, class07209 class072092) {
        return !this.i.test(class059742, class072092);
    }
}

