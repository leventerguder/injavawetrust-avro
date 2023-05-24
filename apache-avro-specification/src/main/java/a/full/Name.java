/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package a.full;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

/** A name attribute with a fullname, so the namespace attribute is ignored. The fullname is 'a.full.Name', and the namespace is 'a.full'. */
@org.apache.avro.specific.AvroGenerated
public class Name extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 5135644515539181068L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Name\",\"namespace\":\"a.full\",\"doc\":\"A name attribute with a fullname, so the namespace attribute is ignored. The fullname is 'a.full.Name', and the namespace is 'a.full'.\",\"fields\":[{\"name\":\"inheritNamespace\",\"type\":{\"type\":\"enum\",\"name\":\"Understanding\",\"doc\":\"A simple name (attribute) and no namespace attribute: inherit the namespace of the enclosing type 'a.full.Name'. The fullname is 'a.full.Understanding'.\",\"symbols\":[\"d\",\"e\"]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Name> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Name> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Name> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Name> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Name> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Name to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Name from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Name instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Name fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private a.full.Understanding inheritNamespace;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Name() {}

  /**
   * All-args constructor.
   * @param inheritNamespace The new value for inheritNamespace
   */
  public Name(a.full.Understanding inheritNamespace) {
    this.inheritNamespace = inheritNamespace;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return inheritNamespace;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: inheritNamespace = (a.full.Understanding)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'inheritNamespace' field.
   * @return The value of the 'inheritNamespace' field.
   */
  public a.full.Understanding getInheritNamespace() {
    return inheritNamespace;
  }


  /**
   * Sets the value of the 'inheritNamespace' field.
   * @param value the value to set.
   */
  public void setInheritNamespace(a.full.Understanding value) {
    this.inheritNamespace = value;
  }

  /**
   * Creates a new Name RecordBuilder.
   * @return A new Name RecordBuilder
   */
  public static a.full.Name.Builder newBuilder() {
    return new a.full.Name.Builder();
  }

  /**
   * Creates a new Name RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Name RecordBuilder
   */
  public static a.full.Name.Builder newBuilder(a.full.Name.Builder other) {
    if (other == null) {
      return new a.full.Name.Builder();
    } else {
      return new a.full.Name.Builder(other);
    }
  }

  /**
   * Creates a new Name RecordBuilder by copying an existing Name instance.
   * @param other The existing instance to copy.
   * @return A new Name RecordBuilder
   */
  public static a.full.Name.Builder newBuilder(a.full.Name other) {
    if (other == null) {
      return new a.full.Name.Builder();
    } else {
      return new a.full.Name.Builder(other);
    }
  }

  /**
   * RecordBuilder for Name instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Name>
    implements org.apache.avro.data.RecordBuilder<Name> {

    private a.full.Understanding inheritNamespace;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(a.full.Name.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.inheritNamespace)) {
        this.inheritNamespace = data().deepCopy(fields()[0].schema(), other.inheritNamespace);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
    }

    /**
     * Creates a Builder by copying an existing Name instance
     * @param other The existing instance to copy.
     */
    private Builder(a.full.Name other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.inheritNamespace)) {
        this.inheritNamespace = data().deepCopy(fields()[0].schema(), other.inheritNamespace);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'inheritNamespace' field.
      * @return The value.
      */
    public a.full.Understanding getInheritNamespace() {
      return inheritNamespace;
    }


    /**
      * Sets the value of the 'inheritNamespace' field.
      * @param value The value of 'inheritNamespace'.
      * @return This builder.
      */
    public a.full.Name.Builder setInheritNamespace(a.full.Understanding value) {
      validate(fields()[0], value);
      this.inheritNamespace = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'inheritNamespace' field has been set.
      * @return True if the 'inheritNamespace' field has been set, false otherwise.
      */
    public boolean hasInheritNamespace() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'inheritNamespace' field.
      * @return This builder.
      */
    public a.full.Name.Builder clearInheritNamespace() {
      inheritNamespace = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Name build() {
      try {
        Name record = new Name();
        record.inheritNamespace = fieldSetFlags()[0] ? this.inheritNamespace : (a.full.Understanding) defaultValue(fields()[0]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Name>
    WRITER$ = (org.apache.avro.io.DatumWriter<Name>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Name>
    READER$ = (org.apache.avro.io.DatumReader<Name>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeEnum(this.inheritNamespace.ordinal());

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.inheritNamespace = a.full.Understanding.values()[in.readEnum()];

    } else {
      for (int i = 0; i < 1; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.inheritNamespace = a.full.Understanding.values()[in.readEnum()];
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










