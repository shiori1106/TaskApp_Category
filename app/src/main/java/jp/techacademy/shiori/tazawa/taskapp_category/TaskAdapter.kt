package jp.techacademy.shiori.tazawa.taskapp_category

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class TaskAdapter(context: Context): BaseAdapter(){
    private val mLayoutInflater: LayoutInflater
    var mTaskList = mutableListOf<Task>()

    init {
        this.mLayoutInflater = LayoutInflater.from(context)
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = convertView ?: mLayoutInflater.inflate(R.layout.layout_list,null)

        val textView1 = view.findViewById<TextView>(R.id.text1)
        val textView2 = view.findViewById<TextView>(R.id.text2)
        val textView3 = view.findViewById<TextView>(R.id.text3)

        // textView1はタイトル
        textView1.text = mTaskList[position].title

        // textViewは日付
        val simpleDateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.JAPANESE)
        val date = mTaskList[position].date
        textView2.text = simpleDateFormat.format(date)

        // textViewはカテゴリ
        textView3.text = "< カテゴリ : " + mTaskList[position].category + " >"

        return view
    }

    override fun getItem(position: Int): Any {
        return mTaskList[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return mTaskList.size
    }
}