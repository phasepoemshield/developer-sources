/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.textures.TextureFormat
 *  minecraft.class00500
 *  minecraft.class06428
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07295
 *  net.irisshaders.iris.gl.texture.DepthBufferFormat
 */
package net.irisshaders.iris.platform;

import com.mojang.blaze3d.textures.TextureFormat;
import java.nio.file.Path;
import java.util.ServiceLoader;
import minecraft.class00500;
import minecraft.class06428;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07295;
import net.irisshaders.iris.gl.texture.DepthBufferFormat;

public interface IrisPlatformHelpers {
    public static final IrisPlatformHelpers INSTANCE = ServiceLoader.load(IrisPlatformHelpers.class).findFirst().get();

    public class00500 getBlockAppearance(class07295 var1, class00500 var2, class07211 var3, class07209 var4);

    public class06428 registerKeyBinding(class06428 var1);

    public TextureFormat mojangDepthFormat(DepthBufferFormat var1);

    public int compareVersions(String var1, String var2) throws Exception;

    public boolean isDevelopmentEnvironment();

    public boolean isModLoaded(String var1);

    public Path getConfigDir();

    public Path getGameDir();

    public static IrisPlatformHelpers getInstance() {
        return INSTANCE;
    }

    public String getVersion();

    public boolean useELS();
}

