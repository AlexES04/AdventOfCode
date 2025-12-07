package software.day02.io;

import java.util.List;

import software.day02.models.IdRange;

public interface RangeDeserializer {
    public List<IdRange> deserialize(String range);
}
