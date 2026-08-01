#version 150

#define MAX_BATCH 30
#define STRIDE 30

uniform float shapeData[MAX_BATCH * STRIDE];

flat in int ShapeIndex;

out vec4 fragColor;

float alphaDistance(vec2 d, vec2 d1, vec4 radius) {
    vec2 selectedRadius;
    if (d.x >= 0.0) {
        selectedRadius = (d.y >= 0.0) ? radius.yy : radius.xx;
    } else {
        selectedRadius = (d.y >= 0.0) ? radius.ww : radius.zz;
    }

    vec2 v = abs(d) - d1 + selectedRadius;
    return min(max(v.x, v.y), 0.0) + length(max(v, 0.0)) - selectedRadius.x;
}

vec4 createGradient(vec2 coords, vec4 color1, vec4 color2, vec4 color3, vec4 color4) {
    vec2 clamped = clamp(coords, 0.0, 1.0);
    return mix(mix(color1, color2, clamped.y), mix(color3, color4, clamped.y), clamped.x);
}

void main() {
    int base = ShapeIndex * STRIDE;

    vec2 location = vec2(shapeData[base], shapeData[base + 1]);
    vec2 size = max(vec2(shapeData[base + 2], shapeData[base + 3]), vec2(0.001));
    vec4 radius = vec4(shapeData[base + 4], shapeData[base + 5], shapeData[base + 6], shapeData[base + 7]);
    vec4 color1 = vec4(shapeData[base + 9], shapeData[base + 10], shapeData[base + 11], shapeData[base + 12]);
    vec4 color2 = vec4(shapeData[base + 13], shapeData[base + 14], shapeData[base + 15], shapeData[base + 16]);
    vec4 color3 = vec4(shapeData[base + 17], shapeData[base + 18], shapeData[base + 19], shapeData[base + 20]);
    vec4 color4 = vec4(shapeData[base + 21], shapeData[base + 22], shapeData[base + 23], shapeData[base + 24]);

    vec2 local = gl_FragCoord.xy - location;
    vec2 coord = vec2(local.x / size.x, 1.0 - local.y / size.y);
    vec4 color = createGradient(coord, color1, color2, color3, color4);

    vec2 shaderSize = size * 2.0;
    vec2 st = coord * shaderSize;
    vec2 halfSize = shaderSize * 0.5;
    vec4 shaderRadius = radius * 2.0;
    float distance = alphaDistance(halfSize - st, halfSize - 1.0, shaderRadius);
    float shapeAlpha = 1.0 - smoothstep(0.0, 1.5, distance);

    fragColor = vec4(color.rgb, color.a * shapeAlpha);
}
