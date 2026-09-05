/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.AMDDebugOutput
 *  org.lwjgl.opengl.ARBDebugOutput
 *  org.lwjgl.opengl.GL
 *  org.lwjgl.opengl.GL43C
 *  org.lwjgl.opengl.GL46C
 *  org.lwjgl.opengl.GLCapabilities
 *  org.lwjgl.opengl.GLDebugMessageAMDCallback
 *  org.lwjgl.opengl.GLDebugMessageAMDCallbackI
 *  org.lwjgl.opengl.GLDebugMessageARBCallback
 *  org.lwjgl.opengl.GLDebugMessageARBCallbackI
 *  org.lwjgl.opengl.GLDebugMessageCallback
 *  org.lwjgl.opengl.GLDebugMessageCallbackI
 *  org.lwjgl.opengl.KHRDebug
 *  org.lwjgl.system.APIUtil
 */
package net.irisshaders.iris.gl;

import java.io.PrintStream;
import java.util.function.Consumer;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.gl.GLDebug$1;
import net.irisshaders.iris.gl.GLDebug$DebugState;
import net.irisshaders.iris.gl.GLDebug$KHRDebugState;
import net.irisshaders.iris.gl.GLDebug$UnsupportedDebugState;
import org.lwjgl.opengl.AMDDebugOutput;
import org.lwjgl.opengl.ARBDebugOutput;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL43C;
import org.lwjgl.opengl.GL46C;
import org.lwjgl.opengl.GLCapabilities;
import org.lwjgl.opengl.GLDebugMessageAMDCallback;
import org.lwjgl.opengl.GLDebugMessageAMDCallbackI;
import org.lwjgl.opengl.GLDebugMessageARBCallback;
import org.lwjgl.opengl.GLDebugMessageARBCallbackI;
import org.lwjgl.opengl.GLDebugMessageCallback;
import org.lwjgl.opengl.GLDebugMessageCallbackI;
import org.lwjgl.opengl.KHRDebug;
import org.lwjgl.system.APIUtil;

public final class GLDebug {
    private static GLDebug$DebugState debugState;

    public static void reloadDebugState() {
        debugState = Iris.getIrisConfig().areDebugOptionsEnabled() && (GL.getCapabilities().GL_KHR_debug || GL.getCapabilities().OpenGL43) ? new GLDebug$KHRDebugState() : new GLDebug$UnsupportedDebugState();
    }

    private static void trace(Consumer<String> consumer) {
        StackTraceElement[] stackTraceElementArray;
        for (StackTraceElement stackTraceElement : stackTraceElementArray = GLDebug.filterStackTrace(new Throwable(), 4).getStackTrace()) {
            consumer.accept(stackTraceElement.toString());
        }
    }

    public static void popGroup() {
        debugState.popGroup();
    }

    public static void nameObject(int n, int n2, String string) {
        debugState.nameObject(n, n2, string);
    }

    private static String getSeverityARB(int n) {
        return switch (n) {
            case 37190 -> "HIGH";
            case 37191 -> "MEDIUM";
            case 37192 -> "LOW";
            default -> APIUtil.apiUnknownToken((int)n);
        };
    }

    private static String getDebugSource(int n) {
        switch (n) {
            case 33350: {
                return "API";
            }
            case 33351: {
                return "WINDOW SYSTEM";
            }
            case 33352: {
                return "SHADER COMPILER";
            }
            case 33353: {
                return "THIRD PARTY";
            }
            case 33354: {
                return "APPLICATION";
            }
            case 33355: {
                return "OTHER";
            }
        }
        return APIUtil.apiUnknownToken((int)n);
    }

