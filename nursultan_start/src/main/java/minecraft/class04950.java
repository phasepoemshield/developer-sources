/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.JsonAdapter
 *  com.google.gson.annotations.SerializedName
 *  com.mojang.util.UUIDTypeAdapter
 *  minecraft.class04942
 *  minecraft.class05105
 */
package minecraft;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.mojang.util.UUIDTypeAdapter;
import java.util.UUID;
import minecraft.class04942;
import minecraft.class05105;

public class class04950
extends class05105
implements class04942 {
    @SerializedName(value="name")
    public final String N;
    @SerializedName(value="uuid")
    @JsonAdapter(value=UUIDTypeAdapter.class)
    public final UUID y;
    @SerializedName(value="operator")
    public boolean L;
    @SerializedName(value="accepted")
    public final boolean u;
    @SerializedName(value="online")
    public final boolean i;

    public class04950(String string, UUID uUID, boolean bl, boolean bl2, boolean bl3) {
        this.N = string;
        this.y = uUID;
        this.L = bl;
        this.u = bl2;
        this.i = bl3;
    }
}

