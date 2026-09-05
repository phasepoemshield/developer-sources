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
import minecraft.class04942;

public final class class00064
extends Record
implements class04942 {
    @SerializedName(value="name")
    private final String name;
    @SerializedName(value="value")
    private final String value;

    public class00064(String string, String string2) {
        this.name = string;
        this.value = string2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00064.class, "name;value", "name", "value"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00064.class, "name;value", "name", "value"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00064.class, "name;value", "name", "value"}, this);
    }

    @SerializedName(value="value")
    public String y() {
        return this.value;
    }

    public static boolean N(List<class00064> list) {
        for (class00064 class000642 : list) {
            if (!class000642.N().equals("hardcore")) continue;
            return Boolean.parseBoolean(class000642.y());
        }
        return false;
    }

    @SerializedName(value="name")
    public String N() {
        return this.name;
    }

    public static class00064 N(boolean bl) {
        return new class00064("hardcore", Boolean.toString(bl));
    }
}

