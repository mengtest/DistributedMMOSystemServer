// automatically generated by the FlatBuffers compiler, do not modify

package com.elusiven;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
final class Data {
  private Data() { }
  public static final byte NONE = 0;
  public static final byte InitialConnectCommand = 1;
  public static final byte MovementCommand = 2;
  public static final byte MeetCommand = 3;
  public static final byte TransferPlayerCommand = 4;
  public static final byte PlayerInfo = 5;

  public static final String[] names = { "NONE", "InitialConnectCommand", "MovementCommand", "MeetCommand", "TransferPlayerCommand", "PlayerInfo", };

  public static String name(int e) { return names[e]; }
}

final class Vec3 extends Struct {
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public Vec3 __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public float x() { return bb.getFloat(bb_pos + 0); }
  public float y() { return bb.getFloat(bb_pos + 4); }
  public float z() { return bb.getFloat(bb_pos + 8); }

  public static int createVec3(FlatBufferBuilder builder, float x, float y, float z) {
    builder.prep(4, 12);
    builder.putFloat(z);
    builder.putFloat(y);
    builder.putFloat(x);
    return builder.offset();
  }
}

final class Qua extends Struct {
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public Qua __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public float x() { return bb.getFloat(bb_pos + 0); }
  public float y() { return bb.getFloat(bb_pos + 4); }
  public float z() { return bb.getFloat(bb_pos + 8); }
  public float w() { return bb.getFloat(bb_pos + 12); }

  public static int createQua(FlatBufferBuilder builder, float x, float y, float z, float w) {
    builder.prep(4, 16);
    builder.putFloat(w);
    builder.putFloat(z);
    builder.putFloat(y);
    builder.putFloat(x);
    return builder.offset();
  }
}

final class InitialConnectCommand extends Table {
  public static InitialConnectCommand getRootAsInitialConnectCommand(ByteBuffer _bb) { return getRootAsInitialConnectCommand(_bb, new InitialConnectCommand()); }
  public static InitialConnectCommand getRootAsInitialConnectCommand(ByteBuffer _bb, InitialConnectCommand obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public InitialConnectCommand __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public PlayerInfo player() { return player(new PlayerInfo()); }
  public PlayerInfo player(PlayerInfo obj) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }

  public static int createInitialConnectCommand(FlatBufferBuilder builder,
      int playerOffset) {
    builder.startObject(1);
    InitialConnectCommand.addPlayer(builder, playerOffset);
    return InitialConnectCommand.endInitialConnectCommand(builder);
  }

