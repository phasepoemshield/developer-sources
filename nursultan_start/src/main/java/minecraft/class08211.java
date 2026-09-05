/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class03541
 *  minecraft.class03543
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class05946
 *  minecraft.class06584
 *  minecraft.class07084
 *  minecraft.class07299
 *  minecraft.class07438
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class03541;
import minecraft.class03543;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class05946;
import minecraft.class06584;
import minecraft.class07084;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08200;
import minecraft.class08217;

public final class class08211
extends Record
implements class08200 {
    private final class03543<class07084> effects;
    public static final MapCodec<class08211> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class03541.N((class05946)class04227.Ni).fieldOf("effects").forGetter(class08211::y)).apply(instance, class08211::new));
    public static final class02362<class04247, class08211> y = class02362.N((class02362)class02389.L((class05946)class04227.Ni), class08211::y, class08211::new);

    public class08211(class03556<class07084> class035562) {
        this((class03543<class07084>)class03543.N((class03556[])new class03556[]{class035562}));
    }

    public class08211(class03543<class07084> class035432) {
        this.effects = class035432;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08211.class, "effects", "effects"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08211.class, "effects", "effects"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08211.class, "effects", "effects"}, this);
    }

    public class03543<class07084> y() {
        return this.effects;
    }

    @Override
    public boolean N(class07299 class072992, class06584 class065842, class07438 class074382) {
        boolean bl = false;
        for (class03556 class035562 : this.effects) {
            if (!class074382.method_6016(class035562)) continue;
            bl = true;
        }
        return bl;
    }

    public class08217<class08211> N() {
        return class08217.y;
    }
}

