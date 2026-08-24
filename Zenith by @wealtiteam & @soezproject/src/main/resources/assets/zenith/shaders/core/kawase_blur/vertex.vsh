#version 150

in vec3 Position;
in vec4 Color;

uniform mat4 ModelViewMat;
uniform mat4 ProjMat;

out vec2 TexCoord;
out vec4 FragColor;

const vec2[4] FULLSCREEN_POSITIONS = vec2[](
    vec2(-1.0,  1.0),
    vec2(-1.0, -1.0),
    vec2( 1.0, -1.0),
    vec2( 1.0,  1.0)
);

void main() {
    vec2 position = FULLSCREEN_POSITIONS[gl_VertexID % 4];
    gl_Position = vec4(position, 0.0, 1.0);
    TexCoord = position * 0.5 + 0.5;
    FragColor = Color;
}
