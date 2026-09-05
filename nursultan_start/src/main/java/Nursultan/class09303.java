/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09120
 *  Nursultan.class09250
 *  Nursultan.class10885
 *  Nursultan.class11001
 *  Nursultan.class11108
 *  Nursultan.class11166
 *  Nursultan.class11303
 *  Nursultan.class11540
 *  Nursultan.class11723
 *  Nursultan.class11776
 *  Nursultan.class11938
 *  Nursultan.class11991
 *  Nursultan.class11995
 *  Nursultan.class12020
 *  com.mojang.authlib.minecraft.UserApiService
 *  com.mojang.authlib.minecraft.UserApiService$UserProperties
 *  com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService
 *  java.lang.MatchException
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class02051
 *  minecraft.class03323
 *  minecraft.class03409
 *  minecraft.class03415
 *  minecraft.class03448
 *  minecraft.class03930
 *  minecraft.class04453
 *  minecraft.class04771
 *  minecraft.class05463
 *  minecraft.class06202
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package Nursultan;

import Nursultan.class09120;
import Nursultan.class09250;
import Nursultan.class10885;
import Nursultan.class11001;
import Nursultan.class11108;
import Nursultan.class11166;
import Nursultan.class11303;
import Nursultan.class11540;
import Nursultan.class11723;
import Nursultan.class11776;
import Nursultan.class11938;
import Nursultan.class11991;
import Nursultan.class11995;
import Nursultan.class12020;
import com.mojang.authlib.minecraft.UserApiService;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import java.io.File;
import java.lang.runtime.SwitchBootstraps;
import java.net.Proxy;
import java.nio.file.Path;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import minecraft.class02051;
import minecraft.class03323;
import minecraft.class03409;
import minecraft.class03415;
import minecraft.class03448;
import minecraft.class03930;
import minecraft.class04453;
import minecraft.class04771;
import minecraft.class05463;
import minecraft.class06202;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class09303 {
    public static Object N_0;

    private class09303() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    static {
        class09303.y();
        class09303.N();
        N_0 = LogManager.getLogger(String.class);
    }

    private static void y() {
    }

    public static boolean N(class09250 class092502) {
        class11776 class117762 = class092502.i();
        Objects.requireNonNull(class117762);
        class11776 class117763 = class117762;
        int n = 0;
        return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class11991.class, class11166.class}, (Object)class117763, (int)n)) {
            default -> throw new MatchException(null, null);
            case 0 -> {
                class11991 var3_3 = (class11991)class117763;
                yield class09303.N(var3_3.u(), var3_3.y());
            }
            case 1 -> {
                class11166 var4_4 = (class11166)class117763;
                yield class09303.N(class092502, var4_4);
            }
        };
    }

    private static void N() {
        N_0 = null;
    }

    public static boolean N(String string, UUID uUID) {
        UserApiService.UserProperties userProperties;
        class06202 class062022 = class06202.Nq();
        if ((class03448)class062022.T_3 != null || (class04453)class062022.T_4 != null || class062022.NE() != null) {
            return false;
        }
        class04771 class047712 = new class04771(string, uUID, "", Optional.empty(), Optional.empty());
        class03930 class039302 = class03930.N((YggdrasilAuthenticationService)YggdrasilAuthenticationService.createOffline((Proxy)class062022.NJ()), (File)((File)class062022.l_1));
        UserApiService userApiService = UserApiService.OFFLINE;
        try {
            userProperties = userApiService.fetchProperties();
        }
        catch (Throwable throwable) {
            userProperties = UserApiService.OFFLINE_PROPERTIES;
        }
        class05463 class054632 = new class05463(class062022, userApiService);
        class03323 class033232 = new class03323(class062022, userApiService, class047712);
        class02051 class020512 = class02051.N((UserApiService)userApiService, (class04771)class047712, (Path)((File)class062022.l_1).toPath());
        class03409 class034092 = class03409.N((class03415)class03415.N(), (UserApiService)userApiService);
        UserApiService.UserProperties userProperties2 = userProperties;
        Runnable runnable = () -> {
            class11995 class119952 = (class11995)class062022;
            class062022.i_2 = class047712;
            class119952.N(class039302);
            class119952.N(CompletableFuture.completedFuture(null));
            class119952.N(userApiService);
            class119952.y(CompletableFuture.completedFuture(userProperties2));
            class119952.N(class054632);
            class119952.N(class033232);
            class119952.N(class020512);
            class119952.N(class034092);
            class062022.yZ();
            ((Logger)N_0).info("Switched offline account to {} ({})", (Object)string, (Object)uUID);
        };
        if (class062022.E_()) {
            runnable.run();
        } else {
            class062022.execute(runnable);
        }
        return true;
    }

    public static boolean N(class09250 class092502, class11166 class111662) {
        class06202 class062022 = class06202.Nq();
        if ((class03448)class062022.T_3 != null || (class04453)class062022.T_4 != null || class062022.NE() != null) {
            return false;
        }
        String string = class09120.N((byte[])class111662.R());
        if (string == null) {
            ((Logger)N_0).warn("Microsoft account {} has no stored token", (Object)class111662.u());
            return false;
        }
        UUID uUID = class111662.y();
        class11723.N((UUID)uUID);
        Thread thread = new Thread(() -> {
            try {
                class10885 class108852 = class11108.N((String)string);
                class11540 class115402 = class11108.N((class10885)class108852);
                byte[] byArray = class09120.N((String)class115402.u());
                class09250 class092503 = new class09250((class11776)new class11166(class111662.i(), class115402.N(), class115402.i(), byArray), class092502.y(), class092502.M());
                class062022.execute(() -> {
                    class11938.s().L(class092503);
                    class09303.N(class115402.i(), class115402.N(), class115402.y(), class115402.L());
                    class11723.L((UUID)uUID);
                });
            }
            catch (Throwable throwable) {
                String string2;
                ((Logger)N_0).error("Microsoft re-authentication failed", throwable);
                if (throwable instanceof class11001) {
                    class11001 class110012 = (class11001)throwable;
                    string2 = class110012.N();
                } else {
                    string2 = "account.modal.microsoft.error.generic";
                }
                String string3 = string2;
                class11723.N((UUID)uUID, (String)string3);
                class11303.y((Object)("Microsoft: " + class12020.N((String)string3)));
            }
        }, "Nursultan-MS-Reauth");
        thread.setDaemon(true);
        thread.start();
        return true;
    }

    public static boolean N(String string, UUID uUID, String string2, String string3) {
        UserApiService.UserProperties userProperties;
        UserApiService userApiService;
        class06202 class062022 = class06202.Nq();
        if ((class03448)class062022.T_3 != null || (class04453)class062022.T_4 != null || class062022.NE() != null) {
            return false;
        }
        class04771 class047712 = new class04771(string, uUID, string2, Optional.ofNullable(string3), Optional.empty());
        YggdrasilAuthenticationService yggdrasilAuthenticationService = new YggdrasilAuthenticationService(class062022.NJ());
        class03930 class039302 = class03930.N((YggdrasilAuthenticationService)yggdrasilAuthenticationService, (File)((File)class062022.l_1));
        try {
            userApiService = yggdrasilAuthenticationService.createUserApiService(string2);
        }
        catch (Throwable throwable) {
            userApiService = UserApiService.OFFLINE;
        }
        try {
            userProperties = userApiService.fetchProperties();
        }
        catch (Throwable throwable) {
            userProperties = UserApiService.OFFLINE_PROPERTIES;
        }
        class05463 class054632 = new class05463(class062022, userApiService);
        class03323 class033232 = new class03323(class062022, userApiService, class047712);
        class02051 class020512 = class02051.N((UserApiService)userApiService, (class04771)class047712, (Path)((File)class062022.l_1).toPath());
        class03409 class034092 = class03409.N((class03415)class03415.N(), (UserApiService)userApiService);
        UserApiService userApiService2 = userApiService;
        UserApiService.UserProperties userProperties2 = userProperties;
        Runnable runnable = () -> {
            class11995 class119952 = (class11995)class062022;
            class062022.i_2 = class047712;
            class119952.N(class039302);
            class119952.N(CompletableFuture.completedFuture(null));
            class119952.N(userApiService2);
            class119952.y(CompletableFuture.completedFuture(userProperties2));
            class119952.N(class054632);
            class119952.N(class033232);
            class119952.N(class020512);
            class119952.N(class034092);
            class062022.yZ();
            ((Logger)N_0).info("Switched Microsoft account to {} ({})", (Object)string, (Object)uUID);
        };
        if (class062022.E_()) {
            runnable.run();
        } else {
            class062022.execute(runnable);
        }
        return true;
    }
}

