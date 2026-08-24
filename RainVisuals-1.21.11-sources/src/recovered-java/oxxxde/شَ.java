/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL
 *  org.lwjgl.opengl.GL11
 */
package oxxxde;

import java.util.Locale;
import kotakbaz.rain.client.render.main.ChromaRenderer;
import kotakbaz.rain.client.render.main.vertex.format.VertexFormat;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL11;
import oxxxde.\u0628\u0643;
import oxxxde.\u062a\u0638;
import oxxxde.\u062b\u0641;
import oxxxde.\u062f\u062c;
import oxxxde.\u062f\u0646;
import oxxxde.\u0638\u062d;
import oxxxde.\u0643;

public class \u0634\u064e {
    private static final \u0643 formatUploader = \u0634\u064e.createFormatUploader();

    private static \u0643 createFormatUploader() {
        String renderer;
        String vendor;
        block4: {
            block3: {
                vendor = String.valueOf(GL11.glGetString((int)7936));
                renderer = String.valueOf(GL11.glGetString((int)7937));
                boolean amd = \u0634\u064e.containsAmdMarker(vendor) || \u0634\u064e.containsAmdMarker(renderer);
                if (amd) break block3;
                if (GL.getCapabilities().GL_ARB_vertex_attrib_binding) break block4;
            }
            Object[] objectArray = new Object[3];
            objectArray[0] = vendor;
            objectArray[1] = renderer;
            objectArray[2] = GL.getCapabilities().GL_ARB_vertex_attrib_binding;
            ChromaRenderer.getLogger().info("Using default vertex format uploader. vendor={}, renderer={}, arbAttribBinding={}", objectArray);
            return new \u0628\u0643();
        }
        ChromaRenderer.getLogger().info("Using ARB vertex format uploader. vendor={}, renderer={}", (Object)vendor, (Object)renderer);
        return new \u062f\u062c();
    }

    private static boolean containsAmdMarker(String value) {
        if (value == null) {
            return false;
        }
        String lower = value.toLowerCase(Locale.ROOT);
        return lower.contains("advanced micro devices") || \u0634\u064e.containsToken(lower, "amd") || \u0634\u064e.containsToken(lower, "ati") || lower.contains("radeon");
    }

    /*
     * Unable to fully structure code
     */
    private static boolean containsToken(String value, String token) {
        index = value.indexOf(token);
        while (index >= 0) {
            end = index + token.length();
            before = index == 0 || !Character.isLetterOrDigit(value.charAt(index + -1));
            if (end >= value.length()) ** GOTO lbl-1000
            if (!Character.isLetterOrDigit(value.charAt(end))) lbl-1000:
            // 2 sources

            {
                v0 = true;
            } else {
                v0 = false;
            }
            after = v0;
            if (before && after) {
                return true;
            }
            var2_2 = value.indexOf(token, index + 1);
        }
        return false;
    }

    public static void uploadFormatToBuffer(\u062a\u0638 vertexBuffer, VertexFormat vertexFormat) {
        if (vertexBuffer.getTarget() != \u0638\u062d.ARRAY_BUFFER) {
            \u062f\u0646.printAndExit(new \u062b\u0641(vertexBuffer.getTarget().glId, \u0638\u062d.ARRAY_BUFFER.glId));
        }
        formatUploader.applyFormatToBuffer(vertexBuffer, vertexFormat);
    }
}

