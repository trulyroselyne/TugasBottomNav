package com.example.tugasbottomnav;

import java.util.ArrayList;

public class VacationDatabase {
    private static String[] vacayPlaces = {
            "Raja Ampat",
            "Taman Nasional Wakatobi",
            "Pulau Komodo",
            "Trio Gili",
            "Bunaken",
            "Puncak Jayawijaya",
            "Tana Toraja",
            "Candi Borobudur",
            "Curug Luweng Sampang",
            "Dataran Tinggi Dieng"
    };

    private static String[] vacayDesc = {
            "Raja Ampat merupakan kumpulan dari pulau-pulau di ujung Papua. Ada empat pulau utama di sini, yaitu Waigeo, Misool, Salawati dan Batanta. Perairan di tempat wisata ini dikenal sebagai salah satu lokasi menyelam dan snorkeling terbaik di dunia. Bahkan The Nature Conservancy menyebut bahwa sekiar 75% biota laut dunia dapat ditemukan di perariran Raja Ampat. Bulan Oktober dan November disebut sebagai waktu yang terbaik untuk menyelam di sini karena cuaca dan kondisi perariran sangat ideal",
            "Taman Nasional Wakatobi terletak di Sulawesi Tenggara yang terdiri atas 4 pulau besar yaitu Wangi-wangi, Kaledupa, Binongko and Tomia. Wakatobi merupakan kawasan terumbu karang terluas di dunia setelah Great Barrier Reef(Australia) ini memiliki luas 1,4 juta hektare dengan ribuan spesies flora dan fauna hidup di dalamnnya yang menjadikannya salah satu spot diving terbaik di dunia. tak heran kalau Wakatobi masuk dalam Situs Warisan Dunia oleh UNESCO tahun 2005 silam",
            "Pulau Komodo masuk dalam kawasan Taman Nasional Komodo bersama pulau-pulau lain di sekitar kepulauan Nusa Tenggara. Pulau ini dianggap sebagai habitat binatang komodo yang wajib dilindungi. Salah satu penghargaan tertinggi yang berhasil diraih adalah berhaswil masuk dalam jajaran tujuh keajaiban alam di dunia atau dikenal dengan New Seven Wonders of Nature tahun 2011. Tempat wisata ini menawarkan keindahan daratan dan alam bawah laut yang luar biasa. Ada banyak hal yang bisa dilakukan di sini,mulai dari trekking, menyelam, dan snorkeling",
            "Trio Gili merupakan tiga pulau cantik yang ada di Lombok yaitu Gili Trawangan, Gili Meno dan Gili Air. Ketiganya sudah berhasil mengundang banyak wisatawan mencanegara untuk datang. Di antara ketiga tersebut yang paling populer adalah Gili Trawangan. Selain karena ukurannnya yang lebih luas, di sini juga telah banyak berdiri bar dan cafe. Di sini anda bisa berjemur, menyelam dan snorkeling. Yang lebih asyik, anda bisa menyewa sepeda atau naik cidomo, kereta kuda semacam delman, untuk berkeliling pulau",
            "Bunaken terletak di Sulawesi Utara menjadi salah satu tempat wisata di Indonesia yang lagi-lagi ditetapkan UNESCO sebagai situs warisan dunia, tepatnya pada tahun 2005. Hal ini dikarenakan kekayaan dan keragaman biota lautnya yang luar biasa mulai dari terumbu karang, rumput laut sampai spesies ikan yang ada. Tempat wisata di Indonesia ini memiliki lebih dari 30 titik menyelam yang menjadi favorit banyak penyelam domestik maupun mancanegara. Selain menyelam dan bersentuhan langsung dengan ikan-ikan di sini, kamu juga bisa menyelam bersama kapal selam yang telah disediakan.",
            "Puncak Jayawijaya atau yang biasa disebut dengan Puncak Carstensz adalah satu-satunya puncak gunung di Indonesia yang memiliki salju abadi. Puncak ini menjulang setinggi lebih dari 5.000 meter di atas permukaan laut. Yang lebih membanggakan lagi adalah Gunung Jayawijaya masuk ke dalam daftar Seven Summits atau tujuh gunung dengan puncak tertinggi di dunia. Puncak Jayawijaya ini pertama kali ditaklukan oleh seorang penjelajah asal Belanda bernama Hendrik Albert Lorentz pada tahun 1909. Lorentz berhasil mendaki puncak bersalju ini bersama enam orang suku Dayak Kenyah yang direkrutnya di Kalimantan.",
            "Tana Toraja memiliki kekayaan akan budaya leluhur yang masih dijaga sampai saat ini. Di sini, ada banyak tradisi kuno yang masih dipertahankan, salah satunya adalah Rambu Solo’. Rambu Solo’ merupakan satu-satunya upacara pemakaman termahal di Indonesia dan mungkin juga di dunia. Upacara ini dilakukan selama berhari-hari dengan biaya yang tak sedikit. Salah satu ritual yang dilakukan adalah sembelih kerbau. Kerbau ini tak cukup hanya satu. Semakin tinggi kasta orang yang meninggal, maka semakin banyak kerbau yang dikorbankan.",
            "Candi Borobudur – Magelang merupakan kompleks candi Buddha terbesar di dunia yang ditetapkan UNESCO sebagai salah satu situs warisan dunia pada tahun 1991. Candi Borobudur sempat terkubur abu vulkanik dari letusan Gunung Merapi, sampai kemudian ditemukan oleh Sir Thomas Stamford Raffles di tahun 1814. Bangunannya tersusun dari balok vulkanik dan membentuk 504 arca Buddha, 72 stupa dan sebuah stupa induk tepat di puncak candi. Pada perayaan Waisak, Candi Borobudur menjadi pusat berkumpulnya banyak umat Buddha dari berbagai belahan dunia seperti Tibet dan Thailand. Ritual ini menjadi salah satu daya tarik wisata di sini. Yang paling diminati wisatawan adalah acara puncak berupa pelepasan lampion ke langit.",
            "Luweng dalam bahasa Jawa artinya lubang. Pengunjung akan menikmati eksotisme aliran air terjun yang diapit oleh batuan cadas indah berbentuk seperti lubang menganga yang artistic. Batuan tersebut memberikan tekstur bergaris – garis karena tergerus erosi air sungai. Airnya jatuh ke sungai yang tidak seberapa dalam sehingga akan sangat nyaman jika dibuat berenang atau pun bermain air. Ketika musim hujan tiba, air sungainya melimpah. Namun ketika musim kemarau tiba, debit airnya menjadi sangat minim. ",
            "Bergeser ke Jawa Tengah, ada tempat wisata menarik di Dataran Tinggi Dieng yang selalu jadi tujuan favorit wisatawan sepanjang tahun. Berada di ketinggian 2.000 mdpl, objek wisata yang juga dikenal sebagai Dieng Plateau ini merupakan sebuah kaldera yang dikelilingi gunung aktif. Hawa di Dataran Tinggi Dieng sangat dingin. Pada waktu-waktu tertentu, suhunya bisa mencapai minus. da banyak spot menarik yang bisa kamu temui di sini, seperti Telaga Warna, Kawah Candradimuka, Kompleks Candi Arjuna, Bukit Sikunir, dan lainnya."

    };

    private static int[] vacayImages = {
            R.drawable.rajaampat,
            R.drawable.wakatobi,
            R.drawable.komodo,
            R.drawable.triogili,
            R.drawable.bunaken,
            R.drawable.jayawijaya,
            R.drawable.tator,
            R.drawable.borobudur,
            R.drawable.luweng,
            R.drawable.dieng
    };

    static ArrayList<VacationModel> getListData(){
        ArrayList<VacationModel> list = new ArrayList<>();
        for (int position = 0; position<vacayPlaces.length; position++){
            VacationModel vacay = new VacationModel();
            vacay.setName(vacayPlaces[position]);
            vacay.setSummary(vacayDesc[position]);
            vacay.setPhoto(vacayImages[position]);
            list.add(vacay);

        }
        return list;
    }


}
