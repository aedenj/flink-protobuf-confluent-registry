package flink.protobuf.confluent.registry;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.Descriptors;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("protobuf deserialization")
class ProtobufDeserializationSchemaTest {

    private static ProtobufDeserializationSchema deserializer;
    private static Descriptors.FileDescriptor singleField;

    @BeforeAll
    static void beforeAll() {
        deserializer = new ProtobufDeserializationSchema();

        DescriptorProtos.FileDescriptorProto.parseFrom();
    }

    @Test
    @DisplayName("deserializing null returns null")
    void testNullMessage() throws IOException {
        assertThat(deserializer.deserialize(null)).isNull();
    }

    @Test
    @DisplayName("deserializing null returns null")
    void testSingleField() throws IOException {
        assertThat(deserializer.deserialize(null)).isNull();
    }

}
