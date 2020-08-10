package _03.lifecycle;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

public class Notes {

}

// Lifecycle
// 1)container , servlet class dosyalarini bulur.
// sonrasinda loading islemi yapilir.


// servlet ler ;
// 1- public olmak zorundadir.
// 2- public no-arg constructor olmak zorundadir.
// 3- genel olarak servletlerde constructor tanimlanmaz.
// 4 -constructor yerine init metodu tercih edilir.

// 2) servlet initialize
// initialize mantigi bir cok projede ihtiyacimiz olacaktir.
// proje ayaga kalkarken , istek karsilanmadan once , ilgili servlet ilk defa calismadann once vs
// bir konfigurasyon yapmak isteriz bu mantiga initialize mantigi diyebiliriz.

//  public void init(ServletConfig config) throws ServletException;
//	public void init() throws ServletException {
//    // NOOP by default
//	}

// init() metodu lifecycle boyunca bir kez calisir.

// 3)servicing
// servlet objesi olustu 
// servlet initialize oldu
// bu noktadan sonra artik istekler karsilanibilir (handle request)

//service metodunu override ETME!
// gelen her istege karsilik bir Thread olusur!
// her servlet icin sadece bir tane instance/olusur!

// her istek /bir thread - sadece bir tane obje

// 4)dOGet doPost metodu calisir.

// 