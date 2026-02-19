package features.albums.data;

import features.albums.domain.Album;
import features.albums.domain.AlbumRepository;

import java.util.ArrayList;

public class AlbumDataRepository implements AlbumRepository {



    private AlbumMemLocalDataSource albumMemLocalDataSource;

    public AlbumDataRepository(AlbumMemLocalDataSource albumMemLocalDataSource) {
        this.albumMemLocalDataSource = albumMemLocalDataSource;
    }


    @Override
    public ArrayList<Album> getAlbums() {

        return albumMemLocalDataSource.findAll();
    }
}
