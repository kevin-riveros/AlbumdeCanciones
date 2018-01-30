package pe.com.kevinrsd.albumdecanciones

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var recyclerView:RecyclerView=findViewById(R.id.recycle)
        recyclerView.layoutManager=LinearLayoutManager (this, LinearLayout.VERTICAL,false)
        val Albumcito=ArrayList<Album>()

        Albumcito.add(Album("Seminario rsd",6,R.drawable.rsd1))
        Albumcito.add(Album("Seminario rsd 2 ",2,R.drawable.rsd2))
        Albumcito.add(Album("tylerRSD",33,R.drawable.rsd3))
        Albumcito.add(Album("Seminario rsd 3",2,R.drawable.rsd4))

        val adapter=AdapterAlbum(Albumcito)
        recyclerView.adapter=adapter
    }
}
