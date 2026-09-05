/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.helpers.StringPair
 *  org.anarres.cpp.Feature
 *  org.anarres.cpp.LexerException
 *  org.anarres.cpp.Preprocessor
 *  org.anarres.cpp.PreprocessorListener
 *  org.anarres.cpp.Source
 *  org.anarres.cpp.StringLexerSource
 */
package net.irisshaders.iris.shaderpack.preprocessor;

import net.irisshaders.iris.helpers.StringPair;
import net.irisshaders.iris.shaderpack.preprocessor.GlslCollectingListener;
import org.anarres.cpp.Feature;
import org.anarres.cpp.LexerException;
import org.anarres.cpp.Preprocessor;
import org.anarres.cpp.PreprocessorListener;
import org.anarres.cpp.Source;
import org.anarres.cpp.StringLexerSource;

public class JcppProcessor {
    public static String glslPreprocessSource(String object, Iterable<StringPair> iterable) {
        if (((String)object).contains("#warning IRIS_JCPP_GLSL_VERSION") || ((String)object).contains("#warning IRIS_JCPP_GLSL_EXTENSION")) {
            throw new RuntimeException("Some shader author is trying to exploit internal Iris implementation details, stop!");
        }
        object = ((String)object).replace("#version", "#warning IRIS_JCPP_GLSL_VERSION");
        object = ((String)object).replace("#extension", "#warning IRIS_JCPP_GLSL_EXTENSION");
        object = ((String)object).replace("\u0000", "");
        GlslCollectingListener glslCollectingListener = new GlslCollectingListener();
        Preprocessor preprocessor = new Preprocessor();
        try {
            for (StringPair stringPair : iterable) {
                preprocessor.addMacro(stringPair.key(), stringPair.value());
            }
        }
        catch (LexerException lexerException) {
            throw new RuntimeException("Unexpected LexerException processing macros", lexerException);
        }
        preprocessor.setListener((PreprocessorListener)glslCollectingListener);
        preprocessor.addInput((Source)new StringLexerSource((String)object, true));
        preprocessor.addFeature(Feature.KEEPCOMMENTS);
        StringBuilder stringBuilder = new StringBuilder();
        try {
            StringPair stringPair;
            while ((stringPair = preprocessor.token()) != null && stringPair.getType() != 265) {
                stringBuilder.append(stringPair.getText());
            }
        }
        catch (Exception exception) {
            throw new RuntimeException("GLSL source pre-processing failed", exception);
        }
        stringBuilder.append("\n");
        object = glslCollectingListener.collectLines() + String.valueOf(stringBuilder);
        return object;
    }
}

