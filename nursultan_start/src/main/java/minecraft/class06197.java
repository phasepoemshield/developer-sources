/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11286
 *  Nursultan.class11381
 *  Nursultan.class11389
 *  Nursultan.class11391
 *  Nursultan.class11938
 *  com.google.common.base.MoreObjects
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.mojang.blaze3d.platform.TextureUtil
 *  com.viaversion.viafabricplus.features.networking.remove_signed_commands.SignedCommands1_21_6
 *  com.viaversion.viafabricplus.injection.access.execute_inputs_sync.IMouseKeyboardHandlers
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viafabricplus.settings.impl.DebugSettings
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  de.maxhenkel.voicechat.events.InputEvents
 *  de.maxhenkel.voicechat.intercompatibility.ClientCompatibilityManager$KeyboardEvent
 *  java.lang.MatchException
 *  jerozgen.languagereload.LanguageReload
 *  jerozgen.languagereload.config.Config
 *  jerozgen.languagereload.mixin.KeyBindingAccessor
 *  jerozgen.languagereload.mixin.LanguageManagerAccessor
 *  minecraft.class00017
 *  minecraft.class00381
 *  minecraft.class00390
 *  minecraft.class00392
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class00623
 *  minecraft.class00647
 *  minecraft.class00892
 *  minecraft.class01056
 *  minecraft.class01299
 *  minecraft.class01557
 *  minecraft.class01683
 *  minecraft.class01827
 *  minecraft.class01894
 *  minecraft.class01929
 *  minecraft.class02111
 *  minecraft.class03063
 *  minecraft.class03386
 *  minecraft.class03394
 *  minecraft.class03443
 *  minecraft.class03448
 *  minecraft.class04206
 *  minecraft.class04320
 *  minecraft.class04453
 *  minecraft.class04490
 *  minecraft.class04495
 *  minecraft.class04544
 *  minecraft.class04589
 *  minecraft.class04631
 *  minecraft.class04655
 *  minecraft.class04663
 *  minecraft.class04671
 *  minecraft.class04674
 *  minecraft.class04927
 *  minecraft.class04995
 *  minecraft.class05096
 *  minecraft.class05123
 *  minecraft.class05216
 *  minecraft.class05220
 *  minecraft.class05484
 *  minecraft.class05628
 *  minecraft.class05630
 *  minecraft.class05731
 *  minecraft.class05954
 *  minecraft.class06134
 *  minecraft.class06428
 *  minecraft.class06541
 *  minecraft.class06601
 *  minecraft.class06626
 *  minecraft.class06889
 *  minecraft.class07001
 *  minecraft.class07049
 *  minecraft.class07074
 *  minecraft.class07080
 *  minecraft.class07089
 *  minecraft.class07209
 *  minecraft.class07282
 *  minecraft.class07299
 *  minecraft.class07529
 *  minecraft.class07536
 *  minecraft.class07709
 *  minecraft.class07717
 *  minecraft.class07878
 *  minecraft.class08066
 *  minecraft.class08162
 *  minecraft.class08303
 *  minecraft.class08329
 *  minecraft.class08396
 *  minecraft.class08430
 *  minecraft.class08844
 *  minecraft.class09008
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenKeyboardEvents
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenKeyboardEvents$AfterKeyPress
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenKeyboardEvents$AfterKeyRelease
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenKeyboardEvents$AllowKeyPress
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenKeyboardEvents$AllowKeyRelease
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenKeyboardEvents$BeforeKeyPress
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenKeyboardEvents$BeforeKeyRelease
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class11286;
import Nursultan.class11381;
import Nursultan.class11389;
import Nursultan.class11391;
import Nursultan.class11938;
import com.google.common.base.MoreObjects;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.blaze3d.platform.TextureUtil;
import com.viaversion.viafabricplus.features.networking.remove_signed_commands.SignedCommands1_21_6;
import com.viaversion.viafabricplus.injection.access.execute_inputs_sync.IMouseKeyboardHandlers;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viafabricplus.settings.impl.DebugSettings;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import de.maxhenkel.voicechat.events.InputEvents;
import de.maxhenkel.voicechat.intercompatibility.ClientCompatibilityManager;
import java.io.File;
import java.lang.invoke.LambdaMetafactory;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Consumer;
import jerozgen.languagereload.LanguageReload;
import jerozgen.languagereload.config.Config;
import jerozgen.languagereload.mixin.KeyBindingAccessor;
import jerozgen.languagereload.mixin.LanguageManagerAccessor;
import minecraft.class00017;
import minecraft.class00381;
import minecraft.class00390;
import minecraft.class00392;
import minecraft.class00394;
import minecraft.class00500;
import minecraft.class00623;
import minecraft.class00647;
import minecraft.class00892;
import minecraft.class01056;
import minecraft.class01299;
import minecraft.class01557;
import minecraft.class01683;
import minecraft.class01827;
import minecraft.class01894;
import minecraft.class01929;
import minecraft.class02111;
import minecraft.class03063;
import minecraft.class03386;
import minecraft.class03394;
import minecraft.class03443;
import minecraft.class03448;
import minecraft.class04206;
import minecraft.class04320;
import minecraft.class04453;
import minecraft.class04490;
import minecraft.class04495;
import minecraft.class04544;
import minecraft.class04589;
import minecraft.class04631;
import minecraft.class04655;
import minecraft.class04663;
import minecraft.class04671;
import minecraft.class04674;
import minecraft.class04927;
import minecraft.class04995;
import minecraft.class05096;
import minecraft.class05123;
import minecraft.class05216;
import minecraft.class05220;
import minecraft.class05484;
import minecraft.class05628;
import minecraft.class05630;
import minecraft.class05731;
import minecraft.class05954;
import minecraft.class06134;
import minecraft.class06145;
import minecraft.class06183;
import minecraft.class06202;
import minecraft.class06428;
import minecraft.class06541;
import minecraft.class06601;
import minecraft.class06626;
import minecraft.class06889;
import minecraft.class07001;
import minecraft.class07049;
import minecraft.class07074;
import minecraft.class07080;
import minecraft.class07089;
import minecraft.class07209;
import minecraft.class07282;
import minecraft.class07299;
import minecraft.class07529;
import minecraft.class07536;
import minecraft.class07709;
import minecraft.class07717;
import minecraft.class07878;
import minecraft.class08066;
import minecraft.class08162;
import minecraft.class08303;
import minecraft.class08329;
import minecraft.class08396;
import minecraft.class08430;
import minecraft.class08844;
import minecraft.class09008;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.screen.v1.ScreenKeyboardEvents;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(value=EnvType.CLIENT)
public class class06197
implements IMouseKeyboardHandlers {
    private static Logger y = LoggerFactory.getLogger((String)"minecraft.class06197");
    public static final int N = 10000;
    private final class06202 L;
    private final class04663 u;
    private long i = -1L;
    private long R = -1L;
    private long M = -1L;
    private boolean B;
    private final Queue Z = new ConcurrentLinkedQueue();

    private void L(class06601 class066012) {
        if (class066012.W()) {
            Config config = Config.getInstance();
            class08396 class083962 = this.L.X();
            class08430 class084302 = class083962.y(config.previousLanguage);
            if (class084302 == null && config.previousLanguage.equals("en_us")) {
                class084302 = LanguageManagerAccessor.languagereload_getEnglishUs();
            }
            boolean bl = config.previousLanguage.equals("*");
            if (class084302 == null && !bl) {
                this.y((class00392)class00392.L((String)"debug.reload_languages.switch.failure"));
            } else {
                LanguageReload.setLanguage((String)config.previousLanguage, (LinkedList)config.previousFallbacks);
                ArrayList<class00392> arrayList = new ArrayList<class00392>();
                if (bl) {
                    arrayList.add(class00392.N((String)"\u2205"));
                }
                if (class084302 != null) {
                    arrayList.add(class084302.N());
                }
                arrayList.addAll(config.fallbacks.stream().map(arg_0 -> ((class08396)class083962).y(arg_0)).filter(Objects::nonNull).map(class08430::N).toList());
                this.L((class00392)class00392.N((String)"debug.reload_languages.switch.success", (Object[])new Object[]{class00390.N(arrayList, (class00392)class00392.N((String)", "))}));
            }
        } else {
            LanguageReload.reloadLanguages();
            this.L((class00392)class00392.L((String)"debug.reload_languages.message"));
        }
    }

    private void L(long l, int n, class06601 class066012, CallbackInfo callbackInfo) {
        ((ClientCompatibilityManager.KeyboardEvent)InputEvents.KEYBOARD_KEY.invoker()).onKeyboardEvent(class066012);
    }

    private void L(class00392 class003922) {
        this.N(class06197.N(class06541.field_1054, class003922));
    }

    public class06197(class06202 class062022) {
        this.u = new class04663();
        this.L = class062022;
    }

    private /* synthetic */ void u(class00392 class003922) {
        this.L.execute(() -> this.N(class003922));
    }

    private static /* synthetic */ Boolean y(Object[] objectArray) {
        WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[net.minecraft.class_437, net.minecraft.class_11908]");
        return ((class05096)objectArray[0]).method_16803((class06601)objectArray[1]);
    }

    public void y() {
        if (this.i > 0L) {
            long l = class07536.L();
            long l2 = 10000L - (l - this.i);
            long l3 = l - this.R;
            if (l2 < 0L) {
                if (this.L.s()) {
                    class04674.N();
                }
                String string = "Manually triggered debug crash";
                class07080 class070802 = new class07080("Manually triggered debug crash", new Throwable("Manually triggered debug crash"));
                class04544.N((class07074)class070802.N("Manual crash details"));
                throw new class07878(class070802);
            }
            if (l3 >= 1000L) {
                if (this.M == 0L) {
                    this.N("debug.crash.message", ((class05630)this.L.i_7).r.m().getString(), ((class05630)this.L.i_7).NN.m().getString());
                } else {
                    this.y((class00392)class00392.N((String)"debug.crash.warning", (Object[])new Object[]{class04995.u((float)((float)l2 / 1000.0f))}));
                }
                this.R = l;
                ++this.M;
            }
        }
    }

    private void y(long l, int n, class06601 class066012, CallbackInfo callbackInfo) {
        if (l != this.L.Nt().B()) {
            return;
        }
        if (class066012.v() == -1) {
            return;
        }
        class11389 class113892 = class11389.N((int)class066012.v(), (int)class066012.y(), (int)class066012.n(), (class11286)class11286.N((int)n), (class11381)class11381.KEYBOARD);
        class11938.L().L((Object)class113892);
        if (class113892.y()) {
            callbackInfo.cancel();
        }
    }

    private void y(long l, class06626 class066262, CallbackInfo callbackInfo) {
        if (l != this.L.Nt().B()) {
            return;
        }
        class11391 class113912 = class11391.N((int)class066262.L(), (int)class066262.u());
        class11938.L().L((Object)class113912);
        if (class113912.y()) {
            callbackInfo.cancel();
        }
    }

    private boolean y(class05096 class050962, class06601 class066012, Operation operation) {
        if (class050962 != null) {
            if (!((ScreenKeyboardEvents.AllowKeyRelease)ScreenKeyboardEvents.allowKeyRelease((class05096)class050962).invoker()).allowKeyRelease(class050962, class066012)) {
                return true;
            }
            ((ScreenKeyboardEvents.BeforeKeyRelease)ScreenKeyboardEvents.beforeKeyRelease((class05096)class050962).invoker()).beforeKeyRelease(class050962, class066012);
        }
        boolean bl = (Boolean)operation.call(new Object[]{class050962, class066012});
        if (class050962 != null) {
            ((ScreenKeyboardEvents.AfterKeyRelease)ScreenKeyboardEvents.afterKeyRelease((class05096)class050962).invoker()).afterKeyRelease(class050962, class066012);
        }
        return bl;
    }

    private boolean y(class06601 class066012) {
        boolean bl;
        if (this.i > 0L && this.i < class07536.L() - 100L) {
            boolean bl2 = true;
            CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true, bl2);
            this.N(class066012, callbackInfoReturnable);
            if (callbackInfoReturnable.isCancelled()) {
                return callbackInfoReturnable.getReturnValueZ();
            }
            return true;
        }
        if (class07529.t && this.N(class066012)) {
            boolean bl3 = true;
            CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true, bl3);
            this.N(class066012, callbackInfoReturnable);
            if (callbackInfoReturnable.isCancelled()) {
                return callbackInfoReturnable.getReturnValueZ();
            }
            return true;
        }
        if (class07529.Na) {
            switch (class066012.v()) {
                case 82: {
                    class04320.N();
                    boolean bl4 = true;
                    CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true, bl4);
                    this.N(class066012, callbackInfoReturnable);
                    if (callbackInfoReturnable.isCancelled()) {
                        return callbackInfoReturnable.getReturnValueZ();
                    }
                    return true;
                }
                case 76: {
                    class04320.y();
                    boolean bl5 = true;
                    CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true, bl5);
                    this.N(class066012, callbackInfoReturnable);
                    if (callbackInfoReturnable.isCancelled()) {
                        return callbackInfoReturnable.getReturnValueZ();
                    }
                    return true;
                }
            }
        }
        class05630 class056302 = (class05630)this.L.i_7;
        boolean bl6 = false;
        if (class056302.Ny.N(class066012)) {
            ((class03063)this.L.B_2).u();
            this.N("debug.reload_chunks.message", new Object[0]);
            bl6 = true;
        }
        if (class056302.NL.N(class066012) && (class04453)this.L.T_4 != null && !((class04453)this.L.T_4).method_7302()) {
            bl = ((class05731)this.L.L_0).L(class06134.G);
            this.N(bl ? "debug.show_hitboxes.on" : "debug.show_hitboxes.off", new Object[0]);
            bl6 = true;
        }
        if (class056302.Nu.N(class066012)) {
            ((class01056)this.L.i_6).i().N(false);
            bl6 = true;
        }
        if (class056302.Ni.N(class066012) && (class04453)this.L.T_4 != null && !((class04453)this.L.T_4).method_7302()) {
            bl = ((class05731)this.L.L_0).L(class06134.l);
            this.N(bl ? "debug.chunk_boundaries.on" : "debug.chunk_boundaries.off", new Object[0]);
            bl6 = true;
        }
        if (class056302.NR.N(class066012)) {
            class056302.W = !class056302.W;
            this.N(class056302.W ? "debug.advanced_tooltips.on" : "debug.advanced_tooltips.off", new Object[0]);
            class056302.Np();
            bl6 = true;
        }
        if (class056302.NM.N(class066012)) {
            if ((class04453)this.L.T_4 != null && !((class04453)this.L.T_4).method_7302()) {
                this.N(((class04453)this.L.T_4).method_75004().hasPermission(class08162.y), !class066012.W());
            }
            bl6 = true;
        }
        if (class056302.NB.N(class066012)) {
            if ((class04453)this.L.T_4 == null || !class01557.N.N(((class04453)this.L.T_4).method_75004())) {
                this.N("debug.creative_spectator.error", new Object[0]);
            } else if (!((class04453)this.L.T_4).method_7325()) {
                class09008 class090082 = new class09008(class07282.field_9219);
                class01683 class016832 = (class01683)((class04453)this.L.T_4).y_0;
                this.N(class016832, (class00381)class090082);
            } else {
                class07282 class072822 = (class07282)MoreObjects.firstNonNull((Object)((class03443)this.L.T_2).z(), (Object)class07282.field_9220);
                class09008 class090083 = new class09008(class072822);
                class01683 class016833 = (class01683)((class04453)this.L.T_4).y_0;
                this.N(class016833, (class00381)class090083);
            }
            bl6 = true;
        }
        if (class056302.NZ.N(class066012) && (class03448)this.L.T_3 != null && (class05096)this.L.v_3 == null) {
            if (this.L.T() && class01557.N.N(((class04453)this.L.T_4).method_75004())) {
                this.L.N((class05096)new class05954());
            } else {
                this.N("debug.gamemodes.error", new Object[0]);
            }
            bl6 = true;
        }
        if (class056302.Nz.N(class066012)) {
            if ((class05096)this.L.v_3 instanceof class04589) {
                ((class05096)this.L.v_3).method_25419();
            } else if (this.L.G()) {
                if ((class05096)this.L.v_3 != null) {
                    ((class05096)this.L.v_3).method_25419();
                }
                this.L.N((class05096)new class04589());
            }
            bl6 = true;
        }
        if (class056302.NU.N(class066012)) {
            class056302.m = !class056302.m;
            class056302.Np();
            this.N(class056302.m ? "debug.pause_focus.on" : "debug.pause_focus.off", new Object[0]);
            bl6 = true;
        }
        if (class056302.NE.N(class066012)) {
            Path path = ((File)this.L.l_1).toPath().toAbsolutePath();
            Path path2 = TextureUtil.getDebugTexturePath((Path)path);
            this.L.NO().N(path2);
            class05216 class052162 = class00392.y((String)path.relativize(path2).toString()).N(class06541.field_1073).N(class004052 -> class004052.N((class00647)new class00623(path2)));
            this.L((class00392)class00392.N((String)"debug.dump_dynamic_textures", (Object[])new Object[]{class052162}));
            bl6 = true;
        }
        if (class056302.NW.N(class066012)) {
            this.N("debug.reload_resourcepacks.message", new Object[0]);
            this.L.yy();
            bl6 = true;
        }
        if (class056302.Nm.N(class066012)) {
            if (this.L.y(this::L)) {
                this.L((class00392)class00392.N((String)"debug.profiling.start", (Object[])new Object[]{10, class056302.r.m(), class056302.Nm.m()}));
            }
            bl6 = true;
        }
        if (class056302.NP.N(class066012) && (class04453)this.L.T_4 != null && !((class04453)this.L.T_4).method_7302()) {
            this.N("debug.copy_location.message", new Object[0]);
            this.N(String.format(Locale.ROOT, "/execute in %s run tp @s %.2f %.2f %.2f %.2f %.2f", ((class04453)this.L.T_4).method_73183().method_27983().N(), ((class04453)this.L.T_4).method_23317(), ((class04453)this.L.T_4).method_23318(), ((class04453)this.L.T_4).method_23321(), Float.valueOf(((class04453)this.L.T_4).method_36454()), Float.valueOf(((class04453)this.L.T_4).method_36455())));
            bl6 = true;
        }
        if (class056302.Ns.N(class066012)) {
            this.N("debug.version.header", new Object[0]);
            class00017.N(this::N);
            bl6 = true;
        }
        if (class056302.NT.N(class066012)) {
            this.L.ND().B();
            bl6 = true;
        }
        if (class056302.Nb.N(class066012)) {
            this.L.ND().M();
            bl6 = true;
        }
        if (class056302.Nj.N(class066012)) {
            this.L.ND().R();
            bl6 = true;
        }
        boolean bl7 = bl6;
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true, bl7);
        this.N(class066012, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        return bl7;
    }

    private void y(class00392 class003922) {
        this.N(class06197.N(class06541.field_1061, class003922));
    }

    private void y(String string) {
        this.L((class00392)class00392.y((String)string));
    }

    public Queue viaFabricPlus$getPendingScreenEvents() {
        return this.Z;
    }

    private void N(long l, class06626 class066262, CallbackInfo callbackInfo) {
        if (((class05630)this.L.i_7).r.R()) {
            int n = ((KeyBindingAccessor)LanguageReload.reloadLanguagesKey).languagereload_getBoundKey().y();
            if (class04655.N((class08844)this.L.Nt(), (int)n)) {
                callbackInfo.cancel();
            }
        }
    }

    private void N(long l, int n, class06601 class066012, CallbackInfo callbackInfo) {
        if ((class05096)this.L.v_3 != null && ((class05630)this.L.i_7).r.R() && LanguageReload.reloadLanguagesKey.N(class066012)) {
            this.B = true;
            if (n != 1) {
                this.L(class066012);
            }
            callbackInfo.cancel();
        }
    }

    private void N(class06601 class066012, CallbackInfoReturnable callbackInfoReturnable) {
        if (LanguageReload.reloadLanguagesKey.N(class066012)) {
            this.L(class066012);
            callbackInfoReturnable.setReturnValue((Object)true);
        }
    }

    private boolean N(class05096 class050962, class06601 class066012, Operation operation) {
        if (class050962 != null) {
            if (!((ScreenKeyboardEvents.AllowKeyPress)ScreenKeyboardEvents.allowKeyPress((class05096)class050962).invoker()).allowKeyPress(class050962, class066012)) {
                return true;
            }
            ((ScreenKeyboardEvents.BeforeKeyPress)ScreenKeyboardEvents.beforeKeyPress((class05096)class050962).invoker()).beforeKeyPress(class050962, class066012);
        }
        boolean bl = (Boolean)operation.call(new Object[]{class050962, class066012});
        if (class050962 != null) {
            ((ScreenKeyboardEvents.AfterKeyPress)ScreenKeyboardEvents.afterKeyPress((class05096)class050962).invoker()).afterKeyPress(class050962, class066012);
        }
        return bl;
    }

    private static class00392 N(class06541 class065412, class00392 class003922) {
        return class00392.i().y((class00392)class00392.L((String)"debug.prefix").N(new class06541[]{class065412, class06541.field_1067})).y(class05220.l).y(class003922);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void N(class01683 class016832, class00381 class003812) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_5) && class003812 instanceof class09008) {
            class09008 class090082 = (class09008)class003812;
            try {
                SignedCommands1_21_6.sendGameMode((class07282)class090082.N());
                return;
            }
            catch (Throwable throwable) {
                throw new MatchException(throwable.toString(), throwable);
            }
        }
        class016832.N(class003812);
    }

    private boolean N(class06601 class066012) {
        switch (class066012.v()) {
            case 69: {
                if ((class04453)this.L.T_4 == null) {
                    return false;
                }
                boolean bl = ((class05731)this.L.L_0).L(class06134.w);
                this.y("SectionPath: " + (bl ? "shown" : "hidden"));
                return true;
            }
            case 76: {
                this.L.U_2 = (Boolean)this.L.U_2 == false;
                this.N("SmartCull: ", (boolean)((Boolean)this.L.U_2));
                return true;
            }
            case 79: {
                if ((class04453)this.L.T_4 == null) {
                    return false;
                }
                boolean bl = ((class05731)this.L.L_0).L(class06134.Q);
                this.N("Frustum culling Octree: ", bl);
                return true;
            }
            case 70: {
                boolean bl = class03394.y();
                this.N("Fog: ", bl);
                return true;
            }
            case 85: {
                if (class066012.W()) {
                    ((class03063)this.L.B_2).E();
                    this.y("Killed frustum");
                } else {
                    ((class03063)this.L.B_2).U();
                    this.y("Captured frustum");
                }
                return true;
            }
            case 86: {
                if ((class04453)this.L.T_4 == null) {
                    return false;
                }
                boolean bl = ((class05731)this.L.L_0).L(class06134.H);
                this.N("SectionVisibility: ", bl);
                return true;
            }
            case 87: {
                this.L.U_1 = (Boolean)this.L.U_1 == false;
                this.N("WireFrame: ", (boolean)((Boolean)this.L.U_1));
                return true;
            }
        }
        return false;
    }

    private static /* synthetic */ Boolean N(Object[] objectArray) {
        WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[net.minecraft.class_437, net.minecraft.class_11908]");
        return ((class05096)objectArray[0]).method_25404((class06601)objectArray[1]);
    }

    private void N(class06202 class062022, Runnable runnable) {
        if (this.L.NE() != null && (class05096)this.L.v_3 != null && DebugSettings.INSTANCE.executeInputsSynchronously.isEnabled()) {
            this.Z.offer(runnable);
        } else {
            class062022.execute(runnable);
        }
    }

    private void N(String string, boolean bl) {
        this.y(string + (bl ? "enabled" : "disabled"));
    }

    private void N(class00392 class003922) {
        ((class01056)this.L.i_6).i().N(class003922);
        this.L.NT().L(class003922);
    }

    private void N(long l, class06626 class066262) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(l, class066262, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        CallbackInfo callbackInfo2 = new CallbackInfo("", true);
        this.y(l, class066262, callbackInfo2);
        if (callbackInfo2.isCancelled()) {
            return;
        }
        if (l != this.L.Nt().B()) {
            return;
        }
        class05096 class050962 = (class05096)this.L.v_3;
        if (class050962 == null || this.L.NZ() != null) {
            return;
        }
        try {
            class050962.method_25400(class066262);
        }
        catch (Throwable throwable) {
            class07080 class070802 = class07080.N((Throwable)throwable, (String)"charTyped event handler");
            class050962.method_65027(class070802);
            class07074 class070742 = class070802.N("Key");
            class070742.N("Codepoint", (Object)class066262.L());
            class070742.N("Mods", (Object)class066262.u());
            throw new class07878(class070802);
        }
    }

    /*
     * Unable to fully structure code
     */
    private void N(long var1_1, int var3_2, class06601 var4_3) {
        var18_4 = new CallbackInfo("", true);
        this.y(var1_1, var3_2, var4_3, var18_4);
        if (var18_4.isCancelled()) {
            return;
        }
        v0 = this.L.Nt();
        this.L(var1_1, var3_2, var4_3, null);
        var5_5 = v0;
        if (var1_1 != var5_5.B()) {
            return;
        }
        this.L.NG().u();
        var6_6 = (class05630)this.L.i_7;
        var7_7 = var6_6.r.N.y() == var6_6.h.N.y();
        var8_8 = var6_6.r.R();
        if (var6_6.NN.W()) ** GOTO lbl-1000
        v1 = this.L.Nt();
        this.L(var1_1, var3_2, var4_3, null);
        if (class04655.N((class08844)v1, (int)var6_6.NN.N.y())) {
            v2 = true;
        } else lbl-1000:
        // 2 sources

        {
            v2 = false;
        }
        var9_9 = v2;
        var17_10 = new CallbackInfo("", true);
        this.N(var1_1, var3_2, var4_3, var17_10);
        if (var17_10.isCancelled()) {
            return;
        }
        if (this.i > 0L) {
            if (!var9_9 || !var8_8) {
                this.i = -1L;
            }
        } else if (var9_9 && var8_8) {
            this.B = var7_7;
            this.i = class07536.L();
            this.R = class07536.L();
            this.M = 0L;
        }
        if ((var10_11 = (class05096)this.L.v_3) != null) {
            switch (var4_3.v()) {
                case 262: 
                case 263: 
                case 264: 
                case 265: {
                    this.L.N(class02111.field_43097);
                    break;
                }
                case 258: {
                    this.L.N(class02111.field_41780);
                }
            }
        }
        if (!(var3_2 != 1 || (class05096)this.L.v_3 instanceof class01827 && ((class01827)var10_11).y > class07536.L() - 20L)) {
            if (var6_6.X.N(var4_3)) {
                var5_5.M();
                var11_12 = var5_5.Z();
                var6_6.NP().method_41748((Object)var11_12);
                var6_6.Np();
                var13_17 = (class05096)this.L.v_3;
                if (var13_17 instanceof class04631) {
                    var12_20 = (class04631)var13_17;
                    var12_20.N(var11_12);
                }
                return;
            }
            if (var6_6.e.N(var4_3)) {
                if (var4_3.P() && class07529.NW) {
                    this.N(this.L.N((File)this.L.l_1));
                } else {
                    class05628.N((File)((File)this.L.l_1), (class08066)this.L.e(), (Consumer<class00392>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, u(minecraft.class00392 ), (Lminecraft/class00392;)V)((class06197)this));
                }
                return;
            }
        }
        if (var3_2 != 0) {
            v3 = var11_13 = var10_11 == null || var10_11.method_25399() instanceof class04927 == false || ((class04927)var10_11.method_25399()).method_20315() == false;
            if (var11_13) {
                if (var4_3.P() && var4_3.v() == 66 && this.L.NT().N() && ((Boolean)var6_6.Q().method_41753()).booleanValue()) {
                    var12_21 = var6_6.NV().method_41753() == class01299.field_18176;
                    var6_6.NV().method_41748((Object)class01299.N((int)(((class01299)var6_6.NV().method_41753()).N() + 1)));
                    var6_6.Np();
                    if (var10_11 != null) {
                        var10_11.method_61040(var12_21);
                    }
                }
                var12_22 = (class04453)this.L.T_4;
            }
        }
        if (var10_11 != null) {
            try {
                if (var3_2 == 1 || var3_2 == 2) {
                    var10_11.method_37070();
                    var20_24 = var4_3;
                    var19_26 = var10_11;
                    if (this.N(var19_26, var20_24, (Operation)LambdaMetafactory.metafactory(null, null, null, ([Ljava/lang/Object;)Ljava/lang/Object;, N(java.lang.Object[] ), ([Ljava/lang/Object;)Ljava/lang/Boolean;)())) {
                        if ((class05096)this.L.v_3 == null) {
                            var11_14 = class04655.N((class06601)var4_3);
                            class06428.N((class04671)var11_14, (boolean)false);
                        }
                        return;
                    }
                } else if (var3_2 == 0 && this.y(var19_27 = var10_11, var20_25 = var4_3, (Operation)LambdaMetafactory.metafactory(null, null, null, ([Ljava/lang/Object;)Ljava/lang/Object;, y(java.lang.Object[] ), ([Ljava/lang/Object;)Ljava/lang/Object;)())) {
                    if (var6_6.r.N(var4_3)) {
                        this.B = false;
                    }
                    return;
                }
            }
            catch (Throwable var11_15) {
                var12_22 = class07080.N((Throwable)var11_15, (String)"keyPressed event handler");
                var10_11.method_65027(var12_22);
                var13_18 = var12_22.N("Key");
                var13_18.N("Key", (Object)var4_3.v());
                var13_18.N("Scancode", (Object)var4_3.n());
                var13_18.N("Mods", (Object)var4_3.y());
                throw new class07878(var12_22);
            }
        }
        var11_16 = class04655.N((class06601)var4_3);
        var12_23 = (class05096)this.L.v_3 == null;
        v4 = var13_19 = var12_23 != false || (var15_28 = (class05096)this.L.v_3) instanceof class05123 != false && (var14_30 = (class05123)var15_28).N() == false || (class05096)this.L.v_3 instanceof class05954 != false;
        if (var7_7 && var6_6.r.N(var4_3) && var3_2 == 0) {
            if (this.B) {
                this.B = false;
            } else {
                ((class05731)this.L.L_0).L();
            }
        } else if (!var7_7 && var6_6.h.N(var4_3) && var3_2 == 1) {
            ((class05731)this.L.L_0).L();
        }
        if (var3_2 == 0) {
            class06428.N((class04671)var11_16, (boolean)false);
            return;
        }
        var14_31 = false;
        if (var13_19 && var4_3.i()) {
            this.L.N(var8_8);
            var14_31 = var8_8;
        } else if (var8_8) {
            var14_31 = this.y(var4_3);
            if (var14_31 && var10_11 instanceof class04589 && (var16_32 = (var15_28 = (class04589)var10_11).N()) != null) {
                var16_32.method_25396().forEach((Consumer<class05484>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, N(), (Lminecraft/class05484;)V)());
            }
        } else if (var13_19 && var6_6.F.N(var4_3)) {
            var6_6.NG = var6_6.NG == false;
        } else if (var13_19 && var6_6.A.N(var4_3)) {
            ((class03386)this.L.i_5).B();
        }
        if (var7_7) {
            this.B |= var14_31;
        }
        if (this.L.ND().L() && !var8_8 && (var15_29 = var4_3.U()) != -1) {
            this.L.ND().E().y(var15_29);
        }
        if (var12_23 || var11_16 == var6_6.r.N) {
            if (var14_31) {
                class06428.N((class04671)var11_16, (boolean)false);
            } else {
                class06428.N((class04671)var11_16, (boolean)true);
                class06428.N((class04671)var11_16);
            }
        }
    }

    public void N(String string) {
        if (!string.isEmpty()) {
            this.u.N(this.L.Nt(), string);
        }
    }

    public String N() {
        return this.u.N(this.L.Nt(), (n, l) -> {
            if (n != 65545) {
                this.L.Nt().N(n, l);
            }
        });
    }

    public void N(class08844 class088442) {
        class04655.N((class08844)class088442, (l, n, n2, n3, n4) -> {
            class06601 class066012 = new class06601(n, n2, n4);
            Runnable runnable = () -> this.N(l, n3, class066012);
            class06202 class062022 = this.L;
            this.N(class062022, runnable);
        }, (l, n, n2) -> {
            class06626 class066262 = new class06626(n, n2);
            Runnable runnable = () -> this.N(l, class066262);
            class06202 class062022 = this.L;
            this.N(class062022, runnable);
        });
    }

    private void N(String string, Object ... objectArray) {
        this.L((class00392)class00392.N((String)string, (Object[])objectArray));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void N(boolean bl, boolean bl2) {
        class07089 class070892 = (class07089)this.L.M_3;
        if (class070892 == null) {
            return;
        }
        switch (class070892.N()) {
            case field_1332: {
                class07209 class072092 = ((class06183)class070892).u();
                class07299 class072992 = ((class04453)this.L.T_4).method_73183();
                class00500 class005002 = class072992.method_8320(class072092);
                if (!bl) {
                    this.N(class005002, class072092, null);
                    this.N("debug.inspect.client.block", new Object[0]);
                    return;
                }
                if (bl2) {
                    ((class01683)((class04453)this.L.T_4).y_0).s().N(class072092, (T class070012) -> {
                        this.N(class005002, class072092, (class07001)class070012);
                        this.N("debug.inspect.server.block", new Object[0]);
                    });
                    return;
                }
                class00394 class003942 = class072992.method_8321(class072092);
                class07001 class070013 = class003942 != null ? class003942.L((class01929)class072992.method_30349()) : null;
                this.N(class005002, class072092, class070013);
                this.N("debug.inspect.client.block", new Object[0]);
                return;
            }
            case field_1331: {
                class07049 class070492 = ((class06145)class070892).L();
                class01894 class018942 = class04206.M.y((Object)class070492.method_5864());
                if (!bl) {
                    this.N(class018942, class070492.method_73189(), null);
                    this.N("debug.inspect.client.entity", new Object[0]);
                    return;
                }
                if (bl2) {
                    ((class01683)((class04453)this.L.T_4).y_0).s().N(class070492.method_5628(), (T class070012) -> {
                        this.N(class018942, class070492.method_73189(), (class07001)class070012);
                        this.N("debug.inspect.server.entity", new Object[0]);
                    });
                    return;
                }
                try (class04495 class044952 = new class04495(class070492.method_71370(), y);){
                    class08303 class083032 = class08303.N((class04490)class044952, (class01929)class070492.method_56673());
                    class070492.method_5647((class08329)class083032);
                    this.N(class018942, class070492.method_73189(), class083032.y());
                }
                this.N("debug.inspect.client.entity", new Object[0]);
                return;
            }
        }
    }

    private void N(class00500 class005002, class07209 class072092, @Nullable class07001 class070012) {
        StringBuilder stringBuilder = new StringBuilder(class00892.N((class00500)class005002));
        if (class070012 != null) {
            stringBuilder.append(class070012);
        }
        String string = String.format(Locale.ROOT, "/setblock %d %d %d %s", class072092.method_10263(), class072092.method_10264(), class072092.method_10260(), stringBuilder);
        this.N(string);
    }

    private void N(class01894 class018942, class06889 class068892, @Nullable class07001 class070012) {
        String string;
        if (class070012 != null) {
            class070012.b("UUID");
            class070012.b("Pos");
            String string2 = class07717.y((class07709)class070012).getString();
            string = String.format(Locale.ROOT, "/summon %s %.2f %.2f %.2f %s", class018942, class068892.M, class068892.B, class068892.Z, string2);
        } else {
            string = String.format(Locale.ROOT, "/summon %s %.2f %.2f %.2f", class018942, class068892.M, class068892.B, class068892.Z);
        }
        this.N(string);
    }
}

