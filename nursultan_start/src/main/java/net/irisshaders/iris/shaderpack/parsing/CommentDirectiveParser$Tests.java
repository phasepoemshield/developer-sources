/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.shaderpack.parsing;

import java.util.Optional;
import java.util.function.Supplier;
import net.irisshaders.iris.shaderpack.parsing.CommentDirective;
import net.irisshaders.iris.shaderpack.parsing.CommentDirective$Type;
import net.irisshaders.iris.shaderpack.parsing.CommentDirectiveParser;

class CommentDirectiveParser$Tests {
    private CommentDirectiveParser$Tests() {
    }

    public static void main(String[] stringArray) {
        CommentDirectiveParser$Tests.test("normal text", Optional.empty(), () -> {
            String string = "Some normal text that doesn't contain a DRAWBUFFERS directive of any sort";
            return CommentDirectiveParser.findDirective(string, CommentDirective$Type.DRAWBUFFERS).map(CommentDirective::getDirective);
        });
        CommentDirectiveParser$Tests.test("partial directive", Optional.empty(), () -> {
            String string = "Some normal text that doesn't contain a /* DRAWBUFFERS: directive of any sort";
            return CommentDirectiveParser.findDirective(string, CommentDirective$Type.DRAWBUFFERS).map(CommentDirective::getDirective);
        });
        CommentDirectiveParser$Tests.test("bad spacing", Optional.of("321"), () -> {
            String string = "/*DRAWBUFFERS:321*/ OptiFine will detect this directive, but ShadersMod will not...";
            return CommentDirectiveParser.findDirective(string, CommentDirective$Type.DRAWBUFFERS).map(CommentDirective::getDirective);
        });
        CommentDirectiveParser$Tests.test("matchAtEnd", Optional.of("321"), () -> {
            String string = "A line containing a drawbuffers directive: /* DRAWBUFFERS:321 */";
            return CommentDirectiveParser.findDirective(string, CommentDirective$Type.DRAWBUFFERS).map(CommentDirective::getDirective);
        });
        CommentDirectiveParser$Tests.test("matchAtStart", Optional.of("31"), () -> {
            String string = "/* DRAWBUFFERS:31 */ This is a line containing a drawbuffers directive";
            return CommentDirectiveParser.findDirective(string, CommentDirective$Type.DRAWBUFFERS).map(CommentDirective::getDirective);
        });
        CommentDirectiveParser$Tests.test("matchInMiddle", Optional.of("31"), () -> {
            String string = "This is a line /* DRAWBUFFERS:31 */ containing a drawbuffers directive";
            return CommentDirectiveParser.findDirective(string, CommentDirective$Type.DRAWBUFFERS).map(CommentDirective::getDirective);
        });
        CommentDirectiveParser$Tests.test("emptyMatch", Optional.of(""), () -> {
            String string = "/* DRAWBUFFERS: */ This is a line containing an invalid but still matching drawbuffers directive";
            return CommentDirectiveParser.findDirective(string, CommentDirective$Type.DRAWBUFFERS).map(CommentDirective::getDirective);
        });
        CommentDirectiveParser$Tests.test("duplicates", Optional.of("3"), () -> {
            String string = "/* TEST:2 */ This line contains multiple directives, the last one should be used /* TEST:3 */";
            return CommentDirectiveParser.findDirective(string, CommentDirective$Type.DRAWBUFFERS).map(CommentDirective::getDirective);
        });
        CommentDirectiveParser$Tests.test("multi-line", Optional.of("It works"), () -> {
            String string = "/* Here's a random comment line */\n/* RENDERTARGETS:Duplicate handling? */\nuniform sampler2D test;\n/* RENDERTARGETS:Duplicate handling within a line? */ Let's see /* RENDERTARGETS:It works */\n";
            return CommentDirectiveParser.findDirective(string, CommentDirective$Type.RENDERTARGETS).map(CommentDirective::getDirective);
        });
        CommentDirectiveParser$Tests.test("bad spacing from BSL composite6", Optional.of("12"), () -> {
            String string = "    /*DRAWBUFFERS:12*/";
            return CommentDirectiveParser.findDirective(string, CommentDirective$Type.DRAWBUFFERS).map(CommentDirective::getDirective);
        });
    }

    private static <T> void test(String string, T t, Supplier<T> supplier) {
        T t2;
        try {
            t2 = supplier.get();
        }
        catch (Throwable throwable) {
            System.err.println("Test \"" + string + "\" failed with an exception:");
            throwable.printStackTrace();
            return;
        }
        if (!t.equals(t2)) {
            System.err.println("Test \"" + string + "\" failed: Expected " + String.valueOf(t) + ", got " + String.valueOf(t2));
        } else {
            System.out.println("Test \"" + string + "\" passed");
        }
    }
}

