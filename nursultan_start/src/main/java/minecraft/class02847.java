/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00891
 *  minecraft.class03556
 *  minecraft.class04206
 *  minecraft.class07536
 *  minecraft.class08092
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import minecraft.class00891;
import minecraft.class03556;
import minecraft.class04206;
import minecraft.class07536;
import minecraft.class08092;

public final class class02847
extends Record {
    private final Map<class03556<class00891>, class08092<?>> properties;
    public static final class02847 N = new class02847(Map.of());
    public static final Codec<class02847> y = Codec.dispatchedMap((Codec)class04206.i.b(), class035562 -> Codec.STRING.comapFlatMap(string -> {
        class08092 var2 = ((class00891)class035562.N()).E().N(string);
        return var2 != null ? DataResult.success((Object)var2) : DataResult.error(() -> "No property on " + class035562.M() + " with name: " + string);
    }, class08092::R)).xmap(class02847::new, class02847::N);

    public class02847(Map<class03556<class00891>, class08092<?>> map) {
        this.properties = map;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02847.class, "properties", "properties"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02847.class, "properties", "properties"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02847.class, "properties", "properties"}, this);
    }

    public Map<class03556<class00891>, class08092<?>> N() {
        return this.properties;
    }

    public class02847 N(class03556<class00891> class035562, class08092<?> class080922) {
        return new class02847(class07536.N(this.properties, class035562, class080922));
    }
}

