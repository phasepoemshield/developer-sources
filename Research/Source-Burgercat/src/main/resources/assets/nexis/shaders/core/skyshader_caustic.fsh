#version 150

layout(std140) uniform uTime {
    float time;
};
layout(std140) uniform uResolution {
    vec2 resolution;
};
layout(std140) uniform uColor {
    vec3 tintColor;
};
layout(std140) uniform uParams {
    vec4 params;
};
layout(std140) uniform uCamera {
    vec4 cameraData;
};

out vec4 fragColor;

#define MAX_ITER 4

mat3 rotX(float a) {
    float c = cos(a), s = sin(a);
    return mat3(1.0, 0.0, 0.0,
                0.0,   c,   s,
                0.0,  -s,   c);
}

mat3 rotY(float a) {
    float c = cos(a), s = sin(a);
    return mat3(  c, 0.0,   s,
                0.0, 1.0, 0.0,
                 -s, 0.0,   c);
}

void main() {
    float alpha = params.x;
    float speed = params.y;
    float scale = params.z;
    float intensity = params.w;
    vec2 cameraDir = cameraData.xy;
    float fov = cameraData.z;

    vec2 uv = gl_FragCoord.xy / resolution.xy;
    vec2 sp = uv * 2.0 - 1.0;
    float aspect = resolution.x / resolution.y;

    float tanV = tan(radians(fov) * 0.5);
    vec3 rayV = normalize(vec3(sp.x * tanV * aspect, sp.y * tanV, 1.0));
    vec3 rayW = rotY(cameraDir.x) * rotX(cameraDir.y) * rayV;

    vec3 p = rayW * scale;
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
