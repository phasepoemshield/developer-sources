#version 410 core

layout(std140) uniform Uniforms {
    mat4 uProjection;
    vec4 uQuad;
    vec4 uPanel;
    vec4 uPanelRadii;
    vec4 uColorTop;
    vec4 uColorMid;
    vec4 uColorBottom;
    vec4 uWave;
    vec4 uParams;
    vec4 uMisc;
};

in vec2 vPos;

out vec4 fragColor;

float sdRoundedBox(vec2 p, vec2 b, vec4 r) {
    r = min(r, vec4(min(b.x, b.y)));
    r.xy = (p.x > 0.0) ? r.xy : r.zw;
    r.x  = (p.y > 0.0) ? r.x  : r.y;
    vec2 q = abs(p) - b + r.x;
    return min(max(q.x, q.y), 0.0) + length(max(q, 0.0)) - r.x;
}

float sdEllipse(vec2 p, vec2 center, vec2 radius) {
    vec2 q = (p - center) / max(radius, vec2(0.001));
    return (length(q) - 1.0) * min(radius.x, radius.y);
}

float smoothUnion(float a, float b, float k) {
    if (k <= 0.001) return min(a, b);
    float h = clamp(0.5 + 0.5 * (b - a) / k, 0.0, 1.0);
    return mix(b, a, h) - k * h * (1.0 - h);
}

void main() {
    vec2 panelHalf = uPanel.zw * 0.5;
    float box = sdRoundedBox(vPos - (uPanel.xy + panelHalf), panelHalf, uPanelRadii);

    float peakX = clamp(uWave.x, 0.35, 0.85);
    vec2 mainCenter = vec2(
        uPanel.x + uPanel.z * peakX,
        uPanel.y + uPanel.w + uPanel.w * 0.10
    );
    vec2 mainRadius = vec2(uPanel.z * 0.70, uPanel.w * max(uWave.y, 0.20));
    vec2 shoulderCenter = vec2(
        uPanel.x + uPanel.z * 0.20,
        uPanel.y + uPanel.w + uPanel.w * 0.18
    );
    vec2 shoulderRadius = vec2(uPanel.z * 0.46, uPanel.w * max(uWave.z, 0.14));

    float blob = smoothUnion(
        sdEllipse(vPos, mainCenter, mainRadius),
        sdEllipse(vPos, shoulderCenter, shoulderRadius),
        22.0
    );
    float dist = max(box, blob);

    float edge = max(fwidth(dist), 0.7);
    float inside = 1.0 - smoothstep(-edge, edge, dist);
    if (inside <= 0.001) discard;

    float ny = clamp((vPos.y - uPanel.y) / max(uPanel.w, 0.001), 0.0, 1.0);
    float nx = clamp((vPos.x - uPanel.x) / max(uPanel.z, 0.001), 0.0, 1.0);
    vec3 rgb = mix(uColorTop.rgb, uColorBottom.rgb, smoothstep(0.52, 1.0, ny));
    rgb = mix(rgb, uColorMid.rgb, nx * 0.20 * (1.0 - ny * 0.35));

    float alpha = mix(uColorTop.a, uColorBottom.a, smoothstep(0.55, 1.0, ny)) * inside;
    if (alpha <= 0.001) discard;
    fragColor = vec4(rgb, alpha);
}
