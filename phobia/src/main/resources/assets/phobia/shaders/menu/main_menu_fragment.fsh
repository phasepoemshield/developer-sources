#version 150

in vec2 texCoord;
out vec4 fragColor;

layout(std140) uniform MenuData {
    vec4 viewportData;
    vec4 effectData;
};

float rayStrength(vec2 raySource, vec2 rayRefDirection, vec2 coord,
        float seedA, float seedB, float speed) {
    vec2 sourceToCoord = coord - raySource;
    float cosAngle = dot(normalize(sourceToCoord), rayRefDirection);
    float time = effectData.x;
    return clamp(
            (0.45 + 0.15 * sin(cosAngle * seedA + time * speed))
            + (0.3 + 0.2 * cos(-cosAngle * seedB + time * speed)),
            0.0, 1.0)
            * clamp((viewportData.x - length(sourceToCoord)) / viewportData.x, 0.5, 1.0);
}

float bubbleStrength(vec2 startPos, vec2 waveOffset, float radius,
        float speed, vec2 coord) {
    vec2 curPos = vec2(
            mod(startPos.x + waveOffset.x * 0.5, viewportData.x + radius * 2.0) - radius,
            mod(waveOffset.y - effectData.x * speed, viewportData.y + radius * 2.0) - radius);
    return 1.0 - smoothstep(0.0, radius, length(coord - curPos));
}

void main() {
    vec2 fragCoord = gl_FragCoord.xy;
    vec2 uv = fragCoord / viewportData.xy;
    uv.y = 1.0 - uv.y;
    vec2 coord = vec2(fragCoord.x, viewportData.y - fragCoord.y);
    float time = effectData.x;

    float offsetX = (0.1112 * viewportData.x * cos(1.44125 * (time + uv.y)))
            + (26.77311 * time);
    float offsetY = 0.08447 * viewportData.y * sin(2.14331 * (time + uv.x));

    vec2 rayPos1 = vec2(viewportData.x * 0.7, viewportData.y * -0.4);
    vec2 rayRefDir1 = normalize(vec2(1.0, -0.116));
    vec2 rayPos2 = vec2(viewportData.x * 0.8, viewportData.y * -0.6);
    vec2 rayRefDir2 = normalize(vec2(1.0, 0.241));

    vec4 rays1 = vec4(1.0) * rayStrength(
            rayPos1, rayRefDir1, coord, 36.2214, 21.11349, 1.5);
    vec4 rays2 = vec4(1.0) * rayStrength(
            rayPos2, rayRefDir2, coord, 22.39910, 18.0234, 1.1);

    float bubbleScale = viewportData.x / 600.0;
    vec4 bubble1 = vec4(1.0) * bubbleStrength(vec2(0.0),
            vec2(offsetX * 0.2312, 0.0), 20.0 * bubbleScale, 60.0, coord);
    vec4 bubble2 = vec4(1.0) * bubbleStrength(vec2(40.0, 400.0),
            vec2(offsetX * -0.06871, offsetY * 0.301), 7.0 * bubbleScale, 25.0, coord);
    vec4 bubble3 = vec4(1.0) * bubbleStrength(vec2(300.0, 70.0),
            vec2(offsetX * 0.19832, offsetY * 0.1351), 14.0 * bubbleScale, 45.0, coord);
    vec4 bubble4 = vec4(1.0) * bubbleStrength(vec2(500.0, 280.0),
            vec2(offsetX * -0.0993, offsetY * -0.2654), 12.0 * bubbleScale, 32.0, coord);
    vec4 bubble5 = vec4(1.0) * bubbleStrength(vec2(400.0, 140.0),
            vec2(offsetX * 0.2231, offsetY * 0.0111), 10.0 * bubbleScale, 28.0, coord);
    vec4 bubble6 = vec4(1.0) * bubbleStrength(vec2(200.0, 360.0),
            vec2(offsetX * 0.0693, offsetY * -0.3567), 5.0 * bubbleScale, 12.0, coord);
    vec4 bubble7 = vec4(1.0) * bubbleStrength(vec2(0.0),
            vec2(offsetX * -0.32301, offsetY * 0.2349), 16.0 * bubbleScale, 51.0, coord);
    vec4 bubble8 = vec4(1.0) * bubbleStrength(vec2(130.0, 23.0),
            vec2(offsetX * 0.1393, offsetY * -0.4013), 8.0 * bubbleScale, 24.0, coord);

    vec4 color = rays1 * 0.5 + rays2 * 0.4
            + bubble1 * 0.25 + bubble2 * 0.1 + bubble3 * 0.18 + bubble4 * 0.13
            + bubble5 * 0.15 + bubble6 * 0.05 + bubble7 * 0.12 + bubble8 * 0.11;

    float brightness = 1.0 - (coord.y / viewportData.y);
    color.r *= 0.2 + brightness * 0.8;
    color.g *= 0.3 + brightness * 0.7;
    color.b *= 0.4 + brightness * 0.6;
    fragColor = vec4(color.rgb, 1.0);
}
