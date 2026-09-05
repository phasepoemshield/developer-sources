/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00203
 *  minecraft.class00331
 *  minecraft.class01140
 *  minecraft.class02028
 *  minecraft.class07949
 *  minecraft.class08097
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00203;
import minecraft.class00331;
import minecraft.class01140;
import minecraft.class02028;
import minecraft.class07949;
import minecraft.class08097;
import minecraft.class08910;
import org.jspecify.annotations.Nullable;

public final class class08905
extends Record
implements class00331 {
    private final class02028 blockModelBaker;
    private final class01140 entityModelSet;
    private final class08097 materials;
    private final class07949 playerSkinRenderCache;
    private final class08910 missingItemModel;
    private final @Nullable class00203 contextSwapper;

    public class08097 L() {
        return this.materials;
    }

    public class08905(class02028 class020282, class01140 class011402, class08097 class080972, class07949 class079492, class08910 class089102, @Nullable class00203 class002032) {
        this.blockModelBaker = class020282;
        this.entityModelSet = class011402;
        this.materials = class080972;
        this.playerSkinRenderCache = class079492;
        this.missingItemModel = class089102;
        this.contextSwapper = class002032;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08905.class, "blockModelBaker;entityModelSet;materials;playerSkinRenderCache;missingItemModel;contextSwapper", "blockModelBaker", "entityModelSet", "materials", "playerSkinRenderCache", "missingItemModel", "contextSwapper"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08905.class, "blockModelBaker;entityModelSet;materials;playerSkinRenderCache;missingItemModel;contextSwapper", "blockModelBaker", "entityModelSet", "materials", "playerSkinRenderCache", "missingItemModel", "contextSwapper"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08905.class, "blockModelBaker;entityModelSet;materials;playerSkinRenderCache;missingItemModel;contextSwapper", "blockModelBaker", "entityModelSet", "materials", "playerSkinRenderCache", "missingItemModel", "contextSwapper"}, this);
    }

    public class08910 i() {
        return this.missingItemModel;
    }

    public class07949 u() {
        return this.playerSkinRenderCache;
    }

    public class01140 y() {
        return this.entityModelSet;
    }

    public class02028 N() {
        return this.blockModelBaker;
    }

    public @Nullable class00203 R() {
        return this.contextSwapper;
    }
}

