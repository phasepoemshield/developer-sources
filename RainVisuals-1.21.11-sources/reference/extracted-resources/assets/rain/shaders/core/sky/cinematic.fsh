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
        p = mat2(1.72, 1.08, -1.08, 1.72) * p + 4.3;
        a *= 0.48;
    }
    return v * 1.065;
}

vec3 skyRay(vec2 uv) {
    vec2 ndc = uv * 2.0 - 1.0;
    return normalize(uCameraForward
        - uCameraLeft * ndc.x * uAspect * uTanHalfFov
        + uCameraUp * ndc.y * uTanHalfFov);
}

float cloudField(vec3 dir, float scale, vec2 wind, float low, float high) {
    float altitude = smoothstep(low, low + 0.18, dir.y) * (1.0 - smoothstep(high, high + 0.18, dir.y));
    if (altitude <= 0.0) {
        return 0.0;
    }

    vec2 dome = dir.xz / max(dir.y + 0.72, 0.22);
    vec2 p = dome * scale + wind * uTime;
    float base = fbm(p);
    float field = base;
    if (base > 0.30 && base < 0.74) {
        field += noise(p * 3.4 + vec2(6.2, -2.8)) * 0.16;
    }
    float shape = smoothstep(0.46, 0.74, field);
    return shape * altitude;
}

void main() {
    vec3 dir = skyRay(ScreenPos);
    float height = saturate(dir.y * 0.5 + 0.5);
    float horizon = pow(1.0 - saturate(abs(dir.y) * 1.35), 2.0);

    float dayPhase = uDayTime * 6.2831853;
    vec3 sunDir = uSunDirection;
    float daylight = smoothstep(-0.12, 0.24, sunDir.y);
    float sunset = exp(-abs(sunDir.y) * 7.0) * smoothstep(-0.26, 0.18, sunDir.y);
    float storm = saturate(uRain * 0.70 + uThunder * 0.36);

    vec3 zenithDay = mix(vec3(0.040, 0.150, 0.360), uSkyColor, 0.16);
    vec3 horizonDay = vec3(0.58, 0.76, 0.98);
    vec3 zenithNight = vec3(0.010, 0.016, 0.040);
    vec3 horizonNight = vec3(0.050, 0.060, 0.095);
    vec3 zenith = mix(zenithNight, zenithDay, daylight);
    vec3 low = mix(horizonNight, horizonDay, daylight);
    low = mix(low, vec3(1.00, 0.47, 0.24), sunset * 0.65);

    vec3 stormZenith = mix(vec3(0.050, 0.055, 0.064), vec3(0.026, 0.028, 0.034), uThunder);
    vec3 stormLow = mix(vec3(0.160, 0.168, 0.176), vec3(0.095, 0.100, 0.110), uThunder);
    zenith = mix(zenith, stormZenith, storm);
    low = mix(low, stormLow, storm);

    vec3 color = mix(low, zenith, smoothstep(0.04, 0.88, height));
    color += horizon * mix(vec3(0.08, 0.10, 0.14), vec3(0.50, 0.58, 0.66), daylight) * 0.18 * (1.0 - storm * 0.55);

    float sunDot = max(dot(dir, sunDir), 0.0);
    float clear = 1.0 - storm;
    float sunCloudGlow = 0.0;
    float sunCloudHighlight = 0.0;
    if (daylight * clear > 0.001 && sunDot > 0.0) {
        sunCloudGlow = pow(sunDot, 8.0);
        sunCloudHighlight = pow(sunDot, 14.0);
        color += vec3(1.0, 0.78, 0.48) * pow(sunDot, 1300.0) * daylight * clear * 5.8;
        color += vec3(1.0, 0.58, 0.26) * pow(sunDot, 22.0) * daylight * clear * 0.78;
        color += vec3(0.85, 0.42, 0.20) * pow(sunDot, 4.2) * daylight * clear * 0.20;
    }

    float cloudLow = cloudField(dir, 3.2, vec2(0.018, -0.009), -0.32, 0.50);
    float cloudHigh = cloudField(normalize(dir + vec3(0.08, -0.02, -0.05)), 6.3, vec2(-0.026, 0.012), -0.16, 0.66);
    float stormDeck = 0.0;
    if (storm > 0.001) {
        stormDeck = cloudField(normalize(dir + vec3(0.0, -0.10, 0.0)), 2.2, vec2(-0.034, 0.014), -0.44, 0.78);
    }
    float cloud = saturate(cloudLow * 0.72 + cloudHigh * 0.48 + stormDeck * storm * 0.86);

    vec3 cloudDay = mix(vec3(0.70, 0.76, 0.84), vec3(1.0, 0.76, 0.54), sunset + sunCloudGlow * 0.25);
    vec3 cloudNight = vec3(0.075, 0.085, 0.120);
    vec3 cloudStorm = mix(vec3(0.135, 0.140, 0.148), vec3(0.080, 0.084, 0.092), uThunder);
    vec3 cloudTint = mix(cloudNight, cloudDay, daylight);
    cloudTint = mix(cloudTint, cloudStorm, storm);
    color = mix(color, cloudTint, cloud * mix(0.36, 0.54, daylight));
    color += cloud * sunCloudHighlight * vec3(0.88, 0.46, 0.22) * daylight * clear * 0.28;

    if (uThunder > 0.001) {
        float lightning = pow(saturate(sin(uTime * 1.45 + fbm(dir.xz * 2.0) * 5.0)), 92.0) * uThunder * 0.20;
        color += vec3(0.18, 0.22, 0.30) * lightning * smoothstep(-0.18, 0.52, dir.y);
    }

    color = vec3(1.0) - exp(-color * mix(1.08, 1.20, daylight));
    color = pow(color, vec3(0.92));
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
