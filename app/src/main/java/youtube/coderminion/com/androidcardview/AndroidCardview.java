package youtube.coderminion.com.androidcardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class AndroidCardview extends AppCompatActivity {

    ArrayList<Item> itemList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_cardview);

        //init
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        itemList = new ArrayList<>();
        CustomAdapter adapter = new CustomAdapter(this, itemList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);

        //Set data
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        //set data to recyclerview
        setData();

    }

    private void setData() {

        Item bezos = new Item("Jeff Bezos",R.drawable.bezos,"Amazon");
        Item bill = new Item("Bill Gates",R.drawable.bill_gates,"Microsoft");
        Item elonmusk = new Item("Elon Musk",R.drawable.elonmusk,"SpaceX , Tesla");
        Item jobs = new Item("Steve Jobs",R.drawable.jobs,"Apple , Next , Pixar");
        Item mark = new Item("Mark Zuckerberg",R.drawable.mark_z,"Facebook");

        itemList.add(bezos);
        itemList.add(bill);
        itemList.add(elonmusk);
        itemList.add(jobs);
        itemList.add(mark);
    }

}
