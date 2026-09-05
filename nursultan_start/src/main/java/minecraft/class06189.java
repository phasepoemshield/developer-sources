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
 *  minecraft.class06386
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;
import minecraft.class03238;
import minecraft.class03556;
import minecraft.class04336;
import minecraft.class06386;

public class class06189
implements class06386 {
    public static final Codec<class06189> N = RecordCodecBuilder.create(instance -> instance.group((App)class04336.y.fieldOf("feature_true").forGetter(class061892 -> class061892.y), (App)class04336.y.fieldOf("feature_false").forGetter(class061892 -> class061892.L)).apply(instance, class06189::new));
    public final class03556<class04336> y;
    public final class03556<class04336> L;

    public class06189(class03556<class04336> class035562, class03556<class04336> class035563) {
        this.y = class035562;
        this.L = class035563;
    }

    public Stream<class03238<?, ?>> u() {
        return Stream.concat(((class04336)this.y.N()).N(), ((class04336)this.L.N()).N());
    }
}

