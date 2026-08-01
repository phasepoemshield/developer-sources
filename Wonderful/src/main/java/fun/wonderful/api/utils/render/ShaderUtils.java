package fun.wonderful.api.utils.render;

import fun.wonderful.api.QClient;
import lombok.Generated;
import net.minecraft.client.gl.Defines;
import net.minecraft.client.gl.ShaderProgramKey;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat;
import net.minecraft.util.Identifier;

public final class ShaderUtils
implements QClient {
    public static final ShaderProgramKey roundedRect = ShaderUtils.register("rect", "rounded_rect", VertexFormats.POSITION_COLOR);
    public static final ShaderProgramKey roundedRectOutline = ShaderUtils.register("rect", "rounded_rect_outline", VertexFormats.POSITION_COLOR);
    public static final ShaderProgramKey ringArc = ShaderUtils.register("ring_arc", "ring_arc", VertexFormats.POSITION_COLOR);
    public static final ShaderProgramKey roundedTexture = ShaderUtils.register("texture", "texture_rect", VertexFormats.POSITION_TEXTURE_COLOR);
    public static final ShaderProgramKey liquidGlass = ShaderUtils.register("liquidglass", "liquid", VertexFormats.POSITION_TEXTURE_COLOR);
    public static final ShaderProgramKey kawaseDown = ShaderUtils.register("kawase_down", "kawase_down", VertexFormats.POSITION_TEXTURE_COLOR);
    public static final ShaderProgramKey kawaseUp = ShaderUtils.register("kawase_up", "kawase_up", VertexFormats.POSITION_TEXTURE_COLOR);
    public static final ShaderProgramKey gradientRect = ShaderUtils.register("gradient_rect", "gradient", VertexFormats.POSITION_TEXTURE_COLOR);
    public static final ShaderProgramKey hueSlider = ShaderUtils.register("hue_slider", "hue_slider", VertexFormats.POSITION_COLOR);
    public static final ShaderProgramKey shadowRect = ShaderUtils.register("shadow_rect", "shadow", VertexFormats.POSITION_COLOR);
    public static final ShaderProgramKey shadow6Rect = ShaderUtils.register("shadow6", "shadow", VertexFormats.POSITION_COLOR);
    public static final ShaderProgramKey fontsMsdf = ShaderUtils.register("fonts", "fonts", VertexFormats.POSITION_TEXTURE_COLOR);
    public static final ShaderProgramKey face = ShaderUtils.register("face", "face", VertexFormats.POSITION_TEXTURE_COLOR);
    public static final ShaderProgramKey gradient6Rect = ShaderUtils.register("gradient6", "gradient", VertexFormats.POSITION_COLOR);
    public static final ShaderProgramKey blockOverlay = ShaderUtils.register("blockoverlay", "block_overlay", VertexFormats.POSITION_TEXTURE_COLOR);
    public static final ShaderProgramKey blockOverlayWorld = ShaderUtils.register("blockoverlay", "block_overlay_world", VertexFormats.POSITION_TEXTURE_COLOR);
    public static final ShaderProgramKey blockOverlayFractal = ShaderUtils.register("blockoverlay", "block_overlay_fractal", VertexFormats.POSITION_TEXTURE_COLOR);
    public static final ShaderProgramKey blockOverlayWarp = ShaderUtils.register("blockoverlay", "block_overlay_warp", VertexFormats.POSITION_TEXTURE_COLOR);
    public static final ShaderProgramKey chamsFill = ShaderUtils.register("chams", "chams_fill", VertexFormats.POSITION_TEXTURE_COLOR);
    public static final ShaderProgramKey shaderHandsMaskDiff = ShaderUtils.register("hands", "hands_mask_diff", VertexFormats.POSITION_TEXTURE_COLOR);
    public static final ShaderProgramKey shaderHandsOverlay = ShaderUtils.register("hands", "hands_overlay", VertexFormats.POSITION_TEXTURE_COLOR);
    public static final ShaderProgramKey shaderHandsGlow = ShaderUtils.register("hands", "hands_glow", VertexFormats.POSITION_TEXTURE_COLOR);
    public static final ShaderProgramKey shaderHandsFire = ShaderUtils.register("hands", "hands_fire", VertexFormats.POSITION_TEXTURE_COLOR);
    public static final ShaderProgramKey shaderHandsKawaseDown = ShaderUtils.register("hands", "hands_kawase_down", VertexFormats.POSITION_TEXTURE_COLOR);
    public static final ShaderProgramKey shaderHandsKawaseUp = ShaderUtils.register("hands", "hands_kawase_up", VertexFormats.POSITION_TEXTURE_COLOR);
    public static final ShaderProgramKey skyFog = ShaderUtils.register("sky", "sky_fog", VertexFormats.POSITION_TEXTURE_COLOR);
    public static final ShaderProgramKey skyRain = ShaderUtils.register("sky", "sky_rain", VertexFormats.POSITION_TEXTURE_COLOR);
    public static final ShaderProgramKey skyPolar = ShaderUtils.register("sky", "sky_polar", VertexFormats.POSITION_TEXTURE_COLOR);

    private static ShaderProgramKey register(String shaderNamePackage, String shaderName, VertexFormat vertexFormat) {
        return new ShaderProgramKey(Identifier.of((String)"wonderful", (String)("core/" + shaderNamePackage + "/" + shaderName)), vertexFormat, Defines.EMPTY);
    }

    @Generated
    private ShaderUtils() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }
}