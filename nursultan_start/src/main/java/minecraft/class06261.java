/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02263
 *  minecraft.class06270
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02263;
import minecraft.class06270;

public final class class06261
extends Record {
    private final class06270 definition;
    private final class02263 filter;
    public static final Codec<class06261> N = RecordCodecBuilder.create(instance -> instance.group((App)class06270.y.forGetter(class06261::N), (App)class02263.N.optionalFieldOf("filter", (Object)class02263.y).forGetter(class06261::y)).apply(instance, class06261::new));

    public class06261(class06270 class062702, class02263 class022632) {
        this.definition = class062702;
        this.filter = class022632;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06261.class, "definition;filter", "definition", "filter"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06261.class, "definition;filter", "definition", "filter"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06261.class, "definition;filter", "definition", "filter"}, this);
    }

    public class02263 y() {
        return this.filter;
    }

    public class06270 N() {
        return this.definition;
    }
}

