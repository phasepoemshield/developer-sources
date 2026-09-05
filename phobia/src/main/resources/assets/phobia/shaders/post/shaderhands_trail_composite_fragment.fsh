#version 150

in vec2 texCoord;
out vec4 fragColor;

uniform sampler2D Sampler0;

layout(std140) uniform TrailData {
    vec4 offsetFadeTime;
    vec4 deltaTurbulenceFlicker;
    vec4 textureSize;
    vec4 trailColor1;
    vec4 trailColor2;
};

float ring4(vec2 uv, vec2 pixel, float radius) {
    return (texture(Sampler0, uv + vec2(radius, 0.0) * pixel).a
          + texture(Sampler0, uv - vec2(radius, 0.0) * pixel).a
          + texture(Sampler0, uv + vec2(0.0, radius) * pixel).a
          + texture(Sampler0, uv - vec2(0.0, radius) * pixel).a) * 0.25;
}

float diagonal4(vec2 uv, vec2 pixel, float radius) {
    vec2 offset = pixel * radius;
    return (texture(Sampler0, uv + offset).a
          + texture(Sampler0, uv - offset).a
          + texture(Sampler0, uv + vec2(offset.x, -offset.y)).a
          + texture(Sampler0, uv + vec2(-offset.x, offset.y)).a) * 0.25;
}

void main() {
    vec4 color = texture(Sampler0, texCoord);
    if (textureSize.z > 0.5) {
        vec2 pixel = 1.0 / max(textureSize.xy, vec2(1.0));
        float nearGlow = (ring4(texCoord, pixel, 1.8) + diagonal4(texCoord, pixel, 1.4)) * 0.5;
        float middleGlow = (ring4(texCoord, pixel, 4.4) + diagonal4(texCoord, pixel, 3.2)) * 0.5;
        float farGlow = (ring4(texCoord, pixel, 8.2) + diagonal4(texCoord, pixel, 5.8)) * 0.5;
        float halo = nearGlow * 0.48 + middleGlow * 0.34 + farGlow * 0.18;
        float outerHalo = max(0.0, halo - color.a * 0.07);
        if (color.a < 0.001 && outerHalo < 0.001) {
            discard;
        }

        float gradient = clamp(texCoord.x * 0.58 + (1.0 - texCoord.y) * 0.42, 0.0, 1.0);
        vec3 themeTint = mix(trailColor1.rgb, trailColor2.rgb, gradient);
        vec3 coreTint = mix(themeTint, vec3(1.0), 0.70);
        vec3 haloTint = mix(themeTint, vec3(1.0), 0.42);
        float alpha = clamp(color.a * 0.50 + outerHalo * 0.62, 0.0, 0.72);
        vec3 rgb = coreTint * color.a * 0.68 + haloTint * outerHalo * 0.82;
        fragColor = vec4(rgb, alpha);
        return;
    }
    if (color.a < 0.001) {
        discard;
    }
    if (trailColor2.a < 0.5) {
        vec3 sourceColor = color.rgb / max(color.a, 0.001);
        fragColor = vec4(sourceColor * color.a, color.a);
        return;
    }
    float gradient = clamp(texCoord.x * 0.65 + (1.0 - texCoord.y) * 0.35, 0.0, 1.0);
    vec3 tint = mix(trailColor1.rgb, trailColor2.rgb, gradient);
    float intensity = clamp(max(max(color.r, color.g), color.b) / max(color.a, 0.001), 0.45, 1.0);
    fragColor = vec4(tint * color.a * intensity, color.a);
}
