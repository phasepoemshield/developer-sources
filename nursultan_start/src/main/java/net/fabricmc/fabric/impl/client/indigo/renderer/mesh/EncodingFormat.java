/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  com.mojang.blaze3d.vertex.VertexFormat
 *  minecraft.class04995
 *  minecraft.class07211
 *  minecraft.class07835
 *  minecraft.class08743
 *  minecraft.class08915
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.mesh.QuadAtlas
 *  net.fabricmc.fabric.api.renderer.v1.mesh.ShadeMode
 *  net.fabricmc.fabric.api.renderer.v1.model.ModelHelper
 *  net.fabricmc.fabric.api.util.TriState
 *  org.apache.commons.lang3.ArrayUtils
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.client.indigo.renderer.mesh;

import com.google.common.base.Preconditions;
import com.mojang.blaze3d.vertex.VertexFormat;
import minecraft.class04995;
import minecraft.class07211;
import minecraft.class07835;
import minecraft.class08743;
import minecraft.class08915;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadAtlas;
import net.fabricmc.fabric.api.renderer.v1.mesh.ShadeMode;
import net.fabricmc.fabric.api.renderer.v1.model.ModelHelper;
import net.fabricmc.fabric.api.util.TriState;
import org.apache.commons.lang3.ArrayUtils;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public final class EncodingFormat {
    static final int HEADER_BITS = 0;
    static final int HEADER_FACE_NORMAL = 1;
    static final int HEADER_TINT_INDEX = 2;
    static final int HEADER_TAG = 3;
    public static final int HEADER_STRIDE = 4;
    static final int VERTEX_X;
    static final int VERTEX_Y;
    static final int VERTEX_Z;
    static final int VERTEX_COLOR;
    static final int VERTEX_U;
    static final int VERTEX_V;
    static final int VERTEX_LIGHTMAP;
    static final int VERTEX_NORMAL;
    public static final int VERTEX_STRIDE;
    public static final int QUAD_STRIDE;
    public static final int QUAD_STRIDE_BYTES;
    public static final int TOTAL_STRIDE;
    private static final int DIRECTION_COUNT;
    private static final int NULLABLE_DIRECTION_COUNT;
    private static final @Nullable class08743[] NULLABLE_BLOCK_RENDER_LAYERS;
    private static final int NULLABLE_BLOCK_RENDER_LAYER_COUNT;
    private static final TriState[] TRI_STATES;
    private static final int TRI_STATE_COUNT;
    private static final @Nullable class08915[] NULLABLE_GLINTS;
    private static final int NULLABLE_GLINT_COUNT;
    private static final ShadeMode[] SHADE_MODES;
    private static final int SHADE_MODE_COUNT;
    private static final QuadAtlas[] QUAD_ATLASES;
    private static final int QUAD_ATLAS_COUNT;
    private static final int NULL_RENDER_LAYER_INDEX;
    private static final int NULL_GLINT_INDEX;
    private static final int CULL_BIT_LENGTH;
    private static final int LIGHT_BIT_LENGTH;
    private static final int NORMALS_BIT_LENGTH = 4;
    private static final int GEOMETRY_BIT_LENGTH = 3;
    private static final int RENDER_LAYER_BIT_LENGTH;
    private static final int EMISSIVE_BIT_LENGTH = 1;
    private static final int DIFFUSE_BIT_LENGTH = 1;
    private static final int AO_BIT_LENGTH;
    private static final int GLINT_BIT_LENGTH;
    private static final int SHADE_MODE_BIT_LENGTH;
    private static final int QUAD_ATLAS_BIT_LENGTH;
    private static final int CULL_BIT_OFFSET = 0;
    private static final int LIGHT_BIT_OFFSET;
    private static final int NORMALS_BIT_OFFSET;
    private static final int GEOMETRY_BIT_OFFSET;
    private static final int RENDER_LAYER_BIT_OFFSET;
    private static final int EMISSIVE_BIT_OFFSET;
    private static final int DIFFUSE_BIT_OFFSET;
    private static final int AO_BIT_OFFSET;
    private static final int GLINT_BIT_OFFSET;
    private static final int SHADE_MODE_BIT_OFFSET;
    private static final int QUAD_ATLAS_BIT_OFFSET;
    private static final int TOTAL_BIT_LENGTH;
    private static final int CULL_MASK;
    private static final int LIGHT_MASK;
    private static final int NORMALS_MASK;
    private static final int GEOMETRY_MASK;
    private static final int RENDER_LAYER_MASK;
    private static final int EMISSIVE_MASK;
    private static final int DIFFUSE_MASK;
    private static final int AO_MASK;
    private static final int GLINT_MASK;
    private static final int SHADE_MODE_MASK;
    private static final int QUAD_ATLAS_MASK;

    private static int bitMask(int n, int n2) {
        return (1 << n) - 1 << n2;
    }

    private EncodingFormat() {
    }

    static {
        VertexFormat vertexFormat = class07835.y;
        VERTEX_X = 4;
        VERTEX_Y = 5;
        VERTEX_Z = 6;
        VERTEX_COLOR = 7;
        VERTEX_U = 8;
        VERTEX_V = VERTEX_U + 1;
        VERTEX_LIGHTMAP = 10;
        VERTEX_NORMAL = 11;
        VERTEX_STRIDE = vertexFormat.getVertexSize() / 4;
        QUAD_STRIDE = VERTEX_STRIDE * 4;
        QUAD_STRIDE_BYTES = QUAD_STRIDE * 4;
        TOTAL_STRIDE = 4 + QUAD_STRIDE;
        DIRECTION_COUNT = class07211.values().length;
        NULLABLE_DIRECTION_COUNT = DIRECTION_COUNT + 1;
        NULLABLE_BLOCK_RENDER_LAYERS = (class08743[])ArrayUtils.add((Object[])class08743.values(), null);
        NULLABLE_BLOCK_RENDER_LAYER_COUNT = NULLABLE_BLOCK_RENDER_LAYERS.length;
        TRI_STATES = TriState.values();
        TRI_STATE_COUNT = TRI_STATES.length;
        NULLABLE_GLINTS = (class08915[])ArrayUtils.add((Object[])class08915.values(), null);
        NULLABLE_GLINT_COUNT = NULLABLE_GLINTS.length;
        SHADE_MODES = ShadeMode.values();
        SHADE_MODE_COUNT = SHADE_MODES.length;
        QUAD_ATLASES = QuadAtlas.values();
        QUAD_ATLAS_COUNT = QUAD_ATLASES.length;
        NULL_RENDER_LAYER_INDEX = NULLABLE_BLOCK_RENDER_LAYER_COUNT - 1;
        NULL_GLINT_INDEX = NULLABLE_GLINT_COUNT - 1;
        CULL_BIT_LENGTH = class04995.R((int)NULLABLE_DIRECTION_COUNT);
        LIGHT_BIT_LENGTH = class04995.R((int)DIRECTION_COUNT);
        RENDER_LAYER_BIT_LENGTH = class04995.R((int)NULLABLE_BLOCK_RENDER_LAYER_COUNT);
        AO_BIT_LENGTH = class04995.R((int)TRI_STATE_COUNT);
        GLINT_BIT_LENGTH = class04995.R((int)NULLABLE_GLINT_COUNT);
        SHADE_MODE_BIT_LENGTH = class04995.R((int)SHADE_MODE_COUNT);
        QUAD_ATLAS_BIT_LENGTH = class04995.R((int)QUAD_ATLAS_COUNT);
        LIGHT_BIT_OFFSET = 0 + CULL_BIT_LENGTH;
        NORMALS_BIT_OFFSET = LIGHT_BIT_OFFSET + LIGHT_BIT_LENGTH;
        GEOMETRY_BIT_OFFSET = NORMALS_BIT_OFFSET + 4;
        RENDER_LAYER_BIT_OFFSET = GEOMETRY_BIT_OFFSET + 3;
        EMISSIVE_BIT_OFFSET = RENDER_LAYER_BIT_OFFSET + RENDER_LAYER_BIT_LENGTH;
        DIFFUSE_BIT_OFFSET = EMISSIVE_BIT_OFFSET + 1;
        AO_BIT_OFFSET = DIFFUSE_BIT_OFFSET + 1;
        GLINT_BIT_OFFSET = AO_BIT_OFFSET + AO_BIT_LENGTH;
        SHADE_MODE_BIT_OFFSET = GLINT_BIT_OFFSET + GLINT_BIT_LENGTH;
        QUAD_ATLAS_BIT_OFFSET = SHADE_MODE_BIT_OFFSET + SHADE_MODE_BIT_LENGTH;
        TOTAL_BIT_LENGTH = QUAD_ATLAS_BIT_OFFSET + QUAD_ATLAS_BIT_LENGTH;
        CULL_MASK = EncodingFormat.bitMask(CULL_BIT_LENGTH, 0);
        LIGHT_MASK = EncodingFormat.bitMask(LIGHT_BIT_LENGTH, LIGHT_BIT_OFFSET);
        NORMALS_MASK = EncodingFormat.bitMask(4, NORMALS_BIT_OFFSET);
        GEOMETRY_MASK = EncodingFormat.bitMask(3, GEOMETRY_BIT_OFFSET);
        RENDER_LAYER_MASK = EncodingFormat.bitMask(RENDER_LAYER_BIT_LENGTH, RENDER_LAYER_BIT_OFFSET);
        EMISSIVE_MASK = EncodingFormat.bitMask(1, EMISSIVE_BIT_OFFSET);
        DIFFUSE_MASK = EncodingFormat.bitMask(1, DIFFUSE_BIT_OFFSET);
        AO_MASK = EncodingFormat.bitMask(AO_BIT_LENGTH, AO_BIT_OFFSET);
        GLINT_MASK = EncodingFormat.bitMask(GLINT_BIT_LENGTH, GLINT_BIT_OFFSET);
        SHADE_MODE_MASK = EncodingFormat.bitMask(SHADE_MODE_BIT_LENGTH, SHADE_MODE_BIT_OFFSET);
        QUAD_ATLAS_MASK = EncodingFormat.bitMask(QUAD_ATLAS_BIT_LENGTH, QUAD_ATLAS_BIT_OFFSET);
        Preconditions.checkArgument((TOTAL_BIT_LENGTH <= 32 ? 1 : 0) != 0, (String)"Indigo header encoding bit count (%s) exceeds integer bit length)", (int)TOTAL_STRIDE);
    }

    static @Nullable class08915 glint(int n) {
        return NULLABLE_GLINTS[(n & GLINT_MASK) >>> GLINT_BIT_OFFSET];
    }

    static int glint(int n, @Nullable class08915 class089152) {
        int n2 = class089152 == null ? NULL_GLINT_INDEX : class089152.ordinal();
        return n & ~GLINT_MASK | n2 << GLINT_BIT_OFFSET;
    }

    static QuadAtlas quadAtlas(int n) {
        return QUAD_ATLASES[(n & QUAD_ATLAS_MASK) >>> QUAD_ATLAS_BIT_OFFSET];
    }

    static int quadAtlas(int n, QuadAtlas quadAtlas) {
        return n & ~QUAD_ATLAS_MASK | quadAtlas.ordinal() << QUAD_ATLAS_BIT_OFFSET;
    }

    static int emissive(int n, boolean bl) {
        return bl ? n | EMISSIVE_MASK : n & ~EMISSIVE_MASK;
    }

    static boolean emissive(int n) {
        return (n & EMISSIVE_MASK) != 0;
    }

    static int cullFace(int n, @Nullable class07211 class072112) {
        return n & ~CULL_MASK | ModelHelper.toFaceIndex((class07211)class072112) << 0;
    }

    static @Nullable class07211 cullFace(int n) {
        return ModelHelper.faceFromIndex((int)((n & CULL_MASK) >>> 0));
    }

    static int shadeMode(int n, ShadeMode shadeMode) {
        return n & ~SHADE_MODE_MASK | shadeMode.ordinal() << SHADE_MODE_BIT_OFFSET;
    }

    static ShadeMode shadeMode(int n) {
        return SHADE_MODES[(n & SHADE_MODE_MASK) >>> SHADE_MODE_BIT_OFFSET];
    }

    static int lightFace(int n, class07211 class072112) {
        return n & ~LIGHT_MASK | ModelHelper.toFaceIndex((class07211)class072112) << LIGHT_BIT_OFFSET;
    }

    static class07211 lightFace(int n) {
        return ModelHelper.faceFromIndex((int)((n & LIGHT_MASK) >>> LIGHT_BIT_OFFSET));
    }

    static int renderLayer(int n, @Nullable class08743 class087432) {
        int n2 = class087432 == null ? NULL_RENDER_LAYER_INDEX : class087432.ordinal();
        return n & ~RENDER_LAYER_MASK | n2 << RENDER_LAYER_BIT_OFFSET;
    }

    static @Nullable class08743 renderLayer(int n) {
        return NULLABLE_BLOCK_RENDER_LAYERS[(n & RENDER_LAYER_MASK) >>> RENDER_LAYER_BIT_OFFSET];
    }

    static int normalFlags(int n) {
        return (n & NORMALS_MASK) >>> NORMALS_BIT_OFFSET;
    }

    static int normalFlags(int n, int n2) {
        return n & ~NORMALS_MASK | n2 << NORMALS_BIT_OFFSET & NORMALS_MASK;
    }

    static boolean diffuseShade(int n) {
        return (n & DIFFUSE_MASK) != 0;
    }

    static int diffuseShade(int n, boolean bl) {
        return bl ? n | DIFFUSE_MASK : n & ~DIFFUSE_MASK;
    }

    static int ambientOcclusion(int n, TriState triState) {
        return n & ~AO_MASK | triState.ordinal() << AO_BIT_OFFSET;
    }

    static TriState ambientOcclusion(int n) {
        return TRI_STATES[(n & AO_MASK) >>> AO_BIT_OFFSET];
    }

    static int geometryFlags(int n, int n2) {
        return n & ~GEOMETRY_MASK | n2 << GEOMETRY_BIT_OFFSET & GEOMETRY_MASK;
    }

    static int geometryFlags(int n) {
        return (n & GEOMETRY_MASK) >>> GEOMETRY_BIT_OFFSET;
    }
}

