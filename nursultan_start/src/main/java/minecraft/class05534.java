/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01217
 *  minecraft.class01929
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class04247
 *  minecraft.class04490
 *  minecraft.class04495
 *  minecraft.class04620
 *  minecraft.class04626
 *  minecraft.class06113
 *  minecraft.class06837
 *  minecraft.class07001
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class08303
 *  minecraft.class08329
 *  minecraft.class08983
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class01217;
import minecraft.class01929;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class04247;
import minecraft.class04490;
import minecraft.class04495;
import minecraft.class04620;
import minecraft.class04626;
import minecraft.class06113;
import minecraft.class06837;
import minecraft.class07001;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class08303;
import minecraft.class08329;
import minecraft.class08983;
import org.jspecify.annotations.Nullable;

public final class class05534
extends Record {
    final class08983<class07078<?>> entityData;
    private final int ticksInHive;
    final int minTicksInHive;
    public static final Codec<class05534> L = RecordCodecBuilder.create(instance -> instance.group((App)class08983.N((Codec)class07078.N).fieldOf("entity_data").forGetter(class05534::N), (App)Codec.INT.fieldOf("ticks_in_hive").forGetter(class05534::y), (App)Codec.INT.fieldOf("min_ticks_in_hive").forGetter(class05534::L)).apply(instance, class05534::new));
    public static final Codec<List<class05534>> u = L.listOf();
    public static final class02362<class04247, class05534> i = class02362.N((class02362)class08983.N((class02362)class07078.y), class05534::N, (class02362)class02389.B, class05534::y, (class02362)class02389.B, class05534::L, class05534::new);

    public int L() {
        return this.minTicksInHive;
    }

    public class05534(class08983<class07078<?>> class089832, int n, int n2) {
        this.entityData = class089832;
        this.ticksInHive = n;
        this.minTicksInHive = n2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05534.class, "entityData;ticksInHive;minTicksInHive", "entityData", "ticksInHive", "minTicksInHive"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05534.class, "entityData;ticksInHive;minTicksInHive", "entityData", "ticksInHive", "minTicksInHive"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05534.class, "entityData;ticksInHive;minTicksInHive", "entityData", "ticksInHive", "minTicksInHive"}, this);
    }

    public int y() {
        return this.ticksInHive;
    }

    public @Nullable class07049 N(class07299 class072992, class07209 class072092) {
        class07001 class070012 = this.entityData.L();
        class04620.y.forEach(arg_0 -> ((class07001)class070012).b(arg_0));
        class07049 class070492 = class07078.N((class07078)((class07078)this.entityData.N()), (class07001)class070012, (class07299)class072992, (class06113)class06113.field_52444, (class06837)class06837.N);
        if (class070492 == null || !class070492.method_5864().N(class01217.R)) {
            return null;
        }
        class070492.method_5875(true);
        if (class070492 instanceof class04626) {
            class04626 class046262 = (class04626)class070492;
            class046262.R(class072092);
            class05534.N(this.ticksInHive, class046262);
        }
        return class070492;
    }

    public static class05534 N(class07049 class070492) {
        try (class04495 class044952 = new class04495(class070492.method_71370(), class04620.N);){
            class08303 class083032 = class08303.N((class04490)class044952, (class01929)class070492.method_56673());
            class070492.method_5662((class08329)class083032);
            class04620.y.forEach(arg_0 -> ((class08303)class083032).L(arg_0));
            class07001 class070012 = class083032.y();
            boolean bl = class070012.y("HasNectar", false);
            class05534 class055342 = new class05534(class08983.N((Object)class070492.method_5864(), (class07001)class070012), 0, bl ? 2400 : 600);
            return class055342;
        }
    }

    public class08983<class07078<?>> N() {
        return this.entityData;
    }

    public static class05534 N(int n) {
        return new class05534(class08983.N((Object)class07078.m, (class07001)new class07001()), n, 600);
    }

    private static void N(int n, class04626 class046262) {
        int n2 = class046262.K();
        if (n2 < 0) {
            class046262.u(Math.min(0, n2 + n));
        } else if (n2 > 0) {
            class046262.u(Math.max(0, n2 - n));
        }
        class046262.M(Math.max(0, class046262.NH() - n));
    }
}

