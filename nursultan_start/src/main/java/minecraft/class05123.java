/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11921
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.terraformersmc.modmenu.api.ModMenuApi
 *  com.terraformersmc.modmenu.config.ModMenuConfig
 *  com.terraformersmc.modmenu.config.ModMenuConfig$GameMenuButtonStyle
 *  com.terraformersmc.modmenu.event.ModMenuEventHandler
 *  com.terraformersmc.modmenu.gui.ModsScreen
 *  com.terraformersmc.modmenu.gui.widget.ModMenuButtonWidget
 *  com.terraformersmc.modmenu.gui.widget.UpdateCheckerTexturedButtonWidget
 *  com.terraformersmc.modmenu.mixin.AccessorGridWidget
 *  com.viaversion.viafabricplus.ViaFabricPlus
 *  com.viaversion.viafabricplus.visuals.settings.VisualSettings
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00101
 *  minecraft.class00108
 *  minecraft.class00392
 *  minecraft.class00751
 *  minecraft.class01054
 *  minecraft.class01321
 *  minecraft.class01417
 *  minecraft.class01590
 *  minecraft.class01683
 *  minecraft.class01894
 *  minecraft.class02060
 *  minecraft.class02071
 *  minecraft.class02077
 *  minecraft.class02080
 *  minecraft.class02102
 *  minecraft.class03420
 *  minecraft.class03448
 *  minecraft.class03543
 *  minecraft.class03556
 *  minecraft.class03597
 *  minecraft.class04141
 *  minecraft.class04227
 *  minecraft.class04453
 *  minecraft.class04568
 *  minecraft.class04610
 *  minecraft.class04654
 *  minecraft.class04911
 *  minecraft.class05220
 *  minecraft.class05361
 *  minecraft.class05362
 *  minecraft.class05470
 *  minecraft.class05630
 *  minecraft.class05716
 *  minecraft.class05763
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class06220
 *  minecraft.class06478
 *  minecraft.class06535
 *  minecraft.class07529
 *  minecraft.class08394
 *  minecraft.class09016
 *  minecraft.class09037
 *  net.raphimc.vialegacy.api.LegacyProtocolVersion
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import Nursultan.class11921;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.terraformersmc.modmenu.api.ModMenuApi;
import com.terraformersmc.modmenu.config.ModMenuConfig;
import com.terraformersmc.modmenu.event.ModMenuEventHandler;
import com.terraformersmc.modmenu.gui.ModsScreen;
import com.terraformersmc.modmenu.gui.widget.ModMenuButtonWidget;
import com.terraformersmc.modmenu.gui.widget.UpdateCheckerTexturedButtonWidget;
import com.terraformersmc.modmenu.mixin.AccessorGridWidget;
import com.viaversion.viafabricplus.ViaFabricPlus;
import com.viaversion.viafabricplus.visuals.settings.VisualSettings;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.net.URI;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;
import minecraft.class00101;
import minecraft.class00108;
import minecraft.class00392;
import minecraft.class00751;
import minecraft.class01054;
import minecraft.class01321;
import minecraft.class01417;
import minecraft.class01590;
import minecraft.class01683;
import minecraft.class01894;
import minecraft.class02060;
import minecraft.class02071;
import minecraft.class02077;
import minecraft.class02080;
import minecraft.class02102;
import minecraft.class03420;
import minecraft.class03448;
import minecraft.class03543;
import minecraft.class03556;
import minecraft.class03597;
import minecraft.class04141;
import minecraft.class04227;
import minecraft.class04453;
import minecraft.class04568;
import minecraft.class04610;
import minecraft.class04654;
import minecraft.class04911;
import minecraft.class05096;
import minecraft.class05106;
import minecraft.class05131;
import minecraft.class05220;
import minecraft.class05361;
import minecraft.class05362;
import minecraft.class05470;
import minecraft.class05630;
import minecraft.class05716;
import minecraft.class05763;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class06220;
import minecraft.class06478;
import minecraft.class06535;
import minecraft.class07529;
import minecraft.class08394;
import minecraft.class09016;
import minecraft.class09037;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class05123
extends class05096 {
    private static final class01894 y = class01894.y((String)"icon/draft_report");
    private static final int L = 2;
    private static final int u = 50;
    private static final int i = 4;
    private static final int R = 204;
    private static final int M = 98;
    private static final class00392 B = class00392.L((String)"menu.returnToGame");
    private static final class00392 Z = class00392.L((String)"gui.advancements");
    private static final class00392 z = class00392.L((String)"gui.stats");
    private static final class00392 U = class00392.L((String)"menu.sendFeedback");
    private static final class00392 E = class00392.L((String)"menu.reportBugs");
    private static final class00392 W = class00392.L((String)"menu.feedback");
    private static final class00392 m = class00392.L((String)"menu.options");
    private static final class00392 P = class00392.L((String)"menu.shareToLan");
    private static final class00392 s = class00392.L((String)"menu.playerReporting");
    private static final class00392 T = class00392.L((String)"menu.game");
    private static final class00392 b = class00392.L((String)"menu.paused");
    private static final class04141 j = class04141.N((class00392)class00392.L((String)"menu.custom_options.tooltip"));
    private final boolean v;
    public @Nullable class05362 N;
    private int n;
    private class05361 t;

    private void L() {
        class02060 class020602 = new class02060();
        class020602.L().N(4, 4, 4, 0);
        class02080 class020802 = class020602.u(2);
        class020802.N((class02102)class05362.method_46430((class00392)B, class053622 -> {
            this.field_22787.N(null);
            ((class06220)this.field_22787.L_2).Z();
        }).N(204).N(), 2, class020602.y().L(50));
        Supplier<class05096> supplier = () -> new class01417(((class01683)((class04453)this.field_22787.T_4).y_0).W(), (class05096)this);
        class00392 class003922 = Z;
        class05123 class051232 = this;
        class003922 = this.N(class051232, class003922, supplier, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)3, (String)"[net.minecraft.class_433, net.minecraft.class_2561, java.util.function.Supplier]");
            Object[] objectArray2 = objectArray;
            return ((class05123)((Object)((Object)objectArray[0]))).N((class00392)objectArray2[1], (Supplier)objectArray2[2]);
        });
        class051232 = class020802;
        this.N((class02080)class051232, (class02102)class003922, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[net.minecraft.class_7845$class_7939, net.minecraft.class_8021]");
            return ((class02080)objectArray[0]).N((class02102)objectArray[1]);
        });
        supplier = () -> new class04610((class05096)this, ((class04453)this.field_22787.T_4).O());
        class003922 = z;
        class051232 = this;
        class003922 = this.N(class051232, class003922, supplier, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)3, (String)"[net.minecraft.class_433, net.minecraft.class_2561, java.util.function.Supplier]");
            Object[] objectArray2 = objectArray;
            return ((class05123)((Object)((Object)objectArray[0]))).N((class00392)objectArray2[1], (Supplier)objectArray2[2]);
        });
        class051232 = class020802;
        this.N((class02080)class051232, (class02102)class003922, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[net.minecraft.class_7845$class_7939, net.minecraft.class_8021]");
            return ((class02080)objectArray[0]).N((class02102)objectArray[1]);
        });
        Optional<? extends class03556<class09037>> var3 = this.u();
        if (var3.isEmpty()) {
            class051232 = this;
            class003922 = class020802;
            if (this.y(class051232, (class02080)class003922)) {
                class05123.N((class05096)class051232, (class02080)class003922);
            }
        } else {
            this.N(this.field_22787, var3.get(), class020802);
        }
        supplier = () -> new class05716((class05096)this, (class05630)this.field_22787.i_7);
        class003922 = m;
        class051232 = this;
        class003922 = this.N(class051232, class003922, supplier, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)3, (String)"[net.minecraft.class_433, net.minecraft.class_2561, java.util.function.Supplier]");
            Object[] objectArray2 = objectArray;
            return ((class05123)((Object)((Object)objectArray[0]))).N((class00392)objectArray2[1], (Supplier)objectArray2[2]);
        });
        class051232 = class020802;
        this.N((class02080)class051232, (class02102)class003922, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[net.minecraft.class_7845$class_7939, net.minecraft.class_8021]");
            return ((class02080)objectArray[0]).N((class02102)objectArray[1]);
        });
        if (this.field_22787.v() && !this.field_22787.Na().P()) {
            supplier = () -> new class05131(this);
            class003922 = P;
            class051232 = this;
            class003922 = this.N(class051232, class003922, supplier, objectArray -> {
                WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)3, (String)"[net.minecraft.class_433, net.minecraft.class_2561, java.util.function.Supplier]");
                Object[] objectArray2 = objectArray;
                return ((class05123)((Object)((Object)objectArray[0]))).N((class00392)objectArray2[1], (Supplier)objectArray2[2]);
            });
            class051232 = class020802;
            this.N((class02080)class051232, (class02102)class003922, objectArray -> {
                WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[net.minecraft.class_7845$class_7939, net.minecraft.class_8021]");
                return ((class02080)objectArray[0]).N((class02102)objectArray[1]);
            });
        } else {
            supplier = () -> new class05470((class05096)this);
            class003922 = s;
            class051232 = this;
            class003922 = this.N(class051232, class003922, supplier, objectArray -> {
                WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)3, (String)"[net.minecraft.class_433, net.minecraft.class_2561, java.util.function.Supplier]");
                Object[] objectArray2 = objectArray;
                return ((class05123)((Object)((Object)objectArray[0]))).N((class00392)objectArray2[1], (Supplier)objectArray2[2]);
            });
            class051232 = class020802;
            this.N((class02080)class051232, (class02102)class003922, objectArray -> {
                WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[net.minecraft.class_7845$class_7939, net.minecraft.class_8021]");
                return ((class02080)objectArray[0]).N((class02102)objectArray[1]);
            });
        }
        class02102 class021022 = class020802.N((class02102)class05362.method_46430((class00392)class05220.y((boolean)this.field_22787.q()), class053622 -> {
            class053622.field_22763 = false;
            this.field_22787.R().N(this.field_22787, (class05096)this, () -> this.field_22787.N(class03448.N), true);
        }).N(204).N(), 2);
        this.N(null, class020802);
        this.N = (class05362)class021022;
        class020602.N();
        class02077.N((class02102)class020602, (int)0, (int)0, (int)this.field_22789, (int)this.field_22790, (float)0.5f, (float)0.25f);
        Consumer<class06478> consumer = this::method_37063;
        this.N(null, class020602);
        class020602.method_48206(consumer);
        this.N((CallbackInfo)null);
    }

    public class05123(boolean bl) {
        super(bl ? T : b);
        this.v = bl;
    }

    private Optional<? extends class03556<class09037>> u() {
        class03543 class035432;
        class00751 class007512 = ((class01683)((class04453)this.field_22787.T_4).y_0).j().L(class04227.yL);
        Optional optional = class007512.N(class00101.N);
        if (optional.isPresent() && (class035432 = (class03543)optional.get()).y() > 0) {
            if (class035432.y() == 1) {
                return Optional.of(class035432.N(0));
            }
            return class007512.N(class09016.y);
        }
        class035432 = ((class01683)((class04453)this.field_22787.T_4).y_0).o();
        if (!class035432.N()) {
            return class007512.N(class09016.N);
        }
        return Optional.empty();
    }

    private boolean y(class05096 class050962, class02080 class020802) {
        return VisualSettings.INSTANCE.changeGameMenuScreenLayout.getIndex() != 0 || ViaFabricPlus.getImpl().getTargetVersion().newerThan(ProtocolVersion.v1_13_2);
    }

    public boolean y() {
        class05630 class056302 = (class05630)this.field_22787.i_7;
        return ((class06535)class056302.NX().method_41753()).L() && class056302.N(class04911.field_15253) > 0.0f && this.v;
    }

    private class05362 N(class00392 class003922) {
        for (class04654 class046542 : this.method_25396()) {
            class05362 class053622;
            if (!(class046542 instanceof class05362) || !(class053622 = (class05362)class046542).method_25369().equals((Object)class003922)) continue;
            return class053622;
        }
        return null;
    }

    public boolean N() {
        return this.v;
    }

    static void N(class05096 class050962, class02080 class020802) {
        class020802.N((class02102)class05123.N(class050962, U, class07529.y().comp_4031() ? class03597.Z : class03597.B));
        ((class05362)class020802.N((class02102)class05123.N((class05096)class050962, (class00392)class05123.E, (URI)class03597.z))).field_22763 = !class07529.y().comp_4026().N();
    }

    private void N(class06202 class062022, class03556<class09037> class035562, class02080 class020802) {
        class020802.N((class02102)this.N(W, () -> new class05106(this)));
        class020802.N((class02102)class05362.method_46430((class00392)((class09037)class035562.N()).H_().N(), class053622 -> ((class01683)((class04453)class062022.T_4).y_0).N(class035562, (class05096)this)).N(98).N(j).N());
    }

    private static class05362 N(class05096 class050962, class00392 class003922, URI uRI) {
        return class05362.method_46430((class00392)class003922, (class05361)class01321.y((class05096)class050962, (URI)uRI)).N(98).N();
    }

    private class05362 N(class00392 class003922, Supplier<class05096> supplier) {
        return class05362.method_46430((class00392)class003922, class053622 -> this.field_22787.N((class05096)((Object)((Object)supplier.get())))).N(98).N();
    }

    private void N(CallbackInfo callbackInfo, class02060 class020602) {
        block10: {
            if (class020602 == null) break block10;
            List var3 = ((AccessorGridWidget)class020602).getChildren();
            if (!ModMenuConfig.MODIFY_GAME_MENU.getValue()) break block10;
            int n = -1;
            int n2 = 24;
            int n3 = this.field_22790 / 4 + 8;
            ModMenuConfig.GameMenuButtonStyle gameMenuButtonStyle = (ModMenuConfig.GameMenuButtonStyle)ModMenuConfig.GAME_MENU_BUTTON_STYLE.getValue();
            int n4 = this.field_22790 / 4 + 72 - 16 + 1;
            int n5 = 204;
            for (int i = 0; i < var3.size(); ++i) {
                class02102 class021023;
                block11: {
                    block12: {
                        class021023 = (class02102)var3.get(i);
                        if (gameMenuButtonStyle != ModMenuConfig.GameMenuButtonStyle.INSERT) break block11;
                        if (!(class021023 instanceof class06478)) break block12;
                        class06478 class064782 = (class06478)class021023;
                        if (!class064782.field_22764) break block11;
                    }
                    ModMenuEventHandler.shiftButtons((class02102)class021023, (n == -1 || ModMenuEventHandler.buttonHasText((class02102)class021023, (String[])new String[]{"menu.reportBugs", "menu.server_links"}) || ModMenuEventHandler.buttonHasTooltip((class02102)class021023, (class04141)class05123.j) ? 1 : 0) != 0, (int)24);
                    if (n == -1) {
                        n3 = class021023.method_46427();
                    }
                }
                boolean bl = ModMenuEventHandler.buttonHasText((class02102)class021023, (String[])new String[]{"menu.feedback"});
                boolean bl2 = ModMenuEventHandler.buttonHasText((class02102)class021023, (String[])new String[]{"menu.sendFeedback"});
                if (!bl && !bl2) continue;
                n = i + 1;
                n4 = class021023.method_46427();
                if (gameMenuButtonStyle == ModMenuConfig.GameMenuButtonStyle.REPLACE) {
                    var3.set(i, new ModMenuButtonWidget(class021023.method_46426(), class021023.method_46427(), bl ? class021023.method_25368() : 204, class021023.method_25364(), ModMenuApi.createModsButtonText(), (class05096)this));
                    var3.stream().filter(class021022 -> ModMenuEventHandler.buttonHasText((class02102)class021022, (String[])new String[]{"menu.reportBugs"})).forEach(class021022 -> {
                        if (class021022 instanceof class06478) {
                            class06478 class064782 = (class06478)class021022;
                            class064782.field_22764 = false;
                            class064782.field_22763 = false;
                        }
                    });
                    continue;
                }
                n = i + 1;
                if (class021023 instanceof class06478 && !((class06478)class021023).field_22764) continue;
                n3 = class021023.method_46427();
            }
            if (n != -1) {
                if (gameMenuButtonStyle == ModMenuConfig.GameMenuButtonStyle.INSERT) {
                    var3.add(n, new ModMenuButtonWidget(this.field_22789 / 2 - 102, n3 + 24, 204, 20, ModMenuApi.createModsButtonText(), (class05096)this));
                } else if (gameMenuButtonStyle == ModMenuConfig.GameMenuButtonStyle.ICON) {
                    var3.add(n, new UpdateCheckerTexturedButtonWidget(this.field_22789 / 2 + 4 + 100 + 2, n4, 20, 20, 0, 0, 20, ModMenuEventHandler.MODS_BUTTON_TEXTURE, 32, 64, class053622 -> class06202.Nq().N((class05096)new ModsScreen((class05096)this)), ModMenuApi.createModsButtonText()));
                }
            }
        }
    }

    private void N(CallbackInfo callbackInfo, class02080 class020802) {
        if (this.field_22787.q()) {
            return;
        }
        class04568 class045682 = this.field_22787.yN();
        if (class045682 == null || class045682.y == null || class045682.i()) {
            return;
        }
        class020802.N((class02102)class05362.method_46430((class00392)class11921.N((String)"reconnect-button"), class053622 -> {
            class053622.field_22763 = false;
            ((class03448)this.field_22787.T_3).N(class00392.N((String)"User requested to reconnect through game menu screen"));
            this.field_22787.N((class05096)((Object)((Object)class06202.Nq().v_3)), false);
            class05763.N(null, (class06202)this.field_22787, (class03420)class03420.N((String)class045682.y), (class04568)class045682, (boolean)true, null);
        }).N(204).N(), 2);
    }

    private class02102 N(class02080 class020802, class02102 class021022, Operation operation) {
        if (VisualSettings.INSTANCE.changeGameMenuScreenLayout.getIndex() == 0 && class021022 instanceof class05362) {
            class05362 class053622 = (class05362)class021022;
            if (ViaFabricPlus.getImpl().getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.r1_2_4tor1_2_5) && class053622.method_25369().equals((Object)P)) {
                return null;
            }
            if (ViaFabricPlus.getImpl().getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.b1_4tob1_4_1)) {
                if (class053622.method_25369().equals((Object)z)) {
                    return null;
                }
                if (class053622.method_25369().equals((Object)class05220.T)) {
                    this.t = class053623 -> class053622.method_25306(null);
                    this.n = class053622.method_25368();
                    return null;
                }
            }
        }
        return (class02102)operation.call(new Object[]{class020802, class021022});
    }

    private void N(class00392 class003922, Consumer consumer) {
        class05362 class053622 = this.N(class003922);
        if (class053622 != null) {
            consumer.accept(class053622);
        }
    }

    private class05362 N(class05123 class051232, class00392 class003922, Supplier supplier, Operation operation) {
        if (VisualSettings.INSTANCE.changeGameMenuScreenLayout.getIndex() == 0) {
            if (ViaFabricPlus.getImpl().getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_19) && class003922.equals((Object)s)) {
                return class05362.method_46430((class00392)P, class053622 -> new class05131(class051232)).N(M).N();
            }
            if (ViaFabricPlus.getImpl().getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.b1_4tob1_4_1) && class003922.equals((Object)Z)) {
                return class05362.method_46430((class00392)class05220.T, (class05361)this.t).N(this.n).N();
            }
        } else if (VisualSettings.INSTANCE.changeGameMenuScreenLayout.getIndex() == 1 && ViaFabricPlus.getImpl().getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_19) && class003922.equals((Object)s)) {
            return this.N(class05470.N, () -> new class05470((class05096)class051232));
        }
        return (class05362)operation.call(new Object[]{class051232, class003922, supplier});
    }

    private void N(CallbackInfo callbackInfo) {
        class05362 class053624;
        if (VisualSettings.INSTANCE.changeGameMenuScreenLayout.getIndex() != 0) {
            return;
        }
        Consumer<class05362> consumer = class053622 -> class053622.method_46419(class053622.method_46427() + 20);
        if (ViaFabricPlus.getImpl().getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_13_2)) {
            this.N(m, consumer);
            this.N(class05220.T, consumer);
            this.N(P, (T class053622) -> {
                consumer.accept((class05362)class053622);
                class053622.field_22763 = false;
            });
        }
        if ((class053624 = this.N(B)) == null) {
            return;
        }
        if (ViaFabricPlus.getImpl().getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.r1_2_4tor1_2_5)) {
            this.N(m, (T class053623) -> {
                class053623.method_46421(class053624.method_46426());
                class053623.method_25358(class053624.method_25368());
            });
        }
        if (ViaFabricPlus.getImpl().getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.b1_4tob1_4_1)) {
            this.N(m, consumer);
            this.N(class05220.T, (T class053623) -> class053623.method_46419(class053624.method_46427() + 20 + 3));
        }
    }

    @Override
    public void method_25426() {
        if (this.v) {
            this.L();
        }
        int n = this.field_22793.N((class05936)this.field_22785);
        int n2 = this.field_22789 / 2 - n / 2;
        int n3 = this.v ? 40 : 10;
        Objects.requireNonNull(this.field_22793);
        this.method_37063(new class02071(n2, n3, n, 9, this.field_22785, this.field_22793));
    }

    @Override
    public void method_25393() {
        if (this.y()) {
            class00108.N();
        }
    }

    @Override
    public void method_25420(class01054 class010542, int n, int n2, float f) {
        if (this.v) {
            super.method_25420(class010542, n, n2, f);
        }
    }

    @Override
    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        if (this.y()) {
            class00108.N((class01054)class010542, (class01590)this.field_22793);
        }
        if (this.v && this.field_22787.R().L() && this.N != null) {
            class010542.N(class08394.Na, y, this.N.method_46426() + this.N.method_25368() - 17, this.N.method_46427() + 3, 15, 15);
        }
    }
}

