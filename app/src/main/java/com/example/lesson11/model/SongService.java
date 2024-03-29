package com.example.lesson11.model;

import android.os.Build;

import androidx.annotation.RequiresApi;

import com.example.lesson11.R;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class SongService {
    private List<Song> songList = new ArrayList<>();

    @RequiresApi(api = Build.VERSION_CODES.O)
    public SongService() {
        songList.add(new Song(1, R.drawable.cruel_summer, "Cruel Summer", Singers.taylorSwift,Duration.ofMinutes(3).plusSeconds(45), R.raw.taylor_swift_cruel_summer));
        songList.add(new Song(2, R.drawable.paint_the_town_red, "Paint The Town Red", Singers.dojaCat,Duration.ofMinutes(4).plusSeconds(55), R.raw.doja_cat_paint_the_town_red));
        songList.add(new Song(3, R.drawable.is_it_over_now, "Is It Over Now?", Singers.taylorSwift,Duration.ofMinutes(2).plusSeconds(33), R.raw.taylor_swift_is_it_over_now));
        songList.add(new Song(4, R.drawable.snoose, "Snooze", Singers.sza,Duration.ofMinutes(2).plusSeconds(55), R.raw.sza_snooze));
        songList.add(new Song(5, R.drawable.standing_next_to_you, "Standing Next To You", Singers.jungKook,Duration.ofMinutes(2).plusSeconds(31), R.raw.jung_kook_standing_next_to_you));
        songList.add(new Song(6, R.drawable.now_and_then, "Now and Then", Singers.beatles,Duration.ofMinutes(3).plusSeconds(25), R.raw.now_and_then));
        songList.add(new Song(7, R.drawable.morgan_wallen, "Thinkin' Bout Me", Singers.morganWallen,Duration.ofMinutes(3).plusSeconds(32), R.raw.thinking_of_me));
        songList.add(new Song(8, R.drawable.morgan_wallen, "Last Night", Singers.morganWallen,Duration.ofMinutes(4).plusSeconds(15), R.raw.last_night));
        songList.add(new Song(9, R.drawable.tate_mc_rae, "Greedy", Singers.tateMcRae,Duration.ofMinutes(1).plusSeconds(55), R.raw.greedy));
        songList.add(new Song(10, R.drawable.is_it_over_now, "Now That We Don't Talk", Singers.taylorSwift,Duration.ofMinutes(3).plusSeconds(43), R.raw.now_that_we_dont_talk));
    }

    public List<Song> getSongList(){
        return songList;
    }
}
