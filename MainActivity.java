package com.example.holyquran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public String[] englishSurahNames = {
      "Al-Fatiha (الفاتحة)",
            "Al-Baqarah (البقرة)",
            "Aali Imran (آل عمران)",
            "An-Nisa (النساء)",
            "Al-Ma'idah (المائدة)",
            "Al-An'am (الأنعام)",
            "Al-A'raf (الأعراف)",
            "Al-Anfal (الأنفال)",
            "At-Tawbah (التوبة)",
            "Yunus (يونس)",
            "Hud (هود)",
            "Yusuf (يوسف)",
            "Ar-Ra'd (الرعد)",
            "Ibrahim (إبراهيم)",
            "Al-Hijr (الحجر)",
            "An-Nahl (النحل)",
            "Al-Isra (الإسراء)",
            "Al-Kahf (الكهف)",
            "Maryam (مريم)",
            "Ta-Ha (طه)",
            "Al-Anbiya (الأنبياء)",
            "Al-Hajj (الحج)",
            "Al-Mu'minun (المؤمنون)",
            "An-Nur (النور)",
            "Al-Furqan (الفرقان)",
            "Ash-Shu'ara (الشعراء)",
            "An-Naml (النمل)",
            "Al-Qasas (القصص)",
            "Al-Ankabut (العنكبوت)",
            "Ar-Rum (الروم)",
            "Luqman (لقمان)",
            "As-Sajdah (السجدة)",
            "Al-Ahzab (الأحزاب)",
            "Saba (سبأ)",
            "Fatir (فاطر)",
            "Ya-Sin (يس)",
            "As-Saffat (الصافات)",
            "Sad (ص)",
            "Az-Zumar (الزمر)",
            "Ghafir (غافر)",
            "Fussilat (فصلت)",
            "Ash-Shura (الشورى)",
            "Az-Zukhruf (الزخرف)",
            "Ad-Dukhan (الدخان)",
            "Al-Jathiya (الجاثية)",
            "Al-Ahqaf (الأحقاف)",
            "Muhammad (محمد)",
            "Al-Fath (الفتح)",
            "Al-Hujurat (الحجرات)",
            "Qaf (ق)",
            "Adh-Dhariyat (الذاريات)",
            "At-Tur (الطور)",
            "An-Najm (النجم)",
            "Al-Qamar (القمر)",
            "Ar-Rahman (الرحمن)",
            "Al-Waqi'ah (الواقعة)",
            "Al-Hadid (الحديد)",
            "Al-Mujadila (المجادلة)",
            "Al-Hashr (الحشر)",
            "Al-Mumtahanah (الممتحنة)",
            "As-Saff (الصف)",
            "Al-Jumu'ah (الجمعة)",
            "Al-Munafiqun (المنافقون)",
            "At-Taghabun (التغابن)",
            "At-Talaq (الطلاق)",
            "At-Tahrim (التحريم)",
            "Al-Mulk (الملك)",
            "Al-Qalam (القلم)",
            "Al-Haqqah (الحاقة)",
            "Al-Ma'arij (المعارج)",
            "Nuh (نوح)",
            "Al-Jinn (الجن)",
            "Al-Muzzammil (المزمل)",
            "Al-Muddathir (المدثر)",
            "Al-Qiyamah (القيامة)",
            "Al-Insan (الإنسان)",
            "Al-Mursalat (المرسلات)",
            "An-Naba (النبإ)",
            "An-Nazi'at (النازعات)",
            "Abasa (عبس)",
            "At-Takwir (التكوير)",
            "Al-Infitar (الإنفطار)",
            "Al-Mutaffifin (المطففين)",
            "Al-Inshiqaq (الإنشقاق)",
            "Al-Buruj (البروج)",
            "At-Tariq (الطارق)",
            "Al-A'la (الأعلى)",
            "Al-Ghashiyah (الغاشية)",
            "Al-Fajr (الفجر)",
            "Al-Balad (البلد)",
            "Ash-Shams (الشمس)",
            "Al-Lail (الليل)",
            "Ad-Duha (الضحى)",
            "Ash-Sharh (الشرح)",
            "At-Tin (التين)",
            "Al-'Alaq (العلق)",
            "Al-Qadr (القدر)",
            "Al-Bayyinah (البينة)",
            "Az-Zalzalah (الزلزلة)",
            "Al-'Adiyat (العاديات)",
            "Al-Qari'ah (القارعة)",
            "At-Takathur (التكاثر)",
            "Al-Asr (العصر)",
            "Al-Humazah (الهمزة)",
            "Al-Fil (الفيل)",
            "Quraysh (قريش)",
            "Al-Ma'un (الماعون)",
            "Al-Kawthar (الكوثر)",
            "Al-Kafirun (الكافرون)",
            "An-Nasr (النصر)",
            "Al-Masad (المسد)",
            "Al-Ikhlas (الإخلاص)",
            "Al-Falaq (الفلق)",
            "An-Nas (الناس)"
    };

    public int[] SSP = {
            1,
            8,
            295,
            496,
            673,
            794,
            960,
            1167,
            1243,
            1372,
            1482,
            1606,
            1718,
            1762,
            1815,
            1915,
            2044,
            2156,
            2267,
            2366,
            2502,
            2615,
            2694,
            2813,
            2878,
            2956,
            3184,
            3278,
            3367,
            3437,
            3498,
            3533,
            3564,
            3638,
            3693,
            3739,
            3823,
            4006,
            4095,
            4171,
            4257,
            4312,
            4366,
            4456,
            4516,
            4554,
            4590,
            4629,
            4659,
            4678,
            4724,
            4785,
            4835,
            4898,
            4954,
            5033,
            5130,
            5160,
            5183,
            5208,
            5222,
            5237,
            5249,
            5261,
            5280,
            5293,
            5306,
            5337,
            5390,
            5443,
            5488,
            5517,
            5546,
            5567,
            5624,
            5665,
            5697,
            5748,
            5789,
            5836,
            5879,
            5909,
            5929,
            5966,
            5992,
            6015,
            6033,
            6053,
            6080,
            6111,
            6132,
            6148,
            6170,
            6182,
            6191,
            6200,
            6220,
            6226,
            6235,
            6244,
            6256,
            6268,
            6277,
            6281,
            6291,
            6297,
            6302,
            6310,
            6314,
            6321,
            6325,
            6331,
            6336,
            6342,
    };

    ListView listView;
    ArrayList<String> arrayList = new ArrayList<String>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        for (int i = 0 ;  i < 114 ; i++){
            arrayList.add(englishSurahNames[i]);
        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this , android.R.layout.simple_list_item_1 , arrayList);

        listView.setAdapter(arrayAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String f = arrayList.get(position);


                Intent intent = new Intent(MainActivity.this , MainActivity2.class);
                //Toast.makeText(MainActivity.this, f, Toast.LENGTH_SHORT).show();
                intent.putExtra("surat" , f);
                intent.putExtra("ayatStart" , SSP[position]);
                intent.putExtra("ayatEnd" , (SSP[position + 1]  ) );
                startActivity(intent);
            }
        });




    }
}
