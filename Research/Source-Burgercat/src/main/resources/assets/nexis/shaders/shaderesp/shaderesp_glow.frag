#version 330 core

uniform sampler2D uBlur;
uniform sampler2D uMask;
uniform vec4 uColor;

in vec2 vUv;
out vec4 fragColor;

void main() {
    float blurAlpha = texture(uBlur, vUv).a;
    float maskAlpha = texture(uMask, vUv).a;
    float glowAlpha = max(0.0, blurAlpha - maskAlpha);

    if (glowAlpha <= 0.001) {
        discard;
    }

    fragColor = vec4(uColor.rgb, uColor.a * glowAlpha);
}
