// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import us.hebi.quickbuf.ProtoEnum;
import us.hebi.quickbuf.ProtoUtil;

public final class PlatformTypeOuterClass {
  /**
   * Protobuf enum {@code PlatformType}
   */
  public enum PlatformType implements ProtoEnum<PlatformType> {
    /**
     * <code>EDITOR = 0;</code>
     */
    EDITOR("EDITOR", 0),

    /**
     * <code>IOS = 1;</code>
     */
    IOS("IOS", 1),

    /**
     * <code>ANDROID = 2;</code>
     */
    ANDROID("ANDROID", 2),

    /**
     * <code>PC = 3;</code>
     */
    PC("PC", 3),

    /**
     * <code>WEB = 4;</code>
     */
    WEB("WEB", 4),

    /**
     * <code>WAP = 5;</code>
     */
    WAP("WAP", 5),

    /**
     * <code>PS4 = 6;</code>
     */
    PS4("PS4", 6),

    /**
     * <code>NINTENDO = 7;</code>
     */
    NINTENDO("NINTENDO", 7),

    /**
     * <code>CLOUD_ANDROID = 8;</code>
     */
    CLOUD_ANDROID("CLOUD_ANDROID", 8),

    /**
     * <code>CLOUD_PC = 9;</code>
     */
    CLOUD_PC("CLOUD_PC", 9),

    /**
     * <code>CLOUD_IOS = 10;</code>
     */
    CLOUD_IOS("CLOUD_IOS", 10),

    /**
     * <code>PS5 = 11;</code>
     */
    PS5("PS5", 11),

    /**
     * <code>MAC = 12;</code>
     */
    MAC("MAC", 12),

    /**
     * <code>CLOUD_MAC = 13;</code>
     */
    CLOUD_MAC("CLOUD_MAC", 13),

    /**
     * <code>CLOUD_WEB_ANDROID = 20;</code>
     */
    CLOUD_WEB_ANDROID("CLOUD_WEB_ANDROID", 20),

    /**
     * <code>CLOUD_WEB_IOS = 21;</code>
     */
    CLOUD_WEB_IOS("CLOUD_WEB_IOS", 21),

    /**
     * <code>CLOUD_WEB_PC = 22;</code>
     */
    CLOUD_WEB_PC("CLOUD_WEB_PC", 22),

    /**
     * <code>CLOUD_WEB_MAC = 23;</code>
     */
    CLOUD_WEB_MAC("CLOUD_WEB_MAC", 23),

    /**
     * <code>CLOUD_WEB_TOUCH = 24;</code>
     */
    CLOUD_WEB_TOUCH("CLOUD_WEB_TOUCH", 24),

    /**
     * <code>CLOUD_WEB_KEYBOARD = 25;</code>
     */
    CLOUD_WEB_KEYBOARD("CLOUD_WEB_KEYBOARD", 25);

    /**
     * <code>EDITOR = 0;</code>
     */
    public static final int EDITOR_VALUE = 0;

    /**
     * <code>IOS = 1;</code>
     */
    public static final int IOS_VALUE = 1;

    /**
     * <code>ANDROID = 2;</code>
     */
    public static final int ANDROID_VALUE = 2;

    /**
     * <code>PC = 3;</code>
     */
    public static final int PC_VALUE = 3;

    /**
     * <code>WEB = 4;</code>
     */
    public static final int WEB_VALUE = 4;

    /**
     * <code>WAP = 5;</code>
     */
    public static final int WAP_VALUE = 5;

    /**
     * <code>PS4 = 6;</code>
     */
    public static final int PS4_VALUE = 6;

    /**
     * <code>NINTENDO = 7;</code>
     */
    public static final int NINTENDO_VALUE = 7;

    /**
     * <code>CLOUD_ANDROID = 8;</code>
     */
    public static final int CLOUD_ANDROID_VALUE = 8;

    /**
     * <code>CLOUD_PC = 9;</code>
     */
    public static final int CLOUD_PC_VALUE = 9;

    /**
     * <code>CLOUD_IOS = 10;</code>
     */
    public static final int CLOUD_IOS_VALUE = 10;

    /**
     * <code>PS5 = 11;</code>
     */
    public static final int PS5_VALUE = 11;

    /**
     * <code>MAC = 12;</code>
     */
    public static final int MAC_VALUE = 12;

    /**
     * <code>CLOUD_MAC = 13;</code>
     */
    public static final int CLOUD_MAC_VALUE = 13;

    /**
     * <code>CLOUD_WEB_ANDROID = 20;</code>
     */
    public static final int CLOUD_WEB_ANDROID_VALUE = 20;

    /**
     * <code>CLOUD_WEB_IOS = 21;</code>
     */
    public static final int CLOUD_WEB_IOS_VALUE = 21;

    /**
     * <code>CLOUD_WEB_PC = 22;</code>
     */
    public static final int CLOUD_WEB_PC_VALUE = 22;

    /**
     * <code>CLOUD_WEB_MAC = 23;</code>
     */
    public static final int CLOUD_WEB_MAC_VALUE = 23;

    /**
     * <code>CLOUD_WEB_TOUCH = 24;</code>
     */
    public static final int CLOUD_WEB_TOUCH_VALUE = 24;

