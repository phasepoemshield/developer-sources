/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.textures.AddressMode
 *  com.mojang.blaze3d.textures.TextureFormat
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5595
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5596
 *  com.mojang.blaze3d.vertex.VertexFormatElement$Type
 *  java.lang.MatchException
 *  minecraft.class08247
 */
package com.mojang.blaze3d.opengl;

import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.platform.DestFactor;
import com.mojang.blaze3d.platform.PolygonMode;
import com.mojang.blaze3d.platform.SourceFactor;
import com.mojang.blaze3d.shaders.ShaderType;
import com.mojang.blaze3d.textures.AddressMode;
import com.mojang.blaze3d.textures.TextureFormat;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.VertexFormatElement;
import minecraft.class08247;

public class GlConst {
    public static final int GL_READ_FRAMEBUFFER = 36008;
    public static final int GL_DRAW_FRAMEBUFFER = 36009;
    public static final int GL_TRUE = 1;
    public static final int GL_FALSE = 0;
    public static final int GL_NONE = 0;
    public static final int GL_LINES = 1;
    public static final int GL_LINE_STRIP = 3;
    public static final int GL_TRIANGLE_STRIP = 5;
    public static final int GL_TRIANGLE_FAN = 6;
    public static final int GL_TRIANGLES = 4;
    public static final int GL_POINTS = 0;
    public static final int GL_WRITE_ONLY = 35001;
    public static final int GL_READ_ONLY = 35000;
    public static final int GL_READ_WRITE = 35002;
    public static final int GL_MAP_READ_BIT = 1;
    public static final int GL_MAP_WRITE_BIT = 2;
    public static final int GL_EQUAL = 514;
    public static final int GL_LEQUAL = 515;
    public static final int GL_LESS = 513;
    public static final int GL_GREATER = 516;
    public static final int GL_GEQUAL = 518;
    public static final int GL_ALWAYS = 519;
    public static final int GL_TEXTURE_MAG_FILTER = 10240;
    public static final int GL_TEXTURE_MIN_FILTER = 10241;
    public static final int GL_TEXTURE_WRAP_S = 10242;
    public static final int GL_TEXTURE_WRAP_T = 10243;
    public static final int GL_NEAREST = 9728;
    public static final int GL_LINEAR = 9729;
    public static final int GL_NEAREST_MIPMAP_LINEAR = 9986;
    public static final int GL_LINEAR_MIPMAP_LINEAR = 9987;
    public static final int GL_CLAMP_TO_EDGE = 33071;
    public static final int GL_REPEAT = 10497;
    public static final int GL_FRONT = 1028;
    public static final int GL_FRONT_AND_BACK = 1032;
    public static final int GL_LINE = 6913;
    public static final int GL_FILL = 6914;
    public static final int GL_BYTE = 5120;
    public static final int GL_UNSIGNED_BYTE = 5121;
    public static final int GL_SHORT = 5122;
    public static final int GL_UNSIGNED_SHORT = 5123;
    public static final int GL_INT = 5124;
    public static final int GL_UNSIGNED_INT = 5125;
    public static final int GL_FLOAT = 5126;
    public static final int GL_ZERO = 0;
    public static final int GL_ONE = 1;
    public static final int GL_SRC_COLOR = 768;
    public static final int GL_ONE_MINUS_SRC_COLOR = 769;
    public static final int GL_SRC_ALPHA = 770;
    public static final int GL_ONE_MINUS_SRC_ALPHA = 771;
    public static final int GL_DST_ALPHA = 772;
    public static final int GL_ONE_MINUS_DST_ALPHA = 773;
    public static final int GL_DST_COLOR = 774;
    public static final int GL_ONE_MINUS_DST_COLOR = 775;
    public static final int GL_REPLACE = 7681;
    public static final int GL_DEPTH_BUFFER_BIT = 256;
    public static final int GL_COLOR_BUFFER_BIT = 16384;
    public static final int GL_RGBA8 = 32856;
    public static final int GL_PROXY_TEXTURE_2D = 32868;
    public static final int GL_RGBA = 6408;
    public static final int GL_TEXTURE_WIDTH = 4096;
    public static final int GL_BGR = 32992;
    public static final int GL_FUNC_ADD = 32774;
    public static final int GL_MIN = 32775;
    public static final int GL_MAX = 32776;
    public static final int GL_FUNC_SUBTRACT = 32778;
    public static final int GL_FUNC_REVERSE_SUBTRACT = 32779;
    public static final int GL_DEPTH_COMPONENT24 = 33190;
    public static final int GL_STATIC_DRAW = 35044;
    public static final int GL_DYNAMIC_DRAW = 35048;
    public static final int GL_STREAM_DRAW = 35040;
    public static final int GL_STATIC_READ = 35045;
    public static final int GL_DYNAMIC_READ = 35049;
    public static final int GL_STREAM_READ = 35041;
    public static final int GL_STATIC_COPY = 35046;
    public static final int GL_DYNAMIC_COPY = 35050;
    public static final int GL_STREAM_COPY = 35042;
    public static final int GL_SYNC_GPU_COMMANDS_COMPLETE = 37143;
    public static final int GL_TIMEOUT_EXPIRED = 37147;
    public static final int GL_WAIT_FAILED = 37149;
    public static final int GL_UNPACK_SWAP_BYTES = 3312;
    public static final int GL_UNPACK_LSB_FIRST = 3313;
    public static final int GL_UNPACK_ROW_LENGTH = 3314;
    public static final int GL_UNPACK_SKIP_ROWS = 3315;
    public static final int GL_UNPACK_SKIP_PIXELS = 3316;
    public static final int GL_UNPACK_ALIGNMENT = 3317;
    public static final int GL_PACK_ALIGNMENT = 3333;
    public static final int GL_PACK_ROW_LENGTH = 3330;
    public static final int GL_MAX_TEXTURE_SIZE = 3379;
    public static final int GL_TEXTURE_2D = 3553;
    public static final int[] CUBEMAP_TARGETS = new int[]{34069, 34070, 34071, 34072, 34073, 34074};
    public static final int GL_DEPTH_COMPONENT = 6402;
    public static final int GL_DEPTH_COMPONENT32 = 33191;
    public static final int GL_FRAMEBUFFER = 36160;
    public static final int GL_RENDERBUFFER = 36161;
    public static final int GL_COLOR_ATTACHMENT0 = 36064;
    public static final int GL_DEPTH_ATTACHMENT = 36096;
    public static final int GL_FRAMEBUFFER_COMPLETE = 36053;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT = 36054;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT = 36055;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER = 36059;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER = 36060;
    public static final int GL_FRAMEBUFFER_UNSUPPORTED = 36061;
    public static final int GL_LINK_STATUS = 35714;
    public static final int GL_COMPILE_STATUS = 35713;
    public static final int GL_VERTEX_SHADER = 35633;
    public static final int GL_FRAGMENT_SHADER = 35632;
    public static final int GL_TEXTURE0 = 33984;
    public static final int GL_TEXTURE1 = 33985;
    public static final int GL_TEXTURE2 = 33986;
    public static final int GL_DEPTH_TEXTURE_MODE = 34891;
    public static final int GL_TEXTURE_COMPARE_MODE = 34892;
    public static final int GL_ARRAY_BUFFER = 34962;
    public static final int GL_ELEMENT_ARRAY_BUFFER = 34963;
    public static final int GL_PIXEL_PACK_BUFFER = 35051;
    public static final int GL_COPY_READ_BUFFER = 36662;
    public static final int GL_COPY_WRITE_BUFFER = 36663;
    public static final int GL_PIXEL_UNPACK_BUFFER = 35052;
    public static final int GL_UNIFORM_BUFFER = 35345;
    public static final int GL_ALPHA_BIAS = 3357;
    public static final int GL_RGB = 6407;
    public static final int GL_RG = 33319;
    public static final int GL_R8 = 33321;
    public static final int GL_RED = 6403;
    public static final int GL_OUT_OF_MEMORY = 1285;

