package _02.servletAndcontainer;

public class Notes {

}

// servlet ler java siniflaridir.
// servletler ile en basit sekliyle / dinamik/dynamic icerik uretme islemini yapariz.

// Servlet lerin main metodu yoktur , butun kontrol Servlet Container 'inin sorumlulugu altindadir.

// Servlet Container / Servlet Engine
// server a bir istek geldiginde , gelen istek eger bir Servleti ya da JSP yi tetikliyorsa bu durumda istegi Servlet Container/Servlet Engine karsilar.


// communication support
// servlet ile server arasindaki iletisimi saglar.
// boylece port dinle , stream olustur , http protokolunegore kodu yaz vs , socket ac vs gerekmez.

// lifecycle management
// servletlerin butun yasam dongusu , container in sorumlulugu altindadir.

// multithread support
// her istek geldigide bir tane thread olusturur.

// jsp support
// container , jsp dosyalarini translate eder.