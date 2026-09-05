/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class03748
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00392;
import minecraft.class03748;
import minecraft.class09037;

public final class class09027
extends Record {
    private final class00392 label;
    private final Optional<class00392> tooltip;
    private final int width;
    public static final int N = 150;
    public static final MapCodec<class09027> y = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class03748.N.fieldOf("label").forGetter(class09027::N), (App)class03748.N.optionalFieldOf("tooltip").forGetter(class09027::y), (App)class09037.y.optionalFieldOf("width", (Object)150).forGetter(class09027::L)).apply(instance, class09027::new));

    public int L() {
        return this.width;
    }

    public class09027(class00392 class003922, int n) {
        this(class003922, Optional.empty(), n);
    }

    public class09027(class00392 class003922, Optional<class00392> optional, int n) {
        this.label = class003922;
        this.tooltip = optional;
        this.width = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09027.class, "label;tooltip;width", "label", "tooltip", "width"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09027.class, "label;tooltip;width", "label", "tooltip", "width"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09027.class, "label;tooltip;width", "label", "tooltip", "width"}, this);
    }

    public Optional<class00392> y() {
        return this.tooltip;
    }

    public class00392 N() {
        return this.label;
    }
}

