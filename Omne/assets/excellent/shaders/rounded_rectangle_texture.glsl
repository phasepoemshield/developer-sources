#version 120

uniform sampler2D texture;
uniform vec2 resolution;
uniform vec2 position;
uniform vec2 size;
uniform float radius;
uniform vec4 color;

varying vec2 texCoord;

void main() {
    vec2 uv = gl_FragCoord.xy / resolution.xy;
    vec2 center = (position + size * 0.5) / resolution.xy;
    vec2 pixel = 1.0 / resolution.xy;
    
    // Вычисляем расстояние от центра
    vec2 dist = abs(uv - center) - (size * 0.5 - radius * pixel) / resolution.xy;
    float outsideDist = length(max(dist, vec2(0.0)));
    float insideDist = min(max(dist.x, dist.y), 0.0);
    float roundedDist = outsideDist + insideDist;
    
    // Создаем скругленные углы
    float alpha = 1.0 - smoothstep(0.0, 1.0, roundedDist * resolution.x / (radius * pixel.x));
    
    // Получаем цвет текстуры
    vec4 texColor = texture2D(texture, texCoord);
    
    // Применяем цвет и прозрачность
    gl_FragColor = vec4(texColor.rgb * color.rgb, texColor.a * color.a * alpha);
} 