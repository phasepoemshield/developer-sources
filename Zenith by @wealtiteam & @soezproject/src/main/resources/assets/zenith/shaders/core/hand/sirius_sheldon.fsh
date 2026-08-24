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
    float n = 0.5 + 0.5 * sin(uv.x * 9.0 + time * 0.42) * cos(uv.y * 7.0 - time * 0.3);
    vec3 c1 = vec3(0.3, 0.7, 0.95);
    vec3 c2 = vec3(0.05, 0.2, 0.5);
    vec3 tint = mix(c2, c1, n);
    fragColor = vec4(mix(color.rgb, tint, effectAlpha * 0.55), color.a);
}