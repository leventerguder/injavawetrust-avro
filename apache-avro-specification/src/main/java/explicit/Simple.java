/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package explicit;
/** A simple name (attribute) and a namespace (attribute); the fullname is 'explicit.Simple' (this is a different type than of the 'inheritNull' field). */
@org.apache.avro.specific.FixedSize(12)
@org.apache.avro.specific.AvroGenerated
public class Simple extends org.apache.avro.specific.SpecificFixed {
  private static final long serialVersionUID = 1217551151225493726L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"fixed\",\"name\":\"Simple\",\"namespace\":\"explicit\",\"doc\":\"A simple name (attribute) and a namespace (attribute); the fullname is 'explicit.Simple' (this is a different type than of the 'inheritNull' field).\",\"size\":12}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  /** Creates a new Simple */
  public Simple() {
    super();
  }

  /**
   * Creates a new Simple with the given bytes.
   * @param bytes The bytes to create the new Simple.
   */
  public Simple(byte[] bytes) {
    super(bytes);
  }

  private static final org.apache.avro.io.DatumWriter<Simple>
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter<Simple>(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, org.apache.avro.specific.SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader<Simple>
    READER$ = new org.apache.avro.specific.SpecificDatumReader<Simple>(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, org.apache.avro.specific.SpecificData.getDecoder(in));
  }

}
