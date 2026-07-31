#version 150

#moj_import <wonderful:common.glsl>

in vec2 FragCoord; // normalized fragment.fsh coord relative to the primitive
in vec4 FragColor;
in vec2 TexCoord;

uniform sampler2D Sampler0;
uniform vec2 Size;
uniform vec4 Radius;
uniform float Smoothness;
uniform vec4 ColorModulator;
uniform vec2 Resolution;

out vec4 OutColor;

float hash12(vec2 p) {
    vec3 p3 = fract(vec3(p.xyx) * 0.1031);
    p3 += dot(p3, p3.yzx + 33.33);
    return fract((p3.x + p3.y) * p3.z);
}

void main() {
    vec2 center = Size * 0.5;
    float distance = roundedBoxSDF(center - (FragCoord * Size), center - 1.0, Radius);

    float alpha = 1.0 - smoothstep(0.0, 1.0, distance);
    vec4 whiteColor = vec4(1.0, 1.0, 1.0, alpha); // white color - no color modulation applied by default

    vec2 screenUV = vec2(gl_FragCoord.x / Resolution.x, gl_FragCoord.y / Resolution.y);
    vec4 finalColor = whiteColor * texture(Sampler0, screenUV) * FragColor;

    if (finalColor.a < 0.001) { // alpha test
        discard;
    }

    vec4 color = finalColor * ColorModulator;
    float dither = (hash12(gl_FragCoord.xy) + hash12(gl_FragCoord.xy + 17.0) - 1.0) / 192.0;
    color.rgb = clamp(color.rgb + dither, 0.0, 1.0);

    OutColor = color;
}