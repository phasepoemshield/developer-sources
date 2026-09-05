/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  minecraft.class01894
 *  net.caffeinemc.mods.sodium.client.gl.GlObject
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.opengl.GL20C
 */
package net.caffeinemc.mods.sodium.client.gl.shader;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.util.Arrays;
import minecraft.class01894;
import net.caffeinemc.mods.sodium.client.gl.GlObject;
import net.caffeinemc.mods.sodium.client.gl.shader.ShaderParser$ParsedShader;
import net.caffeinemc.mods.sodium.client.gl.shader.ShaderType;
import net.caffeinemc.mods.sodium.client.gl.shader.ShaderWorkarounds;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL20C;

public class GlShader
extends GlObject {
    private static final Logger LOGGER = LogManager.getLogger(GlShader.class);
    private final class01894 name;

    public GlShader(ShaderType shaderType, class01894 class018942, ShaderParser$ParsedShader shaderParser$ParsedShader) {
        int n;
        this.name = class018942;
        int n2 = GL20C.glCreateShader((int)shaderType.id);
        ShaderWorkarounds.safeShaderSource(n2, shaderParser$ParsedShader.src());
        GL20C.glCompileShader((int)n2);
        String string = GL20C.glGetShaderInfoLog((int)n2);
        if (!string.isEmpty()) {
            LOGGER.warn("Shader compilation log for {}: {}", (Object)this.name, (Object)string);
            LOGGER.warn("Include table: {}", (Object)Arrays.toString(shaderParser$ParsedShader.includeIds()));
        }
        if ((n = GlStateManager.glGetShaderi((int)n2, (int)35713)) != 1) {
            throw new RuntimeException("Shader compilation failed, see log for details");
        }
        this.setHandle(n2);
    }

    public class01894 getName() {
        return this.name;
    }

    public void delete() {
        GL20C.glDeleteShader((int)this.handle());
        this.invalidateHandle();
    }
}

