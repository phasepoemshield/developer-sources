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

float saturate(float value) {
    return clamp(value, 0.0, 1.0);
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
    float value = 0.0;
    float amplitude = 0.5;

    for (int i = 0; i < 3; i++) {
        value += noise(p) * amplitude;
        p *= 2.04;
        amplitude *= 0.5;
    }

    return value;
}

vec3 skyRay(vec2 uv) {
    vec2 ndc = uv * 2.0 - 1.0;
    return normalize(
        uCameraForward
        - uCameraLeft * ndc.x * uAspect * uTanHalfFov
        + uCameraUp * ndc.y * uTanHalfFov
    );
}

float starField(vec3 dir) {
    float visibility = smoothstep(0.02, 0.58, dir.y);
    if (visibility <= 0.0) {
        return 0.0;
    }

    vec2 dome = dir.xz / max(dir.y + 1.25, 0.35);
    vec2 grid = dome * 120.0;
    vec2 cell = floor(grid);
    vec2 local = fract(grid);
    float h = hash12(cell);
    if (h < 0.985) {
        return 0.0;
    }

    vec2 starPos = vec2(hash12(cell + 17.0), hash12(cell + 43.0));
    float dist = length(local - starPos);
    float size = mix(0.020, 0.055, hash12(cell + 91.0));
    float star = smoothstep(size, 0.0, dist);
    float bright = smoothstep(size * 1.45, 0.0, dist) * step(0.997, h) * 1.6;
    float twinkle = 0.78 + 0.22 * sin(uTime * 1.4 + h * 18.0);
    return (star + bright) * twinkle * visibility;
}

float galaxyBand(vec3 dir, float dayPhase) {
    float visibility = smoothstep(-0.10, 0.55, dir.y);
    if (visibility <= 0.0) {
        return 0.0;
    }

    vec3 axis = normalize(vec3(sin(dayPhase * 0.31), 0.38, cos(dayPhase * 0.31)));
    float band = exp(-pow(abs(dot(dir, axis)) / 0.18, 2.0));
    vec2 p = dir.xz * 4.0 + vec2(dayPhase * 0.35, -dayPhase * 0.17);
    float dust = fbm(p + dir.y * 3.0);
    float gaps = 1.0 - abs(noise(p * 1.8 + vec2(4.0, 9.0)) * 2.0 - 1.0);
    return band * smoothstep(0.34, 0.78, dust + gaps * 0.20) * visibility;
}

float cloudLayer(vec3 dir, float scale, vec2 wind, float low, float high) {
    float band = smoothstep(low, low + 0.18, dir.y) * (1.0 - smoothstep(high, high + 0.18, dir.y));
    if (band <= 0.0) {
        return 0.0;
    }

    vec2 dome = dir.xz / max(dir.y + 0.82, 0.28);
    vec2 p = dome * scale + wind * uTime;
    float base = fbm(p);
    float field = base;
    if (base > 0.28 && base < 0.76) {
        field += noise(p * 2.35 + vec2(7.1, -3.6)) * 0.16;
    }
    float body = smoothstep(0.44, 0.76, field);
    return body * band;
}

