/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.ImmutableSet$Builder
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntList
 *  net.irisshaders.iris.helpers.OptionalBoolean
 *  net.irisshaders.iris.shaderpack.include.AbsolutePackPath
 */
package net.irisshaders.iris.shaderpack.option;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.irisshaders.iris.helpers.OptionalBoolean;
import net.irisshaders.iris.shaderpack.include.AbsolutePackPath;
import net.irisshaders.iris.shaderpack.option.BooleanOption;
import net.irisshaders.iris.shaderpack.option.OptionAnnotatedSource$AnnotationsBuilder;
import net.irisshaders.iris.shaderpack.option.OptionLocation;
import net.irisshaders.iris.shaderpack.option.OptionSet;
import net.irisshaders.iris.shaderpack.option.OptionSet$Builder;
import net.irisshaders.iris.shaderpack.option.OptionType;
import net.irisshaders.iris.shaderpack.option.StringOption;
import net.irisshaders.iris.shaderpack.option.values.OptionValues;
import net.irisshaders.iris.shaderpack.parsing.ParsedString;
import net.irisshaders.iris.shaderpack.transform.line.LineTransform;

public final class OptionAnnotatedSource {
    private static final ImmutableSet<String> VALID_CONST_OPTION_NAMES;
    private final ImmutableList<String> lines;
    private final ImmutableMap<Integer, BooleanOption> booleanOptions;
    private final ImmutableMap<Integer, StringOption> stringOptions;
    private final ImmutableMap<Integer, String> diagnostics;
    private final ImmutableMap<String, IntList> booleanDefineReferences;

    public OptionSet getOptionSet(AbsolutePackPath absolutePackPath, Set<String> set) {
        OptionSet$Builder optionSet$Builder = OptionSet.builder();
        this.booleanOptions.forEach((n, booleanOption) -> {
            if (set.contains(booleanOption.getName())) {
                OptionLocation optionLocation = new OptionLocation(absolutePackPath, (int)n);
                optionSet$Builder.addBooleanOption(optionLocation, (BooleanOption)booleanOption);
            }
        });
        this.stringOptions.forEach((n, stringOption) -> {
            OptionLocation optionLocation = new OptionLocation(absolutePackPath, (int)n);
            optionSet$Builder.addStringOption(optionLocation, (StringOption)stringOption);
        });
        return optionSet$Builder.build();
    }

    public ImmutableMap<Integer, BooleanOption> getBooleanOptions() {
        return this.booleanOptions;
    }

    public ImmutableMap<Integer, StringOption> getStringOptions() {
        return this.stringOptions;
    }

    private static void parseLine(OptionAnnotatedSource$AnnotationsBuilder optionAnnotatedSource$AnnotationsBuilder, int n, String string) {
        if (!(string.contains("#define") || string.contains("const") || string.contains("#ifdef") || string.contains("#ifndef"))) {
            return;
        }
        ParsedString parsedString = new ParsedString(string.trim());
        if (parsedString.takeLiteral("#ifdef") || parsedString.takeLiteral("#ifndef")) {
            OptionAnnotatedSource.parseIfdef(optionAnnotatedSource$AnnotationsBuilder, n, parsedString);
        } else if (parsedString.takeLiteral("const")) {
            OptionAnnotatedSource.parseConst(optionAnnotatedSource$AnnotationsBuilder, n, parsedString);
        } else if (parsedString.currentlyContains("#define")) {
            OptionAnnotatedSource.parseDefineOption(optionAnnotatedSource$AnnotationsBuilder, n, parsedString);
        }
    }

