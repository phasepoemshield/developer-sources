/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class02362
 *  minecraft.class03762
 *  minecraft.class04247
 *  minecraft.class05857
 *  minecraft.class06492
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class02362;
import minecraft.class03762;
import minecraft.class04247;
import minecraft.class05857;
import minecraft.class06492;
import minecraft.class06514;

public class class06522<T extends class05857>
implements class06514<T> {
    private final MapCodec<T> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class03762.field_40252.fieldOf("category").orElse((Object)class03762.field_40251).forGetter(class05857::method_45441)).apply((Applicative)instance, arg_0 -> ((class06492)class064922).create(arg_0)));
    private final class02362<class04247, T> l = class02362.N((class02362)class03762.field_48353, class05857::method_45441, arg_0 -> class064922.create(arg_0));

    public class06522(class06492<T> class064922) {
    }

    @Override
    public class02362<class04247, T> y() {
        return this.l;
    }

    @Override
    public MapCodec<T> N() {
        return this.N;
    }
}

