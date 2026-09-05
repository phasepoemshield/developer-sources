/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.gl.blending.AlphaTest
 *  net.irisshaders.iris.gl.blending.AlphaTests
 *  net.irisshaders.iris.gl.state.FogMode
 *  net.irisshaders.iris.gl.state.ShaderAttributeInputs
 */
package net.irisshaders.iris.pipeline.fallback;

import net.irisshaders.iris.gl.blending.AlphaTest;
import net.irisshaders.iris.gl.blending.AlphaTests;
import net.irisshaders.iris.gl.state.FogMode;
import net.irisshaders.iris.gl.state.ShaderAttributeInputs;

public class ShaderSynthesizer {
    public static String vsh(boolean bl, ShaderAttributeInputs shaderAttributeInputs, FogMode fogMode, boolean bl2, boolean bl3) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder.append("#version 150 core\n");
        stringBuilder.append("layout(std140) uniform Projection {\n    mat4 ProjMat;\n};\n");
        stringBuilder.append("layout(std140) uniform DynamicTransforms {\n    mat4 ModelViewMat;\n    vec4 ColorModulator;\n    vec3 ModelOffset;\n    mat4 TextureMat;\n};\n");
        stringBuilder.append("layout(std140) uniform Globals {\n    vec2 ScreenSize;\n    float GlintAlpha;\n    float GameTime;\n    int MenuBlurRadius;\n};\n");
        stringBuilder.append("in vec3 Position;\n");
        String string = bl ? "Position + ModelOffset" : "Position";
        if (shaderAttributeInputs.isNewLines()) {
            stringBuilder.append("in float LineWidth;\n");
            stringBuilder.append("const float VIEW_SHRINK = 1.0 - (1.0 / 256.0);\nconst mat4 VIEW_SCALE = mat4(\n    VIEW_SHRINK, 0.0, 0.0, 0.0,\n    0.0, VIEW_SHRINK, 0.0, 0.0,\n    0.0, 0.0, VIEW_SHRINK, 0.0,\n    0.0, 0.0, 0.0, 1.0\n);\n");
            stringBuilder2.append("vec4 linePosStart = ProjMat * VIEW_SCALE * ModelViewMat * vec4(" + string + ", 1.0);\n    vec4 linePosEnd = ProjMat * VIEW_SCALE * ModelViewMat * vec4(" + string + " + Normal, 1.0);\n\n    vec3 ndc1 = linePosStart.xyz / linePosStart.w;\n    vec3 ndc2 = linePosEnd.xyz / linePosEnd.w;\n\n    vec2 lineScreenDirection = normalize((ndc2.xy - ndc1.xy) * ScreenSize);\n    vec2 lineOffset = vec2(-lineScreenDirection.y, lineScreenDirection.x) * LineWidth / ScreenSize;\n\n    if (lineOffset.x < 0.0) {\n        lineOffset *= -1.0;\n    }\n\n    if (gl_VertexID % 2 == 0) {\n        gl_Position = vec4((ndc1 + vec3(lineOffset, 0.0)) * linePosStart.w, linePosStart.w);\n    } else {\n        gl_Position = vec4((ndc1 - vec3(lineOffset, 0.0)) * linePosStart.w, linePosStart.w);\n    }\n");
        } else {
            stringBuilder2.append("    gl_Position = ProjMat * ModelViewMat * vec4(");
            stringBuilder2.append(string);
            stringBuilder2.append(", 1.0);\n");
        }
        if (bl3) {
            stringBuilder.append("flat ");
        }
        stringBuilder.append("out vec4 iris_vertexColor;\n");
        if (shaderAttributeInputs.hasNormal() && shaderAttributeInputs.hasColor()) {
            stringBuilder.append("in vec4 Color;\n");
            if (bl2) {
                stringBuilder.append("layout(std140) uniform Lighting {\n    vec3 Light0_Direction;\n    vec3 Light1_Direction;\n};");
                stringBuilder.append("vec4 minecraft_mix_light(vec3 lightDir0, vec3 lightDir1, vec3 normal, vec4 color) {\n    float light0 = max(0.0, dot(lightDir0, normal));\n    float light1 = max(0.0, dot(lightDir1, normal));\n    float lightAccum = min(1.0, (light0 + light1) * 0.6 + 0.4);\n    return vec4(color.rgb * lightAccum, color.a);\n}\n");
                stringBuilder.append("in vec3 Normal;\n");
                stringBuilder2.append("    iris_vertexColor = minecraft_mix_light(Light0_Direction, Light1_Direction, Normal, Color * ColorModulator);\n");
            } else if (shaderAttributeInputs.isNewLines()) {
                stringBuilder.append("in vec3 Normal;\n");
                stringBuilder2.append("    iris_vertexColor = Color * ColorModulator;\n");
            } else {
                stringBuilder2.append("    iris_vertexColor = Color * ColorModulator;\n");
            }
        } else if (shaderAttributeInputs.hasColor()) {
            stringBuilder.append("in vec4 Color;\n");
            stringBuilder2.append("    iris_vertexColor = Color * ColorModulator;\n");
        } else {
            stringBuilder2.append("    iris_vertexColor = ColorModulator;\n");
        }
        if (shaderAttributeInputs.hasOverlay()) {
            stringBuilder.append("uniform sampler2D Sampler1;\n");
            stringBuilder.append("in ivec2 UV1;\n");
            stringBuilder.append("out vec4 overlayColor;\n");
            stringBuilder2.append("    overlayColor = texelFetch(Sampler1, UV1, 0);\n");
        }
        if (shaderAttributeInputs.hasTex()) {
            stringBuilder.append("in vec2 UV0;\n");
            stringBuilder.append("out vec2 texCoord;\n");
            stringBuilder2.append("    texCoord = (TextureMat * vec4(UV0, 0.0, 1.0)).xy;\n");
        }
        if (fogMode == FogMode.PER_VERTEX) {
            stringBuilder.append("out float vertexDistance;\n");
            stringBuilder2.append("    vertexDistance = length((ModelViewMat * vec4(");
            stringBuilder2.append(string);
            stringBuilder2.append(", 1.0)).xyz);\n");
        }
        if (shaderAttributeInputs.hasLight()) {
            stringBuilder.append("in ivec2 UV2;\n");
            stringBuilder.append("out vec2 lightCoord;\n");
            stringBuilder2.append("    lightCoord = clamp(UV2 / 256.0, vec2(0.5 / 16.0), vec2(15.5 / 16.0));\n");
        }
        stringBuilder.append("void main() {\n");
        stringBuilder.append((CharSequence)stringBuilder2);
        stringBuilder.append("}\n");
        return stringBuilder.toString();
    }

    public static String fsh(ShaderAttributeInputs shaderAttributeInputs, FogMode fogMode, AlphaTest alphaTest, boolean bl, boolean bl2) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder.append("#version 150 core\n");
        stringBuilder.append("out vec4 fragColor;\n");
        stringBuilder.append("uniform float AlphaTestValue;\n");
        if (bl2) {
            stringBuilder.append("flat ");
        }
        stringBuilder.append("in vec4 iris_vertexColor;\n");
        stringBuilder.append("layout(std140) uniform Projection {\n    mat4 ProjMat;\n};\n");
        stringBuilder2.append("float iris_vertexColorAlpha = iris_vertexColor.a;");
        if (shaderAttributeInputs.hasTex()) {
            stringBuilder.append("uniform sampler2D Sampler0;\n");
            stringBuilder.append("in vec2 texCoord;\n");
            stringBuilder2.append("    vec4 color = texture(Sampler0, texCoord)");
            if (bl) {
                stringBuilder2.append(".rrrr");
            }
            if (alphaTest == AlphaTests.VERTEX_ALPHA) {
                stringBuilder2.append(" * vec4(iris_vertexColor.rgb, 1);\n");
            } else {
                stringBuilder2.append(" * iris_vertexColor;\n");
            }
        } else if (alphaTest == AlphaTests.VERTEX_ALPHA) {
            stringBuilder2.append("vec4 color = vec4(iris_vertexColor.rgb, 1);\n");
        } else {
            stringBuilder2.append("vec4 color = iris_vertexColor;\n");
        }
        if (shaderAttributeInputs.hasOverlay()) {
            stringBuilder.append("in vec4 overlayColor;\n");
            stringBuilder2.append("    color.rgb = mix(overlayColor.rgb, color.rgb, overlayColor.a);\n");
        }
        if (shaderAttributeInputs.hasLight()) {
            stringBuilder.append("uniform sampler2D Sampler2;\n");
            stringBuilder.append("in vec2 lightCoord;\n");
            stringBuilder2.append("    color *= texture(Sampler2, lightCoord);\n");
        }
        if (fogMode == FogMode.PER_VERTEX || fogMode == FogMode.PER_FRAGMENT) {
            stringBuilder.append("layout(std140) uniform Fog {\n    vec4 FogColor;\n    float FogEnvironmentalStart;\n    float FogEnvironmentalEnd;\n    float FogRenderDistanceStart;\n    float FogRenderDistanceEnd;\n    float FogSkyEnd;\n    float FogCloudsEnd;\n};");
            if (fogMode == FogMode.PER_VERTEX) {
                stringBuilder.append("in float vertexDistance;\n");
                stringBuilder2.append("float fragmentDistance = vertexDistance;\n");
            } else {
                stringBuilder2.append("float fragmentDistance = -ProjMat[3].z / ((gl_FragCoord.z) * -2.0 + 1.0 - ProjMat[2].z);\n");
            }
            stringBuilder.append("uniform float FogDensity = 1.0;\n");
            stringBuilder.append("uniform int FogIsExp2 = 1;\n");
            stringBuilder2.append("    float fogFactor;\n");
            stringBuilder2.append("    if (FogIsExp2 == 1) {\n");
            stringBuilder2.append("        float x = fragmentDistance * FogDensity;\n");
            stringBuilder2.append("        fogFactor = exp(-x * x);\n");
            stringBuilder2.append("    } else {\n");
            stringBuilder2.append("        fogFactor = (FogRenderDistanceEnd - fragmentDistance) / (FogRenderDistanceEnd - FogRenderDistanceStart);\n");
            stringBuilder2.append("    }\n");
            stringBuilder2.append("    fogFactor = clamp(fogFactor, 0.0, 1.0);\n");
            stringBuilder2.append("    color.rgb = mix(FogColor.rgb, color.rgb, fogFactor * FogColor.a);\n");
        }
        stringBuilder2.append("    fragColor = color;\n");
        stringBuilder.append("void main() {\n");
        stringBuilder.append((CharSequence)stringBuilder2);
        stringBuilder.append(alphaTest.toExpression("fragColor.a", "AlphaTestValue", "    "));
        stringBuilder.append("}\n");
        return stringBuilder.toString();
    }
}

