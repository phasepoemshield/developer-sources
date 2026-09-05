#version 410 core

layout(std140) uniform Uniforms {
    mat4 uProjection;
    vec4 uRect;
    vec4 uParams;
    vec4 uColor;
};

in vec2 vLocal;
in vec2 vHalfSize;
out vec4 fragColor;

float sdRoundedBox(vec2 point, vec2 halfSize, float radius) {
    vec2 q = abs(point) - halfSize + radius;
    return min(max(q.x, q.y), 0.0) + length(max(q, 0.0)) - radius;
}

void main() {
    float radius = min(uParams.x, min(vHalfSize.x, vHalfSize.y));
    float blur = max(uParams.y, 0.01);
    float distanceToPanel = sdRoundedBox(vLocal, vHalfSize, radius);
    float edge = max(fwidth(distanceToPanel), 0.35);
    float inside = 1.0 - smoothstep(-edge, edge, distanceToPanel);
    float depth = max(-distanceToPanel - uParams.z * 0.5, 0.0);
    float fade = clamp(1.0 - depth / blur, 0.0, 1.0);
    float alpha = inside * fade * fade * uColor.a;
    if (alpha <= 0.001) discard;
    fragColor = vec4(uColor.rgb, alpha);
}
