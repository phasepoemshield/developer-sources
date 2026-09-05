/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00500
 *  minecraft.class05256
 *  minecraft.class05261
 *  minecraft.class06191
 *  minecraft.class06209
 *  minecraft.class06386
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import minecraft.class00500;
import minecraft.class05256;
import minecraft.class05261;
import minecraft.class06191;
import minecraft.class06209;
import minecraft.class06386;

public class class05591
implements class06386 {
    public static final Codec<class05591> N = RecordCodecBuilder.create(instance -> instance.group((App)Codec.list((Codec)class06209.N).fieldOf("targets").forGetter(class055912 -> class055912.y)).apply(instance, class05591::new));
    public final List<class06209> y;

    public class05591(class00500 class005002, class00500 class005003) {
        this((List<class06209>)ImmutableList.of((Object)class06191.N((class05261)new class05256(class005002), (class00500)class005003)));
    }

    public class05591(List<class06209> list) {
        this.y = list;
    }
}

