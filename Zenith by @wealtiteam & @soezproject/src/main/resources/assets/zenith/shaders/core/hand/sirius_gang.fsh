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
    float hue = fract(uv.y * 0.5 + t * 0.08 + shift);
    float r = clamp(abs(fract(hue + 0.3333) * 6.0 - 3.0) - 1.0, 0.0, 1.0);
    float g = clamp(abs(fract(hue + 0.6666) * 6.0 - 3.0) - 1.0, 0.0, 1.0);
    float b = clamp(abs(fract(hue + 1.0) * 6.0 - 3.0) - 1.0, 0.0, 1.0);
    vec3 rainbow = vec3(r, g, b);
    fragColor = vec4(mix(color.rgb, rainbow, effectAlpha * 0.5), color.a);
}