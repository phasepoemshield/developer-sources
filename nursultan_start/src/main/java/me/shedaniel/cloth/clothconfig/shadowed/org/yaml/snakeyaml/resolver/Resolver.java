/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.NodeId
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Tag
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.resolver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.NodeId;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Tag;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.resolver.ResolverTuple;

public class Resolver {
    public static final Pattern BOOL = Pattern.compile("^(?:yes|Yes|YES|no|No|NO|true|True|TRUE|false|False|FALSE|on|On|ON|off|Off|OFF)$");
    public static final Pattern FLOAT = Pattern.compile("^([-+]?(\\.[0-9]+|[0-9_]+(\\.[0-9_]*)?)([eE][-+]?[0-9]+)?|[-+]?[0-9][0-9_]*(?::[0-5]?[0-9])+\\.[0-9_]*|[-+]?\\.(?:inf|Inf|INF)|\\.(?:nan|NaN|NAN))$");
    public static final Pattern INT = Pattern.compile("^(?:[-+]?0b[0-1_]+|[-+]?0[0-7_]+|[-+]?(?:0|[1-9][0-9_]*)|[-+]?0x[0-9a-fA-F_]+|[-+]?[1-9][0-9_]*(?::[0-5]?[0-9])+)$");
    public static final Pattern MERGE = Pattern.compile("^(?:<<)$");
    public static final Pattern NULL = Pattern.compile("^(?:~|null|Null|NULL| )$");
    public static final Pattern EMPTY = Pattern.compile("^$");
    public static final Pattern TIMESTAMP = Pattern.compile("^(?:[0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]|[0-9][0-9][0-9][0-9]-[0-9][0-9]?-[0-9][0-9]?(?:[Tt]|[ \t]+)[0-9][0-9]?:[0-9][0-9]:[0-9][0-9](?:\\.[0-9]*)?(?:[ \t]*(?:Z|[-+][0-9][0-9]?(?::[0-9][0-9])?))?)$");
    public static final Pattern VALUE = Pattern.compile("^(?:=)$");
    public static final Pattern YAML = Pattern.compile("^(?:!|&|\\*)$");
    protected Map<Character, List<ResolverTuple>> yamlImplicitResolvers = new HashMap<Character, List<ResolverTuple>>();

    public Resolver() {
        this.addImplicitResolvers();
    }

    public Tag resolve(NodeId nodeId, String string, boolean bl) {
        if (nodeId == NodeId.scalar && bl) {
            Pattern pattern;
            Tag tag;
            List<ResolverTuple> list = string.length() == 0 ? this.yamlImplicitResolvers.get(Character.valueOf('\u0000')) : this.yamlImplicitResolvers.get(Character.valueOf(string.charAt(0)));
            if (list != null) {
                for (ResolverTuple resolverTuple : list) {
                    tag = resolverTuple.getTag();
                    pattern = resolverTuple.getRegexp();
                    if (!pattern.matcher(string).matches()) continue;
                    return tag;
                }
            }
            if (this.yamlImplicitResolvers.containsKey(null)) {
                for (ResolverTuple resolverTuple : this.yamlImplicitResolvers.get(null)) {
                    tag = resolverTuple.getTag();
                    pattern = resolverTuple.getRegexp();
                    if (!pattern.matcher(string).matches()) continue;
                    return tag;
                }
            }
        }
        switch (nodeId) {
            case scalar: {
                return Tag.STR;
            }
            case sequence: {
                return Tag.SEQ;
            }
        }
        return Tag.MAP;
    }

    protected void addImplicitResolvers() {
        this.addImplicitResolver(Tag.BOOL, BOOL, "yYnNtTfFoO");
        this.addImplicitResolver(Tag.INT, INT, "-+0123456789");
        this.addImplicitResolver(Tag.FLOAT, FLOAT, "-+0123456789.");
        this.addImplicitResolver(Tag.MERGE, MERGE, "<");
        this.addImplicitResolver(Tag.NULL, NULL, "~nN\u0000");
        this.addImplicitResolver(Tag.NULL, EMPTY, null);
        this.addImplicitResolver(Tag.TIMESTAMP, TIMESTAMP, "0123456789");
        this.addImplicitResolver(Tag.YAML, YAML, "!&*");
    }

    public void addImplicitResolver(Tag tag, Pattern pattern, String string) {
        if (string == null) {
            List<ResolverTuple> list = this.yamlImplicitResolvers.get(null);
            if (list == null) {
                list = new ArrayList<ResolverTuple>();
                this.yamlImplicitResolvers.put(null, list);
            }
            list.add(new ResolverTuple(tag, pattern));
        } else {
            char[] cArray = string.toCharArray();
            int n = cArray.length;
            for (int i = 0; i < n; ++i) {
                List<ResolverTuple> list;
                Character c = Character.valueOf(cArray[i]);
                if (c.charValue() == '\u0000') {
                    c = null;
                }
                if ((list = this.yamlImplicitResolvers.get(c)) == null) {
                    list = new ArrayList<ResolverTuple>();
                    this.yamlImplicitResolvers.put(c, list);
                }
                list.add(new ResolverTuple(tag, pattern));
            }
        }
    }
}

