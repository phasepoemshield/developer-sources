/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.booleans.BooleanConsumer
 *  it.unimi.dsi.fastutil.floats.FloatConsumer
 *  net.irisshaders.iris.Iris
 *  org.joml.Vector2f
 *  org.joml.Vector3i
 *  org.joml.Vector4f
 */
package net.irisshaders.iris.shaderpack.parsing;

import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import it.unimi.dsi.fastutil.floats.FloatConsumer;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.shaderpack.parsing.ConstDirectiveParser$ConstDirective;
import net.irisshaders.iris.shaderpack.parsing.ConstDirectiveParser$Type;
import net.irisshaders.iris.shaderpack.parsing.DirectiveHolder;
import org.joml.Vector2f;
import org.joml.Vector3i;
import org.joml.Vector4f;

public class DispatchingDirectiveHolder
implements DirectiveHolder {
    private final Map<String, BooleanConsumer> booleanConstVariables = new HashMap<String, BooleanConsumer>();
    private final Map<String, Consumer<String>> stringConstVariables = new HashMap<String, Consumer<String>>();
    private final Map<String, IntConsumer> intConstVariables = new HashMap<String, IntConsumer>();
    private final Map<String, FloatConsumer> floatConstVariables = new HashMap<String, FloatConsumer>();
    private final Map<String, Consumer<Vector2f>> vec2ConstVariables = new HashMap<String, Consumer<Vector2f>>();
    private final Map<String, Consumer<Vector3i>> ivec3ConstVariables = new HashMap<String, Consumer<Vector3i>>();
    private final Map<String, Consumer<Vector4f>> vec4ConstVariables = new HashMap<String, Consumer<Vector4f>>();

    @Override
    public void acceptCommentStringDirective(String string, Consumer<String> consumer) {
    }

    @Override
    public void acceptCommentFloatDirective(String string, FloatConsumer floatConsumer) {
    }

    @Override
    public void acceptConstBooleanDirective(String string, BooleanConsumer booleanConsumer) {
        this.booleanConstVariables.put(string, booleanConsumer);
    }

    private void typeCheckHelper(String string, Map<String, ?> map, ConstDirectiveParser$ConstDirective constDirectiveParser$ConstDirective) {
        if (map.containsKey(constDirectiveParser$ConstDirective.getKey())) {
            Iris.logger.warn("Ignoring " + String.valueOf(constDirectiveParser$ConstDirective) + " because it is of the wrong type, a type of " + string + " is expected.");
        }
    }

    public void processDirective(ConstDirectiveParser$ConstDirective constDirectiveParser$ConstDirective) {
        ConstDirectiveParser$Type constDirectiveParser$Type = constDirectiveParser$ConstDirective.getType();
        String string = constDirectiveParser$ConstDirective.getKey();
        String string2 = constDirectiveParser$ConstDirective.getValue();
        if (constDirectiveParser$Type == ConstDirectiveParser$Type.BOOL) {
            BooleanConsumer booleanConsumer = this.booleanConstVariables.get(string);
            if (booleanConsumer != null) {
                if ("true".equals(string2)) {
                    booleanConsumer.accept(true);
                } else if ("false".equals(string2)) {
                    booleanConsumer.accept(false);
                } else {
                    Iris.logger.error("Failed to process " + String.valueOf(constDirectiveParser$ConstDirective) + ": " + string2 + " is not a valid boolean value");
                }
                return;
            }
            this.typeCheckHelper("int", this.intConstVariables, constDirectiveParser$ConstDirective);
            this.typeCheckHelper("int", this.stringConstVariables, constDirectiveParser$ConstDirective);
            this.typeCheckHelper("float", this.floatConstVariables, constDirectiveParser$ConstDirective);
            this.typeCheckHelper("vec4", this.vec4ConstVariables, constDirectiveParser$ConstDirective);
        } else if (constDirectiveParser$Type == ConstDirectiveParser$Type.INT) {
            Consumer<String> consumer = this.stringConstVariables.get(string);
            if (consumer != null) {
                consumer.accept(string2);
                return;
            }
            IntConsumer intConsumer = this.intConstVariables.get(string);
            if (intConsumer != null) {
                try {
                    intConsumer.accept(Integer.parseInt(string2));
                }
                catch (NumberFormatException numberFormatException) {
                    Iris.logger.error("Failed to process " + String.valueOf(constDirectiveParser$ConstDirective), (Throwable)numberFormatException);
                }
                return;
            }
            this.typeCheckHelper("bool", this.booleanConstVariables, constDirectiveParser$ConstDirective);
            this.typeCheckHelper("float", this.floatConstVariables, constDirectiveParser$ConstDirective);
            this.typeCheckHelper("vec4", this.vec4ConstVariables, constDirectiveParser$ConstDirective);
        } else if (constDirectiveParser$Type == ConstDirectiveParser$Type.FLOAT) {
            FloatConsumer floatConsumer = this.floatConstVariables.get(string);
            if (floatConsumer != null) {
                try {
                    floatConsumer.accept(Float.parseFloat(string2));
                }
                catch (NumberFormatException numberFormatException) {
                    Iris.logger.error("Failed to process " + String.valueOf(constDirectiveParser$ConstDirective), (Throwable)numberFormatException);
                }
                return;
            }
            this.typeCheckHelper("bool", this.booleanConstVariables, constDirectiveParser$ConstDirective);
            this.typeCheckHelper("int", this.intConstVariables, constDirectiveParser$ConstDirective);
            this.typeCheckHelper("int", this.stringConstVariables, constDirectiveParser$ConstDirective);
            this.typeCheckHelper("vec4", this.vec4ConstVariables, constDirectiveParser$ConstDirective);
        } else if (constDirectiveParser$Type == ConstDirectiveParser$Type.VEC2) {
            Consumer<Vector2f> consumer = this.vec2ConstVariables.get(string);
            if (consumer != null) {
                String string3;
                if (!string2.startsWith("vec2")) {
                    Iris.logger.error("Failed to process " + String.valueOf(constDirectiveParser$ConstDirective) + ": value was not a valid vec2 constructor");
                }
                if (!(string3 = string2.substring("vec2".length()).trim()).startsWith("(") || !string3.endsWith(")")) {
                    Iris.logger.error("Failed to process " + String.valueOf(constDirectiveParser$ConstDirective) + ": value was not a valid vec2 constructor");
                }
                string3 = string3.substring(1, string3.length() - 1);
                String[] stringArray = string3.split(",");
                for (int i = 0; i < stringArray.length; ++i) {
                    stringArray[i] = stringArray[i].trim();
                }
                if (stringArray.length != 2) {
                    Iris.logger.error("Failed to process " + String.valueOf(constDirectiveParser$ConstDirective) + ": expected 2 arguments to a vec2 constructor, got " + stringArray.length);
                }
                try {
                    consumer.accept(new Vector2f(Float.parseFloat(stringArray[0]), Float.parseFloat(stringArray[1])));
                }
                catch (NumberFormatException numberFormatException) {
                    Iris.logger.error("Failed to process " + String.valueOf(constDirectiveParser$ConstDirective), (Throwable)numberFormatException);
                }
                return;
            }
            this.typeCheckHelper("bool", this.booleanConstVariables, constDirectiveParser$ConstDirective);
            this.typeCheckHelper("int", this.intConstVariables, constDirectiveParser$ConstDirective);
            this.typeCheckHelper("int", this.stringConstVariables, constDirectiveParser$ConstDirective);
            this.typeCheckHelper("float", this.floatConstVariables, constDirectiveParser$ConstDirective);
        } else if (constDirectiveParser$Type == ConstDirectiveParser$Type.IVEC3) {
            Consumer<Vector3i> consumer = this.ivec3ConstVariables.get(string);
            if (consumer != null) {
                String string4;
                if (!string2.startsWith("ivec3")) {
                    Iris.logger.error("Failed to process " + String.valueOf(constDirectiveParser$ConstDirective) + ": value was not a valid ivec3 constructor");
                }
                if (!(string4 = string2.substring("ivec3".length()).trim()).startsWith("(") || !string4.endsWith(")")) {
                    Iris.logger.error("Failed to process " + String.valueOf(constDirectiveParser$ConstDirective) + ": value was not a valid ivec3 constructor");
                }
                string4 = string4.substring(1, string4.length() - 1);
                String[] stringArray = string4.split(",");
                for (int i = 0; i < stringArray.length; ++i) {
                    stringArray[i] = stringArray[i].trim();
                }
                if (stringArray.length != 3) {
                    Iris.logger.error("Failed to process " + String.valueOf(constDirectiveParser$ConstDirective) + ": expected 3 arguments to a ivec3 constructor, got " + stringArray.length);
                }
                try {
                    consumer.accept(new Vector3i(Integer.parseInt(stringArray[0]), Integer.parseInt(stringArray[1]), Integer.parseInt(stringArray[2])));
                }
                catch (NumberFormatException numberFormatException) {
                    Iris.logger.error("Failed to process " + String.valueOf(constDirectiveParser$ConstDirective), (Throwable)numberFormatException);
                }
                return;
            }
            this.typeCheckHelper("bool", this.booleanConstVariables, constDirectiveParser$ConstDirective);
            this.typeCheckHelper("int", this.intConstVariables, constDirectiveParser$ConstDirective);
            this.typeCheckHelper("int", this.stringConstVariables, constDirectiveParser$ConstDirective);
            this.typeCheckHelper("float", this.floatConstVariables, constDirectiveParser$ConstDirective);
        } else if (constDirectiveParser$Type == ConstDirectiveParser$Type.VEC4) {
            Consumer<Vector4f> consumer = this.vec4ConstVariables.get(string);
            if (consumer != null) {
                String string5;
                if (!string2.startsWith("vec4")) {
                    Iris.logger.error("Failed to process " + String.valueOf(constDirectiveParser$ConstDirective) + ": value was not a valid vec4 constructor");
                }
                if (!(string5 = string2.substring("vec4".length()).trim()).startsWith("(") || !string5.endsWith(")")) {
                    Iris.logger.error("Failed to process " + String.valueOf(constDirectiveParser$ConstDirective) + ": value was not a valid vec4 constructor");
                }
                string5 = string5.substring(1, string5.length() - 1);
                String[] stringArray = string5.split(",");
                for (int i = 0; i < stringArray.length; ++i) {
                    stringArray[i] = stringArray[i].trim();
                }
                if (stringArray.length != 4) {
                    Iris.logger.error("Failed to process " + String.valueOf(constDirectiveParser$ConstDirective) + ": expected 4 arguments to a vec4 constructor, got " + stringArray.length);
                }
                try {
                    consumer.accept(new Vector4f(Float.parseFloat(stringArray[0]), Float.parseFloat(stringArray[1]), Float.parseFloat(stringArray[2]), Float.parseFloat(stringArray[3])));
                }
                catch (NumberFormatException numberFormatException) {
                    Iris.logger.error("Failed to process " + String.valueOf(constDirectiveParser$ConstDirective), (Throwable)numberFormatException);
                }
                return;
            }
            this.typeCheckHelper("bool", this.booleanConstVariables, constDirectiveParser$ConstDirective);
            this.typeCheckHelper("int", this.intConstVariables, constDirectiveParser$ConstDirective);
            this.typeCheckHelper("int", this.stringConstVariables, constDirectiveParser$ConstDirective);
            this.typeCheckHelper("float", this.floatConstVariables, constDirectiveParser$ConstDirective);
        }
    }

    @Override
    public void acceptConstIVec3Directive(String string, Consumer<Vector3i> consumer) {
        this.ivec3ConstVariables.put(string, consumer);
    }

    @Override
    public void acceptConstStringDirective(String string, Consumer<String> consumer) {
        this.stringConstVariables.put(string, consumer);
    }

    @Override
    public void acceptConstVec2Directive(String string, Consumer<Vector2f> consumer) {
        this.vec2ConstVariables.put(string, consumer);
    }

    @Override
    public void acceptUniformDirective(String string, Runnable runnable) {
    }

    @Override
    public void acceptConstVec4Directive(String string, Consumer<Vector4f> consumer) {
        this.vec4ConstVariables.put(string, consumer);
    }

    @Override
    public void acceptConstFloatDirective(String string, FloatConsumer floatConsumer) {
        this.floatConstVariables.put(string, floatConsumer);
    }

    @Override
    public void acceptConstIntDirective(String string, IntConsumer intConsumer) {
        this.intConstVariables.put(string, intConsumer);
    }

    @Override
    public void acceptCommentIntDirective(String string, IntConsumer intConsumer) {
    }
}

