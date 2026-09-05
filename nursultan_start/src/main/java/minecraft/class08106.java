/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.MatchException
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00331
 *  minecraft.class00335
 *  minecraft.class00368
 *  minecraft.class01134
 *  minecraft.class01894
 *  minecraft.class02774
 *  minecraft.class04802
 *  minecraft.class07914
 *  minecraft.class08971
 *  minecraft.class08973
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00331;
import minecraft.class00335;
import minecraft.class00368;
import minecraft.class01134;
import minecraft.class01894;
import minecraft.class02774;
import minecraft.class04802;
import minecraft.class07914;
import minecraft.class08136;
import minecraft.class08971;
import minecraft.class08973;

public final class class08106
extends Record
implements class00335 {
    private final class01894 texture;
    private final class08973 pose;
    public static final MapCodec<class08106> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class01894.N.fieldOf("texture").forGetter(class08106::y), (App)class08973.field_61419.fieldOf("pose").forGetter(class08106::L)).apply(instance, class08106::new));

    public class08973 L() {
        return this.pose;
    }

    public class08106(class02774 class027742, class08973 class089732) {
        this(class08971.N((class02774)class027742).i(), class089732);
    }

    public class08106(class01894 class018942, class08973 class089732) {
        this.texture = class018942;
        this.pose = class089732;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08106.class, "texture;pose", "texture", "pose"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08106.class, "texture;pose", "texture", "pose"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08106.class, "texture;pose", "texture", "pose"}, this);
    }

    public class01894 y() {
        return this.texture;
    }

    private static class01134 N(class08973 class089732) {
        return switch (class089732) {
            default -> throw new MatchException(null, null);
            case class08973.field_61414 -> class04802.Nm;
            case class08973.field_61415 -> class04802.NT;
            case class08973.field_61417 -> class04802.Nb;
            case class08973.field_61416 -> class04802.Ns;
        };
    }

    public MapCodec<class08106> N() {
        return N;
    }

    public class00368<?> N(class00331 class003312) {
        class07914 class079142 = new class07914(class003312.y().N(class08106.N(this.pose)));
        return new class08136(class079142, this.texture);
    }
}

