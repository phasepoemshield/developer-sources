#version 150

in vec2 TexCoord;

uniform sampler2D image;
uniform vec2 resolution;
uniform float offset;

out vec4 OutColor;

vec3 adjustSaturation(vec3 color, float saturation) {
    float gray = dot(color, vec3(0.299, 0.587, 0.114));
    return mix(vec3(gray), color, saturation);
}

void main() {
    vec2 uv = TexCoord;
    vec2 halfpixel = resolution * 0.5;

    vec3 sum = texture(image, uv + vec2(-halfpixel.x * 2.0, 0.0) * offset).rgb;
    sum += texture(image, uv + vec2(-halfpixel.x, halfpixel.y) * offset).rgb * 2.0;
    sum += texture(image, uv + vec2(0.0, halfpixel.y * 2.0) * offset).rgb;
    sum += texture(image, uv + vec2(halfpixel.x, halfpixel.y) * offset).rgb * 2.0;
    sum += texture(image, uv + vec2(halfpixel.x * 2.0, 0.0) * offset).rgb;
    sum += texture(image, uv + vec2(halfpixel.x, -halfpixel.y) * offset).rgb * 2.0;
    sum += texture(image, uv + vec2(0.0, -halfpixel.y * 2.0) * offset).rgb;
    sum += texture(image, uv + vec2(-halfpixel.x, -halfpixel.y) * offset).rgb * 2.0;

    OutColor = vec4(sum / 12.0, 1.0);
}
