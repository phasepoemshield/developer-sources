#version 150

uniform sampler2D Sampler0;
uniform sampler2D Sampler1;
uniform vec2 texelSize;
uniform vec3 color;
uniform vec3 color2;
uniform float time;
uniform float alpha;
uniform float swing;
uniform float scale;
uniform float speed;

in vec2 TexCoord;
out vec4 OutColor;

float sampleMask(sampler2D sampler, vec2 uv) {
    return texture(sampler, clamp(uv, vec2(0.0), vec2(1.0))).a;
}

float blurMask(sampler2D sampler, vec2 uv, float radius) {
    vec2 stepv = texelSize * max(radius, 0.5);
    float sum = sampleMask(sampler, uv) * 2.2;
    sum += sampleMask(sampler, uv + vec2(stepv.x, 0.0));
    sum += sampleMask(sampler, uv - vec2(stepv.x, 0.0));
    sum += sampleMask(sampler, uv + vec2(0.0, stepv.y));
    sum += sampleMask(sampler, uv - vec2(0.0, stepv.y));
    sum += sampleMask(sampler, uv + stepv) * 0.8;
    sum += sampleMask(sampler, uv - stepv) * 0.8;
    sum += sampleMask(sampler, uv + vec2(stepv.x, -stepv.y)) * 0.8;
    sum += sampleMask(sampler, uv + vec2(-stepv.x, stepv.y)) * 0.8;
    return sum / 7.4;
}

void main() {
    vec2 uv = TexCoord;
    float current = sampleMask(Sampler1, uv);
    float trail = sampleMask(Sampler0, uv);

    float inner = smoothstep(0.03, 0.24, current);
    float outsideMask = 1.0 - inner;

    vec2 dir = normalize(vec2(0.82, -0.58));
    float sway = sin(time * speed * 2.4 + uv.y * 16.0) * (0.12 + swing * 0.22);
    dir = normalize(vec2(dir.x + sway * 0.35, dir.y - sway * 0.18));

    float quietReach = (11.0 + scale * 7.0);
    float hitReach = quietReach + swing * (18.0 + scale * 9.0);

    float quietGhost = 0.0;
    float hitGhost = 0.0;
    float historyGhost = 0.0;

    for (int i = 0; i < 8; i++) {
        float t = float(i) / 7.0;
        vec2 offset = dir * texelSize * quietReach * t;
        offset += vec2(
            sin(time * speed * 1.8 + t * 4.0) * texelSize.x * (1.0 + scale * 0.8),
            cos(time * speed * 1.5 + t * 3.3) * texelSize.y * (0.7 + scale * 0.5)
        );
        float ghost = sampleMask(Sampler1, uv - offset);
        quietGhost = max(quietGhost, ghost * (1.0 - t * 0.55));
    }

    for (int i = 0; i < 13; i++) {
        float t = float(i) / 12.0;
        vec2 offset = dir * texelSize * hitReach * t;
        offset += vec2(
            sin(time * speed * 3.1 + t * 7.0) * texelSize.x * (1.2 + swing * 5.0),
            cos(time * speed * 2.4 + t * 8.0) * texelSize.y * (0.8 + swing * 3.6)
        );

        float hist = sampleMask(Sampler0, uv - offset);
        float curr = sampleMask(Sampler1, uv - offset * 0.82);
        historyGhost = max(historyGhost, hist * (1.0 - t * 0.35));
        hitGhost = max(hitGhost, curr * (1.0 - t * 0.5));
    }

    float auraWide = max(blurMask(Sampler1, uv, 3.4), blurMask(Sampler0, uv, 4.2));
    float auraTight = max(blurMask(Sampler1, uv, 1.8), blurMask(Sampler0, uv, 2.2));
    float rim = max(auraTight - current * 0.90, 0.0);

    quietGhost = max(quietGhost - current * 0.96, 0.0);
    hitGhost = max(hitGhost - current * 0.96, 0.0);
    historyGhost = max(historyGhost - current * 0.94, 0.0);
    float aura = max(auraWide - current * 0.72, 0.0);

    float pulse = 0.5 + 0.5 * sin(time * speed * 2.0 + uv.y * 9.0);
    float colorMix = clamp(0.22 + uv.y * 0.36 + pulse * 0.16 + swing * 0.18, 0.0, 1.0);
    vec3 theme = mix(color, color2, colorMix);
    vec3 hot = mix(theme, vec3(1.0), 0.35);

    float quietAmount = quietGhost * (0.72 + scale * 0.08);
    float hitAmount = max(historyGhost, hitGhost) * (0.72 + swing * 0.45);
    float auraAmount = aura * (0.50 + pulse * 0.18);
    float rimAmount = rim * (0.82 + swing * 0.20);

    float finalAlpha = (quietAmount + hitAmount + auraAmount + rimAmount * 0.58) * outsideMask * alpha;
    if (finalAlpha <= 0.001) discard;

    vec3 finalColor = theme * (quietAmount + auraAmount * 0.82 + hitAmount * 0.86);
    finalColor += hot * rimAmount * 0.46;
    finalColor += mix(color2, vec3(1.0), 0.25) * historyGhost * swing * 0.18;

    OutColor = vec4(finalColor * finalAlpha, finalAlpha);
}
