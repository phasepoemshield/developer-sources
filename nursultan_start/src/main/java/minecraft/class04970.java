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
import java.util.Locale;
import minecraft.class04942;

public final class class04970
extends Record
implements class04942 {
    @SerializedName(value="regionName")
    private final String regionName;
    @SerializedName(value="ping")
    private final int ping;

    public class04970(String string, int n) {
        this.regionName = string;
        this.ping = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04970.class, "regionName;ping", "regionName", "ping"}, this, object);
    }

    public String toString() {
        return String.format(Locale.ROOT, "%s --> %.2f ms", this.regionName, Float.valueOf(this.ping));
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04970.class, "regionName;ping", "regionName", "ping"}, this);
    }

    @SerializedName(value="ping")
    public int y() {
        return this.ping;
    }

    @SerializedName(value="regionName")
    public String N() {
        return this.regionName;
    }
}

