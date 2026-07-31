#version 150

#moj_import <destra:common.glsl>

in vec2 FragCoord;
in vec2 TexCoord;
in vec2 GlobalPos;
in float CornerRadius;
in vec4 FragColor;

uniform sampler2D Sampler0;
uniform vec2 PixelScale;
uniform float softness;

out vec4 OutColor;

void main() {
    vec2 dxGlobal = dFdx(GlobalPos);
    vec2 dyGlobal = dFdy(GlobalPos);
    vec2 dxLocal = dFdx(FragCoord);
    vec2 dyLocal = dFdy(FragCoord);
    float width = abs(dxGlobal.x) / max(abs(dxLocal.x), 0.0001);
    float height = abs(dyGlobal.y) / max(abs(dyLocal.y), 0.0001);
    vec2 size = max(vec2(width, height) * PixelScale, vec2(1.0));
    float radius = clamp(CornerRadius, 0.0, min(size.x, size.y) * 0.5);
    float alpha = ralpha(size, FragCoord, vec4(radius), softness);
    vec4 color = vec4(1.0, 1.0, 1.0, alpha) * texture(Sampler0, TexCoord) * FragColor;

    if (color.a == 0.0) {
        discard;
    }

    OutColor = color;
}
