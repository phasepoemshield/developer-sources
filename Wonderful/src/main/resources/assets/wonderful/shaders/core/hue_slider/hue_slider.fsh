#version 150

#moj_import <wonderful:common.glsl>

in vec2 FragCoord;

uniform vec2 Size;
uniform vec4 Radius;
uniform float Smoothness;
uniform float Alpha;

out vec4 OutColor;

vec3 hsv2rgb(vec3 c) {
    vec3 p = abs(fract(c.xxx + vec3(0.0, 2.0 / 3.0, 1.0 / 3.0)) * 6.0 - 3.0);
    return c.z * mix(vec3(1.0), clamp(p - 1.0, 0.0, 1.0), c.y);
}

void main() {
    vec2 center = Size * 0.5;
    float distance = roundedBoxSDF(center - (FragCoord * Size), center - 1.0, Radius);
    float shapeAlpha = 1.0 - smoothstep(1.0 - Smoothness, 1.0, distance);
    float alpha = shapeAlpha * Alpha;
    if (alpha <= 0.0) {
        discard;
    }

    vec3 rgb = hsv2rgb(vec3(clamp(FragCoord.x, 0.0, 1.0), 1.0, 1.0));
    OutColor = vec4(rgb, alpha);
}
