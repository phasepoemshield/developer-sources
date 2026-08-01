#version 150

in vec2 texCoord;
out vec4 fragColor;

uniform sampler2D InSampler;

layout(std140) uniform ShaderHandsData {
    vec4 resolutionPadding;
    vec4 color;
    vec4 modeTime;
    vec4 shaderOptions;
    vec4 extra;
};

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

float handEdge(vec2 uv, vec2 px, float sourceAlpha) {
    float around = 0.0;
    around = max(around, texture(InSampler, uv + vec2(px.x, 0.0)).a);
    around = max(around, texture(InSampler, uv - vec2(px.x, 0.0)).a);
    around = max(around, texture(InSampler, uv + vec2(0.0, px.y)).a);
    around = max(around, texture(InSampler, uv - vec2(0.0, px.y)).a);
    around = max(around, texture(InSampler, uv + vec2(px.x, px.y)).a);
    around = max(around, texture(InSampler, uv + vec2(-px.x, px.y)).a);
    around = max(around, texture(InSampler, uv + vec2(px.x, -px.y)).a);
    around = max(around, texture(InSampler, uv - vec2(px.x, px.y)).a);
    return max(around - sourceAlpha, 0.0);
}

void main() {
    vec2 uv = texCoord;
    vec4 source = texture(InSampler, uv);
    if (source.a <= 0.001) {
        fragColor = vec4(0.0);
        return;
    }

    vec2 resolution = max(resolutionPadding.xy, vec2(1.0));
    vec2 px = 1.75 / resolution;
    float mode = modeTime.x;
    float outlineAlpha = modeTime.y;
    float time = modeTime.z;
    float speed = max(modeTime.w, 0.02);
    float shaderIntensity = shaderOptions.x;
    float fill = shaderOptions.y;
    float distortion = shaderOptions.z;
    float firePower = shaderOptions.w;
    float fireAlpha = extra.x;

    if (mode < 0.5) {
        float edge = handEdge(uv, px, source.a) * outlineAlpha;
        vec4 tint = vec4(color.rgb, color.a * source.a);
        fragColor = vec4(tint.rgb * tint.a, tint.a + edge);
        return;
    }

    if (mode < 1.5) {
        fragColor = vec4(color.rgb * source.a, source.a);
        return;
    }

    if (mode < 2.5) {
        float edge = handEdge(uv, px * 3.5, source.a);
        float glow = source.a * 0.35 + edge * 2.4;
        fragColor = vec4(color.rgb * glow, glow);
        return;
    }

    if (mode < 3.5) {
        vec2 p = uv * 2.0 - 1.0;
        float t = time * speed;
        float n1 = noise(p * 5.0 + vec2(t * 0.35, -t * 0.22));
        float n2 = noise(p * 12.0 + vec2(-t * 0.18, t * 0.31));
        float stars = smoothstep(0.82, 1.0, hash(floor((uv + t * 0.01) * resolution / 3.0)));
        vec3 space = mix(color.rgb * 0.35, hue(fract(n1 * 0.35 + n2 * 0.25 + t * 0.06)), shaderIntensity * 0.75);
        space += stars * shaderIntensity;
        fragColor = vec4(space * source.a, source.a);
        return;
    }

    float t = time * speed;
    vec2 flowUv = uv + vec2(
        (noise(uv * 7.0 + vec2(t * 0.35, 0.0)) - 0.5) * 0.035 * distortion,
        -t * 0.05 * max(firePower, 0.05)
    );
    float n1 = noise(flowUv * vec2(7.0, 4.0));
    float n2 = noise(flowUv * vec2(14.0, 9.0) + vec2(0.0, t * 0.4));
    float flame = smoothstep(0.18, 0.92, n1 * 0.68 + n2 * 0.42 + (1.0 - uv.y) * 0.18 * firePower);
    vec3 flameColor = mix(color.rgb, vec3(1.0, 0.46, 0.08), flame * firePower);
    flameColor = mix(flameColor, vec3(1.0, 0.92, 0.45), flame * flame * 0.45);
    vec3 base = fill > 0.5 ? flameColor : source.rgb;
    float alpha = source.a * mix(0.75, 1.0, fill) * mix(1.0, fireAlpha, flame);
    fragColor = vec4(base * alpha, alpha);
}
