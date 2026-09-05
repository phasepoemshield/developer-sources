/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 *  minecraft.class04794
 *  minecraft.class04821
 *  minecraft.class05908
 *  minecraft.class07491
 *  minecraft.class07709
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Set;
import minecraft.class01894;
import minecraft.class04794;
import minecraft.class04821;
import minecraft.class04837;
import minecraft.class05908;
import minecraft.class07491;
import minecraft.class07709;

public final class class04831
extends Record
implements class04794 {
    private final class01894 id;
    public static final MapCodec<class04831> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class01894.N.fieldOf("source").forGetter(class04831::L)).apply(instance, class04831::new));

    public class01894 L() {
        return this.id;
    }

    public class04831(class01894 class018942) {
        this.id = class018942;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04831.class, "id", "id"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04831.class, "id", "id"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04831.class, "id", "id"}, this);
    }

    public Set<class07491<?>> y() {
        return Set.of();
    }

    public class07709 N(class05908 class059082) {
        return class059082.u().method_8503().yZ().N(this.id);
    }

    public class04837 N() {
        return class04821.y;
    }
}

