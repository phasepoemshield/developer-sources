/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04942
 */
package minecraft;

import com.google.gson.annotations.SerializedName;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class00065;
import minecraft.class04942;

public final class class00053
extends Record
implements class04942 {
    @SerializedName(value="regionDataList")
    private final List<class00065> regionData;

    public class00053(List<class00065> list) {
        this.regionData = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00053.class, "regionData", "regionData"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00053.class, "regionData", "regionData"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00053.class, "regionData", "regionData"}, this);
    }

    @SerializedName(value="regionDataList")
    public List<class00065> y() {
        return this.regionData;
    }

    public static class00053 N() {
        return new class00053(List.of());
    }
}

