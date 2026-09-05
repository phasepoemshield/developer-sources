/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Objects
 *  minecraft.class01894
 *  org.apache.commons.io.IOUtils
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.caffeinemc.mods.sodium.client.gl.shader;

import com.google.common.base.Objects;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import minecraft.class01894;
import net.caffeinemc.mods.sodium.client.gl.shader.GlShader;
import net.caffeinemc.mods.sodium.client.gl.shader.ShaderConstants;
import net.caffeinemc.mods.sodium.client.gl.shader.ShaderParser;
import net.caffeinemc.mods.sodium.client.gl.shader.ShaderParser$ParsedShader;
import net.caffeinemc.mods.sodium.client.gl.shader.ShaderType;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShaderLoader {
    private static final Logger LOGGER = LoggerFactory.getLogger((String)"Sodium-ShaderLoader");
    private static final boolean OPTION_DEBUG_SHADERS = Objects.equal((Object)System.getProperty("sodium.debug.shaders.dump", "false"), (Object)"true");

    public static String getShaderSource(class01894 class018942) {
        String string;
        block9: {
            String string2 = String.format("/assets/%s/shaders/%s", class018942.y(), class018942.N());
            InputStream inputStream = ShaderLoader.class.getResourceAsStream(string2);
            try {
                if (inputStream == null) {
                    throw new RuntimeException("Shader not found: " + string2);
                }
                string = IOUtils.toString((InputStream)inputStream, (Charset)StandardCharsets.UTF_8);
                if (inputStream == null) break block9;
            }
            catch (Throwable throwable) {
                try {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (IOException iOException) {
                    throw new RuntimeException("Failed to read shader source for " + string2, iOException);
                }
            }
            inputStream.close();
        }
        return string;
    }

    public static GlShader loadShader(ShaderType shaderType, class01894 class018942, ShaderConstants shaderConstants) {
        ShaderParser$ParsedShader shaderParser$ParsedShader = ShaderParser.parseShader(ShaderLoader.getShaderSource(class018942), shaderConstants);
        if (OPTION_DEBUG_SHADERS) {
            LOGGER.info("Loaded shader {} with constants {}", (Object)class018942, (Object)shaderConstants);
            LOGGER.info(shaderParser$ParsedShader.src());
        }
        return new GlShader(shaderType, class018942, shaderParser$ParsedShader);
    }
}

