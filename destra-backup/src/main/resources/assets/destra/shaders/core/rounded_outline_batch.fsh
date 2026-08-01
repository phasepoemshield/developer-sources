#version 150

in vec2 FragCoord;
in vec2 GlobalPos;
in float Round;
in float Thickness;
in vec4 FragColor;

out vec4 fragColor;

float roundedBox(vec2 p, vec2 halfSize, float radius) {
    vec2 q = abs(p) - halfSize + radius;
    return min(max(q.x, q.y), 0.0) + length(max(q, 0.0)) - radius;
}

void main() {
    vec2 dxGlobal = dFdx(GlobalPos);
    vec2 dyGlobal = dFdy(GlobalPos);
    vec2 dxLocal = dFdx(FragCoord);
    vec2 dyLocal = dFdy(FragCoord);
    float width = abs(dxGlobal.x) / max(abs(dxLocal.x), 0.0001);
    float height = abs(dyGlobal.y) / max(abs(dyLocal.y), 0.0001);
    vec2 size = max(vec2(width, height), vec2(1.0));
    float thickness = max(Thickness, 0.001);
    float radius = clamp(Round, 0.0, min(size.x, size.y) * 0.5);
    vec2 centered = (FragCoord - 0.5) * size;
    float distance = roundedBox(centered, size * 0.5 - thickness, radius);

    if (abs(distance) > thickness) {
        discard;
        return;
    }

    float alpha = 1.0 - smoothstep(max(thickness - 1.5, 0.0), thickness, abs(distance));
    fragColor = vec4(FragColor.rgb, FragColor.a * alpha);
}
