/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00500
 *  minecraft.class00507
 *  minecraft.class00522
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class04688
 */
package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import minecraft.class00500;
import minecraft.class00507;
import minecraft.class00522;
import minecraft.class01426;
import minecraft.class01428;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class04688;

public final class class01400
extends Record {
    private final List<class01428> properties;
    private static final Codec<List<class01428>> u = Codec.unboundedMap((Codec)Codec.STRING, class01426.L).xmap(map -> map.entrySet().stream().map(entry -> new class01428((String)entry.getKey(), (class01426)entry.getValue())).toList(), list -> list.stream().collect(Collectors.toMap(class01428::N, class01428::y)));
    public static final Codec<class01400> N = u.xmap(class01400::new, class01400::N);
    public static final class02362<ByteBuf, class01400> y = class01428.N.N_33(class02389.N()).N_10(class01400::new, class01400::N);

    public class01400(List<class01428> list) {
        this.properties = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01400.class, "properties", "properties"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01400.class, "properties", "properties"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01400.class, "properties", "properties"}, this);
    }

    public boolean N(class00500 class005002) {
        return this.N(class005002.i().E(), class005002);
    }

    public Optional<String> N(class00507<?, ?> class005072) {
        Iterator<class01428> var2 = this.properties.iterator();
        while (var2.hasNext()) {
            Optional<String> var4 = var2.next().N(class005072);
            if (!var4.isPresent()) continue;
            return var4;
        }
        return Optional.empty();
    }

    public <S extends class00522<?, S>> boolean N(class00507<?, S> class005072, S s) {
        Iterator<class01428> var3 = this.properties.iterator();
        while (var3.hasNext()) {
            if (var3.next().N(class005072, s)) continue;
            return false;
        }
        return true;
    }

    public boolean N(class04688 class046882) {
        return this.N(class046882.N().R(), class046882);
    }

    public List<class01428> N() {
        return this.properties;
    }
}

