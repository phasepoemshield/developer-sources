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
 *  minecraft.class07389
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class07389;

public final class class07920<Param>
extends Record {
    private final String name;
    private final class07389<Param> schema;
    private final boolean required;

    public class07389<Param> L() {
        return this.schema;
    }

    public class07920(String string, class07389<Param> class073892) {
        this(string, class073892, true);
    }

    public class07920(String string, class07389<Param> class073892, boolean bl) {
        this.name = string;
        this.schema = class073892;
        this.required = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07920.class, "name;schema;required", "name", "schema", "required"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07920.class, "name;schema;required", "name", "schema", "required"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07920.class, "name;schema;required", "name", "schema", "required"}, this);
    }

    public boolean u() {
        return this.required;
    }

    public String y() {
        return this.name;
    }

    public static <Param> MapCodec<class07920<Param>> N() {
        return RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.STRING.fieldOf("name").forGetter(class07920::y), (App)class07389.N().fieldOf("schema").forGetter(class07920::L), (App)Codec.BOOL.fieldOf("required").forGetter(class07920::u)).apply(instance, class07920::new));
    }
}

