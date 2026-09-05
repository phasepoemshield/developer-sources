/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.irisshaders.iris.gl.shader;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.util.Locale;
import net.irisshaders.iris.gl.GLDebug;
import net.irisshaders.iris.gl.GlResource;
import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.gl.shader.ShaderCompileException;
import net.irisshaders.iris.gl.shader.ShaderType;
import net.irisshaders.iris.gl.shader.ShaderWorkarounds;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GlShader
extends GlResource {
    private static final Logger LOGGER = LogManager.getLogger(GlShader.class);
    private final String name;

    public GlShader(ShaderType shaderType, String string, String string2) {
        super(GlShader.createShader(shaderType, string, string2));
        this.name = string;
    }

    public String getName() {
        return this.name;
    }

    public int getHandle() {
        return this.getGlId();
    }

    private static int createShader(ShaderType shaderType, String string, String string2) {
        int n;
        int n2 = GlStateManager.glCreateShader((int)shaderType.id);
        ShaderWorkarounds.safeShaderSource(n2, string2);
        GlStateManager.glCompileShader((int)n2);
        GLDebug.nameObject(33505, n2, string + "(" + shaderType.name().toLowerCase(Locale.ROOT) + ")");
        String string3 = IrisRenderSystem.getShaderInfoLog(n2);
        if (!string3.isEmpty()) {
            LOGGER.warn("Shader compilation log for " + string + ": " + string3);
        }
        if ((n = GlStateManager.glGetShaderi((int)n2, (int)35713)) != 1) {
            throw new ShaderCompileException(string, string3);
        }
        return n2;
    }

    @Override
    public void destroyInternal() {
        GlStateManager.glDeleteShader((int)this.getGlId());
    }
}

