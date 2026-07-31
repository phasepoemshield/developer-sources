package ru.destra.font;

public record TextRenderOptions(
    FontRenderer font,
    float thickness,
    float smoothness,
    int outlineColor,
    float outlineThickness,
    boolean outlineEnabled,
    boolean enableFadeout,
    float fadeInStart,
    float fadeInEnd,
    float fadeoutStart,
    float fadeoutEnd,
    float maxWidth,
    float fadeAnchorX
) {
    public static TextRenderOptions from(MsdfTextRender render) {
        return new TextRenderOptions(
            render.font(),
            render.thickness(),
            render.smoothness(),
            render.outlineColor(),
            render.outlineThickness(),
            render.outlineThickness() > 0.0F,
            render.enableFadeout(),
            render.fadeInStart(),
            render.fadeInEnd(),
            render.fadeoutStart(),
            render.fadeoutEnd(),
            render.maxWidth(),
            render.fadeAnchorX()
        );
    }
}
