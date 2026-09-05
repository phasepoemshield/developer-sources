/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01134
 *  minecraft.class01140
 *  minecraft.class01590
 *  minecraft.class01686
 *  minecraft.class01781
 *  minecraft.class01999
 *  minecraft.class02862
 *  minecraft.class03579
 *  minecraft.class07949
 *  minecraft.class08097
 *  minecraft.class08943
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01134;
import minecraft.class01140;
import minecraft.class01590;
import minecraft.class01686;
import minecraft.class01781;
import minecraft.class01999;
import minecraft.class02862;
import minecraft.class03579;
import minecraft.class07949;
import minecraft.class08097;
import minecraft.class08943;

public final class class04811
extends Record {
    private final class03579 blockEntityRenderDispatcher;
    private final class01999 blockRenderDispatcher;
    private final class08943 itemModelResolver;
    private final class02862 itemRenderer;
    private final class01781 entityRenderer;
    private final class01140 entityModelSet;
    private final class01590 font;
    private final class08097 materials;
    private final class07949 playerSkinRenderCache;

    public class08943 L() {
        return this.itemModelResolver;
    }

    public class01590 M() {
        return this.font;
    }

    public class04811(class03579 class035792, class01999 class019992, class08943 class089432, class02862 class028622, class01781 class017812, class01140 class011402, class01590 class015902, class08097 class080972, class07949 class079492) {
        this.blockEntityRenderDispatcher = class035792;
        this.blockRenderDispatcher = class019992;
        this.itemModelResolver = class089432;
        this.itemRenderer = class028622;
        this.entityRenderer = class017812;
        this.entityModelSet = class011402;
        this.font = class015902;
        this.materials = class080972;
        this.playerSkinRenderCache = class079492;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04811.class, "blockEntityRenderDispatcher;blockRenderDispatcher;itemModelResolver;itemRenderer;entityRenderer;entityModelSet;font;materials;playerSkinRenderCache", "blockEntityRenderDispatcher", "blockRenderDispatcher", "itemModelResolver", "itemRenderer", "entityRenderer", "entityModelSet", "font", "materials", "playerSkinRenderCache"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04811.class, "blockEntityRenderDispatcher;blockRenderDispatcher;itemModelResolver;itemRenderer;entityRenderer;entityModelSet;font;materials;playerSkinRenderCache", "blockEntityRenderDispatcher", "blockRenderDispatcher", "itemModelResolver", "itemRenderer", "entityRenderer", "entityModelSet", "font", "materials", "playerSkinRenderCache"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04811.class, "blockEntityRenderDispatcher;blockRenderDispatcher;itemModelResolver;itemRenderer;entityRenderer;entityModelSet;font;materials;playerSkinRenderCache", "blockEntityRenderDispatcher", "blockRenderDispatcher", "itemModelResolver", "itemRenderer", "entityRenderer", "entityModelSet", "font", "materials", "playerSkinRenderCache"}, this);
    }

    public class08097 B() {
        return this.materials;
    }

    public class07949 Z() {
        return this.playerSkinRenderCache;
    }

    public class01781 i() {
        return this.entityRenderer;
    }

    public class02862 u() {
        return this.itemRenderer;
    }

    public class01999 y() {
        return this.blockRenderDispatcher;
    }

    public class03579 N() {
        return this.blockEntityRenderDispatcher;
    }

    public class01686 N(class01134 class011342) {
        return this.entityModelSet.N(class011342);
    }

    public class01140 R() {
        return this.entityModelSet;
    }
}

