package static_factory_method;

public enum Size {
  EU_35(35), EU_36(36), EU_37(37), EU_38(38), EU_39(39), EU_40(40), EU_41(41), EU_42(42), EU_43(43), EU_44(44), EU_45(45), EU_46(46), EU_47(
    47), EU_48(48), EU_49(49), EU_50(50);
  private final int size;

  Size(int size) {
    this.size = size;
  }

  public int getSize() {
    return size;
  }
}