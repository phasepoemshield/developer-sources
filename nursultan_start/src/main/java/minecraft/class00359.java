/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01140
 *  minecraft.class07949
 *  minecraft.class08097
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00331;
import minecraft.class01140;
import minecraft.class07949;
import minecraft.class08097;

public final class class00359
extends Record
implements class00331 {
    private final class01140 entityModelSet;
    private final class08097 materials;
    private final class07949 playerSkinRenderCache;

    @Override
    public class08097 L() {
        return this.materials;
    }

    public class00359(class01140 class011402, class08097 class080972, class07949 class079492) {
        this.entityModelSet = class011402;
        this.materials = class080972;
        this.playerSkinRenderCache = class079492;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00359.class, "entityModelSet;materials;playerSkinRenderCache", "entityModelSet", "materials", "playerSkinRenderCache"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00359.class, "entityModelSet;materials;playerSkinRenderCache", "entityModelSet", "materials", "playerSkinRenderCache"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00359.class, "entityModelSet;materials;playerSkinRenderCache", "entityModelSet", "materials", "playerSkinRenderCache"}, this);
    }

    @Override
    public class07949 u() {
        return this.playerSkinRenderCache;
    }

    @Override
    public class01140 y() {
        return this.entityModelSet;
    }
}