void main() {
    vec2 uv = ScreenPos;
    vec3 dir = skyRay(uv);
    float skyHeight = saturate(dir.y * 0.5 + 0.5);
    float horizon = pow(1.0 - saturate(abs(dir.y) * 1.42), 2.4);

    float dayPhase = uDayTime * 6.2831853;
    vec3 sunDir = uSunDirection;
    vec3 moonDir = -sunDir;
    float daylight = smoothstep(-0.10, 0.22, sunDir.y);
    float night = 1.0 - daylight;
    float sunset = exp(-abs(sunDir.y) * 8.0) * smoothstep(-0.25, 0.22, sunDir.y);

    vec3 nightZenith = vec3(0.010, 0.018, 0.052);
    vec3 dayZenith = mix(vec3(0.045, 0.145, 0.34), uSkyColor, 0.18);
    vec3 dayHorizon = vec3(0.56, 0.72, 0.96);
    vec3 sunsetHorizon = vec3(1.0, 0.46, 0.22);
    vec3 nightHorizon = vec3(0.055, 0.070, 0.130);

    vec3 zenith = mix(nightZenith, dayZenith, daylight);
    vec3 lowSky = mix(nightHorizon, dayHorizon, daylight);
    lowSky = mix(lowSky, sunsetHorizon, sunset * 0.72);

    float storm = saturate(uRain * 0.68 + uThunder * 0.28);
    vec3 stormZenith = mix(vec3(0.055, 0.062, 0.078), vec3(0.030, 0.033, 0.040), uThunder);
    vec3 stormHorizon = mix(vec3(0.165, 0.175, 0.185), vec3(0.105, 0.110, 0.122), uThunder);
    zenith = mix(zenith, stormZenith, storm);
    lowSky = mix(lowSky, stormHorizon, storm);

    vec3 color = mix(lowSky, zenith, smoothstep(0.04, 0.82, skyHeight));
    color += horizon * mix(vec3(0.06, 0.08, 0.14), vec3(0.42, 0.50, 0.62), daylight) * 0.16;

    float sunDot = max(dot(dir, sunDir), 0.0);
    float clearSky = 1.0 - storm;
    float sunGlow = 0.0;
    float wideGlow = 0.0;
    if (daylight * clearSky > 0.001 && sunDot > 0.0) {
        float sunCore = pow(sunDot, 1400.0);
        sunGlow = pow(sunDot, 25.0);
        wideGlow = pow(sunDot, 4.6);
        color += vec3(1.0, 0.78, 0.48) * sunCore * daylight * clearSky * 6.0;
        color += vec3(1.0, 0.56, 0.26) * sunGlow * daylight * clearSky * 0.85;
        color += vec3(0.95, 0.48, 0.22) * wideGlow * daylight * clearSky * 0.20;
    }

    float moonVisibility = smoothstep(0.02, 0.38, moonDir.y) * night * clearSky;
    float moonDot = max(dot(dir, moonDir), 0.0);
    float moonGlow = 0.0;
    if (moonVisibility > 0.001 && moonDot > 0.0) {
        float moonDisc = smoothstep(0.99962, 0.99986, moonDot);
        float moonInner = pow(moonDot, 520.0);
        moonGlow = pow(moonDot, 18.0);
        color += vec3(0.86, 0.91, 1.0) * moonDisc * moonVisibility * 2.2;
        color += vec3(0.48, 0.58, 0.88) * moonInner * moonVisibility * 0.85;
        color += vec3(0.20, 0.28, 0.55) * moonGlow * moonVisibility * 0.52;
    }

    float cloudA = cloudLayer(dir, 4.0, vec2(0.024, -0.010) * mix(1.0, 1.75, storm), -0.24, 0.62);
    float cloudB = cloudLayer(normalize(dir + vec3(0.10, -0.02, -0.08)), 7.2, vec2(-0.032, 0.014) * mix(1.0, 1.75, storm), -0.18, 0.58);
    float stormCloud = 0.0;
    if (storm > 0.001) {
        stormCloud = cloudLayer(normalize(dir + vec3(0.0, -0.08, 0.0)), 3.0, vec2(-0.042, 0.017), -0.42, 0.78);
    }
    float cloud = saturate(cloudA * 0.68 + cloudB * 0.52 + stormCloud * storm * 0.50);
    vec3 cloudDay = mix(vec3(0.66, 0.73, 0.84), vec3(1.0, 0.78, 0.58), sunset * 0.85 + wideGlow * 0.35);
    vec3 cloudNight = mix(vec3(0.10, 0.115, 0.18), vec3(0.22, 0.26, 0.42), moonGlow * moonVisibility);
    vec3 cloudTint = mix(cloudNight, cloudDay, daylight);
    cloudTint = mix(cloudTint, mix(vec3(0.16, 0.17, 0.18), vec3(0.105, 0.110, 0.122), uThunder), storm);
    color = mix(color, cloudTint, cloud * mix(0.32, 0.48, daylight));
    color += cloud * sunGlow * vec3(0.90, 0.46, 0.20) * daylight * 0.25;
    color += cloud * moonGlow * vec3(0.23, 0.30, 0.58) * moonVisibility * 0.18;

    if (night * clearSky > 0.02) {
        float galaxy = galaxyBand(dir, dayPhase);
        color += galaxy * vec3(0.18, 0.22, 0.46) * night * clearSky * 0.58;
        color += starField(dir) * vec3(0.78, 0.86, 1.0) * night * clearSky;
    }

    if (uThunder > 0.001) {
        float lightningSeed = sin(uTime * 1.7 + noise(dir.xz * 2.0) * 4.0);
        float lightning = pow(saturate(lightningSeed), 80.0) * uThunder * 0.18;
        color += vec3(0.18, 0.22, 0.30) * lightning * smoothstep(-0.15, 0.55, dir.y);
    }

    float exposure = mix(1.08, 1.20, daylight);
    color = vec3(1.0) - exp(-color * exposure);
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
