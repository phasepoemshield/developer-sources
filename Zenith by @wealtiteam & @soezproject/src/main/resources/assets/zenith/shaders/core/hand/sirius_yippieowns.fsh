#version 150
uniform sampler2D ColorTexture;
uniform sampler2D DepthTexture;
uniform vec2 resolution;
uniform float time;
uniform vec2 handMotion;
uniform float effectAlpha;
uniform vec2 speed;
uniform float shift;
in vec2 TexCoord;
out vec4 fragColor;
void main() {
    vec4 color = texture(ColorTexture, TexCoord);
    vec2 uv = gl_FragCoord.xy / resolution;
    float t = time * speed.x;
    float n = 0.5 + 0.5 * sin(uv.x * 7.0 + t * 0.7 + shift) * sin(uv.y * 9.0 - t * 0.5);
    vec3 c1 = vec3(1.0, 0.8, 0.2);
    vec3 c2 = vec3(0.9, 0.1, 0.3);
    vec3 tint = mix(c2, c1, n);
    fragColor = vec4(mix(color.rgb, tint, effectAlpha * 0.55), color.a);
}