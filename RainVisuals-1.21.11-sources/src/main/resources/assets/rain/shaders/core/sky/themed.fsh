#version 330 core

in vec2 ScreenPos;

uniform float uTime;
uniform vec3 uSkyColor;
uniform vec3 uCameraForward;
uniform vec3 uCameraLeft;
uniform vec3 uCameraUp;
uniform vec3 uSunDirection;
uniform float uTanHalfFov;
uniform float uAspect;
uniform float uDayTime;
uniform float uRain;
uniform float uThunder;
uniform vec3 uFogColor;
uniform float uFogStrength;

out vec4 fragColor;

float saturate(float v) {
    return clamp(v, 0.0, 1.0);
}

float hash12(vec2 p) {
    vec3 p3 = fract(vec3(p.xyx) * 0.1031);
    p3 += dot(p3, p3.yzx + 33.33);
    return fract((p3.x + p3.y) * p3.z);
}

float noise(vec2 p) {
    vec2 i = floor(p);
    vec2 f = fract(p);
    vec2 u = f * f * (3.0 - 2.0 * f);
    float a = hash12(i);
    float b = hash12(i + vec2(1.0, 0.0));
    float c = hash12(i + vec2(0.0, 1.0));
    float d = hash12(i + vec2(1.0, 1.0));
    return mix(mix(a, b, u.x), mix(c, d, u.x), u.y);
}

float fbm(vec2 p) {
    float v = 0.0;
    float a = 0.55;
    for (int i = 0; i < 3; i++) {
        v += noise(p) * a;
        p = mat2(1.58, 1.14, -1.14, 1.58) * p + 5.7;
        a *= 0.50;
    }
    return v * 1.10;
}

vec3 skyRay(vec2 uv) {
    vec2 ndc = uv * 2.0 - 1.0;
    return normalize(uCameraForward
        - uCameraLeft * ndc.x * uAspect * uTanHalfFov
        + uCameraUp * ndc.y * uTanHalfFov);
}

float cloudLayer(vec3 dir, float scale, vec2 wind, float contrast, float threshold) {
    vec2 dome = dir.xz / max(dir.y + 0.56, 0.16);
    vec2 p = dome * scale + wind * uTime;
    float base = fbm(p);
    float upper = threshold + contrast;
    float field = base * 0.64;
    if (field >= upper) {
        return 1.0;
    }

    float streak = noise(vec2(p.x * 1.85 + p.y * 0.28, p.y * 0.56 - p.x * 0.10));
    field += streak * 0.30;
    if (field <= threshold - 0.12) {
        return 0.0;
    }
    if (field >= upper) {
        return 1.0;
    }

    float fine = noise(p * 5.4 + vec2(3.4, -7.2));
    field += fine * 0.12;
    return smoothstep(threshold, upper, field);
}

