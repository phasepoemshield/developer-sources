/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06338
 *  minecraft.class06386
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class06338;
import minecraft.class06386;

public final class class04329
extends Record
implements class06386 {
    private final int spreadWidth;
    private final int spreadHeight;
    private final int maxHeight;
    public static final Codec<class04329> N = RecordCodecBuilder.create(instance -> instance.group((App)class06338.b.fieldOf("spread_width").forGetter(class04329::N), (App)class06338.b.fieldOf("spread_height").forGetter(class04329::y), (App)class06338.b.fieldOf("max_height").forGetter(class04329::L)).apply(instance, class04329::new));

    public int L() {
        return this.maxHeight;
    }

    public class04329(int n, int n2, int n3) {
        this.spreadWidth = n;
        this.spreadHeight = n2;
        this.maxHeight = n3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04329.class, "spreadWidth;spreadHeight;maxHeight", "spreadWidth", "spreadHeight", "maxHeight"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04329.class, "spreadWidth;spreadHeight;maxHeight", "spreadWidth", "spreadHeight", "maxHeight"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04329.class, "spreadWidth;spreadHeight;maxHeight", "spreadWidth", "spreadHeight", "maxHeight"}, this);
    }

    public int y() {
        return this.spreadHeight;
    }

    public int N() {
        return this.spreadWidth;
    }
}

