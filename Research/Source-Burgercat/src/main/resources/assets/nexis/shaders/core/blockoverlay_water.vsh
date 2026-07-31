#version 150

in vec3 Position;

layout(std140) uniform uModelViewProjection {
    mat4 mvp;
};

out vec3 vWorldPos;

void main() {
    gl_Position = mvp * vec4(Position, 1.0);
    vWorldPos = Position;
}
