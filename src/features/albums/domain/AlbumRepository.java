package features.albums.domain;

import features.authors.domain.Author;

import java.util.ArrayList;

public interface AlbumRepository {

     ArrayList<Album> getAlbums();
}
