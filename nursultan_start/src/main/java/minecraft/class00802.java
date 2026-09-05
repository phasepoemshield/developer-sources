/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01425
 *  minecraft.class04492
 *  minecraft.class05196
 *  minecraft.class05908
 *  minecraft.class06516
 *  minecraft.class06912
 *  minecraft.class06915
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00810;
import minecraft.class00821;
import minecraft.class01425;
import minecraft.class04492;
import minecraft.class05196;
import minecraft.class05908;
import minecraft.class06516;
import minecraft.class06912;
import minecraft.class06915;
import org.jspecify.annotations.Nullable;

public final class class00802
extends Record
implements class01425 {
    private final Optional<class05196> player;
    private final Optional<class05196> parent;
    private final Optional<class05196> partner;
    private final Optional<class05196> child;
    public static final Codec<class00802> N = RecordCodecBuilder.create(instance -> instance.group((App)class00821.y.optionalFieldOf("player").forGetter(class00802::N), (App)class00821.y.optionalFieldOf("parent").forGetter(class00802::L), (App)class00821.y.optionalFieldOf("partner").forGetter(class00802::u), (App)class00821.y.optionalFieldOf("child").forGetter(class00802::i)).apply(instance, class00802::new));

    public Optional<class05196> L() {
        return this.parent;
    }

    public class00802(Optional<class05196> optional, Optional<class05196> optional2, Optional<class05196> optional3, Optional<class05196> optional4) {
        this.player = optional;
        this.parent = optional2;
        this.partner = optional3;
        this.child = optional4;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00802.class, "player;parent;partner;child", "player", "parent", "partner", "child"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00802.class, "player;parent;partner;child", "player", "parent", "partner", "child"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00802.class, "player;parent;partner;child", "player", "parent", "partner", "child"}, this);
    }

    public Optional<class05196> i() {
        return this.child;
    }

    public Optional<class05196> u() {
        return this.partner;
    }

    public static class06915<class00802> y() {
        return class06912.s.N((class06516)new class00802(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));
    }

    public static class06915<class00802> N(Optional<class00821> optional, Optional<class00821> optional2, Optional<class00821> optional3) {
        return class06912.s.N((class06516)new class00802(Optional.empty(), class00821.N(optional), class00821.N(optional2), class00821.N(optional3)));
    }

    public void N(class04492 class044922) {
        super.N(class044922);
        class044922.N(this.parent, "parent");
        class044922.N(this.partner, "partner");
        class044922.N(this.child, "child");
    }

    private static boolean N(Optional<class05196> optional, class05908 class059082) {
        return optional.isEmpty() || optional.get().N(class059082);
    }

    public static class06915<class00802> N(class00810 class008102) {
        return class06912.s.N((class06516)new class00802(Optional.empty(), Optional.empty(), Optional.empty(), Optional.of(class00821.N(class008102))));
    }

    public boolean N(class05908 class059082, class05908 class059083, @Nullable class05908 class059084) {
        if (this.child.isPresent() && (class059084 == null || !this.child.get().N(class059084))) {
            return false;
        }
        return class00802.N(this.parent, class059082) && class00802.N(this.partner, class059083) || class00802.N(this.parent, class059083) && class00802.N(this.partner, class059082);
    }

    public Optional<class05196> N() {
        return this.player;
    }
}

