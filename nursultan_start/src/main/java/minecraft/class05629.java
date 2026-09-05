/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class03238
 *  minecraft.class03556
 *  minecraft.class04336
 *  minecraft.class04747
 *  minecraft.class06386
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;
import minecraft.class03238;
import minecraft.class03556;
import minecraft.class04336;
import minecraft.class04747;
import minecraft.class06386;

public class class05629
implements class06386 {
    public static final Codec<class05629> N = RecordCodecBuilder.create(instance -> instance.apply2(class05629::new, (App)class04747.N.listOf().fieldOf("features").forGetter(class056292 -> class056292.y), (App)class04336.y.fieldOf("default").forGetter(class056292 -> class056292.L)));
    public final List<class04747> y;
    public final class03556<class04336> L;

    public class05629(List<class04747> list, class03556<class04336> class035562) {
        this.y = list;
        this.L = class035562;
    }

    public Stream<class03238<?, ?>> u() {
        return Stream.concat(this.y.stream().flatMap(class047472 -> ((class04336)class047472.y.N()).N()), ((class04336)this.L.N()).N());
    }
}

