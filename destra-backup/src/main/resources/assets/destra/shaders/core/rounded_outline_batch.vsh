#version 150

#moj_import <destra:common.glsl>

in vec3 Position;
in vec2 UV0;
in vec4 Color;

uniform mat4 ModelViewMat;
uniform mat4 ProjMat;

out vec2 FragCoord;
out vec2 GlobalPos;
out float Round;
out float Thickness;
out vec4 FragColor;

void main() {
    FragCoord = rvertexcoord(gl_VertexID);
    GlobalPos = Position.xy;
    Round = UV0.x;
    Thickness = UV0.y;
    FragColor = Color;

    gl_Position = ProjMat * ModelViewMat * vec4(Position, 1.0);
}
