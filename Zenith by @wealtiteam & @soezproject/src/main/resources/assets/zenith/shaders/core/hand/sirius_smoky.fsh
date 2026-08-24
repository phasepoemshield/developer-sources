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
    float n = 0.5 + 0.5 * sin(uv.x * 10.0 + time * 0.8) * sin(uv.y * 12.0 - time * 0.6);
    vec3 tint = vec3(0.35, 0.35, 0.4) + n * vec3(0.2, 0.15, 0.2);
    fragColor = vec4(mix(color.rgb, tint, effectAlpha * 0.5), color.a);
}