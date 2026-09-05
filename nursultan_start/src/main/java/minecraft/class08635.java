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
 *  minecraft.class07209
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class00392;
import minecraft.class03748;
import minecraft.class07209;

public final class class08635
extends Record {
    private final class07209 pos;
    private final class00392 text;
    public static final Codec<class08635> N = RecordCodecBuilder.create(instance -> instance.group((App)class07209.field_25064.fieldOf("pos").forGetter(class08635::N), (App)class03748.N.fieldOf("text").forGetter(class08635::y)).apply(instance, class08635::new));
    public static final Codec<List<class08635>> y = N.listOf();

    public class08635(class07209 class072092, class00392 class003922) {
        this.pos = class072092;
        this.text = class003922;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08635.class, "pos;text", "pos", "text"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08635.class, "pos;text", "pos", "text"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08635.class, "pos;text", "pos", "text"}, this);
    }

    public class00392 y() {
        return this.text;
    }

    public class07209 N() {
        return this.pos;
    }
}

