package uz.jahongir.sherlarviewpagertablayout

object User {
    val list = ArrayList<MyData>()

    fun addList(){
        list.add(MyData(R.drawable.rectangle,"Xush kelibsiz","Kim ko‘rubdur, ey ko‘ngul, ahli jahondin yaxshilig‘, Kimki, ondin yaxshi yo‘q, ko‘z tutma ondin yaxshilig‘"))
        list.add(MyData(R.drawable.rectangle8,"Hikoyalar dunyosi","Gar zamonni nayf qilsam ayb qilma, ey rafiq, Ko‘rmadim hargiz, netoyin, bu zamondin yaxshilig‘ !"))
        list.add(MyData(R.drawable.rectangle2,"Kitob ortidan..","Dilrabolardin yomonliq keldi mahzun ko‘ngluma, Kelmadi jonimg'a hech oromi jondin yaxshilig'."))
        list.add(MyData(R.drawable.rectangle1,"Bizga qo'shiling","Ey ko‘ngul, chun yaxshidin ko‘rdung yamonliq asru ko‘p, Emdi ko‘z tutmoq ne ma’ni har yamondin yaxshilig'?"))
    }
}