    public static int toGlInternalId(TextureFormat textureFormat) {
        return switch (textureFormat) {
            default -> throw new MatchException(null, null);
            case TextureFormat.RGBA8 -> 32856;
            case TextureFormat.RED8 -> 33321;
            case TextureFormat.RED8I -> 33329;
            case TextureFormat.DEPTH32 -> 33191;
        };
    }

    public static int toGlExternalId(TextureFormat textureFormat) {
        int n;
        switch (textureFormat) {
            default: {
                throw new MatchException(null, null);
            }
            case RGBA8: {
                n = 6408;
                break;
            }
            case RED8: {
                n = 6403;
                break;
            }
            case RED8I: {
                n = 6403;
                break;
            }
            case DEPTH32: {
                n = 6402;
            }
        }
        return n;
    }

    public static int bufferUsageToGlEnum(int n) {
        boolean bl;
        boolean bl2 = bl = (n & 4) != 0;
        if ((n & 2) != 0) {
            if (bl) {
                return 35040;
            }
            return 35044;
        }
        if ((n & 1) != 0) {
            if (bl) {
                return 35041;
            }
            return 35045;
        }
        return 35044;
    }

    public static int bufferUsageToGlFlag(int n) {
        int n2 = 0;
        if ((n & 1) != 0) {
            n2 |= 0x41;
        }
        if ((n & 2) != 0) {
            n2 |= 0x42;
        }
        if ((n & 8) != 0) {
            n2 |= 0x100;
        }
        if ((n & 4) != 0) {
            n2 |= 0x200;
        }
        return n2;
    }