    private static String getCategoryAMD(int n) {
        return switch (n) {
            case 37193 -> "API ERROR";
            case 37194 -> "WINDOW SYSTEM";
            case 37195 -> "DEPRECATION";
            case 37196 -> "UNDEFINED BEHAVIOR";
            case 37197 -> "PERFORMANCE";
            case 37198 -> "SHADER COMPILER";
            case 37199 -> "APPLICATION";
            case 37200 -> "OTHER";
            default -> APIUtil.apiUnknownToken((int)n);
        };
    }

    private static String getSeverityAMD(int n) {
        return switch (n) {
            case 37190 -> "HIGH";
            case 37191 -> "MEDIUM";
            case 37192 -> "LOW";
            default -> APIUtil.apiUnknownToken((int)n);
        };
    }

    static void printDetail(PrintStream printStream, String string, String string2) {
        printStream.printf("\t%s: %s\n", string, string2);
    }

    private static String getDebugType(int n) {
        return switch (n) {
            case 33356 -> "ERROR";
            case 33357 -> "DEPRECATED BEHAVIOR";
            case 33358 -> "UNDEFINED BEHAVIOR";
            case 33359 -> "PORTABILITY";
            case 33360 -> "PERFORMANCE";
            case 33361 -> "OTHER";
            case 33384 -> "MARKER";
            default -> APIUtil.apiUnknownToken((int)n);
        };
    }

    private static String getDebugSeverity(int n) {
        return switch (n) {
            case 33387 -> "NOTIFICATION";
            case 37190 -> "HIGH";
            case 37191 -> "MEDIUM";
            case 37192 -> "LOW";
            default -> APIUtil.apiUnknownToken((int)n);
        };
    }

    public static Throwable filterStackTrace(Throwable throwable, int n) {
        StackTraceElement[] stackTraceElementArray = throwable.getStackTrace();
        StackTraceElement[] stackTraceElementArray2 = new StackTraceElement[stackTraceElementArray.length];
        int n2 = 0;
        for (int i = n; i < stackTraceElementArray.length; ++i) {
            stackTraceElementArray2[n2++] = stackTraceElementArray[i];
        }
        StackTraceElement[] stackTraceElementArray3 = new StackTraceElement[n2];
        System.arraycopy(stackTraceElementArray2, 0, stackTraceElementArray3, 0, n2);
        throwable.setStackTrace(stackTraceElementArray3);
        return throwable;
    }

    private static String getSourceARB(int n) {
        return switch (n) {
            case 33350 -> "API";
            case 33351 -> "WINDOW SYSTEM";
            case 33352 -> "SHADER COMPILER";
            case 33353 -> "THIRD PARTY";
            case 33354 -> "APPLICATION";
            case 33355 -> "OTHER";
            default -> APIUtil.apiUnknownToken((int)n);
        };
    }

    static void printDetailLine(PrintStream printStream, String string, String string2) {
        printStream.append("    ");
        for (int i = 0; i < string.length(); ++i) {
            printStream.append(" ");
        }
        printStream.append(string2).append("\n");
    }

    public static int setupDebugMessageCallback() {
        GLDebug.reloadDebugState();
        return GLDebug.setupDebugMessageCallback(System.out);
    }

