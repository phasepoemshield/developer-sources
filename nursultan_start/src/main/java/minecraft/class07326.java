/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class07209
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class07209;

public final class class07326
extends Record {
    private final class07209 pos;
    private final int rotation;
    private final int entityId;
    public static final Codec<class07326> N = RecordCodecBuilder.create(instance -> instance.group((App)class07209.field_25064.fieldOf("pos").forGetter(class07326::y), (App)Codec.INT.fieldOf("rotation").forGetter(class07326::L), (App)Codec.INT.fieldOf("entity_id").forGetter(class07326::u)).apply(instance, class07326::new));

    public int L() {
        return this.rotation;
    }

    public class07326(class07209 class072092, int n, int n2) {
        this.pos = class072092;
        this.rotation = n;
        this.entityId = n2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07326.class, "pos;rotation;entityId", "pos", "rotation", "entityId"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07326.class, "pos;rotation;entityId", "pos", "rotation", "entityId"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07326.class, "pos;rotation;entityId", "pos", "rotation", "entityId"}, this);
    }

    public int u() {
        return this.entityId;
    }

    public class07209 y() {
        return this.pos;
    }

    public String N() {
        return class07326.N(this.pos);
    }

    public static String N(class07209 class072092) {
        return "frame-" + class072092.method_10263() + "," + class072092.method_10264() + "," + class072092.method_10260();
    }
}

