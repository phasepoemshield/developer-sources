/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import kotakbaz.rain.client.render.main.ChromaRenderer;
import oxxxde.\u062c\u0623;

public class \u062f\u0646 {
    private static final String separateLine = "-----------------------------------";

    /*
     * WARNING - void declaration
     */
    public static void printAndExit(\u062c\u0623 exception) {
        int i;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n");
        stringBuilder.append(separateLine.concat("\n"));
        stringBuilder.append("Renderer error occurred!\n");
        stringBuilder.append(separateLine.concat("\n"));
        stringBuilder.append("Whats wrong?\n\n");
        stringBuilder.append(exception.getDescription().concat("\n"));
        stringBuilder.append(separateLine.concat("\n"));
        stringBuilder.append("Details:\n\n");
        stringBuilder.append(exception.getDetails().concat("\n"));
        stringBuilder.append(separateLine.concat("\n"));
        stringBuilder.append("Possible reasons:\n\n");
        for (i = 0; i < exception.getReasons().length; ++i) {
            stringBuilder.append(i + 1).append(".").append(exception.getReasons()[i]).append("\n");
        }
        stringBuilder.append(separateLine.concat("\n"));
        stringBuilder.append("Possible solutions:\n\n");
        i = 0;
        while (i < exception.getSolutions().length) {
            void var2_2;
            stringBuilder.append(i + 1).append(".").append(exception.getSolutions()[i]).append("\n");
            ++var2_2;
        }
        stringBuilder.append(separateLine);
        ChromaRenderer.getLogger().error(stringBuilder.toString());
        exception.printStackTrace();
        System.exit(-1);
    }
}

