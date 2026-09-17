# Izveštaj o analizi koda - calculator-java

Uradjena je analiza koda pomoću alata u VS Code-u. Ispod su rezultati merenja linija koda i statičke analize.

# 1. Broj linija koda (LOC)
Za brojanje linija koda koriscena je ekstenzija VS Code Counter. Alat je skenirao oba Java fajla u projektu (Calculator.java i Start.java) sa sledećim rezultatom:

* Čist kod (Code): 148 linija
* Komentari (Comment): 5 linija
* Prazna mesta (Blank): 61 linija
* Ukupno linija (Total): 214 linija

*Tabela se nalazi se u folderu .VSCodeCounter.*


# 2. Statička analiza (SonarQube)
Uradjena je uz pomoc SonarQube for IDE.Alat je pronašao ukupno 13 stavki i to:

# Calculator.java
* Linija 1: Fajl nije ubačen u poseban paket (package), nego stoji u default korenskom folderu.
* Linija 4: Pošto klasa ima samo statičke metode, trebalo bi dodati privatan konstruktor da se spreči pravljenje objekata ove klase.
* Linija 18: Metoda se zove ToString sa velikim slovom, što nije po Java pravilima (treba da počinje malim slovom da se ne meša sa ugrađenom toString metodom).
* Linija 18 i 24: Nazivi metoda ToString i Run krše CamelCase pravilo jer počinju velikim slovom.
* Linija 63: Izuzetak exc u catch bloku je definisan, ali se nigde unutar bloka ne koristi.
* Linija 70: Napravljena je promenljiva textResult samo da bi se odmah u sledećem redu vratila. Bolje je odmah uraditi return tog izraza.
* Linija 74: Metoda Operations počinje velikim slovom, a po konvenciji metode moraju počinjati malim slovom.
* Linija 183: Pronađen je suvišan skok (nepotrebna komanda) na kraju koda koji ne radi ništa.

# Start.java
* Linija 1: Isto kao i za prvu klasu, fajl nije organizovan u imenovani paket.
* Linija 6: Lokalna varijabla ne prati standardno CamelCase imenovanje.
* Linija 8 i 19: Za ispisivanje poruka se koristi System.out.println. To je loša praksa za gotove programe, umesto toga treba ubaciti pravi Logger (poput Log4j ili SLF4J).

# 3. Zaključak i poređenje sa neformalnom analizom
Kao neko ko se ne bavi profesionalno programiranjem, neformalna (ručna) analiza koda za mene je bila izuzetno teška. Otvaranjem fajlova `Calculator.java` i `Start.java` uspeo sam vizuelno da primetim samo osnovne elemente, poput matematičkih simbola i ispisa poruka, ali bez mogućnosti da uočim dublje logičke greške ili bezbednosne propuste.
