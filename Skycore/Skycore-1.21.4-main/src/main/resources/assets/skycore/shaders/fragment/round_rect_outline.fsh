#version 150

in vec2 texCoord;
out vec4 fragColor;

uniform vec2 location, rectSize;
uniform vec4 color;
uniform vec4 outlineColor;
uniform float radius;
uniform float thickness;

float roundSDF(vec2 p, vec2 b, float r) {
    return length(max(abs(p) - b, 0.0)) - r;
}

void main() {
    vec2 rectHalf = rectSize * .5;
    vec2 p = rectHalf - (texCoord * rectSize);
    float dist = roundSDF(p, rectHalf - radius - 1., radius);
    float outline = smoothstep(-thickness, 0.0, dist) - smoothstep(0.0, 1.0, dist);
    fragColor = vec4(outlineColor.rgb, outline * outlineColor.a);
}
