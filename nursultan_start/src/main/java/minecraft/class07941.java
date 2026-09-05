/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class07389
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class07389;

public final class class07941<Result>
extends Record {
    private final String name;
    private final class07389<Result> schema;

    public class07389<Result> L() {
        return this.schema;
    }

    public class07941(String string, class07389<Result> class073892) {
        this.name = string;
        this.schema = class073892;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07941.class, "name;schema", "name", "schema"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07941.class, "name;schema", "name", "schema"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07941.class, "name;schema", "name", "schema"}, this);
    }

    public String y() {
        return this.name;
    }

    public static <Result> Codec<class07941<Result>> N() {
        return RecordCodecBuilder.create(instance -> instance.group((App)Codec.STRING.fieldOf("name").forGetter(class07941::y), (App)class07389.N().fieldOf("schema").forGetter(class07941::L)).apply(instance, class07941::new));
    }
}

