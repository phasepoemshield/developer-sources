/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02465
 *  minecraft.class02477
 *  minecraft.class02484
 *  minecraft.class03541
 *  minecraft.class03543
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class05946
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Iterator;
import java.util.Optional;
import minecraft.class02206;
import minecraft.class02232;
import minecraft.class02465;
import minecraft.class02477;
import minecraft.class02484;
import minecraft.class03541;
import minecraft.class03543;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class05946;

public final class class02208
extends Record
implements class02465<class02232> {
    private final Optional<class03543<class02206>> song;
    public static final Codec<class02208> N = RecordCodecBuilder.create(instance -> instance.group((App)class03541.N((class05946)class04227.yz).optionalFieldOf("song").forGetter(class02208::L)).apply(instance, class02208::new));

    public Optional<class03543<class02206>> L() {
        return this.song;
    }

    public class02208(Optional<class03543<class02206>> optional) {
        this.song = optional;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02208.class, "song", "song"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02208.class, "song", "song"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02208.class, "song", "song"}, this);
    }

    public class02477<class02232> y() {
        return class02484.NE;
    }

    public static class02208 N() {
        return new class02208(Optional.empty());
    }

    public boolean N(class02232 class022322) {
        if (this.song.isPresent()) {
            boolean bl = false;
            Iterator iterator = this.song.get().iterator();
            while (iterator.hasNext()) {
                Optional optional = ((class03556)iterator.next()).i();
                if (optional.isEmpty() || !optional.equals(class022322.N().N())) continue;
                bl = true;
                break;
            }
            return bl;
        }
        return true;
    }
}

