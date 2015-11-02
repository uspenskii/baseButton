package com.uspenskii.basebutton;

import android.graphics.Bitmap;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.View;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

public class MapsActivity extends FragmentActivity {

    private GoogleMap mMap; // Might be null if Google Play services APK is not available.
    private Location currentBestLocation = null;
    GPSTracker gps;
    public Bitmap bitmap;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        try {
            setUpMapIfNeeded();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void onResume() {
        super.onResume();
        mapmove();
        try {
            setUpMapIfNeeded();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void setUpMapIfNeeded() throws IOException {
        // Do a null check to confirm that we have not already instantiated the map.
        if (mMap == null) {
            // Try to obtain the map from the SupportMapFragment.
            mMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map))
                    .getMap();
            // Check if we were successful in obtaining the map.
            if (mMap != null) {
                setUpMap();
            }
        }
    }

    private void setUpMap() throws IOException {

        mMap.addMarker(new MarkerOptions().position(new LatLng(61.1884725, 34.340286)).title("Название").snippet("Адрес"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.887378, 37.518115)).title("Травмпункт").snippet("Коровинское ш., 36А"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.878688, 37.580558)).title("Травмпункт при Поликлинике № 43").snippet("Инженерная ул., 3, строение 1"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.864092, 37.557724)).title("Диагностич. центр № 6 Филиал № 4").snippet("пер. Бескудниковкий, 5"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.867624, 37.606143)).title("Первый доктор").snippet("Северный б-р, 7Б"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.861113, 37.616727)).title("Детская городская поликлиника № 110").snippet("ул. Декабристов, 39"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.876441, 37.639252)).title("СВАО Медведково Южное ДЕЗ").snippet("Полярная ул., 16к2"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.874549, 37.646275)).title("Травматологический Пункт При п-ке №218").snippet("пр-д Шокальского, 8"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.869035, 37.652852)).title("Травмпункт №3 гор. Поликлиники №218").snippet("Чукотский пр-д, 6А"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.880032, 37.692447)).title("Поликлиника №120").snippet("1-я Напрудная ул., 15"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.827778, 37.582256)).title("Мосгаз ГУП Уавр Филиал № 5").snippet("ул. Милашенкова, 12-в"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.836626, 37.525031)).title("Травмпункт при поликлинике № 142").snippet("3-й Михалковский пер., 22"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.805024, 37.462429)).title("Городская поликлиника № 79").snippet("ул. Маршала Новикова, 14"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.845182, 37.488586)).title("Медико-санитарная часть № 51, Филиал № 1").snippet("ул. Пулковская, 8"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.851316, 37.430812)).title("Городская поликлиника №126").snippet("б-р Яна Райниса, 4, корп. 5"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.842213, 37.356840)).title("Городская поликлиника № 229").snippet("Дубравная ул., 41"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.803226, 37.393777)).title("Городская поликлиника № 96").snippet("ул. Кулакова, 23"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.762449, 37.405958)).title("Детская городская поликлиника №128").snippet("Осенний б-р, 19"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.734221, 37.421684)).title("Городская Поликлиника № 162").snippet("Молодогвардейская ул., 20"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.721289, 37.431471)).title("Городская больница №71").snippet("Можайское ш., 14к4"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.751097, 37.502020)).title("Городская поликлиника №58").snippet("Физкультурный пр-д, 6"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.725614, 37.561453)).title("Травмпункт При Поликлинике № 56 ЦАО").snippet("ул. 10-летия Октября, 2с1"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.756686, 37.553656)).title("Травмотологический пункт").snippet("Мантулинская ул., 12"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.745841, 37.590868)).title("Травматологический Центр").snippet("Большой Власьевский пер., 9"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.765299, 37.586714)).title("Травмпункт При Больнице № 13").snippet("Садовая-Кудринская ул., 15"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.773450, 37.594489)).title("ОАО \"Медицина\"").snippet("2-й Тверской-Ямской пер., 10"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.785922, 37.592772)).title("Травмпункт При Поликлинике № 20").snippet("туп. Горлов, 4"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.789392, 37.571800)).title("Травмпункт при п-ке № 39").snippet("ул. Новая Башиловка, 14"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.781012, 37.638619)).title("Травмпункт при Поликлинике №137").snippet("Протопоповский пер., 19с15"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.770196, 37.681791)).title("Деост").snippet("пер. Посланников, 5к8"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.777237, 37.685411)).title("Поликлиника №129").snippet("Переведеновский пер., 8"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.793184, 37.688645)).title("Городская клин. бол. № 5 им. В.Г. Короленко").snippet("ул. Стромынка, 7"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.785375, 37.712916)).title("Городская поликлиника № 64").snippet("Малая Семеновская ул., 13"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.765278, 37.718426)).title("Травмпункт При Поликлинике № 133 ").snippet("Юрьевский пер., 13"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.799990, 37.727496)).title("Детская городская п-ка № 28").snippet("Халтуринская ул., 7а"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.809958, 37.814129)).title("Травмпункт при п-ке №83 (Детский)").snippet("Щелковское ш., 82, корп. 2"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.805189, 37.826602)).title("Травмпункт, Поликлиникa № 86").snippet("Сиреневый б-р, 71А"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.802477, 37.802114)).title("Травмпункт При Поликлинике № 86").snippet("Сиреневый б-р, 30"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.755134, 37.784928)).title("Травмпункт при Поликлинике № 69 ").snippet("ул. Владимирская 2-я, 31-А"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.760881, 37.833316)).title("Травмпункт При Поликлинике № 95").snippet("ул. Молостовых, 7к1"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.738607, 37.830013)).title("Городская поликлиника № 175").snippet("ул. Старый Гай, 5"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.719509, 37.797616)).title("Поликлиника №167").snippet("ул. Вострухина, 5"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.709246, 37.811591)).title("Травмпункт При Диагност. Центре № 3").snippet("Сормовская ул., 9"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.708484, 37.807944)).title("Травмпункт При Поликлинике № 114 ").snippet("Ферганская ул., 10к2"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.691933, 37.719819)).title("Травмпункт").snippet("ул. Гурьянова, 4к3"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.675959, 37.752767)).title("Травмпункт При Поликлинике № 47").snippet("Армавирская ул., 2/20"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.661971, 37.762896)).title("Городская поликлиника № 9").snippet("Перервинский б-р, 4, к. 2"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.634449, 37.740791)).title("Травмпункт При Поликлинике № 145").snippet("ул. Борисовские Пруды, 10к3"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.616378, 37.735116)).title("Травмпункт При п-ке №17 ").snippet("Ореховый пр-д, 35к2"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.586371, 37.669568)).title("ГБУЗ «ГП №52 ДЗМ» , Травмпункт").snippet("ул. Лебедянская, 10"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.601002, 37.601445)).title("Травматологический пункт №35").snippet("Варшавское ш., 148к1"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.620504, 37.592648)).title("Детская городская п-ка №129").snippet("ул. Чертановская, 28А"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.629669, 37.597250)).title("Травмпункт При Поликлинике № 35 ").snippet("Чертановская ул., 14"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.663733, 37.644581)).title("Городская Клинич. Бол. номер 7").snippet("Коломенский пр-д, 4"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.643387, 37.540442)).title("Детский травмпункт").snippet("ул. Генерала Антонова, 11"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.654647, 37.578154)).title("Травмпункт При Поликлинике № 33 ").snippet("Адрес"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.681755, 37.550065)).title("Поликлиника 106").snippet("ул. Вавилова, 71"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.683315, 37.538320)).title("Травмпункт При гор. б-це № 1 ").snippet("Ленинский просп., 8, корп. 10"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.602753, 37.528031)).title("Городская поликлиника № 134").snippet("Новоясеневский пр., 24, к. 2"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.671227, 37.463977)).title("Травмпункт в Олимпийской Деревне").snippet("ул. Олимпийская деревня, 16К1"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.742957, 37.644906)).title("Зима-мед Круглосуточная СМП").snippet("Котельническая наб., 25"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.738659, 37.648717)).title("Амбулаторное травмотологическое отделение").snippet("Гончарный пр-д, 6"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.712783, 37.629546)).title("Травмпункт При гор. б-це № 4 ").snippet("Павловская ул., 25"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.738800, 37.690425)).title("Детский травмпункт При п-ке №100").snippet("Новорогожская ул., 34"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.734064, 37.861056)).title("Травмпункт При Поликлинике № 66 ").snippet("ул. Салтыковская, 7Б"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(55.685242, 37.851901)).title("Городская Поликлиника №23").snippet("ул. Авиаконструктора Миля., 6, к. 1"));

        getloc();
        mapmove();


    }


    public void getloc() throws IOException {
        gps = new GPSTracker(MapsActivity.this);

        if (gps.canGetLocation()) {
            double latitude = gps.getLatitude();
            double longitude = gps.getLongitude();

            Geocoder geocoder;
            List<Address> addresses;
            geocoder = new Geocoder(this, Locale.getDefault());

            addresses = geocoder.getFromLocation(latitude, longitude, 1); // Here 1 represent max location result to returned, by documents it recommended 1 to 5
            String address = addresses.get(0).getAddressLine(0); // If any additional address line present than only, check with max available address lines by getMaxAddressLineIndex()
            //     String city = addresses.get(0).getLocality();

            mMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.drawable.marker2)).position(new LatLng(latitude, longitude)).title("Ваш адрес").snippet(String.valueOf(address)));


        } else {
            gps.showSettingsAlert();
        }
    }

    private void mapmove() {
        double latitude = gps.getLatitude();
        double longitude = gps.getLongitude();
        int zoom = 15;
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(latitude, longitude), zoom));

    }
    public void located(View view) throws IOException {
        mMap.clear();
        setUpMap();
        double latitude = gps.getLatitude();
        double longitude = gps.getLongitude();
        int zoom = 15;
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(latitude, longitude), zoom));
        getloc();
    }
}