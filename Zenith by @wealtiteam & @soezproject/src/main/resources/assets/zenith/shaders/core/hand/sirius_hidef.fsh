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
    float n = 0.5 + 0.5 * sin(uv.x * 14.0 + time * 0.35) * sin(uv.y * 11.0 + time * 0.27);
    vec3 tint = mix(vec3(0.8, 0.2, 0.2), vec3(1.0, 0.5, 0.1), n);
    float alpha = color.a;
    vec3 col = color.rgb * (0.75 + 0.5 * n * effectAlpha);
    col = mix(col, tint, effectAlpha * 0.35);
    fragColor = vec4(col, alpha);
}