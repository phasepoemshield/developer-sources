#version 150

#extension GL_ARB_explicit_attrib_location : enable

layout(location = 0) in vec3 Position;

void main() {
    gl_Position = vec4(Position, 1.0);
}
