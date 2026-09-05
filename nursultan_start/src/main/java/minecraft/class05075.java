/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03556
 *  minecraft.class04891
 *  minecraft.class06338
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class03556;
import minecraft.class04891;
import minecraft.class06338;

public final class class05075
extends Record {
    private final class03556<class04891> sound;
    private final int minDelay;
    private final int maxDelay;
    private final boolean replaceCurrentMusic;
    public static final Codec<class05075> N = RecordCodecBuilder.create(instance -> instance.group((App)class04891.y.fieldOf("sound").forGetter(class05075::N), (App)class06338.T.fieldOf("min_delay").forGetter(class05075::y), (App)class06338.T.fieldOf("max_delay").forGetter(class05075::L), (App)Codec.BOOL.optionalFieldOf("replace_current_music", (Object)false).forGetter(class05075::u)).apply(instance, class05075::new));

    public int L() {
        return this.maxDelay;
    }

    public class05075(class03556<class04891> class035562, int n, int n2, boolean bl) {
        this.sound = class035562;
        this.minDelay = n;
        this.maxDelay = n2;
        this.replaceCurrentMusic = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05075.class, "sound;minDelay;maxDelay;replaceCurrentMusic", "sound", "minDelay", "maxDelay", "replaceCurrentMusic"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05075.class, "sound;minDelay;maxDelay;replaceCurrentMusic", "sound", "minDelay", "maxDelay", "replaceCurrentMusic"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05075.class, "sound;minDelay;maxDelay;replaceCurrentMusic", "sound", "minDelay", "maxDelay", "replaceCurrentMusic"}, this);
    }

    public boolean u() {
        return this.replaceCurrentMusic;
    }

    public int y() {
        return this.minDelay;
    }

    public class03556<class04891> N() {
        return this.sound;
    }
}

