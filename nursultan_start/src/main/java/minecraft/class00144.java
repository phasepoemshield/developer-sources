/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00500
 *  minecraft.class01140
 *  minecraft.class08836
 *  minecraft.class08887
 *  minecraft.class08890
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import minecraft.class00500;
import minecraft.class01140;
import minecraft.class08836;
import minecraft.class08887;
import minecraft.class08890;

final class class00144
extends Record {
    final class08890 bakedModels;
    final Object2IntMap<class00500> modelGroups;
    final Map<class00500, class08887> modelCache;
    final class01140 entityModelSet;
    final class08836 specialBlockModelRenderer;

    public Map<class00500, class08887> L() {
        return this.modelCache;
    }

    class00144(class08890 class088902, Object2IntMap<class00500> object2IntMap, Map<class00500, class08887> map, class01140 class011402, class08836 class088362) {
        this.bakedModels = class088902;
        this.modelGroups = object2IntMap;
        this.modelCache = map;
        this.entityModelSet = class011402;
        this.specialBlockModelRenderer = class088362;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00144.class, "bakedModels;modelGroups;modelCache;entityModelSet;specialBlockModelRenderer", "bakedModels", "modelGroups", "modelCache", "entityModelSet", "specialBlockModelRenderer"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00144.class, "bakedModels;modelGroups;modelCache;entityModelSet;specialBlockModelRenderer", "bakedModels", "modelGroups", "modelCache", "entityModelSet", "specialBlockModelRenderer"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00144.class, "bakedModels;modelGroups;modelCache;entityModelSet;specialBlockModelRenderer", "bakedModels", "modelGroups", "modelCache", "entityModelSet", "specialBlockModelRenderer"}, this);
    }

    public class08836 i() {
        return this.specialBlockModelRenderer;
    }

    public class01140 u() {
        return this.entityModelSet;
    }

    public Object2IntMap<class00500> y() {
        return this.modelGroups;
    }

    public class08890 N() {
        return this.bakedModels;
    }
}

