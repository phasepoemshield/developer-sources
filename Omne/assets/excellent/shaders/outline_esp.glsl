#version 120

uniform sampler2D texture;
uniform vec2 texelSize;
uniform vec4 color1, color2, color3, color4;

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
    vec4 center = texture2D(texture, gl_TexCoord[0].xy);

    if (center.a != 0) discard;

    float alpha = 0;
    vec4 endCol = vec4(0);
    for (float x = -1; x <= 1; x++) {
        for (float y = -1; y <= 1; y++) {
            vec4 curColor = texture2D(texture, gl_TexCoord[0].xy + vec2(texelSize.x * x, texelSize.y * y));
            if (curColor.a != 0) {
                alpha += max(0, (2 - sqrt(x * x + y * y)));
            }
            curColor.rgb *= curColor.a;
            endCol += curColor;
        }
    }
    vec4 gradientColor = getGradientColor(gl_TexCoord[0].xy);
    gl_FragColor = vec4(gradientColor.rgb, gradientColor.a * alpha);
}