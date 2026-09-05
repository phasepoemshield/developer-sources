/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.MatchException
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class02968
 *  minecraft.class03748
 *  minecraft.class04548
 *  minecraft.class08735
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00392;
import minecraft.class01603;
import minecraft.class02968;
import minecraft.class03748;
import minecraft.class04548;
import minecraft.class08735;

public final class class01612
extends Record {
    private final class00392 description;
    private final class04548<class08735> supportedFormats;
    private static final Codec<class01612> R = RecordCodecBuilder.create(instance -> instance.group((App)class03748.N.fieldOf("description").forGetter(class01612::N)).apply(instance, class003922 -> new class01612((class00392)class003922, (class04548<class08735>)new class04548((Comparable)class08735.N((int)Integer.MAX_VALUE)))));
    public static final class02968<class01612> N = new class02968("pack", class01612.N(class01603.field_14188));
    public static final class02968<class01612> y = new class02968("pack", class01612.N(class01603.field_14190));
    public static final class02968<class01612> L = new class02968("pack", R);

    public class01612(class00392 class003922, class04548<class08735> class045482) {
        this.description = class003922;
        this.supportedFormats = class045482;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01612.class, "description;supportedFormats", "description", "supportedFormats"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01612.class, "description;supportedFormats", "description", "supportedFormats"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01612.class, "description;supportedFormats", "description", "supportedFormats"}, this);
    }

    public class04548<class08735> y() {
        return this.supportedFormats;
    }

    public static class02968<class01612> y(class01603 class016032) {
        return switch (class016032) {
            default -> throw new MatchException(null, null);
            case class01603.field_14188 -> N;
            case class01603.field_14190 -> y;
        };
    }

    public class00392 N() {
        return this.description;
    }

    public static Codec<class01612> N(class01603 class016032) {
        return RecordCodecBuilder.create(instance -> instance.group((App)class03748.N.fieldOf("description").forGetter(class01612::N), (App)class08735.y((class01603)class016032).forGetter(class01612::y)).apply((Applicative)instance, class01612::new));
    }
}

