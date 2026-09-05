/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.version.BlockedProtocolVersions
 *  com.viaversion.viaversion.libs.gson.JsonElement
 */
package com.viaversion.viaversion.api.configuration;

import com.viaversion.viaversion.api.configuration.Config;
import com.viaversion.viaversion.api.configuration.RateLimitConfig;
import com.viaversion.viaversion.api.minecraft.WorldIdentifiers;
import com.viaversion.viaversion.api.protocol.version.BlockedProtocolVersions;
import com.viaversion.viaversion.libs.gson.JsonElement;
import java.util.concurrent.TimeUnit;

public interface ViaVersionConfig
extends Config {
    public int maxErrorLength();

    public boolean enforceSecureChat();

    public boolean use1_8HitboxMargin();

    public boolean isCheckForUpdates();

    public boolean cancelBlockSounds();

    public boolean logBlockedJoins();

    public boolean cache1_17Light();

    public boolean sendPlayerDetails();

    public boolean is1_14HealthNaNFix();

    public double getHologramYOffset();

    @Deprecated(forRemoval=true)
    default public int getWarningPPS() {
        return this.getPacketTrackerConfig().warningRate();
    }

    @Deprecated(forRemoval=true)
    default public int getMaxWarnings() {
        return this.getPacketTrackerConfig().maxWarnings();
    }

    public boolean is1_14HitboxFix();

    public boolean isSnowCollisionFix();

    public boolean sendServerDetails();

    public boolean isPreventCollision();

    public boolean isItemCache();

    public boolean isReplacePistons();

    public boolean isChunkBorderFix();

    public boolean is1_9HitboxFix();

    public boolean isVineClimbFix();

    public boolean isNMSPlayerTicking();

    public boolean isArmorToggleFix();

    public void setCheckForUpdates(boolean var1);

    public boolean isShieldBlocking();

    public boolean isBossbarPatch();

    public boolean isHologramPatch();

    @Deprecated(forRemoval=true)
    default public int getTrackingPeriod() {
        return (int)TimeUnit.NANOSECONDS.toSeconds(this.getPacketTrackerConfig().trackingPeriodNanos());
    }

    public boolean isAutoTeam();

    @Deprecated(forRemoval=true)
    default public int getMaxPPS() {
        return this.getPacketTrackerConfig().maxRate();
    }

    @Deprecated(forRemoval=true)
    default public boolean isSuppressMetadataErrors() {
        return !this.logEntityDataErrors();
    }

    public boolean is1_15InstantRespawn();

    public JsonElement get1_17ResourcePackPrompt();

    public boolean isNonFullBlockLightFix();

    public boolean isTruncate1_14Books();

    public WorldIdentifiers get1_16WorldNamesMap();

    @Deprecated(forRemoval=true)
    default public String getMaxPPSKickMessage() {
        return this.getPacketTrackerConfig().maxRateKickMessage();
    }

    public boolean isLeftHandedHandling();

    @Deprecated(forRemoval=true)
    default public String getMaxWarningsKickMessage() {
        return this.getPacketTrackerConfig().warningKickMessage();
    }

    public boolean fix1_21PlacementRotation();

    public boolean is1_13TeamColourFix();

    public boolean translateOcelotToCat();

    public boolean logEntityDataErrors();

    public boolean handleInvalidItemCount();

    public boolean hideScoreboardNumbers();

    public boolean isSimulatePlayerTick();

    public BlockedProtocolVersions blockedProtocolVersions();

    public boolean cancelSwingInInventory();

    public RateLimitConfig getPacketSizeTrackerConfig();

    public int getPistonReplacementId();

    public boolean isNewEffectIndicator();

    public boolean isBossbarAntiflicker();

    public String getReloadDisconnectMsg();

    public boolean logOtherConversionWarnings();

    public boolean isDisable1_13AutoComplete();

    public String getBlockConnectionMethod();

    public boolean isSendSupportedVersions();

    public boolean isReduceBlockStorageMemory();

    public boolean isNoDelayShieldBlocking();

    public boolean isPistonAnimationPatch();

    public RateLimitConfig getPacketTrackerConfig();

    public boolean is1_12QuickMoveActionFix();

    public String getBlockedDisconnectMsg();

    public boolean isInfestedBlocksFix();

    public boolean isStemWhenBlockAbove();

    public int get1_13TabCompleteDelay();

    public boolean isShowNewDeathMessages();

    public boolean isShowShieldWhenSwordInHand();

    public boolean isIgnoreLong1_16ChannelNames();

    public boolean isForcedUse1_17ResourcePack();

    @Deprecated(forRemoval=true)
    default public boolean isSuppressConversionWarnings() {
        return !this.logOtherConversionWarnings();
    }

    public boolean logTextComponentConversionErrors();

    public boolean isServersideBlockConnections();

    public boolean shouldRegisterUserConnectionOnJoin();

    @Deprecated(forRemoval=true)
    default public boolean isSuppressTextComponentConversionWarnings() {
        return !this.logTextComponentConversionErrors();
    }
}

