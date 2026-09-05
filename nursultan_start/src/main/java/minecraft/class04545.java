/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00821
 *  minecraft.class01425
 *  minecraft.class05196
 *  minecraft.class05908
 *  minecraft.class06516
 *  minecraft.class06912
 *  minecraft.class06915
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import minecraft.class00821;
import minecraft.class01425;
import minecraft.class04492;
import minecraft.class05196;
import minecraft.class05908;
import minecraft.class06516;
import minecraft.class06912;
import minecraft.class06915;

public final class class04545
extends Record
implements class01425 {
    private final Optional<class05196> player;
    private final Optional<class05196> lightning;
    private final Optional<class05196> bystander;
    public static final Codec<class04545> N = RecordCodecBuilder.create(instance -> instance.group((App)class00821.y.optionalFieldOf("player").forGetter(class04545::N), (App)class00821.y.optionalFieldOf("lightning").forGetter(class04545::y), (App)class00821.y.optionalFieldOf("bystander").forGetter(class04545::L)).apply(instance, class04545::new));

    public Optional<class05196> L() {
        return this.bystander;
    }

    public class04545(Optional<class05196> optional, Optional<class05196> optional2, Optional<class05196> optional3) {
        this.player = optional;
        this.lightning = optional2;
        this.bystander = optional3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04545.class, "player;lightning;bystander", "player", "lightning", "bystander"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04545.class, "player;lightning;bystander", "player", "lightning", "bystander"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04545.class, "player;lightning;bystander", "player", "lightning", "bystander"}, this);
    }

    public Optional<class05196> y() {
        return this.lightning;
    }

    public static class06915<class04545> N(Optional<class00821> optional, Optional<class00821> optional2) {
        return class06912.D.N((class06516)new class04545(Optional.empty(), class00821.N(optional), class00821.N(optional2)));
    }

    public void N(class04492 class044922) {
        super.N(class044922);
        class044922.N(this.lightning, "lightning");
        class044922.N(this.bystander, "bystander");
    }

    public Optional<class05196> N() {
        return this.player;
    }

    public boolean N(class05908 class059082, List<class05908> list) {
        if (this.lightning.isPresent() && !this.lightning.get().N(class059082)) {
            return false;
        }
        if (this.bystander.isPresent()) {
            if (list.stream().noneMatch(arg_0 -> ((class05196)this.bystander.get()).N(arg_0))) {
                return false;
            }
        }
        return true;
    }
}

