#version 410 core

layout(std140) uniform Uniforms {
    mat4 uProjection;
    vec4 uRect;
    vec4 uParams;
    vec4 uColor;
    vec4 uExtra;
};

in vec2 vLocal;
in vec2 vHalfSize;

out vec4 fragColor;

float sdRoundedBox(vec2 point, vec2 halfSize, float radius) {
    vec2 q = abs(point) - halfSize + radius;
    return min(max(q.x, q.y), 0.0) + length(max(q, 0.0)) - radius;
}

void main() {
    float softness = max(0.5, uParams.y);
    float distanceToPanel = sdRoundedBox(vLocal, vHalfSize, min(uParams.x, min(vHalfSize.x, vHalfSize.y)));
    float edge = max(fwidth(distanceToPanel), 0.35);

    float outside = max(distanceToPanel, 0.0);
    // A compact Gaussian keeps the edge dense and avoids a long translucent
    // tail on one side of small HUD panels.
    float sigma = softness * 0.34;
    float gaussian = exp(-0.5 * (outside * outside) / (sigma * sigma));
    float outsideMask = smoothstep(-edge, 0.0, distanceToPanel);
    float alpha = gaussian * outsideMask * uColor.a;

    if (alpha <= 0.001) discard;
    fragColor = vec4(uColor.rgb, alpha);
}
