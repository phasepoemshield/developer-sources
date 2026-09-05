/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01248
 *  minecraft.class02003
 *  minecraft.class02969
 *  minecraft.class05081
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01248;
import minecraft.class02003;
import minecraft.class02969;
import minecraft.class03554;
import minecraft.class05081;

public final class class03531
extends Record
implements AutoCloseable {
    private final class03554 resourceManager;
    private final class01248 dataPackResources;
    private final class02003<class02969> registries;
    private final class05081 worldData;

    public class02003<class02969> L() {
        return this.registries;
    }

    public class03531(class03554 class035542, class01248 class012482, class02003<class02969> class020032, class05081 class050812) {
        this.resourceManager = class035542;
        this.dataPackResources = class012482;
        this.registries = class020032;
        this.worldData = class050812;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03531.class, "resourceManager;dataPackResources;registries;worldData", "resourceManager", "dataPackResources", "registries", "worldData"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03531.class, "resourceManager;dataPackResources;registries;worldData", "resourceManager", "dataPackResources", "registries", "worldData"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03531.class, "resourceManager;dataPackResources;registries;worldData", "resourceManager", "dataPackResources", "registries", "worldData"}, this);
    }

    @Override
    public void close() {
        this.resourceManager.close();
    }

    public class05081 u() {
        return this.worldData;
    }

    public class01248 y() {
        return this.dataPackResources;
    }

    public class03554 N() {
        return this.resourceManager;
    }
}

