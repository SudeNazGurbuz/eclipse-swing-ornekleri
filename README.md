# Java Swing Arayüz Örnekleri

Eclipse ile hazırlanmış, Java Swing kullanarak temel pencere ve bileşen yerleşimini gösteren eğitim örnekleri.

## Örnekler

- `MerhabaGUI`: Kırmızı arka planlı bir pencere ve düğme oluşturur.
- `MerhabaKalitim`: `JFrame` sınıfından kalıtım alan bir pencere örneğidir.
- `BorderLayoutDemo`: Düğmeleri `BorderLayout` bölgelerine yerleştirir.
- `CalcPad`: `GridLayout` ile hesap makinesi tuş takımı görünümü oluşturur; hesaplama yapmaz.
- `LogInSayfasİ`: İsim ve şifre alanlarından oluşan giriş ekranı görünümü oluşturur; doğrulama yapmaz ve bilgileri saklamaz.

Her sınıfın kendi `main` metodu vardır ve örnekler birbirinden bağımsız çalıştırılabilir.

## Gereksinimler

- Java 22 veya uyumlu bir Java sürümü
- İsteğe bağlı: Eclipse IDE

## Çalıştırma

Eclipse'te projeyi içe aktarıp `src` altındaki çalıştırmak istediğiniz sınıfı Java uygulaması olarak başlatın.

Terminalden, depo kök klasöründe:

```sh
javac -encoding UTF-8 -d bin src/*.java
java -cp bin MerhabaGUI
```

Son komutta `MerhabaGUI` yerine çalıştırmak istediğiniz sınıfı yazın. Örneğin `BorderLayoutDemo`.
