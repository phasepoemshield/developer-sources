#version 330

layout(std140) uniform Globals {
    ivec3 CameraBlockPos;
    vec3 CameraOffset;
    vec2 ScreenSize;
    float GlintAlpha;
    float GameTime;
    int MenuBlurRadius;
    int UseRgss;
};

uniform sampler2D Sampler0;

in vec4 vColor1;
in vec3 vColor2;
in float vSpeed;
in float vFill;
in vec2 vTexCoord;
in vec3 vViewPos;
in vec3 vNormal;

out vec4 fragColor;

void main() {
    vec4 tex = texture(Sampler0, vTexCoord);
    if (tex.a < 0.05) discard;

    float time = GameTime * 1200.0 * vSpeed;

    // UV coordinates are attached to the entity model. Unlike view-space
    // position, they do not change when the player rotates the camera.
    float modelPhase = vTexCoord.x * 11.0 + vTexCoord.y * 7.0;
    float wave = 0.5 + 0.5 * sin(time * 2.0 + modelPhase);
    vec3 col = mix(vColor1.rgb, vColor2, wave);

    float lum = dot(tex.rgb, vec3(0.299, 0.587, 0.114));
    col *= mix(0.55 + 0.75 * lum, 1.0, vFill);

    // Keep a soft glow without the camera-facing rim term which made Chams
    // visibly slide while the view rotated.
    col += mix(vColor1.rgb, vColor2, 1.0 - wave) * 0.12;

    fragColor = vec4(col, vColor1.a * tex.a);
}
