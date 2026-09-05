/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00780
 *  minecraft.class01281
 *  minecraft.class02055
 *  minecraft.class03221
 *  minecraft.class04227
 *  minecraft.class05946
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.stream.Collectors;
import minecraft.class00780;
import minecraft.class01281;
import minecraft.class02055;
import minecraft.class03221;
import minecraft.class03519;
import minecraft.class03556;
import minecraft.class03562;
import minecraft.class04227;
import minecraft.class05946;

public class class03573 {
    public static final Codec<class03573> N = RecordCodecBuilder.create(instance -> instance.group((App)class03562.i.fieldOf("preset").forGetter(class035732 -> class035732.L), class03519.L(class04227.NA)).apply(instance, class03573::new));
    public static final Codec<class03556<class03573>> y = class01281.N((class05946)class04227.yU, N);
    private final class03562 L;
    private final class03221<class03556<class00780>> u;

    public class03573(class03562 class035622, class02055<class00780> class020552) {
        this.L = class035622;
        this.u = class035622.L().N(arg_0 -> class020552.y(arg_0));
    }

    public static Map<class03562, class03221<class05946<class00780>>> y() {
        return class03562.u.values().stream().collect(Collectors.toMap(class035622 -> class035622, class035622 -> class035622.L().N(class059462 -> class059462)));
    }

    public class03221<class03556<class00780>> N() {
        return this.u;
    }
}

