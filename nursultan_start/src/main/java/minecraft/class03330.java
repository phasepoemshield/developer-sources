/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  java.lang.MatchException
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class00392
 *  minecraft.class01240
 *  minecraft.class01253
 *  minecraft.class01268
 *  minecraft.class01276
 *  minecraft.class01282
 *  minecraft.class02957
 *  minecraft.class03420
 *  minecraft.class03767
 *  minecraft.class03776
 *  minecraft.class03794
 *  minecraft.class04563
 *  minecraft.class04568
 *  minecraft.class04585
 *  minecraft.class04693
 *  minecraft.class04705
 *  minecraft.class04708
 *  minecraft.class04777
 *  minecraft.class04967
 *  minecraft.class04981
 *  minecraft.class05018
 *  minecraft.class05096
 *  minecraft.class05097
 *  minecraft.class05111
 *  minecraft.class05129
 *  minecraft.class05205
 *  minecraft.class05304
 *  minecraft.class05364
 *  minecraft.class05685
 *  minecraft.class05763
 *  minecraft.class05934
 *  minecraft.class05964
 *  minecraft.class06202
 *  minecraft.class06434
 *  minecraft.class07086
 *  minecraft.class07282
 *  minecraft.class07305
 *  minecraft.class07312
 *  minecraft.class08392
 *  net.irisshaders.iris.platform.IrisPlatformHelpers
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.lang.runtime.SwitchBootstraps;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import minecraft.class00392;
import minecraft.class01240;
import minecraft.class01253;
import minecraft.class01268;
import minecraft.class01276;
import minecraft.class01282;
import minecraft.class02957;
import minecraft.class03420;
import minecraft.class03767;
import minecraft.class03776;
import minecraft.class03794;
import minecraft.class04563;
import minecraft.class04568;
import minecraft.class04585;
import minecraft.class04693;
import minecraft.class04705;
import minecraft.class04708;
import minecraft.class04777;
import minecraft.class04967;
import minecraft.class04981;
import minecraft.class05018;
import minecraft.class05096;
import minecraft.class05097;
import minecraft.class05111;
import minecraft.class05129;
import minecraft.class05205;
import minecraft.class05304;
import minecraft.class05364;
import minecraft.class05685;
import minecraft.class05763;
import minecraft.class05934;
import minecraft.class05964;
import minecraft.class06202;
import minecraft.class06434;
import minecraft.class07086;
import minecraft.class07282;
import minecraft.class07305;
import minecraft.class07312;
import minecraft.class08392;
import net.irisshaders.iris.platform.IrisPlatformHelpers;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class03330 {
    private static final Logger y = LogUtils.getLogger();
    public static final class00392 N = class00392.L((String)"quickplay.error.title");
    private static final class00392 L = class00392.L((String)"quickplay.error.invalid_identifier");
    private static final class00392 u = class00392.L((String)"quickplay.error.realm_connect");
    private static final class00392 i = class00392.L((String)"quickplay.error.realm_permission");
    private static final class00392 R = class00392.L((String)"gui.toTitle");
    private static final class00392 M = class00392.L((String)"gui.toWorld");
    private static final class00392 B = class00392.L((String)"gui.toRealms");

    private static void y(class06202 class062022, String string) {
        class04563 class045632 = new class04563(class062022);
        class045632.N();
        class04568 class045682 = class045632.N(string);
        if (class045682 == null) {
            class045682 = new class04568(class08392.N((String)"selectServer.defaultName", (Object[])new Object[0]), string, class04585.field_45611);
            class045632.N(class045682, true);
            class045632.y();
        }
        class03420 class034202 = class03420.N((String)string);
        class05763.N((class05096)new class05304((class05096)new class04705()), (class06202)class062022, (class03420)class034202, (class04568)class045682, (boolean)true, null);
    }

    public static void N(class06202 class062022, class01276 class012762, class05111 class051112) {
        if (!class012762.N()) {
            y.error("Quick play disabled");
            class062022.N((class05096)new class04705());
            return;
        }
        class01276 class012763 = class012762;
        Objects.requireNonNull(class012763);
        class01276 class012764 = class012763;
        int n = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class01282.class, class01240.class, class01268.class, class01253.class}, (Object)class012764, (int)n)) {
            default: {
                throw new MatchException(null, null);
            }
            case 0: {
                class01282 class012822 = (class01282)class012764;
                class03330.y(class062022, class012822.y());
                break;
            }
            case 1: {
                class01240 class012402 = (class01240)class012764;
                class03330.N(class062022, class051112, class012402.y());
                break;
            }
            case 2: {
                String string = ((class01268)class012764).y();
                if (class05018.B((String)string)) {
                    string = class03330.N(class062022.NL());
                }
                class03330.N(class062022, string);
                break;
            }
            case 3: {
                class01253 class012532 = (class01253)class012764;
                y.error("Quick play disabled");
                class062022.N((class05096)new class04705());
            }
        }
    }

    private static void N(class06202 class062022, String string, CallbackInfo callbackInfo) {
        if (IrisPlatformHelpers.getInstance().isDevelopmentEnvironment()) {
            callbackInfo.cancel();
            if (!class062022.NL().y(string)) {
                class062022.S().N(string, new class07312(string, class07282.field_9220, false, class07086.field_5807, true, new class07305(class03767.N((class02957)class03794.u, (class02957[])new class02957[]{class03794.L})), class03776.u), class05934.N(), class05964::N, (class05096)class06202.Nq().v_3);
            } else {
                class062022.S().N(string, () -> class062022.N((class05096)new class04705()));
            }
        }
    }

    private static void N(class06202 class062022, class05111 class051112, String string) {
        class04967 class049672;
        long l;
        try {
            l = Long.parseLong(string);
            class049672 = class051112.L();
        }
        catch (NumberFormatException numberFormatException) {
            class05685 class056852 = new class05685((class05096)new class04705());
            class062022.N((class05096)new class05364((class05096)class056852, N, L, B));
            return;
        }
        catch (class05097 class050972) {
            class04705 class047052 = new class04705();
            class062022.N((class05096)new class05364((class05096)class047052, N, u, R));
            return;
        }
        class04981 class049813 = class049672.N().stream().filter(class049812 -> class049812.y == l).findFirst().orElse(null);
        if (class049813 == null) {
            class05685 class056853 = new class05685((class05096)new class04705());
            class062022.N((class05096)new class05364((class05096)class056853, N, i, B));
            return;
        }
        class04705 class047053 = new class04705();
        class062022.N((class05096)new class04708((class05096)class047053, new class05129[]{new class04693((class05096)class047053, class049813)}));
    }

    private static @Nullable String N(class04777 class047772) {
        try {
            List var1 = (List)class047772.N(class047772.y()).get();
            if (var1.isEmpty()) {
                y.warn("no latest singleplayer world found");
                return null;
            }
            return ((class06434)var1.getFirst()).N();
        }
        catch (InterruptedException | ExecutionException exception) {
            y.error("failed to load singleplayer world summaries", (Throwable)exception);
            return null;
        }
    }

    private static void N(class06202 class062022, @Nullable String string) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        class03330.N(class062022, string, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        if (class05018.B((String)string) || !class062022.NL().y(string)) {
            class05205 class052052 = new class05205((class05096)new class04705());
            class062022.N((class05096)new class05364((class05096)class052052, N, L, M));
            return;
        }
        class062022.S().N(string, () -> class062022.N((class05096)new class04705()));
    }
}

