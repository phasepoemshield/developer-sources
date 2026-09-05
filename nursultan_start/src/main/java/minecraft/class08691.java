/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11647
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 *  minecraft.class03254
 *  minecraft.class05946
 */
package minecraft;

import Nursultan.class11647;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01894;
import minecraft.class03254;
import minecraft.class05946;
import minecraft.class08719;

final class class08691
extends Record {
    private final class03254 trim;
    private final class08719 layerType;
    private final class05946<class11647> equipmentAssetId;

    public class08719 L() {
        return this.layerType;
    }

    class08691(class03254 class032542, class08719 class087192, class05946<class11647> class059462) {
        this.trim = class032542;
        this.layerType = class087192;
        this.equipmentAssetId = class059462;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08691.class, "trim;layerType;equipmentAssetId", "trim", "layerType", "equipmentAssetId"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08691.class, "trim;layerType;equipmentAssetId", "trim", "layerType", "equipmentAssetId"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08691.class, "trim;layerType;equipmentAssetId", "trim", "layerType", "equipmentAssetId"}, this);
    }

    public class05946<class11647> u() {
        return this.equipmentAssetId;
    }

    public class03254 y() {
        return this.trim;
    }

    public class01894 N() {
        return this.trim.N(this.layerType.N(), this.equipmentAssetId);
    }
}

