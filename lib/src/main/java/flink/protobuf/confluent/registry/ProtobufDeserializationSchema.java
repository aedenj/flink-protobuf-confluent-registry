package flink.protobuf.confluent.registry;


import com.google.protobuf.DynamicMessage;
import org.apache.flink.api.common.serialization.DeserializationSchema;
import org.apache.flink.api.common.typeinfo.TypeInformation;

import java.io.IOException;

/**
 * TO DO's:
 *     * Support deserialization given the descriptor
 */
public class ProtobufDeserializationSchema implements DeserializationSchema<DynamicMessage> {
    private static final long serialVersionUID = 1L;

    @Override
    public DynamicMessage deserialize(final byte[] message) throws IOException {
        return null;
    }

    @Override
    public boolean isEndOfStream(final DynamicMessage nextElement) {
        return false;
    }

    @Override
    public TypeInformation<DynamicMessage> getProducedType() {
        return null;
    }
}
