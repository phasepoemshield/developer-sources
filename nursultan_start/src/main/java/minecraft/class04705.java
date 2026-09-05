/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.minecraft.BanDetails
 *  com.mojang.logging.LogUtils
 *  com.terraformersmc.modmenu.ModMenu
 *  com.terraformersmc.modmenu.config.ModMenuConfig
 *  com.terraformersmc.modmenu.config.ModMenuConfig$ModCountLocation
 *  com.terraformersmc.modmenu.config.ModMenuConfig$TitleMenuButtonStyle
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01858
 *  minecraft.class02088
 *  minecraft.class02566
 *  minecraft.class02796
 *  minecraft.class02966
 *  minecraft.class03240
 *  minecraft.class03510
 *  minecraft.class03577
 *  minecraft.class04141
 *  minecraft.class04402
 *  minecraft.class04654
 *  minecraft.class04703
 *  minecraft.class04995
 *  minecraft.class05096
 *  minecraft.class05205
 *  minecraft.class05213
 *  minecraft.class05220
 *  minecraft.class05304
 *  minecraft.class05336
 *  minecraft.class05361
 *  minecraft.class05362
 *  minecraft.class05630
 *  minecraft.class05685
 *  minecraft.class05716
 *  minecraft.class05733
 *  minecraft.class05934
 *  minecraft.class05936
 *  minecraft.class05964
 *  minecraft.class06002
 *  minecraft.class06132
 *  minecraft.class06202
 *  minecraft.class06279
 *  minecraft.class06613
 *  minecraft.class07529
 *  minecraft.class07536
 *  minecraft.class08392
 *  minecraft.class08627
 *  net.irisshaders.iris.Iris
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.mojang.authlib.minecraft.BanDetails;
import com.mojang.logging.LogUtils;
import com.terraformersmc.modmenu.ModMenu;
import com.terraformersmc.modmenu.config.ModMenuConfig;
import java.io.IOException;
import java.lang.invoke.LambdaMetafactory;
import java.util.Objects;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01858;
import minecraft.class02088;
import minecraft.class02566;
import minecraft.class02796;
import minecraft.class02966;
import minecraft.class03240;
import minecraft.class03510;
import minecraft.class03577;
import minecraft.class04141;
import minecraft.class04402;
import minecraft.class04654;
import minecraft.class04703;
import minecraft.class04777;
import minecraft.class04785;
import minecraft.class04995;
import minecraft.class05096;
import minecraft.class05205;
import minecraft.class05213;
import minecraft.class05220;
import minecraft.class05304;
import minecraft.class05336;
import minecraft.class05361;
import minecraft.class05362;
import minecraft.class05630;
import minecraft.class05685;
import minecraft.class05716;
import minecraft.class05733;
import minecraft.class05934;
import minecraft.class05936;
import minecraft.class05964;
import minecraft.class06002;
import minecraft.class06132;
import minecraft.class06202;
import minecraft.class06279;
import minecraft.class06613;
import minecraft.class07529;
import minecraft.class07536;
import minecraft.class08392;
import minecraft.class08627;
import net.irisshaders.iris.Iris;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class04705
extends class05096 {
    private static final Logger N = LogUtils.getLogger();
    private static final class00392 y = class00392.L((String)"narrator.screen.title");
    private static final class00392 L = class00392.L((String)"title.credits");
    private static final String u = "Demo_World";
    private @Nullable class03510 i;
    private @Nullable class04703 R;
    private boolean M;
    private long B;
    private final class02088 Z;
    private static boolean z;

    private /* synthetic */ void L(class05362 class053622) {
        class05304 class053042 = ((class05630)this.field_22787.i_7).v ? new class05304((class05096)this) : new class06002((class05096)this);
        this.field_22787.N((class05096)class053042);
    }

    private boolean L() {
        boolean bl;
        block8: {
            class04785 class047852 = this.field_22787.NL().i(u);
            try {
                bl = class047852.W();
                if (class047852 == null) break block8;
            }
            catch (Throwable throwable) {
                try {
                    if (class047852 != null) {
                        try {
                            class047852.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (IOException iOException) {
                    class06132.N((class06202)this.field_22787, (String)u);
                    N.warn("Failed to read demo world data", (Throwable)iOException);
                    return false;
                }
            }
            class047852.close();
        }
        return bl;
    }

    private int L(int n, int n2) {
        boolean bl = this.L();
        this.method_37063((class04654)class05362.method_46430((class00392)class00392.L((String)"menu.playdemo"), class053622 -> {
            if (bl) {
                this.field_22787.S().N(u, () -> this.field_22787.N((class05096)this));
            } else {
                this.field_22787.S().N(u, class02796.R, class05934.y, class05964::N, (class05096)this);
            }
        }).N(this.field_22789 / 2 - 100, n, 200, 20).N());
        ((class05362)this.method_37063((class04654)class05362.method_46430((class00392)class00392.L((String)"menu.resetdemo"), (class05361)(class05361)LambdaMetafactory.metafactory(null, null, null, (Lminecraft/class05362;)V, N(minecraft.class05362 ), (Lminecraft/class05362;)V)((class04705)this)).N((int)(this.field_22789 / 2 - 100), (int)v0, (int)200, (int)20).N())).field_22763 = bl;
        return n += n2;
    }

    public class04705() {
        this(false);
    }

    public class04705(boolean bl, @Nullable class02088 class020882) {
        super(y);
        this.M = bl;
        this.Z = Objects.requireNonNullElseGet(class020882, () -> new class02088(false));
    }

    public class04705(boolean bl) {
        this(bl, null);
    }

    private /* synthetic */ void y(class05362 class053622) {
        this.field_22787.N((class05096)new class05685((class05096)this));
    }

    private void y(CallbackInfo callbackInfo) {
        this.i = null;
    }

    private int y(int n, int n2) {
        this.method_37063((class04654)class05362.method_46430((class00392)class00392.L((String)"menu.singleplayer"), class053622 -> this.field_22787.N((class05096)new class05205((class05096)this))).N(this.field_22789 / 2 - 100, n, 200, 20).N());
        class00392 class003922 = this.y();
        boolean bl = class003922 == null;
        class04141 class041412 = class003922 != null ? class04141.N((class00392)class003922) : null;
        n += n2;
        ((class05362)this.method_37063((class04654)class05362.method_46430((class00392)class00392.L((String)"menu.multiplayer"), (class05361)(class05361)LambdaMetafactory.metafactory(null, null, null, (Lminecraft/class05362;)V, L(minecraft.class05362 ), (Lminecraft/class05362;)V)((class04705)this)).N((int)(this.field_22789 / 2 - 100), (int)v0, (int)200, (int)20).N((class04141)class041412).N())).field_22763 = bl;
        ((class05362)this.method_37063((class04654)class05362.method_46430((class00392)class00392.L((String)"menu.online"), (class05361)(class05361)LambdaMetafactory.metafactory(null, null, null, (Lminecraft/class05362;)V, y(minecraft.class05362 ), (Lminecraft/class05362;)V)((class04705)this)).N((int)(this.field_22789 / 2 - 100), (int)v1, (int)200, (int)20).N((class04141)class041412).N())).field_22763 = bl;
        return n += n2;
    }

    private @Nullable class00392 y() {
        if (this.field_22787.yM()) {
            return null;
        }
        if (this.field_22787.j()) {
            return class00392.L((String)"title.multiplayer.disabled.banned.name");
        }
        BanDetails banDetails = this.field_22787.Nv();
        if (banDetails != null) {
            if (banDetails.expires() != null) {
                return class00392.L((String)"title.multiplayer.disabled.banned.temporary");
            }
            return class00392.L((String)"title.multiplayer.disabled.banned.permanent");
        }
        return class00392.L((String)"title.multiplayer.disabled");
    }

    private String N(String string) {
        if (ModMenuConfig.MODIFY_TITLE_SCREEN.getValue() && ((ModMenuConfig.ModCountLocation)ModMenuConfig.MOD_COUNT_LOCATION.getValue()).isOnTitleScreen()) {
            Object object;
            String string2 = ModMenu.getDisplayedModCount();
            String string3 = "modmenu.mods." + string2;
            Object object2 = object = class08392.N((String)string3) ? string3 : "modmenu.mods.n";
            if (ModMenuConfig.EASTER_EGGS.getValue() && class08392.N((String)(string3 + ".secret"))) {
                object = string3 + ".secret";
            }
            return string.replace(class08392.N((String)class08392.N((String)"menu.modded", (Object[])new Object[0]), (Object[])new Object[0]), class08392.N((String)object, (Object[])new Object[]{string2}));
        }
        return string;
    }

    private int N(int n) {
        if (ModMenuConfig.MODIFY_TITLE_SCREEN.getValue() && ModMenuConfig.MODS_BUTTON_STYLE.getValue() == ModMenuConfig.TitleMenuButtonStyle.CLASSIC) {
            return n - 51;
        }
        if (ModMenuConfig.MODS_BUTTON_STYLE.getValue() == ModMenuConfig.TitleMenuButtonStyle.REPLACE_REALMS || ModMenuConfig.MODS_BUTTON_STYLE.getValue() == ModMenuConfig.TitleMenuButtonStyle.SHRINK) {
            return -99999;
        }
        return n;
    }

    public void N(CallbackInfo callbackInfo) {
        if (!z) {
            Iris.onLoadingComplete();
        }
        z = true;
    }

    private boolean N() {
        return this.R != null;
    }

    public static void N(class08627 class086272) {
        class086272.N(class02088.N);
        class086272.N(class02088.L);
        class086272.N(class02966.N);
    }

    private int N(int n, int n2) {
        if (class07529.ND) {
            this.method_37063((class04654)class05362.method_46430((class00392)class00392.y((String)"Create Test World"), class053622 -> class05213.y((class06202)this.field_22787, () -> this.field_22787.N((class05096)this))).N(this.field_22789 / 2 - 100, n += n2, 200, 20).N());
        }
        return n;
    }

    private void N(boolean bl) {
        if (bl) {
            try (class04785 class047852 = this.field_22787.NL().i(u);){
                class047852.U();
            }
            catch (IOException iOException) {
                class06132.y((class06202)this.field_22787, (String)u);
                N.warn("Failed to delete demo world", (Throwable)iOException);
            }
        }
        this.field_22787.N((class05096)this);
    }

    private /* synthetic */ void N(class05362 class053622) {
        class04777 class047772 = this.field_22787.NL();
        try (class04785 class047852 = class047772.i(u);){
            if (class047852.W()) {
                this.field_22787.N((class05096)new class05733(this::N, (class00392)class00392.L((String)"selectWorld.deleteQuestion"), (class00392)class00392.N((String)"selectWorld.deleteWarning", (Object[])new Object[]{class02796.R.N()}), (class00392)class00392.L((String)"selectWorld.deleteButton"), class05220.i));
            }
        }
        catch (IOException iOException) {
            class06132.N((class06202)this.field_22787, (String)u);
            N.warn("Failed to access demo world", (Throwable)iOException);
        }
    }

    private float N(float f) {
        return 400.0f;
    }

    public void method_25426() {
        if (this.i == null) {
            this.i = this.field_22787.NN().N();
        }
        int n = this.field_22793.N((class05936)L);
        int n2 = this.field_22789 - n - 2;
        int n3 = 24;
        int n4 = this.field_22790 / 4 + 48;
        n4 = this.field_22787.E() ? this.L(n4, 24) : this.y(n4, 24);
        n4 = this.N(n4, 24);
        ((class01858)this.method_37063((class04654)class03240.N((int)20, class053622 -> this.field_22787.N((class05096)new class06279((class05096)this, (class05630)this.field_22787.i_7, this.field_22787.X())), (boolean)true))).y(this.field_22789 / 2 - 124, n4 += 36);
        this.method_37063((class04654)class05362.method_46430((class00392)class00392.L((String)"menu.options"), class053622 -> this.field_22787.N((class05096)new class05716((class05096)this, (class05630)this.field_22787.i_7))).N(this.field_22789 / 2 - 100, n4, 98, 20).N());
        this.method_37063((class04654)class05362.method_46430((class00392)class00392.L((String)"menu.quit"), class053622 -> this.field_22787.NP()).N(this.field_22789 / 2 + 2, n4, 98, 20).N());
        ((class01858)this.method_37063((class04654)class03240.y((int)20, class053622 -> this.field_22787.N((class05096)new class05336((class05096)this, (class05630)this.field_22787.i_7)), (boolean)true))).y(this.field_22789 / 2 + 104, n4);
        this.method_37063((class04654)new class04402(n2, this.field_22790 - 10, n, 10, L, class053622 -> this.field_22787.N((class05096)new class03577((class05096)this)), this.field_22793));
        if (this.R == null) {
            this.R = new class04703();
        }
        if (this.N()) {
            int n5 = this.field_22790;
            this.R.method_25423(this.field_22789, this.N(n5));
        }
        this.N((CallbackInfo)null);
        this.y((CallbackInfo)null);
    }

    public void method_49589() {
        super.method_49589();
        if (this.R != null) {
            this.R.method_49589();
        }
    }

    public boolean method_25422() {
        return false;
    }

    public void method_25393() {
        if (this.N()) {
            this.R.method_25393();
        }
    }

    public void method_25432() {
        if (this.R != null) {
            this.R.method_25432();
        }
    }

    public void method_25420(class01054 class010542, int n, int n2, float f) {
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        if (this.B == 0L && this.M) {
            this.B = class07536.L();
        }
        float f2 = 1.0f;
        if (this.M) {
            float f3 = (float)(class07536.L() - this.B) / this.N(2000.0f);
            if (f3 > 1.0f) {
                this.M = false;
            } else {
                f3 = class04995.N((float)f3, (float)0.0f, (float)1.0f);
                f2 = class04995.y((float)f3, (float)0.5f, (float)1.0f, (float)0.0f, (float)1.0f);
            }
            this.method_71536(f2);
        }
        this.method_57728(class010542, f);
        super.method_25394(class010542, n, n2, f);
        this.Z.N(class010542, this.field_22789, this.Z.N() ? 1.0f : f2);
        if (this.i != null && !((Boolean)((class05630)this.field_22787.i_7).L().method_41753()).booleanValue()) {
            this.i.N(class010542, this.field_22789, this.field_22793, f2);
        }
        String string = "Minecraft " + class07529.y().comp_4025();
        string = this.field_22787.E() ? string + " Demo" : string + (String)("release".equalsIgnoreCase(this.field_22787.Nu()) ? "" : "/" + this.field_22787.Nu());
        if (class06202.Z().N()) {
            string = string + class08392.N((String)"menu.modded", (Object[])new Object[0]);
        }
        int n3 = class02566.y((float)f2);
        int n4 = this.field_22790 - 10;
        int n5 = 2;
        String string2 = string;
        class010542.y(this.field_22793, this.N(string2), n5, n4, n3);
        if (this.N() && f2 >= 1.0f) {
            this.R.method_25394(class010542, n, n2, f);
        }
    }

    public boolean method_25421() {
        return false;
    }

    public boolean method_73339() {
        return true;
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        if (super.method_25402(class066132, bl)) {
            return true;
        }
        return this.N() && this.R.method_25402(class066132, bl);
    }
}

