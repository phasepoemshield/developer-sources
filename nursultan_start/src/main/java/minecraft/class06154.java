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
 *  minecraft.class04247
 *  minecraft.class06138
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
import minecraft.class04247;
import minecraft.class06138;
import minecraft.class06184;
import minecraft.class06510;
import minecraft.class06514;
import minecraft.class06584;

public class class06154<T extends class06184>
implements class06514<T> {
    private final MapCodec<T> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.STRING.optionalFieldOf("group", (Object)"").forGetter(class06184::y), (App)class06510.field_46095.fieldOf("ingredient").forGetter(class06184::z), (App)class06584.u.fieldOf("result").forGetter(class06184::U)).apply((Applicative)instance, (arg_0, arg_1, arg_2) -> ((class06138)class061382).create(arg_0, arg_1, arg_2)));
    private final class02362<class04247, T> l = class02362.N((class02362)class02389.s, class06184::y, (class02362)class06510.field_48355, class06184::z, (class02362)class06584.z, class06184::U, (arg_0, arg_1, arg_2) -> class061382.create(arg_0, arg_1, arg_2));

    protected class06154(class06138<T> class061382) {
    }

    public class02362<class04247, T> y() {
        return this.l;
    }

    public MapCodec<T> N() {
        return this.N;
    }
}

