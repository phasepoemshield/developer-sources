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
    float a = 0.52;
    for (int i = 0; i < 3; i++) {
        v += noise(p) * a;
        p = mat2(1.68, 1.12, -1.12, 1.68) * p + 5.4;
        a *= 0.50;
    }
    return v * 1.0714;
}

vec3 skyRay(vec2 uv) {
    vec2 ndc = uv * 2.0 - 1.0;
    return normalize(uCameraForward
        - uCameraLeft * ndc.x * uAspect * uTanHalfFov
        + uCameraUp * ndc.y * uTanHalfFov);
}

float starLayer(vec3 dir, float scale, float threshold, float size) {
    vec2 dome = dir.xz / max(dir.y + 1.16, 0.30);
    vec2 grid = dome * scale;
    vec2 cell = floor(grid);
    vec2 local = fract(grid);
    float h = hash12(cell);
    if (h < threshold) {
        return 0.0;
    }

    vec2 pos = vec2(hash12(cell + 11.0), hash12(cell + 37.0));
    float star = smoothstep(size, 0.0, length(local - pos));
    return star * (0.82 + 0.18 * sin(uTime * 1.15 + h * 22.0));
}

float milkyWay(vec3 dir, float dayPhase) {
    float visibility = smoothstep(-0.06, 0.58, dir.y);
    if (visibility <= 0.0) {
        return 0.0;
    }

    vec3 axis = normalize(vec3(sin(dayPhase * 0.24 + 0.6), 0.34, cos(dayPhase * 0.24 + 0.6)));
    float band = exp(-pow(abs(dot(dir, axis)) / 0.16, 2.0));
    vec2 p = dir.xz * 4.6 + vec2(dayPhase * 0.18, -dayPhase * 0.11);
    float dust = fbm(p + dir.y * 2.7);
    float gaps = 1.0 - abs(noise(p * 1.7 + vec2(8.0, 2.0)) * 2.0 - 1.0);
    return band * smoothstep(0.44, 0.86, dust + gaps * 0.22) * visibility;
}

float cloudVeil(vec3 dir) {
    float altitude = smoothstep(-0.30, 0.42, dir.y) * (1.0 - smoothstep(0.72, 0.94, dir.y));
    if (altitude <= 0.0) {
        return 0.0;
    }

    vec2 dome = dir.xz / max(dir.y + 0.78, 0.24);
    float low = fbm(dome * 3.0 + vec2(-0.018, 0.010) * uTime);
    float field = low;
    if (low > 0.42 && low < 0.84) {
        field += noise(dome * 8.0 + vec2(3.0, -6.0)) * 0.12;
    }
    float veil = smoothstep(0.54, 0.84, field);
    return veil * altitude;
}

void main() {
    vec3 dir = skyRay(ScreenPos);
    float height = saturate(dir.y * 0.5 + 0.5);
    float horizon = pow(1.0 - saturate(abs(dir.y) * 1.42), 2.3);

    float dayPhase = uDayTime * 6.2831853;
    vec3 sunDir = uSunDirection;
    vec3 moonDir = -sunDir;
    float daylight = smoothstep(-0.10, 0.25, sunDir.y);
    float night = 1.0 - daylight;
    float storm = saturate(uRain * 0.72 + uThunder * 0.36);
    float clear = 1.0 - storm;

    vec3 dayTop = mix(vec3(0.040, 0.145, 0.335), uSkyColor, 0.14);
    vec3 dayLow = vec3(0.55, 0.72, 0.95);
    vec3 nightTop = vec3(0.006, 0.010, 0.033);
    vec3 nightLow = vec3(0.030, 0.040, 0.078);
    vec3 color = mix(mix(nightLow, dayLow, daylight), mix(nightTop, dayTop, daylight), smoothstep(0.04, 0.85, height));
    color += horizon * mix(vec3(0.035, 0.045, 0.075), vec3(0.42, 0.50, 0.62), daylight) * 0.15;

    float moonVisibility = smoothstep(0.02, 0.38, moonDir.y) * night * clear;
    float moonDot = max(dot(dir, moonDir), 0.0);
    float moonCloudGlow = 0.0;
    if (moonVisibility > 0.001 && moonDot > 0.0) {
        moonCloudGlow = pow(moonDot, 10.0);
        color += vec3(0.88, 0.92, 1.0) * smoothstep(0.99955, 0.99982, moonDot) * moonVisibility * 1.90;
        color += vec3(0.28, 0.36, 0.70) * pow(moonDot, 18.0) * moonVisibility * 0.46;
    }

    if (night * clear > 0.02) {
        float galaxy = milkyWay(dir, dayPhase);
        color += galaxy * vec3(0.16, 0.20, 0.42) * night * clear * 0.62;
        color += galaxy * vec3(0.06, 0.10, 0.18) * noise(dir.xz * 7.0) * night * clear * 0.45;

        float stars = starLayer(dir, 126.0, 0.987, 0.042) + starLayer(dir, 245.0, 0.995, 0.030) * 1.20;
        color += stars * vec3(0.78, 0.86, 1.0) * night * clear * smoothstep(0.0, 0.55, dir.y);
    }

    float veil = cloudVeil(dir);
    vec3 veilTint = mix(vec3(0.070, 0.080, 0.120), vec3(0.17, 0.19, 0.24), uRain);
    color = mix(color, veilTint, veil * mix(0.30, 0.56, storm));
    color += veil * moonCloudGlow * vec3(0.16, 0.20, 0.38) * moonVisibility * 0.18;

    float sunDot = max(dot(dir, sunDir), 0.0);
    if (daylight * clear > 0.001 && sunDot > 0.0) {
        color += vec3(1.0, 0.68, 0.32) * pow(sunDot, 24.0) * daylight * clear * 0.34;
    }
    color = mix(color, vec3(0.026, 0.028, 0.036), storm * 0.70);
    color = vec3(1.0) - exp(-color * mix(1.12, 1.24, night));
    color = pow(color, vec3(0.91));
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
