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
 *  minecraft.class03530
 *  minecraft.class04028
 *  minecraft.class04054
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
import minecraft.class03530;
import minecraft.class04028;
import minecraft.class04054;
import minecraft.class04227;
import minecraft.class05946;

public class class03191
extends class04028 {
    final class03530<class00891> N;
    public static final MapCodec<class03191> R = RecordCodecBuilder.mapCodec(instance -> class03191.N(instance).and((App)class03530.N((class05946)class04227.Z).fieldOf("tag").forGetter(class031912 -> class031912.N)).apply(instance, class03191::new));

    protected class03191(class00753 class007532, class03530<class00891> class035302) {
        super(class007532);
        this.N = class035302;
    }

    public class04054<?> N() {
        return class04054.y;
    }

    protected boolean N(class00500 class005002) {
        return class005002.N(this.N);
    }
}

