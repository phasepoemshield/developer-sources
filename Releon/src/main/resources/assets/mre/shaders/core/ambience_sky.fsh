#version 150

uniform float Time;
uniform float Speed;
uniform float Intensity;
uniform vec3 BaseColor;

in vec3 SkyDirection;
out vec4 OutColor;

float hash31(vec3 p) {
    p = fract(p * 0.1031);
    p += dot(p, p.yzx + 33.33);
    return fract((p.x + p.y) * p.z);
}

float noise3(vec3 p) {
    vec3 cell = floor(p);
    vec3 local = fract(p);
    local = local * local * (3.0 - 2.0 * local);

    float n000 = hash31(cell + vec3(0.0, 0.0, 0.0));
    float n100 = hash31(cell + vec3(1.0, 0.0, 0.0));
    float n010 = hash31(cell + vec3(0.0, 1.0, 0.0));
    float n110 = hash31(cell + vec3(1.0, 1.0, 0.0));
    float n001 = hash31(cell + vec3(0.0, 0.0, 1.0));
    float n101 = hash31(cell + vec3(1.0, 0.0, 1.0));
    float n011 = hash31(cell + vec3(0.0, 1.0, 1.0));
    float n111 = hash31(cell + vec3(1.0, 1.0, 1.0));

    float nx00 = mix(n000, n100, local.x);
    float nx10 = mix(n010, n110, local.x);
    float nx01 = mix(n001, n101, local.x);
    float nx11 = mix(n011, n111, local.x);
    return mix(mix(nx00, nx10, local.y), mix(nx01, nx11, local.y), local.z);
}

float fbm(vec3 p) {
    float val = 0.0;
    float amplitude = 0.55;
    for (int i = 0; i < 5; i++) {
        val += noise3(p) * amplitude;
        p = p * 2.03 + vec3(1.7, -2.1, 0.8);
        amplitude *= 0.5;
    }
    return val;
}

void main() {
    vec3 dir = normalize(SkyDirection);
    float time = Time * Speed;

    vec3 flow = dir * 2.6;
    flow += vec3(time * 0.055, -time * 0.025, time * 0.04);

    float broad = fbm(flow * 1.15);
    vec3 warped = flow + vec3(
        broad * 1.4,
        fbm(flow * 0.85 + 7.2) * 0.8,
        fbm(flow * 0.95 - 4.6) * 1.2
    );

    float detail = fbm(warped * 1.75 + vec3(-time * 0.08, time * 0.035, time * 0.06));
    float ribbonPhase = warped.y * 4.2 + warped.x * 1.35 - warped.z * 1.1;
    ribbonPhase += detail * 6.0 - time * 0.55;

    float ribbon = 1.0 - abs(sin(ribbonPhase));
    ribbon = pow(clamp(ribbon, 0.0, 1.0), 3.4);

    float secondary = 1.0 - abs(sin(
        warped.y * 6.5 - warped.x * 1.8 + broad * 7.5 + time * 0.32
    ));
    secondary = pow(clamp(secondary, 0.0, 1.0), 5.0);

    float cloud = smoothstep(0.28, 0.82, detail);
    float valleys = 1.0 - smoothstep(0.18, 0.68, broad);
    float waveLight = clamp(ribbon * 0.88 + secondary * 0.42, 0.0, 1.0);

    vec3 Color1 = BaseColor * 0.12;
    vec3 Color2 = BaseColor * (0.42 + cloud * 0.48);
    vec3 Mix1 = mix(BaseColor, vec3(1.0), 0.58);

    vec3 color = mix(Color1, Color2, cloud);
    color *= 0.68 + valleys * 0.48;
    color = mix(color, Mix1, waveLight * 0.72 * Intensity);

    float horizonGlow = pow(clamp(1.0 - abs(dir.y), 0.0, 1.0), 3.0);
    color += BaseColor * horizonGlow * 0.12 * Intensity;

    float starNoise = hash31(floor(dir * 950.0));
    float stars = step(0.9984, starNoise) * smoothstep(0.05, 0.55, dir.y);
    vec3 starColor = mix(BaseColor, vec3(1.0), 0.78);
    color += starColor * stars * 0.65;

    color *= mix(0.72, 1.25, clamp(Intensity, 0.0, 2.5) / 2.5);
    OutColor = vec4(clamp(color, 0.0, 1.0), 1.0);
}
