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

public final class class07300
extends Record {
    private final int base;
    private final int perLevelAboveFirst;
    public static final Codec<class07300> N = RecordCodecBuilder.create(instance -> instance.group((App)Codec.INT.fieldOf("base").forGetter(class07300::N), (App)Codec.INT.fieldOf("per_level_above_first").forGetter(class07300::y)).apply(instance, class07300::new));

    public class07300(int n, int n2) {
        this.base = n;
        this.perLevelAboveFirst = n2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07300.class, "base;perLevelAboveFirst", "base", "perLevelAboveFirst"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07300.class, "base;perLevelAboveFirst", "base", "perLevelAboveFirst"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07300.class, "base;perLevelAboveFirst", "base", "perLevelAboveFirst"}, this);
    }

    public int y() {
        return this.perLevelAboveFirst;
    }

    public int N() {
        return this.base;
    }

    public int N(int n) {
        return this.base + this.perLevelAboveFirst * (n - 1);
    }
}

