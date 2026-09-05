/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03539
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class05946
 *  minecraft.class07209
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class03539;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class05369;
import minecraft.class05377;
import minecraft.class05946;
import minecraft.class07209;

public final class class05342
extends Record {
    private final class07209 pos;
    private final class03556<class05369> poiType;
    private final int freeTickets;
    public static final Codec<class05342> N = RecordCodecBuilder.create(instance -> instance.group((App)class07209.field_25064.fieldOf("pos").forGetter(class05342::N), (App)class03539.N((class05946)class04227.NZ).fieldOf("type").forGetter(class05342::y), (App)Codec.INT.fieldOf("free_tickets").orElse((Object)0).forGetter(class05342::L)).apply(instance, class05342::new));

    public int L() {
        return this.freeTickets;
    }

    public class05342(class07209 class072092, class03556<class05369> class035562, int n) {
        this.pos = class072092;
        this.poiType = class035562;
        this.freeTickets = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05342.class, "pos;poiType;freeTickets", "pos", "poiType", "freeTickets"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05342.class, "pos;poiType;freeTickets", "pos", "poiType", "freeTickets"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05342.class, "pos;poiType;freeTickets", "pos", "poiType", "freeTickets"}, this);
    }

    public class03556<class05369> y() {
        return this.poiType;
    }

    public class05377 N(Runnable runnable) {
        return new class05377(this.pos, this.poiType, this.freeTickets, runnable);
    }

    public class07209 N() {
        return this.pos;
    }
}

