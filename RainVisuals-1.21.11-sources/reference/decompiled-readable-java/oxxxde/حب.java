/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import oxxxde.\u062c\u0623;

public class \u062d\u0628
extends \u062c\u0623 {
    private static final long serialVersionUID = 2211120929779008363L;

    public \u062d\u0628() {
        Object[] objectArray = new Object[1];
        objectArray[0] = 0xFFFFFF;
        String[] stringArray = new String[2];
        stringArray[0] = "You may be adding vertices in an infinite loop.";
        stringArray[1] = "You're a monster who managed to manually exceed the maximum number of vertices.";
        String[] stringArray2 = new String[1];
        stringArray2[0] = "Check the method where you add vertices to VertexBuilder and fix it.";
        super("VertexBuilder overflow.", String.format("The number of vertices in VertexBuilder exceeded the maximum value (%s).", objectArray), stringArray, stringArray2);
    }
}

