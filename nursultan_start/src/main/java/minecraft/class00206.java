/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02796
 *  minecraft.class04782
 *  minecraft.class06826
 *  minecraft.class06839
 *  minecraft.class07305
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00225;
import minecraft.class02796;
import minecraft.class04782;
import minecraft.class06826;
import minecraft.class06839;
import minecraft.class07305;

public final class class00206
extends Record
implements class00225 {
    private final class06826 gameRulesMap;
    public static final MapCodec<class00206> L = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06826.N.fieldOf("rules").forGetter(class00206::y)).apply(instance, class00206::new));

    public class00206(class06826 class068262) {
        this.gameRulesMap = class068262;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00206.class, "gameRulesMap", "gameRulesMap"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00206.class, "gameRulesMap", "gameRulesMap"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00206.class, "gameRulesMap", "gameRulesMap"}, this);
    }

    @Override
    public void y(class04782 class047822) {
        this.gameRulesMap.y().forEach(class068392 -> this.N(class047822, (class06839)class068392));
    }

    public class06826 y() {
        return this.gameRulesMap;
    }

    public MapCodec<class00206> N() {
        return L;
    }

    private <T> void N(class04782 class047822, class06839<T> class068392) {
        class047822.method_64395().N(class068392, class068392.Z(), class047822.method_8503());
    }

    @Override
    public void N(class04782 class047822) {
        class07305 class073052 = class047822.method_64395();
        class02796 class027962 = class047822.method_8503();
        class073052.N(this.gameRulesMap, class027962);
    }
}

