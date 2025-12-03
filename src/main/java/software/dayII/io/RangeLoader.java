package software.dayII.io;

import java.io.IOException;
import java.util.List;

import software.dayII.models.IdRange;

public interface RangeLoader {
    public List<IdRange> load() throws IOException;
}
