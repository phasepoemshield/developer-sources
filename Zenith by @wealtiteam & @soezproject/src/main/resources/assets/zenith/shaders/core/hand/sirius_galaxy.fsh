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
    float n = sin(uv.x * 5.0 + time * 0.18) * sin(uv.y * 7.3 + time * 0.21);
    vec3 tint = vec3(0.15, 0.05, 0.35) + 0.6 * abs(n) * vec3(0.7, 0.3, 0.8);
    fragColor = vec4(mix(color.rgb, tint, effectAlpha * 0.5), color.a);
}