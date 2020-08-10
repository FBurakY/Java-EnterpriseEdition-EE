package _01.hello.jsp;


import java.util.List;
import java.util.ArrayList;

public class Notes {

	List myList = new ArrayList();
}

// JSP -> Java Server Pages
// JSF -> Java Server Faces bunlar farkli teknolojiler!
// bu 2 kavram da JavaEE bir bolumudur!

//JSP -> web pages
// servletler ile calisirken , java kodlari arasinda basit olarak html kodlari yazdik.
// jsp sayfalarnida java kodu yazabiliyoruz.

// RequestDispatch!
// controllerdan istek -> jsp diger view layer framework'une dispatch edilir.

// view layer

// view layer , son kullaniciya datayi goster  ya da son kullanicdan data al(form).
// bunun disindaki islemleri view layerda (jsp) yapma
// en cok yapilanlar; veritabanina baglanmak, YANLIS hareket!

// mvcdeki temel noktalardan bir tanesi ; seperation of concern

//
// jsp dosyalari , Servlet Container tarafindan Servlet siniflarina (.java) dosyalarina translate edilir.
// sonrasinda compile edilir (.class dosyalari olusur)

// JSP grameri

// ## JSP Scriptlet
// JSP sayfalarimizda java kodu yazabiliriz bunun icin scriptlet kullanmamiz gereklidir.
// genel format ;

// <% java code %>

// ## JSP Expression

// tarayicia direkt veri yazmak icin kullanilir.
// <%=expression %>

// ## JSP Declaration
// instance variable ya da instance method tanimlanabilir.

// <%! %>

// ## JSP Action
// <jsp:action_name attribute=""/>

// ## JSP comment

// genel format ;
// JSP comment
// <%-- --%>

// html comment
// <!-- -->

// ## JSP Directive

// genel format
// <%@ %>

// <%@ page
// <%@ include
// <%@ taglib

// 
// 
