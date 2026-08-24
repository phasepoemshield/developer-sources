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
    float wave = 0.5 + 0.5 * sin(uv.x * 11.0 - time * 2.3);
    vec3 c1 = vec3(0.2, 0.6, 1.0);
    vec3 c2 = vec3(0.1, 0.3, 0.8);
    vec3 flow = mix(c2, c1, wave);
    fragColor = vec4(mix(color.rgb, flow, effectAlpha * 0.55), color.a);
}
