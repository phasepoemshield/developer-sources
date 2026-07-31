#version 150

#moj_import <zenith:common.glsl>

in vec3 Position;
in vec2 UV0;
in vec4 Color;

uniform mat4 ModelViewMat;
uniform mat4 ProjMat;

out vec2 fragRectCoord;
out vec2 fragSize;
out vec4 FragColor;

void main() {

    fragRectCoord = rvertexcoord(gl_VertexID);
    fragSize = UV0;
    FragColor = Color;
    gl_Position = ProjMat * ModelViewMat * vec4(Position, 1.0);
}
