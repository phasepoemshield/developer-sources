#version 410 core

layout(std140) uniform Uniforms {
    mat4 uProjection;
    vec4 uRect;
    vec4 uParams;
    vec4 uColor;
};

out vec2 vLocal;
out vec2 vHalfSize;

void main() {
    vec2 vertices[4] = vec2[](
        vec2(0.0, 0.0), vec2(1.0, 0.0),
        vec2(1.0, 1.0), vec2(0.0, 1.0)
    );
    int indices[6] = int[](0, 1, 2, 2, 3, 0);
    vec2 vertex = vertices[indices[gl_VertexID]];
    vHalfSize = uRect.zw * 0.5;
    vLocal = vertex * uRect.zw - vHalfSize;
    vec2 position = uRect.xy + vertex * uRect.zw;
    gl_Position = uProjection * vec4(position, uParams.w, 1.0);
}
