/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.JsonAdapter
 *  com.google.gson.annotations.SerializedName
 *  com.mojang.util.UUIDTypeAdapter
 *  minecraft.class04942
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.mojang.util.UUIDTypeAdapter;
import java.util.UUID;
import minecraft.class04942;
import org.jspecify.annotations.Nullable;

public class class06727
implements class04942 {
    @SerializedName(value="name")
    public @Nullable String N;
    @SerializedName(value="uuid")
    @JsonAdapter(value=UUIDTypeAdapter.class)
    public @Nullable UUID y;
}

