/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00737
 *  minecraft.class00753
 *  minecraft.class01194
 *  minecraft.class01471
 *  minecraft.class02546
 *  minecraft.class02560
 *  minecraft.class03556
 *  minecraft.class04025
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class06069
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07209
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00737;
import minecraft.class00753;
import minecraft.class01194;
import minecraft.class01471;
import minecraft.class02525;
import minecraft.class02546;
import minecraft.class02560;
import minecraft.class03556;
import minecraft.class04025;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class06069;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07209;

public final class class02522
extends Record
implements class02560 {
    private final class02546 radius;
    private final class02546 height;
    private final class00753 offset;
    private final Optional<class04025> predicate;
    private final class01471 blockState;
    private final Optional<class03556<class01194>> triggerGameEvent;
    public static final MapCodec<class02522> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class02546.y.fieldOf("radius").forGetter(class02522::y), (App)class02546.y.fieldOf("height").forGetter(class02522::L), (App)class00753.field_25123.optionalFieldOf("offset", (Object)class00753.field_11176).forGetter(class02522::u), (App)class04025.y.optionalFieldOf("predicate").forGetter(class02522::i), (App)class01471.N.fieldOf("block_state").forGetter(class02522::R), (App)class01194.Nz.optionalFieldOf("trigger_game_event").forGetter(class02522::M)).apply(instance, class02522::new));

    public class02546 L() {
        return this.height;
    }

    public Optional<class03556<class01194>> M() {
        return this.triggerGameEvent;
    }

    public class02522(class02546 class025462, class02546 class025463, class00753 class007532, Optional<class04025> optional, class01471 class014712, Optional<class03556<class01194>> optional2) {
        this.radius = class025462;
        this.height = class025463;
        this.offset = class007532;
        this.predicate = optional;
        this.blockState = class014712;
        this.triggerGameEvent = optional2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02522.class, "radius;height;offset;predicate;blockState;triggerGameEvent", "radius", "height", "offset", "predicate", "blockState", "triggerGameEvent"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02522.class, "radius;height;offset;predicate;blockState;triggerGameEvent", "radius", "height", "offset", "predicate", "blockState", "triggerGameEvent"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02522.class, "radius;height;offset;predicate;blockState;triggerGameEvent", "radius", "height", "offset", "predicate", "blockState", "triggerGameEvent"}, this);
    }

    public Optional<class04025> i() {
        return this.predicate;
    }

    public class00753 u() {
        return this.offset;
    }

    public class02546 y() {
        return this.radius;
    }

    public void N(class04782 class047822, int n, class02525 class025252, class07049 class070492, class06889 class068892) {
        class07209 class072092 = class07209.method_49638((class00737)class068892).method_10081(this.offset);
        class06069 class060692 = class070492.method_59922();
        int n2 = (int)this.radius.N(n);
        int n3 = (int)this.height.N(n);
        for (class07209 class072093 : class07209.method_10097((class07209)class072092.method_10069(-n2, 0, -n2), (class07209)class072092.method_10069(n2, Math.min(n3 - 1, 0), n2))) {
            if (!(class072093.method_10268(class068892.N(), (double)class072093.method_10264() + 0.5, class068892.L()) < (double)class04995.Z((int)n2)) || !this.predicate.map(class040252 -> class040252.test((Object)class047822, (Object)class072093)).orElse(true).booleanValue() || !class047822.method_8501(class072093, this.blockState.N(class060692, class072093))) continue;
            this.triggerGameEvent.ifPresent(class035562 -> class047822.N(class070492, class035562, class072093));
        }
    }

    public MapCodec<class02522> N() {
        return N;
    }

    public class01471 R() {
        return this.blockState;
    }
}

