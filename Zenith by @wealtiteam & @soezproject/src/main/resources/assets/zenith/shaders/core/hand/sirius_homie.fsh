#version 150
uniform sampler2D ColorTexture;
uniform sampler2D DepthTexture;
uniform vec2 resolution;
uniform float time;
uniform vec2 handMotion;
uniform float effectAlpha;
in vec2 TexCoord;
out vec4 fragColor;
void main() {
    vec4 color = texture(ColorTexture, TexCoord);
    vec2 uv = gl_FragCoord.xy / resolution;
    float v = 0.5 + 0.5 * sin(uv.y * 8.0 + time * 0.5);
    vec3 tint = vec3(0.7, 0.3, 0.7) + 0.4 * v * vec3(0.6, 0.2, 0.6);
    fragColor = vec4(mix(color.rgb, tint, effectAlpha * 0.5), color.a);
}