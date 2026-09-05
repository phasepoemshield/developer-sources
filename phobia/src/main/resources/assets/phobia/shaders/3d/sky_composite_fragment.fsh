#version 330

uniform sampler2D Sampler0;

in vec2 vNdc;
out vec4 fragColor;

void main() {
    fragColor = texture(Sampler0, vNdc * 0.5 + 0.5);
}
