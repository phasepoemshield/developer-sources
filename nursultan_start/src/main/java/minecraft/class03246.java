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
 *  minecraft.class01894
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class03556
 *  minecraft.class03748
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class05946
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00392;
import minecraft.class01281;
import minecraft.class01894;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class03252;
import minecraft.class03556;
import minecraft.class03748;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class05946;

public final class class03246
extends Record {
    private final class01894 assetId;
    private final class00392 description;
    private final boolean decal;
    public static final Codec<class03246> N = RecordCodecBuilder.create(instance -> instance.group((App)class01894.N.fieldOf("asset_id").forGetter(class03246::N), (App)class03748.N.fieldOf("description").forGetter(class03246::y), (App)Codec.BOOL.fieldOf("decal").orElse((Object)false).forGetter(class03246::L)).apply(instance, class03246::new));
    public static final class02362<class04247, class03246> y = class02362.N((class02362)class01894.y, class03246::N, (class02362)class03748.y, class03246::y, (class02362)class02389.y, class03246::L, class03246::new);
    public static final Codec<class03556<class03246>> L = class01281.N((class05946)class04227.yk, N);
    public static final class02362<class04247, class03556<class03246>> u = class02389.N((class05946)class04227.yk, y);

    public boolean L() {
        return this.decal;
    }

    public class03246(class01894 class018942, class00392 class003922, boolean bl) {
        this.assetId = class018942;
        this.description = class003922;
        this.decal = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03246.class, "assetId;description;decal", "assetId", "description", "decal"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03246.class, "assetId;description;decal", "assetId", "description", "decal"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03246.class, "assetId;description;decal", "assetId", "description", "decal"}, this);
    }

    public class00392 y() {
        return this.description;
    }

    public class00392 N(class03556<class03252> class035562) {
        return this.description.L().L(((class03252)((Object)class035562.N())).y().method_10866());
    }

    public class01894 N() {
        return this.assetId;
    }
}

