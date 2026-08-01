#version 150

uniform sampler2D Sampler0;
uniform sampler2D Sampler1;
uniform vec2 texelSize;
uniform vec3 color;
uniform vec3 color2;
uniform float time;
uniform float speed;
uniform float scale;
uniform float outline;
uniform float glow;
uniform float fill;
uniform float alpha;
uniform float outlineOnly;
uniform vec2 CameraDir;
uniform vec3 BlockPos;
uniform vec3 CameraPos;
uniform mat4 InvViewProj;

in vec2 TexCoord;
out vec4 OutColor;

const mat2 m = mat2(0.80, 0.60, -0.60, 0.80);

float sampleMask(vec2 uv) {
    return texture(Sampler0, uv).a;
}

float edgeMetric(vec2 uv, float radius) {
    vec2 stepv = texelSize * max(radius, 0.001);
    float c = sampleMask(uv);
    float axis = 0.0;
    axis += abs(c - sampleMask(uv + vec2(stepv.x, 0.0)));
    axis += abs(c - sampleMask(uv - vec2(stepv.x, 0.0)));
    axis += abs(c - sampleMask(uv + vec2(0.0, stepv.y)));
    axis += abs(c - sampleMask(uv - vec2(0.0, stepv.y)));
    return clamp(axis * 0.35, 0.0, 1.0);
}

float noiseFn(vec2 p) {
    return sin(p.x) * sin(p.y);
}

float fbm4(vec2 p) {
    float f = 0.0;
    f += 0.5000 * noiseFn(p); p = m * p * 2.02;
    f += 0.2500 * noiseFn(p); p = m * p * 2.02;
    f += 0.1250 * noiseFn(p); p = m * p * 2.02;
    f += 0.0625 * noiseFn(p);
    return f / 0.9375;
}

float fbm6(vec2 p) {
    float f = 0.0;
    f += 0.500000 * (0.5 + 0.5 * noiseFn(p)); p = m * p * 2.02;
    f += 0.500000 * (0.5 + 0.5 * noiseFn(p)); p = m * p * 2.02;
    f += 0.500000 * (0.5 + 0.5 * noiseFn(p)); p = m * p * 2.02;
    f += 0.250000 * (0.5 + 0.5 * noiseFn(p));
    return f / 1.750000;
}

vec2 fbm4_2(vec2 p) {
    return vec2(fbm4(p), fbm4(p + vec2(7.8)));
}

vec2 fbm6_2(vec2 p) {
    return vec2(fbm6(p + vec2(16.8)), fbm6(p + vec2(11.5)));
}

float func(vec2 q, out vec4 ron, float t) {
    q += 0.03 * sin(vec2(0.27, 0.23) * t + length(q) * vec2(4.1, 4.3));

    vec2 o = fbm4_2(0.9 * q);
    o += 0.04 * sin(vec2(0.12, 0.14) * t + length(o));

    vec2 n = fbm6_2(3.0 * o);
    ron = vec4(o, n);

    float f = 0.5 + 0.5 * fbm4(1.8 * q + 6.0 * n);
    return mix(f, f * f * f * 3.5, f * abs(n.x));
}

void main() {
    float mask = sampleMask(TexCoord);
    if (mask <= 0.001) discard;

    vec2 resolution = 1.0 / max(texelSize, vec2(0.00001));

    float depth = texture(Sampler1, TexCoord).r;
    vec4 clip = vec4(TexCoord * 2.0 - 1.0, depth * 2.0 - 1.0, 1.0);
    vec4 worldH = InvViewProj * clip;
    vec3 worldPos;
    if (abs(worldH.w) < 1e-6) {
        worldPos = vec3(TexCoord * 100.0, 0.0);
    } else {
        worldPos = (worldH.xyz / worldH.w) + CameraPos;
    }
    vec2 p = vec2(worldPos.x + worldPos.z * 0.5, worldPos.y + worldPos.z * 0.31);
    float t = time * max(speed, 0.001);
    float scaleMul = mix(0.8, 2.2, clamp((scale - 1.0) / 2.0, 0.0, 1.0));

    vec4 ron = vec4(0.0);
    float f = func(p * scaleMul, ron, t);
    f = max(f, 0.0001);

    float outlineEnabled = step(0.001, outline);
    float edge = outlineEnabled * smoothstep(0.02, 0.24, edgeMetric(TexCoord, max(outline, 0.001)));
    float density = clamp(f, 0.0, 1.35);
    float invDensity = clamp(0.125 / f, 0.0, 1.0);
    float mixV = clamp(0.45 + ron.x * 0.35 + ron.z * 0.20, 0.0, 1.0);

    vec3 base = mix(color, color2, mixV);
    vec3 bright = mix(base, vec3(1.0), clamp(invDensity * 0.35 + density * 0.12, 0.0, 0.5));
    vec3 outlineColor = mix(color, color2, 0.5);

    float fillAlphaValue = alpha * fill * clamp(0.18 + density * 0.55 + invDensity * 0.25, 0.0, 1.0);
    float outlineAlpha = alpha * edge * (0.35 + density * 0.25);

    vec3 rgb = bright * fillAlphaValue;
    rgb += outlineColor * outlineAlpha;

    float outAlpha = clamp(fillAlphaValue + outlineAlpha, 0.0, 1.0) * mask;
    if (outAlpha <= 0.001) discard;

    OutColor = vec4(rgb, outAlpha);
}
