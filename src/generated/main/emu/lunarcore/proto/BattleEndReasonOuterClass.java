// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import us.hebi.quickbuf.ProtoEnum;
import us.hebi.quickbuf.ProtoUtil;

public final class BattleEndReasonOuterClass {
  /**
   * Protobuf enum {@code BattleEndReason}
   */
  public enum BattleEndReason implements ProtoEnum<BattleEndReason> {
    /**
     * <code>BATTLE_END_REASON_NONE = 0;</code>
     */
    BATTLE_END_REASON_NONE("BATTLE_END_REASON_NONE", 0),

    /**
     * <code>BATTLE_END_REASON_ALL_DIE = 1;</code>
     */
    BATTLE_END_REASON_ALL_DIE("BATTLE_END_REASON_ALL_DIE", 1),

    /**
     * <code>BATTLE_END_REASON_TURN_LIMIT = 2;</code>
     */
    BATTLE_END_REASON_TURN_LIMIT("BATTLE_END_REASON_TURN_LIMIT", 2);

    /**
     * <code>BATTLE_END_REASON_NONE = 0;</code>
     */
    public static final int BATTLE_END_REASON_NONE_VALUE = 0;

    /**
     * <code>BATTLE_END_REASON_ALL_DIE = 1;</code>
     */
    public static final int BATTLE_END_REASON_ALL_DIE_VALUE = 1;

    /**
     * <code>BATTLE_END_REASON_TURN_LIMIT = 2;</code>
     */
    public static final int BATTLE_END_REASON_TURN_LIMIT_VALUE = 2;

    private final String name;

    private final int number;

    private BattleEndReason(String name, int number) {
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
    public static EnumConverter<BattleEndReason> converter() {
      return BattleEndReasonConverter.INSTANCE;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value, or null if unknown.
     */
    public static BattleEndReason forNumber(int value) {
      return BattleEndReasonConverter.INSTANCE.forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @param other Fallback value in case the value is not known.
     * @return The enum associated with the given numeric wire value, or the fallback value if unknown.
     */
    public static BattleEndReason forNumberOr(int number, BattleEndReason other) {
      BattleEndReason value = forNumber(number);
      return value == null ? other : value;
    }

    enum BattleEndReasonConverter implements EnumConverter<BattleEndReason> {
      INSTANCE;

      private static final BattleEndReason[] lookup = new BattleEndReason[3];

      static {
        lookup[0] = BATTLE_END_REASON_NONE;
        lookup[1] = BATTLE_END_REASON_ALL_DIE;
        lookup[2] = BATTLE_END_REASON_TURN_LIMIT;
      }

      @Override
      public final BattleEndReason forNumber(final int value) {
        if (value >= 0 && value < lookup.length) {
          return lookup[value];
        }
        return null;
      }

      @Override
      public final BattleEndReason forName(final CharSequence value) {
        if (value.length() == 22) {
          if (ProtoUtil.isEqual("BATTLE_END_REASON_NONE", value)) {
            return BATTLE_END_REASON_NONE;
          }
        }
        if (value.length() == 25) {
          if (ProtoUtil.isEqual("BATTLE_END_REASON_ALL_DIE", value)) {
            return BATTLE_END_REASON_ALL_DIE;
          }
        }
        if (value.length() == 28) {
          if (ProtoUtil.isEqual("BATTLE_END_REASON_TURN_LIMIT", value)) {
            return BATTLE_END_REASON_TURN_LIMIT;
          }
        }
        return null;
      }
    }
  }
}
