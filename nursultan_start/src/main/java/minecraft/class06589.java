/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03556
 *  minecraft.class04891
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class03556;
import minecraft.class04891;

public final class class06589
extends Record {
    private final Optional<class03556<class04891>> start;
    private final Optional<class03556<class04891>> mid;
    private final Optional<class03556<class04891>> end;
    public static final Codec<class06589> N = RecordCodecBuilder.create(instance -> instance.group((App)class04891.y.optionalFieldOf("start").forGetter(class06589::N), (App)class04891.y.optionalFieldOf("mid").forGetter(class06589::y), (App)class04891.y.optionalFieldOf("end").forGetter(class06589::L)).apply(instance, class06589::new));

    public Optional<class03556<class04891>> L() {
        return this.end;
    }

    public class06589(Optional<class03556<class04891>> optional, Optional<class03556<class04891>> optional2, Optional<class03556<class04891>> optional3) {
        this.start = optional;
        this.mid = optional2;
        this.end = optional3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06589.class, "start;mid;end", "start", "mid", "end"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06589.class, "start;mid;end", "start", "mid", "end"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06589.class, "start;mid;end", "start", "mid", "end"}, this);
    }

    public Optional<class03556<class04891>> y() {
        return this.mid;
    }

    public Optional<class03556<class04891>> N() {
        return this.start;
    }
}

