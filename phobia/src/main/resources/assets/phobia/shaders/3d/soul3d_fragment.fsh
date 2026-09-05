#version 410 core

layout(std140) uniform Uniforms {
    mat4 uProjection;
    vec4 uParams;
};

in vec4 vColor;
in vec2 vUV;

out vec4 fragColor;

float hash(float n) {
    return fract(sin(n) * 43758.5453123);
}

float noise(vec2 p) {
    vec2 i = floor(p);
    vec2 f = fract(p);
    f = f * f * (3.0 - 2.0 * f);
    float a = hash(i.x + i.y * 57.0);
    float b = hash(i.x + 1.0 + i.y * 57.0);
    float c = hash(i.x + (i.y + 1.0) * 57.0);
    float d = hash(i.x + 1.0 + (i.y + 1.0) * 57.0);
    return mix(mix(a, b, f.x), mix(c, d, f.x), f.y);
}

void main() {
    float band = round(vUV.x / 4.0);
    vec2 quad = vec2(vUV.x - band * 4.0, vUV.y);
    vec2 p = quad;

    float time = uParams.x;
    float ph = hash(band + 0.731) * 6.2831853;

    // Keep the original living flame motion while letting the light itself stay
    // stable. This prevents the wide halo from looking like a shaking texture.
    vec2 haloShape = vec2(p.x, p.y * 0.82 - 0.06) * vec2(1.04, 0.92);
    float sway = noise(vec2(p.y * 2.2 - time * 2.6 + ph, band * 0.113)) - 0.5;
    p.x += sway * 0.38 * smoothstep(-0.35, 1.0, p.y);
    p.y = p.y * 0.82 - 0.06;

    vec2 flame = p * vec2(1.04, 0.92);
    float d2 = dot(flame, flame);

    // Three continuous light zones in one draw call: a white-hot center, a
    // saturated near glow and a broad low-energy bloom. The broad component is
    // deliberately subtle, so overlapping trails become luminous without
    // turning into opaque discs on bright game backgrounds.
    float hot = exp(-d2 * 42.0);
    float core = exp(-d2 * 17.0);
    float inner = exp(-d2 * 6.2);
    float bloom = exp(-dot(haloShape, haloShape) * 2.15);

    // Fade only at the edge of the billboard. Unlike the previous radial cutoff
    // this leaves enough room for a soft halo and still guarantees no square rim.
    float edge = 1.0 - smoothstep(0.78, 1.0, length(quad));
    float flicker = 0.82 + 0.18 * sin(time * 5.7 + ph * 7.3);

    float strength = (hot * 1.55 + core * 0.62 + inner * 0.25 + bloom * 0.105)
            * edge * flicker;

    float whiteCore = clamp(hot * 1.15 + core * 0.48, 0.0, 0.96);
    vec3 col = mix(vColor.rgb, vec3(1.0), whiteCore);

    float alpha = strength * vColor.a;
    if (alpha < 0.0025) discard;

    fragColor = vec4(col * alpha, alpha);
}
