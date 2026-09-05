/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00500
 *  minecraft.class02142
 *  minecraft.class06386
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class00500;
import minecraft.class02142;
import minecraft.class06386;

public class class01041
implements class06386 {
    public static final Codec<class01041> N = RecordCodecBuilder.create(instance -> instance.group((App)class00500.N.fieldOf("target").forGetter(class010412 -> class010412.y), (App)class00500.N.fieldOf("state").forGetter(class010412 -> class010412.L), (App)class02142.N((int)0, (int)12).fieldOf("radius").forGetter(class010412 -> class010412.u)).apply(instance, class01041::new));
    public final class00500 y;
    public final class00500 L;
    private final class02142 u;

    public class01041(class00500 class005002, class00500 class005003, class02142 class021422) {
        this.y = class005002;
        this.L = class005003;
        this.u = class021422;
    }

    public class02142 N() {
        return this.u;
    }
}

