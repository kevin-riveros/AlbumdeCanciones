package pe.com.kevinrsd.albumdecanciones

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide

/**
 * Created by kevinriverosguia on 30/01/18.
 */
class AdapterAlbum(var Lista:ArrayList<Album>):RecyclerView.Adapter<AdapterAlbum.ViewHolder>() {
    override fun getItemCount(): Int {
        return Lista.size
    }

    override fun onBindViewHolder(holder: AdapterAlbum.ViewHolder, position: Int) {

        holder.bindItems(Lista[position])

    }


    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {

        val v=LayoutInflater.from(parent?.context).inflate(R.layout.content_item,parent,false)
        return ViewHolder(v)
    }


    class ViewHolder(view: View):RecyclerView.ViewHolder(view){

        fun bindItems(data:Album){
            val title:TextView=itemView.findViewById(R.id.txtTitle)
            val count:TextView=itemView.findViewById(R.id.txtCount)
            val imagen:ImageView=itemView.findViewById(R.id.imagenAlbum)

            title.text=data.name
            count.text=data.numOfSongs.toString()
            Glide.with(itemView.context).load(data.image).into(imagen)
            itemView.setOnClickListener(){
                Toast.makeText(itemView.context,"Album de ${data.name}",Toast.LENGTH_LONG).show()
            }

        }

    }
}