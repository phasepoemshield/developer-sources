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
 *  minecraft.class01929
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02484
 *  minecraft.class03539
 *  minecraft.class03556
 *  minecraft.class03748
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class04891
 *  minecraft.class04995
 *  minecraft.class05946
 *  minecraft.class06338
 *  minecraft.class06584
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00392;
import minecraft.class01929;
import minecraft.class02232;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02484;
import minecraft.class03539;
import minecraft.class03556;
import minecraft.class03748;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class04891;
import minecraft.class04995;
import minecraft.class05946;
import minecraft.class06338;
import minecraft.class06584;

public final class class02206
extends Record {
    private final class03556<class04891> soundEvent;
    private final class00392 description;
    private final float lengthInSeconds;
    private final int comparatorOutput;
    public static final Codec<class02206> N = RecordCodecBuilder.create(instance -> instance.group((App)class04891.y.fieldOf("sound_event").forGetter(class02206::y), (App)class03748.N.fieldOf("description").forGetter(class02206::L), (App)class06338.t.fieldOf("length_in_seconds").forGetter(class02206::u), (App)class06338.N((int)0, (int)15).fieldOf("comparator_output").forGetter(class02206::i)).apply(instance, class02206::new));
    public static final class02362<class04247, class02206> y = class02362.N((class02362)class04891.u, class02206::y, (class02362)class03748.y, class02206::L, (class02362)class02389.E, class02206::u, (class02362)class02389.B, class02206::i, class02206::new);
    public static final Codec<class03556<class02206>> L = class03539.N((class05946)class04227.yz);
    public static final class02362<class04247, class03556<class02206>> u = class02389.N((class05946)class04227.yz, y);
    private static final int Z = 20;

    public class00392 L() {
        return this.description;
    }

    public class02206(class03556<class04891> class035562, class00392 class003922, float f, int n) {
        this.soundEvent = class035562;
        this.description = class003922;
        this.lengthInSeconds = f;
        this.comparatorOutput = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02206.class, "soundEvent;description;lengthInSeconds;comparatorOutput", "soundEvent", "description", "lengthInSeconds", "comparatorOutput"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02206.class, "soundEvent;description;lengthInSeconds;comparatorOutput", "soundEvent", "description", "lengthInSeconds", "comparatorOutput"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02206.class, "soundEvent;description;lengthInSeconds;comparatorOutput", "soundEvent", "description", "lengthInSeconds", "comparatorOutput"}, this);
    }

    public int i() {
        return this.comparatorOutput;
    }

    public float u() {
        return this.lengthInSeconds;
    }

    public class03556<class04891> y() {
        return this.soundEvent;
    }

    public static Optional<class03556<class02206>> N(class01929 class019292, class06584 class065842) {
        class02232 class022322 = (class02232)((Object)class065842.method_58694(class02484.NE));
        if (class022322 != null) {
            return class022322.N().N(class019292);
        }
        return Optional.empty();
    }

    public int N() {
        return class04995.u((float)(this.lengthInSeconds * 20.0f));
    }

    public boolean N(long l) {
        return l >= (long)(this.N() + 20);
    }
}

