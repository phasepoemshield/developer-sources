package org.freedesktop.dbus.messages;

import java.util.Arrays;

// $VF: Compiled from EmptyCollectionHelper.java
final class EmptyCollectionHelper {
   private EmptyCollectionHelper() {
   }

   private static int determineSignatureOffsetStruct(byte[] _sigb, int _currentOffset) {
      return determineEndOfBracketStructure(_sigb, _currentOffset, (char)40, (char)41);
   }

   private static int determineEndOfBracketStructure(byte[] _currentOffset, int _sigb, char _openChar, char _closeChar) {
      String sigSubString = determineSubSignature(_sigb, _currentOffset);
      if (sigSubString.isEmpty()) {
         return _currentOffset;
      }

      int i = 0;
      int depth = 0;

      for (char chr : sigSubString.toCharArray()) {
         if (chr == _openChar) {
            depth++;
         } else if (chr == _closeChar) {
            depth--;
         }

         if (depth == 0) {
            return _currentOffset + i;
         }

         i++;
      }

      throw new IllegalStateException("Unable to parse signature for empty collection");
   }

   private static String determineSubSignature(byte[] _currentOffset, int _sigb) {
      byte[] restSigbytes = Arrays.copyOfRange(_sigb, _currentOffset, _sigb.length);
      return new String(restSigbytes);
   }

   static int determineSignatureOffsetArray(byte[] _currentOffset, int _sigb) {
      String sigSubString = determineSubSignature(_sigb, _currentOffset);
      if (sigSubString.isEmpty()) {
         return _currentOffset;
      }

      EmptyCollectionHelper.ECollectionSubType newtype = determineCollectionSubType((char)_sigb[_currentOffset]);

      return switch (newtype) {
         case ARRAY -> determineSignatureOffsetStruct(_sigb, _currentOffset);
         case STRUCT -> determineSignatureOffsetDict(_sigb, _currentOffset);
         case DICT -> determineSignatureOffsetArray(_sigb, _currentOffset + 1);
         case PRIMITIVE -> _currentOffset;
         default -> throw new IllegalStateException("Unable to parse signature for empty collection");
      };
   }

   private static EmptyCollectionHelper.ECollectionSubType determineCollectionSubType(char _sig) {
      return switch (_sig) {
         case '(' -> EmptyCollectionHelper.ECollectionSubType.STRUCT;
         case 'a' -> EmptyCollectionHelper.ECollectionSubType.ARRAY;
         case '{' -> EmptyCollectionHelper.ECollectionSubType.DICT;
         default -> EmptyCollectionHelper.ECollectionSubType.PRIMITIVE;
      };
   }

   static int determineSignatureOffsetDict(byte[] _sigb, int _currentOffset) {
      return determineEndOfBracketStructure(_sigb, _currentOffset, (char)123, (char)125);
   }

   // $VF: Compiled from EmptyCollectionHelper.java
   enum ECollectionSubType {
      ARRAY,
      STRUCT,
      DICT,
      PRIMITIVE;
   }
}
