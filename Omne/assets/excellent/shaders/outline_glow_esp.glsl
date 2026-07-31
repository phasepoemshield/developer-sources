#version 120

uniform vec2 texelSize, direction;
uniform sampler2D texture;
uniform float radius;
uniform vec4 color1, color2, color3, color4;

#define offset direction * texelSize

vec4 getGradientColor(vec2 uv) {
    vec4 topLeft = color1;
    vec4 topRight = color2;
    vec4 bottomRight = color3;
    vec4 bottomLeft = color4;

    // Use smoothstep with very narrow transition zone for maximum visibility
    float x = smoothstep(0.45, 0.55, uv.x); // Very narrow transition
    float y = smoothstep(0.45, 0.55, uv.y);

    vec4 top = mix(topLeft, topRight, x);
    vec4 bottom = mix(bottomLeft, bottomRight, x);
    return mix(top, bottom, y);
}

void main() {
    float centerAlpha = texture2D(texture, gl_TexCoord[0].xy).a;
    float innerAlpha = centerAlpha;
    for (float r = 1.0; r <= radius; r++) {
        float alphaCurrent1 = texture2D(texture, gl_TexCoord[0].xy + offset * r).a;
        float alphaCurrent2 = texture2D(texture, gl_TexCoord[0].xy - offset * r).a;

       innerAlpha += alphaCurrent1 + alphaCurrent2;
    }

    vec4 gradientColor = getGradientColor(gl_TexCoord[0].xy);
    gl_FragColor = vec4(gradientColor.rgb, gradientColor.a * innerAlpha) * step(0.0, -centerAlpha);
}