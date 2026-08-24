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
    vec2 halfpixel = resolution * 2.0;

    vec3 sum = texture(image, uv).rgb * 4.0;
    sum += texture(image, uv - halfpixel * offset).rgb;
    sum += texture(image, uv + halfpixel * offset).rgb;
    sum += texture(image, uv + vec2(halfpixel.x, -halfpixel.y) * offset).rgb;
    sum += texture(image, uv - vec2(halfpixel.x, -halfpixel.y) * offset).rgb;

    OutColor = vec4(sum / 8.0, 1.0);
}