  public static void startInitialConnectCommand(FlatBufferBuilder builder) { builder.startObject(1); }
  public static void addPlayer(FlatBufferBuilder builder, int playerOffset) { builder.addOffset(0, playerOffset, 0); }
  public static int endInitialConnectCommand(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

final class MovementCommand extends Table {
  public static MovementCommand getRootAsMovementCommand(ByteBuffer _bb) { return getRootAsMovementCommand(_bb, new MovementCommand()); }
  public static MovementCommand getRootAsMovementCommand(ByteBuffer _bb, MovementCommand obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public MovementCommand __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public PlayerInfo player() { return player(new PlayerInfo()); }
  public PlayerInfo player(PlayerInfo obj) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }

  public static int createMovementCommand(FlatBufferBuilder builder,
      int playerOffset) {
    builder.startObject(1);
    MovementCommand.addPlayer(builder, playerOffset);
    return MovementCommand.endMovementCommand(builder);
  }

  public static void startMovementCommand(FlatBufferBuilder builder) { builder.startObject(1); }
  public static void addPlayer(FlatBufferBuilder builder, int playerOffset) { builder.addOffset(0, playerOffset, 0); }
  public static int endMovementCommand(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

final class MeetCommand extends Table {
  public static MeetCommand getRootAsMeetCommand(ByteBuffer _bb) { return getRootAsMeetCommand(_bb, new MeetCommand()); }
  public static MeetCommand getRootAsMeetCommand(ByteBuffer _bb, MeetCommand obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public MeetCommand __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public PlayerInfo otherPlayer() { return otherPlayer(new PlayerInfo()); }
  public PlayerInfo otherPlayer(PlayerInfo obj) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }

  public static int createMeetCommand(FlatBufferBuilder builder,
      int otherPlayerOffset) {
    builder.startObject(1);
    MeetCommand.addOtherPlayer(builder, otherPlayerOffset);
    return MeetCommand.endMeetCommand(builder);
  }

  public static void startMeetCommand(FlatBufferBuilder builder) { builder.startObject(1); }
  public static void addOtherPlayer(FlatBufferBuilder builder, int otherPlayerOffset) { builder.addOffset(0, otherPlayerOffset, 0); }
  public static int endMeetCommand(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

final class TransferPlayerCommand extends Table {
  public static TransferPlayerCommand getRootAsTransferPlayerCommand(ByteBuffer _bb) { return getRootAsTransferPlayerCommand(_bb, new TransferPlayerCommand()); }
  public static TransferPlayerCommand getRootAsTransferPlayerCommand(ByteBuffer _bb, TransferPlayerCommand obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public TransferPlayerCommand __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public PlayerInfo player() { return player(new PlayerInfo()); }
  public PlayerInfo player(PlayerInfo obj) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }

  public static int createTransferPlayerCommand(FlatBufferBuilder builder,
      int playerOffset) {
    builder.startObject(1);
    TransferPlayerCommand.addPlayer(builder, playerOffset);
    return TransferPlayerCommand.endTransferPlayerCommand(builder);
  }

  public static void startTransferPlayerCommand(FlatBufferBuilder builder) { builder.startObject(1); }
  public static void addPlayer(FlatBufferBuilder builder, int playerOffset) { builder.addOffset(0, playerOffset, 0); }
  public static int endTransferPlayerCommand(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

final class PlayerInfo extends Table {
  public static PlayerInfo getRootAsPlayerInfo(ByteBuffer _bb) { return getRootAsPlayerInfo(_bb, new PlayerInfo()); }
  public static PlayerInfo getRootAsPlayerInfo(ByteBuffer _bb, PlayerInfo obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public PlayerInfo __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String id() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer idAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public String name() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer nameAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public Vec3 pos() { return pos(new Vec3()); }
  public Vec3 pos(Vec3 obj) { int o = __offset(8); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }
  public Qua rot() { return rot(new Qua()); }
  public Qua rot(Qua obj) { int o = __offset(10); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }

  public static void startPlayerInfo(FlatBufferBuilder builder) { builder.startObject(4); }
  public static void addId(FlatBufferBuilder builder, int idOffset) { builder.addOffset(0, idOffset, 0); }
  public static void addName(FlatBufferBuilder builder, int nameOffset) { builder.addOffset(1, nameOffset, 0); }
  public static void addPos(FlatBufferBuilder builder, int posOffset) { builder.addStruct(2, posOffset, 0); }
  public static void addRot(FlatBufferBuilder builder, int rotOffset) { builder.addStruct(3, rotOffset, 0); }
  public static int endPlayerInfo(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

final class MessageRoot extends Table {
  public static MessageRoot getRootAsMessageRoot(ByteBuffer _bb) { return getRootAsMessageRoot(_bb, new MessageRoot()); }
  public static MessageRoot getRootAsMessageRoot(ByteBuffer _bb, MessageRoot obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public MessageRoot __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public byte dataType() { int o = __offset(4); return o != 0 ? bb.get(o + bb_pos) : 0; }
  public Table data(Table obj) { int o = __offset(6); return o != 0 ? __union(obj, o) : null; }

  public static int createMessageRoot(FlatBufferBuilder builder,
      byte data_type,
      int dataOffset) {
    builder.startObject(2);
    MessageRoot.addData(builder, dataOffset);
    MessageRoot.addDataType(builder, data_type);
    return MessageRoot.endMessageRoot(builder);
  }

  public static void startMessageRoot(FlatBufferBuilder builder) { builder.startObject(2); }
  public static void addDataType(FlatBufferBuilder builder, byte dataType) { builder.addByte(0, dataType, 0); }
  public static void addData(FlatBufferBuilder builder, int dataOffset) { builder.addOffset(1, dataOffset, 0); }
  public static int endMessageRoot(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
  public static void finishMessageRootBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
}

