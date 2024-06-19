// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;
import us.hebi.quickbuf.RepeatedMessage;

public final class GachaCeilingOuterClass {
  /**
   * Protobuf type {@code GachaCeiling}
   */
  public static final class GachaCeiling extends ProtoMessage<GachaCeiling> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 ceiling_num = 14;</code>
     */
    private int ceilingNum;

    /**
     * <code>optional bool is_claimed = 9;</code>
     */
    private boolean isClaimed;

    /**
     * <code>repeated .GachaCeilingAvatar avatar_list = 5;</code>
     */
    private final RepeatedMessage<GachaCeilingAvatarOuterClass.GachaCeilingAvatar> avatarList = RepeatedMessage.newEmptyInstance(GachaCeilingAvatarOuterClass.GachaCeilingAvatar.getFactory());

    private GachaCeiling() {
    }

    /**
     * @return a new empty instance of {@code GachaCeiling}
     */
    public static GachaCeiling newInstance() {
      return new GachaCeiling();
    }

    /**
     * <code>optional uint32 ceiling_num = 14;</code>
     * @return whether the ceilingNum field is set
     */
    public boolean hasCeilingNum() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 ceiling_num = 14;</code>
     * @return this
     */
    public GachaCeiling clearCeilingNum() {
      bitField0_ &= ~0x00000001;
      ceilingNum = 0;
      return this;
    }

    /**
     * <code>optional uint32 ceiling_num = 14;</code>
     * @return the ceilingNum
     */
    public int getCeilingNum() {
      return ceilingNum;
    }

    /**
     * <code>optional uint32 ceiling_num = 14;</code>
     * @param value the ceilingNum to set
     * @return this
     */
    public GachaCeiling setCeilingNum(final int value) {
      bitField0_ |= 0x00000001;
      ceilingNum = value;
      return this;
    }

    /**
     * <code>optional bool is_claimed = 9;</code>
     * @return whether the isClaimed field is set
     */
    public boolean hasIsClaimed() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional bool is_claimed = 9;</code>
     * @return this
     */
    public GachaCeiling clearIsClaimed() {
      bitField0_ &= ~0x00000002;
      isClaimed = false;
      return this;
    }

    /**
     * <code>optional bool is_claimed = 9;</code>
     * @return the isClaimed
     */
    public boolean getIsClaimed() {
      return isClaimed;
    }

    /**
     * <code>optional bool is_claimed = 9;</code>
     * @param value the isClaimed to set
     * @return this
     */
    public GachaCeiling setIsClaimed(final boolean value) {
      bitField0_ |= 0x00000002;
      isClaimed = value;
      return this;
    }

    /**
     * <code>repeated .GachaCeilingAvatar avatar_list = 5;</code>
     * @return whether the avatarList field is set
     */
    public boolean hasAvatarList() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>repeated .GachaCeilingAvatar avatar_list = 5;</code>
     * @return this
     */
    public GachaCeiling clearAvatarList() {
      bitField0_ &= ~0x00000004;
      avatarList.clear();
      return this;
    }

    /**
     * <code>repeated .GachaCeilingAvatar avatar_list = 5;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableAvatarList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<GachaCeilingAvatarOuterClass.GachaCeilingAvatar> getAvatarList() {
      return avatarList;
    }

    /**
     * <code>repeated .GachaCeilingAvatar avatar_list = 5;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<GachaCeilingAvatarOuterClass.GachaCeilingAvatar> getMutableAvatarList() {
      bitField0_ |= 0x00000004;
      return avatarList;
    }

    /**
     * <code>repeated .GachaCeilingAvatar avatar_list = 5;</code>
     * @param value the avatarList to add
     * @return this
     */
    public GachaCeiling addAvatarList(final GachaCeilingAvatarOuterClass.GachaCeilingAvatar value) {
      bitField0_ |= 0x00000004;
      avatarList.add(value);
      return this;
    }

