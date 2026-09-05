/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01281
 *  minecraft.class01894
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class03556
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
import minecraft.class01281;
import minecraft.class01894;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class05946;

public final class class00412
extends Record {
    private final class01894 assetId;
    private final String translationKey;
    public static final Codec<class00412> N = RecordCodecBuilder.create(instance -> instance.group((App)class01894.N.fieldOf("asset_id").forGetter(class00412::N), (App)Codec.STRING.fieldOf("translation_key").forGetter(class00412::y)).apply(instance, class00412::new));
    public static final class02362<class04247, class00412> y = class02362.N((class02362)class01894.y, class00412::N, (class02362)class02389.s, class00412::y, class00412::new);
    public static final Codec<class03556<class00412>> L = class01281.N((class05946)class04227.NF, N);
    public static final class02362<class04247, class03556<class00412>> u = class02389.N((class05946)class04227.NF, y);

    public class00412(class01894 class018942, String string) {
        this.assetId = class018942;
        this.translationKey = string;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00412.class, "assetId;translationKey", "assetId", "translationKey"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00412.class, "assetId;translationKey", "assetId", "translationKey"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00412.class, "assetId;translationKey", "assetId", "translationKey"}, this);
    }

    public String y() {
        return this.translationKey;
    }

    public class01894 N() {
        return this.assetId;
    }
}

