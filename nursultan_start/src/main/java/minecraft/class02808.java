/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class02362
 *  minecraft.class03556
 *  minecraft.class03748
 *  minecraft.class04247
 *  minecraft.class07468
 *  minecraft.class07471
 *  minecraft.class08036
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class02362;
import minecraft.class02831;
import minecraft.class02836;
import minecraft.class03556;
import minecraft.class03748;
import minecraft.class04247;
import minecraft.class07468;
import minecraft.class07471;
import minecraft.class08036;
import org.jspecify.annotations.Nullable;

public final class class02808
extends Record
implements class02831 {
    private final class00392 component;
    static final MapCodec<class02808> L = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class03748.N.fieldOf("value").forGetter(class02808::u)).apply(instance, class02808::new));
    static final class02362<class04247, class02808> u = class02362.N((class02362)class03748.y, class02808::u, class02808::new);

    @Override
    public class02836 L() {
        return class02836.field_59741;
    }

    public class02808(class00392 class003922) {
        this.component = class003922;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02808.class, "component", "component"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02808.class, "component", "component"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02808.class, "component", "component"}, this);
    }

    public class00392 u() {
        return this.component;
    }

    @Override
    public void N(Consumer<class00392> consumer, @Nullable class08036 class080362, class03556<class07468> class035562, class07471 class074712) {
        consumer.accept(this.component);
    }
}

