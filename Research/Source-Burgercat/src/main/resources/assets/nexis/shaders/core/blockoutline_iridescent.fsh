#version 150

in vec2 texCoord;
in vec4 vertexColor;

uniform float Time;
uniform float Speed;
uniform vec4 AccentColor;

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
    float value = 0.0;
    float amp = 0.5;
    for (int i = 0; i < 5; i++) {
        value += amp * noise(p);
        p = p * 2.02 + vec2(19.1, 7.3);
        amp *= 0.52;
    }
    return value;
}

float stars(vec2 uv, float scale, float threshold, float t) {
    vec2 grid = uv * scale;
    vec2 cell = floor(grid);
    vec2 fracPart = fract(grid) - 0.5;

    float rnd = hash12(cell);
    float spawn = step(threshold, rnd);
    float size = mix(0.016, 0.045, pow(rnd, 5.0));
    float d = length(fracPart);
    float twinkle = 0.55 + 0.45 * sin(t * (1.6 + rnd * 1.9) + rnd * 25.0);
    return spawn * smoothstep(size, 0.0, d) * twinkle;
}

void main() {
    float t = Time * Speed;
    vec2 uv = texCoord;
    vec2 p = uv * 2.0;

    float n1 = fbm(p * vec2(1.15, 0.95) + vec2(t * 0.08, -t * 0.05));
    float n2 = fbm(p.yx * 1.6 + vec2(-t * 0.06, t * 0.09));
    float ribbon = sin((p.x + p.y) * 2.6 + t * 0.7 + n2 * 2.0);
    float nebulaMask = smoothstep(0.30, 0.93, n1 * 0.7 + n2 * 0.3);

    vec3 deepSpace = vec3(0.012, 0.019, 0.060);
    vec3 accent = AccentColor.rgb;
    vec3 nebulaBase = mix(vec3(0.07, 0.10, 0.28), accent, 0.72);
    vec3 nebula = mix(deepSpace, nebulaBase, nebulaMask);
    nebula += accent * (0.10 + 0.18 * ribbon) * nebulaMask;

    // Stars: wrap UV offsets with fract so grid cells shift smoothly forever
    float starsNear = stars(fract(uv + vec2(fract(t * 0.02), 0.0)), 34.0, 0.94, t);
    float starsFar  = stars(fract(uv * 0.8 - vec2(0.0, fract(t * 0.01))), 60.0, 0.975, t * 0.7);
    vec3 starColor = vec3(0.95, 0.97, 1.0) * starsNear + vec3(0.7, 0.8, 1.0) * starsFar;

    vec3 tint = mix(vec3(1.0), vertexColor.rgb, 0.35);
    vec3 finalColor = nebula * tint + starColor * (0.7 + 0.3 * AccentColor.b);

    float aura = 0.7 + 0.3 * smoothstep(0.2, 0.95, n2);
    float alpha = vertexColor.a * (0.68 + 0.32 * nebulaMask) * aura;
    fragColor = vec4(finalColor, alpha);
}
