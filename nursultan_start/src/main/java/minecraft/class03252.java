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
 *  minecraft.class05946
 *  minecraft.class08548
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
import minecraft.class05946;
import minecraft.class08548;

public final class class03252
extends Record {
    private final class08548 assets;
    private final class00392 description;
    public static final Codec<class03252> N = RecordCodecBuilder.create(instance -> instance.group((App)class08548.y.forGetter(class03252::N), (App)class03748.N.fieldOf("description").forGetter(class03252::y)).apply(instance, class03252::new));
    public static final class02362<class04247, class03252> y = class02362.N((class02362)class08548.L, class03252::N, (class02362)class03748.y, class03252::y, class03252::new);
    public static final Codec<class03556<class03252>> L = class01281.N((class05946)class04227.yw, N);
    public static final class02362<class04247, class03556<class03252>> u = class02389.N((class05946)class04227.yw, y);

    public class03252(class08548 class085482, class00392 class003922) {
        this.assets = class085482;
        this.description = class003922;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03252.class, "assets;description", "assets", "description"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03252.class, "assets;description", "assets", "description"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03252.class, "assets;description", "assets", "description"}, this);
    }

    public class00392 y() {
        return this.description;
    }

    public class08548 N() {
        return this.assets;
    }
}

