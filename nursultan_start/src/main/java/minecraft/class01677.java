/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02968
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01650;
import minecraft.class02968;

public final class class01677
extends Record {
    private final class01650 scaling;
    public static final class01677 N = new class01677(class01650.y);
    public static final Codec<class01677> y = RecordCodecBuilder.create(instance -> instance.group((App)class01650.N.optionalFieldOf("scaling", (Object)class01650.y).forGetter(class01677::N)).apply(instance, class01677::new));
    public static final class02968<class01677> L = new class02968("gui", y);

    public class01677(class01650 class016502) {
        this.scaling = class016502;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01677.class, "scaling", "scaling"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01677.class, "scaling", "scaling"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01677.class, "scaling", "scaling"}, this);
    }

    public class01650 N() {
        return this.scaling;
    }
}

