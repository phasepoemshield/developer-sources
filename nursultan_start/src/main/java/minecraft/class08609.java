/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
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
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class04247;
import minecraft.class06338;

public final class class08609
extends Record {
    private final int itemDamagePerAttack;
    private final float disableBlockingForSeconds;
    public static final float N = 5.0f;
    public static final Codec<class08609> y = RecordCodecBuilder.create(instance -> instance.group((App)class06338.T.optionalFieldOf("item_damage_per_attack", (Object)1).forGetter(class08609::N), (App)class06338.n.optionalFieldOf("disable_blocking_for_seconds", (Object)Float.valueOf(0.0f)).forGetter(class08609::y)).apply(instance, class08609::new));
    public static final class02362<class04247, class08609> L = class02362.N((class02362)class02389.B, class08609::N, (class02362)class02389.E, class08609::y, class08609::new);

    public class08609(int n) {
        this(n, 0.0f);
    }

    public class08609(int n, float f) {
        this.itemDamagePerAttack = n;
        this.disableBlockingForSeconds = f;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08609.class, "itemDamagePerAttack;disableBlockingForSeconds", "itemDamagePerAttack", "disableBlockingForSeconds"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08609.class, "itemDamagePerAttack;disableBlockingForSeconds", "itemDamagePerAttack", "disableBlockingForSeconds"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08609.class, "itemDamagePerAttack;disableBlockingForSeconds", "itemDamagePerAttack", "disableBlockingForSeconds"}, this);
    }

    public float y() {
        return this.disableBlockingForSeconds;
    }

    public int N() {
        return this.itemDamagePerAttack;
    }
}

