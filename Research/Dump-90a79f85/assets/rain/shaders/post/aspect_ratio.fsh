#version 150

uniform sampler2D InSampler;

in vec2 texCoord;

layout(std140) uniform AspectConfig {
    float AspectRatio;
};

out vec4 fragColor;

void main() {
    vec2 centered = texCoord - vec2(0.5);
    vec2 sampleCoord = vec2(0.5 + centered.x / AspectRatio, texCoord.y);

    fragColor = texture(InSampler, clamp(sampleCoord, vec2(0.0), vec2(1.0)));
}
