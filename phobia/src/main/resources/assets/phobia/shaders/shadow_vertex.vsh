#version 410 core

layout(std140) uniform Uniforms {
    mat4 uProjection;
    vec4 uRect;
    vec4 uParams;
    vec4 uColor;
    vec4 uExtra;
};

out vec2 vLocal;
out vec2 vHalfSize;

void main() {
    vec2 vertices[4] = vec2[](
        vec2(0.0, 0.0),
        vec2(1.0, 0.0),
        vec2(1.0, 1.0),
        vec2(0.0, 1.0)
    );
    int indices[6] = int[](0, 1, 2, 2, 3, 0);
    vec2 vertex = vertices[indices[gl_VertexID]];

    float padding = max(1.0, uParams.y * 1.8);
    vec2 outerSize = uRect.zw + vec2(padding * 2.0);
    vec2 outerOrigin = uRect.xy + uParams.zw - vec2(padding);

    vLocal = vertex * outerSize - outerSize * 0.5;
    vHalfSize = uRect.zw * 0.5;

    vec2 position = outerOrigin + vertex * outerSize;
    gl_Position = uProjection * vec4(position, uExtra.x, 1.0);
}
