#version 330 core

uniform sampler2D uMask;
uniform vec2 uTexelSize;
uniform float uRadius;
uniform vec4 uColor;

in vec2 vUv;
out vec4 fragColor;

void main() {
    float centerAlpha = texture(uMask, vUv).a;
    if (centerAlpha > 0.001) {
        discard;
    }

    float maxAlpha = 0.0;
    int radius = int(max(1.0, floor(uRadius + 0.5)));
    for (int x = -radius; x <= radius; x++) {
        for (int y = -radius; y <= radius; y++) {
            vec2 offset = vec2(float(x), float(y)) * uTexelSize;
            maxAlpha = max(maxAlpha, texture(uMask, vUv + offset).a);
        }
    }

    if (maxAlpha <= 0.001) {
        discard;
    }

    fragColor = vec4(uColor.rgb, uColor.a * maxAlpha);
}
