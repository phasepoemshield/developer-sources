/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class08736
 *  minecraft.class08780
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class04150;
import minecraft.class08736;
import minecraft.class08780;

final class class04166
extends Record
implements class08736 {
    private final class08780 format;
    private final String overlay;
    static final Codec<class04166> N = RecordCodecBuilder.create(instance -> instance.group((App)class08780.y.forGetter(class04166::N), (App)Codec.STRING.validate(class04150::N).fieldOf("directory").forGetter(class04166::y)).apply(instance, class04166::new));

    class04166(class08780 class087802, String string) {
        this.format = class087802;
        this.overlay = string;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04166.class, "format;overlay", "format", "overlay"}, this, object);
    }

    public String toString() {
        return this.overlay;
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04166.class, "format;overlay", "format", "overlay"}, this);
    }

    public String y() {
        return this.overlay;
    }

    public class08780 N() {
        return this.format;
    }
}

