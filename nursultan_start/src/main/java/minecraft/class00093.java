/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 *  com.mojang.logging.LogUtils
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04942
 *  minecraft.class04968
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.gson.annotations.SerializedName;
import com.mojang.logging.LogUtils;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00114;
import minecraft.class04942;
import minecraft.class04968;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public final class class00093
extends Record
implements class04942 {
    @SerializedName(value="address")
    private final @Nullable String address;
    @SerializedName(value="resourcePackUrl")
    private final @Nullable String resourcePackUrl;
    @SerializedName(value="resourcePackHash")
    private final @Nullable String resourcePackHash;
    @SerializedName(value="sessionRegionData")
    private final @Nullable class00114 regionData;
    private static final Logger i = LogUtils.getLogger();
    private static final class00093 R = new class00093(null, null, null, null);

    @SerializedName(value="resourcePackHash")
    public @Nullable String L() {
        return this.resourcePackHash;
    }

    public class00093(@Nullable String string, @Nullable String string2, @Nullable String string3, @Nullable class00114 class001142) {
        this.address = string;
        this.resourcePackUrl = string2;
        this.resourcePackHash = string3;
        this.regionData = class001142;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00093.class, "address;resourcePackUrl;resourcePackHash;regionData", "address", "resourcePackUrl", "resourcePackHash", "regionData"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00093.class, "address;resourcePackUrl;resourcePackHash;regionData", "address", "resourcePackUrl", "resourcePackHash", "regionData"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00093.class, "address;resourcePackUrl;resourcePackHash;regionData", "address", "resourcePackUrl", "resourcePackHash", "regionData"}, this);
    }

    @SerializedName(value="sessionRegionData")
    public @Nullable class00114 u() {
        return this.regionData;
    }

    @SerializedName(value="resourcePackUrl")
    public @Nullable String y() {
        return this.resourcePackUrl;
    }

    public static class00093 N(class04968 class049682, String string) {
        try {
            class00093 class000932 = (class00093)class049682.N(string, class00093.class);
            if (class000932 == null) {
                i.error("Could not parse RealmsServerAddress: {}", (Object)string);
                return R;
            }
            return class000932;
        }
        catch (Exception exception) {
            i.error("Could not parse RealmsServerAddress", (Throwable)exception);
            return R;
        }
    }

    @SerializedName(value="address")
    public @Nullable String N() {
        return this.address;
    }
}

