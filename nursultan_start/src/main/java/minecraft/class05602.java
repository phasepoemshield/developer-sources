/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class03238
 *  minecraft.class03543
 *  minecraft.class04336
 *  minecraft.class06338
 *  minecraft.class06386
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.util.stream.Stream;
import minecraft.class03238;
import minecraft.class03543;
import minecraft.class04336;
import minecraft.class06338;
import minecraft.class06386;

public class class05602
implements class06386 {
    public static final Codec<class05602> N = class06338.L((Codec)class04336.L).fieldOf("features").xmap(class05602::new, class056022 -> class056022.y).codec();
    public final class03543<class04336> y;

    public class05602(class03543<class04336> class035432) {
        this.y = class035432;
    }

    public Stream<class03238<?, ?>> u() {
        return this.y.N().flatMap(class035562 -> ((class04336)class035562.N()).N());
    }
}

