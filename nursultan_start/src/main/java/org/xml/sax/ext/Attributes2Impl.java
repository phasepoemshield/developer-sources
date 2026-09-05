/*
 * Decompiled with CFR 0.152.
 */
package org.xml.sax.ext;

import org.xml.sax.Attributes;
import org.xml.sax.ext.Attributes2;
import org.xml.sax.helpers.AttributesImpl;

public class Attributes2Impl
extends AttributesImpl
implements Attributes2 {
    private boolean[] declared;
    private boolean[] specified;

    public Attributes2Impl() {
        this.specified = null;
        this.declared = null;
    }

    public Attributes2Impl(Attributes attributes) {
        super(attributes);
    }

    @Override
    public boolean isDeclared(int n) {
        if (n < 0 || n >= this.getLength()) {
            throw new ArrayIndexOutOfBoundsException("No attribute at index: " + n);
        }
        return this.declared[n];
    }

    @Override
    public boolean isDeclared(String string, String string2) {
        int n = this.getIndex(string, string2);
        if (n < 0) {
            throw new IllegalArgumentException("No such attribute: local=" + string2 + ", namespace=" + string);
        }
        return this.declared[n];
    }

    @Override
    public boolean isDeclared(String string) {
        int n = this.getIndex(string);
        if (n < 0) {
            throw new IllegalArgumentException("No such attribute: " + string);
        }
        return this.declared[n];
    }

    @Override
    public boolean isSpecified(int n) {
        if (n < 0 || n >= this.getLength()) {
            throw new ArrayIndexOutOfBoundsException("No attribute at index: " + n);
        }
        return this.specified[n];
    }

    @Override
    public boolean isSpecified(String string, String string2) {
        int n = this.getIndex(string, string2);
        if (n < 0) {
            throw new IllegalArgumentException("No such attribute: local=" + string2 + ", namespace=" + string);
        }
        return this.specified[n];
    }

    @Override
    public boolean isSpecified(String string) {
        int n = this.getIndex(string);
        if (n < 0) {
            throw new IllegalArgumentException("No such attribute: " + string);
        }
        return this.specified[n];
    }

    @Override
    public void setAttributes(Attributes attributes) {
        int n = attributes.getLength();
        super.setAttributes(attributes);
        this.declared = new boolean[n];
        this.specified = new boolean[n];
        if (attributes instanceof Attributes2) {
            Attributes2 attributes2 = (Attributes2)attributes;
            for (int i = 0; i < n; ++i) {
                this.declared[i] = attributes2.isDeclared(i);
                this.specified[i] = attributes2.isSpecified(i);
            }
        } else {
            for (int i = 0; i < n; ++i) {
                this.declared[i] = !"CDATA".equals(attributes.getType(i));
                this.specified[i] = true;
            }
        }
    }

    @Override
    public void addAttribute(String string, String string2, String string3, String string4, String string5) {
        super.addAttribute(string, string2, string3, string4, string5);
        int n = this.getLength();
        if (this.specified == null) {
            this.specified = new boolean[n];
            this.declared = new boolean[n];
        } else if (n > this.specified.length) {
            boolean[] blArray = new boolean[n];
            System.arraycopy(this.declared, 0, blArray, 0, this.declared.length);
            this.declared = blArray;
            blArray = new boolean[n];
            System.arraycopy(this.specified, 0, blArray, 0, this.specified.length);
            this.specified = blArray;
        }
        this.specified[n - 1] = true;
        this.declared[n - 1] = !"CDATA".equals(string4);
    }

    @Override
    public void removeAttribute(int n) {
        int n2 = this.getLength() - 1;
        super.removeAttribute(n);
        if (n != n2) {
            System.arraycopy(this.declared, n + 1, this.declared, n, n2 - n);
            System.arraycopy(this.specified, n + 1, this.specified, n, n2 - n);
        }
    }

    public void setDeclared(int n, boolean bl) {
        if (n < 0 || n >= this.getLength()) {
            throw new ArrayIndexOutOfBoundsException("No attribute at index: " + n);
        }
        this.declared[n] = bl;
    }

    public void setSpecified(int n, boolean bl) {
        if (n < 0 || n >= this.getLength()) {
            throw new ArrayIndexOutOfBoundsException("No attribute at index: " + n);
        }
        this.specified[n] = bl;
    }
}