    private static void parseConst(OptionAnnotatedSource$AnnotationsBuilder optionAnnotatedSource$AnnotationsBuilder, int n, ParsedString parsedString) {
        String string;
        boolean bl;
        if (!parsedString.takeSomeWhitespace()) {
            optionAnnotatedSource$AnnotationsBuilder.diagnostics.put((Object)n, (Object)"Expected whitespace after const and before type declaration");
            return;
        }
        if (parsedString.takeLiteral("int") || parsedString.takeLiteral("float")) {
            bl = true;
        } else if (parsedString.takeLiteral("bool")) {
            bl = false;
        } else {
            optionAnnotatedSource$AnnotationsBuilder.diagnostics.put((Object)n, (Object)"Unexpected type declaration after const. Expected int, float, or bool. Vector const declarations cannot be configured using shader options.");
            return;
        }
        if (!parsedString.takeSomeWhitespace()) {
            optionAnnotatedSource$AnnotationsBuilder.diagnostics.put((Object)n, (Object)"Expected whitespace after type declaration.");
            return;
        }
        String string2 = parsedString.takeWord();
        if (string2 == null) {
            optionAnnotatedSource$AnnotationsBuilder.diagnostics.put((Object)n, (Object)"Expected name of option after type declaration, but an unexpected character was detected first.");
            return;
        }
        parsedString.takeSomeWhitespace();
        if (!parsedString.takeLiteral("=")) {
            optionAnnotatedSource$AnnotationsBuilder.diagnostics.put((Object)n, (Object)"Unexpected characters before equals sign in const declaration.");
            return;
        }
        parsedString.takeSomeWhitespace();
        String string3 = parsedString.takeWordOrNumber();
        if (string3 == null) {
            optionAnnotatedSource$AnnotationsBuilder.diagnostics.put((Object)n, (Object)"Unexpected non-whitespace characters after equals sign");
            return;
        }
        parsedString.takeSomeWhitespace();
        if (!parsedString.takeLiteral(";")) {
            optionAnnotatedSource$AnnotationsBuilder.diagnostics.put((Object)n, (Object)"Value between the equals sign and the semicolon wasn't parsed as a valid word or number.");
            return;
        }
        parsedString.takeSomeWhitespace();
        if (parsedString.takeComments()) {
            string = parsedString.takeRest().trim();
        } else {
            if (!parsedString.isEnd()) {
                optionAnnotatedSource$AnnotationsBuilder.diagnostics.put((Object)n, (Object)"Unexpected non-whitespace characters outside of comment after semicolon");
                return;
            }
            string = null;
        }
        if (!bl) {
            boolean bl2;
            if ("true".equals(string3)) {
                bl2 = true;
            } else if ("false".equals(string3)) {
                bl2 = false;
            } else {
                optionAnnotatedSource$AnnotationsBuilder.diagnostics.put((Object)n, (Object)("Expected true or false as the value of a boolean const option, but got " + string3 + "."));
                return;
            }
            if (!VALID_CONST_OPTION_NAMES.contains((Object)string2)) {
                optionAnnotatedSource$AnnotationsBuilder.diagnostics.put((Object)n, (Object)("This was a valid const boolean option declaration, but " + string2 + " was not recognized as being a name of one of the configurable const options."));
                return;
            }
            optionAnnotatedSource$AnnotationsBuilder.booleanOptions.put((Object)n, (Object)new BooleanOption(OptionType.CONST, string2, string, bl2));
            return;
        }
        if (!VALID_CONST_OPTION_NAMES.contains((Object)string2)) {
            optionAnnotatedSource$AnnotationsBuilder.diagnostics.put((Object)n, (Object)("This was a valid const option declaration, but " + string2 + " was not recognized as being a name of one of the configurable const options."));
            return;
        }
        StringOption stringOption = StringOption.create(OptionType.CONST, string2, string, string3);
        if (stringOption != null) {
            optionAnnotatedSource$AnnotationsBuilder.stringOptions.put((Object)n, (Object)stringOption);
        } else {
            optionAnnotatedSource$AnnotationsBuilder.diagnostics.put((Object)n, (Object)"Ignoring this const option because it is missing an allowed values listin a comment, but is not a boolean const option.");
        }
    }

    public OptionAnnotatedSource(ImmutableList<String> immutableList) {
        this.lines = immutableList;
        OptionAnnotatedSource$AnnotationsBuilder optionAnnotatedSource$AnnotationsBuilder = new OptionAnnotatedSource$AnnotationsBuilder();
        for (int i = 0; i < immutableList.size(); ++i) {
            String string = (String)immutableList.get(i);
            OptionAnnotatedSource.parseLine(optionAnnotatedSource$AnnotationsBuilder, i, string);
        }
        this.booleanOptions = optionAnnotatedSource$AnnotationsBuilder.booleanOptions.build();
        this.stringOptions = optionAnnotatedSource$AnnotationsBuilder.stringOptions.build();
        this.diagnostics = optionAnnotatedSource$AnnotationsBuilder.diagnostics.build();
        this.booleanDefineReferences = ImmutableMap.copyOf(optionAnnotatedSource$AnnotationsBuilder.booleanDefineReferences);
    }

    public OptionAnnotatedSource(String string) {
        this((ImmutableList<String>)ImmutableList.copyOf((Object[])string.split("\\R")));
    }

