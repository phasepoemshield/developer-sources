#version 150

in vec3 vWorldPos;

layout(std140) uniform uTime {
    float time;
};
layout(std140) uniform uColor {
    vec3 tintColor;
};
layout(std140) uniform uParams {
    vec4 params;
};
layout(std140) uniform uCameraPos {
    vec3 cameraPos;
};

out vec4 fragColor;

#define MAX_ITER 4

void main() {
    float alpha = params.x;
    float speed = params.y;
    float scale = params.z;
    float intensity = params.w;

    // Мировые коорды, завёрнутые по модулю: стабильно на расстоянии + малый домен (без пересвета)
    vec3 worldPos = mod(vWorldPos + cameraPos, 16.0);
    vec3 p = worldPos * scale;
    vec3 i = p;
    float c = 1.0;

    for (int n = 0; n < MAX_ITER; n++) {
        float t = time * speed * (1.0 - (3.0 / float(n + 1)));
        i = p + vec3(
            cos(t - i.x) + sin(t + i.y),
            sin(t - i.y) + cos(t + i.z),
            cos(t - i.z) + sin(t + i.x)
        );
        c += 1.0 / length(vec3(
            p.x / (sin(i.x + t) / intensity),
            p.y / (cos(i.y + t) / intensity),
            p.z / (sin(i.z + t) / intensity)
        ));
    }

    c /= float(MAX_ITER);
    c = 1.5 - sqrt(c);
    float brightness = c * c * c * c;
    vec3 color = tintColor * brightness * 1.5 + tintColor * 0.2;

    fragColor = vec4(color, alpha);
}