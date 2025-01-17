// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import us.hebi.quickbuf.ProtoEnum;
import us.hebi.quickbuf.ProtoUtil;

public final class MsgTypeOuterClass {
  /**
   * Protobuf enum {@code MsgType}
   */
  public enum MsgType implements ProtoEnum<MsgType> {
    /**
     * <code>MSG_TYPE_NONE = 0;</code>
     */
    MSG_TYPE_NONE("MSG_TYPE_NONE", 0),

    /**
     * <code>MSG_TYPE_CUSTOM_TEXT = 1;</code>
     */
    MSG_TYPE_CUSTOM_TEXT("MSG_TYPE_CUSTOM_TEXT", 1),

    /**
     * <code>MSG_TYPE_EMOJI = 2;</code>
     */
    MSG_TYPE_EMOJI("MSG_TYPE_EMOJI", 2);

    /**
     * <code>MSG_TYPE_NONE = 0;</code>
     */
    public static final int MSG_TYPE_NONE_VALUE = 0;

    /**
     * <code>MSG_TYPE_CUSTOM_TEXT = 1;</code>
     */
    public static final int MSG_TYPE_CUSTOM_TEXT_VALUE = 1;

    /**
     * <code>MSG_TYPE_EMOJI = 2;</code>
     */
    public static final int MSG_TYPE_EMOJI_VALUE = 2;

    private final String name;

    private final int number;

    private MsgType(String name, int number) {
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
    public static EnumConverter<MsgType> converter() {
      return MsgTypeConverter.INSTANCE;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value, or null if unknown.
     */
    public static MsgType forNumber(int value) {
      return MsgTypeConverter.INSTANCE.forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @param other Fallback value in case the value is not known.
     * @return The enum associated with the given numeric wire value, or the fallback value if unknown.
     */
    public static MsgType forNumberOr(int number, MsgType other) {
      MsgType value = forNumber(number);
      return value == null ? other : value;
    }

    enum MsgTypeConverter implements EnumConverter<MsgType> {
      INSTANCE;

      private static final MsgType[] lookup = new MsgType[3];

      static {
        lookup[0] = MSG_TYPE_NONE;
        lookup[1] = MSG_TYPE_CUSTOM_TEXT;
        lookup[2] = MSG_TYPE_EMOJI;
      }

      @Override
      public final MsgType forNumber(final int value) {
        if (value >= 0 && value < lookup.length) {
          return lookup[value];
        }
        return null;
      }

      @Override
      public final MsgType forName(final CharSequence value) {
        if (value.length() == 13) {
          if (ProtoUtil.isEqual("MSG_TYPE_NONE", value)) {
            return MSG_TYPE_NONE;
          }
        }
        if (value.length() == 14) {
          if (ProtoUtil.isEqual("MSG_TYPE_EMOJI", value)) {
            return MSG_TYPE_EMOJI;
          }
        }
        if (value.length() == 20) {
          if (ProtoUtil.isEqual("MSG_TYPE_CUSTOM_TEXT", value)) {
            return MSG_TYPE_CUSTOM_TEXT;
          }
        }
        return null;
      }
    }
  }
}