    static {
        ImmutableSet.Builder builder = ImmutableSet.builder().add((Object[])new String[]{"shadowMapResolution", "shadowDistance", "voxelDistance", "shadowDistanceRenderMul", "entityShadowDistanceMul", "shadowIntervalSize", "generateShadowMipmap", "generateShadowColorMipmap", "shadowHardwareFiltering", "shadowtex0Mipmap", "shadowtexMipmap", "shadowtex1Mipmap", "shadowtex0Nearest", "shadowtexNearest", "shadow0MinMagNearest", "shadowtex1Nearest", "shadow1MinMagNearest", "wetnessHalflife", "drynessHalflife", "eyeBrightnessHalflife", "centerDepthHalflife", "sunPathRotation", "ambientOcclusionLevel", "superSamplingLevel", "noiseTextureResolution"});
        for (int i = 0; i < 8; ++i) {
            builder.add((Object)("shadowcolor" + i + "Mipmap"));
            builder.add((Object)("shadowColor" + i + "Mipmap"));
            builder.add((Object)("shadowcolor" + i + "Nearest"));
            builder.add((Object)("shadowColor" + i + "Nearest"));
            builder.add((Object)("shadowcolor" + i + "MinMagNearest"));
            builder.add((Object)("shadowColor" + i + "MinMagNearest"));
            builder.add((Object)("shadowHardwareFiltering" + i));
        }
        VALID_CONST_OPTION_NAMES = builder.build();
    }

