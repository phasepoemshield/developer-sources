/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10881
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.ImmutableSet$Builder
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import Nursultan.class10881;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class class08227
extends Record {
    private final Map<String, String> values;
    private final Set<String> flags;
    public static final class08227 N = new class08227(Map.of(), Set.of());
    public static final Codec<class08227> y = RecordCodecBuilder.create(instance -> instance.group((App)Codec.unboundedMap((Codec)Codec.STRING, (Codec)Codec.STRING).optionalFieldOf("values", Map.of()).forGetter(class08227::u), (App)Codec.STRING.listOf().xmap(Set::copyOf, List::copyOf).optionalFieldOf("flags", Set.of()).forGetter(class08227::i)).apply(instance, class08227::new));

    public boolean L() {
        return this.values.isEmpty() && this.flags.isEmpty();
    }

    public class08227(Map<String, String> map, Set<String> set) {
        this.values = map;
        this.flags = set;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08227.class, "values;flags", "values", "flags"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08227.class, "values;flags", "values", "flags"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08227.class, "values;flags", "values", "flags"}, this);
    }

    public Set<String> i() {
        return this.flags;
    }

    public Map<String, String> u() {
        return this.values;
    }

    public String y() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, String> object : this.values.entrySet()) {
            String string = object.getKey();
            String string2 = object.getValue();
            stringBuilder.append("#define ").append(string).append(" ").append(string2).append('\n');
        }
        for (String string : this.flags) {
            stringBuilder.append("#define ").append(string).append('\n');
        }
        return stringBuilder.toString();
    }

    public class08227 N(class08227 class082272) {
        if (this.L()) {
            return class082272;
        }
        if (class082272.L()) {
            return this;
        }
        ImmutableMap.Builder builder = ImmutableMap.builderWithExpectedSize((int)(this.values.size() + class082272.values.size()));
        builder.putAll(this.values);
        builder.putAll(class082272.values);
        ImmutableSet.Builder builder2 = ImmutableSet.builderWithExpectedSize((int)(this.flags.size() + class082272.flags.size()));
        builder2.addAll(this.flags);
        builder2.addAll(class082272.flags);
        return new class08227((Map<String, String>)builder.buildKeepingLast(), (Set<String>)builder2.build());
    }

    public static class10881 N() {
        return new class10881();
    }
}

