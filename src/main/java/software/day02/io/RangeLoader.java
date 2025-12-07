package software.day02.io;

import java.io.IOException;
import java.util.List;

import software.day02.models.IdRange;

public interface RangeLoader {
    public List<IdRange> load() throws IOException;
}