    public static int toGlType(TextureFormat textureFormat) {
        int n;
        switch (textureFormat) {
            default: {
                throw new MatchException(null, null);
            }
            case RGBA8: {
                n = 5121;
                break;
            }
            case RED8: {
                n = 5121;
                break;
            }
            case RED8I: {
                n = 5121;
                break;
            }
            case DEPTH32: {
                n = 5126;
            }
        }
        return n;
    }

    public static int toGl(VertexFormatElement.Type type) {
        int n;
        switch (type) {
            default: {
                throw new MatchException(null, null);
            }
            case FLOAT: {
                n = 5126;
                break;
            }
            case UBYTE: {
                n = 5121;
                break;
            }
            case BYTE: {
                n = 5120;
                break;
            }
            case USHORT: {
                n = 5123;
                break;
            }
            case SHORT: {
                n = 5122;
                break;
            }
            case UINT: {
                n = 5125;
                break;
            }
            case INT: {
                n = 5124;
            }
        }
        return n;
    }

    public static int toGl(AddressMode addressMode) {
        return switch (addressMode) {
            default -> throw new MatchException(null, null);
            case AddressMode.REPEAT -> 10497;
            case AddressMode.CLAMP_TO_EDGE -> 33071;
        };
    }

    public static int toGl(ShaderType shaderType) {
        return switch (shaderType) {
            default -> throw new MatchException(null, null);
            case ShaderType.VERTEX -> 35633;
            case ShaderType.FRAGMENT -> 35632;
        };
    }

    public static int toGl(VertexFormat.class_5596 class_55962) {
        return switch (class_55962) {
            default -> throw new MatchException(null, null);
            case VertexFormat.class_5596.field_27377 -> 4;
            case VertexFormat.class_5596.field_29344 -> 1;
            case VertexFormat.class_5596.field_29345 -> 3;
            case VertexFormat.class_5596.field_63316 -> 0;
            case VertexFormat.class_5596.field_27379 -> 4;
            case VertexFormat.class_5596.field_27380 -> 5;
            case VertexFormat.class_5596.field_27381 -> 6;
            case VertexFormat.class_5596.field_27382 -> 4;
        };
    }

