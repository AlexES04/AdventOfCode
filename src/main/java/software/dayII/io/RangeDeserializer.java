package software.dayII.io;

import java.util.List;

import software.dayII.models.IdRange;

public interface RangeDeserializer {
    public List<IdRange> deserialize(String range);
}
