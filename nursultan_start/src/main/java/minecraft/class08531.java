/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class01471
 *  minecraft.class01474
 *  minecraft.class02142
 *  minecraft.class06386
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import minecraft.class01471;
import minecraft.class01474;
import minecraft.class02142;
import minecraft.class06386;

public class class08531
implements class06386 {
    public static final Codec<class08531> N = RecordCodecBuilder.create(instance -> instance.group((App)class01471.N.fieldOf("trunk_provider").forGetter(class085312 -> class085312.y), (App)class02142.N((int)0, (int)16).fieldOf("log_length").forGetter(class085312 -> class085312.L), (App)class01474.y.listOf().fieldOf("stump_decorators").forGetter(class085312 -> class085312.u), (App)class01474.y.listOf().fieldOf("log_decorators").forGetter(class085312 -> class085312.i)).apply(instance, class08531::new));
    public final class01471 y;
    public final class02142 L;
    public final List<class01474> u;
    public final List<class01474> i;

    protected class08531(class01471 class014712, class02142 class021422, List<class01474> list, List<class01474> list2) {
        this.y = class014712;
        this.L = class021422;
        this.u = list;
        this.i = list2;
    }
}

