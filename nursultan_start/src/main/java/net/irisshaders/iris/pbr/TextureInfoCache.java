/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  net.irisshaders.iris.mixin.GlStateManagerAccessor
 */
package net.irisshaders.iris.pbr;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.nio.ByteBuffer;
import net.irisshaders.iris.mixin.GlStateManagerAccessor;
import net.irisshaders.iris.pbr.TextureInfoCache$TextureInfo;

public class TextureInfoCache {
    public static final TextureInfoCache INSTANCE = new TextureInfoCache();
    private final Int2ObjectMap<TextureInfoCache$TextureInfo> cache = new Int2ObjectOpenHashMap();

    public TextureInfoCache$TextureInfo getInfo(int n) {
        TextureInfoCache$TextureInfo textureInfoCache$TextureInfo = (TextureInfoCache$TextureInfo)this.cache.get(n);
        if (textureInfoCache$TextureInfo == null) {
            textureInfoCache$TextureInfo = new TextureInfoCache$TextureInfo(n);
            this.cache.put(n, (Object)textureInfoCache$TextureInfo);
        }
        return textureInfoCache$TextureInfo;
    }

    private TextureInfoCache() {
    }

    public void onDeleteTexture(int n) {
        this.cache.remove(n);
    }

    public void onTexImage2D(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, ByteBuffer byteBuffer) {
        if (n2 == 0) {
            int n9 = GlStateManagerAccessor.getTEXTURES()[GlStateManagerAccessor.getActiveTexture()].field_5167;
            TextureInfoCache$TextureInfo textureInfoCache$TextureInfo = this.getInfo(n9);
            textureInfoCache$TextureInfo.internalFormat = n3;
            textureInfoCache$TextureInfo.width = n4;
            textureInfoCache$TextureInfo.height = n5;
        }
    }
}

