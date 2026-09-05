/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.minecraft.UserApiService
 *  com.mojang.authlib.minecraft.report.AbuseReport
 *  com.mojang.authlib.minecraft.report.AbuseReportLimits
 *  com.mojang.datafixers.util.Unit
 *  minecraft.class03378
 *  minecraft.class03752
 */
package minecraft;

import com.mojang.authlib.minecraft.UserApiService;
import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Unit;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import minecraft.class03378;
import minecraft.class03415;
import minecraft.class03752;

public interface class03414 {
    default public AbuseReportLimits y() {
        return AbuseReportLimits.DEFAULTS;
    }

    public static class03414 N(class03415 class034152, UserApiService userApiService) {
        return new class03378(class034152, userApiService);
    }

    public boolean N();

    public CompletableFuture<Unit> N(UUID var1, class03752 var2, AbuseReport var3);
}

