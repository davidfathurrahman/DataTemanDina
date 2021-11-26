package com.dina.datateman

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_my_friend.*

class MyFriendsFragment : Fragment() {
    lateinit var listTeman:ArrayList<MyFriend>

    private fun simulasiDataTeman() {
        listTeman= ArrayList()
        listTeman.add(
            MyFriend("Dina Nuraska", "Perempuan", "dina_20510002@Stimata.ac.id",
        "083845627879", "Palembang")
        )
        listTeman.add(
            MyFriend("Malinda Mahanani", "Perempuan", "malinda_20510008@Stimata.ac.id",
        "089667916862", "Lamongan")
        )
        listTeman.add(
            MyFriend("Egif Adea", "Perempuan", "egif_20510005@Stimata.ac.id",
            "081546240013", "Blitar")
        )
        listTeman.add(
            MyFriend("David fathurrahman", "Laki-Laki", "david_20510003@Stimata.ac.id",
            "085816943202", "Jogja")
        )
        listTeman.add(
            MyFriend("RosyidMuarif", "Laki-Laki", "rosyid_20510009@Stimata.ac.id",
            "085336334695", "Madiun")
        )
        listTeman.add(
            MyFriend("Isak Irawan", "Laki-Laki", "isak_20310005@Stimata.ac.id",
                "085735093934", "Blitar")
        )
        listTeman.add(
            MyFriend("Sistahana Sari", "Perempuan", "sistahana_20520015@Stimata.ac.id",
            "081330336870", "Malang")
        )

    }

    private fun tampilTeman() {
        rv_ListMyFriends.layoutManager=LinearLayoutManager(requireActivity())
        rv_ListMyFriends.adapter=MyFriendAdapter(requireActivity()!!, listTeman)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_friend, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView(){
        simulasiDataTeman()
        tampilTeman()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}