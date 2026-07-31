#version 120

uniform vec2 resolution;
uniform vec2 position;
uniform vec2 size;
uniform float thickness;
uniform vec4 color;

void main() {
    vec2 uv = gl_FragCoord.xy / resolution.xy;
    vec2 center = (position + size * 0.5) / resolution.xy;
    vec2 pixel = 1.0 / resolution.xy;
    
    // Вычисляем расстояние от границ
    vec2 dist = abs(uv - center) - (size * 0.5) / resolution.xy;
    float outsideDist = length(max(dist, vec2(0.0)));
    float insideDist = min(max(dist.x, dist.y), 0.0);
    float borderDist = outsideDist + insideDist;
    
    // Создаем контур
    float thicknessPixels = thickness * pixel.x;
    float alpha = 1.0 - smoothstep(0.0, thicknessPixels, borderDist * resolution.x);
    
    gl_FragColor = vec4(color.rgb, color.a * alpha);
} 