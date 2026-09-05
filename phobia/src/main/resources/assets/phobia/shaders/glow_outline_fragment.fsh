#version 410 core

layout(std140) uniform Uniforms {
    mat4 uProjection;
    vec4 uRect;
    vec4 uParams;
    vec4 uColor;
    vec4 uExtra;
};

in vec2 vUV;
in vec2 vSize;

out vec4 fragColor;

const float PI = 3.14159265;
const float HALF_PI = 1.5707963;

float sdRoundedBox(vec2 p, vec2 b, float r) {
    vec2 q = abs(p) - b + r;
    return min(max(q.x, q.y), 0.0) + length(max(q, 0.0)) - r;
}

float perimeterLength(vec2 size, float r) {
    float straightH = max(0.0, size.x - 2.0 * r);
    float straightV = max(0.0, size.y - 2.0 * r);
    return 2.0 * straightH + 2.0 * straightV + 2.0 * PI * r;
}

// 0 at top-center, then clockwise along the rounded rect.
float perimeterPosition(vec2 p, vec2 size, float r) {
    float w = size.x;
    float h = size.y;
    r = clamp(r, 0.0, min(w, h) * 0.5);
    float sh = max(0.0, w - 2.0 * r);
    float sv = max(0.0, h - 2.0 * r);
    float arc = HALF_PI * r;
    float halfTop = sh * 0.5;
    float total = 2.0 * sh + 2.0 * sv + 4.0 * arc;

    bool inTop = p.y <= r + 0.5;
    bool inBottom = p.y >= h - r - 0.5;
    bool inLeft = p.x <= r + 0.5;
    bool inRight = p.x >= w - r - 0.5;

    if (inTop && !inLeft && !inRight) {
        if (p.x >= w * 0.5) return p.x - w * 0.5;
        return total - (w * 0.5 - p.x);
    }
    if (inTop && inRight) {
        vec2 c = vec2(w - r, r);
        float a = atan(p.y - c.y, p.x - c.x);
        float t = clamp((a + HALF_PI) / HALF_PI, 0.0, 1.0);
        return halfTop + t * arc;
    }
    if (inRight && !inTop && !inBottom) {
        return halfTop + arc + (p.y - r);
    }
    if (inBottom && inRight) {
        vec2 c = vec2(w - r, h - r);
        float a = atan(p.y - c.y, p.x - c.x);
        float t = clamp(a / HALF_PI, 0.0, 1.0);
        return halfTop + arc + sv + t * arc;
    }
    if (inBottom && !inLeft && !inRight) {
        return halfTop + 2.0 * arc + sv + (w - r - p.x);
    }
    if (inBottom && inLeft) {
        vec2 c = vec2(r, h - r);
        float a = atan(p.y - c.y, p.x - c.x);
        float t = clamp((a - HALF_PI) / HALF_PI, 0.0, 1.0);
        return halfTop + 2.0 * arc + sv + sh + t * arc;
    }
    if (inLeft && !inTop && !inBottom) {
        return halfTop + 3.0 * arc + sv + sh + (h - r - p.y);
    }
    if (inTop && inLeft) {
        vec2 c = vec2(r, r);
        float a = atan(p.y - c.y, p.x - c.x);
        if (a < 0.0) a += 2.0 * PI;
        float t = clamp((a - PI) / HALF_PI, 0.0, 1.0);
        return halfTop + 3.0 * arc + 2.0 * sv + sh + t * arc;
    }

    vec2 fromCenter = p - size * 0.5;
    float angle = atan(fromCenter.y, fromCenter.x);
    return fract((angle + HALF_PI) / (2.0 * PI)) * total;
}

void main() {
    float radius = uParams.x;
    float thickness = uParams.y;
    float progress = clamp(uParams.z, 0.0, 1.0);
    float baseAlpha = uParams.w;

    vec2 pixelPos = vUV * vSize;
    vec2 center = vSize * 0.5;

    float dist = sdRoundedBox(pixelPos - center, center, radius);
    float edge = fwidth(dist);

    float glowSize = thickness * 3.25;
    float innerDist = abs(dist + thickness * 0.5) - thickness * 0.5;
    float outlineAlpha = 1.0 - smoothstep(-edge, edge, innerDist);

    float glowAlpha = 0.0;
    if (dist > -glowSize && dist < glowSize) {
        glowAlpha = 1.0 - abs(dist) / glowSize;
        glowAlpha = glowAlpha * glowAlpha * 0.55;
    }

    float total = max(perimeterLength(vSize, radius), 0.001);
    float pos = clamp(perimeterPosition(pixelPos, vSize, radius) / total, 0.0, 1.0);

    float drawn = 1.0;
    float head = 0.0;
    if (progress < 0.999) {
        float headWidth = 0.07;
        drawn = 1.0 - smoothstep(progress - 0.012, progress, pos);
        if (pos > progress) drawn = 0.0;
        float ahead = pos - progress;
        if (ahead < 0.0) ahead += 1.0;
        float behind = progress - pos;
        if (behind < 0.0) behind += 1.0;
        head = 1.0 - smoothstep(0.0, headWidth, behind);
        if (pos > progress && ahead > headWidth) head = 0.0;
    }

    float sweepMask = max(drawn, head);
    float finalAlpha = max(outlineAlpha, glowAlpha) * baseAlpha * sweepMask;
    if (finalAlpha <= 0.001) discard;

    vec3 color = uColor.rgb;
    float brightness = 1.0 + glowAlpha * 0.45 + head * 0.85;
    fragColor = vec4(color * brightness, uColor.a * finalAlpha);
}
