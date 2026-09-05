/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class02142
 *  minecraft.class06386
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class02142;
import minecraft.class06386;

public class class05302
implements class06386 {
    public static final Codec<class05302> N = RecordCodecBuilder.create(instance -> instance.group((App)class02142.N((int)0, (int)3).fieldOf("reach").forGetter(class053022 -> class053022.y), (App)class02142.N((int)1, (int)10).fieldOf("height").forGetter(class053022 -> class053022.L)).apply(instance, class05302::new));
    private final class02142 y;
    private final class02142 L;

    public class05302(class02142 class021422, class02142 class021423) {
        this.y = class021422;
        this.L = class021423;
    }

    public class02142 y() {
        return this.L;
    }

    public class02142 N() {
        return this.y;
    }
}

