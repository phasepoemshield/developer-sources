#version 150

uniform sampler2D Sampler0;
uniform sampler2D Sampler1;
uniform vec2 texelSize;
uniform vec3 color;
uniform vec3 color2;
uniform float time;

uniform float speed;
uniform float scale;
uniform float outline;
uniform float glow;
uniform float fill;
uniform float alpha;
uniform float outlineOnly;
uniform vec2 CameraDir;
uniform vec3 BlockPos;
uniform vec3 CameraPos;
uniform mat4 InvViewProj;

in vec2 TexCoord;
out vec4 OutColor;

float sampleMask(vec2 uv) {
    return texture(Sampler0, uv).a;
}

mat2 rot(float a) {
    float s = sin(a);
    float c = cos(a);
    return mat2(c, -s, s, c);
}

float hash(vec2 p) {
    p = fract(p * vec2(123.34, 345.45));
    p += dot(p, p + 34.345);
    return fract(p.x * p.y);
}

float noise(vec2 p) {
    vec2 i = floor(p);
    vec2 f = fract(p);
    f = f * f * (3.0 - 2.0 * f);

    float a = hash(i);
    float b = hash(i + vec2(1.0, 0.0));
    float c = hash(i + vec2(0.0, 1.0));
    float d = hash(i + vec2(1.0, 1.0));

    return mix(mix(a, b, f.x), mix(c, d, f.x), f.y);
}

float fbm(vec2 p) {
    float value = 0.0;
    float amplitude = 0.55;
    for (int i = 0; i < 5; i++) {
        value += noise(p) * amplitude;
        p = rot(0.34) * p * 2.02 + vec2(4.7, 2.3);
        amplitude *= 0.5;
    }
    return value;
}

float edgeMetric(vec2 uv, float radius) {
    vec2 stepv = texelSize * max(radius, 0.001);
    float c = sampleMask(uv);
    float axis = 0.0;
    axis += abs(c - sampleMask(uv + vec2(stepv.x, 0.0)));
    axis += abs(c - sampleMask(uv - vec2(stepv.x, 0.0)));
    axis += abs(c - sampleMask(uv + vec2(0.0, stepv.y)));
    axis += abs(c - sampleMask(uv - vec2(0.0, stepv.y)));

    float diag = 0.0;
    diag += abs(c - sampleMask(uv + stepv));
    diag += abs(c - sampleMask(uv - stepv));
    diag += abs(c - sampleMask(uv + vec2(stepv.x, -stepv.y)));
    diag += abs(c - sampleMask(uv + vec2(-stepv.x, stepv.y)));

    return clamp(axis * 0.22 + diag * 0.12, 0.0, 1.0);
}

float blurredMask(vec2 uv, float radius) {
    vec2 stepv = texelSize * radius;
    float sum = sampleMask(uv) * 2.0;
    sum += sampleMask(uv + vec2(stepv.x, 0.0));
    sum += sampleMask(uv - vec2(stepv.x, 0.0));
    sum += sampleMask(uv + vec2(0.0, stepv.y));
    sum += sampleMask(uv - vec2(0.0, stepv.y));
    sum += sampleMask(uv + stepv) * 0.7;
    sum += sampleMask(uv - stepv) * 0.7;
    sum += sampleMask(uv + vec2(stepv.x, -stepv.y)) * 0.7;
    sum += sampleMask(uv + vec2(-stepv.x, stepv.y)) * 0.7;
    return sum / 7.8;
}

