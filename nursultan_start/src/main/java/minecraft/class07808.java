/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04551
 *  minecraft.class07529
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class04551;
import minecraft.class07529;

public final class class07808
extends Record {
    private final String name;
    private final int protocol;
    public static final Codec<class07808> N = RecordCodecBuilder.create(instance -> instance.group((App)Codec.STRING.fieldOf("name").forGetter(class07808::y), (App)Codec.INT.fieldOf("protocol").forGetter(class07808::L)).apply(instance, class07808::new));

    public int L() {
        return this.protocol;
    }

    public class07808(String string, int n) {
        this.name = string;
        this.protocol = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07808.class, "name;protocol", "name", "protocol"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07808.class, "name;protocol", "name", "protocol"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07808.class, "name;protocol", "name", "protocol"}, this);
    }

    public String y() {
        return this.name;
    }

    public static class07808 N() {
        class04551 class045512 = class07529.y();
        return new class07808(class045512.comp_4025(), class045512.comp_4027());
    }
}

