#version 410 core

layout(std140) uniform Uniforms {
    mat4 uProjection;
    vec4 uRect;
    vec4 uRadii;
    float uThickness;
    float uZ;
    float uProgress;
    float uWindow;
    vec4 uColors[9];
};

in vec2 vUV;
in vec2 vSize;

out vec4 fragColor;

float sdRoundedBox(vec2 p, vec2 b, vec4 r) {
    r.xy = (p.x > 0.0) ? r.xy : r.zw;
    r.x  = (p.y > 0.0) ? r.x  : r.y;
    vec2 q = abs(p) - b + r.x;
    return min(max(q.x, q.y), 0.0) + length(max(q, 0.0)) - r.x;
}

vec4 sampleColor(vec2 uv) {
    float wx[3];
    wx[0] = clamp(1.0 - uv.x * 2.0, 0.0, 1.0);
    wx[1] = 1.0 - abs(uv.x * 2.0 - 1.0);
    wx[2] = clamp(uv.x * 2.0 - 1.0, 0.0, 1.0);

    float wy[3];
    wy[0] = clamp(1.0 - uv.y * 2.0, 0.0, 1.0);
    wy[1] = 1.0 - abs(uv.y * 2.0 - 1.0);
    wy[2] = clamp(uv.y * 2.0 - 1.0, 0.0, 1.0);

    for(int i = 0; i < 3; i++) {
        wx[i] = wx[i] * wx[i] * (3.0 - 2.0 * wx[i]);
        wy[i] = wy[i] * wy[i] * (3.0 - 2.0 * wy[i]);
    }

    vec4 result = vec4(0.0);
    float totalWeight = 0.0;

    for(int j = 0; j < 3; j++) {
        for(int i = 0; i < 3; i++) {
            float w = wx[i] * wy[j];
            result += uColors[j * 3 + i] * w;
            totalWeight += w;
        }
    }

    return result / max(totalWeight, 0.001);
}

const float PI = 3.14159265;
const float HALF_PI = 1.5707963;

float perimeterT(vec2 p, vec2 size, float r) {
    float w = size.x;
    float h = size.y;
    r = clamp(r, 0.0, min(w, h) * 0.5);
    float sh = max(0.0, w - 2.0 * r);
    float sv = max(0.0, h - 2.0 * r);
    float arc = HALF_PI * r;
    float halfTop = sh * 0.5;
    float total = max(2.0 * sh + 2.0 * sv + 4.0 * arc, 0.001);

    bool inTop = p.y <= r + 0.75;
    bool inBottom = p.y >= h - r - 0.75;
    bool inLeft = p.x <= r + 0.75;
    bool inRight = p.x >= w - r - 0.75;
    float pos;
    if (inTop && !inLeft && !inRight) {
        pos = p.x >= w * 0.5 ? p.x - w * 0.5 : total - (w * 0.5 - p.x);
    } else if (inTop && inRight) {
        vec2 c = vec2(w - r, r);
        float a = atan(p.y - c.y, p.x - c.x);
        pos = halfTop + clamp((a + HALF_PI) / HALF_PI, 0.0, 1.0) * arc;
    } else if (inRight && !inTop && !inBottom) {
        pos = halfTop + arc + (p.y - r);
    } else if (inBottom && inRight) {
        vec2 c = vec2(w - r, h - r);
        float a = atan(p.y - c.y, p.x - c.x);
        pos = halfTop + arc + sv + clamp(a / HALF_PI, 0.0, 1.0) * arc;
    } else if (inBottom && !inLeft && !inRight) {
        pos = halfTop + 2.0 * arc + sv + (w - r - p.x);
    } else if (inBottom && inLeft) {
        vec2 c = vec2(r, h - r);
        float a = atan(p.y - c.y, p.x - c.x);
        pos = halfTop + 2.0 * arc + sv + sh + clamp((a - HALF_PI) / HALF_PI, 0.0, 1.0) * arc;
    } else if (inLeft && !inTop && !inBottom) {
        pos = halfTop + 3.0 * arc + sv + sh + (h - r - p.y);
    } else if (inTop && inLeft) {
        vec2 c = vec2(r, r);
        float a = atan(p.y - c.y, p.x - c.x);
        if (a < 0.0) a += 2.0 * PI;
        pos = halfTop + 3.0 * arc + 2.0 * sv + sh + clamp((a - PI) / HALF_PI, 0.0, 1.0) * arc;
    } else {
        vec2 fromCenter = p - size * 0.5;
        float angle = atan(fromCenter.y, fromCenter.x);
        pos = fract((angle + HALF_PI) / (2.0 * PI)) * total;
    }
    return pos / total;
}

void main() {
    vec2 pixelPos = vUV * vSize;
    vec2 center = vSize * 0.5;

    float dist = sdRoundedBox(pixelPos - center, center, uRadii);
    float edge = fwidth(dist);

    float d2 = abs(dist + uThickness * 0.5) - uThickness * 0.5;
    float alpha = 1.0 - smoothstep(-edge, edge, d2);

    float progress = clamp(uProgress, 0.0, 1.0);
    float window = uWindow;
    if (window > 0.001 && window < 0.999) {
        float radius = max(max(uRadii.x, uRadii.y), max(uRadii.z, uRadii.w));
        float t = perimeterT(pixelPos, vSize, radius);
        float period = max(window, 0.02);
        float cell = fract((t - progress) / period);
        float duty = 0.55;
        float aa = max(fwidth(t) / period, 0.02);
        float dash = 1.0 - smoothstep(duty - aa, duty + aa, cell);
        alpha *= dash;
    } else if (progress < 0.999) {
        float radius = max(max(uRadii.x, uRadii.y), max(uRadii.z, uRadii.w));
        float t = perimeterT(pixelPos, vSize, radius);
        float drawn = 1.0 - smoothstep(progress - 0.02, progress, t);
        if (t > progress) drawn = 0.0;
        alpha *= drawn;
    }

    if (alpha <= 0.0) discard;

    vec4 color = sampleColor(vUV);
    fragColor = vec4(color.rgb, color.a * alpha);
}
