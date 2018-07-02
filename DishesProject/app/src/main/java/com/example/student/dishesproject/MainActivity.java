package com.example.student.dishesproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ArrayList<Model> arrayList = new ArrayList<>();
        Model model1 = new Model("https://i.pinimg.com/originals/cd/6f/44/cd6f4404093ddf22b0fcd9bb838e2465.jpg", "Kyabab",
                "Kebab is served in deep and small plates,\n " +
                        "as well as in the form of sandwiches", "Low - Fat", "https://ru.wikipedia.org/wiki/%D0%9A%D0%B5%D0%B1%D0%B0%D0%B1");
        Model model2 = new Model("https://i.pinimg.com/originals/06/85/45/068545064b244f4a182a9357b6d4dc83.jpg", "Xinkali", "There is a widespread etiquette in Georgia to use only one's bare \n" +
                "hands while consuming these dumplings;is considered impolite.", "Low- Carb ", "https://en.wikipedia.org/wiki/Khinkali");
        Model model3 = new Model("https://akphoto1.ask.fm/882/839/746/150003019-1rnj0i3-7htn7c48jo0qm2f/original/xorovac.jpg", "Xorovac", "It is the most representative dish of Armenian cuisine enjoyed in restaurants, family gatherings,\n" +
                " and as fast food in Armenia and by Armenians around the world.", "Medium - Fat", "https://en.wikipedia.org/wiki/Khorovats");
        Model model4 = new Model("http://marjonspecialtyfoods.com/wp-content/uploads/2017/03/Tofu-Crumbles-Cabbage-Rolls.jpg", "Tolma", "Common vegetables to stuff include tomato, pepper, onion, zucchini, eggplant, and garlic.\n" +
                " Meat dolmas are generally served warm, often with tahini or egg-lemon sauce.", "Medium - Fat", "https://en.wikipedia.org/wiki/Dolma");
        Model model5 = new Model("https://www.gastronom.ru/binfiles/images/20151225/b730d715.jpg", "Tanov spas ", "This article is about balneotherapy resorts. For balneotherapy itself, \n" +
                "see balneotherapy. For other uses, see SPA.\n" +
                "For the hydrotherapy water pool, see hot tub.", "Balanced", "https://en.wikipedia.org/wiki/Spa");
        Model model6 = new Model("https://food.buy.am/uploads/zoom/2017/10/Xorovac-Ishxan-melnitsa.jpg", "Xorovac Ishxan dzuk", "Sevan prince (Latin, Salmo ischchan), salmon fish family.\n" +
                " Endemic species. It is exclusively located in the basin of Lake Sevan.", "Low - carb ", "https://hy.wikipedia.org/wiki/%D5%8D%D6%87%D5%A1%D5%B6%D5%AB_%D5%AB%D5%B7%D5%AD%D5%A1%D5%B6");
        arrayList.add(model1);
        arrayList.add(model2);
        arrayList.add(model3);
        arrayList.add(model4);
        arrayList.add(model5);
        arrayList.add(model6);
        Adaptor adaptor = new Adaptor(MainActivity.this, R.layout.dishes_item_style, arrayList);
        ListView listView = (ListView) findViewById(R.id.itemlist);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(arrayList.get(position).getUrl()));
                startActivity(intent);
            }
        });
        listView.setAdapter(adaptor);
    }
}
