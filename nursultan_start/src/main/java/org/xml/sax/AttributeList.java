/*
 * Decompiled with CFR 0.152.
 */
package org.xml.sax;

@Deprecated(since="1.5")
public interface AttributeList {
    public int getLength();

    public String getName(int var1);

    public String getType(int var1);

    public String getValue(int var1);

    public String getType(String var1);

    public String getValue(String var1);
}

