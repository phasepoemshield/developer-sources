/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap$Builder
 *  it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap
 *  kroppeb.stareval.element.ExpressionElement
 *  kroppeb.stareval.function.Type
 *  kroppeb.stareval.parser.Parser
 *  kroppeb.stareval.parser.ParserOptions
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.gl.uniform.UniformHolder
 *  net.irisshaders.iris.parsing.IrisOptions
 *  net.irisshaders.iris.parsing.VectorType
 */
package net.irisshaders.iris.uniforms.custom;

import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.Map;
import java.util.function.Consumer;
import kroppeb.stareval.element.ExpressionElement;
import kroppeb.stareval.function.Type;
import kroppeb.stareval.parser.Parser;
import kroppeb.stareval.parser.ParserOptions;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.gl.uniform.UniformHolder;
import net.irisshaders.iris.parsing.IrisOptions;
import net.irisshaders.iris.parsing.VectorType;
import net.irisshaders.iris.uniforms.custom.CustomUniformFixedInputUniformsHolder;
import net.irisshaders.iris.uniforms.custom.CustomUniformFixedInputUniformsHolder$Builder;
import net.irisshaders.iris.uniforms.custom.CustomUniforms;
import net.irisshaders.iris.uniforms.custom.CustomUniforms$Builder$Variable;

public class CustomUniforms$Builder {
    private static final Map<String, Type> types = new ImmutableMap.Builder().put((Object)"bool", (Object)Type.Boolean).put((Object)"float", (Object)Type.Float).put((Object)"int", (Object)Type.Int).put((Object)"vec2", (Object)VectorType.VEC2).put((Object)"vec3", (Object)VectorType.VEC3).put((Object)"vec4", (Object)VectorType.VEC4).build();
    final Map<String, CustomUniforms$Builder$Variable> variables = new Object2ObjectLinkedOpenHashMap();

    @SafeVarargs
    public final CustomUniforms build(Consumer<UniformHolder> ... consumerArray) {
        CustomUniformFixedInputUniformsHolder$Builder customUniformFixedInputUniformsHolder$Builder = new CustomUniformFixedInputUniformsHolder$Builder();
        for (Consumer<UniformHolder> consumer : consumerArray) {
            consumer.accept(customUniformFixedInputUniformsHolder$Builder);
        }
        return this.build(customUniformFixedInputUniformsHolder$Builder.build());
    }

    public CustomUniforms build(CustomUniformFixedInputUniformsHolder customUniformFixedInputUniformsHolder) {
        return new CustomUniforms(customUniformFixedInputUniformsHolder, this.variables);
    }

    public void addVariable(String string, String string2, String string3, boolean bl) {
        if (this.variables.containsKey(string2)) {
            Iris.logger.warn("Ignoring duplicated custom uniform name: " + string2);
            return;
        }
        Type type = types.get(string);
        if (type == null) {
            Iris.logger.warn("Ignoring invalid uniform type: " + string + " of " + string2);
            return;
        }
        try {
            ExpressionElement expressionElement = Parser.parse((String)string3, (ParserOptions)IrisOptions.options);
            this.variables.put(string2, new CustomUniforms$Builder$Variable(type, string2, expressionElement, bl));
        }
        catch (Exception exception) {
            Iris.logger.warn("Failed to parse custom variable/uniform " + string2 + " with expression " + string3, (Throwable)exception);
        }
    }
}

