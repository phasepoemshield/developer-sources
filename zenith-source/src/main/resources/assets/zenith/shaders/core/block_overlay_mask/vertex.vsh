#version 330

#moj_import <minecraft:dynamictransforms.glsl>
#moj_import <minecraft:projection.glsl>

in vec3 Position;

void main() {
    // Mask boxes are pre-projected to clip space by BoxShaderRenderer.
    gl_Position = vec4(Position, 1.0);
}
