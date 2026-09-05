#version 410 core

layout(std140) uniform Uniforms {
    mat4 uProjection;
    vec4 uQuad;
    vec4 uPanel;
    vec4 uPanelRadii;
    vec4 uNeck;
    vec4 uNeckRadii;
    vec4 uFill;
    vec4 uBorder;
    vec4 uInner;
    vec4 uParams;
    vec4 uMisc;
};

out vec2 vPos;

void main() {
    vec2 vertices[4] = vec2[](
        vec2(0.0, 0.0),
        vec2(1.0, 0.0),
        vec2(1.0, 1.0),
        vec2(0.0, 1.0)
    );

    int indices[6] = int[](0, 1, 2, 2, 3, 0);
    vec2 vertex = vertices[indices[gl_VertexID]];

    vec2 position = uQuad.xy + vertex * uQuad.zw;
    vPos = position;
    gl_Position = uProjection * vec4(position, uMisc.x, 1.0);
}
