/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.YAMLException
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.serializer.AnchorGenerator
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.serializer.NumberAnchorGenerator
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml;

import java.util.Map;
import java.util.TimeZone;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.DumperOptions$FlowStyle;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.DumperOptions$LineBreak;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.DumperOptions$NonPrintableStyle;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.DumperOptions$ScalarStyle;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.DumperOptions$Version;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.YAMLException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.serializer.AnchorGenerator;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.serializer.NumberAnchorGenerator;

public class DumperOptions {
    private DumperOptions$ScalarStyle defaultStyle = DumperOptions$ScalarStyle.PLAIN;
    private DumperOptions$FlowStyle defaultFlowStyle = DumperOptions$FlowStyle.AUTO;
    private boolean canonical = false;
    private boolean allowUnicode = true;
    private boolean allowReadOnlyProperties = false;
    private int indent = 2;
    private int indicatorIndent = 0;
    private boolean indentWithIndicator = false;
    private int bestWidth = 80;
    private boolean splitLines = true;
    private DumperOptions$LineBreak lineBreak = DumperOptions$LineBreak.UNIX;
    private boolean explicitStart = false;
    private boolean explicitEnd = false;
    private TimeZone timeZone = null;
    private int maxSimpleKeyLength = 128;
    private DumperOptions$NonPrintableStyle nonPrintableStyle = DumperOptions$NonPrintableStyle.BINARY;
    private DumperOptions$Version version = null;
    private Map<String, String> tags = null;
    private Boolean prettyFlow = false;
    private AnchorGenerator anchorGenerator = new NumberAnchorGenerator(0);

    public TimeZone getTimeZone() {
        return this.timeZone;
    }

    public void setTimeZone(TimeZone timeZone) {
        this.timeZone = timeZone;
    }

    public void setVersion(DumperOptions$Version dumperOptions$Version) {
        this.version = dumperOptions$Version;
    }

    public DumperOptions$Version getVersion() {
        return this.version;
    }

    public int getIndent() {
        return this.indent;
    }

    public void setNonPrintableStyle(DumperOptions$NonPrintableStyle dumperOptions$NonPrintableStyle) {
        this.nonPrintableStyle = dumperOptions$NonPrintableStyle;
    }

    public int getMaxSimpleKeyLength() {
        return this.maxSimpleKeyLength;
    }

    public void setMaxSimpleKeyLength(int n) {
        if (n > 1024) {
            throw new YAMLException("The simple key must not span more than 1024 stream characters. See https://yaml.org/spec/1.1/#id934537");
        }
        this.maxSimpleKeyLength = n;
    }

    public void setIndentWithIndicator(boolean bl) {
        this.indentWithIndicator = bl;
    }

    public DumperOptions$NonPrintableStyle getNonPrintableStyle() {
        return this.nonPrintableStyle;
    }

    public void setSplitLines(boolean bl) {
        this.splitLines = bl;
    }

    public int getIndicatorIndent() {
        return this.indicatorIndent;
    }

    public void setPrettyFlow(boolean bl) {
        this.prettyFlow = bl;
    }

    public void setLineBreak(DumperOptions$LineBreak dumperOptions$LineBreak) {
        if (dumperOptions$LineBreak == null) {
            throw new NullPointerException("Specify line break.");
        }
        this.lineBreak = dumperOptions$LineBreak;
    }

    public boolean isExplicitStart() {
        return this.explicitStart;
    }

    public boolean isExplicitEnd() {
        return this.explicitEnd;
    }

    public void setCanonical(boolean bl) {
        this.canonical = bl;
    }

    public boolean isCanonical() {
        return this.canonical;
    }

    public void setExplicitStart(boolean bl) {
        this.explicitStart = bl;
    }

    public void setExplicitEnd(boolean bl) {
        this.explicitEnd = bl;
    }

    public void setAllowUnicode(boolean bl) {
        this.allowUnicode = bl;
    }

    public AnchorGenerator getAnchorGenerator() {
        return this.anchorGenerator;
    }

    public void setIndicatorIndent(int n) {
        if (n < 0) {
            throw new YAMLException("Indicator indent must be non-negative.");
        }
        if (n > 9) {
            throw new YAMLException("Indicator indent must be at most Emitter.MAX_INDENT-1: 9");
        }
        this.indicatorIndent = n;
    }

    public boolean isAllowUnicode() {
        return this.allowUnicode;
    }

    public boolean isPrettyFlow() {
        return this.prettyFlow;
    }

    public boolean getSplitLines() {
        return this.splitLines;
    }

    public DumperOptions$LineBreak getLineBreak() {
        return this.lineBreak;
    }

    public void setAnchorGenerator(AnchorGenerator anchorGenerator) {
        this.anchorGenerator = anchorGenerator;
    }

    public void setIndent(int n) {
        if (n < 1) {
            throw new YAMLException("Indent must be at least 1");
        }
        if (n > 10) {
            throw new YAMLException("Indent must be at most 10");
        }
        this.indent = n;
    }

    public Map<String, String> getTags() {
        return this.tags;
    }

    public void setTags(Map<String, String> map) {
        this.tags = map;
    }

    public void setWidth(int n) {
        this.bestWidth = n;
    }

    public int getWidth() {
        return this.bestWidth;
    }

    public void setDefaultScalarStyle(DumperOptions$ScalarStyle dumperOptions$ScalarStyle) {
        if (dumperOptions$ScalarStyle == null) {
            throw new NullPointerException("Use ScalarStyle enum.");
        }
        this.defaultStyle = dumperOptions$ScalarStyle;
    }

    public void setAllowReadOnlyProperties(boolean bl) {
        this.allowReadOnlyProperties = bl;
    }

    public boolean isAllowReadOnlyProperties() {
        return this.allowReadOnlyProperties;
    }

    public void setDefaultFlowStyle(DumperOptions$FlowStyle dumperOptions$FlowStyle) {
        if (dumperOptions$FlowStyle == null) {
            throw new NullPointerException("Use FlowStyle enum.");
        }
        this.defaultFlowStyle = dumperOptions$FlowStyle;
    }

    public boolean getIndentWithIndicator() {
        return this.indentWithIndicator;
    }

    public DumperOptions$ScalarStyle getDefaultScalarStyle() {
        return this.defaultStyle;
    }

    public DumperOptions$FlowStyle getDefaultFlowStyle() {
        return this.defaultFlowStyle;
    }
}

