#version 330 core
in vec2 vUv;
out vec4 FragColor;

uniform sampler2D uSource;
uniform vec2 uTexelSize; // 1/width, 1/height
uniform float uRadius;   // radius in pixels (<= 3.5)
uniform vec4 uWeights;

void main() {
    vec4 taps = uWeights;
    vec2 step = vec2(0.0, uTexelSize.y);

    vec4 color = texture(uSource, vUv) * taps.x;
    color += (texture(uSource, vUv + step * 1.0) + texture(uSource, vUv - step * 1.0)) * taps.y;
    color += (texture(uSource, vUv + step * 2.0) + texture(uSource, vUv - step * 2.0)) * taps.z;
    color += (texture(uSource, vUv + step * 3.0) + texture(uSource, vUv - step * 3.0)) * taps.w;

    FragColor = color;
}
