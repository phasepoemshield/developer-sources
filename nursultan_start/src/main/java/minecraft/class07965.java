/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 *  minecraft.class02834
 *  minecraft.class03556
 *  minecraft.class06338
 *  minecraft.class06339
 *  minecraft.class06378
 *  minecraft.class07463
 *  minecraft.class07468
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class01894;
import minecraft.class02834;
import minecraft.class03556;
import minecraft.class06338;
import minecraft.class06339;
import minecraft.class06378;
import minecraft.class07463;
import minecraft.class07468;

final class class07965
extends Record {
    final class01894 id;
    final class03556<class07468> attribute;
    final class07463 operation;
    final class06378 amount;
    final List<class02834> slots;
    private static final Codec<List<class02834>> M = class06338.y((Codec)class06338.N((Codec)class02834.field_49226));
    public static final Codec<class07965> R = RecordCodecBuilder.create(instance -> instance.group((App)class01894.N.fieldOf("id").forGetter(class07965::N), (App)class07468.N.fieldOf("attribute").forGetter(class07965::y), (App)class07463.field_45742.fieldOf("operation").forGetter(class07965::L), (App)class06339.N.fieldOf("amount").forGetter(class07965::u), (App)M.fieldOf("slot").forGetter(class07965::i)).apply(instance, class07965::new));

    public class07463 L() {
        return this.operation;
    }

    class07965(class01894 class018942, class03556<class07468> class035562, class07463 class074632, class06378 class063782, List<class02834> list) {
        this.id = class018942;
        this.attribute = class035562;
        this.operation = class074632;
        this.amount = class063782;
        this.slots = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07965.class, "id;attribute;operation;amount;slots", "id", "attribute", "operation", "amount", "slots"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07965.class, "id;attribute;operation;amount;slots", "id", "attribute", "operation", "amount", "slots"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07965.class, "id;attribute;operation;amount;slots", "id", "attribute", "operation", "amount", "slots"}, this);
    }

    public List<class02834> i() {
        return this.slots;
    }

    public class06378 u() {
        return this.amount;
    }

    public class03556<class07468> y() {
        return this.attribute;
    }

    public class01894 N() {
        return this.id;
    }
}

