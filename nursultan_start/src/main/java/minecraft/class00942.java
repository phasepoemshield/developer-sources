/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09413
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 *  minecraft.class08589
 */
package minecraft;

import Nursultan.class09413;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00926;
import minecraft.class00949;
import minecraft.class01894;
import minecraft.class08589;

public final class class00942
extends Record
implements class00926 {
    private final class01894 atlas;
    private final class01894 sprite;
    public static final class01894 N = class08589.u;
    public static final MapCodec<class00942> y = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class01894.N.optionalFieldOf("atlas", (Object)N).forGetter(class00942::u), (App)class01894.N.fieldOf("sprite").forGetter(class00942::i)).apply(instance, class00942::new));

    @Override
    public String L() {
        String string = class00942.N(this.sprite);
        if (this.atlas.equals((Object)N)) {
            return "[" + string + "]";
        }
        return "[" + string + "@" + class00942.N(this.atlas) + "]";
    }

    public class00942(class01894 class018942, class01894 class018943) {
        this.atlas = class018942;
        this.sprite = class018943;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00942.class, "atlas;sprite", "atlas", "sprite"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00942.class, "atlas;sprite", "atlas", "sprite"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00942.class, "atlas;sprite", "atlas", "sprite"}, this);
    }

    public class01894 i() {
        return this.sprite;
    }

    public class01894 u() {
        return this.atlas;
    }

    @Override
    public class00949 y() {
        return new class09413(this.atlas, this.sprite);
    }

    private static String N(class01894 class018942) {
        return class018942.y().equals("minecraft") ? class018942.N() : class018942.toString();
    }

    public MapCodec<class00942> N() {
        return y;
    }
}

