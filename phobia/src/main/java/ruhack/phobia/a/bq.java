/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.SignatureState
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture
 *  com.mojang.authlib.minecraft.MinecraftProfileTextures
 *  com.mojang.authlib.properties.Property
 *  com.mojang.logging.LogUtils
 *  net.minecraft.class_1071
 *  net.minecraft.class_8685
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package ruhack.phobia.a;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.SignatureState;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftProfileTextures;
import com.mojang.authlib.properties.Property;
import com.mojang.logging.LogUtils;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.class_1071;
import net.minecraft.class_8685;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_1071.class})
public abstract class bq {
    private static final Logger PHOBIA_LOGGER = LogUtils.getLogger();
    private static final Set<String> PHOBIA_FAILED_TEXTURES = ConcurrentHashMap.newKeySet();

    @Shadow
    abstract CompletableFuture<class_8685> method_52859(UUID var1, MinecraftProfileTextures var2);

    @Inject(method={"method_52863"}, at={@At(value="HEAD")}, cancellable=true)
    private void phobia$loadLegacyHeadTexture(GameProfile profile, CallbackInfoReturnable<CompletableFuture<Optional<class_8685>>> cir) {
        if (profile == null) {
            return;
        }
        if (!"LegacyHead".equals(profile.name())) {
            return;
        }
        Property packed = bq.textureProperty(profile);
        LegacySkin skin = bq.decodeSkin(packed);
        if (skin == null) {
            return;
        }
        UUID profileId = profile.id();
        if (profileId == null) {
            profileId = UUID.nameUUIDFromBytes(("phobia:head:" + packed.value()).getBytes(StandardCharsets.UTF_8));
        }
        MinecraftProfileTexture texture = new MinecraftProfileTexture(skin.url(), skin.metadata());
        MinecraftProfileTextures textures = new MinecraftProfileTextures(texture, null, null, packed.signature() == null ? SignatureState.UNSIGNED : SignatureState.SIGNED);
        CompletionStage result = this.method_52859(profileId, textures).handle((loaded, error) -> {
            if (error != null) {
                if (PHOBIA_FAILED_TEXTURES.add(skin.url())) {
                    PHOBIA_LOGGER.warn("[Phobia HeadFix] texture is unavailable, using default skin: {}", (Object)skin.url());
                }
                return Optional.empty();
            }
            Optional<class_8685> resultValue = Optional.ofNullable(loaded);
            String path = resultValue.flatMap(value -> Optional.ofNullable(value.comp_1626())).map(asset -> asset.comp_3627().toString()).orElse("empty");
            PHOBIA_LOGGER.info("[Phobia HeadFix] loaded {} as {}", (Object)skin.url(), (Object)path);
            return resultValue;
        });
        cir.setReturnValue((Object)result);
    }

    @Inject(method={"method_52863"}, at={@At(value="RETURN")}, cancellable=true)
    private void phobia$recoverSkinDownloadFailure(GameProfile profile, CallbackInfoReturnable<CompletableFuture<Optional<class_8685>>> cir) {
        CompletableFuture result = (CompletableFuture)cir.getReturnValue();
        if (result == null) {
            return;
        }
        cir.setReturnValue((Object)result.exceptionally(error -> {
            String profileKey;
            String string = profileKey = profile == null ? "unknown" : String.valueOf(profile.id());
            if (PHOBIA_FAILED_TEXTURES.add("profile:" + profileKey)) {
                PHOBIA_LOGGER.warn("[Phobia SkinFix] skin download failed for {}; using default skin", (Object)profileKey);
            }
            return Optional.empty();
        }));
    }

    private static Property textureProperty(GameProfile profile) {
        if (profile == null || profile.properties() == null) {
            return null;
        }
        for (Property property : profile.properties().values()) {
            if (property == null || !property.name().equalsIgnoreCase("textures") || property.value() == null || property.value().isBlank()) continue;
            return property;
        }
        return null;
    }

    private static LegacySkin decodeSkin(Property property) {
        if (property == null) {
            return null;
        }
        try {
            String json = new String(Base64.getDecoder().decode(property.value()), StandardCharsets.UTF_8);
            JsonObject root = JsonParser.parseString((String)json).getAsJsonObject();
            JsonObject textures = bq.object(root, "textures");
            JsonObject skin = bq.object(textures, "SKIN");
            if (skin == null || !skin.has("url")) {
                return null;
            }
            String url = bq.normalizeUrl(skin.get("url").getAsString());
            if (!bq.isSafeMinecraftSkinUrl(url)) {
                return null;
            }
            HashMap<String, String> metadata = new HashMap<String, String>();
            JsonObject metadataJson = bq.object(skin, "metadata");
            if (metadataJson != null) {
                for (Map.Entry entry : metadataJson.entrySet()) {
                    if (!((JsonElement)entry.getValue()).isJsonPrimitive()) continue;
                    metadata.put((String)entry.getKey(), ((JsonElement)entry.getValue()).getAsString());
                }
            }
            return new LegacySkin(url, metadata);
        }
        catch (RuntimeException ignored) {
            return null;
        }
    }

    private static JsonObject object(JsonObject parent, String key) {
        if (parent == null || !parent.has(key) || !parent.get(key).isJsonObject()) {
            return null;
        }
        return parent.getAsJsonObject(key);
    }

    private static String normalizeUrl(String url) {
        if (url.regionMatches(true, 0, "http://textures.minecraft.net/", 0, "http://textures.minecraft.net/".length())) {
            return "https://" + url.substring("http://".length());
        }
        return url;
    }

    private static boolean isSafeMinecraftSkinUrl(String url) {
        try {
            URI uri = URI.create(url);
            String scheme = uri.getScheme();
            String host = uri.getHost();
            if (scheme == null || host == null) {
                return false;
            }
            if (!scheme.equalsIgnoreCase("https") && !scheme.equalsIgnoreCase("http")) {
                return false;
            }
            return (host = host.toLowerCase(Locale.ROOT)).equals("textures.minecraft.net") || host.equals("skins.minecraft.net");
        }
        catch (IllegalArgumentException ignored) {
            return false;
        }
    }

    private record LegacySkin(String url, Map<String, String> metadata) {
    }
}

