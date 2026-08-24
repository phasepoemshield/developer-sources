#version 150

uniform sampler2D ColorTexture;
uniform sampler2D DepthTexture;
uniform vec2 resolution;
uniform float time;
uniform vec2 handMotion;
uniform float effectAlpha;

in vec2 TexCoord;
in vec4 FragColor;

out vec4 fragColor;

void main() {
    vec4 color = texture(ColorTexture, TexCoord);
    float depth = texture(DepthTexture, TexCoord).r;
    
    vec2 uv = gl_FragCoord.xy / resolution;
    vec3 aquaColor = vec3(0.0, 0.7 + sin(time + uv.y * 3.0) * 0.3, 1.0);
    
    fragColor = vec4(mix(color.rgb, aquaColor, effectAlpha * 0.5), color.a);
}
