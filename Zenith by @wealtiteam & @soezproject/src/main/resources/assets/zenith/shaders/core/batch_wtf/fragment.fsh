#version 150

#moj_import <zenith:common.glsl>

in vec2 FragCoord;
in vec2 TexCoord;
in vec2 FragSize;
in vec4 FragColor;

uniform sampler2D Sampler0;
uniform vec4 Radius;
uniform float Smoothness;
uniform vec4 ColorModulator;

out vec4 OutColor;

void main() {
    vec4 texColor = texture(Sampler0, TexCoord);
    float alpha = ralpha(FragSize, FragCoord, Radius, Smoothness);

    vec4 finalColor = texColor * FragColor * ColorModulator;
    finalColor.a *= alpha;

    if (finalColor.a <= 0.0) {
        discard;
    }

    OutColor = finalColor;
}
