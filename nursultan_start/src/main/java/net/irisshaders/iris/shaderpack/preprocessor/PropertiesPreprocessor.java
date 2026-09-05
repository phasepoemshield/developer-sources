/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.helpers.StringPair
 *  org.anarres.cpp.Feature
 *  org.anarres.cpp.LexerException
 *  org.anarres.cpp.Preprocessor
 *  org.anarres.cpp.PreprocessorCommand
 *  org.anarres.cpp.PreprocessorListener
 *  org.anarres.cpp.Source
 *  org.anarres.cpp.StringLexerSource
 *  org.anarres.cpp.Token
 */
package net.irisshaders.iris.shaderpack.preprocessor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.helpers.StringPair;
import net.irisshaders.iris.shaderpack.option.ShaderPackOptions;
import net.irisshaders.iris.shaderpack.preprocessor.PropertiesCommentListener;
import net.irisshaders.iris.shaderpack.preprocessor.PropertyCollectingListener;
import org.anarres.cpp.Feature;
import org.anarres.cpp.LexerException;
import org.anarres.cpp.Preprocessor;
import org.anarres.cpp.PreprocessorCommand;
import org.anarres.cpp.PreprocessorListener;
import org.anarres.cpp.Source;
import org.anarres.cpp.StringLexerSource;
import org.anarres.cpp.Token;

public class PropertiesPreprocessor {
    public static final Pattern BACKSLASH_MATCHER = Pattern.compile("(?<!\\\\\\n)^(?![ \\t]*(#|block\\.\\d*|layer\\.\\d*|item\\.\\d*|entity\\.\\d*|dimension\\.\\d*)).+", 8);

    private static List<String> getBooleanValues(ShaderPackOptions shaderPackOptions) {
        ArrayList<String> arrayList = new ArrayList<String>();
        shaderPackOptions.getOptionSet().getBooleanOptions().forEach((string, mergedBooleanOption) -> {
            boolean bl = shaderPackOptions.getOptionValues().getBooleanValueOrDefault((String)string);
            if (bl) {
                arrayList.add((String)string);
            }
        });
        return arrayList;
    }

    private static Map<String, String> getStringValues(ShaderPackOptions shaderPackOptions) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        shaderPackOptions.getOptionSet().getStringOptions().forEach((string, mergedStringOption) -> hashMap.put((String)string, shaderPackOptions.getOptionValues().getStringValueOrDefault((String)string)));
        return hashMap;
    }

    private static String process(Preprocessor preprocessor, String object) {
        preprocessor.setListener((PreprocessorListener)new PropertiesCommentListener());
        PropertyCollectingListener propertyCollectingListener = new PropertyCollectingListener();
        preprocessor.setListener((PreprocessorListener)propertyCollectingListener);
        object = Arrays.stream(((String)object).split("\\R")).map(String::trim).filter(string -> !string.isBlank()).map(string -> {
            if (string.startsWith("#")) {
                for (PreprocessorCommand preprocessorCommand : PreprocessorCommand.values()) {
                    if (!string.startsWith("#" + preprocessorCommand.name().replace("PP_", "").toLowerCase(Locale.ROOT))) continue;
                    return string;
                }
                return "";
            }
            return string.replace("#", "");
        }).collect(Collectors.joining("\n")) + "\n";
        object = ((String)object).replace("\\", "IRIS_PASSTHROUGHBACKSLASH");
        preprocessor.addInput((Source)new StringLexerSource((String)object, true));
        preprocessor.addFeature(Feature.KEEPCOMMENTS);
        StringBuilder stringBuilder = new StringBuilder();
        try {
            Token token;
            while ((token = preprocessor.token()) != null && token.getType() != 265) {
                stringBuilder.append(token.getText());
            }
        }
        catch (Exception exception) {
            Iris.logger.error("Properties pre-processing failed", (Throwable)exception);
        }
        object = stringBuilder.toString();
        return (propertyCollectingListener.collectLines() + (String)object).replace("IRIS_PASSTHROUGHBACKSLASH", "\\");
    }

    public static String preprocessSource(String string3, ShaderPackOptions shaderPackOptions, Iterable<StringPair> iterable) {
        String string4;
        if (string3.contains("#warning IRIS_PASSTHROUGH ") || string3.contains("IRIS_PASSTHROUGHBACKSLASH")) {
            throw new RuntimeException("Some shader author is trying to exploit internal Iris implementation details, stop!");
        }
        List<String> list = PropertiesPreprocessor.getBooleanValues(shaderPackOptions);
        Map<String, String> map = PropertiesPreprocessor.getStringValues(shaderPackOptions);
        Preprocessor preprocessor = new Preprocessor();
        try {
            for (String string5 : list) {
                preprocessor.addMacro(string5);
            }
            for (StringPair stringPair : iterable) {
                if (stringPair.value().isEmpty()) {
                    preprocessor.addMacro(stringPair.key());
                    continue;
                }
                preprocessor.addMacro(stringPair.key(), stringPair.value());
            }
            map.forEach((string, string2) -> {
                try {
                    preprocessor.addMacro(string, string2);
                }
                catch (LexerException lexerException) {
                    Iris.logger.fatal("Failed to preprocess property file!", (Throwable)lexerException);
                }
            });
            string4 = PropertiesPreprocessor.process(preprocessor, string3);
        }
        catch (Throwable throwable) {
            try {
                try {
                    preprocessor.close();
                }
                catch (Throwable throwable2) {
                    throwable.addSuppressed(throwable2);
                }
                throw throwable;
            }
            catch (IOException iOException) {
                throw new RuntimeException("Unexpected IOException while processing macros", iOException);
            }
            catch (LexerException lexerException) {
                throw new RuntimeException("Unexpected LexerException processing macros", lexerException);
            }
        }
        preprocessor.close();
        return string4;
    }

    public static String preprocessSource(String string, Iterable<StringPair> iterable) {
        if (string.contains("#warning IRIS_PASSTHROUGH ")) {
            throw new RuntimeException("Some shader author is trying to exploit internal Iris implementation details, stop!");
        }
        Preprocessor preprocessor = new Preprocessor();
        try {
            for (StringPair stringPair : iterable) {
                preprocessor.addMacro(stringPair.key(), stringPair.value());
            }
        }
        catch (LexerException lexerException) {
            Iris.logger.fatal("Failed to preprocess property file!", (Throwable)lexerException);
        }
        return PropertiesPreprocessor.process(preprocessor, string);
    }
}

