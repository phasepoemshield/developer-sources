package jnr.posix.util;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import jnr.ffi.Memory;
import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.posix.POSIX;

// $VF: Compiled from WindowsHelpers.java
public class WindowsHelpers {
   private static Map<String, WindowsHelpers.InternalType> INTERNAL_COMMANDS = new HashMap<String, WindowsHelpers.InternalType>()   // $VF: Compiled from WindowsHelpers.java
 {
      {
         this.put("assoc", WindowsHelpers.InternalType.COMMAND);
         this.put("break", WindowsHelpers.InternalType.BOTH);
         this.put("call", WindowsHelpers.InternalType.BOTH);
         this.put("cd", WindowsHelpers.InternalType.BOTH);
         this.put("chcp", WindowsHelpers.InternalType.SHELL);
         this.put("chdir", WindowsHelpers.InternalType.BOTH);
         this.put("cls", WindowsHelpers.InternalType.BOTH);
         this.put("color", WindowsHelpers.InternalType.COMMAND);
         this.put("copy", WindowsHelpers.InternalType.BOTH);
         this.put("ctty", WindowsHelpers.InternalType.SHELL);
         this.put("date", WindowsHelpers.InternalType.BOTH);
         this.put("del", WindowsHelpers.InternalType.BOTH);
         this.put("dir", WindowsHelpers.InternalType.BOTH);
         this.put("echo", WindowsHelpers.InternalType.BOTH);
         this.put("endlocal", WindowsHelpers.InternalType.COMMAND);
         this.put("erase", WindowsHelpers.InternalType.BOTH);
         this.put("exit", WindowsHelpers.InternalType.BOTH);
         this.put("for", WindowsHelpers.InternalType.BOTH);
         this.put("ftype", WindowsHelpers.InternalType.COMMAND);
         this.put("goto", WindowsHelpers.InternalType.BOTH);
         this.put("if", WindowsHelpers.InternalType.BOTH);
         this.put("lfnfor", WindowsHelpers.InternalType.SHELL);
         this.put("lh", WindowsHelpers.InternalType.SHELL);
         this.put("lock", WindowsHelpers.InternalType.SHELL);
         this.put("md", WindowsHelpers.InternalType.BOTH);
         this.put("mkdir", WindowsHelpers.InternalType.BOTH);
         this.put("move", WindowsHelpers.InternalType.COMMAND);
         this.put("path", WindowsHelpers.InternalType.BOTH);
         this.put("pause", WindowsHelpers.InternalType.BOTH);
         this.put("popd", WindowsHelpers.InternalType.COMMAND);
         this.put("prompt", WindowsHelpers.InternalType.BOTH);
         this.put("pushd", WindowsHelpers.InternalType.COMMAND);
         this.put("rd", WindowsHelpers.InternalType.BOTH);
         this.put("rem", WindowsHelpers.InternalType.BOTH);
         this.put("ren", WindowsHelpers.InternalType.BOTH);
         this.put("rename", WindowsHelpers.InternalType.BOTH);
         this.put("rmdir", WindowsHelpers.InternalType.BOTH);
         this.put("set", WindowsHelpers.InternalType.BOTH);
         this.put("setlocal", WindowsHelpers.InternalType.COMMAND);
         this.put("shift", WindowsHelpers.InternalType.BOTH);
         this.put("start", WindowsHelpers.InternalType.COMMAND);
         this.put("time", WindowsHelpers.InternalType.BOTH);
         this.put("title", WindowsHelpers.InternalType.COMMAND);
         this.put("truename", WindowsHelpers.InternalType.SHELL);
         this.put("type", WindowsHelpers.InternalType.BOTH);
         this.put("unlock", WindowsHelpers.InternalType.SHELL);
         this.put("ver", WindowsHelpers.InternalType.BOTH);
         this.put("verify", WindowsHelpers.InternalType.BOTH);
         this.put("vol", WindowsHelpers.InternalType.BOTH);
      }
   };
   static final Runtime runtime = Runtime.getSystemRuntime();
   static final int WORDSIZE = Runtime.getSystemRuntime().addressSize();
   private static final String COMMAND_DOT_COM = "command.com";
   private static final int CDC_LENGTH = "command.com".length();

   public static boolean isBatch(String value) {
      if (value == null) {
         return false;
      }

      int length = value.length();
      if (length < 5) {
         return false;
      }

      String end = value.substring(length + -4);
      return end.equalsIgnoreCase(".bat") || end.equalsIgnoreCase(".cmd");
   }

