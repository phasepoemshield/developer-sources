/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  com.mojang.blaze3d.textures.TextureFormat
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.textures.TextureFormat;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class07345;

public final class class07353
extends Record
implements class07345 {
    private final int location;
    private final int samplerIndex;
    private final TextureFormat format;
    private final int texture;

    public TextureFormat L() {
        return this.format;
    }

    public class07353(int n, int n2, TextureFormat textureFormat) {
        this(n, n2, textureFormat, GlStateManager._genTexture());
    }

    public class07353(int n, int n2, TextureFormat textureFormat, int n3) {
        this.location = n;
        this.samplerIndex = n2;
        this.format = textureFormat;
        this.texture = n3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07353.class, "location;samplerIndex;format;texture", "location", "samplerIndex", "format", "texture"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07353.class, "location;samplerIndex;format;texture", "location", "samplerIndex", "format", "texture"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07353.class, "location;samplerIndex;format;texture", "location", "samplerIndex", "format", "texture"}, this);
    }

    @Override
    public void close() {
        GlStateManager._deleteTexture((int)this.texture);
    }

    public int u() {
        return this.texture;
    }

    public int y() {
        return this.samplerIndex;
    }

    public int N() {
        return this.location;
    }
}

