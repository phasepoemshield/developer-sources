#version 150

in vec4 Position;

#include<matrices>

void main() {
    gl_Position = projMat * ModelViewMat * Position;
}
