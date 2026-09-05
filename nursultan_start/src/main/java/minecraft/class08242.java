/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class04247
 *  minecraft.class06584
 *  minecraft.class07055
 *  minecraft.class07299
 *  minecraft.class07438
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class04247;
import minecraft.class06584;
import minecraft.class07055;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08200;
import minecraft.class08217;

public final class class08242
extends Record
implements class08200 {
    private final List<class07055> effects;
    private final float probability;
    public static final MapCodec<class08242> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class07055.u.listOf().fieldOf("effects").forGetter(class08242::y), (App)Codec.floatRange((float)0.0f, (float)1.0f).optionalFieldOf("probability", (Object)Float.valueOf(1.0f)).forGetter(class08242::L)).apply(instance, class08242::new));
    public static final class02362<class04247, class08242> y = class02362.N((class02362)class07055.i.N_33(class02389.N()), class08242::y, (class02362)class02389.E, class08242::L, class08242::new);

    public float L() {
        return this.probability;
    }

    public class08242(List<class07055> list, float f) {
        this.effects = list;
        this.probability = f;
    }

    public class08242(class07055 class070552) {
        this(class070552, 1.0f);
    }

    public class08242(List<class07055> list) {
        this(list, 1.0f);
    }

    public class08242(class07055 class070552, float f) {
        this(List.of(class070552), f);
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08242.class, "effects;probability", "effects", "probability"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08242.class, "effects;probability", "effects", "probability"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08242.class, "effects;probability", "effects", "probability"}, this);
    }

    public List<class07055> y() {
        return this.effects;
    }

    public class08217<class08242> N() {
        return class08217.N;
    }

    @Override
    public boolean N(class07299 class072992, class06584 class065842, class07438 class074382) {
        if (class074382.method_59922().z() >= this.probability) {
            return false;
        }
        boolean bl = false;
        for (class07055 class070552 : this.effects) {
            if (!class074382.method_6092(new class07055(class070552))) continue;
            bl = true;
        }
        return bl;
    }
}

