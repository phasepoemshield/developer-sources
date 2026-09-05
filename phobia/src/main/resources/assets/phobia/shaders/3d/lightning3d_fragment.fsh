#version 410 core

in vec4 vColor;
in vec2 vUV;

out vec4 fragColor;

void main() {
    float distanceFromCore = abs(vUV.y);
    float core = 1.0 - smoothstep(0.025, 0.105, distanceFromCore);
    float inner = exp(-distanceFromCore * distanceFromCore * 14.0);
    float halo = exp(-distanceFromCore * distanceFromCore * 2.15);
    float energy = (core * 0.76 + inner * 0.23 + halo * 0.34) * vColor.a;
    if (energy < 0.003) discard;

    vec3 lightningColor = mix(vColor.rgb, vec3(1.0), core * 0.94 + inner * 0.24);
    fragColor = vec4(lightningColor * energy, energy * 0.86);
}
