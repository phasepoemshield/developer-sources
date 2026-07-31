#version 120

uniform sampler2D texture;
uniform vec2 resolution;
uniform vec2 position;
uniform vec2 size;
uniform float start;
uniform float end;
uniform vec4 color;

varying vec2 texCoord;

void main() {
    vec2 uv = gl_FragCoord.xy / resolution.xy;
    vec2 center = (position + size * 0.5) / resolution.xy;
    vec2 pixel = 1.0 / resolution.xy;
    
    // Проверяем, находится ли пиксель в пределах подстроки
    float localX = (uv.x - center.x) / (size.x * 0.5 / resolution.x);
    float normalizedX = (localX + 1.0) * 0.5;
    
    if (normalizedX >= start && normalizedX <= end) {
        // Получаем цвет текстуры
        vec4 texColor = texture2D(texture, texCoord);
        gl_FragColor = vec4(texColor.rgb * color.rgb, texColor.a * color.a);
    } else {
        gl_FragColor = vec4(0.0);
    }
} 