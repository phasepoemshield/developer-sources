/*
 * Decompiled with CFR 0.152.
 */
package org.xml.sax.helpers;

import java.util.ArrayList;
import java.util.List;
import org.xml.sax.AttributeList;

@Deprecated(since="1.5")
public class AttributeListImpl
implements AttributeList {
    List<String> names = new ArrayList<String>();
    List<String> types = new ArrayList<String>();
    List<String> values = new ArrayList<String>();

    public AttributeListImpl() {
    }

    public AttributeListImpl(AttributeList attributeList) {
        this.setAttributeList(attributeList);
    }

    public void setAttributeList(AttributeList attributeList) {
        int n = attributeList.getLength();
        this.clear();
        for (int i = 0; i < n; ++i) {
            this.addAttribute(attributeList.getName(i), attributeList.getType(i), attributeList.getValue(i));
        }
    }

    public void addAttribute(String string, String string2, String string3) {
        this.names.add(string);
        this.types.add(string2);
        this.values.add(string3);
    }

    public void removeAttribute(String string) {
        int n = this.names.indexOf(string);
        if (n >= 0) {
            this.names.remove(n);
            this.types.remove(n);
            this.values.remove(n);
        }
    }

    public void clear() {
        this.names.clear();
        this.types.clear();
        this.values.clear();
    }

    @Override
    public int getLength() {
        return this.names.size();
    }

    @Override
    public String getName(int n) {
        if (n < 0) {
            return null;
        }
        try {
            return this.names.get(n);
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            return null;
        }
    }

    @Override
    public String getType(int n) {
        if (n < 0) {
            return null;
        }
        try {
            return this.types.get(n);
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            return null;
        }
    }

    @Override
    public String getValue(int n) {
        if (n < 0) {
            return null;
        }
        try {
            return this.values.get(n);
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            return null;
        }
    }

    @Override
    public String getType(String string) {
        return this.getType(this.names.indexOf(string));
    }

    @Override
    public String getValue(String string) {
        return this.getValue(this.names.indexOf(string));
    }
}

