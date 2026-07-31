#version 150

uniform sampler2D Sampler0;
uniform sampler2D Sampler1;
uniform sampler2D Sampler2;

uniform float time;
uniform vec2 screenSize;
uniform vec4 baseColor;
uniform vec2 motionVec;

uniform float effectAlpha;
uniform float flameSpeed;
uniform float flameRadius;
uniform float driftScale;
uniform float trailDecay;
uniform float trailStrength;
uniform float fireOnItem;
uniform float composeMode;

in vec2 TexCoord;
out vec4 OutColor;

float random(vec2 p) {
    return fract(sin(dot(p, vec2(127.1, 311.7))) * 43758.5453);
}

float noise(vec2 p) {
    vec2 i = floor(p);
    vec2 f = fract(p);
    float a = random(i);
    float b = random(i + vec2(1.0, 0.0));
    float c = random(i + vec2(0.0, 1.0));
    float d = random(i + vec2(1.0, 1.0));
    vec2 u = f * f * (3.0 - 2.0 * f);
    return mix(a, b, u.x) + (c - a) * u.y * (1.0 - u.x) + (d - b) * u.x * u.y;
}

float fbm(vec2 p) {
    float v = 0.0;
    float a = 0.5;
    for (int i = 0; i < 3; i++) {
        v += a * noise(p);
        p = p * 2.01 + vec2(9.7, 4.9);
        a *= 0.5;
    }
    return v;
}

float handMask(vec2 coord) {
    vec2 texel = 1.0 / screenSize;
    float center = texture(Sampler1, coord).r;
    float minDepth = center;
    minDepth = min(minDepth, texture(Sampler1, coord + vec2(texel.x, 0.0)).r);
    minDepth = min(minDepth, texture(Sampler1, coord - vec2(texel.x, 0.0)).r);
    minDepth = min(minDepth, texture(Sampler1, coord + vec2(0.0, texel.y)).r);
    minDepth = min(minDepth, texture(Sampler1, coord - vec2(0.0, texel.y)).r);
    return smoothstep(0.993, 0.978, minDepth);
}

float dilatedMask(vec2 coord, float radiusPx) {
    vec2 texel = 1.0 / screenSize;
    float m = 0.0;
    for (int i = 0; i < 12; i++) {
        float ang = (6.2831853 / 12.0) * float(i);
        vec2 dir = vec2(cos(ang), sin(ang));
        m = max(m, handMask(coord + dir * texel * radiusPx));
    }
    return m;
}

float edgeDistancePx(vec2 coord, float maxRadiusPx) {
    vec2 texel = 1.0 / screenSize;
    float d = maxRadiusPx + 1.0;

    if (handMask(coord) > 0.04) {
        return 0.0;
    }

    for (int ring = 1; ring <= 3; ring++) {
        float r = maxRadiusPx * (float(ring) / 3.0);
        for (int i = 0; i < 10; i++) {
            float ang = (6.2831853 / 10.0) * float(i);
            vec2 dir = vec2(cos(ang), sin(ang));
            if (handMask(coord + dir * texel * r) > 0.14) {
                d = min(d, r);
            }
        }
    }

    return d;
}

float radialBlurField(vec2 coord, float radiusPx, vec2 flow, float cachedDist) {
    vec2 texel = 1.0 / screenSize;
    float sum = 0.0;
    float wsum = 0.0001;

    for (int i = 0; i < 4; i++) {
        float fi = float(i);
        float ang = fi * 1.5708 + sin(time * 0.65 + fi) * 0.25;
        vec2 dir = vec2(cos(ang), sin(ang));
        float r = (1.8 + fi * 1.15) * (0.65 + driftScale * 0.85);
        vec2 p = coord + dir * texel * r + flow * (0.8 + fi * 0.14);
        float d = (i == 0) ? cachedDist : edgeDistancePx(p, radiusPx * (1.0 + fi * 0.03));
        float s = smoothstep(radiusPx * 1.15, radiusPx * 0.18, d);
        float w = 1.0 / (1.0 + fi * 0.42);
        sum += s * w;
        wsum += w;
    }

    return clamp(sum / wsum, 0.0, 1.0);
}

