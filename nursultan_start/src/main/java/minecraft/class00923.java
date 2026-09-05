/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00405
 *  minecraft.class04439
 *  minecraft.class05935
 *  minecraft.class05977
 *  minecraft.class06628
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00405;
import minecraft.class00926;
import minecraft.class04439;
import minecraft.class05935;
import minecraft.class05977;
import minecraft.class06628;

public final class class00923
extends Record
implements class04439 {
    private final class00926 contents;
    private static final String L = Character.toString('\ufffc');
    public static final MapCodec<class00923> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06628.N.forGetter(class00923::y)).apply(instance, class00923::new));

    public class00923(class00926 class009262) {
        this.contents = class009262;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00923.class, "contents", "contents"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00923.class, "contents", "contents"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00923.class, "contents", "contents"}, this);
    }

    public class00926 y() {
        return this.contents;
    }

    public MapCodec<class00923> N() {
        return N;
    }

    public <T> Optional<T> method_27660(class05935<T> class059352, class00405 class004052) {
        return class059352.accept(class004052.N(this.contents.y()), L);
    }

    public <T> Optional<T> method_27659(class05977<T> class059772) {
        return class059772.accept(this.contents.L());
    }
}

