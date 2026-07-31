#version 120

uniform vec2 resolution;
uniform vec2 position;
uniform vec2 size;
uniform float radius;
uniform vec4 color1;
uniform vec4 color2;
uniform vec4 color3;
uniform vec4 color4;

void main() {
    vec2 uv = gl_FragCoord.xy;
    vec2 rectMin = position;
    vec2 rectMax = position + size;
    
    // Проверяем, находится ли пиксель в пределах прямоугольника
    if (uv.x < rectMin.x || uv.x > rectMax.x || uv.y < rectMin.y || uv.y > rectMax.y) {
        discard;
    }
    
    // Вычисляем расстояние от углов для скругления
    vec2 corner = vec2(0.0);
    if (uv.x < rectMin.x + radius) corner.x = rectMin.x + radius - uv.x;
    if (uv.x > rectMax.x - radius) corner.x = uv.x - (rectMax.x - radius);
    if (uv.y < rectMin.y + radius) corner.y = rectMin.y + radius - uv.y;
    if (uv.y > rectMax.y - radius) corner.y = uv.y - (rectMax.y - radius);
    
    // Если мы в углу, проверяем расстояние от центра угла
    if (corner.x > 0.0 && corner.y > 0.0) {
        float dist = length(corner);
        if (dist > radius) {
            discard;
        }
    }
    
    // Вычисляем градиент
    vec2 localUV = (uv - rectMin) / size;
    vec4 gradient = mix(mix(color1, color2, localUV.x), mix(color3, color4, localUV.x), localUV.y);
    
    gl_FragColor = gradient;
} 