void main() {
    vec3 dir = skyRay(ScreenPos);
    float height = saturate(dir.y * 0.5 + 0.5);

    float dayPhase = uDayTime * 6.2831853;
    vec3 sunDir = uSunDirection;
    vec3 moonDir = -sunDir;
    float daylight = smoothstep(-0.10, 0.24, sunDir.y);
    float night = 1.0 - daylight;
    float storm = saturate(uRain * 0.70 + uThunder * 0.36);

    vec3 accent = max(uSkyColor, vec3(0.025));
    float lum = dot(accent, vec3(0.299, 0.587, 0.114));
    vec3 themed = accent / max(lum, 0.15);
    themed = mix(vec3(0.48, 0.42, 0.58), themed, 0.78);
    themed = mix(vec3(lum), themed, 1.34);

    vec3 zenith = mix(vec3(0.064, 0.058, 0.090), themed * 0.155, 0.70);
    vec3 horizon = mix(vec3(0.420, 0.365, 0.470), themed * 0.465, 0.54);
    vec3 color = mix(horizon, zenith, smoothstep(0.00, 0.88, height));
    color += pow(1.0 - saturate(abs(dir.y) * 1.30), 2.0) * mix(vec3(0.092, 0.076, 0.105), themed * 0.125, 0.66);
    color = mix(color, color + themed * 0.13, daylight * 0.30);

    float moonDot = max(dot(dir, moonDir), 0.0);
    float moonVisibility = smoothstep(-0.05, 0.36, moonDir.y) * mix(0.56, 1.0, night);
    float moonDisc = 0.0;
    float moonHalo = 0.0;
    float moonBloom = 0.0;
    if (moonVisibility > 0.001 && moonDot > 0.0) {
        moonDisc = smoothstep(0.9966, 0.99925, moonDot);
        moonHalo = pow(moonDot, 20.0);
        moonBloom = pow(moonDot, 6.0);
    }
    vec3 moonColor = mix(vec3(0.66, 0.62, 0.72), themed * 0.38 + 0.42, 0.45);

    vec2 wind1 = vec2(-0.020, 0.006);
    vec2 wind2 = vec2(0.014, -0.010);
    vec2 wind3 = vec2(-0.032, 0.016);
    float low = cloudLayer(dir, 1.55, wind1, 0.26, 0.30);
    float mid = cloudLayer(normalize(dir + vec3(0.10, -0.05, -0.03)), 2.70, wind2, 0.22, 0.34);
    float high = cloudLayer(normalize(dir + vec3(-0.08, -0.11, 0.04)), 5.25, wind3, 0.20, 0.38);
    float veil = cloudLayer(normalize(dir + vec3(0.03, -0.18, -0.02)), 8.8, vec2(0.018, 0.020), 0.30, 0.32);
    float cloud = saturate(low * 0.90 + mid * 0.74 + high * 0.50 + veil * 0.34);

    if (cloud > 0.12) {
        float cavities = fbm((dir.xz / max(dir.y + 0.52, 0.18)) * 3.2 + vec2(uTime * 0.010, -uTime * 0.008));
        float depth = smoothstep(0.12, 0.86, cloud) * mix(0.72, 1.12, cavities);
        vec3 cloudDark = mix(vec3(0.132, 0.112, 0.165), themed * 0.165, 0.58);
        vec3 cloudMid = mix(vec3(0.330, 0.280, 0.390), themed * 0.340, 0.58);
        vec3 cloudLit = mix(vec3(0.680, 0.580, 0.735), themed * 0.660, 0.54);
        vec3 cloudColor = mix(cloudDark, cloudMid, smoothstep(0.22, 0.72, cavities + moonHalo * 0.45));
        cloudColor = mix(cloudColor, cloudLit, smoothstep(0.52, 0.98, moonHalo + high * 0.25 + daylight * 0.22));
        cloudColor = mix(cloudColor, vec3(0.120, 0.116, 0.130), storm * 0.62);
        color = mix(color, cloudColor, depth * 0.94);
    }
    color += cloud * moonHalo * moonColor * moonVisibility * 0.46;
    color += cloud * moonBloom * themed * moonVisibility * 0.090;

    color += moonColor * moonDisc * moonVisibility * (1.05 - storm * 0.38);
    color += moonColor * moonHalo * moonVisibility * 0.42;
    color += themed * moonBloom * moonVisibility * 0.070;

    float sunDot = max(dot(dir, sunDir), 0.0);
    if (daylight * (1.0 - storm) > 0.001 && sunDot > 0.0) {
        color += mix(vec3(0.82, 0.62, 0.46), themed * 0.50 + vec3(0.45, 0.34, 0.28), 0.35) * pow(sunDot, 16.0) * daylight * (1.0 - storm) * 0.18;
    }
    color = mix(color, vec3(0.056, 0.050, 0.068), storm * 0.44);
    color = vec3(1.0) - exp(-color * 1.58);
    color = pow(color, vec3(0.88));
    color = mix(vec3(dot(color, vec3(0.299, 0.587, 0.114))), color, 1.18);
    if (uFogStrength > 0.001) {
        float fogMask = saturate(uFogStrength) * clamp(
                pow(1.0 - saturate(abs(dir.y) * 1.18), 1.55) * 0.88
                + (1.0 - smoothstep(0.20, 0.92, dir.y)) * 0.34,
                0.0, 0.92
        );
        color = mix(color, uFogColor, fogMask);
    }

    fragColor = vec4(color, 1.0);
}
