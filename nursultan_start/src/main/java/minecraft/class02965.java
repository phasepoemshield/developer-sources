/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.Lifecycle
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00731
 *  minecraft.class00751
 *  minecraft.class05946
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import java.util.function.BiConsumer;
import minecraft.class00731;
import minecraft.class00751;
import minecraft.class02992;
import minecraft.class05946;

public final class class02965<T>
extends Record {
    private final class05946<? extends class00751<T>> key;
    final Codec<T> elementCodec;
    final boolean requiredNonEmpty;

    public boolean L() {
        return this.requiredNonEmpty;
    }

    class02965(class05946<? extends class00751<T>> class059462, Codec<T> codec) {
        this(class059462, codec, false);
    }

    public class02965(class05946<? extends class00751<T>> class059462, Codec<T> codec, boolean bl) {
        this.key = class059462;
        this.elementCodec = codec;
        this.requiredNonEmpty = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02965.class, "key;elementCodec;requiredNonEmpty", "key", "elementCodec", "requiredNonEmpty"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02965.class, "key;elementCodec;requiredNonEmpty", "key", "elementCodec", "requiredNonEmpty"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02965.class, "key;elementCodec;requiredNonEmpty", "key", "elementCodec", "requiredNonEmpty"}, this);
    }

    public Codec<T> y() {
        return this.elementCodec;
    }

    class02992<T> N(Lifecycle lifecycle, Map<class05946<?>, Exception> map) {
        class00731 class007312 = new class00731(this.key, lifecycle);
        return new class02992(this, class007312, map);
    }

    public void N(BiConsumer<class05946<? extends class00751<T>>, Codec<T>> biConsumer) {
        biConsumer.accept(this.key, this.elementCodec);
    }

    public class05946<? extends class00751<T>> N() {
        return this.key;
    }
}

