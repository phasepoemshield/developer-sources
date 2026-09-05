/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class03748
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00392;
import minecraft.class03748;

public final class class09025
extends Record {
    private final String id;
    private final Optional<class00392> display;
    private final boolean initial;
    public static final Codec<class09025> N = RecordCodecBuilder.create(instance -> instance.group((App)Codec.STRING.fieldOf("id").forGetter(class09025::y), (App)class03748.N.optionalFieldOf("display").forGetter(class09025::L), (App)Codec.BOOL.optionalFieldOf("initial", (Object)false).forGetter(class09025::u)).apply(instance, class09025::new));
    public static final Codec<class09025> y = Codec.withAlternative(N, (Codec)Codec.STRING, string -> new class09025((String)string, Optional.empty(), false));

    public Optional<class00392> L() {
        return this.display;
    }

    public class09025(String string, Optional<class00392> optional, boolean bl) {
        this.id = string;
        this.display = optional;
        this.initial = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09025.class, "id;display;initial", "id", "display", "initial"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09025.class, "id;display;initial", "id", "display", "initial"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09025.class, "id;display;initial", "id", "display", "initial"}, this);
    }

    public boolean u() {
        return this.initial;
    }

    public String y() {
        return this.id;
    }

    public class00392 N() {
        return this.display.orElseGet(() -> class00392.y((String)this.id));
    }
}

