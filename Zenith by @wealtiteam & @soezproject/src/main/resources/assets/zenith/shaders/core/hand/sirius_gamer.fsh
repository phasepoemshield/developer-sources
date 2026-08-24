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
    float grd = uv.y;
    float scan = 0.5 + 0.5 * sin(uv.y * resolution.y * 0.05 + time * 4.0);
    vec3 rgb = vec3(smoothstep(0.0, 0.5, grd) * 0.8, 0.3 + 0.2 * sin(uv.x * 3.0), 0.5);
    rgb += scan * 0.25;
    fragColor = vec4(mix(color.rgb, rgb, effectAlpha * 0.45), color.a);
}