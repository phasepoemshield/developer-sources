/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10402
 *  com.mojang.authlib.GameProfile
 *  minecraft.class00189
 *  minecraft.class00392
 *  minecraft.class00518
 *  minecraft.class01631
 *  minecraft.class01759
 *  minecraft.class01762
 *  minecraft.class01766
 *  minecraft.class01788
 *  minecraft.class01890
 *  minecraft.class03448
 *  minecraft.class03458
 *  minecraft.class04995
 *  minecraft.class05216
 *  minecraft.class05220
 *  minecraft.class05298
 *  minecraft.class06202
 *  minecraft.class06570
 *  minecraft.class06602
 *  minecraft.class06618
 *  minecraft.class06683
 *  minecraft.class07282
 *  minecraft.class07299
 *  minecraft.class07648
 *  minecraft.class08036
 *  org.jspecify.annotations.Nullable
 *  page.langeweile.ok_zoomer.config.ConfigEnums$SpyglassModes
 *  page.langeweile.ok_zoomer.config.OkZoomerConfigManager
 */
package minecraft;

import Nursultan.class10402;
import com.mojang.authlib.GameProfile;
import java.util.UUID;
import minecraft.class00189;
import minecraft.class00392;
import minecraft.class00518;
import minecraft.class01631;
import minecraft.class01759;
import minecraft.class01762;
import minecraft.class01766;
import minecraft.class01788;
import minecraft.class01890;
import minecraft.class03448;
import minecraft.class03458;
import minecraft.class04995;
import minecraft.class05216;
import minecraft.class05220;
import minecraft.class05298;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class06602;
import minecraft.class06618;
import minecraft.class06683;
import minecraft.class07282;
import minecraft.class07299;
import minecraft.class07648;
import minecraft.class08036;
import org.jspecify.annotations.Nullable;
import page.langeweile.ok_zoomer.config.ConfigEnums;
import page.langeweile.ok_zoomer.config.OkZoomerConfigManager;

public abstract class class04477
extends class08036
implements class06618 {
    private @Nullable class03458 N;
    private final boolean y;
    private final class06602 L = new class06602();

    public void method_5773() {
        this.L.N(this.method_73189(), this.method_18798());
        super.method_5773();
    }

    public void method_5842() {
        super.method_5842();
        this.B().y();
    }

    public class04477(class03448 class034482, GameProfile gameProfile) {
        super((class07299)class034482, gameProfile);
        this.y = "deadmau5".equals(this.method_7334().name());
    }

    public class06602 B() {
        return this.L;
    }

    public class01631 Z() {
        class03458 class034582 = this.E();
        return class034582 == null ? class00189.N((UUID)this.method_5667()) : class034582.M();
    }

    public boolean U() {
        return this.y;
    }

    public @Nullable class00392 z() {
        class06683 class066832 = this.method_73183().method_8428();
        class00518 class005182 = class066832.N(class01890.field_45158);
        if (class005182 != null) {
            class05216 class052162 = class01788.N((class01788)class066832.y((class01766)this, class005182), (class01762)class005182.N((class01762)class01759.y));
            return class00392.i().y((class00392)class052162).y(class05220.l).y(class005182.i());
        }
        return null;
    }

    public @Nullable class07648 y(boolean bl) {
        return (bl ? this.method_74136() : this.method_74137()).orElse(null);
    }

    protected @Nullable class03458 E() {
        if (this.N == null) {
            this.N = class06202.Nq().NE().N(this.method_5667());
        }
        return this.N;
    }

    public float N(boolean bl, float f) {
        float f2;
        float f3;
        float f4 = 1.0f;
        if (this.method_31549().y) {
            f4 *= 1.1f;
        }
        if ((f3 = this.method_31549().y()) != 0.0f) {
            f2 = (float)this.method_45325(class05298.l) / f3;
            f4 *= (f2 + 1.0f) / 2.0f;
        }
        if (this.method_6115()) {
            if (this.method_6030().N(class06570.sx)) {
                f2 = Math.min((float)this.method_6048() / 20.0f, 1.0f);
                f4 *= 1.0f - class04995.z((float)f2) * 0.15f;
            } else if (bl && this.N(this.method_31550())) {
                return 0.1f;
            }
        }
        return class04995.B((float)f, (float)1.0f, (float)f4);
    }

    private boolean N(boolean bl) {
        block3: {
            switch (class10402.N[((ConfigEnums.SpyglassModes)OkZoomerConfigManager.CONFIG.controls.spyglassMode.value()).ordinal()]) {
                case 1: 
                case 2: {
                    break;
                }
                default: {
                    break block3;
                }
            }
            return false;
        }
        return bl;
    }

    protected void N(float f) {
        this.L.N(f);
    }

    protected void W() {
        float f = !this.method_24828() || this.method_29504() || this.method_5681() ? 0.0f : Math.min(0.1f, (float)this.method_18798().Z());
        this.B().i(f);
    }

    public void method_6007() {
        this.W();
        super.method_6007();
    }

    public @Nullable class07282 method_68876() {
        class03458 class034582 = this.E();
        return class034582 != null ? class034582.i() : null;
    }
}

