package _05.session;

public class Notes {

}

// HTTP protokolu , stateless/durumsuz bir protokoldur.

// browser ile server arasinda baglanti kalici(persistent) degildir!
// browser/client istekte bulunur , baglanti kurulur istek karsilandiktan sonra
// (response dondukten sonra) baglanti kapatilir.
// server , gelen istegi gonderen kisi daha once istek gondermis mi bunlar
// ilgilenmez/bilmez.
// uygulamimizi , stateful haline getirmek icin servlet apisinde HttpSession
// objesi yer almaktadir.

// SessionID

// client/browser bir istekte bulunur , container unique bir session id
// olusturur.
// bu session id bilgisi response'ta doner. daha sonraki isteklerde
// client/browser bu session id bilgisi ile server a gider.

// bu session id bilgisi Cookiler araciligiyla tasinir/kullanilir.
// HttpSession objesi olusturma
// unique sesison id bilgisi olusturma
// session id ile cookie objesini iliskilendirme/baglama
// cookiye/session id response a ekleme/donme butun islemlerden Servlet Container sorumludur!