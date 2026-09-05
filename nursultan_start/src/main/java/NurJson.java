/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

final class NurJson {
    private final String s;
    private int i;

    private NurJson(String string) {
        this.s = string;
    }

    static Object parse(String string) {
        NurJson nurJson = new NurJson(string);
        nurJson.ws();
        Object object = nurJson.value();
        nurJson.ws();
        return object;
    }

    private void ws() {
        while (this.i < this.s.length()) {
            char c = this.s.charAt(this.i);
            if (c == ' ' || c == '\t' || c == '\r' || c == '\n' || c == '\ufeff') {
                ++this.i;
                continue;
            }
            return;
        }
    }

    private Object value() {
        char c = this.s.charAt(this.i);
        switch (c) {
            case '{': {
                return this.obj();
            }
            case '[': {
                return this.arr();
            }
            case '\"': {
                return this.str();
            }
            case 't': {
                this.i += 4;
                return Boolean.TRUE;
            }
            case 'f': {
                this.i += 5;
                return Boolean.FALSE;
            }
            case 'n': {
                this.i += 4;
                return null;
            }
        }
        return this.num();
    }

    private Map<String, Object> obj() {
        char c;
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<String, Object>();
        ++this.i;
        this.ws();
        if (this.s.charAt(this.i) == '}') {
            ++this.i;
            return linkedHashMap;
        }
        do {
            this.ws();
            String string = this.str();
            this.ws();
            ++this.i;
            this.ws();
            linkedHashMap.put(string, this.value());
            this.ws();
        } while ((c = this.s.charAt(this.i++)) != '}');
        return linkedHashMap;
    }

    private List<Object> arr() {
        char c;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        ++this.i;
        this.ws();
        if (this.s.charAt(this.i) == ']') {
            ++this.i;
            return arrayList;
        }
        do {
            this.ws();
            arrayList.add(this.value());
            this.ws();
        } while ((c = this.s.charAt(this.i++)) != ']');
        return arrayList;
    }

    private String str() {
        StringBuilder stringBuilder = new StringBuilder();
        ++this.i;
        char c;
        block8: while ((c = this.s.charAt(this.i++)) != '\"') {
            if (c != '\\') {
                stringBuilder.append(c);
                continue;
            }
            char c2 = this.s.charAt(this.i++);
            switch (c2) {
                case 'n': {
                    stringBuilder.append('\n');
                    continue block8;
                }
                case 't': {
                    stringBuilder.append('\t');
                    continue block8;
                }
                case 'r': {
                    stringBuilder.append('\r');
                    continue block8;
                }
                case 'b': {
                    stringBuilder.append('\b');
                    continue block8;
                }
                case 'f': {
                    stringBuilder.append('\f');
                    continue block8;
                }
                case 'u': {
                    stringBuilder.append((char)Integer.parseInt(this.s.substring(this.i, this.i + 4), 16));
                    this.i += 4;
                    continue block8;
                }
            }
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }

    private Number num() {
        char c;
        int n = this.i;
        while (this.i < this.s.length() && ((c = this.s.charAt(this.i)) == '-' || c == '+' || c == '.' || c == 'e' || c == 'E' || c >= '0' && c <= '9')) {
            ++this.i;
        }
        String string = this.s.substring(n, this.i);
        if (string.indexOf(46) >= 0 || string.indexOf(101) >= 0 || string.indexOf(69) >= 0) {
            return Double.valueOf(string);
        }
        try {
            return Integer.valueOf(string);
        }
        catch (NumberFormatException numberFormatException) {
            return Long.valueOf(string);
        }
    }
}

