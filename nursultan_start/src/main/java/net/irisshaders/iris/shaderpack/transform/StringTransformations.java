/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.shaderpack.transform;

import net.irisshaders.iris.shaderpack.transform.Transformations;
import net.irisshaders.iris.shaderpack.transform.Transformations$InjectionPoint;

public class StringTransformations
implements Transformations {
    private String prefix;
    private String extensions;
    private StringBuilder injections;
    private String body;
    private StringBuilder suffix;

    public StringTransformations(String string) {
        int n = string.indexOf("#version");
        if (n == -1) {
            throw new IllegalArgumentException("A valid shader should include a version string");
        }
        String string2 = string.substring(0, n);
        string = string.substring(n);
        int n2 = string.indexOf("\n") + 1;
        this.prefix = string2 + string.substring(0, n2);
        this.extensions = "";
        this.injections = new StringBuilder();
        this.body = string.substring(n2);
        this.suffix = new StringBuilder("\n");
        if (!this.body.contains("#extension")) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        boolean bl = false;
        for (String string3 : this.body.split("\\R")) {
            String string4 = string3.trim();
            if (!(string4.isEmpty() || string4.startsWith("#extension") || string4.startsWith("//"))) {
                bl = true;
            }
            if (bl) {
                stringBuilder2.append(string3);
                stringBuilder2.append('\n');
                continue;
            }
            stringBuilder.append(string3);
            stringBuilder.append('\n');
        }
        this.extensions = stringBuilder.toString();
        this.body = stringBuilder2.toString();
    }

    public String toString() {
        return this.prefix + this.extensions + String.valueOf(this.injections) + this.body + String.valueOf(this.suffix);
    }

    @Override
    public boolean contains(String string) {
        return this.toString().contains(string);
    }

    @Override
    public String getPrefix() {
        return this.prefix;
    }

    @Override
    public void setPrefix(String string) {
        this.prefix = string;
    }

    @Override
    public void define(String string, String string2) {
        this.extensions = this.extensions + "#define " + string + " " + string2 + "\n";
    }

    @Override
    public void injectLine(Transformations$InjectionPoint transformations$InjectionPoint, String string) {
        if (transformations$InjectionPoint == Transformations$InjectionPoint.BEFORE_CODE) {
            this.injections.append(string);
            this.injections.append('\n');
        } else if (transformations$InjectionPoint == Transformations$InjectionPoint.DEFINES) {
            this.extensions = this.extensions + string + "\n";
        } else if (transformations$InjectionPoint == Transformations$InjectionPoint.END) {
            this.suffix.append(string);
            this.suffix.append('\n');
        } else {
            throw new IllegalArgumentException("Unsupported injection point: " + String.valueOf((Object)transformations$InjectionPoint));
        }
    }

    @Override
    public void replaceRegex(String string, String string2) {
        this.prefix = this.prefix.replaceAll(string, string2);
        this.extensions = this.extensions.replaceAll(string, string2);
        this.injections = new StringBuilder(this.injections.toString().replaceAll(string, string2));
        this.body = this.body.replaceAll(string, string2);
        this.suffix = new StringBuilder(this.suffix.toString().replaceAll(string, string2));
    }

    @Override
    public void replaceExact(String string, String string2) {
        if (string.contains("\n")) {
            throw new UnsupportedOperationException();
        }
        this.prefix = this.prefix.replace(string, string2);
        this.extensions = this.extensions.replace(string, string2);
        this.injections = new StringBuilder(this.injections.toString().replace(string, string2));
        this.body = this.body.replace(string, string2);
        this.suffix = new StringBuilder(this.suffix.toString().replace(string, string2));
    }
}

