/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.textures.TextureFormat
 *  java.lang.MatchException
 *  minecraft.class00500
 *  minecraft.class06428
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07295
 *  net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper
 *  net.fabricmc.loader.api.FabricLoader
 *  net.fabricmc.loader.api.ModContainer
 *  net.fabricmc.loader.api.SemanticVersion
 *  net.fabricmc.loader.api.VersionParsingException
 *  net.irisshaders.iris.gl.texture.DepthBufferFormat
 */
package net.irisshaders.iris.platform;

import com.mojang.blaze3d.textures.TextureFormat;
import java.nio.file.Path;
import minecraft.class00500;
import minecraft.class06428;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07295;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.fabricmc.loader.api.SemanticVersion;
import net.fabricmc.loader.api.VersionParsingException;
import net.irisshaders.iris.gl.texture.DepthBufferFormat;
import net.irisshaders.iris.platform.IrisPlatformHelpers;

public class IrisFabricHelpers
implements IrisPlatformHelpers {
    @Override
    public class00500 getBlockAppearance(class07295 class072952, class00500 class005002, class07211 class072112, class07209 class072092) {
        return class005002;
    }

    @Override
    public class06428 registerKeyBinding(class06428 class064282) {
        return KeyBindingHelper.registerKeyBinding((class06428)class064282);
    }

    @Override
    public TextureFormat mojangDepthFormat(DepthBufferFormat depthBufferFormat) {
        return switch (depthBufferFormat) {
            default -> throw new MatchException(null, null);
            case DepthBufferFormat.DEPTH -> TextureFormat.DEPTH32;
            case DepthBufferFormat.DEPTH16 -> null;
            case DepthBufferFormat.DEPTH24 -> null;
            case DepthBufferFormat.DEPTH32 -> TextureFormat.DEPTH32;
            case DepthBufferFormat.DEPTH32F -> null;
            case DepthBufferFormat.DEPTH_STENCIL -> null;
            case DepthBufferFormat.DEPTH24_STENCIL8 -> null;
            case DepthBufferFormat.DEPTH32F_STENCIL8 -> null;
        };
    }

    @Override
    public int compareVersions(String string, String string2) throws Exception {
        try {
            return SemanticVersion.parse((String)string).compareTo(SemanticVersion.parse((String)string2));
        }
        catch (VersionParsingException versionParsingException) {
            throw new Exception(versionParsingException);
        }
    }

    @Override
    public boolean isDevelopmentEnvironment() {
        return FabricLoader.getInstance().isDevelopmentEnvironment();
    }

    @Override
    public boolean isModLoaded(String string) {
        return FabricLoader.getInstance().isModLoaded(string);
    }

    @Override
    public Path getConfigDir() {
        return FabricLoader.getInstance().getConfigDir();
    }

    @Override
    public Path getGameDir() {
        return FabricLoader.getInstance().getGameDir();
    }

    @Override
    public String getVersion() {
        return ((ModContainer)FabricLoader.getInstance().getModContainer("iris").get()).getMetadata().getVersion().getFriendlyString();
    }

    @Override
    public boolean useELS() {
        return false;
    }
}

