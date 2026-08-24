#version 150

uniform sampler2D SourceTex;

in vec2 TexCoord;
out vec4 fragColor;

void main() {
    vec4 c = texture(SourceTex, TexCoord);
    float m = clamp(c.a, 0.0, 1.0);
    fragColor = vec4(m);
}
