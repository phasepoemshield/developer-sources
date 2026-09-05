/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.configbuilder;

import de.maxhenkel.voicechat.configbuilder.CommentedProperties$LineReader;
import de.maxhenkel.voicechat.configbuilder.CommentedProperties$Pair;
import de.maxhenkel.voicechat.configbuilder.CommentedProperties$Property;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class CommentedProperties
implements Map<String, String> {
    private final boolean strict;
    private final List<String> headerComments;
    private final Map<String, CommentedProperties$Property> properties;

    public CommentedProperties(boolean bl) {
        this.strict = bl;
        this.headerComments = new ArrayList<String>();
        this.properties = new LinkedHashMap<String, CommentedProperties$Property>();
    }

    public CommentedProperties() {
        this(true);
    }

    @Override
    public String remove(Object object) {
        CommentedProperties$Property commentedProperties$Property = this.properties.remove(object);
        if (commentedProperties$Property == null) {
            return null;
        }
        return CommentedProperties$Property.access$000(commentedProperties$Property);
    }

    @Override
    public int size() {
        return this.properties.size();
    }

    @Override
    @Nullable
    @Deprecated
    public String get(Object object) {
        if (!(object instanceof String)) {
            return null;
        }
        return this.get((String)object);
    }

    @Nullable
    public String get(String string) {
        Objects.requireNonNull(string);
        CommentedProperties$Property commentedProperties$Property = this.properties.get(string);
        if (commentedProperties$Property == null) {
            return null;
        }
        return CommentedProperties$Property.access$000(commentedProperties$Property);
    }

    @Override
    @Deprecated
    public String put(String string, String string2) {
        Objects.requireNonNull(string);
        Objects.requireNonNull(string2);
        CommentedProperties$Property commentedProperties$Property = this.properties.put(string, new CommentedProperties$Property(string2));
        if (commentedProperties$Property == null) {
            return null;
        }
        return CommentedProperties$Property.access$000(commentedProperties$Property);
    }

    @Override
    @Deprecated
    public Collection<String> values() {
        return this.properties.values().stream().map(commentedProperties$Property -> CommentedProperties$Property.access$000(commentedProperties$Property)).collect(Collectors.toList());
    }

    private static boolean isWhitespace(int n) {
        return n == 32 || n == 9 || n == 13 || n == 12 || Character.isWhitespace(n);
    }

    public CommentedProperties load(InputStream inputStream) throws IOException {
        ArrayList<String> arrayList = new ArrayList<String>();
        LinkedHashMap<String, CommentedProperties$Property> linkedHashMap = new LinkedHashMap<String, CommentedProperties$Property>();
        try (CommentedProperties$LineReader commentedProperties$LineReader = CommentedProperties$LineReader.fromInputStream(inputStream);){
            String string;
            boolean bl = true;
            ArrayList<String> arrayList2 = new ArrayList<String>();
            while ((string = commentedProperties$LineReader.nextLine()) != null) {
                if (string.trim().isEmpty()) {
                    if (!bl) continue;
                    arrayList.addAll(arrayList2);
                    arrayList2.clear();
                    bl = false;
                    continue;
                }
                CommentedProperties$Pair commentedProperties$Pair = CommentedProperties.readLine(string);
                if (CommentedProperties$Pair.access$200(commentedProperties$Pair) == null) {
                    arrayList2.add(CommentedProperties$Pair.access$300(commentedProperties$Pair));
                    continue;
                }
                CommentedProperties$Property commentedProperties$Property = new CommentedProperties$Property(CommentedProperties$Pair.access$300(commentedProperties$Pair));
                CommentedProperties$Property.access$100(commentedProperties$Property).addAll(arrayList2);
                arrayList2.clear();
                linkedHashMap.put(CommentedProperties$Pair.access$200(commentedProperties$Pair), commentedProperties$Property);
                bl = false;
            }
        }
        this.setHeaderComments(arrayList);
        this.properties.clear();
        this.properties.putAll(linkedHashMap);
        return this;
    }

    @Override
    public void clear() {
        this.headerComments.clear();
        this.properties.clear();
    }

    @Override
    public boolean isEmpty() {
        return this.properties.isEmpty();
    }

    @Override
    @Deprecated
    public Set<Map.Entry<String, String>> entrySet() {
        return this.properties.entrySet().stream().map(entry -> new AbstractMap.SimpleEntry<String, String>((String)entry.getKey(), CommentedProperties$Property.access$000((CommentedProperties$Property)entry.getValue()))).collect(Collectors.toSet());
    }

    @Override
    @Deprecated
    public void putAll(Map<? extends String, ? extends String> map) {
        for (Map.Entry<? extends String, ? extends String> entry : map.entrySet()) {
            this.put(entry.getKey(), entry.getValue());
        }
    }

    public CommentedProperties set(String string, String string2, String ... stringArray) {
        Objects.requireNonNull(string);
        Objects.requireNonNull(string2);
        this.properties.put(string, new CommentedProperties$Property(Arrays.asList(stringArray), string2));
        return this;
    }

    @Override
    public boolean containsKey(Object object) {
        return this.properties.containsKey(object);
    }

    protected static CommentedProperties$Pair readLine(String string) throws IOException {
        int n;
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        StringReader stringReader = new StringReader(string);
        boolean bl = true;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = true;
        boolean bl5 = false;
        while ((n = stringReader.read()) != -1) {
            boolean bl6 = CommentedProperties.isWhitespace(n);
            if (bl2) {
                if (bl4 && bl6) continue;
                bl4 = false;
                stringBuilder2.append((char)n);
                continue;
            }
            if (bl3) {
                if (bl) {
                    stringBuilder.append((char)CommentedProperties.readEscapedCharacter(n, stringReader));
                } else {
                    stringBuilder2.append((char)CommentedProperties.readEscapedCharacter(n, stringReader));
                }
                bl3 = false;
                bl5 = false;
                continue;
            }
            if (n == 92) {
                bl3 = true;
                continue;
            }
            if ((n == 35 || n == 33) && bl4) {
                bl2 = true;
                continue;
            }
            if (bl) {
                if (stringBuilder.length() <= 0 && CommentedProperties.isWhitespace(n)) continue;
                if (CommentedProperties.isSeparator(n)) {
                    bl = false;
                    bl5 = true;
                    bl4 = false;
                    continue;
                }
                if (CommentedProperties.isWhitespace(n)) continue;
                stringBuilder.append((char)n);
            } else {
                if (bl5 && (CommentedProperties.isWhitespace(n) || CommentedProperties.isSeparator(n))) continue;
                stringBuilder2.append((char)n);
                bl5 = false;
            }
            if (!bl4 || bl6) continue;
            bl4 = false;
        }
        return new CommentedProperties$Pair(bl2 ? null : stringBuilder.toString(), stringBuilder2.toString());
    }

    void sort(Comparator<String> comparator) {
        ArrayList<Map.Entry<String, CommentedProperties$Property>> arrayList = new ArrayList<Map.Entry<String, CommentedProperties$Property>>(this.properties.entrySet());
        arrayList.sort((entry, entry2) -> comparator.compare((String)entry.getKey(), (String)entry2.getKey()));
        this.properties.clear();
        for (Map.Entry entry3 : arrayList) {
            this.properties.put((String)entry3.getKey(), (CommentedProperties$Property)entry3.getValue());
        }
    }

    @Override
    public Set<String> keySet() {
        return this.properties.keySet();
    }

    @Override
    @Deprecated
    public boolean containsValue(Object object) {
        for (CommentedProperties$Property commentedProperties$Property : this.properties.values()) {
            if (!CommentedProperties$Property.access$000(commentedProperties$Property).equals(object)) continue;
            return true;
        }
        return false;
    }

    public CommentedProperties save(OutputStream outputStream) {
        try (PrintWriter printWriter = new PrintWriter(outputStream);){
            for (String object : CommentedProperties.removeNewLines(this.headerComments)) {
                printWriter.print("# ");
                printWriter.println(object);
            }
            if (this.headerComments.size() > 0) {
                printWriter.println();
            }
            for (Map.Entry entry : this.properties.entrySet()) {
                for (String string : CommentedProperties.removeNewLines(CommentedProperties$Property.access$100((CommentedProperties$Property)entry.getValue()))) {
                    printWriter.print("# ");
                    printWriter.println(string);
                }
                printWriter.print(this.escapeKey((String)entry.getKey()));
                printWriter.print("=");
                printWriter.println(this.escapeValue(CommentedProperties$Property.access$000((CommentedProperties$Property)entry.getValue())));
            }
            printWriter.flush();
        }
        return this;
    }

    private String escape(String string) {
        string = string.replace("\\", "\\\\");
        string = string.replace("\n", "\\n");
        string = string.replace("\r", "\\n");
        string = string.replace("\t", "\\t");
        string = string.replace("#", "\\#");
        string = string.replace("!", "\\!");
        for (int i = 0; i < string.length(); ++i) {
            char c = string.charAt(i);
            if (Character.UnicodeBlock.of(c) == Character.UnicodeBlock.BASIC_LATIN) continue;
            string = String.format("%s\\u%04X%s", string.substring(0, i), (int)c, string.substring(i + 1));
        }
        return string;
    }

    private String escapeValue(String string) {
        string = this.escape(string);
        if (this.strict) {
            string = string.replace("=", "\\=");
            string = string.replace(":", "\\:");
        }
        if (string.startsWith(" ")) {
            string = String.format("\\%s", string);
        }
        return string;
    }

    private static int readEscapedCharacter(int n, StringReader stringReader) throws IOException {
        if (n == 117) {
            int n2 = 0;
            for (int i = 0; i < 4; ++i) {
                int n3 = stringReader.read();
                if (n3 == -1) {
                    throw new IOException("Invalid unicode escape sequence");
                }
                n2 <<= 4;
                if (n3 >= 48 && n3 <= 57) {
                    n2 += n3 - 48;
                    continue;
                }
                if (n3 >= 97 && n3 <= 102) {
                    n2 += n3 - 97 + 10;
                    continue;
                }
                if (n3 >= 65 && n3 <= 70) {
                    n2 += n3 - 65 + 10;
                    continue;
                }
                throw new IOException("Invalid unicode escape sequence");
            }
            return n2;
        }
        if (n == 116) {
            return 9;
        }
        if (n == 114) {
            return 13;
        }
        if (n == 110) {
            return 10;
        }
        if (n == 102) {
            return 12;
        }
        return n;
    }

    public CommentedProperties addHeaderComment(String string) {
        this.headerComments.add(string);
        return this;
    }

    @Nullable
    public List<String> getComments(String string) {
        Objects.requireNonNull(string);
        CommentedProperties$Property commentedProperties$Property = this.properties.get(string);
        if (commentedProperties$Property == null) {
            return null;
        }
        return CommentedProperties$Property.access$100(commentedProperties$Property);
    }

    public CommentedProperties setHeaderComments(List<String> list) {
        this.headerComments.clear();
        this.headerComments.addAll(list);
        return this;
    }

    public CommentedProperties setComments(String string, List<String> list) {
        Objects.requireNonNull(string);
        CommentedProperties$Property commentedProperties$Property = this.properties.get(string);
        if (commentedProperties$Property == null) {
            this.properties.put(string, new CommentedProperties$Property(list, ""));
            return this;
        }
        CommentedProperties$Property.access$102(commentedProperties$Property, list);
        return this;
    }

    private static boolean isSeparator(int n) {
        return n == 61 || n == 58 || n == 32 || n == 9 || n == 12;
    }

    private static List<String> removeNewLines(List<String> list) {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (String string : list) {
            arrayList.addAll(Arrays.asList(string.split("\\r?\\n")));
        }
        return arrayList;
    }

    private String escapeKey(String string) {
        string = this.escape(string);
        string = string.replace(" ", "\\ ");
        string = string.replace("=", "\\=");
        string = string.replace(":", "\\:");
        return string;
    }
}

