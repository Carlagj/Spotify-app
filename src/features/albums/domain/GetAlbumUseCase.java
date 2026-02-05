package features.albums.domain;

import features.authors.domain.Author;
import features.authors.domain.AuthorRepository;

import java.util.ArrayList;

public class GetAlbumUseCase {
    private AlbumRepository albumRepository;


    public GetAlbumUseCase(AlbumRepository albumRepository) {

        this.albumRepository = albumRepository;
    }


    public ArrayList<Album> execute(){

        return  albumRepository.getAlbums();
    }

}
