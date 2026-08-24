#version 150

uniform sampler2D PreviousTex;
uniform sampler2D HandTex;
uniform sampler2D MaskTex;
uniform vec2 TexelSize;
uniform float Time;
uniform float Decay;
uniform float Intensity;
uniform float Lift;
uniform float Turbulence;
uniform float Alpha;
uniform float EmitStrength;
uniform vec4 ColorHot;
uniform vec4 ColorMid;
uniform vec4 ColorEdge;
uniform vec4 ColorSmoke;

in vec2 TexCoord;
out vec4 fragColor;

float hash(vec2 p) {
    return fract(sin(dot(p, vec2(127.1, 311.7))) * 43758.5453);
}

float noise(vec2 p) {
    vec2 i = floor(p), f = fract(p);
    vec2 u = f * f * (3.0 - 2.0 * f);
    return mix(mix(hash(i), hash(i + vec2(1.0, 0.0)), u.x),
               mix(hash(i + vec2(0.0, 1.0)), hash(i + vec2(1.0, 1.0)), u.x), u.y);
}

vec3 ramp(float t) {
    t = clamp(t, 0.0, 1.0);
    vec3 c = mix(ColorEdge.rgb, ColorMid.rgb, smoothstep(0.05, 0.55, t));
    return mix(c, ColorHot.rgb, smoothstep(0.55, 0.95, t));
}

void main() {
    vec2 uv = TexCoord;

    float n = noise(uv * 6.0 + vec2(0.0, -Time * 2.4)) - 0.5;
    vec2 suv = uv + vec2(n * Turbulence * 8.0, Lift * 2.5) * TexelSize;
    // Keep the feedback pass bounded even when the UI value is set to 1.00.
    // Without a small guaranteed decay, every frame adds another copy of the
    // hand mask until the fire texture saturates to an opaque white shape.
    vec3 prev = texture(PreviousTex, suv).rgb * min(clamp(Decay, 0.0, 1.0), 0.985);

    float mask = texture(MaskTex, uv).r;
    vec3 hand = texture(HandTex, uv).rgb;
    float emit = max(max(hand.r, hand.g), hand.b) * mask;

    float heat = clamp(n * 0.35 + emit * Intensity, 0.0, 1.0);
    vec3 fire = ramp(clamp(prev.r + heat * 0.9, 0.0, 1.0));

    float source = clamp(emit * EmitStrength * Intensity, 0.0, 1.0);
    float blend = source * (0.18 + 0.32 * source);
    vec3 target = fire * (0.35 + 0.65 * emit);
    vec3 col = clamp(mix(prev, target, blend), 0.0, 1.0);

    float energy = clamp(max(max(col.r, col.g), col.b) * Alpha, 0.0, 1.0);
    vec3 smoke = ColorSmoke.rgb * clamp(energy, 0.0, 1.0) * 0.25;
    col = mix(col, col + smoke, 0.35);

    fragColor = vec4(col, energy);
}
