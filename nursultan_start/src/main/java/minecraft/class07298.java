/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class03774
 *  minecraft.class04247
 *  minecraft.class06184
 *  minecraft.class06510
 *  minecraft.class06514
 *  minecraft.class06584
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class03774;
import minecraft.class04247;
import minecraft.class06184;
import minecraft.class06510;
import minecraft.class06514;
import minecraft.class06584;
import minecraft.class07293;
import minecraft.class07313;

public class class07298<T extends class07313>
implements class06514<T> {
    private final MapCodec<T> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.STRING.optionalFieldOf("group", (Object)"").forGetter(class06184::y), (App)class03774.field_40245.fieldOf("category").orElse((Object)class03774.field_40244).forGetter(class07313::B), (App)class06510.field_46095.fieldOf("ingredient").forGetter(class06184::z), (App)class06584.i.fieldOf("result").forGetter(class06184::U), (App)Codec.FLOAT.fieldOf("experience").orElse((Object)Float.valueOf(0.0f)).forGetter(class07313::R), (App)Codec.INT.fieldOf("cookingtime").orElse((Object)n).forGetter(class07313::M)).apply((Applicative)instance, class072932::create));
    private final class02362<class04247, T> l = class02362.N((class02362)class02389.s, class06184::y, (class02362)class03774.field_54631, class07313::B, (class02362)class06510.field_48355, class06184::z, (class02362)class06584.z, class06184::U, (class02362)class02389.E, class07313::R, (class02362)class02389.M, class07313::M, class072932::create);

    public class07298(class07293<T> class072932, int n) {
    }

    public class02362<class04247, T> y() {
        return this.l;
    }

    public MapCodec<T> N() {
        return this.N;
    }
}

