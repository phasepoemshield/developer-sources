#version 150

in vec2 TexCoord;
in vec4 FragColor;

uniform sampler2D Sampler0;
uniform vec2 Resolution;
uniform float Offset;
uniform float Saturation;
uniform float TintIntensity;
uniform vec3 TintColor;

out vec4 OutColor;

vec3 adjustSaturation(vec3 color, float saturation) {
    float gray = dot(color, vec3(0.299, 0.587, 0.114));
    return mix(vec3(gray), color, saturation);
}

float hash12(vec2 p) {
    vec3 p3 = fract(vec3(p.xyx) * 0.1031);
    p3 += dot(p3, p3.yzx + 33.33);
    return fract((p3.x + p3.y) * p3.z);
}

void main() {
    vec2 uv = TexCoord;
    vec2 halfpixel = Resolution * 0.5 * Offset;

    vec4 sum = texture(Sampler0, uv) * 4.0;
    sum += texture(Sampler0, uv - halfpixel);
    sum += texture(Sampler0, uv + halfpixel);
    sum += texture(Sampler0, uv + vec2(halfpixel.x, -halfpixel.y));
    sum += texture(Sampler0, uv - vec2(halfpixel.x, -halfpixel.y));

    vec3 color = sum.rgb / 8.0;
    color = adjustSaturation(color, Saturation);
    color = mix(color, TintColor, TintIntensity);
    color = clamp(color + (hash12(gl_FragCoord.xy) + hash12(gl_FragCoord.xy + 31.0) - 1.0) / 192.0, 0.0, 1.0);

    OutColor = vec4(color, 1.0);
}