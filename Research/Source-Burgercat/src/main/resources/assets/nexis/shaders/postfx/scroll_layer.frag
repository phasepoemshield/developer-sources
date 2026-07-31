#version 330 core
in vec2 vUv;
in vec2 vLocalPx;
in vec2 vPosPx;
uniform sampler2D uSource;
uniform vec2 uTextureSize;
uniform vec2 uSize;
uniform vec4 uRadii;
uniform vec4 uClipRect;
uniform vec4 uClipRadii;
uniform float uFadePx;
uniform float uEdgeBlurPx;
uniform float uMotionBlurPx;
uniform float uMotionStrength;
uniform float uFocusStrength;
uniform float uDirection;
uniform float uAlpha;
out vec4 fragColor;

float radiusAt(vec2 p, vec4 r) {
    return p.x > 0.0 ? (p.y > 0.0 ? r.z : r.y) : (p.y > 0.0 ? r.w : r.x);
}

float sdRoundBox(vec2 p, vec2 halfSize, vec4 radii) {
    vec4 safeRadii = min(max(radii, vec4(0.0)), min(halfSize.x, halfSize.y));
    float rad = radiusAt(p, safeRadii);
    vec2 q = abs(p) - halfSize + rad;
    return min(max(q.x, q.y), 0.0) + length(max(q, vec2(0.0))) - rad;
}

float coverage(float distanceValue) {
    float px = max(fwidth(distanceValue) * 0.7071, 0.0001);
    return smoothstep(px, -px, distanceValue);
}

float smootherstep01(float t) {
    t = clamp(t, 0.0, 1.0);
    return t * t * t * (t * (t * 6.0 - 15.0) + 10.0);
}

float fadeCurve(float t) {
    t = clamp(t, 0.0, 1.0);
    float inv = 1.0 - t;
    return 1.0 - inv * inv * inv;
}

float hash12(vec2 p) {
    vec3 p3 = fract(vec3(p.xyx) * 0.1031);
    p3 += dot(p3, p3.yzx + vec3(33.33));
    return fract((p3.x + p3.y) * p3.z);
}

vec4 sampleLayer(vec2 uv) {
    return texture(uSource, clamp(uv, vec2(0.0), vec2(1.0)));
}

void main() {
    if (uClipRect.z <= 0.0 || uClipRect.w <= 0.0) {
        discard;
    }
    if (vPosPx.x < uClipRect.x || vPosPx.y < uClipRect.y ||
        vPosPx.x >= uClipRect.x + uClipRect.z ||
        vPosPx.y >= uClipRect.y + uClipRect.w) {
        discard;
    }

    float motion = clamp(uMotionStrength, 0.0, 1.0);
    float motionEase = smootherstep01(motion);
    float blurPx = uMotionBlurPx * motionEase;

    vec4 color;
    if (blurPx <= 0.15) {
        color = sampleLayer(vUv);
    } else {
        float dir = uDirection < 0.0 ? -1.0 : 1.0;
        float invH = 1.0 / max(uTextureSize.y, 1.0);

        const float INV_2SIG2 = 2.8344671;
        const int TAPS = 17;

        float jitter = hash12(gl_FragCoord.xy) - 0.5;

        vec4 sum = vec4(0.0);
        float weightSum = 0.0;
        for (int i = 0; i < TAPS; i++) {
            float t = clamp((float(i) + 0.5 + jitter) / float(TAPS), 0.0, 1.0);
            float w = exp(-t * t * INV_2SIG2);
            float laneN = -dir * t;
            vec2 uv = vUv + vec2(0.0, laneN * blurPx * invH);
            vec4 s = sampleLayer(uv);
            sum += vec4(s.rgb * s.a, s.a) * w;
            weightSum += w;
        }

        if (weightSum > 1e-4 && sum.a > 1e-4) {
            color = vec4(sum.rgb / sum.a, sum.a / weightSum);
        } else {
            color = sampleLayer(vUv);
        }
    }

    float baseBand = max(uFadePx, 1.0);
    float dirSign = uDirection < 0.0 ? -1.0 : (uDirection > 0.0 ? 1.0 : 0.0);
    float topBoost = max(dirSign, 0.0) * motionEase;
    float bottomBoost = max(-dirSign, 0.0) * motionEase;
    float edgeBoost = max(uEdgeBlurPx, 0.0) * motionEase * 0.5;
    float topBand = baseBand * (1.0 + 0.25 * topBoost) + edgeBoost;
    float bottomBand = baseBand * (1.0 + 0.25 * bottomBoost) + edgeBoost;
    float topMask = fadeCurve(vLocalPx.y / topBand);
    float bottomMask = fadeCurve((uSize.y - vLocalPx.y) / bottomBand);
    float edgeMask = topMask * bottomMask;

    float roundMask = coverage(sdRoundBox(vLocalPx - uSize * 0.5, uSize * 0.5, uRadii));
    float clipMask = 1.0;
    if (uClipRadii.x + uClipRadii.y + uClipRadii.z + uClipRadii.w > 0.0001) {
        vec2 clipHalf = uClipRect.zw * 0.5;
        vec2 clipCenter = uClipRect.xy + clipHalf;
        clipMask = coverage(sdRoundBox(vPosPx - clipCenter, clipHalf, uClipRadii));
    }

    if (uFocusStrength > 0.001) {
        vec2 toCenter = (vLocalPx - uSize * 0.5) / max(uSize * 0.5, vec2(1.0));
        float r2 = clamp(dot(toCenter, toCenter), 0.0, 1.0);
        float vignette = 1.0 - smootherstep01(r2) * (0.18 * uFocusStrength);
        color.rgb *= vignette;
    }

    color *= edgeMask * roundMask * clipMask * clamp(uAlpha, 0.0, 1.0);
    if (color.a <= 0.001) {
        discard;
    }
    fragColor = color;
}
