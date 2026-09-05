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

public class class05332
implements class06386 {
    public static final Codec<class05332> N = RecordCodecBuilder.create(instance -> instance.group((App)class00500.N.fieldOf("contents").forGetter(class053322 -> class053322.y), (App)class00500.N.fieldOf("rim").forGetter(class053322 -> class053322.L), (App)class02142.N((int)0, (int)16).fieldOf("size").forGetter(class053322 -> class053322.u), (App)class02142.N((int)0, (int)16).fieldOf("rim_size").forGetter(class053322 -> class053322.i)).apply(instance, class05332::new));
    private final class00500 y;
    private final class00500 L;
    private final class02142 u;
    private final class02142 i;

    public class02142 L() {
        return this.u;
    }

    public class05332(class00500 class005002, class00500 class005003, class02142 class021422, class02142 class021423) {
        this.y = class005002;
        this.L = class005003;
        this.u = class021422;
        this.i = class021423;
    }

    public class02142 i() {
        return this.i;
    }

    public class00500 y() {
        return this.L;
    }

    public class00500 N() {
        return this.y;
    }
}

