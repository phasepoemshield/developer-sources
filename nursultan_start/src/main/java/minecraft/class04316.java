/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class01458
 *  minecraft.class01471
 *  minecraft.class06338
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class01458;
import minecraft.class01471;
import minecraft.class06338;

public class class04316
extends class01458 {
    public static final Codec<class04316> L = RecordCodecBuilder.create(instance -> instance.group((App)class01471.N.fieldOf("state_provider").forGetter(class043162 -> class043162.y), (App)class06338.b.fieldOf("spread_width").forGetter(class043162 -> class043162.u), (App)class06338.b.fieldOf("spread_height").forGetter(class043162 -> class043162.i)).apply(instance, class04316::new));
    public final int u;
    public final int i;

    public class04316(class01471 class014712, int n, int n2) {
        super(class014712);
        this.u = n;
        this.i = n2;
    }
}

