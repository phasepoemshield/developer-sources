#version 150

uniform sampler2D Sampler0;
uniform sampler2D Sampler1;
uniform sampler2D Sampler2;
uniform sampler2D Sampler3;
uniform vec2 texelSize;

in vec2 TexCoord;
out vec4 OutColor;

float depthDiff(vec2 uv) {
    float depthBefore = texture(Sampler2, uv).r;
    float depthAfter = texture(Sampler3, uv).r;
    return step(0.0001, depthBefore - depthAfter);
}

void main() {
    vec2 uv = TexCoord;
    vec2 stepv = texelSize;
    float center = depthDiff(uv);
    float sum = 0.0;
    sum += depthDiff(uv + vec2(stepv.x, 0.0));
    sum += depthDiff(uv - vec2(stepv.x, 0.0));
    sum += depthDiff(uv + vec2(0.0, stepv.y));
    sum += depthDiff(uv - vec2(0.0, stepv.y));
    sum += depthDiff(uv + stepv);
    sum += depthDiff(uv - stepv);
    sum += depthDiff(uv + vec2(stepv.x, -stepv.y));
    sum += depthDiff(uv + vec2(-stepv.x, stepv.y));

    // Slightly erode the outer silhouette so the shader does not paint over the darkest edge pixels.
    float support = sum / 8.0;
    float result = center * smoothstep(0.30, 0.75, support);
    OutColor = vec4(result, result, result, result);
}
