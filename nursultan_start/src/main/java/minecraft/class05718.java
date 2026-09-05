/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00500
 *  minecraft.class06386
 *  minecraft.class07376
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class00500;
import minecraft.class06386;
import minecraft.class07376;

public class class05718
implements class06386 {
    public static final Codec<class05718> N = RecordCodecBuilder.create(instance -> instance.group((App)Codec.intRange((int)0, (int)class07376.L).fieldOf("height").forGetter(class057182 -> class057182.y), (App)class00500.N.fieldOf("state").forGetter(class057182 -> class057182.L)).apply(instance, class05718::new));
    public final int y;
    public final class00500 L;

    public class05718(int n, class00500 class005002) {
        this.y = n;
        this.L = class005002;
    }
}

