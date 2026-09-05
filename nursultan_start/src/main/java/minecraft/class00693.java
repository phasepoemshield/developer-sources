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
 *  minecraft.class01894
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class03539
 *  minecraft.class03556
 *  minecraft.class03748
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class05946
 *  minecraft.class06338
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00392;
import minecraft.class01894;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class03539;
import minecraft.class03556;
import minecraft.class03748;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class05946;
import minecraft.class06338;

public final class class00693
extends Record {
    private final int width;
    private final int height;
    private final class01894 assetId;
    private final Optional<class00392> title;
    private final Optional<class00392> author;
    public static final Codec<class00693> N = RecordCodecBuilder.create(instance -> instance.group((App)class06338.N((int)1, (int)16).fieldOf("width").forGetter(class00693::y), (App)class06338.N((int)1, (int)16).fieldOf("height").forGetter(class00693::L), (App)class01894.N.fieldOf("asset_id").forGetter(class00693::u), (App)class03748.N.optionalFieldOf("title").forGetter(class00693::i), (App)class03748.N.optionalFieldOf("author").forGetter(class00693::R)).apply(instance, class00693::new));
    public static final class02362<class04247, class00693> y = class02362.N((class02362)class02389.B, class00693::y, (class02362)class02389.B, class00693::L, (class02362)class01894.y, class00693::u, (class02362)class03748.i, class00693::i, (class02362)class03748.i, class00693::R, class00693::new);
    public static final Codec<class03556<class00693>> L = class03539.N((class05946)class04227.ym);
    public static final class02362<class04247, class03556<class00693>> u = class02389.N((class05946)class04227.ym, y);

    public int L() {
        return this.height;
    }

    public class00693(int n, int n2, class01894 class018942, Optional<class00392> optional, Optional<class00392> optional2) {
        this.width = n;
        this.height = n2;
        this.assetId = class018942;
        this.title = optional;
        this.author = optional2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00693.class, "width;height;assetId;title;author", "width", "height", "assetId", "title", "author"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00693.class, "width;height;assetId;title;author", "width", "height", "assetId", "title", "author"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00693.class, "width;height;assetId;title;author", "width", "height", "assetId", "title", "author"}, this);
    }

    public Optional<class00392> i() {
        return this.title;
    }

    public class01894 u() {
        return this.assetId;
    }

    public int y() {
        return this.width;
    }

    public int N() {
        return this.y() * this.L();
    }

    public Optional<class00392> R() {
        return this.author;
    }
}

