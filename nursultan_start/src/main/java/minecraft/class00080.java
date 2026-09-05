/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04942
 *  minecraft.class04951
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.gson.annotations.SerializedName;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class00064;
import minecraft.class00070;
import minecraft.class00081;
import minecraft.class04942;
import minecraft.class04951;
import org.jspecify.annotations.Nullable;

public final class class00080
extends Record
implements class04942 {
    @SerializedName(value="options")
    private final class00070 options;
    @SerializedName(value="settings")
    private final List<class00064> settings;
    @SerializedName(value="regionSelectionPreference")
    private final @Nullable class00081 regionSelectionPreference;
    @SerializedName(value="description")
    private final @Nullable class04951 description;

    @SerializedName(value="regionSelectionPreference")
    public @Nullable class00081 L() {
        return this.regionSelectionPreference;
    }

    public class00080(class00070 class000702, List<class00064> list, @Nullable class00081 class000812, @Nullable class04951 class049512) {
        this.options = class000702;
        this.settings = list;
        this.regionSelectionPreference = class000812;
        this.description = class049512;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00080.class, "options;settings;regionSelectionPreference;description", "options", "settings", "regionSelectionPreference", "description"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00080.class, "options;settings;regionSelectionPreference;description", "options", "settings", "regionSelectionPreference", "description"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00080.class, "options;settings;regionSelectionPreference;description", "options", "settings", "regionSelectionPreference", "description"}, this);
    }

    @SerializedName(value="description")
    public @Nullable class04951 u() {
        return this.description;
    }

    @SerializedName(value="settings")
    public List<class00064> y() {
        return this.settings;
    }

    @SerializedName(value="options")
    public class00070 N() {
        return this.options;
    }
}

