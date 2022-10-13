--select: seçmek from: nerden ?
Select * from Customers 

--seçili alanları listeleme(fake tablo oluşturdu)
Select ContactName,CompanyName, City from Customers 

--Oluşturulan fake tabloda isim değişikliği yapmak istersek örneğin ContactName Adi şeklinde gelsin dersek;
Select ContactName Adi,CompanyName Sirketadi, City Sehir from Customer

--Koşullu listeleme Customer tablosundan City adı='London' olan veriler gelir
Select * from Customers where City ='London'

--Category id'si 1 veya Category id'si 3 olanlar listelenir
Select * from Products where CategoryID=1 or CategoryID=3

--Category id'si 1 ve UnitPrice > 10 dan büyük olanlar listelenir
Select * from Products where CategoryID=1 and UnitPrice > 10

--Category id'si 1 ve UnitPrice'ı 10 dan farklı olanlar listelenir
Select * from Products where CategoryID=1 and UnitPrice <> 10

--order by sıralama demektir ProductName'i A dan itibaren sıralar
Select * from Products order by ProductName

--order by sıralama demektir CategoryID'i 1 den itibaren sıralar
Select * from Products order by CategoryID

--order by sıralama demektir CategoryID'i 1 den itibaren sıralar
Select * from Products order by CategoryID,Cat

--ürünleri fiyata göre sıralamak istersek;
Select * from Products order by UnitPrice asc --artan sıralama(default değeri)

Select * from Products order by UnitPrice desc --azalan sıralama

--category id 'si 1 olanları ve unıtprice i azalan sıralamak istersen;
Select * from Products where CategoryID=1 order by UnitPrice desc --azalan sıralama

--Product data sayısı(tek bir sayı çıkar)
Select COUNT(*) from Products -- Çıktı:77

--Category id'si 2 olan kaç ürün vardır?
Select COUNT(*) from Products where CategoryID=2 -- Çıktı:12


--Group by kullanıyorsak * olan kısım gb da yazılan alan olabilir. Tüm idlerde kaç ürün var ? 
Select CategoryID, COUNT(*) from Products group by CategoryID --Çıktı 1 12, 2 12, 3 13 gibi

--ürün sayısı 10 dan az olan kategorileri listele
Select CategoryID, COUNT(*) from Products group by CategoryID having COUNT(*)<10

--birim fiyatı 20 dan fazla olan ürünleri, kategori ıd ye göre grupla onlardan dan sayısı 10 dan az olanları yazdır
Select CategoryID, COUNT(*) from Products where UnitPrice>20 group by CategoryID having COUNT(*)<10

--hem Products hem Categories birleşmiş halini on(durumunda) category ıdleri
Select * from Products inner join Categories on Products.CategoryID=Categories.CategoryID

--Üst örnekteki * kısmı yerine istenileni getirme
Select Products.ProductID, Products.ProductName,Products.UnitPrice, Categories.CategoryName from Products inner join Categories on Products.CategoryID=Categories.CategoryID

--DTO Data Transformation object

--örnek1 
Select Products.ProductID, Products.ProductName,Products.UnitPrice, Categories.CategoryName from Products inner join Categories on Products.CategoryID=Categories.CategoryID where Products.UnitPrice>10

--inner join : Sadece iki tabloda eşleşenleri bir araya getirir. Eşleşmeyen veriyi getirmez.
--left join : solda olup sağda olmayanlarıda getir demek 

Select * from Products p inner join [Order Details] od on p.ProductID=od.ProductID --Çıktı: 2155

Select * from Products p left join [Order Details] od on p.ProductID=od.ProductID --Çıktı: 2155

Select * from Customers c inner join Orders o on c.CustomerID=o.CustomerID --Çıktı: 830

Select * from Customers c left join Orders o on c.CustomerID=o.CustomerID --Çıktı : 832

--Ürün almayan kişileri getir
Select * from Customers c left join Orders o on c.CustomerID=o.CustomerID where o.CustomerID is null 

--birden fazla tabloyu join etmek
Select * from Products p inner join [Order Details] od on p.ProductID=od.ProductID inner join Orders o on o.OrderID=od.OrderID
