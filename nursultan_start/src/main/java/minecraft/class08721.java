/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02362
 *  minecraft.class03530
 *  minecraft.class03689
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class05946
 *  minecraft.class07072
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02362;
import minecraft.class03530;
import minecraft.class03689;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class05946;
import minecraft.class07072;

public final class class08721
extends Record {
    private final class03530<class03689> types;
    public static final Codec<class08721> N = RecordCodecBuilder.create(instance -> instance.group((App)class03530.y((class05946)class04227.yN).fieldOf("types").forGetter(class08721::N)).apply(instance, class08721::new));
    public static final class02362<class04247, class08721> y = class02362.N((class02362)class03530.L((class05946)class04227.yN), class08721::N, class08721::new);

    public class08721(class03530<class03689> class035302) {
        this.types = class035302;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08721.class, "types", "types"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08721.class, "types", "types"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08721.class, "types", "types"}, this);
    }

    public class03530<class03689> N() {
        return this.types;
    }

    public boolean N(class07072 class070722) {
        return class070722.N(this.types);
    }
}

