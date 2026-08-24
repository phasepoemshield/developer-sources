#version 150

uniform sampler2D FireTex;
uniform sampler2D HandTex;
uniform sampler2D MaskTex;
uniform vec2 TexelSize;
uniform float Time;
uniform float Intensity;
uniform float Alpha;

in vec2 TexCoord;
out vec4 fragColor;

void main() {
    vec2 uv = TexCoord;

    float mask = texture(MaskTex, uv).r;
    vec4 fire = texture(FireTex, uv);

    vec3 glow = fire.rgb * clamp(fire.a * 1.6, 0.0, 1.0) * Intensity;
    float fireAlpha = clamp(fire.a * Alpha * mask, 0.0, 1.0);

    // The vanilla hand is rendered immediately after this pass. Drawing the
    // captured hand here as well makes the hand texture opaque/white on some
    // framebuffer formats, so this pass intentionally composites only fire.
    fragColor = vec4(glow * (0.35 + 0.65 * mask), fireAlpha);
}
