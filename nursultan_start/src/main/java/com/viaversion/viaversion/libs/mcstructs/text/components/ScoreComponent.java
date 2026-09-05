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
import java.util.Objects;
import javax.annotation.Nullable;

public class ScoreComponent
extends TextComponent {
    private String name;
    private String objective;
    @Nullable
    private String value;

    public ScoreComponent(String name, String objective) {
        this(name, objective, null);
    }

    public ScoreComponent(String name, String objective, @Nullable String value) {
        this.name = name;
        this.objective = objective;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ScoreComponent)) {
            return false;
        }
        ScoreComponent other = (ScoreComponent)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        String this$objective = this.getObjective();
        String other$objective = other.getObjective();
        if (this$objective == null ? other$objective != null : !this$objective.equals(other$objective)) {
            return false;
        }
        String this$value = this.getValue();
        String other$value = other.getValue();
        return !(this$value == null ? other$value != null : !this$value.equals(other$value));
    }

    @Override
    public String toString() {
        return ToString.of((Object)this).add("siblings", this.getSiblings(), siblings -> !siblings.isEmpty()).add("style", (Object)this.getStyle(), style -> !style.isEmpty()).add("name", (Object)this.name).add("objective", (Object)this.objective).add("value", (Object)this.value, Objects::nonNull).toString();
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = super.hashCode();
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $objective = this.getObjective();
        result = result * 59 + ($objective == null ? 43 : $objective.hashCode());
        String $value = this.getValue();
        result = result * 59 + ($value == null ? 43 : $value.hashCode());
        return result;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public String getValue() {
        return this.value;
    }

    public ScoreComponent setName(String name) {
        this.name = name;
        return this;
    }

    public ScoreComponent setValue(@Nullable String value) {
        this.value = value;
        return this;
    }

    @Override
    public String asSingleString() {
        return this.value;
    }

    @Override
    public TextComponent shallowCopy() {
        ScoreComponent copy = new ScoreComponent(this.name, this.objective, this.value);
        return copy.setStyle(this.getStyle().copy());
    }

    public String getObjective() {
        return this.objective;
    }

    public ScoreComponent setObjective(@Nullable String objective) {
        this.objective = objective;
        return this;
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof ScoreComponent;
    }
}

