/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class06338
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00392;
import minecraft.class06338;

public final class class08430
extends Record {
    private final String region;
    private final String name;
    private final boolean bidirectional;
    public static final Codec<class08430> N = RecordCodecBuilder.create(instance -> instance.group((App)class06338.H.fieldOf("region").forGetter(class08430::y), (App)class06338.H.fieldOf("name").forGetter(class08430::L), (App)Codec.BOOL.optionalFieldOf("bidirectional", (Object)false).forGetter(class08430::u)).apply(instance, class08430::new));

    public String L() {
        return this.name;
    }

    public class08430(String string, String string2, boolean bl) {
        this.region = string;
        this.name = string2;
        this.bidirectional = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08430.class, "region;name;bidirectional", "region", "name", "bidirectional"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08430.class, "region;name;bidirectional", "region", "name", "bidirectional"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08430.class, "region;name;bidirectional", "region", "name", "bidirectional"}, this);
    }

    public boolean u() {
        return this.bidirectional;
    }

    public String y() {
        return this.region;
    }

    public class00392 N() {
        return class00392.y((String)(this.name + " (" + this.region + ")"));
    }
}

