#version 150

#extension GL_ARB_explicit_attrib_location : enable

layout(location = 0) in vec3 Position;

out vec2 TexCoord;
out vec4 FragColor;

void main() {
    gl_Position = vec4(Position, 1.0);
    TexCoord = Position.xy * 0.5 + 0.5;
    FragColor = vec4(1.0);
}
