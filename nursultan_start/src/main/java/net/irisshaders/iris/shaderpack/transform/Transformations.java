/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.shaderpack.transform;

import net.irisshaders.iris.shaderpack.transform.Transformations$InjectionPoint;

public interface Transformations {
    public boolean contains(String var1);

    public String getPrefix();

    public void setPrefix(String var1);

    public void define(String var1, String var2);

    public void injectLine(Transformations$InjectionPoint var1, String var2);

    public void replaceRegex(String var1, String var2);

    public void replaceExact(String var1, String var2);
}

