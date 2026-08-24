/*
 * Decompiled with CFR 0.152.
 */
package jnr.posix.util;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import jnr.ffi.Memory;
import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.posix.POSIX;
import jnr.posix.util.Finder;

public class WindowsHelpers {
    private static Map<String, InternalType> INTERNAL_COMMANDS;
    static final Runtime runtime;
    static final int WORDSIZE;
    private static final String COMMAND_DOT_COM = "command.com";
    private static final int CDC_LENGTH;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean isBatch(String value) {
        if (value == null) {
            return false;
        }
        int length = value.length();
        if (length < 5) {
            return false;
        }
        String end = value.substring(length + -4);
        if (end.equalsIgnoreCase(".bat")) return true;
        if (!end.equalsIgnoreCase(".cmd")) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean isDriveLetterPath(String path) {
        if (path.length() < 2) return false;
        if (!Character.isLetter(path.charAt(0))) return false;
        if (path.charAt(1) != ':') return false;
        return true;
    }

    /*
     * WARNING - void declaration
     */
    public static String[] processCommandLine(POSIX posix, String command, String program, String path) {
        void var1_1;
        String string;
        block12: {
            String shell;
            block11: {
                shell = null;
                if (program == null) break block11;
                String fullPath = Finder.findFileInPath(posix, program, path);
                shell = fullPath == null ? program : fullPath.replace('/', '\\');
                break block12;
            }
            command = command.substring(WindowsHelpers.firstNonWhitespaceIndex(command));
            shell = System.getenv("COMSPEC");
            boolean notHandledYet = true;
            if (shell != null) {
                boolean commandDotCom = WindowsHelpers.isCommandDotCom(shell);
                if (WindowsHelpers.hasBuiltinSpecialNeeds(command) || WindowsHelpers.isInternalCommand(command, commandDotCom)) {
                    String quote = commandDotCom ? "\"" : "";
                    command = shell + " /c " + quote + command + quote;
                    notHandledYet = false;
                }
            }
            if (!notHandledYet) break block12;
            char firstChar = command.charAt(0);
            char quote = firstChar == '\"' ? firstChar : (firstChar == '\'' ? firstChar : (char)'\u0000');
            int commandLength = command.length();
            int i = quote == '\u0000' ? 0 : 1;
            while (true) {
                block13: {
                    block14: {
                        if (i == commandLength) {
                            shell = command;
                            break;
                        }
                        char c = command.charAt(i);
                        if (c == quote) {
                            shell = command.substring(1, i);
                            break;
                        }
                        if (quote != '\u0000') break block13;
                        if (Character.isSpaceChar(c)) break block14;
                        if (!WindowsHelpers.isFunnyChar(c)) break block13;
                    }
                    shell = command.substring(0, i);
                    break;
                }
                ++i;
            }
            shell = Finder.findFileInPath(posix, shell, path);
            if (shell == null) {
                shell = command.substring(0, i);
            } else {
                if (!shell.contains(" ")) {
                    boolean bl = false;
                }
                string = shell.replace('/', '\\');
            }
        }
        String[] stringArray = new String[2];
        stringArray[0] = var1_1;
        stringArray[1] = string;
        return stringArray;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean isCommandDotCom(String command) {
        int length = command.length();
        int i = length - CDC_LENGTH;
        if (i == 0) return true;
        if (i <= 0) return false;
        if (!WindowsHelpers.isDirectorySeparator(command.charAt(i + -1))) return false;
        if (!command.regionMatches(true, i, COMMAND_DOT_COM, 0, CDC_LENGTH)) return false;
        return true;
    }

    /*
     * WARNING - void declaration
     */
    public static String[] processCommandArgs(POSIX posix, String program, String[] argv, String path) {
        void var1_1;
        String string;
        boolean commandDotCom;
        block14: {
            block13: {
                if (program == null) break block13;
                if (program.length() != 0) break block14;
            }
            program = argv[0];
        }
        boolean addSlashC = false;
        boolean isNotBuiltin = false;
        boolean notHandledYet = true;
        String shell = System.getenv("COMSPEC");
        String command = null;
        if (shell != null && WindowsHelpers.isInternalCommand(program, commandDotCom = WindowsHelpers.isCommandDotCom(shell))) {
            isNotBuiltin = !commandDotCom;
            program = shell;
            addSlashC = true;
            notHandledYet = false;
        }
        if (notHandledYet) {
            command = Finder.findFileInPath(posix, program, path);
            if (command != null) {
                program = command.replace('/', '\\');
            } else if (program.contains("/")) {
                program = command = program.replace('/', '\\');
            }
        }
        if (addSlashC || WindowsHelpers.isBatch(program)) {
            if (addSlashC) {
                command = program + " /c ";
            } else {
                void var9_10;
                String[] newArgv = new String[argv.length - 1];
                System.arraycopy(argv, 1, var9_10, 0, argv.length - 1);
                argv = var9_10;
            }
            if (argv.length > 0) {
                command = WindowsHelpers.joinArgv(command, argv, isNotBuiltin);
            }
            program = addSlashC ? shell : null;
        } else {
            void var2_2;
            string = WindowsHelpers.joinArgv(null, (String[])var2_2, false);
        }
        String[] stringArray = new String[2];
        stringArray[0] = string;
        stringArray[1] = var1_1;
        return stringArray;
    }

    private static boolean isInternalCommand(String command, boolean hasCommandDotCom) {
        InternalType kindOf;
        int i;
        assert (command != null && !Character.isSpaceChar(command.charAt(0))) : "Spaces should have been stripped off already";
        int length = command.length();
        StringBuilder buf = new StringBuilder();
        char c = '\u0000';
        for (i = 0; i < length && Character.isLetter(c = command.charAt(i)); ++i) {
            buf.append(Character.toLowerCase(c));
        }
        if (i < length) {
            if (c == '.' && i + 1 < length) {
                ++i;
            }
            switch (command.charAt(i)) {
                case '<': 
                case '>': 
                case '|': {
                    return true;
                }
                case '\u0000': 
                case '\t': 
                case '\n': 
                case ' ': {
                    break;
                }
                default: {
                    return false;
                }
            }
        }
        return (kindOf = INTERNAL_COMMANDS.get(buf.toString())) == InternalType.BOTH || (hasCommandDotCom ? kindOf == InternalType.COMMAND : kindOf == InternalType.SHELL);
    }

    private static boolean isDirectorySeparator(char value) {
        return value == '/' || value == '\\';
    }

    private static void joinSingleArgv(StringBuilder buffer, String arg, boolean quote, boolean escape) {
        int backslashCount = 0;
        int start = 0;
        if (quote) {
            buffer.append('\"');
        }
        block5: for (int i = 0; i < arg.length(); ++i) {
            char c = arg.charAt(i);
            switch (c) {
                case '\\': {
                    ++backslashCount;
                    continue block5;
                }
                case '\"': {
                    buffer.append(arg.substring(start, i));
                    for (int j = 0; j < backslashCount + 1; ++j) {
                        buffer.append('\\');
                    }
                    backslashCount = 0;
                    start = i;
                }
                case '<': 
                case '>': 
                case '^': 
                case '|': {
                    if (escape && !quote) {
                        buffer.append(arg.substring(start, i));
                        buffer.append('^');
                        start = i;
                        continue block5;
                    }
                }
                default: {
                    backslashCount = 0;
                }
            }
        }
        buffer.append(arg.substring(start));
        if (quote) {
            buffer.append('\"');
        }
    }

    /*
     * WARNING - void declaration
     */
    public static Pointer createWideEnv(String[] envp) {
        void var4_5;
        void var2_2;
        void var3_3;
        if (envp == null) {
            return null;
        }
        byte[] byArray = new byte[1];
        byArray[0] = 0;
        byte[] marker = byArray;
        int envLength = envp.length;
        Pointer result = Memory.allocateDirect(runtime, WORDSIZE * (envLength + 1));
        for (int i = 0; i < envLength; ++i) {
            void var6_7;
            byte[] bytes = WindowsHelpers.toWString(envp[i]);
            Pointer envElement = Memory.allocateDirect(runtime, bytes.length + 1);
            envElement.put(0L, bytes, 0, bytes.length);
            envElement.put((long)bytes.length, marker, 0, marker.length);
            result.putPointer(i * WORDSIZE, (Pointer)var6_7);
        }
        Pointer nullMarker = Memory.allocateDirect(runtime, marker.length);
        nullMarker.put(0L, marker, 0, marker.length);
        var3_3.putPointer(WORDSIZE * var2_2, (Pointer)var4_5);
        return var3_3;
    }

    public static boolean quotable(String value) {
        if (value == null) {
            return false;
        }
        StringTokenizer toker = new StringTokenizer(value, " \t\"'");
        toker.nextToken();
        return toker.hasMoreTokens();
    }

    /*
     * WARNING - void declaration
     */
    public static String joinArgv(String command, String[] argv, boolean escape) {
        void var3_3;
        StringBuilder buffer = new StringBuilder();
        if (command != null) {
            buffer.append(command);
            buffer.append(' ');
        }
        int last_index = argv.length - 1;
        int i = 0;
        while (i <= last_index) {
            void var5_5;
            WindowsHelpers.joinSingleArgv(buffer, argv[i], WindowsHelpers.quotable(argv[i]), escape);
            if (i != last_index) {
                buffer.append(' ');
            }
            ++var5_5;
        }
        return var3_3.toString();
    }

    public static byte[] toWPath(String path) {
        return WindowsHelpers.toWString(path);
    }

    private static boolean hasBuiltinSpecialNeeds(String value) {
        int length = value.length();
        char quote = '\u0000';
        block5: for (int i = 0; i < length; ++i) {
            char c = value.charAt(i);
            switch (c) {
                case '\"': 
                case '\'': {
                    if (quote == '\u0000') {
                        quote = c;
                        continue block5;
                    }
                    if (quote != c) continue block5;
                    quote = '\u0000';
                    continue block5;
                }
                case '\n': 
                case '<': 
                case '>': 
                case '|': {
                    if (quote == '\u0000') continue block5;
                    return true;
                }
                case '%': {
                    char c2;
                    if (i + 1 >= length || (c2 = value.charAt(++i)) != ' ' && !Character.isLetter(c2)) continue block5;
                    for (int j = i; j < length && ((c2 = value.charAt(j)) == ' ' || Character.isLetterOrDigit(c2)); ++j) {
                    }
                    if (c2 != '%') continue block5;
                    return true;
                }
            }
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private static int firstNonWhitespaceIndex(String value) {
        void var2_2;
        int length = value.length();
        for (int i = 0; i < length; ++i) {
            if (!Character.isSpaceChar(value.charAt(i))) break;
        }
        return (int)var2_2;
    }

    /*
     * WARNING - void declaration
     */
    public static String escapePath(String path) {
        StringBuilder buf = new StringBuilder();
        int i = 0;
        while (i < path.length()) {
            void var2_2;
            char c = path.charAt(i);
            buf.append(c);
            if (c == '\\') {
                void var3_3;
                buf.append((char)var3_3);
            }
            ++var2_2;
        }
        return buf.toString() + "\\\\";
    }

    public static byte[] toWString(String string) {
        if (string == null) {
            return null;
        }
        string = string + '\u0000';
        try {
            return string.getBytes("UTF-16LE");
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            return null;
        }
    }

    static {
        runtime = Runtime.getSystemRuntime();
        WORDSIZE = Runtime.getSystemRuntime().addressSize();
        CDC_LENGTH = COMMAND_DOT_COM.length();
        INTERNAL_COMMANDS = new HashMap<String, InternalType>(){
            {
                this.put("assoc", InternalType.COMMAND);
                this.put("break", InternalType.BOTH);
                this.put("call", InternalType.BOTH);
                this.put("cd", InternalType.BOTH);
                this.put("chcp", InternalType.SHELL);
                this.put("chdir", InternalType.BOTH);
                this.put("cls", InternalType.BOTH);
                this.put("color", InternalType.COMMAND);
                this.put("copy", InternalType.BOTH);
                this.put("ctty", InternalType.SHELL);
                this.put("date", InternalType.BOTH);
                this.put("del", InternalType.BOTH);
                this.put("dir", InternalType.BOTH);
                this.put("echo", InternalType.BOTH);
                this.put("endlocal", InternalType.COMMAND);
                this.put("erase", InternalType.BOTH);
                this.put("exit", InternalType.BOTH);
                this.put("for", InternalType.BOTH);
                this.put("ftype", InternalType.COMMAND);
                this.put("goto", InternalType.BOTH);
                this.put("if", InternalType.BOTH);
                this.put("lfnfor", InternalType.SHELL);
                this.put("lh", InternalType.SHELL);
                this.put("lock", InternalType.SHELL);
                this.put("md", InternalType.BOTH);
                this.put("mkdir", InternalType.BOTH);
                this.put("move", InternalType.COMMAND);
                this.put("path", InternalType.BOTH);
                this.put("pause", InternalType.BOTH);
                this.put("popd", InternalType.COMMAND);
                this.put("prompt", InternalType.BOTH);
                this.put("pushd", InternalType.COMMAND);
                this.put("rd", InternalType.BOTH);
                this.put("rem", InternalType.BOTH);
                this.put("ren", InternalType.BOTH);
                this.put("rename", InternalType.BOTH);
                this.put("rmdir", InternalType.BOTH);
                this.put("set", InternalType.BOTH);
                this.put("setlocal", InternalType.COMMAND);
                this.put("shift", InternalType.BOTH);
                this.put("start", InternalType.COMMAND);
                this.put("time", InternalType.BOTH);
                this.put("title", InternalType.COMMAND);
                this.put("truename", InternalType.SHELL);
                this.put("type", InternalType.BOTH);
                this.put("unlock", InternalType.SHELL);
                this.put("ver", InternalType.BOTH);
                this.put("verify", InternalType.BOTH);
                this.put("vol", InternalType.BOTH);
            }
        };
    }

    private static boolean isFunnyChar(char c) {
        return c == '<' || c == '>' || c == '|' || c == '*' || c == '?' || c == '\"';
    }

    private static final class InternalType
    extends Enum<InternalType> {
        private static final /* synthetic */ InternalType[] $VALUES;
        public static final /* enum */ InternalType COMMAND;
        public static final /* enum */ InternalType BOTH;
        public static final /* enum */ InternalType SHELL;

        private static /* synthetic */ InternalType[] $values() {
            InternalType[] internalTypeArray = new InternalType[3];
            internalTypeArray[0] = SHELL;
            internalTypeArray[1] = COMMAND;
            internalTypeArray[2] = BOTH;
            return internalTypeArray;
        }

        public static InternalType[] values() {
            return (InternalType[])$VALUES.clone();
        }

        public static InternalType valueOf(String name) {
            return Enum.valueOf(InternalType.class, name);
        }

        static {
            SHELL = new InternalType();
            COMMAND = new InternalType();
            BOTH = new InternalType();
            $VALUES = InternalType.$values();
        }
    }
}

