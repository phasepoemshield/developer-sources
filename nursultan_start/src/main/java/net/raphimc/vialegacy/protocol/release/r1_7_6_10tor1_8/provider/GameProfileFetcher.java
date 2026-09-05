/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheBuilder
 *  com.google.common.cache.CacheLoader
 *  com.google.common.cache.LoadingCache
 *  com.google.common.util.concurrent.ExecutionError
 *  com.google.common.util.concurrent.UncheckedExecutionException
 *  com.viaversion.viaversion.api.minecraft.GameProfile
 *  com.viaversion.viaversion.api.platform.providers.Provider
 *  net.raphimc.vialegacy.ViaLegacy
 *  net.raphimc.vialegacy.api.util.GameProfileUtil
 */
package net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.provider;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.util.concurrent.ExecutionError;
import com.google.common.util.concurrent.UncheckedExecutionException;
import com.viaversion.viaversion.api.minecraft.GameProfile;
import com.viaversion.viaversion.api.platform.providers.Provider;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.regex.Pattern;
import net.raphimc.vialegacy.ViaLegacy;
import net.raphimc.vialegacy.api.util.GameProfileUtil;

public abstract class GameProfileFetcher
implements Provider {
    private static final GameProfile NULL_GAME_PROFILE = new GameProfile(null, null);
    private static final Pattern COLOR_CODE_PATTERN = Pattern.compile("(?i)\\u00A7[0-9A-FK-OR]");
    private final LoadingCache<String, UUID> uuidCache = CacheBuilder.newBuilder().expireAfterWrite(6L, TimeUnit.HOURS).build((CacheLoader)new CacheLoader<String, UUID>(){

        public UUID load(String key) throws Exception {
            return GameProfileFetcher.this.loadMojangUuid(key);
        }
    });
    private final LoadingCache<UUID, GameProfile> gameProfileCache = CacheBuilder.newBuilder().expireAfterWrite(6L, TimeUnit.HOURS).build((CacheLoader)new CacheLoader<UUID, GameProfile>(){

        public GameProfile load(UUID key) throws Exception {
            return GameProfileFetcher.this.loadGameProfile(key);
        }
    });

    public CompletableFuture<GameProfile> getGameProfileAsync(UUID uuid) {
        if (this.isGameProfileLoaded(uuid)) {
            return CompletableFuture.completedFuture(this.getGameProfile(uuid));
        }
        return CompletableFuture.supplyAsync(() -> this.getGameProfile(uuid));
    }

    public GameProfile getGameProfile(UUID uuid) {
        try {
            GameProfile value = (GameProfile)this.gameProfileCache.get((Object)uuid);
            if (NULL_GAME_PROFILE.equals((Object)value)) {
                return null;
            }
            return value;
        }
        catch (Throwable e) {
            while (e instanceof ExecutionException || e instanceof UncheckedExecutionException || e instanceof CompletionException || e instanceof ExecutionError) {
                e = e.getCause();
            }
            ViaLegacy.getPlatform().getLogger().log(Level.WARNING, "Failed to load game profile for uuid '" + String.valueOf(uuid) + "' (" + e.getClass().getName() + ")");
            this.gameProfileCache.put((Object)uuid, (Object)NULL_GAME_PROFILE);
            return null;
        }
    }

    public UUID getMojangUuid(String playerName) {
        playerName = COLOR_CODE_PATTERN.matcher(playerName).replaceAll("");
        try {
            return (UUID)this.uuidCache.get((Object)playerName);
        }
        catch (Throwable e) {
            while (e instanceof ExecutionException || e instanceof UncheckedExecutionException || e instanceof CompletionException || e instanceof ExecutionError) {
                e = e.getCause();
            }
            ViaLegacy.getPlatform().getLogger().log(Level.WARNING, "Failed to load uuid for player '" + playerName + "' (" + e.getClass().getName() + ")");
            UUID uuid = GameProfileUtil.getOfflinePlayerUuid((String)playerName);
            this.uuidCache.put((Object)playerName, (Object)uuid);
            return uuid;
        }
    }

    public boolean isUuidLoaded(String playerName) {
        return this.uuidCache.getIfPresent((Object)playerName) != null;
    }

    public CompletableFuture<UUID> getMojangUuidAsync(String playerName) {
        if (this.isUuidLoaded(playerName)) {
            return CompletableFuture.completedFuture(this.getMojangUuid(playerName));
        }
        return CompletableFuture.supplyAsync(() -> this.getMojangUuid(playerName));
    }

    public abstract GameProfile loadGameProfile(UUID var1) throws Exception;

    public abstract UUID loadMojangUuid(String var1) throws Exception;

    public boolean isGameProfileLoaded(UUID uuid) {
        return this.gameProfileCache.getIfPresent((Object)uuid) != null;
    }
}

