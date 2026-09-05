/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

final class class05948 {
    public static final Codec<class05948> N = RecordCodecBuilder.create(instance -> instance.group((App)Codec.INT.fieldOf("spacing").forGetter(class059482 -> class059482.y), (App)Codec.INT.fieldOf("separation").forGetter(class059482 -> class059482.L), (App)Codec.INT.fieldOf("salt").forGetter(class059482 -> class059482.u)).apply(instance, class05948::new));
    final int y;
    final int L;
    final int u;

    public class05948(int n, int n2, int n3) {
        this.y = n;
        this.L = n2;
        this.u = n3;
    }

    public <T> Dynamic<T> N(DynamicOps<T> dynamicOps) {
        return new Dynamic(dynamicOps, N.encodeStart(dynamicOps, (Object)this).result().orElse(dynamicOps.emptyMap()));
    }
}

