#version 150

in vec2 texCoord;
in vec4 vertexColor;

uniform float Time;
uniform float Speed;
uniform vec4 AccentColor;
uniform float Alpha;

out vec4 fragColor;

float hash12(vec2 p) {
    vec3 p3 = fract(vec3(p.xyx) * 0.1031);
    p3 += dot(p3, p3.yzx + 33.33);
    return fract((p3.x + p3.y) * p3.z);
}

float noise(vec2 p) {
    vec2 i = floor(p);
    vec2 f = fract(p);
    float a = hash12(i);
    float b = hash12(i + vec2(1.0, 0.0));
    float c = hash12(i + vec2(0.0, 1.0));
    float d = hash12(i + vec2(1.0, 1.0));
    vec2 u = f * f * (3.0 - 2.0 * f);
    return mix(mix(a, b, u.x), mix(c, d, u.x), u.y);
}

float fbm(vec2 p) {
    float v = 0.0;
    float a = 0.5;
    for (int i = 0; i < 5; i++) {
        v += a * noise(p);
        p = p * 2.03 + vec2(17.4, 9.2);
        a *= 0.52;
    }
    return v;
}

float starLayer(vec2 uv, float scale, float threshold, float t) {
    vec2 grid = uv * scale;
    vec2 cell = floor(grid);
    vec2 local = fract(grid) - 0.5;
    float rnd = hash12(cell);
    float appear = step(threshold, rnd);
    float radius = mix(0.018, 0.045, pow(rnd, 5.0));
    float twinkle = 0.55 + 0.45 * sin(t * (1.3 + rnd * 2.2) + rnd * 20.0);
    return appear * smoothstep(radius, 0.0, length(local)) * twinkle;
}

void main() {
    float t = Time * Speed;
    vec2 uv = texCoord;
    vec2 p = (uv - 0.5) * vec2(2.25, 1.55);

    float n1 = fbm(p * 1.35 + vec2(t * 0.055, -t * 0.035));
    float n2 = fbm(p.yx * 1.65 + vec2(-t * 0.04, t * 0.065));
    float river = sin((p.x * 1.7 + p.y * 2.25) + t * 0.55 + n2 * 2.4);
    float mask = smoothstep(0.26, 0.92, n1 * 0.72 + n2 * 0.34 + river * 0.08);

    vec3 accent = max(AccentColor.rgb, vec3(0.28, 0.35, 0.85));
    vec3 base = vec3(0.010, 0.014, 0.030);
    vec3 cold = vec3(0.030, 0.060, 0.145);
    vec3 nebula = mix(cold, accent, 0.62);

    float vignette = smoothstep(1.12, 0.18, length(p));
    vec3 color = mix(base, nebula, mask * 0.85);
    color += accent * (0.10 + 0.18 * max(river, 0.0)) * mask;
    color += vec3(0.03, 0.06, 0.12) * vignette;

    // Stars: wrap UV offsets with fract so grid cells shift smoothly forever
    float starsA = starLayer(fract(uv + vec2(fract(t * 0.010), fract(-t * 0.006))), 46.0, 0.955, t);
    float starsB = starLayer(fract(uv - vec2(fract(t * 0.006), fract(t * 0.011))), 78.0, 0.982, t * 0.8);
    color += vec3(0.82, 0.90, 1.0) * starsA;
    color += vec3(0.45, 0.62, 1.0) * starsB;

    color *= 0.74 + 0.26 * vignette;
    color *= vertexColor.rgb;

    fragColor = vec4(color, Alpha);
}
