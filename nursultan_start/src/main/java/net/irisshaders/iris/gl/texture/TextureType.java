/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.gl.IrisRenderSystem
 */
package net.irisshaders.iris.gl.texture;

import java.nio.ByteBuffer;
import java.util.Optional;
import net.irisshaders.iris.gl.IrisRenderSystem;

public enum TextureType {
    TEXTURE_1D(3552),
    TEXTURE_2D(3553),
    TEXTURE_3D(32879),
    TEXTURE_RECTANGLE(34037);

    private final int glType;

    public static Optional<TextureType> fromString(String string) {
        try {
            return Optional.of(TextureType.valueOf(string));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return Optional.empty();
        }
    }

    private TextureType(int n2) {
        this.glType = n2;
    }

    public void apply(int n, int n2, int n3, int n4, int n5, int n6, int n7, ByteBuffer byteBuffer) {
        switch (this.ordinal()) {
            case 0: {
                IrisRenderSystem.texImage1D((int)n, (int)this.getGlType(), (int)0, (int)n5, (int)n2, (int)0, (int)n6, (int)n7, (ByteBuffer)byteBuffer);
                break;
            }
            case 1: 
            case 3: {
                IrisRenderSystem.texImage2D((int)n, (int)this.getGlType(), (int)0, (int)n5, (int)n2, (int)n3, (int)0, (int)n6, (int)n7, (ByteBuffer)byteBuffer);
                break;
            }
            case 2: {
                IrisRenderSystem.texImage3D((int)n, (int)this.getGlType(), (int)0, (int)n5, (int)n2, (int)n3, (int)n4, (int)0, (int)n6, (int)n7, (ByteBuffer)byteBuffer);
            }
        }
    }

    public int getGlType() {
        return this.glType;
    }
}

