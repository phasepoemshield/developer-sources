/*
 * Decompiled with CFR 0.152.
 */
package org.xml.sax.helpers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EmptyStackException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NamespaceSupport {
    public static final String XMLNS = "http://www.w3.org/XML/1998/namespace";
    public static final String NSDECL = "http://www.w3.org/xmlns/2000/";
    private static final Enumeration<String> EMPTY_ENUMERATION = Collections.enumeration(new ArrayList());
    private Context[] contexts;
    private Context currentContext;
    private int contextPos;
    private boolean namespaceDeclUris;

    public NamespaceSupport() {
        this.reset();
    }

    public void reset() {
        this.contexts = new Context[32];
        this.namespaceDeclUris = false;
        this.contextPos = 0;
        this.contexts[this.contextPos] = this.currentContext = new Context();
        this.currentContext.declarePrefix("xml", XMLNS);
    }

    public void pushContext() {
        int n = this.contexts.length;
        ++this.contextPos;
        if (this.contextPos >= n) {
            Context[] contextArray = new Context[n * 2];
            System.arraycopy(this.contexts, 0, contextArray, 0, n);
            n *= 2;
            this.contexts = contextArray;
        }
        this.currentContext = this.contexts[this.contextPos];
        if (this.currentContext == null) {
            this.contexts[this.contextPos] = this.currentContext = new Context();
        }
        if (this.contextPos > 0) {
            this.currentContext.setParent(this.contexts[this.contextPos - 1]);
        }
    }

    public void popContext() {
        this.contexts[this.contextPos].clear();
        --this.contextPos;
        if (this.contextPos < 0) {
            throw new EmptyStackException();
        }
        this.currentContext = this.contexts[this.contextPos];
    }

    public boolean declarePrefix(String string, String string2) {
        if (string.equals("xml") || string.equals("xmlns")) {
            return false;
        }
        this.currentContext.declarePrefix(string, string2);
        return true;
    }

    public String[] processName(String string, String[] stringArray, boolean bl) {
        String[] stringArray2 = this.currentContext.processName(string, bl);
        if (stringArray2 == null) {
            return null;
        }
        stringArray[0] = stringArray2[0];
        stringArray[1] = stringArray2[1];
        stringArray[2] = stringArray2[2];
        return stringArray;
    }

    public String getURI(String string) {
        return this.currentContext.getURI(string);
    }

    public Enumeration<String> getPrefixes() {
        return this.currentContext.getPrefixes();
    }

    public String getPrefix(String string) {
        return this.currentContext.getPrefix(string);
    }

    public Enumeration<String> getPrefixes(String string) {
        ArrayList<String> arrayList = new ArrayList<String>();
        Enumeration<String> enumeration = this.getPrefixes();
        while (enumeration.hasMoreElements()) {
            String string2 = enumeration.nextElement();
            if (!string.equals(this.getURI(string2))) continue;
            arrayList.add(string2);
        }
        return Collections.enumeration(arrayList);
    }

    public Enumeration<String> getDeclaredPrefixes() {
        return this.currentContext.getDeclaredPrefixes();
    }

    public void setNamespaceDeclUris(boolean bl) {
        if (this.contextPos != 0) {
            throw new IllegalStateException();
        }
        if (bl == this.namespaceDeclUris) {
            return;
        }
        this.namespaceDeclUris = bl;
        if (bl) {
            this.currentContext.declarePrefix("xmlns", NSDECL);
        } else {
            this.contexts[this.contextPos] = this.currentContext = new Context();
            this.currentContext.declarePrefix("xml", XMLNS);
        }
    }

    public boolean isNamespaceDeclUris() {
        return this.namespaceDeclUris;
    }

    final class Context {
        Map<String, String> prefixTable;
        Map<String, String> uriTable;
        Map<String, String[]> elementNameTable;
        Map<String, String[]> attributeNameTable;
        String defaultNS = null;
        private List<String> declarations = null;
        private boolean declSeen = false;
        private Context parent = null;

        Context() {
            this.copyTables();
        }

        void setParent(Context context) {
            this.parent = context;
            this.declarations = null;
            this.prefixTable = context.prefixTable;
            this.uriTable = context.uriTable;
            this.elementNameTable = context.elementNameTable;
            this.attributeNameTable = context.attributeNameTable;
            this.defaultNS = context.defaultNS;
            this.declSeen = false;
        }

        void clear() {
            this.parent = null;
            this.prefixTable = null;
            this.uriTable = null;
            this.elementNameTable = null;
            this.attributeNameTable = null;
            this.defaultNS = null;
        }

        void declarePrefix(String string, String string2) {
            if (!this.declSeen) {
                this.copyTables();
            }
            if (this.declarations == null) {
                this.declarations = new ArrayList<String>();
            }
            string = string.intern();
            string2 = string2.intern();
            if ("".equals(string)) {
                this.defaultNS = "".equals(string2) ? null : string2;
            } else {
                this.prefixTable.put(string, string2);
                this.uriTable.put(string2, string);
            }
            this.declarations.add(string);
        }

        String[] processName(String string, boolean bl) {
            Map<String, String[]> map = bl ? this.attributeNameTable : this.elementNameTable;
            String[] stringArray = map.get(string);
            if (stringArray != null) {
                return stringArray;
            }
            stringArray = new String[3];
            stringArray[2] = string.intern();
            int n = string.indexOf(58);
            if (n == -1) {
                stringArray[0] = bl ? (string == "xmlns" && NamespaceSupport.this.namespaceDeclUris ? NamespaceSupport.NSDECL : "") : (this.defaultNS == null ? "" : this.defaultNS);
                stringArray[1] = stringArray[2];
            } else {
                String string2 = string.substring(0, n);
                String string3 = string.substring(n + 1);
                String string4 = "".equals(string2) ? this.defaultNS : this.prefixTable.get(string2);
                if (string4 == null || !bl && "xmlns".equals(string2)) {
                    return null;
                }
                stringArray[0] = string4;
                stringArray[1] = string3.intern();
            }
            map.put(stringArray[2], stringArray);
            return stringArray;
        }

        String getURI(String string) {
            if ("".equals(string)) {
                return this.defaultNS;
            }
            if (this.prefixTable == null) {
                return null;
            }
            return this.prefixTable.get(string);
        }

        String getPrefix(String string) {
            if (this.uriTable == null) {
                return null;
            }
            return this.uriTable.get(string);
        }

        Enumeration<String> getDeclaredPrefixes() {
            if (this.declarations == null) {
                return EMPTY_ENUMERATION;
            }
            return Collections.enumeration(this.declarations);
        }

        Enumeration<String> getPrefixes() {
            if (this.prefixTable == null) {
                return EMPTY_ENUMERATION;
            }
            return Collections.enumeration(this.prefixTable.keySet());
        }

        private void copyTables() {
            this.prefixTable = this.prefixTable != null ? new HashMap<String, String>(this.prefixTable) : new HashMap<String, String>();
            this.uriTable = this.uriTable != null ? new HashMap<String, String>(this.uriTable) : new HashMap<String, String>();
            this.elementNameTable = new HashMap<String, String[]>();
            this.attributeNameTable = new HashMap<String, String[]>();
            this.declSeen = true;
        }
    }
}

