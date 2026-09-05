/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class05561
 *  minecraft.class05908
 *  minecraft.class05952
 *  minecraft.class05955
 *  minecraft.class05957
 *  minecraft.class07491
 *  minecraft.class07693
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Set;
import minecraft.class05561;
import minecraft.class05908;
import minecraft.class05952;
import minecraft.class05955;
import minecraft.class05957;
import minecraft.class07491;
import minecraft.class07693;

public final class class00815
extends Record
implements class05957 {
    private final class05957 term;
    public static final MapCodec<class00815> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class05957.L.fieldOf("term").forGetter(class00815::L)).apply(instance, class00815::new));

    public class05957 L() {
        return this.term;
    }

    public class00815(class05957 class059572) {
        this.term = class059572;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00815.class, "term", "term"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00815.class, "term", "term"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00815.class, "term", "term"}, this);
    }

    public Set<class07491<?>> y() {
        return this.term.y();
    }

    public static class05952 N(class05952 class059522) {
        return () -> class00815.N(new class00815(class059522.build()));
    }

    private static /* synthetic */ class05957 N(class00815 class008152) {
        return class008152;
    }

    public boolean test(class05908 class059082) {
        return !this.term.test((Object)class059082);
    }

    public class05955 N() {
        return class07693.N;
    }

    public void N(class05561 class055612) {
        super.N(class055612);
        this.term.N(class055612);
    }
}

