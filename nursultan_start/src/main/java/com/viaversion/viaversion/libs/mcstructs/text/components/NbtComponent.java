/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.mcstructs.core.utils.ToString
 *  javax.annotation.Nullable
 */
package com.viaversion.viaversion.libs.mcstructs.text.components;

import com.viaversion.viaversion.libs.mcstructs.core.utils.ToString;
import com.viaversion.viaversion.libs.mcstructs.text.TextComponent;
import com.viaversion.viaversion.libs.mcstructs.text.components.nbt.NbtDataSource;
import java.util.Objects;
import javax.annotation.Nullable;

public class NbtComponent
extends TextComponent {
    private String component;
    private boolean resolve;
    private boolean plain;
    private TextComponent separator;
    private NbtDataSource dataSource;

    public String getComponent() {
        return this.component;
    }

    public NbtComponent(String component, boolean resolve, boolean plain, @Nullable TextComponent separator, NbtDataSource dataSource) {
        this.component = component;
        this.resolve = resolve;
        this.plain = plain;
        this.separator = separator;
        this.dataSource = dataSource;
    }

    public NbtComponent(String component, boolean resolve, @Nullable TextComponent separator, NbtDataSource dataSource) {
        this(component, resolve, false, separator, dataSource);
    }

    public NbtComponent(String component, boolean resolve, NbtDataSource dataSource) {
        this(component, resolve, null, dataSource);
    }

    public NbtComponent(String component, boolean resolve, boolean plain, NbtDataSource dataSource) {
        this(component, resolve, plain, null, dataSource);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof NbtComponent)) {
            return false;
        }
        NbtComponent other = (NbtComponent)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        if (this.isResolve() != other.isResolve()) {
            return false;
        }
        if (this.isPlain() != other.isPlain()) {
            return false;
        }
        String this$component = this.getComponent();
        String other$component = other.getComponent();
        if (this$component == null ? other$component != null : !this$component.equals(other$component)) {
            return false;
        }
        TextComponent this$separator = this.getSeparator();
        TextComponent other$separator = other.getSeparator();
        if (this$separator == null ? other$separator != null : !((Object)this$separator).equals(other$separator)) {
            return false;
        }
        NbtDataSource this$dataSource = this.getDataSource();
        NbtDataSource other$dataSource = other.getDataSource();
        return !(this$dataSource == null ? other$dataSource != null : !this$dataSource.equals(other$dataSource));
    }

    @Override
    public String toString() {
        return ToString.of((Object)this).add("siblings", this.getSiblings(), siblings -> !siblings.isEmpty()).add("style", (Object)this.getStyle(), style -> !style.isEmpty()).add("component", (Object)this.component).add("resolve", (Object)this.resolve).add("separator", (Object)this.separator, Objects::nonNull).toString();
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = super.hashCode();
        result = result * 59 + (this.isResolve() ? 79 : 97);
        result = result * 59 + (this.isPlain() ? 79 : 97);
        String $component = this.getComponent();
        result = result * 59 + ($component == null ? 43 : $component.hashCode());
        TextComponent $separator = this.getSeparator();
        result = result * 59 + ($separator == null ? 43 : ((Object)$separator).hashCode());
        NbtDataSource $dataSource = this.getDataSource();
        result = result * 59 + ($dataSource == null ? 43 : $dataSource.hashCode());
        return result;
    }

    public TextComponent getSeparator() {
        return this.separator;
    }

    public NbtComponent setPlain(boolean plain) {
        this.plain = plain;
        return this;
    }

    public NbtComponent setComponent(String component) {
        this.component = component;
        return this;
    }

    public NbtComponent setResolve(boolean resolve) {
        this.resolve = resolve;
        return this;
    }

    public boolean isPlain() {
        return this.plain;
    }

    @Override
    public String asSingleString() {
        return "";
    }

    @Override
    public TextComponent shallowCopy() {
        NbtComponent copy = new NbtComponent(this.component, this.resolve, this.separator, this.dataSource);
        return copy.setStyle(this.getStyle().copy());
    }

    public NbtDataSource getDataSource() {
        return this.dataSource;
    }

    public NbtComponent setSeparator(TextComponent separator) {
        this.separator = separator;
        return this;
    }

    public NbtComponent setDataSource(NbtDataSource dataSource) {
        this.dataSource = dataSource;
        return this;
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof NbtComponent;
    }

    public boolean isResolve() {
        return this.resolve;
    }
}

