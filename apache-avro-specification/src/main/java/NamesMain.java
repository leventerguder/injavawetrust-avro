import a.full.Name;
import a.full.Understanding;

public class NamesMain {

    public static void main(String[] args) {

        Example example = Example.newBuilder()
                .setInheritNull(Simple.a)
                .setFullName(Name.newBuilder().setInheritNamespace(Understanding.e).build())
                .setExplicitNamespace(new explicit.Simple())
                .build();

        System.out.println(example);
        // https://avro.apache.org/docs/1.11.1/specification/#names
    }
}
