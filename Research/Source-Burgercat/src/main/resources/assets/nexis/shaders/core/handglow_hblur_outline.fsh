#version 150
layout(std140) uniform u_resolution {
    vec2 resolution;
};
layout(std140) uniform u_radius {
    float radius;
};
uniform sampler2D u_texture;
out vec4 fragColor;
void main() {
    vec2 uv = gl_FragCoord.xy / resolution;
    vec2 stepUv = vec2(max(radius, 1.0), 0.0) / resolution;
    vec4 color = texture(u_texture, uv) * 0.19648255;
    color += texture(u_texture, uv + stepUv * 1.41176471) * 0.29690696;
    color += texture(u_texture, uv - stepUv * 1.41176471) * 0.29690696;
    color += texture(u_texture, uv + stepUv * 3.29411765) * 0.09447040;
    color += texture(u_texture, uv - stepUv * 3.29411765) * 0.09447040;
    color += texture(u_texture, uv + stepUv * 5.17647059) * 0.01038136;
    color += texture(u_texture, uv - stepUv * 5.17647059) * 0.01038136;
    fragColor = color;
}
