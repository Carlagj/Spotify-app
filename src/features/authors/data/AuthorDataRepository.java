package features.authors.data;

import features.authors.domain.Author;
import features.authors.domain.AuthorRepository;

import java.util.ArrayList;

public class AuthorDataRepository implements AuthorRepository {

    private AuthorMemLocalDataSource authorMemLocalDataSource;

    public AuthorDataRepository(AuthorMemLocalDataSource authorMemLocalDataSource) {
        this.authorMemLocalDataSource = authorMemLocalDataSource;
    }

    @Override
    public ArrayList<Author> getAuthors() {
        return null;
    }
}
