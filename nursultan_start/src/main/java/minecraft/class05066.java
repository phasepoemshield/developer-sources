/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00390
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class01054
 *  minecraft.class01272
 *  minecraft.class01590
 *  minecraft.class02071
 *  minecraft.class04230
 *  minecraft.class05059
 *  minecraft.class05630
 *  minecraft.class05733
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class06601
 *  minecraft.class06613
 *  minecraft.class07583
 *  minecraft.class08394
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.resource.client.PackTooltipComponent
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import java.util.List;
import java.util.Optional;
import minecraft.class00390;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class01054;
import minecraft.class01272;
import minecraft.class01590;
import minecraft.class02071;
import minecraft.class04230;
import minecraft.class05059;
import minecraft.class05068;
import minecraft.class05096;
import minecraft.class05630;
import minecraft.class05733;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class06601;
import minecraft.class06613;
import minecraft.class07583;
import minecraft.class08394;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.resource.client.PackTooltipComponent;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(value=EnvType.CLIENT)
public class class05066
extends class05068
implements class07583 {
    private static final int i = 157;
    public static final int y = 32;
    private final class05059 R;
    protected final class06202 L;
    private final class01272 M;
    private final class02071 B;
    private final class04230 Z;
    final /* synthetic */ class05059 u;

    private boolean L() {
        return !this.M.B() || !this.M.Z();
    }

    public boolean M() {
        return this.u.method_25396().stream().anyMatch(class050682 -> class050682.N().equals(this.N()));
    }

    public class05066(class05059 class050592, class06202 class062022, class05059 class050593, class01272 class012722) {
        this.u = class050592;
        super(class050592);
        this.L = class062022;
        this.M = class012722;
        this.R = class050593;
        this.B = new class02071(class012722.u(), (class01590)class062022.i_3);
        this.Z = new class04230(class00390.N((class00392)class012722.M(), (class00405)class00405.N.N(-8355712)), (class01590)class062022.i_3);
        this.Z.y(2);
    }

    private void i() {
        if (this.M.b()) {
            this.M.W();
        }
    }

    private void u() {
        if (this.M.T()) {
            this.M.E();
        }
    }

    public void y() {
        if (this.M.P()) {
            this.R();
        } else if (this.M.s()) {
            this.M.U();
        }
    }

    private void N(class01054 class010542, int n, int n2, boolean bl, float f, CallbackInfo callbackInfo) {
        if (bl) {
            List var9;
            class00392 class003922 = null;
            boolean bl2 = false;
            if (this.B.method_25368() < ((class01590)this.L.i_3).N(this.B.method_25369().method_30937())) {
                class003922 = this.B.method_25369();
            }
            if ((var9 = ((class01590)this.L.i_3).L((class05936)this.Z.method_25369(), i - (this.u.method_44390() > 0 ? 6 : 0))).size() > 2) {
                bl2 = true;
            }
            if (class003922 != null || bl2) {
                class010542.N((class01590)this.L.i_3, List.of(), Optional.of(new PackTooltipComponent(Optional.ofNullable(class003922), bl2 ? Optional.of(var9) : Optional.empty())), n, n2);
            }
        }
    }

    @Override
    public String N() {
        return this.M.L();
    }

    public boolean method_25404(class06601 class066012) {
        if (class066012.u()) {
            this.y();
            return true;
        }
        if (class066012.W()) {
            if (class066012.B()) {
                this.u();
                return true;
            }
            if (class066012.Z()) {
                this.i();
                return true;
            }
        }
        return super.method_25404(class066012);
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        if (this.L()) {
            int n = (int)class066132.n() - this.method_73380();
            int n2 = (int)class066132.t() - this.method_73382();
            if (this.M.P() && this.N(n, n2, 32)) {
                this.R();
                return true;
            }
            if (this.M.s() && this.y(n, n2, 32)) {
                this.M.U();
                return true;
            }
            if (this.M.T() && this.u(n, n2, 32)) {
                this.M.E();
                return true;
            }
            if (this.M.b() && this.i(n, n2, 32)) {
                this.M.W();
                return true;
            }
        }
        return super.method_25402(class066132, bl);
    }

    private void R() {
        if (this.M.y().N()) {
            this.M.z();
        } else {
            class00392 class003922 = this.M.y().L();
            this.L.N((class05096)new class05733(bl -> {
                this.L.N((class05096)this.R.U);
                if (bl) {
                    this.M.z();
                }
            }, class05059.z, class003922));
        }
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        int n3;
        int n4;
        if (!this.M.y().N()) {
            n4 = this.method_73380() - 1;
            n3 = this.method_73382() - 1;
            int n5 = this.method_73389() + 1;
            int n6 = this.method_73386() + 1;
            class010542.N(n4, n3, n5, n6, -8978432);
        }
        class010542.N(class08394.Na, this.M.N(), this.method_73380(), this.method_73382(), 0.0f, 0.0f, 32, 32, 32, 32);
        if (!this.B.method_25369().equals((Object)this.M.u())) {
            this.B.method_25355(this.M.u());
        }
        if (!this.Z.method_25369().method_10851().equals((Object)this.M.M().method_10851())) {
            this.Z.method_25355(class00390.N((class00392)this.M.M(), (class00405)class00405.N.N(-8355712)));
        }
        if (this.L() && (((Boolean)((class05630)this.L.i_7).Nm().method_41753()).booleanValue() || bl || this.R.method_25334() == this && this.R.method_25370())) {
            class010542.N(this.method_73380(), this.method_73382(), this.method_73380() + 32, this.method_73382() + 32, -1601138544);
            n4 = n - this.method_73380();
            n3 = n2 - this.method_73382();
            if (!this.M.y().N()) {
                this.B.method_25355(class05059.Z);
                this.Z.method_25355(this.M.y().y());
            }
            if (this.M.P()) {
                if (this.N(n4, n3, 32)) {
                    class010542.N(class08394.Na, class05059.N, this.method_73380(), this.method_73382(), 32, 32);
                    class05059.N((class05059)this.u, (class01054)class010542);
                } else {
                    class010542.N(class08394.Na, class05059.y, this.method_73380(), this.method_73382(), 32, 32);
                }
            } else {
                if (this.M.s()) {
                    if (this.y(n4, n3, 32)) {
                        class010542.N(class08394.Na, class05059.L, this.method_73380(), this.method_73382(), 32, 32);
                        class05059.y((class05059)this.u, (class01054)class010542);
                    } else {
                        class010542.N(class08394.Na, class05059.u, this.method_73380(), this.method_73382(), 32, 32);
                    }
                }
                if (this.M.T()) {
                    if (this.u(n4, n3, 32)) {
                        class010542.N(class08394.Na, class05059.i, this.method_73380(), this.method_73382(), 32, 32);
                        class05059.L((class05059)this.u, (class01054)class010542);
                    } else {
                        class010542.N(class08394.Na, class05059.R, this.method_73380(), this.method_73382(), 32, 32);
                    }
                }
                if (this.M.b()) {
                    if (this.i(n4, n3, 32)) {
                        class010542.N(class08394.Na, class05059.M, this.method_73380(), this.method_73382(), 32, 32);
                        class05059.u((class05059)this.u, (class01054)class010542);
                    } else {
                        class010542.N(class08394.Na, class05059.B, this.method_73380(), this.method_73382(), 32, 32);
                    }
                }
            }
        }
        this.B.N(157 - (class05059.y((class05059)this.u) ? 6 : 0));
        this.B.y(this.method_73380() + 32 + 2, this.method_73382() + 1);
        this.B.method_25394(class010542, n, n2, f);
        this.Z.N(157 - (class05059.L((class05059)this.u) ? 6 : 0));
        this.Z.y(this.method_73380() + 32 + 2, this.method_73382() + 12);
        this.Z.method_25394(class010542, n, n2, f);
        this.N(class010542, n, n2, bl, f, null);
    }

    public class00392 method_37006() {
        return class00392.N((String)"narrator.select", (Object[])new Object[]{this.M.u()});
    }
}

