#version 410 core

layout(std140) uniform Uniforms {
    mat4 uProjection;
    vec4 uQuad;
    vec4 uPanel;
    vec4 uPanelRadii;
    vec4 uTail;
    vec4 uTailRadii;
    vec4 uFill;
    vec4 uBorder;
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

// Teardrop: large circle at the base, small circle at the tip, straight sides between.
float sdUnevenCapsule(vec2 p, vec2 a, vec2 b, float rA, float rB) {
    vec2 ba = b - a;
    float h = length(ba);
    if (h < 0.001) return length(p - a) - max(rA, rB);
    vec2 dir = ba / h;
    vec2 pa = p - a;
    vec2 local = vec2(pa.x * dir.y - pa.y * dir.x, dot(pa, dir));
    local.x = abs(local.x);
    float tilt = (rA - rB) / h;
    float side = sqrt(max(1.0 - tilt * tilt, 0.0));
    float k = dot(local, vec2(-tilt, side));
    if (k < 0.0) return length(local) - rA;
    if (k > side * h) return length(local - vec2(0.0, h)) - rB;
    return dot(local, vec2(side, tilt)) - rA;
}

float smoothUnion(float a, float b, float k) {
    if (k <= 0.001) return min(a, b);
    float h = clamp(0.5 + 0.5 * (b - a) / k, 0.0, 1.0);
    return mix(b, a, h) - k * h * (1.0 - h);
}

vec4 over(vec4 src, vec4 dst) {
    float alpha = src.a + dst.a * (1.0 - src.a);
    if (alpha <= 0.0001) return vec4(0.0);
    vec3 rgb = (src.rgb * src.a + dst.rgb * dst.a * (1.0 - src.a)) / alpha;
    return vec4(rgb, alpha);
}

void main() {
    vec2 panelHalf = uPanel.zw * 0.5;
    float dist = sdRoundedBox(vPos - (uPanel.xy + panelHalf), panelHalf, uPanelRadii);

    if (uTailRadii.x > 0.05 && uTailRadii.y > 0.05) {
        float tail = sdUnevenCapsule(vPos, uTail.xy, uTail.zw, uTailRadii.x, uTailRadii.y);
        dist = smoothUnion(dist, tail, uParams.x);
    }

    float edge = max(fwidth(dist), 0.35);
    float inside = 1.0 - smoothstep(-edge, edge, dist);
    if (inside <= 0.001) discard;

    vec4 color = vec4(uFill.rgb, uFill.a * inside);

    float thickness = max(uParams.y, 0.0);
    if (thickness > 0.0) {
        float band = abs(dist + thickness * 0.5) - thickness * 0.5;
        float stroke = 1.0 - smoothstep(-edge, edge, band);
        color = over(vec4(uBorder.rgb, stroke * uBorder.a), color);
    }

    if (color.a <= 0.001) discard;
    fragColor = color;
}
