#version 330

#moj_import <minecraft:dynamictransforms.glsl>
#moj_import <minecraft:projection.glsl>

in vec3 Position;

out vec2 handUv;

void main() {
    // The composite quad arrives in clip space; matrices are ignored on purpose.
    gl_Position = vec4(Position, 1.0);
    handUv = (Position.xy + 1.0) * 0.5;
}
