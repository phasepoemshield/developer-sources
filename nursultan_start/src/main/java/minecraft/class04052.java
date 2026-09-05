/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class00891
 *  minecraft.class03541
 *  minecraft.class03543
 *  minecraft.class04227
 *  minecraft.class05946
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class00891;
import minecraft.class03541;
import minecraft.class03543;
import minecraft.class04028;
import minecraft.class04054;
import minecraft.class04227;
import minecraft.class05946;

class class04052
extends class04028 {
    private final class03543<class00891> R;
    public static final MapCodec<class04052> N = RecordCodecBuilder.mapCodec(instance -> class04052.N(instance).and((App)class03541.N((class05946)class04227.Z).fieldOf("blocks").forGetter(class040522 -> class040522.R)).apply(instance, class04052::new));

    public class04052(class00753 class007532, class03543<class00891> class035432) {
        super(class007532);
        this.R = class035432;
    }

    @Override
    public class04054<?> N() {
        return class04054.N;
    }

    @Override
    protected boolean N(class00500 class005002) {
        return class005002.N(this.R);
    }
}

