/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.gl.texture.InternalTextureFormat
 *  net.irisshaders.iris.gl.texture.PixelFormat
 *  net.irisshaders.iris.gl.texture.PixelType
 *  net.irisshaders.iris.gl.texture.TextureType
 */
package net.irisshaders.iris.shaderpack;

import net.irisshaders.iris.gl.texture.InternalTextureFormat;
import net.irisshaders.iris.gl.texture.PixelFormat;
import net.irisshaders.iris.gl.texture.PixelType;
import net.irisshaders.iris.gl.texture.TextureType;

public record ImageInformation(String name, String samplerName, TextureType target, PixelFormat format, InternalTextureFormat internalTextureFormat, PixelType type, int width, int height, int depth, boolean clear, boolean isRelative, float relativeWidth, float relativeHeight) {
}

