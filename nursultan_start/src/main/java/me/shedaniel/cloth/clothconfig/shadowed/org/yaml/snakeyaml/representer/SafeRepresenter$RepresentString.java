/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.DumperOptions$NonPrintableStyle
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.DumperOptions$ScalarStyle
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.YAMLException
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.external.biz.base64Coder.Base64Coder
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Tag
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.reader.StreamReader
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer.Represent
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer;

import java.io.UnsupportedEncodingException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.DumperOptions;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.YAMLException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.external.biz.base64Coder.Base64Coder;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Tag;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.reader.StreamReader;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer.Represent;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer.SafeRepresenter;

public class SafeRepresenter$RepresentString
implements Represent {
    final /* synthetic */ SafeRepresenter this$0;

    protected SafeRepresenter$RepresentString(SafeRepresenter safeRepresenter) {
        this.this$0 = safeRepresenter;
    }

    public Node representData(Object object) {
        Tag tag = Tag.STR;
        DumperOptions.ScalarStyle scalarStyle = null;
        String string = object.toString();
        if (this.this$0.nonPrintableStyle == DumperOptions.NonPrintableStyle.BINARY && !StreamReader.isPrintable((String)string)) {
            char[] cArray;
            tag = Tag.BINARY;
            try {
                byte[] byArray = string.getBytes("UTF-8");
                String string2 = new String(byArray, "UTF-8");
                if (!string2.equals(string)) {
                    throw new YAMLException("invalid string value has occurred");
                }
                cArray = Base64Coder.encode((byte[])byArray);
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                throw new YAMLException((Throwable)unsupportedEncodingException);
            }
            string = String.valueOf(cArray);
            scalarStyle = DumperOptions.ScalarStyle.LITERAL;
        }
        if (this.this$0.defaultScalarStyle == DumperOptions.ScalarStyle.PLAIN && SafeRepresenter.access$000().matcher(string).find()) {
            scalarStyle = DumperOptions.ScalarStyle.LITERAL;
        }
        return this.this$0.representScalar(tag, string, scalarStyle);
    }
}

