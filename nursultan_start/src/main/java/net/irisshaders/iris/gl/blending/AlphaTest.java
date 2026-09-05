/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.gl.blending;

import net.irisshaders.iris.gl.blending.AlphaTestFunction;

public record AlphaTest(AlphaTestFunction function, float reference) {
    public static final AlphaTest ALWAYS = new AlphaTest(AlphaTestFunction.ALWAYS, 0.0f);

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (((Object)((Object)this)).getClass() != object.getClass()) {
            return false;
        }
        AlphaTest alphaTest = (AlphaTest)((Object)object);
        if (this.function != alphaTest.function) {
            return false;
        }
        return Float.floatToIntBits(this.reference) == Float.floatToIntBits(alphaTest.reference);
    }

    public String toExpression(String string, String string2, String string3) {
        String string4 = this.function.getExpression();
        if (this.function == AlphaTestFunction.ALWAYS) {
            return "// alpha test disabled\n";
        }
        if (this.reference == Float.MAX_VALUE) {
            return string3 + "if (!(" + string + " > iris_vertexColorAlpha)) {\n" + string3 + "    discard;\n" + string3 + "}\n";
        }
        if (this.function == AlphaTestFunction.NEVER) {
            return "discard;\n";
        }
        return string3 + "if (!(" + string + " " + string4 + " " + string2 + ")) {\n" + string3 + "    discard;\n" + string3 + "}\n";
    }

    public String toExpression(String string) {
        return this.toExpression("gl_FragData[0].a", "iris_currentAlphaTest", string);
    }
}

