/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10197
 *  com.mojang.authlib.exceptions.MinecraftClientException
 *  com.mojang.authlib.exceptions.MinecraftClientHttpException
 *  com.mojang.authlib.minecraft.UserApiService
 *  com.mojang.authlib.minecraft.report.AbuseReport
 *  com.mojang.authlib.minecraft.report.AbuseReportLimits
 *  com.mojang.authlib.yggdrasil.request.AbuseReportRequest
 *  com.mojang.datafixers.util.Unit
 *  java.lang.MatchException
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class03408
 *  minecraft.class03414
 *  minecraft.class03415
 *  minecraft.class03752
 *  minecraft.class07536
 */
package minecraft;

import Nursultan.class10197;
import com.mojang.authlib.exceptions.MinecraftClientException;
import com.mojang.authlib.exceptions.MinecraftClientHttpException;
import com.mojang.authlib.minecraft.UserApiService;
import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest;
import com.mojang.datafixers.util.Unit;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.Executor;
import minecraft.class00392;
import minecraft.class03408;
import minecraft.class03414;
import minecraft.class03415;
import minecraft.class03752;
import minecraft.class07536;

public final class class03378
extends Record
implements class03414 {
    private final class03415 environment;
    private final UserApiService userApiService;
    private static final class00392 L = class00392.L((String)"gui.abuseReport.send.service_unavailable");
    private static final class00392 u = class00392.L((String)"gui.abuseReport.send.http_error");
    private static final class00392 i = class00392.L((String)"gui.abuseReport.send.json_error");

    public class03415 L() {
        return this.environment;
    }

    public class03378(class03415 class034152, UserApiService userApiService) {
        this.environment = class034152;
        this.userApiService = userApiService;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03378.class, "environment;userApiService", "environment", "userApiService"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03378.class, "environment;userApiService", "environment", "userApiService"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03378.class, "environment;userApiService", "environment", "userApiService"}, this);
    }

    public UserApiService u() {
        return this.userApiService;
    }

    public AbuseReportLimits y() {
        return this.userApiService.getAbuseReportLimits();
    }

    private class00392 N(MinecraftClientHttpException minecraftClientHttpException) {
        return class00392.N((String)"gui.abuseReport.send.error_message", (Object[])new Object[]{minecraftClientHttpException.getMessage()});
    }

    public CompletableFuture<Unit> N(UUID uUID, class03752 class037522, AbuseReport abuseReport) {
        return CompletableFuture.supplyAsync(() -> {
            AbuseReportRequest abuseReportRequest = new AbuseReportRequest(1, uUID, abuseReport, this.environment.y(), this.environment.L(), this.environment.u(), class037522.N());
            try {
                this.userApiService.reportAbuse(abuseReportRequest);
                return Unit.INSTANCE;
            }
            catch (MinecraftClientHttpException minecraftClientHttpException) {
                class00392 class003922 = this.N(minecraftClientHttpException);
                throw new CompletionException((Throwable)new class10197(class003922, (Throwable)minecraftClientHttpException));
            }
            catch (MinecraftClientException minecraftClientException) {
                class00392 class003923 = this.N(minecraftClientException);
                throw new CompletionException((Throwable)new class10197(class003923, (Throwable)minecraftClientException));
            }
        }, (Executor)class07536.Z());
    }

    private class00392 N(MinecraftClientException minecraftClientException) {
        return switch (class03408.N[minecraftClientException.getType().ordinal()]) {
            default -> throw new MatchException(null, null);
            case 1 -> L;
            case 2 -> u;
            case 3 -> i;
        };
    }

    public boolean N() {
        return this.userApiService.canSendReports();
    }
}

