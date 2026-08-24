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
    float bands = sin(uv.y * 18.0 + t * 1.8 + shift);
    float pulse = 0.5 + 0.5 * sin(t * 2.0);
    vec3 c1 = vec3(1.0, 0.2, 0.1);
    vec3 c2 = vec3(0.4, 0.1, 1.0);
    vec3 col = mix(c2, c1, bands * 0.5 + 0.5);
    col *= 0.7 + 0.6 * pulse;
    fragColor = vec4(mix(color.rgb, col, effectAlpha * 0.6), color.a);
}