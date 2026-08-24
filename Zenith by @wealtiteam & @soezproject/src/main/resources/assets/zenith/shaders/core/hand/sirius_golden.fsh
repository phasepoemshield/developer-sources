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
    float shimmer = 0.5 + 0.5 * sin(uv.x * 9.0 + time * 1.2 + sin(uv.y * 6.0 + time * 0.8) * 1.5);
    vec3 gold = vec3(1.0, 0.84, 0.35);
    vec3 warm = vec3(0.85, 0.55, 0.15);
    vec3 tint = mix(warm, gold, shimmer);
    float alpha = color.a;
    fragColor = vec4(mix(color.rgb, tint, effectAlpha * 0.6), alpha);
}
