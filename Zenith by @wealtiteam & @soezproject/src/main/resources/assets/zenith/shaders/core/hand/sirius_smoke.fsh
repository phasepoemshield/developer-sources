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
    float n = 0.5 + 0.5 * sin(uv.x * 12.0 - time * 1.3 + sin(uv.y * 9.0 + time) * 0.6);
    vec3 smoke = vec3(0.5, 0.5, 0.55) + n * 0.25;
    float alpha = mix(color.a, 0.65, effectAlpha * 0.3 * (1.0 - n * 0.3));
    fragColor = vec4(mix(color.rgb, smoke, effectAlpha * 0.4), alpha);
}