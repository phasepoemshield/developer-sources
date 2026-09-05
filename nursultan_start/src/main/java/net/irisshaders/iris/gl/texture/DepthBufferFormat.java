/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 */
package net.irisshaders.iris.gl.texture;

import java.util.Objects;

public enum DepthBufferFormat {
    DEPTH(false),
    DEPTH16(false),
    DEPTH24(false),
    DEPTH32(false),
    DEPTH32F(false),
    DEPTH_STENCIL(true),
    DEPTH24_STENCIL8(true),
    DEPTH32F_STENCIL8(true);

    private final boolean combinedStencil;

    private DepthBufferFormat(boolean bl) {
        this.combinedStencil = bl;
    }

    public int getGlFormat() {
        return switch (this.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0, 1 -> 5123;
            case 2, 3 -> 5125;
            case 4 -> 5126;
            case 5, 6 -> 34042;
            case 7 -> 36269;
        };
    }

    public boolean isCombinedStencil() {
        return this.combinedStencil;
    }

    public int getGlInternalFormat() {
        return switch (this.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> 6402;
            case 1 -> 33189;
            case 2 -> 33190;
            case 3 -> 33191;
            case 4 -> 36012;
            case 5 -> 34041;
            case 6 -> 35056;
            case 7 -> 36013;
        };
    }

    public static DepthBufferFormat fromGlEnumOrDefault(int n) {
        DepthBufferFormat depthBufferFormat = DepthBufferFormat.fromGlEnum(n);
        return Objects.requireNonNullElse(depthBufferFormat, DEPTH);
    }

    public int getGlType() {
        return this.isCombinedStencil() ? 34041 : 6402;
    }

    public static DepthBufferFormat fromGlEnum(int n) {
        return switch (n) {
            case 6402 -> DEPTH;
            case 33189 -> DEPTH16;
            case 33190 -> DEPTH24;
            case 33191 -> DEPTH32;
            case 36012 -> DEPTH32F;
            case 34041 -> DEPTH_STENCIL;
            case 35056 -> DEPTH24_STENCIL8;
            case 36013 -> DEPTH32F_STENCIL8;
            default -> null;
        };
    }
}

