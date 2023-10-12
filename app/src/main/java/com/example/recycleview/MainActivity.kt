package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recycleview.adapter.CustamAdapter
import com.example.recycleview.databinding.ActivityMainBinding
import com.example.recycleview.db.Infomation

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private lateinit var arrayList: ArrayList<Infomation>
    private lateinit var adapter: CustamAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)



        arrayList = arrayListOf()
        arrayList.add(Infomation("Shivling kumar","950532317"))
        arrayList.add(Infomation("Ankush kumar","958532317"))
        arrayList.add(Infomation("Abhishek kumar","950532317"))
        arrayList.add(Infomation("Manish kumar","95053317"))
        arrayList.add(Infomation("Rajnish kumar","958532317"))
        arrayList.add(Infomation("Sohan kumar","950832317"))
        arrayList.add(Infomation("Mohan kumar","95082317"))
        arrayList.add(Infomation("Aman kumar","95055532317"))
        arrayList.add(Infomation("Aman kumar","95055532317"))
        arrayList.add(Infomation("Aman kumar","95055532317"))
        arrayList.add(Infomation("Aman kumar","95055532317"))
        arrayList.add(Infomation("Aman kumar","95055532317"))
        arrayList.add(Infomation("Aman kumar","95055532317"))
        arrayList.add(Infomation("aman kumar","95055532317"))
        arrayList.add(Infomation("aman kumar","95055532317"))

        adapter = CustamAdapter(arrayList)
        binding.RecyceView.adapter = adapter
        binding.RecyceView.layoutManager = LinearLayoutManager(this)

        binding.RecyceView.adapter=adapter



    }
}