    /**
     * <code>CLOUD_WEB_KEYBOARD = 25;</code>
     */
    public static final int CLOUD_WEB_KEYBOARD_VALUE = 25;

    private final String name;

    private final int number;

    private PlatformType(String name, int number) {
      this.name = name;
      this.number = number;
    }

    /**
     * @return the string representation of enum entry
     */
    @Override
    public String getName() {
      return name;
    }

    /**
     * @return the numeric wire value of this enum entry
     */
    @Override
    public int getNumber() {
      return number;
    }

    /**
     * @return a converter that maps between this enum's numeric and text representations
     */
    public static EnumConverter<PlatformType> converter() {
      return PlatformTypeConverter.INSTANCE;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value, or null if unknown.
     */
    public static PlatformType forNumber(int value) {
      return PlatformTypeConverter.INSTANCE.forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @param other Fallback value in case the value is not known.
     * @return The enum associated with the given numeric wire value, or the fallback value if unknown.
     */
    public static PlatformType forNumberOr(int number, PlatformType other) {
      PlatformType value = forNumber(number);
      return value == null ? other : value;
    }

    enum PlatformTypeConverter implements EnumConverter<PlatformType> {
      INSTANCE;

      private static final PlatformType[] lookup = new PlatformType[26];

      static {
        lookup[0] = EDITOR;
        lookup[1] = IOS;
        lookup[2] = ANDROID;
        lookup[3] = PC;
        lookup[4] = WEB;
        lookup[5] = WAP;
        lookup[6] = PS4;
        lookup[7] = NINTENDO;
        lookup[8] = CLOUD_ANDROID;
        lookup[9] = CLOUD_PC;
        lookup[10] = CLOUD_IOS;
        lookup[11] = PS5;
        lookup[12] = MAC;
        lookup[13] = CLOUD_MAC;
        lookup[20] = CLOUD_WEB_ANDROID;
        lookup[21] = CLOUD_WEB_IOS;
        lookup[22] = CLOUD_WEB_PC;
        lookup[23] = CLOUD_WEB_MAC;
        lookup[24] = CLOUD_WEB_TOUCH;
        lookup[25] = CLOUD_WEB_KEYBOARD;
      }

      @Override
      public final PlatformType forNumber(final int value) {
        if (value >= 0 && value < lookup.length) {
          return lookup[value];
        }
        return null;
      }

      @Override
      public final PlatformType forName(final CharSequence value) {
        switch (value.length()) {
          case 2: {
            if (ProtoUtil.isEqual("PC", value)) {
              return PC;
            }
            break;
          }
          case 3: {
            if (ProtoUtil.isEqual("IOS", value)) {
              return IOS;
            }
            if (ProtoUtil.isEqual("WEB", value)) {
              return WEB;
            }
            if (ProtoUtil.isEqual("WAP", value)) {
              return WAP;
            }
            if (ProtoUtil.isEqual("PS4", value)) {
              return PS4;
            }
            if (ProtoUtil.isEqual("PS5", value)) {
              return PS5;
            }
            if (ProtoUtil.isEqual("MAC", value)) {
              return MAC;
            }
            break;
          }
          case 6: {
            if (ProtoUtil.isEqual("EDITOR", value)) {
              return EDITOR;
            }
            break;
          }
          case 7: {
            if (ProtoUtil.isEqual("ANDROID", value)) {
              return ANDROID;
            }
            break;
          }
          case 8: {
            if (ProtoUtil.isEqual("NINTENDO", value)) {
              return NINTENDO;
            }
            if (ProtoUtil.isEqual("CLOUD_PC", value)) {
              return CLOUD_PC;
            }
            break;
          }
          case 9: {
            if (ProtoUtil.isEqual("CLOUD_IOS", value)) {
              return CLOUD_IOS;
            }
            if (ProtoUtil.isEqual("CLOUD_MAC", value)) {
              return CLOUD_MAC;
            }
            break;
          }
          case 12: {
            if (ProtoUtil.isEqual("CLOUD_WEB_PC", value)) {
              return CLOUD_WEB_PC;
            }
            break;
          }
          case 13: {
            if (ProtoUtil.isEqual("CLOUD_ANDROID", value)) {
              return CLOUD_ANDROID;
            }
            if (ProtoUtil.isEqual("CLOUD_WEB_IOS", value)) {
              return CLOUD_WEB_IOS;
            }
            if (ProtoUtil.isEqual("CLOUD_WEB_MAC", value)) {
              return CLOUD_WEB_MAC;
            }
            break;
          }
          case 15: {
            if (ProtoUtil.isEqual("CLOUD_WEB_TOUCH", value)) {
              return CLOUD_WEB_TOUCH;
            }
            break;
          }
          case 17: {
            if (ProtoUtil.isEqual("CLOUD_WEB_ANDROID", value)) {
              return CLOUD_WEB_ANDROID;
            }
            break;
          }
          case 18: {
            if (ProtoUtil.isEqual("CLOUD_WEB_KEYBOARD", value)) {
              return CLOUD_WEB_KEYBOARD;
            }
            break;
          }
        }
        return null;
      }
    }
  }
}
