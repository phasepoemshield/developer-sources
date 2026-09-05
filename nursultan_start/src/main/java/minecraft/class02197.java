/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00500
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class04247
 *  minecraft.class06338
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class00500;
import minecraft.class02191;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class04247;
import minecraft.class06338;

public final class class02197
extends Record {
    private final List<class02191> rules;
    private final float defaultMiningSpeed;
    private final int damagePerBlock;
    private final boolean canDestroyBlocksInCreative;
    public static final Codec<class02197> N = RecordCodecBuilder.create(instance -> instance.group((App)class02191.u.listOf().fieldOf("rules").forGetter(class02197::N), (App)Codec.FLOAT.optionalFieldOf("default_mining_speed", (Object)Float.valueOf(1.0f)).forGetter(class02197::y), (App)class06338.T.optionalFieldOf("damage_per_block", (Object)1).forGetter(class02197::L), (App)Codec.BOOL.optionalFieldOf("can_destroy_blocks_in_creative", (Object)true).forGetter(class02197::u)).apply(instance, class02197::new));
    public static final class02362<class04247, class02197> y = class02362.N((class02362)class02191.i.N_33(class02389.N()), class02197::N, (class02362)class02389.E, class02197::y, (class02362)class02389.B, class02197::L, (class02362)class02389.y, class02197::u, class02197::new);

    public int L() {
        return this.damagePerBlock;
    }

    public class02197(List<class02191> list, float f, int n, boolean bl) {
        this.rules = list;
        this.defaultMiningSpeed = f;
        this.damagePerBlock = n;
        this.canDestroyBlocksInCreative = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02197.class, "rules;defaultMiningSpeed;damagePerBlock;canDestroyBlocksInCreative", "rules", "defaultMiningSpeed", "damagePerBlock", "canDestroyBlocksInCreative"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02197.class, "rules;defaultMiningSpeed;damagePerBlock;canDestroyBlocksInCreative", "rules", "defaultMiningSpeed", "damagePerBlock", "canDestroyBlocksInCreative"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02197.class, "rules;defaultMiningSpeed;damagePerBlock;canDestroyBlocksInCreative", "rules", "defaultMiningSpeed", "damagePerBlock", "canDestroyBlocksInCreative"}, this);
    }

    public boolean u() {
        return this.canDestroyBlocksInCreative;
    }

    public float y() {
        return this.defaultMiningSpeed;
    }

    public boolean y(class00500 class005002) {
        for (class02191 class021912 : this.rules) {
            if (!class021912.L().isPresent() || !class005002.N(class021912.N())) continue;
            return class021912.L().get();
        }
        return false;
    }

    public List<class02191> N() {
        return this.rules;
    }

    public float N(class00500 class005002) {
        for (class02191 class021912 : this.rules) {
            if (!class021912.y().isPresent() || !class005002.N(class021912.N())) continue;
            return class021912.y().get().floatValue();
        }
        return this.defaultMiningSpeed;
    }
}

