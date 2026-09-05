/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  minecraft.class00392
 *  minecraft.class02048
 *  minecraft.class07282
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.authlib.GameProfile;
import java.util.UUID;
import minecraft.class00392;
import minecraft.class02048;
import minecraft.class06669;
import minecraft.class07282;
import org.jspecify.annotations.Nullable;

class class06641 {
    final UUID N;
    @Nullable GameProfile y;
    boolean L;
    int u;
    class07282 i = class07282.field_28045;
    @Nullable class00392 R;
    boolean M;
    int B;
    @Nullable class02048 Z;

    class06641(UUID uUID) {
        this.N = uUID;
    }

    class06669 N() {
        return new class06669(this.N, this.y, this.L, this.u, this.i, this.R, this.M, this.B, this.Z);
    }
}

