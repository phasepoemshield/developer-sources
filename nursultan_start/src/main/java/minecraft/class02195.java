/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class03556
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class05946
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01894;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class03556;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class05946;

public final class class02195
extends Record {
    private final class01894 assetId;
    private final boolean showOnItemFrame;
    private final int mapColor;
    private final boolean explorationMapElement;
    private final boolean trackCount;
    public static final int N = -1;
    public static final Codec<class03556<class02195>> y = class04206.NT.b();
    public static final class02362<class04247, class03556<class02195>> L = class02389.y((class05946)class04227.r);

    public boolean L() {
        return this.showOnItemFrame;
    }

    public class02195(class01894 class018942, boolean bl, int n, boolean bl2, boolean bl3) {
        this.assetId = class018942;
        this.showOnItemFrame = bl;
        this.mapColor = n;
        this.explorationMapElement = bl2;
        this.trackCount = bl3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02195.class, "assetId;showOnItemFrame;mapColor;explorationMapElement;trackCount", "assetId", "showOnItemFrame", "mapColor", "explorationMapElement", "trackCount"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02195.class, "assetId;showOnItemFrame;mapColor;explorationMapElement;trackCount", "assetId", "showOnItemFrame", "mapColor", "explorationMapElement", "trackCount"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02195.class, "assetId;showOnItemFrame;mapColor;explorationMapElement;trackCount", "assetId", "showOnItemFrame", "mapColor", "explorationMapElement", "trackCount"}, this);
    }

    public boolean i() {
        return this.explorationMapElement;
    }

    public int u() {
        return this.mapColor;
    }

    public class01894 y() {
        return this.assetId;
    }

    public boolean N() {
        return this.mapColor != -1;
    }

    public boolean R() {
        return this.trackCount;
    }
}

