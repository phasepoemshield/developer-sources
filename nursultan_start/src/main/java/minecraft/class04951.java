/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04942
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.gson.annotations.SerializedName;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class04942;
import org.jspecify.annotations.Nullable;

public final class class04951
extends Record
implements class04942 {
    @SerializedName(value="name")
    private final @Nullable String name;
    @SerializedName(value="description")
    private final String description;

    public class04951(@Nullable String string, String string2) {
        this.name = string;
        this.description = string2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04951.class, "name;description", "name", "description"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04951.class, "name;description", "name", "description"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04951.class, "name;description", "name", "description"}, this);
    }

    @SerializedName(value="description")
    public String y() {
        return this.description;
    }

    @SerializedName(value="name")
    public @Nullable String N() {
        return this.name;
    }
}

