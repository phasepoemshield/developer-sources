/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  minecraft.class01631
 *  minecraft.class01653
 *  minecraft.class01894
 *  minecraft.class03504
 *  minecraft.class07311
 *  minecraft.class07949
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.authlib.GameProfile;
import com.mojang.blaze3d.textures.GpuTextureView;
import minecraft.class01631;
import minecraft.class01653;
import minecraft.class01894;
import minecraft.class03504;
import minecraft.class07311;
import minecraft.class07949;
import org.jspecify.annotations.Nullable;

public final class class07923 {
    private final GameProfile y;
    private final class01631 L;
    private @Nullable class07311 u;
    private @Nullable GpuTextureView i;
    private @Nullable class03504 R;
    final /* synthetic */ class07949 N;

    public class07311 L() {
        if (this.u == null) {
            this.u = class07949.N((class01631)this.L);
        }
        return this.u;
    }

    public class07923(class07949 class079492, GameProfile gameProfile, class01631 class016312, class01653 class016532) {
        this.N = class079492;
        this.y = gameProfile;
        this.L = class016312.N(class016532);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof class07923)) return false;
        class07923 class079232 = (class07923)object;
        if (!this.y.equals((Object)class079232.y)) return false;
        if (!this.L.equals((Object)class079232.L)) return false;
        return true;
    }

    public int hashCode() {
        int n = 1;
        n = 31 * n + this.y.hashCode();
        n = 31 * n + this.L.hashCode();
        return n;
    }

    public class03504 i() {
        if (this.R == null) {
            this.R = class03504.y((class01894)this.L.N().y());
        }
        return this.R;
    }

    public GpuTextureView u() {
        if (this.i == null) {
            this.i = this.N.L.y(this.L.N().y()).method_71659();
        }
        return this.i;
    }

    public class01631 y() {
        return this.L;
    }

    public GameProfile N() {
        return this.y;
    }
}

