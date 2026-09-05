/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.JsonAdapter
 *  com.google.gson.annotations.SerializedName
 *  minecraft.class04942
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import minecraft.class00045;
import minecraft.class00050;
import minecraft.class00054;
import minecraft.class00082;
import minecraft.class04942;
import org.jspecify.annotations.Nullable;

public class class00081
implements class04942 {
    public static final class00081 N = new class00081(class00050.field_60226, null);
    @SerializedName(value="regionSelectionPreference")
    @JsonAdapter(value=class00045.class)
    public final class00050 y;
    @SerializedName(value="preferredRegion")
    @JsonAdapter(value=class00054.class)
    public @Nullable class00082 L;

    public class00081(class00050 class000502, @Nullable class00082 class000822) {
        this.y = class000502;
        this.L = class000822;
    }

    public class00081 N() {
        return new class00081(this.y, this.L);
    }
}

