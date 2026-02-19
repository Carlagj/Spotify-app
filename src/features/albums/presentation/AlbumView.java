package features.albums.presentation;

import features.albums.data.AlbumDataRepository;
import features.albums.data.AlbumMemLocalDataSource;
import features.albums.domain.Album;
import features.albums.domain.AlbumRepository;
import features.albums.domain.GetAlbumsUseCase;
import java.util.ArrayList;

public class AlbumView {

    public static void  printAlbum(){

        GetAlbumsUseCase getAlbumsUseCase = new GetAlbumsUseCase(
                new AlbumDataRepository(new AlbumMemLocalDataSource())
        );
        ArrayList<Album> albums = getAlbumsUseCase.execute();
        System.out.println(albums);


    }
}