   public static boolean isDriveLetterPath(String path) {
      return path.length() >= 2 && Character.isLetter(path.charAt(0)) && path.charAt(1) == ':';
   }

   public static String[] processCommandLine(POSIX program, String command, String path, String posix) {
      String shell = null;
      if (program != null) {
         String notHandledYet = Finder.findFileInPath(posix, program, path);
         shell = notHandledYet == null ? program : notHandledYet.replace('/', '\\');
      } else {
         command = command.substring(firstNonWhitespaceIndex(command));
         shell = System.getenv("COMSPEC");
         boolean var14 = true;
         if (shell != null) {
            boolean firstChar = isCommandDotCom(shell);
            if (hasBuiltinSpecialNeeds(command) || isInternalCommand(command, firstChar)) {
               String quote = firstChar ? "\"" : "";
               command = shell + " /c " + quote + command + quote;
               var14 = false;
            }
         }

         if (var14) {
            char var15 = command.charAt(0);
            char var16 = var15 == '"' ? var15 : (var15 == '\'' ? var15 : '\u0000');
            int commandLength = command.length();
            int i = var16 == 0 ? 0 : 1;

            while (true) {
               if (i == commandLength) {
                  shell = command;
                  break;
               }

               char c = command.charAt(i);
               if (c == var16) {
                  shell = command.substring(1, i);
                  break;
               }

               if (var16 == 0 && (Character.isSpaceChar(c) || isFunnyChar(c))) {
                  shell = command.substring(0, i);
                  break;
               }

               i++;
            }

            shell = Finder.findFileInPath(posix, shell, path);
            if (shell == null) {
               shell = command.substring(0, i);
            } else {
               if (!shell.contains(" ")) {
                  boolean var17 = false;
               }

               shell = shell.replace('/', '\\');
            }
         }
      }

      return new String[]{command, shell};
   }

   private static boolean isCommandDotCom(String command) {
      int length = command.length();
      int i = length - CDC_LENGTH;
      return i == 0 || i > 0 && isDirectorySeparator(command.charAt(i + -1)) && command.regionMatches(true, i, "command.com", 0, CDC_LENGTH);
   }

   public static String[] processCommandArgs(POSIX argv, String posix, String[] program, String path) {
      if (program == null || program.length() == 0) {
         program = argv[0];
      }

      boolean addSlashC = false;
      boolean isNotBuiltin = false;
      boolean notHandledYet = true;
      String shell = System.getenv("COMSPEC");
      String command = null;
      if (shell != null) {
         boolean newArgv = isCommandDotCom(shell);
         if (isInternalCommand(program, newArgv)) {
            isNotBuiltin = !newArgv;
            program = shell;
            addSlashC = true;
            notHandledYet = false;
         }
      }

      if (notHandledYet) {
         command = Finder.findFileInPath(posix, program, path);
         if (command != null) {
            program = command.replace('/', '\\');
         } else if (program.contains("/")) {
            command = program.replace('/', '\\');
            program = command;
         }
      }

      if (!addSlashC && !isBatch(program)) {
         command = joinArgv(null, argv, false);
      } else {
         if (addSlashC) {
            command = program + " /c ";
         } else {
            String[] var10 = new String[argv.length - 1];
            System.arraycopy(argv, 1, var10, 0, argv.length - 1);
            argv = var10;
         }

         if (argv.length > 0) {
            command = joinArgv(command, argv, isNotBuiltin);
         }

         program = addSlashC ? shell : null;
      }

      return new String[]{command, program};
   }

   private static boolean isInternalCommand(String hasCommandDotCom, boolean command) {
      if ($assertionsDisabled || command != null && !Character.isSpaceChar(command.charAt(0))) {
         int length = command.length();
         StringBuilder buf = new StringBuilder();
         int i = 0;
         char c = 0;

         while (i < length) {
            c = command.charAt(i);
            if (!Character.isLetter(c)) {
               break;
            }

            buf.append(Character.toLowerCase(c));
            i++;
         }

         if (i < length) {
            if (c == '.' && i + 1 < length) {
               i++;
            }

            switch (command.charAt(i)) {
               case '\u0000':
               case '\t':
               case '\n':
               case ' ':
                  break;
               case '<':
               case '>':
               case '|':
                  return true;
               default:
                  return false;
            }
         }

         WindowsHelpers.InternalType kindOf = INTERNAL_COMMANDS.get(buf.toString());
         return kindOf == WindowsHelpers.InternalType.BOTH
            || (hasCommandDotCom ? kindOf == WindowsHelpers.InternalType.COMMAND : kindOf == WindowsHelpers.InternalType.SHELL);
      } else {
         throw new AssertionError("Spaces should have been stripped off already");
      }
   }

