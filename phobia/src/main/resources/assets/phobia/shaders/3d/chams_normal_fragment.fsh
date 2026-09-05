#version 330

uniform sampler2D Sampler0;

in vec4 vColor;
in vec2 vTexCoord;

out vec4 fragColor;

void main() {
    vec4 tex = texture(Sampler0, vTexCoord) * vColor;
    if (tex.a < 0.05) discard;
    fragColor = tex;
}