    public String apply(OptionValues optionValues) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < this.lines.size(); ++i) {
            stringBuilder.append(this.edit(optionValues, i, (String)this.lines.get(i)));
            stringBuilder.append('\n');
        }
        return stringBuilder.toString();
    }

    private String edit(OptionValues optionValues, int n, String string) {
        BooleanOption booleanOption = (BooleanOption)this.booleanOptions.get((Object)n);
        if (booleanOption != null) {
            OptionalBoolean optionalBoolean = optionValues.getBooleanValue(booleanOption.getName());
            if (booleanOption.getType() == OptionType.DEFINE) {
                return OptionAnnotatedSource.setBooleanDefineValue(string, optionalBoolean, booleanOption.getDefaultValue());
            }
            if (booleanOption.getType() == OptionType.CONST) {
                if (optionalBoolean != OptionalBoolean.DEFAULT) {
                    return this.editConst(string, Boolean.toString(booleanOption.getDefaultValue()), Boolean.toString(optionalBoolean.orElse(booleanOption.getDefaultValue())));
                }
                return string;
            }
            throw new AssertionError((Object)("Unknown option type " + String.valueOf((Object)booleanOption.getType())));
        }
        StringOption stringOption = (StringOption)this.stringOptions.get((Object)n);
        if (stringOption != null) {
            return optionValues.getStringValue(stringOption.getName()).map(string2 -> {
                if (stringOption.getType() == OptionType.DEFINE) {
                    return "#define " + stringOption.getName() + " " + string2 + " // OptionAnnotatedSource: Changed option";
                }
                if (stringOption.getType() == OptionType.CONST) {
                    return this.editConst(string, stringOption.getDefaultValue(), (String)string2);
                }
                throw new AssertionError((Object)("Unknown option type " + String.valueOf((Object)stringOption.getType())));
            }).orElse(string);
        }
        return string;
    }

    private String editConst(String string, String string2, String string3) {
        int n = string.indexOf(61);
        if (n == -1) {
            throw new IllegalStateException();
        }
        String string4 = string.substring(0, n);
        String string5 = string.substring(n);
        string5 = string5.replaceFirst(Pattern.quote(string2), Matcher.quoteReplacement(string3));
        return string4 + string5;
    }

    private static void parseIfdef(OptionAnnotatedSource$AnnotationsBuilder optionAnnotatedSource$AnnotationsBuilder, int n, ParsedString parsedString) {
        if (!parsedString.takeSomeWhitespace()) {
            return;
        }
        String string2 = parsedString.takeWord();
        parsedString.takeSomeWhitespace();
        if (string2 == null || !parsedString.isEnd()) {
            return;
        }
        optionAnnotatedSource$AnnotationsBuilder.booleanDefineReferences.computeIfAbsent(string2, string -> new IntArrayList()).add(n);
    }

    public ImmutableMap<Integer, String> getDiagnostics() {
        return this.diagnostics;
    }

    private static void parseDefineOption(OptionAnnotatedSource$AnnotationsBuilder optionAnnotatedSource$AnnotationsBuilder, int n, ParsedString parsedString) {
        String string;
        StringOption stringOption;
        boolean bl = parsedString.takeComments();
        parsedString.takeSomeWhitespace();
        if (!parsedString.takeLiteral("#define")) {
            optionAnnotatedSource$AnnotationsBuilder.diagnostics.put((Object)n, (Object)"This line contains an occurrence of \"#define\" but it wasn't in a place we expected, ignoring it.");
            return;
        }
        if (!parsedString.takeSomeWhitespace()) {
            optionAnnotatedSource$AnnotationsBuilder.diagnostics.put((Object)n, (Object)"This line properly starts with a #define statement but doesn't have any whitespace characters after the #define.");
            return;
        }
        String string2 = parsedString.takeWord();
        if (string2 == null) {
            optionAnnotatedSource$AnnotationsBuilder.diagnostics.put((Object)n, (Object)"Invalid syntax after #define directive. No alphanumeric or underscore characters detected.");
            return;
        }
        boolean bl2 = parsedString.takeSomeWhitespace();
        if (parsedString.isEnd()) {
            optionAnnotatedSource$AnnotationsBuilder.booleanOptions.put((Object)n, (Object)new BooleanOption(OptionType.DEFINE, string2, null, !bl));
            return;
        }
        if (parsedString.takeComments()) {
            String string3 = parsedString.takeRest().trim();
            optionAnnotatedSource$AnnotationsBuilder.booleanOptions.put((Object)n, (Object)new BooleanOption(OptionType.DEFINE, string2, string3, !bl));
            return;
        }
        if (!bl2) {
            optionAnnotatedSource$AnnotationsBuilder.diagnostics.put((Object)n, (Object)"Invalid syntax after #define directive. Only alphanumeric or underscore characters are allowed in option names.");
            return;
        }
        if (bl) {
            optionAnnotatedSource$AnnotationsBuilder.diagnostics.put((Object)n, (Object)"Ignoring potential non-boolean #define option since it has a leading comment. Leading comments (//) are only allowed on boolean #define options.");
            return;
        }
        String string4 = parsedString.takeWordOrNumber();
        if (string4 == null) {
            optionAnnotatedSource$AnnotationsBuilder.diagnostics.put((Object)n, (Object)"Ignoring this #define directive because it doesn't appear to be a boolean #define, and its potential value wasn't a valid number or a valid word.");
            return;
        }
        bl2 = parsedString.takeSomeWhitespace();
        if (parsedString.isEnd()) {
            optionAnnotatedSource$AnnotationsBuilder.diagnostics.put((Object)n, (Object)"Ignoring this #define because it doesn't have a comment containing a list of allowed values afterwards, but it has a value so is therefore not a boolean.");
            return;
        }
        if (!bl2) {
            if (!parsedString.takeComments()) {
                optionAnnotatedSource$AnnotationsBuilder.diagnostics.put((Object)n, (Object)"Invalid syntax after value #define directive. Invalid characters after number or word.");
                return;
            }
        } else if (!parsedString.takeComments()) {
            optionAnnotatedSource$AnnotationsBuilder.diagnostics.put((Object)n, (Object)"Invalid syntax after value #define directive. Only comments may come after the value.");
            return;
        }
        if ((stringOption = StringOption.create(OptionType.DEFINE, string2, string = parsedString.takeRest().trim(), string4)) == null) {
            optionAnnotatedSource$AnnotationsBuilder.diagnostics.put((Object)n, (Object)"Ignoring this #define because it is missing an allowed values listin a comment, but is not a boolean define.");
            return;
        }
        optionAnnotatedSource$AnnotationsBuilder.stringOptions.put((Object)n, (Object)stringOption);
    }

    private static boolean hasLeadingComment(String string) {
        return string.trim().startsWith("//");
    }

    public LineTransform asTransform(OptionValues optionValues) {
        return (n, string) -> this.edit(optionValues, n, string);
    }

    public ImmutableMap<String, IntList> getBooleanDefineReferences() {
        return this.booleanDefineReferences;
    }

    private static String setBooleanDefineValue(String string, OptionalBoolean optionalBoolean, boolean bl) {
        if (OptionAnnotatedSource.hasLeadingComment(string) && optionalBoolean.orElse(bl)) {
            return OptionAnnotatedSource.removeLeadingComment(string);
        }
        if (!optionalBoolean.orElse(bl)) {
            return "//" + string;
        }
        return string;
    }

    private static String removeLeadingComment(String string) {
        ParsedString parsedString = new ParsedString(string);
        parsedString.takeSomeWhitespace();
        parsedString.takeComments();
        return parsedString.takeRest();
    }
}

