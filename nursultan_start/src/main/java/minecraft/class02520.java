/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02560
 *  minecraft.class03556
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04995
 *  minecraft.class06052
 *  minecraft.class06069
 *  minecraft.class06338
 *  minecraft.class06889
 *  minecraft.class07049
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class02525;
import minecraft.class02560;
import minecraft.class03556;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04995;
import minecraft.class06052;
import minecraft.class06069;
import minecraft.class06338;
import minecraft.class06889;
import minecraft.class07049;

public final class class02520
extends Record
implements class02560 {
    private final List<class03556<class04891>> soundEvents;
    private final class06052 volume;
    private final class06052 pitch;
    public static final MapCodec<class02520> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06338.L((Codec)class04891.y, (Codec)class04891.y.sizeLimitedListOf(255)).fieldOf("sound").forGetter(class02520::y), (App)class06052.N((float)1.0E-5f, (float)10.0f).fieldOf("volume").forGetter(class02520::L), (App)class06052.N((float)1.0E-5f, (float)2.0f).fieldOf("pitch").forGetter(class02520::u)).apply(instance, class02520::new));

    public class06052 L() {
        return this.volume;
    }

    public class02520(List<class03556<class04891>> list, class06052 class060522, class06052 class060523) {
        this.soundEvents = list;
        this.volume = class060522;
        this.pitch = class060523;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02520.class, "soundEvents;volume;pitch", "soundEvents", "volume", "pitch"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02520.class, "soundEvents;volume;pitch", "soundEvents", "volume", "pitch"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02520.class, "soundEvents;volume;pitch", "soundEvents", "volume", "pitch"}, this);
    }

    public class06052 u() {
        return this.pitch;
    }

    public List<class03556<class04891>> y() {
        return this.soundEvents;
    }

    public void N(class04782 class047822, int n, class02525 class025252, class07049 class070492, class06889 class068892) {
        if (class070492.method_5701()) {
            return;
        }
        class06069 class060692 = class070492.method_59922();
        int n2 = class04995.N((int)(n - 1), (int)0, (int)(this.soundEvents.size() - 1));
        class047822.method_60511(null, class068892.N(), class068892.y(), class068892.L(), this.soundEvents.get(n2), class070492.method_5634(), this.volume.N(class060692), this.pitch.N(class060692));
    }

    public MapCodec<class02520> N() {
        return N;
    }
}