    public static int setupDebugMessageCallback(PrintStream printStream) {
        GLCapabilities gLCapabilities = GL.getCapabilities();
        GL46C.glEnable((int)33346);
        if (gLCapabilities.OpenGL43) {
            Iris.logger.info("[GL] Using OpenGL 4.3 for error logging.");
            GLDebugMessageCallback gLDebugMessageCallback = GLDebugMessageCallback.create((n, n2, n3, n4, n5, l, l2) -> {
                printStream.println("[LWJGL] OpenGL debug message");
                GLDebug.printDetail(printStream, "ID", String.format("0x%X", n3));
                GLDebug.printDetail(printStream, "Source", GLDebug.getDebugSource(n));
                GLDebug.printDetail(printStream, "Type", GLDebug.getDebugType(n2));
                GLDebug.printDetail(printStream, "Severity", GLDebug.getDebugSeverity(n4));
                GLDebug.printDetail(printStream, "Message", GLDebugMessageCallback.getMessage((int)n5, (long)l));
                GLDebug.printTrace(printStream);
            });
            GL43C.glDebugMessageControl((int)4352, (int)4352, (int)37190, (int[])null, (boolean)true);
            GL43C.glDebugMessageControl((int)4352, (int)4352, (int)37191, (int[])null, (boolean)false);
            GL43C.glDebugMessageControl((int)4352, (int)4352, (int)37192, (int[])null, (boolean)false);
            GL43C.glDebugMessageControl((int)4352, (int)4352, (int)33387, (int[])null, (boolean)false);
            GL43C.glDebugMessageCallback((GLDebugMessageCallbackI)gLDebugMessageCallback, (long)0L);
            if ((GL43C.glGetInteger((int)33310) & 2) == 0) {
                Iris.logger.warn("[GL] Warning: A non-debug context may not produce any debug output.");
                GL43C.glEnable((int)37600);
                return 2;
            }
            return 1;
        }
        if (gLCapabilities.GL_KHR_debug) {
            Iris.logger.info("[GL] Using KHR_debug for error logging.");
            GLDebugMessageCallback gLDebugMessageCallback = GLDebugMessageCallback.create((n, n2, n3, n4, n5, l, l2) -> {
                printStream.println("[LWJGL] OpenGL debug message");
                GLDebug.printDetail(printStream, "ID", String.format("0x%X", n3));
                GLDebug.printDetail(printStream, "Source", GLDebug.getDebugSource(n));
                GLDebug.printDetail(printStream, "Type", GLDebug.getDebugType(n2));
                GLDebug.printDetail(printStream, "Severity", GLDebug.getDebugSeverity(n4));
                GLDebug.printDetail(printStream, "Message", GLDebugMessageCallback.getMessage((int)n5, (long)l));
                GLDebug.printTrace(printStream);
            });
            KHRDebug.glDebugMessageControl((int)4352, (int)4352, (int)37190, (int[])null, (boolean)true);
            KHRDebug.glDebugMessageControl((int)4352, (int)4352, (int)37191, (int[])null, (boolean)false);
            KHRDebug.glDebugMessageControl((int)4352, (int)4352, (int)37192, (int[])null, (boolean)false);
            KHRDebug.glDebugMessageControl((int)4352, (int)4352, (int)33387, (int[])null, (boolean)false);
            KHRDebug.glDebugMessageCallback((GLDebugMessageCallbackI)gLDebugMessageCallback, (long)0L);
            if (gLCapabilities.OpenGL30 && (GL43C.glGetInteger((int)33310) & 2) == 0) {
                Iris.logger.warn("[GL] Warning: A non-debug context may not produce any debug output.");
                GL43C.glEnable((int)37600);
                return 2;
            }
            return 1;
        }
        if (gLCapabilities.GL_ARB_debug_output) {
            Iris.logger.info("[GL] Using ARB_debug_output for error logging.");
            GLDebugMessageARBCallback gLDebugMessageARBCallback = GLDebugMessageARBCallback.create((n, n2, n3, n4, n5, l, l2) -> {
                printStream.println("[LWJGL] ARB_debug_output message");
                GLDebug.printDetail(printStream, "ID", String.format("0x%X", n3));
                GLDebug.printDetail(printStream, "Source", GLDebug.getSourceARB(n));
                GLDebug.printDetail(printStream, "Type", GLDebug.getTypeARB(n2));
                GLDebug.printDetail(printStream, "Severity", GLDebug.getSeverityARB(n4));
                GLDebug.printDetail(printStream, "Message", GLDebugMessageARBCallback.getMessage((int)n5, (long)l));
                GLDebug.printTrace(printStream);
            });
            ARBDebugOutput.glDebugMessageControlARB((int)4352, (int)4352, (int)37190, (int[])null, (boolean)true);
            ARBDebugOutput.glDebugMessageControlARB((int)4352, (int)4352, (int)37191, (int[])null, (boolean)false);
            ARBDebugOutput.glDebugMessageControlARB((int)4352, (int)4352, (int)37192, (int[])null, (boolean)false);
            ARBDebugOutput.glDebugMessageControlARB((int)4352, (int)4352, (int)33387, (int[])null, (boolean)false);
            ARBDebugOutput.glDebugMessageCallbackARB((GLDebugMessageARBCallbackI)gLDebugMessageARBCallback, (long)0L);
            return 1;
        }
        if (gLCapabilities.GL_AMD_debug_output) {
            Iris.logger.info("[GL] Using AMD_debug_output for error logging.");
            GLDebugMessageAMDCallback gLDebugMessageAMDCallback = GLDebugMessageAMDCallback.create((n, n2, n3, n4, l, l2) -> {
                printStream.println("[LWJGL] AMD_debug_output message");
                GLDebug.printDetail(printStream, "ID", String.format("0x%X", n));
                GLDebug.printDetail(printStream, "Category", GLDebug.getCategoryAMD(n2));
                GLDebug.printDetail(printStream, "Severity", GLDebug.getSeverityAMD(n3));
                GLDebug.printDetail(printStream, "Message", GLDebugMessageAMDCallback.getMessage((int)n4, (long)l));
                GLDebug.printTrace(printStream);
            });
            AMDDebugOutput.glDebugMessageEnableAMD((int)0, (int)37190, (int[])null, (boolean)true);
            AMDDebugOutput.glDebugMessageEnableAMD((int)0, (int)37191, (int[])null, (boolean)false);
            AMDDebugOutput.glDebugMessageEnableAMD((int)0, (int)37192, (int[])null, (boolean)false);
            AMDDebugOutput.glDebugMessageEnableAMD((int)0, (int)33387, (int[])null, (boolean)false);
            AMDDebugOutput.glDebugMessageCallbackAMD((GLDebugMessageAMDCallbackI)gLDebugMessageAMDCallback, (long)0L);
            return 1;
        }
        Iris.logger.info("[GL] No debug output implementation is available, cannot return debug info.");
        return 0;
    }