void main() {
    vec2 uv = TexCoord;
    float mask = sampleMask(uv);
    if (mask <= 0.0) discard;

    float outlineEnabled = step(0.001, outline);
    float edge = outlineEnabled * smoothstep(0.03, 0.27, edgeMetric(uv, max(outline, 0.001)));
    float edgeWide = outlineEnabled * smoothstep(0.01, 0.19, edgeMetric(uv, outline * 2.2 + 0.9));
    float edgeFine = outlineEnabled * smoothstep(0.07, 0.36, edgeMetric(uv, outline * 0.78 + 0.2));
    float inner = clamp(blurredMask(uv, outline * 2.0 + 1.0), 0.0, 1.0);
    float body = smoothstep(0.16, 0.97, inner) * mix(1.0, 1.0 - edge * 0.82, outlineEnabled);

    float t = time * max(speed, 0.001);
    float patternScale = mix(1.25, 3.05, clamp((scale - 1.0) / 2.0, 0.0, 1.0));

    float fragDepth = texture(Sampler1, uv).r;
    vec4 clip = vec4(uv * 2.0 - 1.0, fragDepth * 2.0 - 1.0, 1.0);
    vec4 worldH = InvViewProj * clip;
    vec3 worldPos;
    if (abs(worldH.w) < 1e-6) {

        worldPos = vec3(uv * 100.0, 0.0);
    } else {
        worldPos = (worldH.xyz / worldH.w) + CameraPos;
    }

    vec2 p = vec2(worldPos.x + worldPos.z * 0.5, worldPos.y + worldPos.z * 0.31);
    p *= patternScale * 0.55;

    vec2 flow = p;
    flow += (vec2(
        fbm(rot(0.28) * (p * 0.88 + vec2(t * 0.08, -t * 0.12))),
        fbm(rot(-0.44) * (p * 0.94 + vec2(-t * 0.05, t * 0.09)))
    ) - 0.5) * 0.85;

    float auroraA = 0.5 + 0.5 * sin(flow.y * 3.8 + flow.x * 0.9 - t * 0.70);
    float auroraB = 0.5 + 0.5 * sin(flow.y * 5.4 - flow.x * 1.15 + t * 0.56);
    float auroraC = 0.5 + 0.5 * sin(flow.y * 2.6 + flow.x * 1.45 - t * 0.38);

    float curtain = smoothstep(0.50, 0.98, auroraA) * 0.72
                  + smoothstep(0.60, 1.0, auroraB) * 0.44
                  + auroraC * 0.16;

    float mist = fbm(flow * 0.82 + vec2(t * 0.03, -t * 0.02));
    float depth = fbm(rot(0.82) * flow * 1.26 - vec2(t * 0.02, t * 0.04));
    float wave = 0.5 + 0.5 * sin(length(flow) * 3.6 - t * 0.42);

    float softness = clamp(mist * 0.52 + depth * 0.28 + wave * 0.14, 0.0, 1.0);
    float glowField = clamp(curtain * 0.92 + softness * 0.40, 0.0, 1.0);
    float colorMix = clamp(0.22 + glowField * 0.58 + depth * 0.14, 0.0, 1.0);

    vec3 baseColor = mix(color, color2, colorMix);
    vec3 softColor = mix(baseColor, vec3(1.0), 0.12 + curtain * 0.11);
    vec3 rimColor = mix(color, color2, clamp(0.44 + curtain * 0.42 + mist * 0.10, 0.0, 1.0));

    if (outlineOnly > 0.5) {
        float lineAlpha = clamp(alpha * edge * (0.92 + glow * 0.24 + curtain * 0.14), 0.0, 1.0) * mask;
        if (lineAlpha <= 0.001) discard;
        OutColor = vec4(mix(rimColor, softColor, 0.18), lineAlpha);
        return;
    }

    float fillAlpha = alpha * fill * body * (0.24 + softness * 0.26 + curtain * 0.24);
    float mistAlpha = alpha * body * (0.095 + mist * 0.075 + wave * 0.045);
    float ribbonAlpha = alpha * body * curtain * 0.24;
    float rimAlpha = alpha * edge * (0.42 + glow * 0.22 + curtain * 0.18);
    float haloAlpha = alpha * edgeWide * glow * (0.12 + curtain * 0.10) * (1.0 - edge * 0.52);
    float fineAlpha = alpha * edgeFine * curtain * 0.12;

    vec3 rgb = baseColor * (fillAlpha * 1.12);
    rgb += softColor * mistAlpha;
    rgb += mix(baseColor, softColor, 0.62) * ribbonAlpha;
    rgb += rimColor * rimAlpha;
    rgb += mix(rimColor, softColor, 0.42) * haloAlpha;
    rgb += mix(baseColor, rimColor, 0.58) * fineAlpha;

    float outAlpha = clamp(fillAlpha + mistAlpha + ribbonAlpha + rimAlpha + haloAlpha + fineAlpha, 0.0, 1.0) * mask;
    if (outAlpha <= 0.001) discard;

    OutColor = vec4(rgb, outAlpha);
}
