/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class04206
 *  minecraft.class06942
 *  minecraft.class06993
 *  minecraft.class07004
 *  minecraft.class07137
 *  minecraft.class07185
 *  minecraft.class08092
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class04206;
import minecraft.class06942;
import minecraft.class06993;
import minecraft.class07004;
import minecraft.class07137;
import minecraft.class07185;
import minecraft.class08092;

public class class03431
extends class07137 {
    public static final MapCodec<class03431> y = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class04206.i.T().fieldOf("host").forGetter(class07137::y), (App)class03431.t()).apply(instance, class03431::new));

    public class03431(class00891 class008912, class01362 class013622) {
        super(class008912, class013622);
        this.P((class00500)this.W().y((class08092)class07004.L, (Comparable)class07185.field_11052));
    }

    public class00500 N(class06942 class069422) {
        return (class00500)this.W().y((class08092)class07004.L, (Comparable)class069422.method_8038().z());
    }

    public MapCodec<class03431> N() {
        return y;
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{class07004.L});
    }

    protected class00500 N(class00500 class005002, class06993 class069932) {
        return class07004.y((class00500)class005002, (class06993)class069932);
    }
}

