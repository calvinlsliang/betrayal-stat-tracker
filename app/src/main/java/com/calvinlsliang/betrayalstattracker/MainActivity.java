package com.calvinlsliang.betrayalstattracker;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.calvinlsliang.betrayalstattracker.characters.BetrayalCharacter;
import com.calvinlsliang.betrayalstattracker.characters.BrandonJaspers;
import com.calvinlsliang.betrayalstattracker.characters.DarrinFlashWilliams;
import com.calvinlsliang.betrayalstattracker.characters.FatherRhinehardt;
import com.calvinlsliang.betrayalstattracker.characters.HeatherGranville;
import com.calvinlsliang.betrayalstattracker.characters.JennyLeClerc;
import com.calvinlsliang.betrayalstattracker.characters.MadameZostra;
import com.calvinlsliang.betrayalstattracker.characters.MissyDubourde;
import com.calvinlsliang.betrayalstattracker.characters.OxBellows;
import com.calvinlsliang.betrayalstattracker.characters.PeterAkimoto;
import com.calvinlsliang.betrayalstattracker.characters.ProfessorLongfellow;
import com.calvinlsliang.betrayalstattracker.characters.VivianLopez;
import com.calvinlsliang.betrayalstattracker.characters.ZoeIngstrom;
import com.calvinlsliang.betrayalstattracker.view.StatPickerLayout;

public class MainActivity extends Activity {

    private Spinner charactersSpinner;
    private TextView birthdayTextview;
    private StatPickerLayout mightPicker;
    private StatPickerLayout speedPicker;
    private StatPickerLayout sanityPicker;
    private StatPickerLayout knowledgePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initListeners();
    }

    private void initViews() {
        charactersSpinner = (Spinner) findViewById(R.id.characters);
        birthdayTextview = (TextView) findViewById(R.id.birthday);
        mightPicker = (StatPickerLayout) findViewById(R.id.mightPicker);
        speedPicker = (StatPickerLayout) findViewById(R.id.speedPicker);
        sanityPicker = (StatPickerLayout) findViewById(R.id.sanityPicker);
        knowledgePicker = (StatPickerLayout) findViewById(R.id.knowledgePicker);
    }

    private void initListeners() {
        initCharacterSpinner();
    }

    private void initCharacterSpinner() {

        String[] characters = getResources().getStringArray(R.array.characters_array);
        ArrayAdapter adapter = new SpinnerAdapter<>(this, R.layout.spinner_text_view, characters);
        adapter.setDropDownViewResource(R.layout.spinner_text_view);
        charactersSpinner.setAdapter(adapter);

        charactersSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String name = parent.getSelectedItem().toString();
                BetrayalCharacter betrayalCharacter = findBetrayalCharacter(name);
                updateBetrayalSheet(betrayalCharacter);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    @Nullable
    private BetrayalCharacter findBetrayalCharacter(String name) {
        switch(name) {
            case "Brandon Jaspers":
                return new BrandonJaspers();
            case "Darrin \"Flash\" Williams":
                return new DarrinFlashWilliams();
            case "Father Rhinehardt":
                return new FatherRhinehardt();
            case "Heather Granville":
                return new HeatherGranville();
            case "Jenny LeClerc":
                return new JennyLeClerc();
            case "Madame Zostra":
                return new MadameZostra();
            case "Missy Dubourde":
                return new MissyDubourde();
            case "Ox Bellows":
                return new OxBellows();
            case "Peter Akimoto":
                return new PeterAkimoto();
            case "Professor Longfellow":
                return new ProfessorLongfellow();
            case "Vivian Lopez":
                return new VivianLopez();
            case "Zoe Ingstrom":
                return new ZoeIngstrom();
        }
        return null;
    }

    private void updateBetrayalSheet(@Nullable BetrayalCharacter character) {
        if (character == null) {
            return;
        }
        birthdayTextview.setText(String.format(getString(R.string.birthday), character.getBirthday()));
        mightPicker.updateStats(character.getMight(), character.getStartingMightIndex());
        speedPicker.updateStats(character.getSpeed(), character.getStartingSpeedIndex());
        sanityPicker.updateStats(character.getSanity(), character.getStartingSanityIndex());
        knowledgePicker.updateStats(character.getKnowledge(), character.getStartingKnowledgeIndex());
    }

}
