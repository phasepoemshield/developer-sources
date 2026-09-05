/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01487
 *  minecraft.class06338
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.UUID;
import minecraft.class01487;
import minecraft.class05346;
import minecraft.class06338;

final class class05382
extends Record {
    final UUID target;
    final class05346 type;
    final int value;
    public static final Codec<class05382> u = RecordCodecBuilder.create(instance -> instance.group((App)class01487.N.fieldOf("Target").forGetter(class05382::y), (App)class05346.field_41672.fieldOf("Type").forGetter(class05382::L), (App)class06338.b.fieldOf("Value").forGetter(class05382::u)).apply(instance, class05382::new));

    public class05346 L() {
        return this.type;
    }

    class05382(UUID uUID, class05346 class053462, int n) {
        this.target = uUID;
        this.type = class053462;
        this.value = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05382.class, "target;type;value", "target", "type", "value"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05382.class, "target;type;value", "target", "type", "value"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05382.class, "target;type;value", "target", "type", "value"}, this);
    }

    public int u() {
        return this.value;
    }

    public UUID y() {
        return this.target;
    }

    public int N() {
        return this.value * this.type.field_18431;
    }
}

