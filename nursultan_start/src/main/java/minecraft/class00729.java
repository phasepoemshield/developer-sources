/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00864
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class02679
 *  minecraft.class02692
 *  minecraft.class03556
 *  minecraft.class04107
 *  minecraft.class04995
 *  minecraft.class06092
 *  minecraft.class07055
 *  minecraft.class07084
 *  minecraft.class07209
 *  minecraft.class07290
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00864;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class02679;
import minecraft.class02692;
import minecraft.class03556;
import minecraft.class04107;
import minecraft.class04995;
import minecraft.class06092;
import minecraft.class07055;
import minecraft.class07084;
import minecraft.class07209;
import minecraft.class07290;
import org.jspecify.annotations.Nullable;

public class class00729
extends class00864
implements class04107 {
    protected static final MapCodec<class02692> y = class02692.L.fieldOf("suspicious_stew_effects");
    public static final MapCodec<class00729> L = RecordCodecBuilder.mapCodec(instance -> instance.group((App)y.forGetter(class00729::L), (App)class00729.t()).apply(instance, class00729::new));
    private static final class00494 N = class00891.y((double)6.0, (double)0.0, (double)10.0);
    private final class02692 u;

    public class02692 L() {
        return this.u;
    }

    public class00729(class02692 class026922, class01362 class013622) {
        super(class013622);
        this.u = class026922;
    }

    public class00729(class03556<class07084> class035562, float f, class01362 class013622) {
        this(class00729.N(class035562, f), class013622);
    }

    public @Nullable class07055 y() {
        return null;
    }

    public MapCodec<? extends class00729> N() {
        return L;
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return N.method_64034(class005002.N(class072092));
    }

    protected static class02692 N(class03556<class07084> class035562, float f) {
        return new class02692(List.of(new class02679(class035562, class04995.y((float)(f * 20.0f)))));
    }
}