    /**
     * <code>repeated .GachaCeilingAvatar avatar_list = 5;</code>
     * @param values the avatarList to add
     * @return this
     */
    public GachaCeiling addAllAvatarList(
        final GachaCeilingAvatarOuterClass.GachaCeilingAvatar... values) {
      bitField0_ |= 0x00000004;
      avatarList.addAll(values);
      return this;
    }

    @Override
    public GachaCeiling copyFrom(final GachaCeiling other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        ceilingNum = other.ceilingNum;
        isClaimed = other.isClaimed;
        avatarList.copyFrom(other.avatarList);
      }
      return this;
    }

    @Override
    public GachaCeiling mergeFrom(final GachaCeiling other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasCeilingNum()) {
        setCeilingNum(other.ceilingNum);
      }
      if (other.hasIsClaimed()) {
        setIsClaimed(other.isClaimed);
      }
      if (other.hasAvatarList()) {
        getMutableAvatarList().addAll(other.avatarList);
      }
      return this;
    }

    @Override
    public GachaCeiling clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      ceilingNum = 0;
      isClaimed = false;
      avatarList.clear();
      return this;
    }

    @Override
    public GachaCeiling clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      avatarList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GachaCeiling)) {
        return false;
      }
      GachaCeiling other = (GachaCeiling) o;
      return bitField0_ == other.bitField0_
        && (!hasCeilingNum() || ceilingNum == other.ceilingNum)
        && (!hasIsClaimed() || isClaimed == other.isClaimed)
        && (!hasAvatarList() || avatarList.equals(other.avatarList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 112);
        output.writeUInt32NoTag(ceilingNum);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 72);
        output.writeBoolNoTag(isClaimed);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        for (int i = 0; i < avatarList.length(); i++) {
          output.writeRawByte((byte) 42);
          output.writeMessageNoTag(avatarList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(ceilingNum);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 2;
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += (1 * avatarList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(avatarList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GachaCeiling mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 112: {
            // ceilingNum
            ceilingNum = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 72) {
              break;
            }
          }
          case 72: {
            // isClaimed
            isClaimed = input.readBool();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 42) {
              break;
            }
          }
          case 42: {
            // avatarList
            tag = input.readRepeatedMessage(avatarList, tag);
            bitField0_ |= 0x00000004;
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.ceilingNum, ceilingNum);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeBool(FieldNames.isClaimed, isClaimed);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRepeatedMessage(FieldNames.avatarList, avatarList);
      }
      output.endObject();
    }

    @Override
    public GachaCeiling mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1655838327:
          case 209119492: {
            if (input.isAtField(FieldNames.ceilingNum)) {
              if (!input.trySkipNullValue()) {
                ceilingNum = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 273538385:
          case -1941340218: {
            if (input.isAtField(FieldNames.isClaimed)) {
              if (!input.trySkipNullValue()) {
                isClaimed = input.readBool();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -403402345:
          case 397055940: {
            if (input.isAtField(FieldNames.avatarList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(avatarList);
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public GachaCeiling clone() {
      return new GachaCeiling().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GachaCeiling parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GachaCeiling(), data).checkInitialized();
    }

    public static GachaCeiling parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GachaCeiling(), input).checkInitialized();
    }

    public static GachaCeiling parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GachaCeiling(), input).checkInitialized();
    }

    /**
     * @return factory for creating GachaCeiling messages
     */
    public static MessageFactory<GachaCeiling> getFactory() {
      return GachaCeilingFactory.INSTANCE;
    }

    private enum GachaCeilingFactory implements MessageFactory<GachaCeiling> {
      INSTANCE;

      @Override
      public GachaCeiling create() {
        return GachaCeiling.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName ceilingNum = FieldName.forField("ceilingNum", "ceiling_num");

      static final FieldName isClaimed = FieldName.forField("isClaimed", "is_claimed");

      static final FieldName avatarList = FieldName.forField("avatarList", "avatar_list");
    }
  }
}