    public static int toGl(SourceFactor sourceFactor) {
        return switch (sourceFactor) {
            default -> throw new MatchException(null, null);
            case SourceFactor.CONSTANT_ALPHA -> 32771;
            case SourceFactor.CONSTANT_COLOR -> 32769;
            case SourceFactor.DST_ALPHA -> 772;
            case SourceFactor.DST_COLOR -> 774;
            case SourceFactor.ONE -> 1;
            case SourceFactor.ONE_MINUS_CONSTANT_ALPHA -> 32772;
            case SourceFactor.ONE_MINUS_CONSTANT_COLOR -> 32770;
            case SourceFactor.ONE_MINUS_DST_ALPHA -> 773;
            case SourceFactor.ONE_MINUS_DST_COLOR -> 775;
            case SourceFactor.ONE_MINUS_SRC_ALPHA -> 771;
            case SourceFactor.ONE_MINUS_SRC_COLOR -> 769;
            case SourceFactor.SRC_ALPHA -> 770;
            case SourceFactor.SRC_ALPHA_SATURATE -> 776;
            case SourceFactor.SRC_COLOR -> 768;
            case SourceFactor.ZERO -> 0;
        };
    }

    public static int toGl(DestFactor destFactor) {
        return switch (destFactor) {
            default -> throw new MatchException(null, null);
            case DestFactor.CONSTANT_ALPHA -> 32771;
            case DestFactor.CONSTANT_COLOR -> 32769;
            case DestFactor.DST_ALPHA -> 772;
            case DestFactor.DST_COLOR -> 774;
            case DestFactor.ONE -> 1;
            case DestFactor.ONE_MINUS_CONSTANT_ALPHA -> 32772;
            case DestFactor.ONE_MINUS_CONSTANT_COLOR -> 32770;
            case DestFactor.ONE_MINUS_DST_ALPHA -> 773;
            case DestFactor.ONE_MINUS_DST_COLOR -> 775;
            case DestFactor.ONE_MINUS_SRC_ALPHA -> 771;
            case DestFactor.ONE_MINUS_SRC_COLOR -> 769;
            case DestFactor.SRC_ALPHA -> 770;
            case DestFactor.SRC_COLOR -> 768;
            case DestFactor.ZERO -> 0;
        };
    }

    public static int toGl(PolygonMode polygonMode) {
        int n;
        switch (polygonMode) {
            case WIREFRAME: {
                n = 6913;
                break;
            }
            default: {
                n = 6914;
            }
        }
        return n;
    }

    public static int toGl(VertexFormat.class_5595 class_55952) {
        int n;
        switch (class_55952) {
            default: {
                throw new MatchException(null, null);
            }
            case field_27372: {
                n = 5123;
                break;
            }
            case field_27373: {
                n = 5125;
            }
        }
        return n;
    }

    public static int toGl(class08247 class082472) {
        int n;
        switch (class082472) {
            default: {
                throw new MatchException(null, null);
            }
            case field_4997: {
                n = 6408;
                break;
            }
            case field_5001: {
                n = 6407;
                break;
            }
            case field_5002: {
                n = 33319;
                break;
            }
            case field_4998: {
                n = 6403;
            }
        }
        return n;
    }

    public static int toGl(DepthTestFunction depthTestFunction) {
        int n;
        switch (depthTestFunction) {
            case NO_DEPTH_TEST: {
                n = 519;
                break;
            }
            case EQUAL_DEPTH_TEST: {
                n = 514;
                break;
            }
            case LESS_DEPTH_TEST: {
                n = 513;
                break;
            }
            case GREATER_DEPTH_TEST: {
                n = 516;
                break;
            }
            default: {
                n = 515;
            }
        }
        return n;
    }
}

