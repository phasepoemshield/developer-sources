/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class04247
 *  minecraft.class06584
 *  minecraft.class07047
 *  minecraft.class07055
 *  minecraft.class07438
 *  minecraft.class08200
 *  minecraft.class08215
 *  minecraft.class08242
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Iterator;
import java.util.List;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class04247;
import minecraft.class06584;
import minecraft.class07047;
import minecraft.class07055;
import minecraft.class07438;
import minecraft.class08200;
import minecraft.class08215;
import minecraft.class08242;

public final class class08723
extends Record {
    private final List<class08200> deathEffects;
    public static final Codec<class08723> N = RecordCodecBuilder.create(instance -> instance.group((App)class08200.u.listOf().optionalFieldOf("death_effects", List.of()).forGetter(class08723::N)).apply(instance, class08723::new));
    public static final class02362<class04247, class08723> y = class02362.N((class02362)class08200.i.N_33(class02389.N()), class08723::N, class08723::new);
    public static final class08723 L = new class08723(List.of(new class08215(), new class08242(List.of(new class07055(class07047.z, 900, 1), new class07055(class07047.t, 100, 1), new class07055(class07047.E, 800, 0)))));

    public class08723(List<class08200> list) {
        this.deathEffects = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08723.class, "deathEffects", "deathEffects"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08723.class, "deathEffects", "deathEffects"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08723.class, "deathEffects", "deathEffects"}, this);
    }

    public List<class08200> N() {
        return this.deathEffects;
    }

    public void N(class06584 class065842, class07438 class074382) {
        Iterator<class08200> iterator = this.deathEffects.iterator();
        while (iterator.hasNext()) {
            iterator.next().N(class074382.method_73183(), class065842, class074382);
        }
    }
}

