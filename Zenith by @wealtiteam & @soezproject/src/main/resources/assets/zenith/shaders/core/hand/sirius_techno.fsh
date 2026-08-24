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
    float n = 0.5 + 0.5 * sin(uv.x * 8.0 + time * 0.9 + sin(uv.y * 6.0 - time * 0.5) * 2.0);
    vec3 c1 = vec3(0.1, 0.9, 0.5);
    vec3 c2 = vec3(0.05, 0.4, 0.25);
    vec3 tint = mix(c2, c1, n);
    fragColor = vec4(mix(color.rgb, tint, effectAlpha * 0.5), color.a);
}