#version 120

uniform sampler2D textureIn;
uniform vec2 texelSize, direction;
uniform vec4 color1, color2, color3, color4;
uniform bool avoidTexture;
uniform float exposure, radius;
uniform float weights[32];

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
    if (direction.y == 1 && avoidTexture) {
        if (texture2D(textureIn, gl_TexCoord[0].st).a != 0.0) discard;
    }

    float innerAlpha = texture2D(textureIn, gl_TexCoord[0].st).a * weights[0];

    for (float r = 1.0; r <= radius; r ++) {
        innerAlpha += texture2D(textureIn, gl_TexCoord[0].st + offset * r).a * weights[int(r)];
        innerAlpha += texture2D(textureIn, gl_TexCoord[0].st - offset * r).a * weights[int(r)];
    }

    vec4 gradientColor = getGradientColor(gl_TexCoord[0].st);
    gl_FragColor = vec4(gradientColor.rgb, gradientColor.a * innerAlpha);
}