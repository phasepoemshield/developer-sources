/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntArrayMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  minecraft.class01894
 */
package net.caffeinemc.mods.sodium.client.gl.shader;

import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import minecraft.class01894;
import net.caffeinemc.mods.sodium.client.gl.shader.ShaderConstants;
import net.caffeinemc.mods.sodium.client.gl.shader.ShaderLoader;
import net.caffeinemc.mods.sodium.client.gl.shader.ShaderParser$ParsedShader;

public class ShaderParser {
    private final Object2IntMap<String> includeIds = new Object2IntArrayMap();
    private final List<String> lines = new LinkedList<String>();
    private static final Pattern IMPORT_PATTERN = Pattern.compile("#import <(?<namespace>.*):(?<path>.*)>");

    private ShaderParser$ParsedShader finish() {
        String[] stringArray = new String[this.includeIds.size()];
        this.includeIds.forEach((string, n) -> {
            stringArray[n] = string;
        });
        return new ShaderParser$ParsedShader(String.join((CharSequence)"\n", this.lines), stringArray);
    }

    private ShaderParser() {
    }

    private String lineDirectiveFor(String string, int n) {
        int n2;
        if (!this.includeIds.containsKey((Object)string)) {
            n2 = this.includeIds.size();
            this.includeIds.put((Object)string, n2);
        } else {
            n2 = this.includeIds.getInt((Object)string);
        }
        return "#line " + (n + 1) + " " + n2;
    }

    private void processImport(String string) {
        class01894 class018942 = this.parseImport(string);
        String string2 = class018942.toString();
        this.lines.add(this.lineDirectiveFor(string2, 0));
        this.parseShader(string2, ShaderLoader.getShaderSource(class018942));
    }

    public void parseShader(String string, String string2) {
        int n = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new StringReader(string2));){
            String string3;
            while ((string3 = bufferedReader.readLine()) != null) {
                ++n;
                if (string3.startsWith("#version")) {
                    this.lines.add(string3);
                    this.lines.add(this.lineDirectiveFor(string, n));
                    continue;
                }
                if (string3.startsWith("#import")) {
                    this.lines.add("// START " + string3);
                    this.processImport(string3);
                    this.lines.add("// END " + string3);
                    this.lines.add(this.lineDirectiveFor(string, n));
                    continue;
                }
                this.lines.add(string3);
            }
        }
        catch (IOException iOException) {
            throw new RuntimeException("Failed to read shader sources", iOException);
        }
    }

    public static ShaderParser$ParsedShader parseShader(String string, ShaderConstants shaderConstants) {
        ShaderParser shaderParser = new ShaderParser();
        shaderParser.parseShader("_root", string);
        shaderParser.prependDefineStrings(shaderConstants);
        return shaderParser.finish();
    }

    private class01894 parseImport(String string) {
        Matcher matcher = IMPORT_PATTERN.matcher(string);
        if (!matcher.matches()) {
            throw new IllegalArgumentException("Malformed import statement (expected format: " + String.valueOf(IMPORT_PATTERN) + ")");
        }
        String string2 = matcher.group("namespace");
        String string3 = matcher.group("path");
        return class01894.N((String)string2, (String)string3);
    }

    private void prependDefineStrings(ShaderConstants shaderConstants) {
        this.lines.addAll(1, shaderConstants.getDefineStrings());
    }
}

