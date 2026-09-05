/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class05342;
import minecraft.class05370;

public final class class05380
extends Record {
    private final boolean isValid;
    private final List<class05342> records;
    public static final Codec<class05380> N = RecordCodecBuilder.create(instance -> instance.group((App)Codec.BOOL.lenientOptionalFieldOf("Valid", (Object)false).forGetter(class05380::N), (App)class05342.N.listOf().fieldOf("Records").forGetter(class05380::y)).apply(instance, class05380::new));

    public class05380(boolean bl, List<class05342> list) {
        this.isValid = bl;
        this.records = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05380.class, "isValid;records", "isValid", "records"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05380.class, "isValid;records", "isValid", "records"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05380.class, "isValid;records", "isValid", "records"}, this);
    }

    public List<class05342> y() {
        return this.records;
    }

    public boolean N() {
        return this.isValid;
    }

    public class05370 N(Runnable runnable) {
        return new class05370(runnable, this.isValid, this.records.stream().map(class053422 -> class053422.N(runnable)).toList());
    }
}

