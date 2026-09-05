/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DynamicOps
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01921
 *  minecraft.class01929
 *  minecraft.class02198
 *  minecraft.class03556
 *  minecraft.class05946
 */
package minecraft;

import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01921;
import minecraft.class01929;
import minecraft.class02172;
import minecraft.class02198;
import minecraft.class03556;
import minecraft.class05946;

public final class class02178<T, O>
extends Record
implements class02172<T, O> {
    private final class05946<T> key;

    public class02178(class05946<T> class059462) {
        this.key = class059462;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02178.class, "key", "key"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02178.class, "key", "key"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02178.class, "key", "key"}, this);
    }

    @Override
    public class03556<T> N(ImmutableStringReader immutableStringReader, class01929 class019292, DynamicOps<O> dynamicOps, Codec<T> codec, class01921<T> class019212) throws CommandSyntaxException {
        return (class03556)class019212.N(this.key).orElseThrow(() -> class02198.y.createWithContext(immutableStringReader, (Object)this.key.N(), (Object)this.key.y()));
    }

    public class05946<T> N() {
        return this.key;
    }
}

