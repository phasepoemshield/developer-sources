#version 150

#moj_import <destra:common.glsl>

in vec2 FragCoord;
in vec2 TexCoord;
in vec4 FragColor;

uniform sampler2D Sampler0;
uniform vec2 size;
uniform vec4 radius;
uniform float softness;

out vec4 OutColor;

void main() {
    float alpha = ralpha(size, FragCoord, radius, softness);
    vec4 color = vec4(1.0, 1.0, 1.0, alpha) * texture(Sampler0, TexCoord) * FragColor;

    if (color.a == 0.0) {
        discard;
    }

    OutColor = color;
}
