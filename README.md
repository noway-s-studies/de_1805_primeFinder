# primeFinder
Prímszám kereső alkalmazás

Az alkalmazás egy megadott számtól kezdve majd azt egységgel növelve megvizsgálja, hogy a szám prím szám vagy sem.
A gyorsabb keresés érdekében 40 alatti prímmel való osztásokat szabályokkal végzi. 40 fülöti osztó esetén 40 és a szám négyzetgyöke közötti léptetéssel dolgozik.
A 40 fölötti osztókat gyakoriságuk szerint listába szervezi mellyel tovább gyorsítja a keresést.

Genetikus Algoritmus

1. Kezdeti populáció előállítása
 - módszer: a kezdeti értéket egységgel növelve
 - mérete: int határain belül
 
2. Értékeljük 
 - Minden értékre megvizsgáljuk, hogy prím-e. Az osztást 40 alatti prím osztók esetén egyedi metódussal végezzük el.
 - A leggyakoribb osztókat használjuk.
 - Végül minden számmal osztunk mely kisebb a vizsgált szám négyzetgyökénél.

3. Válasszunk ki a fitt egyedeket: Leggyakoribb elemekkel való osztás előtt a lista előfordulás szerint rendezésre kerül így mindig a leggyakoribb elemmel osztunk. A fittebb egyedek kiválasztása a lista rendezése miatt nagyobb!
 
4. Keresztezés: A leggyakoribb osztók egy listába kerülnek. A lista bővül ha még nem található benne az osztó és növekszik az osztóhoz kapcsolt előfordulási érték ha már szerepel a benne.

5. Mutáció (viszonylag kis valószínűséggel): A minden számmal való osztás fázisában új elemek keletkeznek.

A keresztezés és a mutáció során új egyedek jönnek létre, Az új egyedek segítségével új populáció készól és visszatérünk a 2. pontra.

6. Megállási feltétel: A az int és a lista korlát miatt időnként ürítjük a listát.

Használt osztási szabályok:

- 2: Azok a számok oszthatók 2-vel, amelyeknek utolsó számjegye(egyes helyiértéken álló) osztható 2-vel.

- 3: Azok a számok oszthatók 3-mal, amelyeknek a számjegyeinek összege is osztható 3-mal.

- 5: Azok a számok oszthatók 5-tel, amelyeknek utolsó számjegye is osztható 5-tel.

- 7: 7-tel úgy vizsgálhatjuk meg az oszthatóságot, hogy a szám első számjegyétől utolsó előtti számjegyéig képzett számból kivonjuk az utolsó számjegy dupláját(2-szeresét). Ha az így kapott szám osztható 7-tel akkor az eredeti is.*

- 11: 11-gyel úgy vizsgálhatjuk meg az oszthatóságot, hogy a szám első számjegyétől utolsó előtti számjegyéig képzett számból kivonom az utolsó számjegyet. Ha az így kapott szám osztható 11-gyel, akkor az eredtei is.*

- 13: 13-mal úgy vizsgálhatjuk meg az oszthatóságot, hogy a szám első számjegyétől utolsó előtti számjegyéig képzett számhoz hozzáadjuk az utolsó számjegy 4-szeresét.*

- 17: 17-tel úgy vizsgálhatjuk meg az oszthatóságot, hogy a szám első számjegyétől az utolsó előtti számjegyéig képzett számból kivonjuk az utolsó számjegy ötszörösét. A folyamat itt is ismételhető.*

- 19: 19-cel úgy vizsgálhatjuk meg az oszthatóságot, hogy a szám első számjegyétől az utolsó előtti számjegyéig képzett számhoz hozzáadjuk az utolsó számjegy kétszeresét. A folyamat itt is ismételhető.*

- 23: 23-mal úgy vizsgálhatjuk meg az oszthatóságot, hogy a szám első számjegyétől az utolsó előtti számjegyéig képzett számhoz hozzáadjuk az utolsó számjegy 7-szeresét.   Ha ez a szám osztható 23-mal akkor az eredeti is.*

- 29: 29-cel úgy vizsgálhatjuk meg az oszthatóságot, hogy a szám első számjegyétől az utolsó előtti számjegyéig képzet számhoz hozzáadjuk az utolsó számjegy háromszorosát. Ha ez a szám osztható 29-cel, akkor az eredeti is.*

- 31: 31-gyel úgy vizsgálhatjuk meg az oszthatóságot, hogy a szám első számjegyétől az utolsó előtti számjegyéig képzett számból kivonjuk az utolsó számjegy háromszorosát. Ha ez a szám osztható 31-gyel, akkor az eredeti is.*

- 37: 37-tel úgy vizsgálhatjuk meg az oszthatóságot, hogy a szám első számjegyétől az utolsó előtti számjegyéig képzett számból kivonjuk az utolsó számjegy 11-szeresét. Ha ez a szám osztható 37-tel, akkor az eredeti is.*

*Ha még ebből a számból sem lehet megállapítani, hogy osztató-e, akkor mégegyszer el kell végezni az előbb leírtakat.