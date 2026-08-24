#version 150

uniform sampler2D ColorTexture;
uniform vec2 resolution;
uniform float time;
uniform int effectMode;
uniform float effectAlpha;
uniform vec4 outlineColor;
uniform vec4 firstFillColor;
uniform vec4 secondFillColor;

out vec4 fragColor;

float hash(vec2 p) {
    return fract(sin(dot(p, vec2(127.1, 311.7))) * 43758.5453);
}

float noise(vec2 p) {
    vec2 i = floor(p);
    vec2 f = fract(p);
    vec2 u = f * f * (3.0 - 2.0 * f);
    return mix(mix(hash(i), hash(i + vec2(1.0, 0.0)), u.x),
               mix(hash(i + vec2(0.0, 1.0)), hash(i + vec2(1.0, 1.0)), u.x), u.y);
}

vec3 hue(float h) {
    return clamp(abs(mod(h * 6.0 + vec3(0.0, 4.0, 2.0), 6.0) - 3.0) - 1.0, 0.0, 1.0);
}

void main() {
    vec2 uv = gl_FragCoord.xy / max(resolution, vec2(1.0));
    vec2 px = 1.0 / max(resolution, vec2(1.0));

    float m = texture(ColorTexture, uv).r;

    float ml = texture(ColorTexture, uv + vec2(-px.x, 0.0)).r;
    float mr = texture(ColorTexture, uv + vec2(px.x, 0.0)).r;
    float md = texture(ColorTexture, uv + vec2(0.0, -px.y)).r;
    float mu = texture(ColorTexture, uv + vec2(0.0, px.y)).r;
    float edge = clamp(max(max(abs(m - ml), abs(m - mr)), max(abs(m - md), abs(m - mu))) * 1.5, 0.0, 1.0);

    float glow = 0.0;
    glow += texture(ColorTexture, uv + vec2(px.x * 2.0, 0.0)).r * 0.6;
    glow += texture(ColorTexture, uv + vec2(-px.x * 2.0, 0.0)).r * 0.6;
    glow += texture(ColorTexture, uv + vec2(0.0, px.y * 2.0)).r * 0.6;
    glow += texture(ColorTexture, uv + vec2(0.0, -px.y * 2.0)).r * 0.6;
    glow += texture(ColorTexture, uv + vec2(px.x * 4.0, 0.0)).r * 0.25;
    glow += texture(ColorTexture, uv + vec2(-px.x * 4.0, 0.0)).r * 0.25;
    glow += texture(ColorTexture, uv + vec2(0.0, px.y * 4.0)).r * 0.25;
    glow += texture(ColorTexture, uv + vec2(0.0, -px.y * 4.0)).r * 0.25;

    vec3 fill = firstFillColor.rgb;
    float fillA = firstFillColor.a;
    float pulse = 1.0;

    if (effectMode == 0) {
        float n = noise(vec2(uv.x * 6.0, uv.y * 3.0 - time * 1.7));
        float grad = fract(uv.y * 1.3 - time * 0.55 + n * 0.4);
        fill = mix(firstFillColor.rgb, secondFillColor.rgb, grad) * (0.8 + 0.45 * n);
        pulse = 0.9 + 0.15 * sin(time * 9.0 + uv.x * 12.0);
    } else if (effectMode == 1) {
        float w = 0.5 + 0.5 * sin(uv.x * 13.0 - time * 2.1 + sin(uv.y * 8.0 + time) * 0.9);
        fill = mix(firstFillColor.rgb, secondFillColor.rgb, w);
        pulse = 0.92 + 0.08 * sin(time * 4.0);
    } else if (effectMode == 2) {
        fill = hue(fract(uv.y * 0.65 - time * 0.12));
    } else if (effectMode == 3) {
        float scan = 0.78 + 0.22 * sin(uv.y * resolution.y * 1.35 - time * 7.0);
        fill = mix(firstFillColor.rgb, secondFillColor.rgb, 0.5 + 0.5 * sin(time * 0.9));
        fill *= scan;
        pulse = 0.94 + 0.06 * sin(time * 21.0);
    } else if (effectMode == 4) {
        float b1 = noise(vec2(uv.x * 3.0 + time * 0.25, uv.y * 1.6));
        float b2 = noise(vec2(uv.x * 5.0 - time * 0.18, uv.y * 2.6 + 7.3));
        fill = mix(secondFillColor.rgb, firstFillColor.rgb, clamp(b1 * 0.65 + b2 * 0.5, 0.0, 1.0));
        fill *= 0.85 + 0.3 * sin(uv.y * 9.0 + time * 1.4 + b1 * 4.0);
    } else {
        float p = sin(uv.x * 8.0 + time)
                + sin(uv.y * 9.0 + time * 1.3)
                + sin((uv.x + uv.y) * 7.0 + time * 0.7)
                + noise(uv * 5.0 + time * 0.35) * 2.0;
        fill = mix(firstFillColor.rgb, secondFillColor.rgb, clamp(0.5 + 0.25 * p, 0.0, 1.0));
        fill *= 0.85 + 0.3 * sin(time * 2.0 + p);
    }

    fill *= pulse;

    vec3 col = fill;
    float a = fillA * m;

    col = mix(col, outlineColor.rgb, edge);
    a = max(a, edge * outlineColor.a);

    float glowA = clamp(glow, 0.0, 1.0) * outlineColor.a * 0.55;
    col += outlineColor.rgb * clamp(glow, 0.0, 1.0) * 0.35;

    a = max(a, glowA);
    a *= effectAlpha;

    fragColor = vec4(col, clamp(a, 0.0, 1.0));
}
