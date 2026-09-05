/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00106
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00106;
import minecraft.class09015;

public final class class09009
extends Record {
    private final String key;
    private final class09015 control;
    public static final Codec<class09009> N = RecordCodecBuilder.create(instance -> instance.group((App)class00106.y.fieldOf("key").forGetter(class09009::N), (App)class09015.y.forGetter(class09009::y)).apply(instance, class09009::new));

    public class09009(String string, class09015 class090152) {
        this.key = string;
        this.control = class090152;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09009.class, "key;control", "key", "control"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09009.class, "key;control", "key", "control"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09009.class, "key;control", "key", "control"}, this);
    }

    public class09015 y() {
        return this.control;
    }

    public String N() {
        return this.key;
    }
}

