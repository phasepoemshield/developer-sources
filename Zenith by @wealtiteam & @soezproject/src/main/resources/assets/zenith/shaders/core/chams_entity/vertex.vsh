#version 150

#moj_import <minecraft:fog.glsl>

in vec3 Position;
in vec4 Color;
in vec2 UV0;
in vec3 Normal;

uniform mat4 ModelViewMat;
uniform mat4 ProjMat;
uniform int FogShape;

out float vertexDistance;
out vec4 vertexColor;
out vec2 texCoord0;
out vec3 viewNormal;
out vec3 viewPos;
out vec3 modelPos;

void main() {
    vec4 mvPos = ModelViewMat * vec4(Position, 1.0);
    gl_Position = ProjMat * mvPos;

    vertexDistance = fog_distance(Position, FogShape);
    vertexColor = Color;
    texCoord0 = UV0;
    viewNormal = normalize(mat3(ModelViewMat) * Normal);
    viewPos = mvPos.xyz;
    modelPos = Position;
}
