/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.JsonAdapter
 *  com.google.gson.annotations.SerializedName
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04942
 */
package minecraft;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00047;
import minecraft.class00054;
import minecraft.class00073;
import minecraft.class00082;
import minecraft.class04942;

public final class class00065
extends Record
implements class04942 {
    @SerializedName(value="regionName")
    @JsonAdapter(value=class00054.class)
    private final class00082 region;
    @SerializedName(value="serviceQuality")
    @JsonAdapter(value=class00047.class)
    private final class00073 serviceQuality;

    public class00065(class00082 class000822, class00073 class000732) {
        this.region = class000822;
        this.serviceQuality = class000732;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00065.class, "region;serviceQuality", "region", "serviceQuality"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00065.class, "region;serviceQuality", "region", "serviceQuality"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00065.class, "region;serviceQuality", "region", "serviceQuality"}, this);
    }

    @SerializedName(value="serviceQuality")
    public class00073 y() {
        return this.serviceQuality;
    }

    @SerializedName(value="regionName")
    public class00082 N() {
        return this.region;
    }
}

