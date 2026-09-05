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
import net.irisshaders.iris.gl.GLDebug;
import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.gl.shader.GlShader;
import net.irisshaders.iris.gl.shader.ShaderCompileException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ProgramCreator {
    private static final Logger LOGGER = LogManager.getLogger(ProgramCreator.class);

    public static int create(String string, GlShader ... glShaderArray) {
        int n;
        int n2 = GlStateManager.glCreateProgram();
        GlStateManager._glBindAttribLocation((int)n2, (int)11, (CharSequence)"iris_Entity");
        GlStateManager._glBindAttribLocation((int)n2, (int)11, (CharSequence)"mc_Entity");
        GlStateManager._glBindAttribLocation((int)n2, (int)12, (CharSequence)"mc_midTexCoord");
        GlStateManager._glBindAttribLocation((int)n2, (int)13, (CharSequence)"at_tangent");
        GlStateManager._glBindAttribLocation((int)n2, (int)14, (CharSequence)"at_midBlock");
        GlStateManager._glBindAttribLocation((int)n2, (int)0, (CharSequence)"Position");
        GlStateManager._glBindAttribLocation((int)n2, (int)1, (CharSequence)"UV0");
        for (GlShader glShader : glShaderArray) {
            GLDebug.nameObject(33505, glShader.getHandle(), glShader.getName());
            GlStateManager.glAttachShader((int)n2, (int)glShader.getHandle());
        }
        GlStateManager.glLinkProgram((int)n2);
        GLDebug.nameObject(33506, n2, string);
        for (GlShader glShader : glShaderArray) {
            IrisRenderSystem.detachShader(n2, glShader.getHandle());
        }
        String string2 = IrisRenderSystem.getProgramInfoLog(n2);
        if (!string2.isEmpty()) {
            LOGGER.warn("Program link log for " + string + ": " + (String)string2);
        }
        if ((n = GlStateManager.glGetProgrami((int)n2, (int)35714)) != 1) {
            throw new ShaderCompileException(string, string2);
        }
        return n2;
    }
}

