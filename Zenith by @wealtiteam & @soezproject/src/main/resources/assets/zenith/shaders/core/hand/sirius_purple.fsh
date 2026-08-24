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
    float d = texture(DepthTexture, TexCoord).r;
    float glow = pow(clamp(1.0 - d, 0.0, 1.0), 3.0);
    vec3 col = mix(color.rgb, vec3(0.8, 0.3, 0.9), glow * 0.7 * effectAlpha);
    col += vec3(0.8, 0.3, 0.9) * glow * 0.5 * effectAlpha;
    fragColor = vec4(col, color.a);
}