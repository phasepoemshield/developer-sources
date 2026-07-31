#version 150
layout(std140) uniform u_resolution {
    vec2 resolution;
};
layout(std140) uniform u_radius {
    float radius;
};
layout(std140) uniform u_glowColor {
    vec3 glowColor;
};
layout(std140) uniform u_intensity {
    float intensity;
};
layout(std140) uniform u_flame {
    vec4 flame;
};
uniform sampler2D u_texture;
uniform sampler2D u_original;
out vec4 fragColor;

float hash(vec2 p) {
    p = fract(p * vec2(123.34, 456.21));
    p += dot(p, p + 45.32);
    return fract(p.x * p.y);
}

float noise(vec2 p) {
    vec2 i = floor(p);
    vec2 f = fract(p);
    f = f * f * (3.0 - 2.0 * f);
    float a = hash(i);
    float b = hash(i + vec2(1.0, 0.0));
    float c = hash(i + vec2(0.0, 1.0));
    float d = hash(i + vec2(1.0, 1.0));
    return mix(mix(a, b, f.x), mix(c, d, f.x), f.y);
}

vec3 hue(float h) {
    vec3 rgb = clamp(abs(mod(h * 6.0 + vec3(0.0, 4.0, 2.0), 6.0) - 3.0) - 1.0, 0.0, 1.0);
    return rgb * rgb * (3.0 - 2.0 * rgb);
}

void main() {
    vec2 uv = gl_FragCoord.xy / resolution;
    float time = flame.x * max(flame.z, 0.05);
    float power = max(flame.y, 0.0);
    float sway = sin(time * 1.35 + uv.y * 10.0) * 0.55 + sin(time * 0.75 - uv.y * 6.0) * 0.45;
    float n1 = noise(uv * vec2(5.0, 2.8) + vec2(time * 0.38, -time * 0.82));
    float n2 = noise(uv * vec2(9.0, 5.0) + vec2(-time * 0.55, time * 0.42));
    float lick = (n1 * 0.7 + n2 * 0.3 - 0.5) * power;

    vec2 stepUv = vec2(0.0, max(radius, 1.0) * (1.0 + power * 0.35)) / resolution;
    vec2 sideUv = vec2(sway * power * radius * 0.18, 0.0) / resolution;
    vec4 blurred = texture(u_texture, uv) * 0.15000000;
    blurred += texture(u_texture, uv + sideUv + stepUv * (1.4 + lick * 0.25)) * 0.23000000;
    blurred += texture(u_texture, uv - sideUv * 0.45 - stepUv * 1.4) * 0.23000000;
    blurred += texture(u_texture, uv + sideUv * 1.35 + stepUv * (3.2 + lick * 0.35)) * 0.13500000;
    blurred += texture(u_texture, uv - sideUv * 0.70 - stepUv * 3.2) * 0.13500000;
    blurred += texture(u_texture, uv + sideUv * 1.95 + stepUv * (5.4 + lick * 0.45)) * 0.06000000;
    blurred += texture(u_texture, uv - sideUv * 0.90 - stepUv * 5.4) * 0.06000000;
    float origA = texture(u_original, uv).a;
    float glowAlpha = blurred.a * (1.0 - origA);
    float tongues = smoothstep(0.20, 0.88, n1 * 0.75 + n2 * 0.35);
    float a = glowAlpha * intensity * (1.0 + tongues * power * 0.38);
    if (a <= 0.01) { fragColor = vec4(0.0); return; }
    vec3 flameColor = glowColor;
    if (flame.w > 0.5) {
        flameColor = hue(fract(time * 0.10 + uv.x * 0.55 + uv.y * 0.25 + n1 * 0.22));
        flameColor = mix(glowColor, flameColor, 0.72);
    }
    flameColor = mix(flameColor, vec3(1.0), tongues * power * 0.16);
    fragColor = vec4(flameColor * a, a);
}
