/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.viaversion.viafabricplus.visuals.features.r1_7_tab_list_style.LegacyTabList
 *  com.viaversion.viafabricplus.visuals.injection.access.r1_7_tab_list_tyle.IPlayerInfo
 *  minecraft.class00392
 *  minecraft.class00502
 *  minecraft.class01631
 *  minecraft.class02027
 *  minecraft.class03072
 *  minecraft.class04470
 *  minecraft.class06202
 *  minecraft.class07282
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.authlib.GameProfile;
import com.viaversion.viafabricplus.visuals.features.r1_7_tab_list_style.LegacyTabList;
import com.viaversion.viafabricplus.visuals.injection.access.r1_7_tab_list_tyle.IPlayerInfo;
import java.util.function.Supplier;
import minecraft.class00392;
import minecraft.class00502;
import minecraft.class01631;
import minecraft.class02027;
import minecraft.class03072;
import minecraft.class03448;
import minecraft.class04470;
import minecraft.class06202;
import minecraft.class07282;
import org.jspecify.annotations.Nullable;

public class class03458
implements IPlayerInfo {
    private final GameProfile N;
    private @Nullable Supplier<class01631> y;
    private class07282 L;
    private int u;
    private @Nullable class00392 i;
    private boolean R = true;
    private @Nullable class02027 M;
    private class03072 B;
    private int Z;
    private final int z = LegacyTabList.globalTablistIndex++;

    public class03072 L() {
        return this.B;
    }

    private static class03072 L(boolean bl) {
        return bl ? class03072.L : class03072.y;
    }

    public class01631 M() {
        if (this.y == null) {
            this.y = class03458.N(this.N);
        }
        return this.y.get();
    }

    public class03458(GameProfile gameProfile, boolean bl) {
        this.L = class07282.field_28045;
        this.N = gameProfile;
        this.B = class03458.L(bl);
    }

    public @Nullable class00502 B() {
        return ((class03448)((Object)class06202.Nq().T_3)).method_8428().i(this.N().name());
    }

    public @Nullable class00392 Z() {
        return this.i;
    }

    public class07282 i() {
        return this.L;
    }

    public int U() {
        return this.Z;
    }

    public boolean z() {
        return this.R;
    }

    public boolean u() {
        return this.M != null;
    }

    public void y(boolean bl) {
        this.R = bl;
    }

    public @Nullable class02027 y() {
        return this.M;
    }

    public void y(int n) {
        this.Z = n;
    }

    private static Supplier<class01631> N(GameProfile gameProfile) {
        class06202 class062022 = class06202.Nq();
        boolean bl = !class062022.y(gameProfile.id());
        return class062022.yP().N(gameProfile, bl);
    }

    public GameProfile N() {
        return this.N;
    }

    protected void N(class07282 class072822) {
        this.L = class072822;
    }

    protected void N(int n) {
        this.u = n;
    }

    protected void N(boolean bl) {
        this.M = null;
        this.B = class03458.L(bl);
    }

    protected void N(class02027 class020272) {
        this.M = class020272;
        this.B = class020272.N(class04470.y);
    }

    public void N(@Nullable class00392 class003922) {
        this.i = class003922;
    }

    public int R() {
        return this.u;
    }

    public int viaFabricPlusVisuals$getIndex() {
        return this.z;
    }
}

