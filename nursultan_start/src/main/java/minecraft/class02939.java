/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02465
 *  minecraft.class02477
 *  minecraft.class02484
 *  minecraft.class02648
 *  minecraft.class02699
 *  minecraft.class02826
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class02465;
import minecraft.class02477;
import minecraft.class02484;
import minecraft.class02648;
import minecraft.class02699;
import minecraft.class02826;
import minecraft.class02916;

public final class class02939
extends Record
implements class02465<class02699> {
    private final Optional<class02648<class02826<String>, class02916>> pages;
    public static final Codec<class02939> N = RecordCodecBuilder.create(instance -> instance.group((App)class02648.N(class02916.N).optionalFieldOf("pages").forGetter(class02939::N)).apply(instance, class02939::new));

    public class02939(Optional<class02648<class02826<String>, class02916>> optional) {
        this.pages = optional;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02939.class, "pages", "pages"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02939.class, "pages", "pages"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02939.class, "pages", "pages"}, this);
    }

    public class02477<class02699> y() {
        return class02484.Ny;
    }

    public boolean N(class02699 class026992) {
        return !this.pages.isPresent() || this.pages.get().test((Iterable)class026992.N());
    }

    public Optional<class02648<class02826<String>, class02916>> N() {
        return this.pages;
    }
}

