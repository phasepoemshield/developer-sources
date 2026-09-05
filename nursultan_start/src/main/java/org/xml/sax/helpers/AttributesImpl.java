/*
 * Decompiled with CFR 0.152.
 */
package org.xml.sax.helpers;

import org.xml.sax.Attributes;

public class AttributesImpl
implements Attributes {
    int length;
    String[] data;

    public AttributesImpl() {
        this.length = 0;
        this.data = null;
    }

    public AttributesImpl(Attributes attributes) {
        this.setAttributes(attributes);
    }

    @Override
    public int getLength() {
        return this.length;
    }

    @Override
    public String getURI(int n) {
        if (n >= 0 && n < this.length) {
            return this.data[n * 5];
        }
        return null;
    }

    @Override
    public String getLocalName(int n) {
        if (n >= 0 && n < this.length) {
            return this.data[n * 5 + 1];
        }
        return null;
    }

    @Override
    public String getQName(int n) {
        if (n >= 0 && n < this.length) {
            return this.data[n * 5 + 2];
        }
        return null;
    }

    @Override
    public String getType(int n) {
        if (n >= 0 && n < this.length) {
            return this.data[n * 5 + 3];
        }
        return null;
    }

    @Override
    public String getValue(int n) {
        if (n >= 0 && n < this.length) {
            return this.data[n * 5 + 4];
        }
        return null;
    }

    @Override
    public int getIndex(String string, String string2) {
        int n = this.length * 5;
        for (int i = 0; i < n; i += 5) {
            if (!this.data[i].equals(string) || !this.data[i + 1].equals(string2)) continue;
            return i / 5;
        }
        return -1;
    }

    @Override
    public int getIndex(String string) {
        int n = this.length * 5;
        for (int i = 0; i < n; i += 5) {
            if (!this.data[i + 2].equals(string)) continue;
            return i / 5;
        }
        return -1;
    }

    @Override
    public String getType(String string, String string2) {
        int n = this.length * 5;
        for (int i = 0; i < n; i += 5) {
            if (!this.data[i].equals(string) || !this.data[i + 1].equals(string2)) continue;
            return this.data[i + 3];
        }
        return null;
    }

    @Override
    public String getType(String string) {
        int n = this.length * 5;
        for (int i = 0; i < n; i += 5) {
            if (!this.data[i + 2].equals(string)) continue;
            return this.data[i + 3];
        }
        return null;
    }

    @Override
    public String getValue(String string, String string2) {
        int n = this.length * 5;
        for (int i = 0; i < n; i += 5) {
            if (!this.data[i].equals(string) || !this.data[i + 1].equals(string2)) continue;
            return this.data[i + 4];
        }
        return null;
    }

    @Override
    public String getValue(String string) {
        int n = this.length * 5;
        for (int i = 0; i < n; i += 5) {
            if (!this.data[i + 2].equals(string)) continue;
            return this.data[i + 4];
        }
        return null;
    }

    public void clear() {
        if (this.data != null) {
            for (int i = 0; i < this.length * 5; ++i) {
                this.data[i] = null;
            }
        }
        this.length = 0;
    }

    public void setAttributes(Attributes attributes) {
        this.clear();
        this.length = attributes.getLength();
        if (this.length > 0) {
            this.data = new String[this.length * 5];
            for (int i = 0; i < this.length; ++i) {
                this.data[i * 5] = attributes.getURI(i);
                this.data[i * 5 + 1] = attributes.getLocalName(i);
                this.data[i * 5 + 2] = attributes.getQName(i);
                this.data[i * 5 + 3] = attributes.getType(i);
                this.data[i * 5 + 4] = attributes.getValue(i);
            }
        }
    }

    public void addAttribute(String string, String string2, String string3, String string4, String string5) {
        this.ensureCapacity(this.length + 1);
        this.data[this.length * 5] = string;
        this.data[this.length * 5 + 1] = string2;
        this.data[this.length * 5 + 2] = string3;
        this.data[this.length * 5 + 3] = string4;
        this.data[this.length * 5 + 4] = string5;
        ++this.length;
    }

    public void setAttribute(int n, String string, String string2, String string3, String string4, String string5) {
        if (n >= 0 && n < this.length) {
            this.data[n * 5] = string;
            this.data[n * 5 + 1] = string2;
            this.data[n * 5 + 2] = string3;
            this.data[n * 5 + 3] = string4;
            this.data[n * 5 + 4] = string5;
        } else {
            this.badIndex(n);
        }
    }

    public void removeAttribute(int n) {
        if (n >= 0 && n < this.length) {
            if (n < this.length - 1) {
                System.arraycopy(this.data, (n + 1) * 5, this.data, n * 5, (this.length - n - 1) * 5);
            }
            n = (this.length - 1) * 5;
            this.data[n++] = null;
            this.data[n++] = null;
            this.data[n++] = null;
            this.data[n++] = null;
            this.data[n] = null;
            --this.length;
        } else {
            this.badIndex(n);
        }
    }

    public void setURI(int n, String string) {
        if (n >= 0 && n < this.length) {
            this.data[n * 5] = string;
        } else {
            this.badIndex(n);
        }
    }

    public void setLocalName(int n, String string) {
        if (n >= 0 && n < this.length) {
            this.data[n * 5 + 1] = string;
        } else {
            this.badIndex(n);
        }
    }

    public void setQName(int n, String string) {
        if (n >= 0 && n < this.length) {
            this.data[n * 5 + 2] = string;
        } else {
            this.badIndex(n);
        }
    }

    public void setType(int n, String string) {
        if (n >= 0 && n < this.length) {
            this.data[n * 5 + 3] = string;
        } else {
            this.badIndex(n);
        }
    }

    public void setValue(int n, String string) {
        if (n >= 0 && n < this.length) {
            this.data[n * 5 + 4] = string;
        } else {
            this.badIndex(n);
        }
    }

    private void ensureCapacity(int n) {
        int n2;
        if (n <= 0) {
            return;
        }
        if (this.data == null || this.data.length == 0) {
            n2 = 25;
        } else {
            if (this.data.length >= n * 5) {
                return;
            }
            n2 = this.data.length;
        }
        while (n2 < n * 5) {
            n2 *= 2;
        }
        String[] stringArray = new String[n2];
        if (this.length > 0) {
            System.arraycopy(this.data, 0, stringArray, 0, this.length * 5);
        }
        this.data = stringArray;
    }

    private void badIndex(int n) throws ArrayIndexOutOfBoundsException {
        String string = "Attempt to modify attribute at illegal index: " + n;
        throw new ArrayIndexOutOfBoundsException(string);
    }
}

