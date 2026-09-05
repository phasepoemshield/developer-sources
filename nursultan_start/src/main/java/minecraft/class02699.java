/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02499
 *  minecraft.class02826
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.stream.Stream;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02499;
import minecraft.class02826;

public final class class02699
extends Record
implements class02499<String, class02699> {
    private final List<class02826<String>> pages;
    public static final class02699 N = new class02699(List.of());
    public static final int y = 1024;
    public static final int L = 100;
    private static final Codec<class02826<String>> B = class02826.N((Codec)Codec.string((int)0, (int)1024));
    public static final Codec<List<class02826<String>>> u = B.sizeLimitedListOf(100);
    public static final Codec<class02699> i = RecordCodecBuilder.create(instance -> instance.group((App)u.optionalFieldOf("pages", List.of()).forGetter(class02699::N)).apply(instance, class02699::new));
    public static final class02362<ByteBuf, class02699> R = class02826.N((class02362)class02389.y((int)1024)).N_33(class02389.L((int)100)).N_10(class02699::new, class02699::N);

    public class02699(List<class02826<String>> list) {
        if (list.size() > 100) {
            throw new IllegalArgumentException("Got " + list.size() + " pages, but maximum is 100");
        }
        this.pages = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02699.class, "pages", "pages"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02699.class, "pages", "pages"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02699.class, "pages", "pages"}, this);
    }

    public class02699 y(List<class02826<String>> list) {
        return new class02699(list);
    }

    public List<class02826<String>> N() {
        return this.pages;
    }

    public Stream<String> N(boolean bl) {
        return this.pages.stream().map(class028262 -> (String)class028262.N(bl));
    }
}

