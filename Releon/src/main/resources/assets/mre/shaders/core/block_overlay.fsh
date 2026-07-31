#version 150

uniform float Time;
uniform float Speed;
uniform float Intensity;
uniform float Alpha;
uniform vec3 BaseColor;

in vec2 TexCoord;
out vec4 OutColor;

void main() {
    float time = Time * Speed;
    vec2 uv = TexCoord;

    vec3 base = BaseColor * 0.78;
    vec3 glow = mix(BaseColor, vec3(1.0), 0.35);
    vec3 color = base;

    float wave = sin((uv.x + uv.y) * 8.0 - time * 2.0) * 0.5 + 0.5;
    wave = pow(wave, 3.0);

    float edge = 1.0 - min(min(uv.x, 1.0 - uv.x), min(uv.y, 1.0 - uv.y)) * 2.0;
    edge = pow(clamp(edge, 0.0, 1.0), 4.0);

    float pulse = sin(time * 1.5) * 0.5 + 0.5;

    float vertical = smoothstep(0.0, 1.0, uv.y);

    color = mix(color, glow, wave * 0.35 * Intensity);
    color = mix(color, vec3(1.0), wave * 0.18 * Intensity);
    color += BaseColor * edge * 0.35 * Intensity;
    color *= 0.92 + pulse * 0.08;
    color *= 0.85 + vertical * 0.25;

    float finalAlpha = clamp(Alpha * (0.9 + edge * 0.1), 0.0, 1.0);

    OutColor = vec4(clamp(color, 0.0, 1.0), finalAlpha);
}