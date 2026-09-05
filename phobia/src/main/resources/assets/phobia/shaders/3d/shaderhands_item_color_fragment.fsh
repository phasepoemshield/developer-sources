#version 330

uniform sampler2D Sampler0;

in vec4 vColor1;
in float vSpeed;
in vec2 vTexCoord;

out vec4 fragColor;

void main() {
    vec4 tex = textureLod(Sampler0, vTexCoord, 0.0);
    float coverage = smoothstep(0.25, 0.75, tex.a);
    if (coverage < 0.01) discard;

    float alpha = coverage * max(vColor1.a, 0.08);
    vec3 color = tex.rgb;
    float peak = max(max(color.r, color.g), color.b);
    if (peak > 0.02) color /= peak;
    color = mix(tex.rgb, color, 0.28);

    // Premultiplied RGB keeps each texture region's own color in the trail buffer.
    fragColor = vec4(color * alpha, alpha);
}
