float selectRadius(vec2 pos, vec4 radius) {
    return (pos.x > 0.0)
               ? ((pos.y > 0.0) ? radius.x : radius.y)
               : ((pos.y > 0.0) ? radius.z : radius.w);
}

float rdist(vec2 pos, vec2 size, vec4 radius) {
    float r = selectRadius(pos, radius);

    vec2 v = abs(pos) - size + r;
    return min(max(v.x, v.y), 0.0) + length(max(v, 0.0)) - r;
}

float ralpha(vec2 size, vec2 coord, vec4 radius, float smoothness) {
    vec2 center = size * 0.5;
    float dist = rdist(center - (coord * size), center - 1.0, radius);
    return 1.0 - smoothstep(1.0 - smoothness, 1.0, dist);
}

float sd_dist(vec2 size, vec2 coord, vec4 radius, float mode) {
    vec2 center = size * 0.5;
    vec2 pos = center - (coord * size);
    vec2 bounds = center - 1.0;
    return rdist(pos, bounds, radius);
}

vec4 sd_render(vec4 baseColor, vec4 borderColor, float dist, float borderWidth) {
    float alpha = 1.0 - smoothstep(0.2, 1.0, dist);
    if (alpha == 0.0) return vec4(0.0);

    float borderMix = 0.0;
    if (borderWidth > 0.0) {
        borderMix = 1.0 - smoothstep(borderWidth - 1.0, borderWidth, abs(dist));
    }

    vec4 finalColor = mix(baseColor, borderColor, borderMix);
    finalColor.a *= alpha;

    return finalColor;
}