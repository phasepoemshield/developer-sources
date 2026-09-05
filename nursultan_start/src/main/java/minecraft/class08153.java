/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02362
 *  minecraft.class02389
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02362;
import minecraft.class02389;

public final class class08153
extends Record {
    private final boolean canSprint;
    private final boolean interactVibrations;
    private final float speedMultiplier;
    public static final class08153 N = new class08153(false, true, 0.2f);
    public static final Codec<class08153> y = RecordCodecBuilder.create(instance -> instance.group((App)Codec.BOOL.optionalFieldOf("can_sprint", (Object)class08153.N.canSprint).forGetter(class08153::N), (App)Codec.BOOL.optionalFieldOf("interact_vibrations", (Object)class08153.N.interactVibrations).forGetter(class08153::y), (App)Codec.floatRange((float)0.0f, (float)1.0f).optionalFieldOf("speed_multiplier", (Object)Float.valueOf(class08153.N.speedMultiplier)).forGetter(class08153::L)).apply(instance, class08153::new));
    public static final class02362<ByteBuf, class08153> L = class02362.N((class02362)class02389.y, class08153::N, (class02362)class02389.y, class08153::y, (class02362)class02389.E, class08153::L, class08153::new);

    public float L() {
        return this.speedMultiplier;
    }

    public class08153(boolean bl, boolean bl2, float f) {
        this.canSprint = bl;
        this.interactVibrations = bl2;
        this.speedMultiplier = f;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08153.class, "canSprint;interactVibrations;speedMultiplier", "canSprint", "interactVibrations", "speedMultiplier"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08153.class, "canSprint;interactVibrations;speedMultiplier", "canSprint", "interactVibrations", "speedMultiplier"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08153.class, "canSprint;interactVibrations;speedMultiplier", "canSprint", "interactVibrations", "speedMultiplier"}, this);
    }

    public boolean y() {
        return this.interactVibrations;
    }

    public boolean N() {
        return this.canSprint;
    }
}

