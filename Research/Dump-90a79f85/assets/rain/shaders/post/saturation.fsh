#version 150

uniform sampler2D InSampler;

in vec2 texCoord;

layout(std140) uniform SaturationConfig {
    float Saturation;
};

out vec4 fragColor;

void main() {
    vec4 baseColor = texture(InSampler, texCoord);
    float luminance = dot(baseColor.rgb, vec3(0.2126, 0.7152, 0.0722));
    vec3 grayscale = vec3(luminance);
    vec3 adjusted = mix(grayscale, baseColor.rgb, Saturation);
    fragColor = vec4(clamp(adjusted, 0.0, 1.0), baseColor.a);
}