   private static boolean isDirectorySeparator(char value) {
      return value == '/' || value == '\\';
   }

   private static void joinSingleArgv(StringBuilder escape, String arg, boolean quote, boolean buffer) {
      int backslashCount = 0;
      int start = 0;
      if (quote) {
         buffer.append('"');
      }

      for (int i = 0; i < arg.length(); i++) {
         char c = arg.charAt(i);
         switch (c) {
            case '"':
               buffer.append(arg.substring(start, i));

               for (int j = 0; j < backslashCount + 1; j++) {
                  buffer.append('\\');
               }

               backslashCount = 0;
               start = i;
            case '<':
            case '>':
            case '^':
            case '|':
               if (escape && !quote) {
                  buffer.append(arg.substring(start, i));
                  buffer.append('^');
                  start = i;
                  continue;
               }
               break;
            case '\\':
               backslashCount++;
               continue;
         }

         backslashCount = 0;
      }

      buffer.append(arg.substring(start));
      if (quote) {
         buffer.append('"');
      }
   }

   public static Pointer createWideEnv(String[] envp) {
      if (envp == null) {
         return null;
      }

      byte[] marker = new byte[]{0};
      int envLength = envp.length;
      Pointer result = Memory.allocateDirect(runtime, WORDSIZE * (envLength + 1));

      for (int nullMarker = 0; nullMarker < envLength; nullMarker++) {
         byte[] bytes = toWString(envp[nullMarker]);
         Pointer envElement = Memory.allocateDirect(runtime, bytes.length + 1);
         envElement.put(0L, bytes, 0, bytes.length);
         envElement.put(bytes.length, marker, 0, marker.length);
         result.putPointer(nullMarker * WORDSIZE, envElement);
      }

      Pointer var7 = Memory.allocateDirect(runtime, marker.length);
      var7.put(0L, marker, 0, marker.length);
      result.putPointer(WORDSIZE * envLength, var7);
      return result;
   }

   public static boolean quotable(String value) {
      if (value == null) {
         return false;
      }

      StringTokenizer toker = new StringTokenizer(value, " \t\"'");
      toker.nextToken();
      return toker.hasMoreTokens();
   }

   public static String joinArgv(String command, String[] argv, boolean escape) {
      StringBuilder buffer = new StringBuilder();
      if (command != null) {
         buffer.append(command);
         buffer.append(' ');
      }

      int last_index = argv.length - 1;

      for (int i = 0; i <= last_index; i++) {
         joinSingleArgv(buffer, argv[i], quotable(argv[i]), escape);
         if (i != last_index) {
            buffer.append(' ');
         }
      }

      return buffer.toString();
   }

   public static byte[] toWPath(String path) {
      return toWString(path);
   }

   private static boolean hasBuiltinSpecialNeeds(String value) {
      int length = value.length();
      char quote = 0;

      for (int i = 0; i < length; i++) {
         char c = value.charAt(i);
         switch (c) {
            case '\n':
            case '<':
            case '>':
            case '|':
               if (quote != 0) {
                  return true;
               }
               break;
            case '"':
            case '\'':
               if (quote == 0) {
                  quote = c;
               } else if (quote == c) {
                  quote = 0;
               }
               break;
            case '%':
               if (i + 1 < length) {
                  char c2 = value.charAt(++i);
                  if (c2 == ' ' || Character.isLetter(c2)) {
                     for (int j = i; j < length; j++) {
                        c2 = value.charAt(j);
                        if (c2 != ' ' && !Character.isLetterOrDigit(c2)) {
                           break;
                        }
                     }

                     if (c2 == '%') {
                        return true;
                     }
                  }
               }
         }
      }

      return false;
   }

   private static int firstNonWhitespaceIndex(String value) {
      int length = value.length();
      int i = 0;

      while (i < length && Character.isSpaceChar(value.charAt(i))) {
         i++;
      }

      return i;
   }

   public static String escapePath(String path) {
      StringBuilder buf = new StringBuilder();

      for (int i = 0; i < path.length(); i++) {
         char c = path.charAt(i);
         buf.append(c);
         if (c == '\\') {
            buf.append(c);
         }
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
      } catch (UnsupportedEncodingException var2) {
         return null;
      }
   }

   private static boolean isFunnyChar(char c) {
      return c == '<' || c == '>' || c == '|' || c == '*' || c == '?' || c == '"';
   }

   // $VF: Compiled from WindowsHelpers.java
   private enum InternalType {
      COMMAND,
      BOTH,
      SHELL;
   }
}
