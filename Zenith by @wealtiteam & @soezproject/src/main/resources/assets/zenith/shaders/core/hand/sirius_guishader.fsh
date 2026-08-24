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
    float lum = dot(color.rgb, vec3(0.299, 0.587, 0.114));
    float edge = clamp((abs(dFdx(lum)) + abs(dFdy(lum))) * 6.0, 0.0, 1.0) * step(0.01, color.a);
    vec3 edgeCol = vec3(0.0, 0.8, 0.9);
    float alpha = color.a;
    vec3 col = mix(color.rgb, edgeCol, edge * 0.8 * effectAlpha);
    col += edgeCol * edge * 0.4 * effectAlpha;
    fragColor = vec4(col, alpha);
}