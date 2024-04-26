package com.example.a01_bmi_calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class RecipeActivity extends AppCompatActivity {
    private ListView listView;
    private ArrayAdapter<String> adapter;
    private List<String> recipes;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.recipe_activity);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        backHome(toolbar);

        listView = findViewById(R.id.listView);

        recipes = getSampleRecipes();

        adapter = new ArrayAdapter<>(this, R.layout.item_recipe, recipes);
        listView.setAdapter(adapter);
    }

    private void backHome(androidx.appcompat.widget.Toolbar toolbar) {
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    private List<String> getSampleRecipes() {
        List<String> myRecipes = new ArrayList<>();
        myRecipes.add("Sałatka grecka\n" +
                "   Składniki:\n" +
                "   - Pomidory\n" +
                "   - Ogórki\n" +
                "   - Feta\n" +
                "   - Czerwona cebula\n" +
                "   - Oliwki\n" +
                "   - Oliwa z oliwek\n" +
                "   - Sok z cytryny\n" +
                "   - Oregano\n" +
                "   Instrukcje:\n" +
                "   1. Pokrój pomidory, ogórki, fetę i czerwoną cebulę.\n" +
                "   2. Wymieszaj pokrojone składniki w misce.\n" +
                "   3. Dodaj oliwki.\n" +
                "   4. Skrop sałatkę oliwą z oliwek i sokiem z cytryny.\n" +
                "   5. Posyp oregano.\n" +
                "   6. Delikatnie wymieszaj i podawaj.");
        myRecipes.add("Makaron z pesto\n" +
                "   Składniki:\n" +
                "   - Makaron\n" +
                "   - Sos pesto\n" +
                "   - Parmezan\n" +
                "   - Orzechy piniowe\n" +
                "   Instrukcje:\n" +
                "   1. Ugotuj makaron al dente według instrukcji na opakowaniu.\n" +
                "   2. W misce wymieszaj ugotowany makaron z sosem pesto.\n" +
                "   3. Posyp startym parmezanem i orzechami piniowymi.");
        myRecipes.add("Jajecznica z warzywami\n" +
                "   Składniki:\n" +
                "   - Jajka\n" +
                "   - Papryka\n" +
                "   - Pomidory\n" +
                "   - Cebula\n" +
                "   - Szpinak\n" +
                "   - Sól\n" +
                "   - Pieprz\n" +
                "   Instrukcje:\n" +
                "   1. Posiekaj cebulę, paprykę i pomidory.\n" +
                "   2. Podsmaż cebulę na patelni.\n" +
                "   3. Dodaj pokrojoną paprykę i pomidory, smaż przez kilka minut.\n" +
                "   4. Dodaj szpinak i podsmażaj aż zwiędnie.\n" +
                "   5. Wbij jajka na patelnię i mieszaj.\n" +
                "   6. Dopraw solą i pieprzem.\n" +
                "   7. Smaż jajecznice aż będą ścięte.\n" +
                "   8. Podawaj z pieczywem.");
        myRecipes.add("Kurczak po grecku\n" +
                "   Składniki:\n" +
                "   - Piersi z kurczaka\n" +
                "   - Sok z cytryny\n" +
                "   - Suszone oregano\n" +
                "   - Czosnek\n" +
                "   - Oliwa z oliwek\n" +
                "   - Sól\n" +
                "   - Pieprz\n" +
                "   Instrukcje:\n" +
                "   1. Pokrój piersi z kurczaka na kawałki.\n" +
                "   2. W misce wymieszaj sok z cytryny, oregano, posiekany czosnek, oliwę z oliwek, sól i pieprz.\n" +
                "   3. Zamarynuj kawałki kurczaka w przygotowanej marynacie przez co najmniej 30 minut.\n" +
                "   4. Podsmaż kurczaka na patelni lub grillu do momentu uzyskania złocistego koloru i odpowiedniego przypieczenia.\n" +
                "   5. Podawaj z ulubionymi dodatkami.");
        myRecipes.add("Spaghetti carbonara\n" +
                "   Składniki:\n" +
                "   - Makaron spaghetti\n" +
                "   - Boczek\n" +
                "   - Jajka\n" +
                "   - Parmezan\n" +
                "   - Pieprz\n" +
                "   Instrukcje:\n" +
                "   1. Ugotuj makaron spaghetti al dente według instrukcji na opakowaniu.\n" +
                "   2. Podsmaż pokrojony boczek na patelni.\n" +
                "   3. W misce wymieszaj jajka z startym parmezanem i pieprzem.\n" +
                "   4. Odcedź ugotowany makaron i dodaj go do patelni z boczkiem.\n" +
                "   5. Na patelnię z makaronem i boczkiem wlej mieszankę jajeczną.\n" +
                "   6. Mieszaj całość na małym ogniu, aż jajka się zetną i sos będzie kremowy.\n" +
                "   7. Podawaj natychmiast, posypany dodatkowym parmezanem i pieprzem.");
        myRecipes.add("Suflet czekoladowy\n" +
                "   Składniki:\n" +
                "   - 100 g gorzkiej czekolady\n" +
                "   - 100 g masła\n" +
                "   - 3 jajka\n" +
                "   - 50 g cukru\n" +
                "   - 1 łyżeczka ekstraktu z wanilii\n" +
                "   - 1 łyżka kakao\n" +
                "   - 1 łyżka mąki pszennej\n" +
                "   Instrukcje:\n" +
                "   1. Rozgrzej piekarnik do 200°C. Posmaruj foremki do sufletów masłem i posyp je cukrem.\n" +
                "   2. W misce nad kąpielą wodną rozpuść czekoladę i masło, mieszając, aż uzyskasz gładką masę. Odstaw do ostygnięcia.\n" +
                "   3. Oddziel białka od żółtek. Ubij białka na sztywną pianę.\n" +
                "   4. W osobnej misce ubij żółtka z cukrem i ekstraktem z wanilii, aż masa zgęstnieje.\n" +
                "   5. Stopniowo dodawaj przesianą mąkę i kakao do masy czekoladowej. Delikatnie wymieszaj.\n" +
                "   6. Dodaj ubite białka do masy czekoladowej i delikatnie wymieszaj, wykonując ruchy z dołu do góry, aby nie stracić puszystości białek.\n" +
                "   7. Przelej masę do foremek na suflety, wyrównaj powierzchnię.\n" +
                "   8. Piecz w rozgrzanym piekarniku przez około 12-15 minut, aż suflety będą wyrośnięte na wysokość foremek i będą sprężyste w dotyku.\n" +
                "   9. Wyjmij z piekarnika i podawaj natychmiast, posypane cukrem pudrem lub polane sosem czekoladowym.");
        return myRecipes;
    }
}
