/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class05946
 *  minecraft.class06889
 *  minecraft.class07109
 *  minecraft.class07299
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class05946;
import minecraft.class06889;
import minecraft.class07109;
import minecraft.class07299;

public final class class04773
extends Record {
    private final Optional<class05946<class07299>> dimension;
    private final Optional<class06889> position;
    private final Optional<class07109> rotation;
    public static final MapCodec<class04773> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class07299.field_25178.optionalFieldOf("Dimension").forGetter(class04773::N), (App)class06889.N.optionalFieldOf("Pos").forGetter(class04773::y), (App)class07109.Z.optionalFieldOf("Rotation").forGetter(class04773::L)).apply(instance, class04773::new));
    public static final class04773 y = new class04773(Optional.empty(), Optional.empty(), Optional.empty());

    public Optional<class07109> L() {
        return this.rotation;
    }

    public class04773(Optional<class05946<class07299>> optional, Optional<class06889> optional2, Optional<class07109> optional3) {
        this.dimension = optional;
        this.position = optional2;
        this.rotation = optional3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04773.class, "dimension;position;rotation", "dimension", "position", "rotation"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04773.class, "dimension;position;rotation", "dimension", "position", "rotation"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04773.class, "dimension;position;rotation", "dimension", "position", "rotation"}, this);
    }

    public Optional<class06889> y() {
        return this.position;
    }

    public Optional<class05946<class07299>> N() {
        return this.dimension;
    }
}

