/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00647
 *  minecraft.class00654
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.File;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.file.Path;
import minecraft.class00647;
import minecraft.class00654;

public final class class00623
extends Record
implements class00647 {
    private final String path;
    public static final MapCodec<class00623> y = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.STRING.fieldOf("path").forGetter(class00623::L)).apply(instance, class00623::new));

    public String L() {
        return this.path;
    }

    public class00623(String string) {
        this.path = string;
    }

    public class00623(Path path) {
        this(path.toFile());
    }

    public class00623(File file) {
        this(file.toString());
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00623.class, "path", "path"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00623.class, "path", "path"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00623.class, "path", "path"}, this);
    }

    public File y() {
        return new File(this.path);
    }

    public class00654 N() {
        return class00654.field_11746;
    }
}

