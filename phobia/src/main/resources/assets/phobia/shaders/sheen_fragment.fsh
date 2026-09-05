#version 410 core

layout(std140) uniform Uniforms {
    mat4 uProjection;
    vec4 uRect;
    vec4 uParams;
    vec4 uColor;
    vec4 uMisc;
};

in vec2 vPos;
out vec4 fragColor;

float sdRoundedBox(vec2 p, vec2 b, float r) {
    r = min(r, min(b.x, b.y));
    vec2 q = abs(p) - b + r;
    return min(max(q.x, q.y), 0.0) + length(max(q, 0.0)) - r;
}

void main() {
    vec2 center = uRect.xy + uRect.zw * 0.5;
    vec2 halfSize = uRect.zw * 0.5;
    vec2 local = vPos - center;

    float radius = uParams.x;
    float angle = uParams.y;
    float halfWidth = max(uParams.z, 0.5);

    float dist = sdRoundedBox(local, halfSize, radius);
    float edge = max(fwidth(dist), 0.35);
    float inset = max(uMisc.y, 2.0);
    float inside = 1.0 - smoothstep(-edge, edge, dist + inset);
    if (inside <= 0.001) discard;

    float c = cos(angle);
    float s = sin(angle);
    float band = abs(local.x * s + local.y * c - uMisc.x);
    float core = exp(-pow(band / max(halfWidth * 0.48, 0.4), 2.0));
    float wash = exp(-pow(band / halfWidth, 2.2));
    float sheen = wash * 0.55 + core * 0.45;
    float endFade = min(halfSize.x, halfSize.y) * 0.62;
    sheen *= smoothstep(0.0, endFade, halfSize.x - abs(local.x));
    sheen *= smoothstep(0.0, endFade, halfSize.y - abs(local.y));

    float alpha = uColor.a * sheen * inside;
    if (alpha <= 0.001) discard;
    fragColor = vec4(uColor.rgb, alpha);
}
