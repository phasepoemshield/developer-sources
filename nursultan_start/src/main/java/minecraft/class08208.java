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
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class04247
 *  minecraft.class06338
 *  minecraft.class06584
 *  minecraft.class07438
 *  minecraft.class08036
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class01894;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class04247;
import minecraft.class06338;
import minecraft.class06584;
import minecraft.class07438;
import minecraft.class08036;

public final class class08208
extends Record {
    private final float seconds;
    private final Optional<class01894> cooldownGroup;
    public static final Codec<class08208> N = RecordCodecBuilder.create(instance -> instance.group((App)class06338.t.fieldOf("seconds").forGetter(class08208::y), (App)class01894.N.optionalFieldOf("cooldown_group").forGetter(class08208::L)).apply(instance, class08208::new));
    public static final class02362<class04247, class08208> y = class02362.N((class02362)class02389.E, class08208::y, (class02362)class01894.y.N_33(class02389::N), class08208::L, class08208::new);

    public Optional<class01894> L() {
        return this.cooldownGroup;
    }

    public class08208(float f) {
        this(f, Optional.empty());
    }

    public class08208(float f, Optional<class01894> optional) {
        this.seconds = f;
        this.cooldownGroup = optional;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08208.class, "seconds;cooldownGroup", "seconds", "cooldownGroup"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08208.class, "seconds;cooldownGroup", "seconds", "cooldownGroup"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08208.class, "seconds;cooldownGroup", "seconds", "cooldownGroup"}, this);
    }

    public float y() {
        return this.seconds;
    }

    public void N(class06584 class065842, class07438 class074382) {
        if (class074382 instanceof class08036) {
            ((class08036)class074382).method_7357().N(class065842, this.N());
        }
    }

    public int N() {
        return (int)(this.seconds * 20.0f);
    }
}

