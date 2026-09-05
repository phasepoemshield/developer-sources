/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.configuration.RateLimitConfig
 *  com.viaversion.viaversion.api.configuration.ViaVersionConfig
 *  com.viaversion.viaversion.api.minecraft.WorldIdentifiers
 *  com.viaversion.viaversion.api.protocol.version.BlockedProtocolVersions
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectOpenHashSet
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectSet
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.protocol.BlockedProtocolVersionsImpl
 *  com.viaversion.viaversion.util.Config
 *  com.viaversion.viaversion.util.ConfigSection
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.configuration;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.configuration.RateLimitConfig;
import com.viaversion.viaversion.api.configuration.ViaVersionConfig;
import com.viaversion.viaversion.api.minecraft.WorldIdentifiers;
import com.viaversion.viaversion.api.protocol.version.BlockedProtocolVersions;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectOpenHashSet;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectSet;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.protocol.BlockedProtocolVersionsImpl;
import com.viaversion.viaversion.util.Config;
import com.viaversion.viaversion.util.ConfigSection;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.qual.Nullable;

public class AbstractViaConfig
extends Config
implements ViaVersionConfig {
    public static final List<String> BUKKIT_ONLY_OPTIONS = Arrays.asList("register-userconnections-on-join", "quick-move-action-fix", "change-1_9-hitbox", "change-1_14-hitbox", "blockconnection-method", "armor-toggle-fix", "use-new-deathmessages", "item-cache", "nms-player-ticking");
    public static final List<String> VELOCITY_ONLY_OPTIONS = Arrays.asList("velocity-ping-interval", "velocity-ping-save", "velocity-servers");
    private boolean checkForUpdates;
    private boolean preventCollision;
    private boolean useNewEffectIndicator;
    private boolean logEntityDataErrors;
    private boolean shieldBlocking;
    private boolean noDelayShieldBlocking;
    private boolean showShieldWhenSwordInHand;
    private boolean hologramPatch;
    private boolean pistonAnimationPatch;
    private boolean bossbarPatch;
    private boolean bossbarAntiFlicker;
    private double hologramOffset;
    private RateLimitConfig packetTrackerConfig;
    private RateLimitConfig packetSizeTrackerConfig;
    private boolean sendSupportedVersions;
    private boolean simulatePlayerTick;
    private boolean replacePistons;
    private int pistonReplacementId;
    private boolean chunkBorderFix;
    private boolean autoTeam;
    private BlockedProtocolVersions blockedProtocolVersions;
    private String blockedDisconnectMessage;
    private boolean logBlockedJoins;
    private String reloadDisconnectMessage;
    private boolean logOtherConversionErrors;
    private boolean logTextComponentConversionErrors;
    private boolean disable1_13TabComplete;
    private boolean teamColourFix;
    private boolean serversideBlockConnections;
    private boolean reduceBlockStorageMemory;
    private boolean flowerStemWhenBlockAbove;
    private boolean vineClimbFix;
    private boolean snowCollisionFix;
    private boolean infestedBlocksFix;
    private int tabCompleteDelay;
    private boolean truncate1_14Books;
    private boolean leftHandedHandling;
    private boolean fullBlockLightFix;
    private boolean healthNaNFix;
    private boolean instantRespawn;
    private boolean ignoreLongChannelNames;
    private boolean forcedUse1_17ResourcePack;
    private JsonElement resourcePack1_17PromptMessage;
    private WorldIdentifiers map1_16WorldNames;
    private boolean cache1_17Light;
    private boolean translateOcelotToCat;
    private boolean enforceSecureChat;
    private boolean handleInvalidItemCount;
    private boolean cancelBlockSounds;
    private boolean hideScoreboardNumbers;
    private boolean fix1_21PlacementRotation;
    private boolean cancelSwingInInventory;
    private int maxErrorLength;
    private boolean use1_8HitboxMargin;
    private boolean sendPlayerDetails;
    private boolean sendServerDetails;

    private @Nullable ProtocolVersion protocolVersion(String s) {
        ProtocolVersion protocolVersion = ProtocolVersion.getClosest((String)s);
        if (protocolVersion == null) {
            this.logger.warning("Unknown protocol version in block-versions: " + s);
            return null;
        }
        return protocolVersion;
    }

    public void reload() {
        super.reload();
        if (this.updateConfig()) {
            this.save();
        }
        this.loadFields();
    }

    public AbstractViaConfig(File configFile, Logger logger) {
        super(configFile, logger);
    }

    public int maxErrorLength() {
        return this.maxErrorLength;
    }

    public boolean enforceSecureChat() {
        return this.enforceSecureChat;
    }

    protected boolean updateConfig() {
        ConfigSection original = this.originalRootSection();
        if (original == null) {
            return false;
        }
        boolean modified = false;
        if (original.contains("max-pps")) {
            ConfigSection section = this.getSection("packet-limiter");
            section.set("max-per-second", (Object)original.getInt("max-pps", -1));
            section.set("max-per-second-kick-message", (Object)original.getString("max-pps-kick-msg", "You are sending too many packets!"));
            section.set("sustained-max-per-second", (Object)original.getInt("tracking-warning-pps", -1));
            section.set("sustained-threshold", (Object)original.getInt("tracking-max-warnings", 3));
            section.set("sustained-period-seconds", (Object)original.getInt("tracking-period", 7));
            section.set("sustained-kick-message", (Object)original.getString("tracking-max-kick-msg", "You are sending too many packets, :("));
            modified = true;
        }
        int initialConfigVersion = original.getInt("init-config-version", 0);
        int configVersion = original.getInt("config-version", 0);
        boolean migrateDefaults = original.getBoolean("migrate-default-config-changes", true);
        if (configVersion < 1 && migrateDefaults) {
            ConfigSection packetLimiterSection = this.getSection("packet-limiter");
            int sustainedMax = packetLimiterSection.getInt("sustained-max-per-second", 0);
            if (sustainedMax == 120 || sustainedMax == 150) {
                packetLimiterSection.set("sustained-max-per-second", (Object)200);
                modified = true;
            }
            if (packetLimiterSection.getInt("sustained-period-seconds", 0) == 6) {
                packetLimiterSection.set("sustained-period-seconds", (Object)7);
                modified = true;
            }
            ConfigSection loggingSection = this.getSection("logging");
            loggingSection.set("log-blocked-joins", (Object)original.getBoolean("log-blocked-joins", false));
            loggingSection.set("log-entity-data-errors", (Object)(!original.getBoolean("suppress-metadata-errors", false) ? 1 : 0));
            loggingSection.set("max-error-length", (Object)original.getInt("max-error-length", 1500));
        }
        return modified;
    }

    public boolean use1_8HitboxMargin() {
        return this.use1_8HitboxMargin;
    }

    public boolean isCheckForUpdates() {
        return this.checkForUpdates;
    }

    public boolean cancelBlockSounds() {
        return this.cancelBlockSounds;
    }

    public boolean logBlockedJoins() {
        return this.logBlockedJoins;
    }

    public boolean cache1_17Light() {
        return this.cache1_17Light;
    }

    public boolean sendPlayerDetails() {
        return this.sendPlayerDetails;
    }

    public boolean is1_14HealthNaNFix() {
        return this.healthNaNFix;
    }

    public double getHologramYOffset() {
        return this.hologramOffset;
    }

    public boolean is1_14HitboxFix() {
        return false;
    }

    public boolean isSnowCollisionFix() {
        return this.snowCollisionFix;
    }

    public boolean sendServerDetails() {
        return this.sendServerDetails;
    }

    public boolean isPreventCollision() {
        return this.preventCollision;
    }

    public boolean isItemCache() {
        return false;
    }

    public boolean isReplacePistons() {
        return this.replacePistons;
    }

    public boolean isChunkBorderFix() {
        return this.chunkBorderFix;
    }

    public boolean is1_9HitboxFix() {
        return false;
    }

    public boolean isVineClimbFix() {
        return this.vineClimbFix;
    }

    public boolean isNMSPlayerTicking() {
        return false;
    }

    public boolean isArmorToggleFix() {
        return false;
    }

    public void setCheckForUpdates(boolean checkForUpdates) {
        this.checkForUpdates = checkForUpdates;
        this.set("checkforupdates", checkForUpdates);
    }

    public boolean isShieldBlocking() {
        return this.shieldBlocking;
    }

    public boolean isBossbarPatch() {
        return this.bossbarPatch;
    }

    public boolean isHologramPatch() {
        return this.hologramPatch;
    }

    public boolean isAutoTeam() {
        return this.preventCollision && this.autoTeam;
    }

    protected void loadFields() {
        this.checkForUpdates = this.getBoolean("check-for-updates", true);
        this.preventCollision = this.getBoolean("prevent-collision", true);
        this.useNewEffectIndicator = this.getBoolean("use-new-effect-indicator", true);
        this.shieldBlocking = this.getBoolean("shield-blocking", true);
        this.noDelayShieldBlocking = this.getBoolean("no-delay-shield-blocking", false);
        this.showShieldWhenSwordInHand = this.getBoolean("show-shield-when-sword-in-hand", false);
        this.hologramPatch = this.getBoolean("hologram-patch", false);
        this.pistonAnimationPatch = this.getBoolean("piston-animation-patch", false);
        this.bossbarPatch = this.getBoolean("bossbar-patch", true);
        this.bossbarAntiFlicker = this.getBoolean("bossbar-anti-flicker", false);
        this.hologramOffset = this.getDouble("hologram-y", -0.96);
        this.sendSupportedVersions = this.getBoolean("send-supported-versions", false);
        this.simulatePlayerTick = this.getBoolean("simulate-pt", true);
        this.replacePistons = this.getBoolean("replace-pistons", false);
        this.pistonReplacementId = this.getInt("replacement-piston-id", 0);
        this.chunkBorderFix = this.getBoolean("chunk-border-fix", false);
        this.autoTeam = this.getBoolean("auto-team", true);
        this.blockedProtocolVersions = this.loadBlockedProtocolVersions();
        this.blockedDisconnectMessage = this.getString("block-disconnect-msg", "You are using an unsupported Minecraft version!");
        this.reloadDisconnectMessage = this.getString("reload-disconnect-msg", "Server reload, please rejoin!");
        this.teamColourFix = this.getBoolean("team-colour-fix", true);
        this.disable1_13TabComplete = this.getBoolean("disable-1_13-auto-complete", false);
        this.serversideBlockConnections = this.getBoolean("serverside-blockconnections", true);
        this.reduceBlockStorageMemory = this.getBoolean("reduce-blockstorage-memory", false);
        this.flowerStemWhenBlockAbove = this.getBoolean("flowerstem-when-block-above", false);
        this.vineClimbFix = this.getBoolean("vine-climb-fix", false);
        this.snowCollisionFix = this.getBoolean("fix-low-snow-collision", false);
        this.infestedBlocksFix = this.getBoolean("fix-infested-block-breaking", true);
        this.tabCompleteDelay = this.getInt("1_13-tab-complete-delay", 0);
        this.truncate1_14Books = this.getBoolean("truncate-1_14-books", false);
        this.leftHandedHandling = this.getBoolean("left-handed-handling", true);
        this.fullBlockLightFix = this.getBoolean("fix-non-full-blocklight", false);
        this.healthNaNFix = this.getBoolean("fix-1_14-health-nan", true);
        this.instantRespawn = this.getBoolean("use-1_15-instant-respawn", false);
        this.ignoreLongChannelNames = this.getBoolean("ignore-long-1_16-channel-names", true);
        this.forcedUse1_17ResourcePack = this.getBoolean("forced-use-1_17-resource-pack", false);
        this.resourcePack1_17PromptMessage = this.getSerializedComponent("resource-pack-1_17-prompt");
        Map worlds = (Map)this.get("map-1_16-world-names", new HashMap());
        this.map1_16WorldNames = new WorldIdentifiers(worlds.getOrDefault("overworld", "minecraft:overworld"), worlds.getOrDefault("nether", "minecraft:the_nether"), worlds.getOrDefault("end", "minecraft:the_end"));
        this.cache1_17Light = this.getBoolean("cache-1_17-light", true);
        this.translateOcelotToCat = this.getBoolean("translate-ocelot-to-cat", true);
        this.enforceSecureChat = this.getBoolean("enforce-secure-chat", false);
        this.handleInvalidItemCount = this.getBoolean("handle-invalid-item-count", false);
        this.cancelBlockSounds = this.getBoolean("cancel-block-sounds", true);
        this.hideScoreboardNumbers = this.getBoolean("hide-scoreboard-numbers", false);
        this.fix1_21PlacementRotation = this.getBoolean("fix-1_21-placement-rotation", true);
        this.cancelSwingInInventory = this.getBoolean("cancel-swing-in-inventory", true);
        this.use1_8HitboxMargin = this.getBoolean("use-1_8-hitbox-margin", true);
        this.sendPlayerDetails = this.getBoolean("send-player-details", true);
        this.sendServerDetails = this.getBoolean("send-server-details", true);
        this.packetTrackerConfig = this.loadRateLimitConfig(this.getSection("packet-limiter"), "%pps", 1);
        this.packetSizeTrackerConfig = this.loadRateLimitConfig(this.getSection("packet-size-limiter"), "%bps", 1024);
        ConfigSection loggingSection = this.getSection("logging");
        this.logBlockedJoins = loggingSection.getBoolean("log-blocked-joins", false);
        this.logEntityDataErrors = loggingSection.getBoolean("log-entity-data-errors", true);
        this.logTextComponentConversionErrors = loggingSection.getBoolean("log-text-component-conversion-errors", false);
        this.logOtherConversionErrors = loggingSection.getBoolean("log-other-conversion-warnings", false);
        this.maxErrorLength = loggingSection.getInt("max-error-length", 1500);
    }

    public boolean is1_15InstantRespawn() {
        return this.instantRespawn;
    }

    public JsonElement get1_17ResourcePackPrompt() {
        return this.resourcePack1_17PromptMessage;
    }

    public boolean isNonFullBlockLightFix() {
        return this.fullBlockLightFix;
    }

    public boolean isTruncate1_14Books() {
        return this.truncate1_14Books;
    }

    public WorldIdentifiers get1_16WorldNamesMap() {
        return this.map1_16WorldNames;
    }

    public boolean isLeftHandedHandling() {
        return this.leftHandedHandling;
    }

    public boolean fix1_21PlacementRotation() {
        return this.fix1_21PlacementRotation;
    }

    public boolean is1_13TeamColourFix() {
        return this.teamColourFix;
    }

    public boolean translateOcelotToCat() {
        return this.translateOcelotToCat;
    }

    public boolean logEntityDataErrors() {
        return this.logEntityDataErrors || Via.getManager().isDebug();
    }

    public boolean handleInvalidItemCount() {
        return this.handleInvalidItemCount;
    }

    public boolean hideScoreboardNumbers() {
        return this.hideScoreboardNumbers;
    }

    public boolean isSimulatePlayerTick() {
        return this.simulatePlayerTick;
    }

    public BlockedProtocolVersions blockedProtocolVersions() {
        return this.blockedProtocolVersions;
    }

    public List<String> getUnsupportedOptions() {
        ArrayList<String> unsupportedOptions = new ArrayList<String>(BUKKIT_ONLY_OPTIONS);
        unsupportedOptions.addAll(VELOCITY_ONLY_OPTIONS);
        unsupportedOptions.add("check-for-updates");
        return unsupportedOptions;
    }

    public boolean cancelSwingInInventory() {
        return this.cancelSwingInInventory;
    }

    public RateLimitConfig getPacketSizeTrackerConfig() {
        return this.packetSizeTrackerConfig;
    }

    public int getPistonReplacementId() {
        return this.pistonReplacementId;
    }

    public boolean isNewEffectIndicator() {
        return this.useNewEffectIndicator;
    }

    public boolean isBossbarAntiflicker() {
        return this.bossbarAntiFlicker;
    }

    public String getReloadDisconnectMsg() {
        return this.reloadDisconnectMessage;
    }

    public boolean logOtherConversionWarnings() {
        return this.logOtherConversionErrors || Via.getManager().isDebug();
    }

    public boolean isDisable1_13AutoComplete() {
        return this.disable1_13TabComplete;
    }

    public String getBlockConnectionMethod() {
        return "packet";
    }

    public boolean isSendSupportedVersions() {
        return this.sendSupportedVersions;
    }

    public boolean isReduceBlockStorageMemory() {
        return this.reduceBlockStorageMemory;
    }

    public boolean isNoDelayShieldBlocking() {
        return this.noDelayShieldBlocking;
    }

    public boolean isPistonAnimationPatch() {
        return this.pistonAnimationPatch;
    }

    public RateLimitConfig getPacketTrackerConfig() {
        return this.packetTrackerConfig;
    }

    public boolean is1_12QuickMoveActionFix() {
        return false;
    }

    public String getBlockedDisconnectMsg() {
        return this.blockedDisconnectMessage;
    }

    public boolean isInfestedBlocksFix() {
        return this.infestedBlocksFix;
    }

    public boolean isStemWhenBlockAbove() {
        return this.flowerStemWhenBlockAbove;
    }

    public int get1_13TabCompleteDelay() {
        return this.tabCompleteDelay;
    }

    public boolean isShowNewDeathMessages() {
        return false;
    }

    private RateLimitConfig loadRateLimitConfig(ConfigSection section, String placeholder, int countMultiplier) {
        int maxPerSecond = section.getInt("max-per-second", -1);
        int sustainedMaxPerSecond = section.getInt("sustained-max-per-second", -1);
        return new RateLimitConfig(section.getBoolean("enabled", true), maxPerSecond != -1 ? maxPerSecond * countMultiplier : -1, section.getString("max-per-second-kick-message", "You are sending too many packets!"), sustainedMaxPerSecond != -1 ? sustainedMaxPerSecond * countMultiplier : -1, section.getInt("sustained-threshold", 3), TimeUnit.SECONDS.toNanos(section.getInt("sustained-period-seconds", 6)), section.getString("sustained-kick-message", "You are sending too many packets, :("), placeholder);
    }

    public boolean isShowShieldWhenSwordInHand() {
        return this.showShieldWhenSwordInHand;
    }

    public boolean isIgnoreLong1_16ChannelNames() {
        return this.ignoreLongChannelNames;
    }

    private BlockedProtocolVersions loadBlockedProtocolVersions() {
        List blockProtocols = this.getListSafe("block-protocols", Integer.class, "Invalid blocked version protocol found in config: '%s'");
        List blockVersions = this.getListSafe("block-versions", String.class, "Invalid blocked version found in config: '%s'");
        ObjectSet blockedProtocols = (ObjectSet)blockProtocols.stream().map(ProtocolVersion::getProtocol).collect(ObjectOpenHashSet::of, Set::add, Set::addAll);
        ProtocolVersion lowerBound = ProtocolVersion.unknown;
        ProtocolVersion upperBound = ProtocolVersion.unknown;
        for (String s : blockVersions) {
            ProtocolVersion protocolVersion;
            if (s.isEmpty()) continue;
            char c = s.charAt(0);
            if (c == '<' || c == '>') {
                protocolVersion = this.protocolVersion(s.substring(1));
                if (protocolVersion == null) continue;
                if (c == '<') {
                    if (lowerBound.isKnown()) {
                        this.logger.warning("Already set lower bound " + String.valueOf(lowerBound) + " overridden by " + protocolVersion.getName());
                    }
                    lowerBound = protocolVersion;
                    continue;
                }
                if (upperBound.isKnown()) {
                    this.logger.warning("Already set upper bound " + String.valueOf(upperBound) + " overridden by " + protocolVersion.getName());
                }
                upperBound = protocolVersion;
                continue;
            }
            protocolVersion = this.protocolVersion(s);
            if (protocolVersion == null || blockedProtocols.add((Object)protocolVersion)) continue;
            this.logger.warning("Duplicated blocked protocol version " + String.valueOf(protocolVersion));
        }
        if (lowerBound.isKnown() || upperBound.isKnown()) {
            ProtocolVersion finalLowerBound = lowerBound;
            ProtocolVersion finalUpperBound = upperBound;
            blockedProtocols.removeIf(version -> {
                if (finalLowerBound.isKnown() && version.olderThan(finalLowerBound) || finalUpperBound.isKnown() && version.newerThan(finalUpperBound)) {
                    this.logger.warning("Blocked protocol version " + String.valueOf(version) + " already covered by upper or lower bound");
                    return true;
                }
                return false;
            });
        }
        return new BlockedProtocolVersionsImpl((Set)blockedProtocols, lowerBound, upperBound);
    }

    public boolean isForcedUse1_17ResourcePack() {
        return this.forcedUse1_17ResourcePack;
    }

    public boolean logTextComponentConversionErrors() {
        return this.logTextComponentConversionErrors || Via.getManager().isDebug();
    }

    public boolean isServersideBlockConnections() {
        return this.serversideBlockConnections;
    }

    public boolean shouldRegisterUserConnectionOnJoin() {
        return false;
    }
}

