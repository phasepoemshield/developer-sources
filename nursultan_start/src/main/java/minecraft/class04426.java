/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01016
 *  minecraft.class04540
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01016;
import minecraft.class04436;
import minecraft.class04540;

public final class class04426
extends Record {
    private final class04436 boundingBox;
    private final class04540<class01016> spawns;
    public static final Codec<class04426> N = RecordCodecBuilder.create(instance -> instance.group((App)class04436.field_37202.fieldOf("bounding_box").forGetter(class04426::N), (App)class04540.N((MapCodec)class01016.N).fieldOf("spawns").forGetter(class04426::y)).apply(instance, class04426::new));

    public class04426(class04436 class044362, class04540<class01016> class045402) {
        this.boundingBox = class044362;
        this.spawns = class045402;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04426.class, "boundingBox;spawns", "boundingBox", "spawns"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04426.class, "boundingBox;spawns", "boundingBox", "spawns"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04426.class, "boundingBox;spawns", "boundingBox", "spawns"}, this);
    }

    public class04540<class01016> y() {
        return this.spawns;
    }

    public class04436 N() {
        return this.boundingBox;
    }
}