    public static int disableDebugMessages() {
        GLCapabilities gLCapabilities = GL.getCapabilities();
        if (gLCapabilities.OpenGL43) {
            GL43C.glDebugMessageCallback(null, (long)0L);
            return 1;
        }
        if (gLCapabilities.GL_KHR_debug) {
            KHRDebug.glDebugMessageCallback(null, (long)0L);
            if (gLCapabilities.OpenGL30 && (GL43C.glGetInteger((int)33310) & 2) == 0) {
                GL43C.glDisable((int)37600);
            }
            return 1;
        }
        if (gLCapabilities.GL_ARB_debug_output) {
            ARBDebugOutput.glDebugMessageCallbackARB(null, (long)0L);
            return 1;
        }
        if (gLCapabilities.GL_AMD_debug_output) {
            AMDDebugOutput.glDebugMessageCallbackAMD(null, (long)0L);
            return 1;
        }
        Iris.logger.info("[GL] No debug output implementation is available, cannot disable debug info.");
        return 0;
    }

    private static void printTrace(PrintStream printStream) {
        GLDebug.trace(new GLDebug$1(printStream));
    }

    private static String getTypeARB(int n) {
        return switch (n) {
            case 33356 -> "ERROR";
            case 33357 -> "DEPRECATED BEHAVIOR";
            case 33358 -> "UNDEFINED BEHAVIOR";
            case 33359 -> "PORTABILITY";
            case 33360 -> "PERFORMANCE";
            case 33361 -> "OTHER";
            default -> APIUtil.apiUnknownToken((int)n);
        };
    }

    public static void pushGroup(int n, String string) {
        debugState.pushGroup(n, string);
    }
}

