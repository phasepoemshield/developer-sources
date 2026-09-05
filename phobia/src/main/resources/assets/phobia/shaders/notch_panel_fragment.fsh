#version 410 core

layout(std140) uniform Uniforms {
    mat4 uProjection;
    vec4 uQuad;
    vec4 uPanel;
    vec4 uPanelRadii;
    vec4 uNeck;
    vec4 uNeckRadii;
    vec4 uFill;
    vec4 uBorder;
    vec4 uInner;
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

/** Quadratic smooth union: the concave fillet where the neck meets the panel. */
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
    vec2 local = vPos - (uPanel.xy + panelHalf);
    float bumpW = uMisc.z;
    float bumpH = uMisc.w;
    if (bumpW > 0.5 && abs(bumpH) > 0.5) {
        float t = (vPos.x - uMisc.y) / bumpW;
        float env = max(1.0 - t * t, 0.0);
        float bump = abs(bumpH) * env * env;
        float edgeMask = (bumpH > 0.0)
                ? smoothstep(panelHalf.y * 0.20, -panelHalf.y * 0.55, local.y)
                : smoothstep(-panelHalf.y * 0.20, panelHalf.y * 0.55, local.y);
        local.y += ((bumpH > 0.0) ? bump : -bump) * edgeMask;
    }
    float dist = sdRoundedBox(local, panelHalf, uPanelRadii);

    if (uNeck.z > 0.05 && uNeck.w > 0.05) {
        vec2 neckHalf = uNeck.zw * 0.5;
        float neck = sdRoundedBox(vPos - (uNeck.xy + neckHalf), neckHalf, uNeckRadii);
        dist = smoothUnion(dist, neck, uParams.x);
    }

    float edge = max(fwidth(dist), 0.35);
    float inside = 1.0 - smoothstep(-edge, edge, dist);
    if (inside <= 0.001) discard;

    vec4 color = vec4(uFill.rgb, uFill.a * inside);

    float depth = max(-dist - uParams.w * 0.5, 0.0);
    float fade = clamp(1.0 - depth / max(uParams.z, 0.01), 0.0, 1.0);
    color = over(vec4(uInner.rgb, inside * fade * fade * uInner.a), color);

    float thickness = max(uParams.y, 0.0);
    if (thickness > 0.0) {
        float band = abs(dist + thickness * 0.5) - thickness * 0.5;
        float stroke = 1.0 - smoothstep(-edge, edge, band);
        color = over(vec4(uBorder.rgb, stroke * uBorder.a), color);
    }

    if (color.a <= 0.001) discard;
    fragColor = color;
}
