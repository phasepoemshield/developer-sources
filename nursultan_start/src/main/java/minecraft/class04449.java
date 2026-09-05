/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class01281
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class03556
 *  minecraft.class03748
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class04891
 *  minecraft.class05946
 *  minecraft.class06338
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00392;
import minecraft.class01281;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class03556;
import minecraft.class03748;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class04891;
import minecraft.class05946;
import minecraft.class06338;

public final class class04449
extends Record {
    private final class03556<class04891> soundEvent;
    private final float useDuration;
    private final float range;
    private final class00392 description;
    public static final Codec<class04449> N = RecordCodecBuilder.create(instance -> instance.group((App)class04891.y.fieldOf("sound_event").forGetter(class04449::N), (App)class06338.t.fieldOf("use_duration").forGetter(class04449::y), (App)class06338.t.fieldOf("range").forGetter(class04449::L), (App)class03748.N.fieldOf("description").forGetter(class04449::u)).apply(instance, class04449::new));
    public static final class02362<class04247, class04449> y = class02362.N((class02362)class04891.u, class04449::N, (class02362)class02389.E, class04449::y, (class02362)class02389.E, class04449::L, (class02362)class03748.y, class04449::u, class04449::new);
    public static final Codec<class03556<class04449>> L = class01281.N((class05946)class04227.yZ, N);
    public static final class02362<class04247, class03556<class04449>> u = class02389.N((class05946)class04227.yZ, y);

    public float L() {
        return this.range;
    }

    public class04449(class03556<class04891> class035562, float f, float f2, class00392 class003922) {
        this.soundEvent = class035562;
        this.useDuration = f;
        this.range = f2;
        this.description = class003922;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04449.class, "soundEvent;useDuration;range;description", "soundEvent", "useDuration", "range", "description"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04449.class, "soundEvent;useDuration;range;description", "soundEvent", "useDuration", "range", "description"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04449.class, "soundEvent;useDuration;range;description", "soundEvent", "useDuration", "range", "description"}, this);
    }

    public class00392 u() {
        return this.description;
    }

    public float y() {
        return this.useDuration;
    }

    public class03556<class04891> N() {
        return this.soundEvent;
    }
}

