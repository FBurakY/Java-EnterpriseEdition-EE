package _02.handle.request;

public class Notes {

}

// Handle Request

// 1)son kullanici servlet i cagiran bir url e tiklar.

// 2)servlet container bu istege karsili 2 tane obje olusturur;
// a) HttpServletRequest
// b) HttpServletResponse 

// 3)Container yeni bir thread olusturur. service metodunu cagirir.
// 2.adimda olusturulan request ve response objeleri bu metoda gecer.

// 4)gelen istek bir GET istegi ise doGet
// POST ise doPost ... yonlendirme yapilir.

// 5)ilgili meto calisir. doGet , doPost...
// istek karsilanir.

// 6)service metodu sonlanir.
// thread sonlanir.
// request ve response objeleri artik Garbage Collector tarafindan temizlenebilir.

