#version 150

#moj_import <destra:common.glsl>

in vec2 FragCoord;

uniform vec2 size;
uniform float round;
uniform float thickness;
uniform vec4 colorTopLeft;
uniform vec4 colorTopRight;
uniform vec4 colorBottomRight;
uniform vec4 colorBottomLeft;

out vec4 fragColor;

float alpha(vec2 d, vec2 d1) {
    vec2 v = abs(d) - d1 + round;
    return min(max(v.x, v.y), 0.0) + length(max(v, 0.0)) - round;
}

vec4 getGradientColor(vec2 fragPos) {
    vec2 normalized = fragPos / size;
    vec4 topColor = mix(colorTopLeft, colorTopRight, normalized.x);
    vec4 bottomColor = mix(colorBottomLeft, colorBottomRight, normalized.x);
    return mix(topColor, bottomColor, normalized.y);
}

void main() {
    vec2 tex = FragCoord;
    vec2 centre = 0.5 * size;
    vec2 smoothness = vec2(thickness - 1.5, thickness);

    float alphaValue = alpha(centre - (tex * size), centre - thickness);

    if (abs(alphaValue) > smoothness.y) {
        discard;
        return;
    }

    float alphaMultiplier = 1.0 - smoothstep(smoothness.x, smoothness.y, abs(alphaValue));

    vec4 gradientColor = getGradientColor(tex * size);

    fragColor = vec4(gradientColor.rgb, gradientColor.a * alphaMultiplier);
}