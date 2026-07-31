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

float edgeMetric(vec2 uv, float radius) {
    vec2 stepv = texelSize * max(radius, 0.001);
    float c = sampleMask(uv);
    float axis = 0.0;
    axis += abs(c - sampleMask(uv + vec2(stepv.x, 0.0)));
    axis += abs(c - sampleMask(uv - vec2(stepv.x, 0.0)));
    axis += abs(c - sampleMask(uv + vec2(0.0, stepv.y)));
    axis += abs(c - sampleMask(uv - vec2(0.0, stepv.y)));
    return clamp(axis * 0.35, 0.0, 1.0);
}

void mainImage(out vec4 o, vec2 u, vec2 resolution, float currentTime) {
    vec2 v = resolution;
    u = 0.2 * (u + u - v) / v.y;
    vec4 z = o = vec4(1.0, 2.0, 3.0, 0.0);

    for (float a = 0.5, t = currentTime, i = 0.0; ++i < 19.0;
         o += (1.0 + cos(z + t))
            / length((1.0 + i * dot(v, v))
                   * sin(1.5 * u / (0.5 - dot(u, u)) - 9.0 * u.yx + t))) {
        v = cos(++t - 7.0 * u * pow(a += 0.03, i)) - 5.0 * u;
        mat2 m = mat2(
            cos(i + 0.02 * t - z.w * 11.0), cos(i + 0.02 * t - z.x * 11.0),
            cos(i + 0.02 * t - z.z * 11.0), cos(i + 0.02 * t - z.w * 11.0)
        );
        u = m * u;
        vec2 swirl = tanh(40.0 * dot(u, u) * cos(100.0 * u.yx + t)) / 200.0;
        u += swirl
           + 0.2 * a * u
           + cos(4.0 / exp(dot(o, o) / 100.0) + t) / 300.0;
    }

    o = 25.6 / (min(o, 13.0) + 164.0 / o) - dot(u, u) / 250.0;
}

void main() {
    float mask = sampleMask(TexCoord);
    if (mask <= 0.001) discard;

    vec2 resolution = 1.0 / max(texelSize, vec2(0.00001));

    float depth = texture(Sampler1, TexCoord).r;
    vec4 clip = vec4(TexCoord * 2.0 - 1.0, depth * 2.0 - 1.0, 1.0);
    vec4 worldH = InvViewProj * clip;
    vec3 worldPos;
    if (abs(worldH.w) < 1e-6) {
        worldPos = vec3(TexCoord * 100.0, 0.0);
    } else {
        worldPos = (worldH.xyz / worldH.w) + CameraPos;
    }
    vec2 worldUV = vec2(worldPos.x + worldPos.z * 0.5, worldPos.y + worldPos.z * 0.31);
    vec2 fragCoord = worldUV * resolution.y * 0.15;
    vec2 centered = (TexCoord - 0.5) * vec2(resolution.x / resolution.y, 1.0);
    float edgeFade = smoothstep(0.0, 0.25, 1.0 - length(centered) * 0.75);
    float outlineEnabled = step(0.001, outline);
    float edge = outlineEnabled * smoothstep(0.025, 0.22, edgeMetric(TexCoord, max(outline, 0.35)));

    vec4 fractal;
    mainImage(fractal, fragCoord * max(scale, 0.35), resolution, time * max(speed, 0.001));

    vec3 rgb = max(fractal.rgb, vec3(0.0));
    vec3 outlineColor = mix(color, color2, 0.5);
    float energy = clamp(dot(rgb, vec3(0.2126, 0.7152, 0.0722)) * 0.55, 0.0, 1.0);
    vec3 finalRgb = rgb * fill + outlineColor * edge * (0.22 + energy * 0.35);
    float outAlpha = clamp((0.18 + energy * 0.82 + edge * 0.25 * outlineEnabled) * fill * alpha * edgeFade, 0.0, 1.0) * mask;

    if (outAlpha <= 0.001) discard;
    OutColor = vec4(finalRgb, outAlpha);
}