void main() {
    vec2 uv = TexCoord;
    vec4 scene = texture(Sampler0, uv);

    float mask = handMask(uv);
    float nearMask = dilatedMask(uv, flameRadius * 2.1);
    vec4 history = texture(Sampler2, uv);

    if (nearMask < 0.01 && history.a < 0.004) {
        if (composeMode < 0.5) {
            OutColor = vec4(0.0);
        } else {
            OutColor = scene;
        }
        return;
    }

    vec2 motion = clamp(motionVec, vec2(-2.0), vec2(2.0));
    vec2 texel = 1.0 / screenSize;

    vec2 riseDir = normalize(vec2(-motion.x * 0.7, -1.0 - abs(motion.y) * 0.45));
    vec2 swirl = vec2(
        sin(time * flameSpeed * 1.7 + uv.y * 24.0),
        cos(time * flameSpeed * 1.35 + uv.x * 18.0)
    ) * (0.0018 * (0.6 + driftScale));
    vec2 flow = riseDir * (0.0022 + 0.0013 * driftScale) + swirl;

    float distPx = edgeDistancePx(uv + flow * 1.6, flameRadius * 1.35);
    float shell = smoothstep(flameRadius * 1.22, flameRadius * 0.20, distPx);
    float edgeFade = smoothstep(flameRadius * 0.12, flameRadius * 1.15, distPx);

    vec2 fuv = uv * vec2(4.1, 6.3)
        + vec2(0.0, -time * flameSpeed * 1.18)
        + flow * 155.0
        + vec2(sin(time * 0.9), cos(time * 1.1)) * 0.06;

    float n0 = fbm(fuv);
    float n1 = fbm(fuv * 1.75 + vec2(7.0, -2.0));
    float turbulence = n0 * 0.65 + n1 * 0.35;

    float tongues = 0.5 + 0.5 * sin(time * flameSpeed * 3.4 + uv.x * 31.0 + turbulence * 6.0);
    float tongueShape = smoothstep(0.24, 0.98, turbulence * 0.74 + tongues * 0.52);

    float coreLayer = shell * tongueShape;
    float softLayer = radialBlurField(uv + flow * 2.0, flameRadius * 1.15, flow, distPx) * 0.88;
    float wideLayer = radialBlurField(uv - flow * 1.2, flameRadius * 1.55, flow, distPx) * 0.64;

    float layerMixA = mix(coreLayer, softLayer, 0.42);
    float layerMixB = mix(softLayer, wideLayer, 0.52);
    float flame = mix(layerMixA, layerMixB, 0.36);

    float outsideFactor = (1.0 - mask * 0.94);
    float itemCore = smoothstep(0.012, 0.62, mask);
    float itemShell = smoothstep(0.08, 1.0, nearMask);
    float insideFactor = itemCore * (0.50 + 0.50 * turbulence) + itemShell * 0.32;
    flame *= mix(outsideFactor, insideFactor, fireOnItem);
    flame *= edgeFade;
    flame *= smoothstep(0.0, 0.82, nearMask);

    vec2 trailSample = uv - flow * 4.4 - motion * 0.0068;
    vec4 prev0 = texture(Sampler2, trailSample);
    vec4 prev1 = texture(Sampler2, trailSample + texel * vec2(2.0, -1.0));
    vec4 prev2 = texture(Sampler2, trailSample + texel * vec2(-1.0, 2.0));

    vec3 historyRgb = max(prev0.rgb, max(prev1.rgb * 0.92, prev2.rgb * 0.88));
    float historyA = max(prev0.a, max(prev1.a * 0.92, prev2.a * 0.88));

    vec3 cold = vec3(baseColor.r * 0.45, min(1.0, baseColor.g * 1.05), 1.0);
    vec3 mid = vec3(baseColor.r * 0.90 + 0.06, baseColor.g * 0.85 + 0.10, min(1.0, baseColor.b * 1.12));
    vec3 hot = vec3(1.0, min(1.0, baseColor.g * 0.72 + 0.30), min(1.0, baseColor.b * 1.08 + 0.06));

    vec3 flameColor = mix(cold, mid, turbulence);
    flameColor = mix(flameColor, hot, smoothstep(0.18, 0.86, coreLayer + tongues * 0.25));

    float alphaBoost = 0.28 + effectAlpha * 1.22;
    float currentAlpha = flame * alphaBoost;
    vec3 currentColor = flameColor * currentAlpha * (0.92 + 0.28 * effectAlpha);

    float decayFactor = mix(0.35, 0.995, clamp(trailDecay, 0.0, 1.0));
    float strengthFactor = mix(0.0, 2.25, clamp(trailStrength / 1.5, 0.0, 1.0));

    float fadedHistoryA = historyA * decayFactor * (0.80 + nearMask * 0.55);
    vec3 fadedHistoryRgb = historyRgb * decayFactor * (0.82 + nearMask * 0.50);

    float mergedAlpha = clamp(currentAlpha + fadedHistoryA * strengthFactor, 0.0, 1.0);
    vec3 mergedColor = max(currentColor, fadedHistoryRgb * strengthFactor);

    float softAlpha = smoothstep(0.0, 1.0, mergedAlpha);
    float alphaMaskOutside = smoothstep(0.0, 0.96, 1.0 - mask);
    float alphaMaskInside = smoothstep(0.01, 0.85, mask) * 0.84 + smoothstep(0.10, 1.0, nearMask) * 0.22;
    float alphaMask = mix(alphaMaskOutside, alphaMaskInside, fireOnItem);
    softAlpha *= alphaMask;
    mergedColor *= softAlpha;

    if (composeMode < 0.5) {
        OutColor = vec4(mergedColor, softAlpha);
        return;
    }

    float glowMix = 0.58 + 0.52 * softLayer + 0.35 * wideLayer;
    vec3 composed = scene.rgb + mergedColor * glowMix;
    OutColor = vec4(clamp(composed, 0.0, 1.0), scene.a);
}
