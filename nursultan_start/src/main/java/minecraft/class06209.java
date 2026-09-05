/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00500
 *  minecraft.class05261
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class00500;
import minecraft.class05261;

public class class06209 {
    public static final Codec<class06209> N = RecordCodecBuilder.create(instance -> instance.group((App)class05261.L.fieldOf("target").forGetter(class062092 -> class062092.y), (App)class00500.N.fieldOf("state").forGetter(class062092 -> class062092.L)).apply(instance, class06209::new));
    public final class05261 y;
    public final class00500 L;

    class06209(class05261 class052612, class00500 class005002) {
        this.y = class052612;
        this.L = class005002;
    }
}

