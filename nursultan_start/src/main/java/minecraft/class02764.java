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
 *  minecraft.class02389
 *  minecraft.class03541
 *  minecraft.class03543
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class05946
 *  minecraft.class06581
 *  minecraft.class06584
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class03541;
import minecraft.class03543;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class05946;
import minecraft.class06581;
import minecraft.class06584;

public final class class02764
extends Record {
    private final class03543<class06581> items;
    public static final Codec<class02764> N = RecordCodecBuilder.create(instance -> instance.group((App)class03541.N((class05946)class04227.F).fieldOf("items").forGetter(class02764::N)).apply(instance, class02764::new));
    public static final class02362<class04247, class02764> y = class02362.N((class02362)class02389.L((class05946)class04227.F), class02764::N, class02764::new);

    public class02764(class03543<class06581> class035432) {
        this.items = class035432;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02764.class, "items", "items"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02764.class, "items", "items"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02764.class, "items", "items"}, this);
    }

    public class03543<class06581> N() {
        return this.items;
    }

    public boolean N(class06584 class065842) {
        return class065842.N(this.items);
    }
}

